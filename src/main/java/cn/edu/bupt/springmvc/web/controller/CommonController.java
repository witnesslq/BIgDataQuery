package cn.edu.bupt.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 公共视图控制器
 *
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
@Controller
public class CommonController {
    /**
     * 首页
     *
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping("/test/index2")
    public String index2(HttpServletRequest request){
        return "/test/index2";
    }
}
