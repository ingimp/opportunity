package org.certifiedCV.persistence.dao;

import org.certifiedCV.exception.DataAccessLayerException;
import org.certifiedCV.persistence.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class CertifiedCVDao {

    protected Session session;
    protected Transaction tx;

    protected void startOperation() throws HibernateException {
	session = HibernateSessionFactory.currentSession();
	tx = session.beginTransaction();

    }

    protected void stopOperation() throws HibernateException {
	tx.commit();
	HibernateSessionFactory.closeSession();

    }
    
    protected void handleException(HibernateException e) throws DataAccessLayerException {
	HibernateSessionFactory.rollback(tx);
	throw new DataAccessLayerException(e);
    }
}
