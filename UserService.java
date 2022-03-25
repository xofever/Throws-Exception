package xofever.feifei.homework;

public class UserService {
    /*
    * register 是一个用户账号保存方法
    * username 是用户输入的用户名（对其进行了大小限制【6，14】）
    * passwor 使用户输入的密码
    * 写这个方法的主要目的是：测试自定义的异常 来实现开发中的错误的异常抛出（讲的不是很清楚）
    * */
    public void register(String username,String password) throws UsernameException {
        byte[] arryUsername = username.getBytes();
        byte[] arryPassword = password.getBytes();
        if(arryUsername.length>=15){
            UsernameException usernameException = new UsernameException("用户名过长，请重新修改！");
            throw usernameException;
        }
        else if(arryUsername.length<=5){
            UsernameException usernameException = new UsernameException("用户名太短，请重新修改！");
            throw usernameException;
        }
        else{
            System.out.println("恭喜你成功注册账号！");
            System.out.println("Username:"+username+"\n"+"Password:"+password);
        }
    }
}
