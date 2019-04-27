package org.service.one.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.service.one.entity.XmEntity;
import org.service.one.mapper.XmEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @DATA 2019-04-25 15:33
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Service
public class XmService {
    @Autowired
    XmService xmService;

    @Autowired
    StockFeginService stockFeginService;
    @Autowired
    XmEntityMapper xmEntityMapper;

    @LcnTransaction
    @Transactional
    public void save()
    {
        stockFeginService.update();

        XmEntity xmEntity=new XmEntity();
        xmEntity.setName("123123");
        xmEntityMapper.save(xmEntity);

        int i=1/0;
    }
}
