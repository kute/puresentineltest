package com.kute.service.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * created by bailong001 on 2018/10/06 18:17
 */
@Getter
@Setter
@ToString
public class UserData implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private Date birthday;

    public UserData() {
    }

    public UserData(Long id, String name, Integer age, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
