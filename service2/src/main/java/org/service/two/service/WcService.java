package org.service.two.service;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.service.two.entity.WcEntity;
import org.service.two.mapper.WcEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-25 15:33
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class WcService implements  ServiceUpdate{

    @Autowired
    WcEntityMapper wcEntityMapper;

    @LcnTransaction
    @Transactional
    @Override
    public void update()
    {
        WcEntity xmEntity=new WcEntity();
        xmEntity.setId(1);
        wcEntityMapper.save(xmEntity);
    }
}
