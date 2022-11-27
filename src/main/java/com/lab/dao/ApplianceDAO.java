package com.lab.dao;

import com.lab.entity.Appliance;
import com.lab.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria);
}
