package com.king.ant.common.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @ClassName Mapper
 * @Description 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 * @Author Administrator
 * @Date 2019/7/22 0022 - 10:35
 * @Version 1.0
 */
public interface Mapper<T> extends BaseMapper<T>, IdsMapper<T>, InsertListMapper<T> {
}
