package com.hcl.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hcl.model.User;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
  
            try {
                Configuration config = new Configuration();

                config.addAnnotatedClass(User.class);
                
                config.configure("hibernate.cfg.xml");
                ServiceRegistry registry = new StandardServiceRegistryBuilder()
                        .applySettings(
                                config.getProperties()
                        ).build();

                sessionFactory = config.buildSessionFactory(registry);
                return sessionFactory;

            } catch (Exception e) {
                e.printStackTrace();
            }
        return sessionFactory;
    }
}