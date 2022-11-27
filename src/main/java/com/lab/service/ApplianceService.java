package com.lab.service;

import com.lab.entity.Appliance;
import com.lab.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria);
}
