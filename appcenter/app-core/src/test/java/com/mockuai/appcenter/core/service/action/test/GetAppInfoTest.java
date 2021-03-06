package com.mockuai.appcenter.core.service.action.test;

import com.mockuai.appcenter.common.api.AppService;
import com.mockuai.appcenter.common.api.BaseRequest;
import com.mockuai.appcenter.common.api.Response;
import com.mockuai.appcenter.common.constant.ActionEnum;
import com.mockuai.appcenter.common.constant.ResponseCode;
import com.mockuai.appcenter.common.util.JsonUtil;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zengzhangqiang on 6/8/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class GetAppInfoTest {
    @Resource
    private AppService appService;

    @Test
    public void test(){
        BaseRequest request = new BaseRequest();
        request.setCommand(ActionEnum.GET_APP_INFO.getActionName());
        request.setParam("appKey", "3bc25302234640259fadea047cb7c7d3");
        Response response = appService.execute(request);
        System.out.println("response:"+ JsonUtil.toJson(response));
        Assert.assertEquals(ResponseCode.RESPONSE_SUCCESS.getCode(), response.getCode());
    }
}
