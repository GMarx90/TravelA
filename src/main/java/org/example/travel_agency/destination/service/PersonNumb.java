package org.example.travel_agency.destination.service;

public class PersonNumb {
    private int adultPersonNumber;
    private int teensPersonNumber;
    private int childPersonNumber;

    public PersonNumb(int adultPersonNumber, int teensPersonNumber, int childPersonNumber) {
        this.adultPersonNumber = adultPersonNumber;
        this.teensPersonNumber = teensPersonNumber;
        this.childPersonNumber = childPersonNumber;
    }

    public int getAdultPersonNumber() {
        return adultPersonNumber;
    }

    public void setAdultPersonNumber(int adultPersonNumber) {
        this.adultPersonNumber = adultPersonNumber;
    }

    public int getTeensPersonNumber() {
        return teensPersonNumber;
    }

    public void setTeensPersonNumber(int teensPersonNumber) {
        this.teensPersonNumber = teensPersonNumber;
    }

    public int getChildPersonNumber() {
        return childPersonNumber;
    }

    public void setChildPersonNumber(int childPersonNumber) {
        this.childPersonNumber = childPersonNumber;
    }
}

