package com.gaoyg.monkeyzi.web;

import com.gaoyg.monkeyzi.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 高yg
 * @date: 2018/9/23 22:20
 * @qq:854152531@qq.com
 * @blog http://www.monkeyzi.xin
 * @description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/home")
@Api(value = "monkeyzi-homeController",description = "首页", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HomeController {

    @PostMapping(value = "/user")
    @ApiOperation(httpMethod = "POST", value = "首页查询")
    public String home(@ApiParam(name = "user",value = "查询用户参数") @RequestBody User user){
        log.info("查询用户的参数 user={}",user);
        return "查询成功";
    }
}
