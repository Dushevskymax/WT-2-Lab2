package com.lab.service.impl;

import com.lab.dao.ApplianceDAO;
import com.lab.dao.impl.ApplianceDAOImpl;
import com.lab.entity.Appliance;
import com.lab.entity.criteria.Criteria;
import com.lab.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
    @Override
    public List<Appliance> find(Criteria criteria) {
        return applianceDAO.find(criteria);
    }
}
