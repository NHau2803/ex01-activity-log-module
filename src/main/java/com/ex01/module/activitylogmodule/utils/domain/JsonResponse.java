package com.ex01.module.activitylogmodule.utils.domain;

import java.util.HashMap;
import java.util.List;

public class JsonResponse extends HashMap<String, Object> {
    public static final String RESULTS = "results";
    public static final String RESULT = "result";
    public static final String PAGING = "paging";
    public static final String SUCCESS = "success";
    public static final String MESSAGE = "message";
    public static final String ERRORS = "errors";
    public static final String ERROR_CODE = "errorCode";

    public JsonResponse(){
        this.put("success", false);
    }

    public JsonResponse(boolean success){
        this.put("success", success);
    }

    public JsonResponse(Object data, boolean success) {
        this.put("success", success);
        this.put("results", data);
    }

    public void putResults(Object data) {
        this.put("results", data);
    }

    public void putResult(Object data) {
        this.put("result", data);
    }

    public void putMessage(String message) {
        this.put("message", message);
    }

    public void putErrors(List<?> errors) {
        this.put("errors", errors);
    }

    public void putErrorCode(String errorCode) {
        this.put("errorCode", errorCode);
    }

}
