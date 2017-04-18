/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Umair
 */
public class DaO {
    
    public void addtoDB(Verify round) {
        // Get session factory and open a new session
        SessionFactory factory = Hibernate.getSessionFactory();
        // Begin transaction
        try  {
            Session session = factory.openSession();
            // Begin transaction
            Transaction t = session.beginTransaction();
            // Persist city and commit changes
            session.persist(round);
            t.commit();
            // Close the session
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
