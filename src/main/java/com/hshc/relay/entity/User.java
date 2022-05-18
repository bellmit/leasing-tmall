package com.hshc.relay.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-01 15:36
 */
public class User extends BaseEntity {

    @NotBlank(message = "用户名不能为空！")
    @Length(min = 6, max = 18, message = "用户名最少为{min}位， 最多为{max}位！")
    private String name;

    @Pattern(regexp = "\\d{15}|\\d{18}|\\d{17}(\\d|X|x)", message = "身份证号码格式不正确！")
    private String idNumber;

    @Pattern(regexp = "1[3|4|5|7|8][0-9]\\d{8}", message = "手机号码格式不正确！")
    private String mobile;

    @NotBlank(message = "密码不能为空！")
    @Length(min = 8, max = 18, message = "密码最少为{min}位，最多为{max}位！")
    private String password;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
