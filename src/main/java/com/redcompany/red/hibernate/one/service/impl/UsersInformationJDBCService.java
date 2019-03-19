package com.redcompany.red.hibernate.one.service.impl;

import com.redcompany.red.hibernate.one.entity.service.RequestParam;
import com.redcompany.red.hibernate.one.entity.service.ResponseParam;
import com.redcompany.red.hibernate.one.service.DBService;

public class UsersInformationJDBCService implements DBService {
    private static final UsersInformationJDBCService instance = new UsersInformationJDBCService();


    @Override
    public ResponseParam doService(RequestParam param) {
        return null;
    }

    public static UsersInformationJDBCService getInstance() {
        return instance;
    }
}
