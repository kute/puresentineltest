package com.kute.service.api;

import com.kute.service.domain.UserData;

/**
 * created by kute on 2018/10/06 18:17
 */
public interface IUserService {

    UserData getUserData();

    UserData getUserData(Long id);

}
