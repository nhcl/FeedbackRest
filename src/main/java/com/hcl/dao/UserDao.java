package com.hcl.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.model.User;
import com.hcl.util.HibernateUtil;


public class UserDao {

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    
    public boolean validate(String userName, String password) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
        	System.out.println("userName "+ userName);
        	
        	System.out.println("getting user");
      
            //transaction = session.beginTransaction();
            System.out.println("getting user");
            
            user = (User) session.createQuery("FROM User U WHERE U.username = :userName").setParameter("userName", userName).getSingleResult();
            
            System.out.println("getting user"+ user);

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            //transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}