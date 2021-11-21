//package com.mycompany.grupal;
//
///**
// *
// * @author David
// */
//public class GestionDAO {
//    
//    private SessionFactory sessionFactory;
//    
//    public GestionDAO() {
//        try {
//            sessionFactory = new Configuration().configure().buildSessionFactory();
//        } catch (HibernateException ex) {
//            System.out.println("Error al crear SessionFactory");
//            System.out.println(ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//    
//    public void saveConstellation(Alumno a) {
//    Session s = sessionFactory.openSession();
//    Transaction t = s.beginTransaction();
//    s.saveOrUpdate(a);
//    t.commit();
//    s.close();
//    }
//    
//}
