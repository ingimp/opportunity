package org.certifiedCV.persistence;

import org.apache.log4j.Logger;
import org.certifiedCV.persistence.model.Address;
import org.certifiedCV.persistence.model.CertifiedCV;
import org.certifiedCV.persistence.model.Company;
import org.certifiedCV.persistence.model.CompanyCard;
import org.certifiedCV.persistence.model.Customer;
import org.certifiedCV.persistence.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSessionFactory {

    private static final Logger logger = Logger
	    .getLogger(HibernateSessionFactory.class);

    public static final ThreadLocal<Session> session = new ThreadLocal<Session>();
    private static final Configuration configuration;
    private static final ServiceRegistry serviceRegistry;
    private static final SessionFactory sessionFactory;

    static {
	try {
	    configuration = new Configuration();
	    configuration.addAnnotatedClass(Customer.class);
	    configuration.addAnnotatedClass(Company.class);
	    configuration.addAnnotatedClass(User.class);
	    configuration.addAnnotatedClass(Address.class);
	    configuration.addAnnotatedClass(CertifiedCV.class);
	    configuration.addAnnotatedClass(CompanyCard.class);
	    

	    // configuration.setProperty(propertyName, value)
	    configuration.configure();
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(
		    configuration.getProperties()).buildServiceRegistry();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	} catch (Throwable e) {
	    logger.error("Building SessionFactory failed.", e);
	    throw new ExceptionInInitializerError(e);

	}
    }

    public static Session currentSession() throws HibernateException {
	Session s = session.get();
	if (s == null) {
	    s = sessionFactory.openSession();
	    session.set(s);
	}
	return s;
    }

    public static void closeSession() throws HibernateException {
	Session s = session.get();
	if (s != null) {
	    s.close();

	}
	session.set(null);

    }

    public static void rollback(Transaction tx) {
	try {
	    if (tx != null) {
		tx.rollback();
	    }

	} catch (HibernateException ignored) {
	    ignored.printStackTrace();

	}
    }

}
