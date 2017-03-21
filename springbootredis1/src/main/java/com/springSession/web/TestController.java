package com.springSession.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
@RestController
@RequestMapping(value = "/admin/v1")
public class TestController {
    @RequestMapping(value = "/first")
    public Map<String, Object> firstResp (HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        request.getSession().setAttribute("map", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/sessions")
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("map"));
        return map;
    }
}
