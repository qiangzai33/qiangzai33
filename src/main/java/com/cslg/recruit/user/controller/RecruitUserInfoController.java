package com.cslg.recruit.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.cslg.recruit.common.SmsUtil;
import com.cslg.recruit.user.service.RecruitUserInfoService;
import com.definesys.mpaas.common.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: XQQ
 * @since: 2020-04-04
 * @history: 1.2020-04-04 created by XQQ
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/RecruitUserInfo")
public class RecruitUserInfoController {

    @Autowired
    private RecruitUserInfoService serivce;

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public Response sendMessage(@RequestBody String telephone) throws ClientException {
        // 生成验证码
        long timeMillis = System.currentTimeMillis();
        int code = (int) (timeMillis % 1000000);
        String toPhoneCode = String.valueOf(code);
//        SendSmsResponse sendSmsResponse = SmsUtil.sendSms(JSONObject.parseObject(telephone).getString("telephone"), toPhoneCode);
        SendSmsResponse sendSmsResponse = new SendSmsResponse();
        sendSmsResponse.setBizId("1234");
        return Response.ok().data(sendSmsResponse);
    }

    /**
     * 查看手机号是否已近存在
     * @param telephone
     * @return true ==> 不存在，反之
     */
    @RequestMapping(value = "/queryIsPhoneExist", method = RequestMethod.POST)
    public Response queryIsPhoneExist(@RequestBody String telephone) {
        boolean b = this.serivce.queryIsPhoneExist(JSONObject.parseObject(telephone).getString("telephone"));
        return Response.ok().data(b);
    }
}