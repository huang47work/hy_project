package com.mockuai.distributioncenter.core.service.action;

import com.mockuai.appcenter.common.util.JsonUtil;
import com.mockuai.distributioncenter.common.api.Response;
import org.junit.Assert;

/**
 * Created by duke on 16/5/24.
 */
public class UnitTestUtils {
    public static void assertAndPrint(Response response) {
        Assert.assertTrue(response.isSuccess());
        System.out.println("result:{}"+JsonUtil.toJson(response.getModule()));
    }
}
