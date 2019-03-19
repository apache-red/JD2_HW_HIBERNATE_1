package com.redcompany.red.hibernate.one.service;

import com.redcompany.red.hibernate.one.entity.service.RequestParam;
import com.redcompany.red.hibernate.one.entity.service.ResponseParam;

public interface DBService {

    ResponseParam doService(RequestParam param);

}
