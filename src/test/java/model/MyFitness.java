package model;

import java.math.BigDecimal;

public class MyFitness  {
    private String address;
    private double WorkingHours;
    private double telephoneNumber;
    private String services;
    private String trainings;
    private String frontpage;
    private BigDecimal price;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(double workingHours) {
        WorkingHours = workingHours;
    }

    public double getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(double telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getTrainings() {
        return trainings;
    }

    public void setTrainings(String trainings) {
        this.trainings = trainings;
    }

    public String getFrontpage() {
        return frontpage;
    }

    public void setFrontpage(String frontpage) {
        this.frontpage = frontpage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
