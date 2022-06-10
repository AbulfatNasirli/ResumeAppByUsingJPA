/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.impl;

import com.company.dao.AbstractDAO;
import com.company.dao.EmploymentDaoInter;
import com.company.entity.EmploymentHistory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
public class EmploymentDaoImpl extends AbstractDAO implements EmploymentDaoInter {

    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryById(int id) {
        EntityManager em = em();
        Query query = em.createQuery("Select emp from EmploymentHistory emp", EmploymentHistory.class);
        List<EmploymentHistory> list = query.getResultList();
        return list;
    }

    @Override
    public boolean addEmploymentHistory(EmploymentHistory obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean updateEmploymentHistory(EmploymentHistory obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean removeEmploymentHistory(int id) {
        EntityManager em = em();
        em.getTransaction().begin();
        List<EmploymentHistory> emp = getAllEmploymentHistoryById(id);
        em.remove(emp);
        em.getTransaction().commit();
        em.close();
        return true;
    }
}
