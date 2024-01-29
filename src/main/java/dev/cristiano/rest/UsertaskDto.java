package dev.cristiano.rest;

public class UsertaskDto {

    String uuid;
    String usertaskType;
    String inputData;
    Long customerId;
    CompletionMetadataDto completionMetadata;

    public UsertaskDto() {
    }

    public UsertaskDto(String usertaskType, String inputData, Long customerId,
            CompletionMetadataDto completionMetadata) {
        this.usertaskType = usertaskType;
        this.inputData = inputData;
        this.customerId = customerId;
        this.completionMetadata = completionMetadata;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsertaskType() {
        return usertaskType;
    }

    public String getInputData() {
        return inputData;
    }

    public String getUuid() {
        return uuid;
    }

    public CompletionMetadataDto getCompletionMetadata() {
        return completionMetadata;
    }

    public Long getCustomerId() {
        return customerId;
    }

}
