package org.school.domain;

/**
 * Created by Andrey on 16.05.2017.
 */
public class Question {
    private String question;
    private long id;
    private double maxRate;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(double maxRate) {
        this.maxRate = maxRate;
    }
}
