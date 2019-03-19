package com.redcompany.red.hibernate.one.controller.command.impl;

import com.redcompany.red.hibernate.one.controller.command.BasicCommand;
import com.redcompany.red.hibernate.one.controller.util.JspPageName;
import com.redcompany.red.hibernate.one.entity.service.RequestParam;
import com.redcompany.red.hibernate.one.entity.service.ResponseParam;

import javax.xml.bind.JAXBException;

public class NoSuchCommand implements BasicCommand {
    @Override
    public ResponseParam performAction(RequestParam param) throws JAXBException {
         ResponseParam responseParam = null;
        if (responseParam.isRequestCompleted()!=true){
            responseParam.setPageNames(JspPageName.ERROR_PAGE);
        }
        return responseParam;
    }
}
