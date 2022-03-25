package xofever.feifei.homework;
/*
* 自定义的关于用户名太长或太短的异常
* */
public class UsernameException extends Exception {
    public UsernameException(){

    }

    public UsernameException(String s ){
        super(s);
    }
}
