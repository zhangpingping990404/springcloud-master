package zpp.controller;

import common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zpp.service.DemoService;

/**
 * @Author: 张平平
 * @Date: 2020/7/22 14:08
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/test")
    public Result index(){

        return new Result(0,"成功",demoService.getString());
    }
}
