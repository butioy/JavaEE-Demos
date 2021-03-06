package com.yew1eb.exception;

/**
 * @author zhouhai
 * @createTime 16/8/21
 * @description 秒杀关闭异常
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}