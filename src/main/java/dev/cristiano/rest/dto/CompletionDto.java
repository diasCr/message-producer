package dev.cristiano.rest.dto;

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
