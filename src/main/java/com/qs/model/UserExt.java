package com.qs.model;

import com.qs.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户扩展信息
 *
 * create by fbin on 2018/9/12
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserExt  implements Serializable {

    private Long regionId;

    private String mobile;

    private String location;

    private String idCard;

    private GenderEnum gender;

}
