package com.cslg.recruit.user.controller;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.cslg.recruit.user.service.RecruitLoginService;
import com.definesys.mpaas.common.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: qiqiang.xing
 * @since: 2020/4/14 23:17
 * @history： 1.2020/4/14 created by qiqiang.xing
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/Login")
public class RecruitLoginController {
    @Autowired
    private RecruitLoginService recruitLoginService;

    /**
     * 用户是否存在
     * @param userInfo
     * @return true --> 不存在 反之
     */
    @RequestMapping(value = "/queryUserByAccountPwd", method = RequestMethod.POST)
    public Response queryUserByAccountPwd(RecruitUserInfo userInfo) {
        boolean b = this.recruitLoginService.queryUserByAccountPwd(userInfo);
        return Response.ok().data(b);
    }
}
