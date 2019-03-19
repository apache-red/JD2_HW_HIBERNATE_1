package com.redcompany.red.hibernate.one.controller.command.impl;

import com.redcompany.red.hibernate.one.controller.command.BasicCommand;
import com.redcompany.red.hibernate.one.controller.util.JspPageName;
import com.redcompany.red.hibernate.one.entity.service.RequestParam;
import com.redcompany.red.hibernate.one.entity.service.ResponseParam;
import com.redcompany.red.hibernate.one.service.impl.UsersInformationJDBCService;

import javax.xml.bind.JAXBException;

public class UsersInformationJDBCCommand implements BasicCommand {
    @Override
    public ResponseParam performAction(RequestParam param) throws JAXBException {
        ResponseParam responseParam;
        responseParam = UsersInformationJDBCService.getInstance().doService(param);
        if (responseParam.isRequestCompleted()) {
            responseParam.setPageNames(JspPageName.ALL_USERS_PAGE);
        }
        return responseParam;
    }
}

