package com.company;

import AppleAuth.AppleAuthManager;
import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.AppleAutManagerAdapter;
import Core.GoogleAuthManagerAdapter;
import DataAccess.concretes.HiberNetUserDao;
import Entities.concretes.User;
import GoogleAuth.GoogleAuthManager;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
        UserService userService=new UserManager(new HiberNetUserDao(),new AppleAutManagerAdapter(new AppleAuthManager()));
        User user=new User("Zakire","Çınar","zakire.cinar@gmail.com","123456",true);
        User user1=new User("Esra","Kutlu","ekutlu591@gmail.com","4567894",true);
        userService.register(user);
        userService.login(user);
        userService.confirm(user);
        userService.registerWithAccout(user1);
        userService.loginWithAccount(user1);
    }
}
