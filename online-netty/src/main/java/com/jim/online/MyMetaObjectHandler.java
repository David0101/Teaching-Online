package com.jim.online;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-21 16:13
 */
public class MyMetaObjectHandler extends MetaObjectHandler {
    protected final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("新增......");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("新增......");
    }
}

