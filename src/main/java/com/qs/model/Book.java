package com.qs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * create by fbin on 2018/9/13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long oid;

    private String code;

    private String name;

    private String author;

    private Date publishTime;

    private BigDecimal price;

    private List<BookClassification> classificationList;
}
