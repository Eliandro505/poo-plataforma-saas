package model;

import enums.Environment;

public class ComputingService extends Service {
    private int cpuCount;
    private String instanceType;

    public ComputingService(String name, double hourlyCost, boolean status, Environment environment, int cpuCount, String instanceType) {
        super(name, hourlyCost, status, environment);
        this.cpuCount = cpuCount;
        this.instanceType = instanceType;
    }

    @Override
    public double calculateCost(int horas) {
        return (3 * cpuCount) + (5.9 * horas);
    }

    @Override
    public String generateReport() {
        StringBuilder builder = new StringBuilder();
        builder.append("Computing Service Report\n");
        builder.append("Number of CPUs: ");
        builder.append(cpuCount);
        builder.append("\nInstance type: ");
        builder.append(instanceType);
        return builder.toString();
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
}
