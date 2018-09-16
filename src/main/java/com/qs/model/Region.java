package com.qs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 区域信息
 *
 * create by fbin on 2018/9/12
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Region  implements Serializable {

    private Long oid;

    // 编码
    private String code;

    // 地区名称
    private String name;

    // 层级路径
    private String hierarchyPath;

}
