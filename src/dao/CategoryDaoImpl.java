/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;

/**
 *
 * @author asus
 */
public class CategoryDaoImpl extends DaoImpl{

    public CategoryDaoImpl() {
        super(Category.class);
    }
    //здесь возможно будут свои методы работы с бд
}
