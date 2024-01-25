package dev.cristiano.rest;

public class UsertaskDto {

    String usertaskType;
    String inputData;

    public UsertaskDto(String usertaskType, String inputData) {
        this.usertaskType = usertaskType;
        this.inputData = inputData;
    }

    public String getUsertaskType() {
        return usertaskType;
    }

    public String getInputData() {
        return inputData;
    }

}
