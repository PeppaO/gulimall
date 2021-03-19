package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fdr
 * @email fdr@gmail.com
 * @date 2021-03-19 13:55:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
