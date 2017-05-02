package cn.edu.bupt.springmvc.core.feature.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class AllowRegionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // TODO Auto-generated method stub
        response.setHeader("Access-Control-Allow-Origin", "*");
        return super.preHandle(request, response, handler);
    }
    
    
}