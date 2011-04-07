// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package com.algoTrader.entity;

/**
 * 
 */
public abstract class Position
        extends com.algoTrader.BaseObject
        implements java.io.Serializable {
	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long	serialVersionUID	= -7585870324098849800L;
	
	private long	          quantity;
	
	/**
     * 
     */
	public long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(final long quantity) {
		this.quantity = quantity;
	}
	
	private java.lang.Double	exitValue;
	
	/**
     * 
     */
	public java.lang.Double getExitValue() {
		return exitValue;
	}
	
	public void setExitValue(final java.lang.Double exitValue) {
		this.exitValue = exitValue;
	}
	
	private java.math.BigDecimal	maintenanceMargin;
	
	/**
     * 
     */
	public java.math.BigDecimal getMaintenanceMargin() {
		return maintenanceMargin;
	}
	
	public void setMaintenanceMargin(
	        final java.math.BigDecimal maintenanceMargin) {
		this.maintenanceMargin = maintenanceMargin;
	}
	
	private int	id;
	
	/**
     * 
     */
	public int getId() {
		return id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
	private com.algoTrader.entity.Security	security;
	
	/**
     * 
     */
	public com.algoTrader.entity.Security getSecurity() {
		return security;
	}
	
	public void setSecurity(final com.algoTrader.entity.Security security) {
		this.security = security;
	}
	
	private com.algoTrader.entity.Strategy	strategy;
	
	/**
     * 
     */
	public com.algoTrader.entity.Strategy getStrategy() {
		return strategy;
	}
	
	public void setStrategy(final com.algoTrader.entity.Strategy strategy) {
		this.strategy = strategy;
	}
	
	private java.util.Collection	transactions	= new java.util.HashSet();
	
	/**
     * 
     */
	public java.util.Collection getTransactions() {
		return transactions;
	}
	
	public void setTransactions(final java.util.Collection transactions) {
		this.transactions = transactions;
	}
	
	/**
     * 
     */
	public abstract boolean isOpen();
	
	/**
     * 
     */
	public abstract boolean isLong();
	
	/**
     * 
     */
	public abstract boolean isShort();
	
	/**
     * 
     */
	public abstract boolean isFlat();
	
	/**
     * 
     */
	public abstract double getMarketPriceDouble();
	
	/**
     * 
     */
	public abstract double getMarketValueDouble();
	
	/**
     * 
     */
	public abstract double getMaintenanceMarginDouble();
	
	/**
     * 
     */
	public abstract double getExitValueDouble();
	
	/**
	 * Returns <code>true</code> if the argument is an Position instance and all
	 * identifiers for this entity
	 * equal the identifiers of the argument entity. Returns <code>false</code>
	 * otherwise.
	 */
	@Override
	public boolean equals(final Object object) {
		if (this == object) { return true; }
		if (!(object instanceof Position)) { return false; }
		final Position that = (Position) object;
		if (id != that.getId()) { return false; }
		return true;
	}
	
	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + id;
		
		return hashCode;
	}
	
	/**
	 * Constructs new instances of {@link com.algoTrader.entity.Position}.
	 */
	public static final class Factory {
		/**
		 * Constructs a new instance of {@link com.algoTrader.entity.Position}.
		 */
		public static com.algoTrader.entity.Position newInstance() {
			return new com.algoTrader.entity.PositionImpl();
		}
		
		/**
		 * Constructs a new instance of {@link com.algoTrader.entity.Position},
		 * taking all required and/or
		 * read-only properties as arguments.
		 */
		public static com.algoTrader.entity.Position newInstance(
		        final long quantity,
		        final com.algoTrader.entity.Security security,
		        final com.algoTrader.entity.Strategy strategy) {
			final com.algoTrader.entity.Position entity = new com.algoTrader.entity.PositionImpl();
			entity.setQuantity(quantity);
			entity.setSecurity(security);
			entity.setStrategy(strategy);
			return entity;
		}
		
		/**
		 * Constructs a new instance of {@link com.algoTrader.entity.Position},
		 * taking all possible properties
		 * (except the identifier(s))as arguments.
		 */
		public static com.algoTrader.entity.Position newInstance(
		        final long quantity, final java.lang.Double exitValue,
		        final java.math.BigDecimal maintenanceMargin,
		        final com.algoTrader.entity.Security security,
		        final com.algoTrader.entity.Strategy strategy,
		        final java.util.Collection transactions) {
			final com.algoTrader.entity.Position entity = new com.algoTrader.entity.PositionImpl();
			entity.setQuantity(quantity);
			entity.setExitValue(exitValue);
			entity.setMaintenanceMargin(maintenanceMargin);
			entity.setSecurity(security);
			entity.setStrategy(strategy);
			entity.setTransactions(transactions);
			return entity;
		}
	}
	
	// HibernateEntity.vsl merge-point
}