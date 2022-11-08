package cn.polarbear.config;

import cn.polarbear.bean.Pet;
import cn.polarbear.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * 1.配置类中使用@Bean标注在方法上给容器注册组件，默认也是单例的
 * 下面@Configuration//告诉SpringBoot这是一个配置类，@Bean("user01")可以通过括号中的字符串 自定义对象名称（ID)
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods:代理Bean的方法
 *
 * @Author PolarBear
 * @Date 2022/11/8 22:14
 * @PackageName: cn.polarbear.config
 * @ClassName: MyConfig
 * @Description:
 * @Version 1.0
 */
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean("user01")
    public User user() {
        return new User("ZhangSan", 18);
    }

    @Bean
    public Pet pet() {
        return new Pet("Tom");
    }
}
