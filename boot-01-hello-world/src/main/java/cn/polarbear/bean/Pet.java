package cn.polarbear.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 示例宠物类
 *
 * @Author PolarBear
 * @Date 2022/11/8 21:55
 * @PackageName: cn.polarbear.bean
 * @ClassName: Pet
 * @Description:
 * @Version 1.0
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Pet {

    private String name;

}
