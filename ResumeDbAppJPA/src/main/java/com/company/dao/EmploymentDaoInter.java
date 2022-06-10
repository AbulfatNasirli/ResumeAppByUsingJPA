/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.entity.EmploymentHistory;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface EmploymentDaoInter {

    public List<EmploymentHistory> getAllEmploymentHistoryById(int id);

    public boolean addEmploymentHistory(EmploymentHistory obj);

    public boolean updateEmploymentHistory(EmploymentHistory obj);

    public boolean removeEmploymentHistory(int id);
}
