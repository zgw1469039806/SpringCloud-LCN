package org.service.two.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Update;
import org.service.two.entity.WcEntity;

/**
 * @DATA 2019-04-25 15:31
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Mapper
public interface WcEntityMapper {

    @Update("update wc set stock=stock-1 where id=#{id}")
    Integer save(WcEntity WcEntity);

}
