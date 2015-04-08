/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.CategoryDaoImpl;
import dao.ClubDaoImpl;
import dao.DaoImpl;
import dao.GoodsDaoImpl;
import entity.Goods;

/**
 *
 * @author asus
 * @param <T>
 */
public class Factory<T> {

    private static CategoryDaoImpl categoryDao = null;
    private static ClubDaoImpl clubDao = null;
    private static GoodsDaoImpl goodsDao = null;

    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public DaoImpl getDAO(T t) {
        if (t.getClass() == Goods.class) {
            if (goodsDao == null) {
                goodsDao = new GoodsDaoImpl();
            }
            return goodsDao;
//        } else {
//            if (daoTypeTea == null) {
//                daoTypeTea = new TypeTeaDaoImpl();
//            }
//            return daoTypeTea;
//        }

        }
        return null;

    }
}
