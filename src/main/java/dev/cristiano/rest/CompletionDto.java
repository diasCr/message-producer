package dev.cristiano.rest;

public class CompletionDto {

    String outputData;

    public CompletionDto() {
    }

    public CompletionDto(String outputData) {
        this.outputData = outputData;
    }

    public String getOutputData() {
        return outputData;
    }
}
