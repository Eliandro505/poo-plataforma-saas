package model;

import enums.Environment;

public class StorageService extends Service {
    private int capacityGB;
    private boolean redundancy;

    public StorageService(String name, double hourlyCost, boolean status, Environment environment, int capacityGB, boolean redundancy) {
        super(name, hourlyCost, status, environment);
        this.capacityGB = capacityGB;
        this.redundancy = redundancy;
    }

    @Override
    public double calculateCost(int hours) {
        return (1.5 * capacityGB) + (5.9 * hours);
    }

    @Override
    public String generateReport() {
        StringBuilder builder = new StringBuilder();
        builder.append("Storage Service Report\n");
        builder.append("Total cost for gigabytes: ");
        builder.append(1.5 * capacityGB);
        builder.append("\nSystem redundancy: ");
        builder.append(redundancy);
        return builder.toString();
    }

    public boolean isRedundant() {
        return redundancy;
    }
}
