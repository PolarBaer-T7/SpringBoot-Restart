package cn.polarbear;

import cn.polarbear.bean.Pet;
import cn.polarbear.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author PolarBear
 * @Date 2022/11/7 20:15
 * @PackageName: cn.polarbear.boot
 * @ClassName: MainApplication
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        //1、返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }

        //3、从容器中获取组件
        Pet pet01 = run.getBean("pet", Pet.class);
        Pet pet02 = run.getBean("pet", Pet.class);
        System.out.println(pet01.hashCode());
        System.out.println(pet02.hashCode());
        //这里是单例模式，所以不论创建多少实例，HashCode必然相等
        System.out.println(pet02.equals(pet01));

        /*
         * 4。这里的实体类是被Spring CGLIB增强后的，获取到的对象本就是代理对象，前提是@Configuration(proxyBeanMethods = true)
         * 此时SpringBoot总会检查这个组件是否在容器中存在，如果在容器中则进行直接调用，如果不在容器中则会重新创建对象
         * 换而言之，SpringBoot总会保持组件单例
         */

        MyConfig myConfig = run.getBean(MyConfig.class);
        System.out.println("MyConfigBean====>" + myConfig);

    }

}
