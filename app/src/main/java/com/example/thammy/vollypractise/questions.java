package com.example.thammy.vollypractise;

public class questions {
    private int id_question;
    private String title_question ;
    private String label_question;
    private String suggest1;
     private String suggest2;
    private String suggest3;
    private String suggest_code;


    public questions(int id_questions, String title_question , String label_question , String suggest1 , String suggest2 , String suggest3 , String suggest_code) {
        this.id_question = id_questions;
        this.title_question = title_question;
        this.label_question = label_question;
        this.suggest1 = suggest1;
        this.suggest2 = suggest2;
        this.suggest3 = suggest3;
        this.suggest_code = suggest_code;
    }

    public questions(String title_question, String suggest1 , String suggest2 , String suggest3 ) {

        this.title_question = title_question;
        this.label_question = label_question;
        this.suggest1 = suggest1;
        this.suggest2 = suggest2;
        this.suggest3 = suggest3;
        this.suggest_code = suggest_code;
    }


    public int getId_question() {
        return id_question;
    }

    public String getTitle_question() {
        return title_question;
    }

    public String getLabel_question() {
        return label_question;
    }

    public String getSuggest1() {
        return suggest1;
    }

    public String getSuggest2() {
        return suggest2;
    }

    public String getSuggest3() {
        return suggest3;
    }

    public String getSuggest_code() {
        return suggest_code;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public void setTitle_question(String title_question) {
        this.title_question = title_question;
    }

    public void setLabel_question(String label_question) {
        this.label_question = label_question;
    }

    public void setSuggest1(String suggest1) {
        this.suggest1 = suggest1;
    }

    public void setSuggest2(String suggest2) {
        this.suggest2 = suggest2;
    }

    public void setSuggest3(String suggest3) {
        this.suggest3 = suggest3;
    }

    public void setSuggest_code(String suggest_code) {
        this.suggest_code = suggest_code;
    }


}
