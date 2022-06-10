/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.entity.Country;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface CountryDaoInter {

    public List<Country> getAllCountry();

    public Country getById(int id);

    public boolean addCountry(Country obj);

    public boolean updateCountry(Country obj);
}
