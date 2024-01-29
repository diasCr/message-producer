package dev.cristiano.message.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import dev.cristiano.api.v1.CorrelationData;
import dev.cristiano.api.v1.UsertaskCompletionV1;
import dev.cristiano.rest.CompletionDto;
import dev.cristiano.rest.UsertaskDto;

@Component
public class MessageProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducerService.class);
    private static final String TOPIC_NAME = "usertask.completions";

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(UsertaskDto usertaskDto, CompletionDto completionDto) {
        UsertaskCompletionV1 completionMessageV1 = this.createMessageBody(usertaskDto, completionDto);
        LOGGER.info("Sending message: {}", completionMessageV1.toString());
        jmsTemplate.convertAndSend(TOPIC_NAME, completionMessageV1, message -> {
            message.setStringProperty("version", "v1");
            message.setStringProperty("subscription", usertaskDto.getCompletionMetadata().getSubscriptionName());
            return message;
        });
    }

    private UsertaskCompletionV1 createMessageBody(UsertaskDto usertaskDto, CompletionDto completionDto) {
        UsertaskCompletionV1 completionMessageV1 = new UsertaskCompletionV1();
        completionMessageV1.setCustomerId(usertaskDto.getCustomerId());
        completionMessageV1.setCreatedBy(usertaskDto.getCreatedBy());
        CorrelationData correlationData = new CorrelationData();
        for (var correlationDataMap : usertaskDto.getCompletionMetadata().getCorrelationData().entrySet()) {
            correlationData.setAdditionalProperty(correlationDataMap.getKey(), correlationDataMap.getValue());
        }
        completionMessageV1.setCorrelationData(correlationData);
        completionMessageV1.setOutputData(completionDto.getOutputData());
        return completionMessageV1;
    }

}
