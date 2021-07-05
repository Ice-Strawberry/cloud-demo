package com.wyy.orderservice.controller;

/**
 * @program: cloud-demo
 * @description:
 * @author: Wyy
 * @create_time: 2021-04-26 15:21
 * @modifier：Wyy
 * @modification_time：2021-04-26 15:21
 **/

import com.wyy.orderservice.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: Heroin
 * @date: 2021/1/26 21:56
 * @slogan: 如果你想攀登高峰，切莫把彩虹当梯子
 * @description: 订单信息相关接口
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/order/{ordId}")
    public Order getOrder(@PathVariable Integer ordId) {
        BigDecimal a = new BigDecimal(new Random().nextInt(1000));


       Order b=  new Order(ordId,1,"张三",LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),a);
        return b;
//                new Order(ordId, new Random().nextInt(100), "张三", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")), a);
//        ordId,
//                new Random().nextInt(100),
//                "张三",
//                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
//                new BigDecimal(new Random().nextInt(1000));
    }

    @GetMapping("/member/{memId}")
    public List<Order> listOrder(@PathVariable Integer memId){
        List<Order> orders = new ArrayList<>();
        for(int i=1;i<=10;i++){
            orders.add(new Order(
                    i,
                    memId,
                    "张三",
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
                    new BigDecimal(new Random().nextInt(1000))));
        }
        return orders;
    }
}