/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.entity.Skill;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface SkillDaoInter {

    public List<Skill> getAllSkill();

    public Skill getSkillById(int id);

    public boolean updateSkill(Skill obj);

    public boolean addSkill(Skill obj);
}
