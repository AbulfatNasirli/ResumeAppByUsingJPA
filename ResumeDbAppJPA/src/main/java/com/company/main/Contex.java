/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.dao.CountryDaoInter;
import com.company.dao.EmploymentDaoInter;
import com.company.dao.SkillDaoInter;
import com.company.dao.UserDaoInter;
import com.company.dao.UserSkillDaoInter;
import com.company.impl.EmploymentDaoImpl;
import com.company.impl.UserSkillDaoImpl;
import com.company.impl.UserDaoImpl;
import com.company.impl.SkillDaoImpl;
import com.company.impl.CountryDaoImpl;



/**
 *
 * @author DELL
 */
public class Contex {

    public static UserDaoInter instaceUserdao() {
        return new UserDaoImpl();
    }

    public static UserSkillDaoInter instaceUserSkilldao() {
        return new UserSkillDaoImpl();
    }

    public static EmploymentDaoInter instaceEmploymentdao() {
        return new EmploymentDaoImpl();
    }

    public static SkillDaoInter instanceSkilldao() {
        return new SkillDaoImpl();
    }

    public static CountryDaoInter instanceCountryDao() {
        return new CountryDaoImpl();
    }
}
