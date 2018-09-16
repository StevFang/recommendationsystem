package com.qs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户
 *
 * create by fbin on 2018/9/12
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {

    private Long oid;

    private String name;

    private String account;

    private String pwd;

}
