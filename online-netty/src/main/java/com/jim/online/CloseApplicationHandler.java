package com.jim.online;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

import java.util.Collection;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-21 15:03
 */
@Slf4j
public class CloseApplicationHandler implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
      log.info("程序停止");
    }
}
