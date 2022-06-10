/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.impl;

import com.company.dao.AbstractDAO;
import com.company.dao.SkillDaoInter;
import com.company.entity.Skill;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
public class SkillDaoImpl extends AbstractDAO implements SkillDaoInter {

    @Override
    public List<Skill> getAllSkill() {
        EntityManager em = em();
        Query query = em.createQuery("Select s from Skill s", Skill.class);
        List<Skill> list = query.getResultList();
        em.close();
        return list;
    }

    @Override
    public Skill getSkillById(int id) {
        EntityManager em = em();
        Skill skill = em.find(Skill.class, id);
        em.close();
        return skill;
    }

    @Override
    public boolean updateSkill(Skill obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean addSkill(Skill obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }


}
