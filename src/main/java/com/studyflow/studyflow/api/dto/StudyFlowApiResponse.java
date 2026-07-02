package com.studyflow.studyflow.api.dto;

import com.studyflow.studyflow.api.enums.StudyFlowApiServices;

public class StudyFlowApiResponse {
    private StudyFlowApiServices service;
    private String response;
    private String description;

    public StudyFlowApiResponse (StudyFlowApiServices service) {
        this.service = service;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

