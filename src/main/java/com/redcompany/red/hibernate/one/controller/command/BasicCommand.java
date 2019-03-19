package com.redcompany.red.hibernate.one.controller.command;

import com.redcompany.red.hibernate.one.entity.service.RequestParam;
import com.redcompany.red.hibernate.one.entity.service.ResponseParam;

import javax.xml.bind.JAXBException;

public interface BasicCommand {

    ResponseParam performAction(RequestParam param) throws JAXBException;

}
