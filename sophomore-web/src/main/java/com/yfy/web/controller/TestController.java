package com.yfy.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *     这是一个测试控制器
 * </p>
 *
 * @author yfy
 * @version 1.0
 * @date 2020/4/23
 */
@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String test(){
        log.debug("进入测试方法了！！！");
        return "test/index";
    }

    @GetMapping("/index2")
    public String toIndex(Model model) {
        model.addAttribute("name", "lisi");
        return "test/index2";
    }

}
