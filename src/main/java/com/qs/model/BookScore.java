package com.qs.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * create by fbin on 2018/9/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookScore {

    private User user;

    private Book book;

    private Date scoreTime;

    private BigDecimal score;

}
