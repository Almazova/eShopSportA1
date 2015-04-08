/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author asus
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
//            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//            StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
//            sb.applySettings(cfg.getProperties());
//            StandardServiceRegistry standardServiceRegistry = sb.build();
//             sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
            sessionFactory = new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println(ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSessionFactory() {
        return sessionFactory.openSession();
    }

}
