package com.example.firstspring.model;

public class ContractEvent {
    private int event_id;

    private String image_name;

    private String batch_name;

    private String quarter_name;

    public ContractEvent(int id, String imageName, String BatchName, String QuarterName) {
        event_id = id;
        image_name = imageName;
        batch_name = BatchName;
        quarter_name = QuarterName;
    }

    public int getEventId() {
        return event_id;
    }

    public void setEventId(int id) {
        event_id = id;
    }

    public String getImageName() {
        return image_name;
    }

    public void setImageName(String name) {
        image_name = name;
    }

    public String getBatchName() {
        return batch_name;
    }

    public void setBatchName(String name) {
        batch_name = name;
    }

    public String getQuarterName() {
        return quarter_name;
    }

    public void setQuarterName(String name) {
        quarter_name = name;
    }
}
