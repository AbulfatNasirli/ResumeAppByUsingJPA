/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.dao.AbstractDAO;
import com.company.dao.UserDaoInter;
import com.company.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.eclipse.persistence.internal.oxm.Root;

/**
 *
 * @author DELL
 */
public class UserDaoImpl extends AbstractDAO implements UserDaoInter {

    @Override
    public List<User> getAll() {
        EntityManager em = em();

        Query query = em.createQuery("Select u from User u", User.class);
        List<User> list = query.getResultList();

        return list;
    }

//        jpql 
//	@Override
//	public User findByEmailAndPassword(String email, String password) {
//		EntityManager em=em();
//                Query query=em.createQuery("Select u from User u where u.email=:e and u.password=:p", User.class);
//                query.setParameter("e", email);
//                query.setParameter("p", password);
//                
//                List<User> list=query.getResultList();
//                
//                if(list.size()==1){
//                    return list.get(0);
//                }
//                return null;
//	}
    // with criteriabuilder 
    public User findByEmailAndPassword(String email, String password) {
        EntityManager em = em();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> q1 = cb.createQuery(User.class);
        var postRoot = q1.from(User.class);

        CriteriaQuery<User> q2 = q1
                .where(cb.equal(postRoot.get("email"), email), cb.equal(postRoot.get("password"), password));

        Query query = em.createQuery(q2);

        List<User> list = query.getResultList();

        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    //  with JPQL
//	@Override
//	public User findByEmail(String email) {
//		EntityManager em=em();
//                Query query=em.createQuery("Select u from User u where u.email=:e", User.class);
//                query.setParameter("e", email);
//                
//                List<User> list=query.getResultList();
//                
//                if(list.size()==1){
//                    return list.get(0);
//                }
//                return null;
//	}
    // with criteriaBuilder
    @Override
    public User findByEmail(String email) {
        EntityManager em = em();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> q1 = cb.createQuery(User.class);
        var postRoot = q1.from(User.class);
        CriteriaQuery<User> q2 = q1
                .where(cb.equal(postRoot.get("email"), email));

        Query query = em.createQuery(q2);

        List<User> list = query.getResultList();

        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

// namedquery
//        @Override
//	public User findByEmail(String email) {
//		EntityManager em=em();
//   
//                    Query query=em.createNamedQuery("User.findByEmail",User.class);
//                    query.setParameter("email", email);
//                    
//                List<User> list=query.getResultList();
//                
//                if(list.size()==1){
//                    return list.get(0);
//                }
//                return null;
//	}
    //  sql query
//        @Override
//	public User findByEmail(String email) {
//		EntityManager em=em();
//   
//                    Query query=em.createNativeQuery("User.findByEmail",User.class);
//                    query.setParameter(1, email);
//                    
//                List<User> list=query.getResultList();
//                
//                if(list.size()==1){
//                    return list.get(0);
//                }
//                return null;
//	}
    @Override
    public List<User> getAll(String name, String surname) {
        EntityManager em = em();

        String jpql = "select u from User u where 1=1";

        if (name != null && !name.trim().isEmpty()) {
            jpql += " and u.name=:name";
        }
        if (surname != null && !surname.trim().isEmpty()) {
            jpql += " and u.surname=:surname";
        }
       
        Query query = em.createQuery(jpql, User.class);

        if (name != null && !name.trim().isEmpty()) {
            query.setParameter("name", name);
        }
        if (surname != null && !surname.trim().isEmpty()) {
            query.setParameter("surname", surname);
        }
       
        return query.getResultList();
    }

    @Override
    public boolean updateUser(User u) {
        EntityManager em = em();

        em.getTransaction().begin();
        em.merge(u);
        em.getTransaction().commit();

        em.close();
        return true;
    }

    @Override
    public boolean removeUser(int id) {

        EntityManager em = em();

        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.remove(user);
        em.getTransaction().commit();

        em.close();

        return true;
    }

    @Override
    public User getById(int userId) {
        EntityManager em = em();

        User user = em.find(User.class, userId);

        em.close();

        return user;
    }

    private BCrypt.Hasher crypt = BCrypt.withDefaults();

    @Override
    public boolean addUser(User u) {
        EntityManager em = em();
        u.setPassword(crypt.hashToString(4, u.getPassword().toCharArray()));
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();

        em.close();
        return true;

    }

}
