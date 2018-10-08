package com.kute.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kute.service.api.IUserService;
import com.kute.service.domain.UserData;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * created by bailong001 on 2018/10/06 18:21
 */
@Service(interfaceClass = IUserService.class)
@Component
public class UserService implements IUserService {

    @Override
    public UserData getUserData() {
        return getUserData(RandomUtils.nextLong(1, 100));
    }

    @Override
    public UserData getUserData(Long id) {
        return new UserData(id, RandomStringUtils.randomAlphabetic(5), RandomUtils.nextInt(10, 20), new Date());
    }
}
