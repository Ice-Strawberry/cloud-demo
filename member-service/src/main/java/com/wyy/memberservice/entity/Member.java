package com.wyy.memberservice.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @program: cloud-demo
 * @description: 成员类
 * @author: Wyy
 * @create_time: 2021-04-19 16:11
 * @modifier：Wyy
 * @modification_time：2021-04-19 16:11
 **/
@Data
@Accessors(chain = true)
public class Member {
    private Integer memId;
    private String memName;
    private String memPhone;
}