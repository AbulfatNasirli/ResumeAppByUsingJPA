/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.impl;

import com.company.dao.AbstractDAO;
import com.company.dao.UserSkillDaoInter;
import com.company.entity.UserSkill;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
public class UserSkillDaoImpl extends AbstractDAO implements UserSkillDaoInter {

    @Override
    public List<UserSkill> getAllSkillByUserId(int userId) {
        EntityManager em = em();
        Query query = em.createQuery("Select us from UserSkill us", UserSkill.class);
        List<UserSkill> list = query.getResultList();
        em.close();
        return list;
    }

    @Override
    public boolean insertUserSkill(UserSkill obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean updateUserSkill(UserSkill obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean removeUserSkill(int id) {
        EntityManager em = em();
        em.getTransaction().begin();
        UserSkill us = em.find(UserSkill.class, id);
        em.remove(us);
        em.getTransaction().commit();
        em.close();
        return true;
    }
}
