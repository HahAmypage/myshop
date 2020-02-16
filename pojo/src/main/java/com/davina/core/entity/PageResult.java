package com.davina.core.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName PageResult
 * @Description TODO
 * @Author Davina Chan
 * @Date 2020/2/16 20:14
 * @Version 1.0
 */
public class PageResult implements Serializable {

    private Long total;
    private List rows;

    public PageResult() {
    }

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
