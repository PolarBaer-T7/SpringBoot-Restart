package cn.polarbear.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author PolarBear
 * @Date 2022/11/7 20:37
 * @PackageName: cn.polarbear.controller
 * @ClassName: HelloController
 * @Description:
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot 2!";
    }


}
