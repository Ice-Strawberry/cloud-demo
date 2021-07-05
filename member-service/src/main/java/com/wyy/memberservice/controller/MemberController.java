package com.wyy.memberservice.controller;

/**
 * @program: cloud-demo
 * @description:
 * @author: Wyy
 * @create_time: 2021-04-26 13:41
 * @modifier：Wyy
 * @modification_time：2021-04-26 13:41
 **/

import com.wyy.memberservice.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员信息相关接口
 */
@RestController
@RequestMapping("/members")
public class MemberController {
    /**
     * 测试查找会员信息接口
     * @param memId
     * @return
     */
    @GetMapping("/member/{memId}")
    public Member getMember(@PathVariable Integer memId){
        return new Member().setMemId(memId).setMemName("张三"+memId).setMemPhone("17502419549");
    }

}
