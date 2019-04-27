package org.service.one.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.service.one.entity.XmEntity;

/**
 * @DATA 2019-04-25 15:31
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Mapper
public interface XmEntityMapper {

    @Insert("insert into xm(name)values(#{name})")
    Integer save(XmEntity xmEntity);

}
