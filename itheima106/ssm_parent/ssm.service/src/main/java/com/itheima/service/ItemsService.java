package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/12/31
 */
public interface ItemsService {

    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();
}
