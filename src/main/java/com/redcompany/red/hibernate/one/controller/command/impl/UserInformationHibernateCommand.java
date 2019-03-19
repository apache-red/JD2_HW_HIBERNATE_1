package com.redcompany.red.hibernate.one.controller.command.impl;

import com.redcompany.red.hibernate.one.controller.command.BasicCommand;
import com.redcompany.red.hibernate.one.entity.service.RequestParam;
import com.redcompany.red.hibernate.one.entity.service.ResponseParam;

import javax.xml.bind.JAXBException;

public class UserInformationHibernateCommand implements BasicCommand {
    @Override
    public ResponseParam performAction(RequestParam param) throws JAXBException {
        return null;
    }
}
