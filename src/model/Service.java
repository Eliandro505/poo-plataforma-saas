package model;

import enums.Environment;

public abstract class Service {
    protected String name;
    protected double hourlyCost;
    protected boolean status;
    protected Environment environment;

    public abstract double calculateCost(int hours);
    public abstract String generateReport();

    public Service(String name, double hourlyCost, boolean status, Environment environment) {
        this.name = name;
        this.hourlyCost = hourlyCost;
        this.status = status;
        this.environment = environment;
    }

    public void activate() {
        this.status = true;
    }

    public void deactivate() {
        this.status = false;
    }

    public boolean isActive() {
        return status;
    }

    public String getName() {
        return name;
    }

    public double getHourlyCost() {
        return hourlyCost;
    }

    public Environment getEnvironment(){
        return environment;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHourlyCost(double hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
