package com.jim.online.tcp.scanner;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-22 11:59
 */

import com.jim.common.core.annotion.SocketCommand;
import com.jim.common.core.annotion.SocketModule;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;

/**
 * handler扫描器
 *
 */
@Component
public class HandlerScaner implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<? extends  Object> clazz = bean.getClass();
        Class<?>[] interfaces = clazz.getInterfaces();
        if( interfaces != null && interfaces.length >0){
            //扫描类的所有接口父类
            for(Class<?> interFace: interfaces){
                //判断是否为handler接口类
                SocketModule socketModule = interFace.getAnnotation(SocketModule.class);
                if(socketModule == null){
                    continue;
                }
                //找出命令方法
                Method[] methods = interFace.getMethods();
                if(methods != null && methods.length >0){
                    for(Method method:methods){
                        SocketCommand socketCommand = method.getAnnotation(SocketCommand.class);
                        if(socketCommand == null){
                            continue;
                        }
                        final short module = socketModule.module();
                        final short cmd = socketCommand.cmd();

                    }
                }
            }
        }
        return null;
    }
}
