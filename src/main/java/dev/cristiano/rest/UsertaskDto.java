package dev.cristiano.rest;

public class UsertaskDto {

    String uuid;
    String usertaskType;
    String inputData;
    Long customerId;
    String createdBy;
    CompletionMetadataDto completionMetadata;

    public UsertaskDto() {
    }

    public UsertaskDto(String usertaskType, String inputData, Long customerId, String createdBy,
            CompletionMetadataDto completionMetadata) {
        this.usertaskType = usertaskType;
        this.inputData = inputData;
        this.customerId = customerId;
        this.createdBy = createdBy;
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

    public String getCreatedBy() {
        return createdBy;
    }
}
