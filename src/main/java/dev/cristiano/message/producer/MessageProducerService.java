package dev.cristiano.message.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import dev.cristiano.rest.CompletionDto;
import dev.cristiano.rest.UsertaskDto;

public class MessageProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducerService.class);
    private static final String TOPIC_NAME = "usertask.completions";
    private static final String SUBSCRIPTION_NAME_V1 = "customer-management-camunda-v1";
    private static final String SUBSCRIPTION_NAME_V2 = "customer-management-camunda-v2";

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(UsertaskDto usertask, CompletionDto completion) {
        // Do something
    }

}
