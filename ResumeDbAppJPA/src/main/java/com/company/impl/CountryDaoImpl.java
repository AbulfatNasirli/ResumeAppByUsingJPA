/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.impl;

import com.company.dao.AbstractDAO;
import com.company.dao.CountryDaoInter;
import com.company.entity.Country;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author DELL
 */
public class CountryDaoImpl extends AbstractDAO implements CountryDaoInter {

    @Override
    public List<Country> getAllCountry() {
        EntityManager em = em();
        Query query = em.createQuery("Select c from Country c", Country.class);
        List<Country> list = query.getResultList();
        return list;
    }

    @Override
    public boolean addCountry(Country obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();

        em.close();
        return true;
    }

    @Override
    public boolean updateCountry(Country obj) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public Country getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
