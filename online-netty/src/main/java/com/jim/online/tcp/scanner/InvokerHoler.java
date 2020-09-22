package com.jim.online.tcp.scanner;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: teaching-online
 * @author: jim
 * 命令执行器管理者
 * @create: 2020-09-22 12:14
 */
public class InvokerHoler {
    /**命令调用器*/
    private static Map<Short, Map<Short, Invoker>> invokers = new ConcurrentHashMap<>();
    /**
     * 添加命令调用
     * @param module
     * @param cmd
     * @param invoker
     */
    public static void addInvoker(short module, short cmd, Invoker invoker){
        Map<Short, Invoker> map = invokers.get(module);
        if(map == null){
            map = new ConcurrentHashMap<>();
            invokers.put(module, map);
        }
        map.put(cmd, invoker);
    }
    /**
     * 获取命令调用
     * @param module
     * @param cmd
     */
    public static Invoker getInvoker(short module, short cmd){
        Map<Short, Invoker> map = invokers.get(module);
        if(map != null){
            return map.get(cmd);
        }
        return null;
    }
}
