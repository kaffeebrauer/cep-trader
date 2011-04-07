// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringPrincipalStore.vsl in andromda-spring-cartridge.
//
package com.algoTrader;

/**
 * Stores the currently logged in Principal. The principal is passed
 * from another tier of the application (i.e. the web application).
 */
public final class PrincipalStore {
	private static final ThreadLocal	store	= new ThreadLocal();
	
	/**
	 * Get the user <code>principal</code> for the currently executing thread.
	 * 
	 * @return the current principal.
	 */
	public static java.security.Principal get() {
		return (java.security.Principal) PrincipalStore.store.get();
	}
	
	/**
	 * Set the <code>principal</code> for the currently
	 * executing thread.
	 * 
	 * @param name
	 *            the user principal
	 */
	public static void set(final java.security.Principal principal) {
		PrincipalStore.store.set(principal);
	}
}
