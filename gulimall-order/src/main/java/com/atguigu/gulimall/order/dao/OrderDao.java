package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fdr
 * @email fdr@gmail.com
 * @date 2021-03-19 14:43:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
