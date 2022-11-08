package cn.polarbear.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 示例用户类
 *
 * @Author PolarBear
 * @Date 2022/11/8 21:53
 * @PackageName: cn.polarbear.bean
 * @ClassName: User
 * @Description:
 * @Version 1.0
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    private String name;

    private Integer age;
}
