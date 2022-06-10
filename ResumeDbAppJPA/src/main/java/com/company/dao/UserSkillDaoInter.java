/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.entity.UserSkill;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface UserSkillDaoInter {

    public List<UserSkill> getAllSkillByUserId(int userId);

    public boolean insertUserSkill(UserSkill obj);

    public boolean updateUserSkill(UserSkill obj);

    public boolean removeUserSkill(int userId);

}
