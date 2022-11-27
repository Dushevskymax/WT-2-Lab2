package com.lab.main;

import com.lab.entity.Appliance;
import com.lab.entity.criteria.Criteria;
import com.lab.service.ApplianceService;
import com.lab.service.impl.ApplianceServiceImpl;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (var item: getAllAppileanceByName("Kettle")){
            System.out.println(item);
        }
        System.out.println(getAppilianceWithLowestCost());
    }

    public static List<Appliance> getAllAppileanceByName(String name){
        ApplianceService applianceService = new ApplianceServiceImpl();
        Criteria criteria = new Criteria("Kettle");
        return applianceService.find(criteria);
    }

    public static Appliance getAppilianceWithLowestCost(){
        ApplianceService applianceService = new ApplianceServiceImpl();
        Criteria criteria = new Criteria("");
        List<Appliance> allAppiliances = applianceService.find(criteria);
        allAppiliances.sort(Comparator.comparing(Appliance::getPrice));
        return allAppiliances.get(0);
    }
}