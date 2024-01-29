package dev.cristiano.rest;

import java.util.Map;

public class CompletionMetadataDto {

    String subscriptionName;
    boolean completionMessageRequired;
    Map<String, String> correlationData;

    public CompletionMetadataDto() {
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Map<String, String> getCorrelationData() {
        return correlationData;
    }

    public void setCorrelationData(Map<String, String> correlationData) {
        this.correlationData = correlationData;
    }

    public boolean isCompletionMessageRequired() {
        return completionMessageRequired;
    }

    public void setCompletionMessageRequired(boolean completionMessageRequired) {
        this.completionMessageRequired = completionMessageRequired;
    }

}
