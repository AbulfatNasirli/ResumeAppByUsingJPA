/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.dao.UserDaoInter;


import java.util.List;

/**
 * @author DELL
 */
public class Main {

    public static void main(String[] args) throws Exception {
        UserDaoInter userDao = (UserDaoInter) Contex.instaceUserdao();
        
       // userDao.removeUser(3);
       //System.out.println(userDao.getById(3).getName());
//    
//User m = new User(10,"Miri", "Shahin",23, "mirri@mail.ru",null, "+9945032238797", null, null, null, 0, null, null);

//User user = new User(11,"Emil", "Xudaverdiyev",23, "emkaxudu@mail.ru",null, "+9945032238797", null, null, null, 0, null, null);
        //user.setPassword("201408020");
//m.setPassword("654321");
        //new UserDaoImpl().addUser(user);
    }
}
