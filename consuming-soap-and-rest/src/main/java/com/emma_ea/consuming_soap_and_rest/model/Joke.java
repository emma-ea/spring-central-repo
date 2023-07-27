package com.emma_ea.consuming_soap_and_rest.model;

public class Joke {
    private int id;
    private String punchline;
    private String type;
    private String setup;


    public Joke(int id, String punchline, String type, String setup) {
        this.id = id;
        this.punchline = punchline;
        this.type = type;
        this.setup = setup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }
}
