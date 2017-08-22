package com.xmall.controller.backend;

import com.xmall.common.Const;
import com.xmall.common.ResponseCode;
import com.xmall.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manage/product")
public class ProductManageController {

    @Autowired
    private IUserService iUserService;


    public ServerResponse productSave(HttpSession session, Product product) {
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录，请登录管理员");

        }
        if (iUserService.checkAdminRole(user).isSuccess()) {


        }
        else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

}
