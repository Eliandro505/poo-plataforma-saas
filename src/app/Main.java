package app;

import core.SaaSPlatformManager;
import enums.Environment;
import model.Service;
import model.StorageService;
import model.DatabaseService;
import model.ComputingService;

public class Main {
    public static void main(String[] args) {
        Service storage = new StorageService("Storage Pro", 0.12, false, Environment.DEV, 500, true);
        Service computing = new ComputingService("Compute X", 0.25, true, Environment.PROD, 8, "t3.large");
        Service database = new DatabaseService("DB Flex", 0.30, false, Environment.HOMOLOG, "PostgreSQL", 100);

        SaaSPlatformManager manager = new SaaSPlatformManager();

        manager.addService(storage);
        manager.addService(computing);
        manager.addService(database);

        manager.activateAllServices();

        System.out.println("======= Service Reports =======\n");
        manager.generateIndividualReports();

        int hours = 24;
        double totalCost  = manager.totalCostOfActiveServices(hours);
        System.out.printf("Total cost of active services for %d hours: $%.2f%n", hours, totalCost);

        System.out.println();
        System.out.println("Environment of storage service: " + storage.getEnvironment());
        System.out.println("Environment of computing service: " + computing.getEnvironment());
        System.out.println("Environment of database service: " + database.getEnvironment());
    }
}
