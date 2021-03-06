package com.mockuai.rainbowcenter.core.service.action.sysFieldMap;

import com.mockuai.rainbowcenter.common.api.RainbowResponse;
import com.mockuai.rainbowcenter.common.api.Request;
import com.mockuai.rainbowcenter.common.constant.ActionEnum;
import com.mockuai.rainbowcenter.common.dto.SysFieldMapDTO;
import com.mockuai.rainbowcenter.common.qto.SysFieldMapQTO;
import com.mockuai.rainbowcenter.core.exception.RainbowException;
import com.mockuai.rainbowcenter.core.manager.SysFieldMapManager;
import com.mockuai.rainbowcenter.core.service.RequestContext;
import com.mockuai.rainbowcenter.core.service.action.Action;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by yeliming on 16/4/14.
 */
@Controller
public class GetSysFieldMapAction implements Action {
    @Resource
    private SysFieldMapManager sysFieldMapManager;

    @Override
    public RainbowResponse execute(RequestContext context) {
        Request request = context.getRequest();
        SysFieldMapQTO sysFieldMapQTO = (SysFieldMapQTO) request.getParam("sysFieldMapQTO");
        Boolean allowResultNull = (Boolean) request.getParam("allowResultNull");
        SysFieldMapDTO sysFieldMapDTO;
        try {
            sysFieldMapDTO = this.sysFieldMapManager.getSysFieldMap(sysFieldMapQTO, allowResultNull);
        } catch (RainbowException e) {
            return new RainbowResponse(e.getResponseCode(), e.getMessage());
        }
        return new RainbowResponse(sysFieldMapDTO);
    }

    @Override
    public String getName() {
        return ActionEnum.GET_SYSFIELDMAP.getActionName();
    }
}
