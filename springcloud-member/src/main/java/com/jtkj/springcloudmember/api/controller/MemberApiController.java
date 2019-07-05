package com.jtkj.springcloudmember.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 于得水 on 2019/7/3.
 * User: yudeshui 1003870732@qq.com
 * Date: 2019/7/3
 * Time: 11:38
 * Version: springcloud20 1.0.0.0
 * [功能描述].
 */
@RestController
public class MemberApiController {

    @RequestMapping("/getMember")
    public String getMember(){
        return "我的第一个会员服务";
    }
}
