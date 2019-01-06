package com.example.HikariCP.entity;

import lombok.Data;
import org.beetl.sql.core.annotatoin.AutoID;
import org.beetl.sql.core.annotatoin.Table;

import java.io.Serializable;

/**
 * @author wys
 * created in 16:29 2019/1/4
 */
@Data
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 4223404153633504854L;

    @AutoID
    private Integer aid;

    private String accountNumber;

    private String password;

}
