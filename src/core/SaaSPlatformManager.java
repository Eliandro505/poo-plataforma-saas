package core;

import model.Service;

import java.util.ArrayList;
import java.util.List;

public class SaaSPlatformManager {
    private List<Service> serviceList;

    public SaaSPlatformManager() {
        this.serviceList = new ArrayList<>();
    }

    public void addService(Service service) {
        serviceList.add(service);
    }

    public void activateAllServices() {
        for(Service service : serviceList) {
            service.activate();
        }
    }

    public double totalCostOfActiveServices(int hours) {
        double totalCost = 0;
        for(Service service : serviceList) {
            if(service.isActive()) totalCost += service.calculateCost(hours);
        }
        return totalCost;
    }

    public void generateIndividualReports() {
        for(Service service : serviceList) {
            System.out.println(service.generateReport());
            System.out.println("\n===============================\n");
        }
    }

    public void listServices() {
        for (Service service : serviceList) {
            String status = service.isActive() ? "Active" : "Inactive";
            System.out.println(service.getName() + " - " + status);
        }
    }
}
