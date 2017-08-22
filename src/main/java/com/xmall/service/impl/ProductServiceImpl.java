package com.xmall.service.impl;

import com.xmall.common.ServerResponse;
import com.xmall.service.IProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    public ServerResponse saveOrUpdateProduct(Product product) {
        if (product != null) {
            if (StringUtils.isNotBlank(product.getSubImages())) {
                String[] subImageArray = product.getSubImages.split(",");
                if (subImageArray.length > 0) {
                    product.setMainImage(subImageArray[0]);
                }
            }
            //更新
            if (product.getId() != null) {
                productMapper.updateByPrima
            }
        }

        return ServerResponse.createByErrorMessage("新增或更新产品参数不正确");
    }
}
