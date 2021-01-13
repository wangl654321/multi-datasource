package cn.zhh.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 *
 * @author Zhou Huanghua
 * @date 2019/10/25 23:06
 */
@Data
public class User implements Serializable {

    private Long id;

    private String userName;

    private String password;

    private String mobile;

    private Date createTime;

    private Date lastUpdateTime;

    private int isDeleted;
}
