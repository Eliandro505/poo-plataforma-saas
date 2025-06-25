package model;

import enums.Environment;

public class DatabaseService extends Service {
    private String databaseType;
    private int maxConnections;

    public DatabaseService(String name, double hourlyCost, boolean status, Environment environment, String databaseType, int maxConnections) {
        super(name, hourlyCost, status, environment);
        this.databaseType = databaseType;
        this.maxConnections = maxConnections;
    }

    @Override
    public double calculateCost(int horas) {
        return (1.5 * maxConnections) + (5.9 * horas);
    }

    @Override
    public String generateReport() {
        StringBuilder builder = new StringBuilder();
        builder.append("Database Service Report\n");
        builder.append("Database type: ");
        builder.append(databaseType);
        builder.append("\nMaximum connections: ");
        builder.append(maxConnections);
        return builder.toString();
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }
}
