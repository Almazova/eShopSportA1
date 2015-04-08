/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshopsportsattributes;

import dao.CategoryDaoImpl;
import dao.ClubDaoImpl;
import dao.DaoImpl;
import entity.Category;
import entity.Club;
import entity.Goods;
import factory.Factory;

/**
 *
 * @author asus
 */
public class EShopSportsAttributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Category category = new Category("Звуковая поддержка");
        DaoImpl gCategory = new CategoryDaoImpl();
        gCategory.create(category);
        Club club = new Club("Chelsea");
        DaoImpl gClub = new ClubDaoImpl();
        gClub.create(club);
        Goods goods = new Goods("Палки-стучалки", 120000, "sdfghj", category, club);
        DaoImpl daoImpl = Factory.getInstance().getDAO(goods);
        daoImpl.create(goods);

        System.out.println(daoImpl.read().toString());
        System.out.println("||||||||||||||||||||||");
        System.out.println(daoImpl.readById(1));
        daoImpl.deleteById(1);
        System.out.println("||||||||||||||||||||||");
        System.out.println(daoImpl.read().toString());

    }

}
