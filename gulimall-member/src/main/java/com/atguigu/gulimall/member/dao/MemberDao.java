package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fdr
 * @email fdr@gmail.com
 * @date 2021-03-19 14:32:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
