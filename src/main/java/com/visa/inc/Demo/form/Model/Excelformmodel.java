package com.visa.inc.Demo.form.Model;


public class Excelformmodel {
    public String dateOpened;
    public String fileName;
    public String workEffort;
    public String reviewerName;
    public String lineCodeNumber;
    public String complexity; // "Low", "Medium", "High"
    public String comment;
    public String actionTaken;
    public String lastDateUpdated;
    public String developerName;

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(String workEffort) {
        this.workEffort = workEffort;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getLineCodeNumber() {
        return lineCodeNumber;
    }

    public void setLineCodeNumber(String lineCodeNumber) {
        this.lineCodeNumber = lineCodeNumber;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getLastDateUpdated() {
        return lastDateUpdated;
    }

    public void setLastDateUpdated(String lastDateUpdated) {
        this.lastDateUpdated = lastDateUpdated;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public Excelformmodel() {
    }

    public Excelformmodel(String dateOpened, String fileName, String workEffort, String reviewerName,
            String lineCodeNumber, String complexity, String comment, String actionTaken, String lastDateUpdated,
            String developerName) {
        this.dateOpened = dateOpened;
        this.fileName = fileName;
        this.workEffort = workEffort;
        this.reviewerName = reviewerName;
        this.lineCodeNumber = lineCodeNumber;
        this.complexity = complexity;
        this.comment = comment;
        this.actionTaken = actionTaken;
        this.lastDateUpdated = lastDateUpdated;
        this.developerName = developerName;
    }

}
