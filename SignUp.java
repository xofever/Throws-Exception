package xofever.feifei.homework;

import java.util.Scanner;
/*
* 用户的注册的主函数
* */
public class SignUp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎进入系统的注册功能！");
        System.out.println("Username:");
        String username = s.next();
        System.out.println("Password:");
        String password = s.next();
        UserService userService = new UserService();
        try {
            userService.register(username, password);
        }catch (UsernameException e ){
            System.out.println(e.getMessage());
        }
    }
}
