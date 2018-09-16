package com.qs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * create by fbin on 2018/9/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookClassification implements Serializable {

    private Long oid;

    private String code;

    private String name;

    private Long seqNo;

}
