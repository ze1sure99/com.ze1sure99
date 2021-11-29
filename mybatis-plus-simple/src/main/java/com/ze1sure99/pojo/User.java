package com.ze1sure99.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //相当于添加了 getter setter toString方法
@NoArgsConstructor //生成无参构造
@AllArgsConstructor //生成全参构造
@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
