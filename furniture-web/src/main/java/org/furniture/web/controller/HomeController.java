package org.furniture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description ${DESCRIPTION}
 * @Author bwu
 * @Create 10/06/2018 18:06.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = {"/index"}, method = {RequestMethod.GET})
    public String index() {
        return "/home/index.btl";
    }
}
