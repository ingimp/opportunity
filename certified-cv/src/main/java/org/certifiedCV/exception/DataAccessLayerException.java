package org.certifiedCV.exception;

public class DataAccessLayerException extends Exception {

    private static final long serialVersionUID = 1143335089282407792L;

    public DataAccessLayerException() {
	super();
    }

    public DataAccessLayerException(String message) {
	super(message);
    }

    public DataAccessLayerException(String message, Throwable cause,
	    boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataAccessLayerException(String message, Throwable cause) {
	super(message, cause);
    }

    public DataAccessLayerException(Throwable cause) {
	super(cause);
    }
        
}
