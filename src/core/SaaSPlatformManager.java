package core;

import linkedlist.LinkedList;
import model.Service;

public class SaaSPlatformManager {
    private final LinkedList<Service> serviceList;

    public SaaSPlatformManager() {
        this.serviceList = new LinkedList<>();
    }

    public void addService(Service service) {
        serviceList.addFirst(service);
    }

    public void activateAllServices() {
        for (int i = 0; i < serviceList.size(); i++) {
            serviceList.get(i).activate();
        }
    }

    public double totalCostOfActiveServices(int hours) {
        double totalCost = 0;
        for (int i = 0; i < serviceList.size(); i++) {
            if(serviceList.get(i).isActive()) totalCost += serviceList.get(i).calculateCost(hours);
        }
        return totalCost;
    }

    public void generateIndividualReports() {
        for (int i = 0; i < serviceList.size(); i++) {
            System.out.println(serviceList.get(i).generateReport());
            System.out.println("\n===============================\n");
        }
    }

    public void listServices() {
        for (int i = 0; i < serviceList.size(); i++) {
            String status = serviceList.get(i).isActive() ? "Active" : "Inactive";
            System.out.println(serviceList.get(i).getName() + " - " + status);
        }
    }
}
