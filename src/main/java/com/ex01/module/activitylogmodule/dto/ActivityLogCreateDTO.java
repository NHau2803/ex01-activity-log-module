package com.ex01.module.activitylogmodule.dto;

import org.springframework.data.annotation.Id;

public class ActivityLogCreateDTO {

    private String actionAt;
    private String actionBy;
    private String operator;

    public String getActionAt() {
        return actionAt;
    }

    public void setActionAt(String actionAt) {
        this.actionAt = actionAt;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
