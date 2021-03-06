package com.mockuai.suppliercenter.core.service.action.storeitemsku;

import com.mockuai.suppliercenter.common.action.ActionEnum;
import com.mockuai.suppliercenter.common.api.SupplierResponse;
import com.mockuai.suppliercenter.common.constant.ResponseCode;
import com.mockuai.suppliercenter.common.dto.StoreItemSkuDTO;
import com.mockuai.suppliercenter.core.exception.SupplierException;
import com.mockuai.suppliercenter.core.manager.StoreItemSkuManager;
import com.mockuai.suppliercenter.core.service.RequestContext;
import com.mockuai.suppliercenter.core.service.SupplierRequest;
import com.mockuai.suppliercenter.core.service.action.TransAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReduceStoreNumAction extends TransAction {
    private static final Logger log = LoggerFactory.getLogger(ReduceStoreNumAction.class);

    @Resource
    private StoreItemSkuManager storeItemSkuManager;

    @Override
    protected SupplierResponse doTransaction(RequestContext context) throws SupplierException {
        log.info("Enter Action [{}]", getName());
        SupplierRequest supplierRequest = context.getRequest();
        Long storeId = (Long) supplierRequest.getParam("storeId");
        Long itemSkuId = (Long) supplierRequest.getParam("itemSkuId");
        Long storeNum = (Long) supplierRequest.getParam("storeNum");
        StoreItemSkuDTO storeItemSkuDTO = new StoreItemSkuDTO();
        storeItemSkuDTO.setStoreId(storeId);
        storeItemSkuDTO.setItemSkuId(itemSkuId);
        storeItemSkuDTO.setFrozenStockNum(storeNum);

        String bizCode = (String) context.get("bizCode");

//	    Integer appType = (Integer)context.get("appType");

        // TODO 入参校验
        if (bizCode == null) {
            bizCode = "hanshu";
//            log.error("bizCode is null");
//            return new SupplierResponse(ResponseCode.P_PARAM_NULL,
//                    "bizCode is null");
        }

        if (storeItemSkuDTO == null) {
            log.error("storeItemSkuDTO is null, bizCode = {}", bizCode);
            return new SupplierResponse(ResponseCode.P_PARAM_NULL,
                    "storeItemSkuDTO is null");
        }

        storeItemSkuDTO.setBizCode(bizCode);


        try {
            storeItemSkuManager.reduceStoreNum(storeItemSkuDTO);
            log.info("Exit Action [{}]", getName());
            return new SupplierResponse(true);
        } catch (SupplierException e) {
            log.error("do action:" + supplierRequest.getCommand()
                    + " occur Exception:" + e.getMessage(), e);
            return new SupplierResponse(e.getResponseCode(), e.getMessage());
        } catch (Exception e) {
            log.error("do action:" + supplierRequest.getCommand()
                    + " occur Exception:" + e.getMessage(), e);
            return new SupplierResponse(ResponseCode.SYS_E_SERVICE_EXCEPTION,
                    e.getMessage());

        }
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return ActionEnum.REDUCE_STORENUM.getActionName();
    }
}
