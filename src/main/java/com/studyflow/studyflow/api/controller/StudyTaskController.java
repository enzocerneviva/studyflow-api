package com.studyflow.studyflow.api.controller;

import com.studyflow.studyflow.api.dto.CreateTaskRequest;
import com.studyflow.studyflow.api.dto.StudyFlowApiResponse;
import com.studyflow.studyflow.api.enums.StudyFlowApiServices;
import com.studyflow.studyflow.api.service.StudyTaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyTaskController {

    StudyTaskService service;

    @PostMapping("/task")
    public StudyFlowApiResponse createTask(CreateTaskRequest request){

        StudyFlowApiResponse response = new StudyFlowApiResponse(StudyFlowApiServices.CREATE_TASK);

        try{
            service.createTaskService(request);

            response.setResponse("OK");
            response.setDescription("Task criada com sucesso!");
            return response;

        } catch (Exception e) {

            response.setResponse("ERROR");
            response.setDescription(e.toString());

            return response;
        }
    }
}
