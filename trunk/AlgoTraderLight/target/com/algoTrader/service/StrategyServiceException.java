// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: DefaultServiceException.vsl in andromda-spring-cartridge.
//
package com.algoTrader.service;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * The default exception thrown for unexpected errors occurring
 * within {@link com.algoTrader.service.StrategyService}.
 */
public class StrategyServiceException
        extends java.lang.RuntimeException {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long	serialVersionUID	= 1676570950967281483L;
	
	/**
	 * The default constructor for <code>StrategyServiceException</code>.
	 */
	public StrategyServiceException() {
	}
	
	/**
	 * Constructs a new instance of <code>StrategyServiceException</code>.
	 * 
	 * @param throwable
	 *            the parent Throwable
	 */
	public StrategyServiceException(final Throwable throwable) {
		super(StrategyServiceException.findRootCause(throwable));
	}
	
	/**
	 * Constructs a new instance of <code>StrategyServiceException</code>.
	 * 
	 * @param message
	 *            the throwable message.
	 */
	public StrategyServiceException(final String message) {
		super(message);
	}
	
	/**
	 * Constructs a new instance of <code>StrategyServiceException</code>.
	 * 
	 * @param message
	 *            the throwable message.
	 * @param throwable
	 *            the parent of this Throwable.
	 */
	public StrategyServiceException(final String message,
	        final Throwable throwable) {
		super(message, StrategyServiceException.findRootCause(throwable));
	}
	
	/**
	 * Finds the root cause of the parent exception
	 * by traveling up the exception tree
	 */
	private static Throwable findRootCause(Throwable th) {
		if (th != null) {
			// Reflectively get any exception causes.
			try {
				Throwable targetException = null;
				
				// java.lang.reflect.InvocationTargetException
				String exceptionProperty = "targetException";
				if (PropertyUtils.isReadable(th, exceptionProperty)) {
					targetException = (Throwable) PropertyUtils.getProperty(th,
					        exceptionProperty);
				} else {
					exceptionProperty = "causedByException";
					// javax.ejb.EJBException
					if (PropertyUtils.isReadable(th, exceptionProperty)) {
						targetException = (Throwable) PropertyUtils
						        .getProperty(th, exceptionProperty);
					}
				}
				if (targetException != null) {
					th = targetException;
				}
			} catch (final Exception ex) {
				// just print the exception and continue
				ex.printStackTrace();
			}
			
			if (th.getCause() != null) {
				th = th.getCause();
				th = StrategyServiceException.findRootCause(th);
			}
		}
		return th;
	}
}