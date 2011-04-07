// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package com.algoTrader.entity;

/**
 * @see com.algoTrader.entity.Tick
 */
public interface TickDao {
	/**
	 * This constant is used as a transformation flag; entities can be converted
	 * automatically into value objects
	 * or other types, different methods in a class implementing this interface
	 * support this feature: look for
	 * an <code>int</code> parameter called <code>transform</code>.
	 * <p/>
	 * This specific flag denotes no transformation will occur.
	 */
	public final static int	TRANSFORM_NONE	    = 0;
	
	/**
	 * This constant is used as a transformation flag; entities can be converted
	 * automatically into value objects
	 * or other types, different methods in a class implementing this interface
	 * support this feature: look for
	 * an <code>int</code> parameter called <code>transform</code>.
	 * <p/>
	 * This specific flag denotes entities must be transformed into objects of
	 * type {@link com.algoTrader.vo.RawTickVO}.
	 */
	public final static int	TRANSFORM_RAWTICKVO	= 1;
	
	/**
	 * Copies the fields of the specified entity to the target value object.
	 * This method is similar to
	 * toRawTickVO(), but it does not handle any attributes in the target
	 * value object that are "read-only" (as those do not have setter methods
	 * exposed).
	 */
	public void toRawTickVO(
	        com.algoTrader.entity.Tick source,
	        com.algoTrader.vo.RawTickVO target);
	
	/**
	 * Converts this DAO's entity to an object of type
	 * {@link com.algoTrader.vo.RawTickVO}.
	 */
	public com.algoTrader.vo.RawTickVO toRawTickVO(
	        com.algoTrader.entity.Tick entity);
	
	/**
	 * Converts this DAO's entity to a Collection of instances of type
	 * {@link com.algoTrader.vo.RawTickVO}.
	 */
	public void toRawTickVOCollection(java.util.Collection entities);
	
	/**
	 * Copies the fields of {@link com.algoTrader.vo.RawTickVO} to the specified
	 * entity.
	 * 
	 * @param copyIfNull
	 *            If FALSE, the value object's field will not be copied to the
	 *            entity if the value is NULL. If TRUE,
	 *            it will be copied regardless of its value.
	 */
	public void rawTickVOToEntity(
	        com.algoTrader.vo.RawTickVO source,
	        com.algoTrader.entity.Tick target,
	        boolean copyIfNull);
	
	/**
	 * Converts an instance of type {@link com.algoTrader.vo.RawTickVO} to this
	 * DAO's entity.
	 */
	public com.algoTrader.entity.Tick rawTickVOToEntity(
	        com.algoTrader.vo.RawTickVO rawTickVO);
	
	/**
	 * Converts a Collection of instances of type
	 * {@link com.algoTrader.vo.RawTickVO} to this
	 * DAO's entity.
	 */
	public void rawTickVOToEntityCollection(java.util.Collection instances);
	
	/**
	 * Loads an instance of com.algoTrader.entity.Tick from the persistent
	 * store.
	 */
	public com.algoTrader.entity.Tick load(int id);
	
	/**
	 * <p>
	 * Does the same thing as {@link #load(int)} with an additional flag called
	 * <code>transform</code>. If this flag is set to
	 * <code>TRANSFORM_NONE</code> then the returned entity will
	 * <strong>NOT</strong> be transformed. If this flag is any of the other
	 * constants defined in this class then the result <strong>WILL BE</strong>
	 * passed through an operation which can optionally transform the entity
	 * (into a value object for example). By default, transformation does not
	 * occur.
	 * </p>
	 * 
	 * @param id
	 *            the identifier of the entity to load.
	 * @return either the entity or the object transformed from the entity.
	 */
	public Object load(int transform, int id);
	
	/**
	 * Loads all entities of type {@link com.algoTrader.entity.Tick}.
	 * 
	 * @return the loaded entities.
	 */
	public java.util.Collection loadAll();
	
	/**
	 * <p>
	 * Does the same thing as {@link #loadAll()} with an additional flag called
	 * <code>transform</code>. If this flag is set to
	 * <code>TRANSFORM_NONE</code> then the returned entity will
	 * <strong>NOT</strong> be transformed. If this flag is any of the other
	 * constants defined here then the result <strong>WILL BE</strong> passed
	 * through an operation which can optionally transform the entity (into a
	 * value object for example). By default, transformation does not occur.
	 * </p>
	 * 
	 * @param transform
	 *            the flag indicating what transformation to use.
	 * @return the loaded entities.
	 */
	public java.util.Collection loadAll(final int transform);
	
	/**
	 * Creates an instance of com.algoTrader.entity.Tick and adds it to the
	 * persistent store.
	 */
	public com.algoTrader.entity.Tick create(com.algoTrader.entity.Tick tick);
	
	/**
	 * <p>
	 * Does the same thing as {@link #create(com.algoTrader.entity.Tick)} with
	 * an additional flag called <code>transform</code>. If this flag is set to
	 * <code>TRANSFORM_NONE</code> then the returned entity will
	 * <strong>NOT</strong> be transformed. If this flag is any of the other
	 * constants defined here then the result <strong>WILL BE</strong> passed
	 * through an operation which can optionally transform the entity (into a
	 * value object for example). By default, transformation does not occur.
	 * </p>
	 */
	public Object create(int transform, com.algoTrader.entity.Tick tick);
	
	/**
	 * Creates a new instance of com.algoTrader.entity.Tick and adds
	 * from the passed in <code>entities</code> collection
	 * 
	 * @param entities
	 *            the collection of com.algoTrader.entity.Tick
	 *            instances to create.
	 * 
	 * @return the created instances.
	 */
	public java.util.Collection create(java.util.Collection entities);
	
	/**
	 * <p>
	 * Does the same thing as {@link #create(com.algoTrader.entity.Tick)} with
	 * an additional flag called <code>transform</code>. If this flag is set to
	 * <code>TRANSFORM_NONE</code> then the returned entity will
	 * <strong>NOT</strong> be transformed. If this flag is any of the other
	 * constants defined here then the result <strong>WILL BE</strong> passed
	 * through an operation which can optionally transform the entities (into
	 * value objects for example). By default, transformation does not occur.
	 * </p>
	 */
	public java.util.Collection create(int transform,
	        java.util.Collection entities);
	
	/**
	 * <p>
	 * Creates a new <code>com.algoTrader.entity.Tick</code> instance from
	 * <strong>all</strong> attributes and adds it to the persistent store.
	 * </p>
	 */
	public com.algoTrader.entity.Tick create(
	        java.util.Date dateTime,
	        java.math.BigDecimal last,
	        java.util.Date lastDateTime,
	        int vol,
	        int volBid,
	        int volAsk,
	        java.math.BigDecimal bid,
	        java.math.BigDecimal ask,
	        int openIntrest,
	        java.math.BigDecimal settlement);
	
	/**
	 * <p>
	 * Does the same thing as
	 * {@link #create(java.util.Date, java.math.BigDecimal, java.util.Date, int, int, int, java.math.BigDecimal, java.math.BigDecimal, int, java.math.BigDecimal)}
	 * with an additional flag called <code>transform</code>. If this flag is
	 * set to <code>TRANSFORM_NONE</code> then the returned entity will
	 * <strong>NOT</strong> be transformed. If this flag is any of the other
	 * constants defined here then the result <strong>WILL BE</strong> passed
	 * through an operation which can optionally transform the entity (into a
	 * value object for example). By default, transformation does not occur.
	 * </p>
	 */
	public Object create(
	        int transform,
	        java.util.Date dateTime,
	        java.math.BigDecimal last,
	        java.util.Date lastDateTime,
	        int vol,
	        int volBid,
	        int volAsk,
	        java.math.BigDecimal bid,
	        java.math.BigDecimal ask,
	        int openIntrest,
	        java.math.BigDecimal settlement);
	
	/**
	 * <p>
	 * Creates a new <code>com.algoTrader.entity.Tick</code> instance from only
	 * <strong>required</strong> properties (attributes and association ends)
	 * and adds it to the persistent store.
	 * </p>
	 */
	public com.algoTrader.entity.Tick create(
	        java.math.BigDecimal ask,
	        java.math.BigDecimal bid,
	        java.util.Date dateTime,
	        int openIntrest,
	        com.algoTrader.entity.Security security,
	        int vol,
	        int volAsk,
	        int volBid);
	
	/**
	 * <p>
	 * Does the same thing as
	 * {@link #create(java.util.Date, int, int, int, java.math.BigDecimal, java.math.BigDecimal, int)}
	 * with an additional flag called <code>transform</code>. If this flag is
	 * set to <code>TRANSFORM_NONE</code> then the returned entity will
	 * <strong>NOT</strong be transformed. If this flag is any of the other
	 * constants defined here then the result <strong>WILL BE</strong> passed
	 * through an operation which can optionally transform the entity (into a
	 * value object for example). By default, transformation does not occur.
	 * </p>
	 */
	public Object create(
	        int transform,
	        java.math.BigDecimal ask,
	        java.math.BigDecimal bid,
	        java.util.Date dateTime,
	        int openIntrest,
	        com.algoTrader.entity.Security security,
	        int vol,
	        int volAsk,
	        int volBid);
	
	/**
	 * Updates the <code>tick</code> instance in the persistent store.
	 */
	public void update(com.algoTrader.entity.Tick tick);
	
	/**
	 * Updates all instances in the <code>entities</code> collection in the
	 * persistent store.
	 */
	public void update(java.util.Collection entities);
	
	/**
	 * Removes the instance of com.algoTrader.entity.Tick from the persistent
	 * store.
	 */
	public void remove(com.algoTrader.entity.Tick tick);
	
	/**
	 * Removes the instance of com.algoTrader.entity.Tick having the given
	 * <code>identifier</code> from the persistent store.
	 */
	public void remove(int id);
	
	/**
	 * Removes all entities in the given <code>entities<code> collection.
	 */
	public void remove(java.util.Collection entities);
	
	/**
 * 
     */
	public com.algoTrader.entity.Tick findLastTickForSecurityAndMaxDate(
	        int securityId, java.util.Date maxDate);
	
	/**
	 * <p>
	 * Does the same thing as
	 * {@link #findLastTickForSecurityAndMaxDate(int, java.util.Date)} with an
	 * additional argument called <code>queryString</code>. This
	 * <code>queryString</code> argument allows you to override the query string
	 * defined in
	 * {@link #findLastTickForSecurityAndMaxDate(int, java.util.Date)}.
	 * </p>
	 */
	public com.algoTrader.entity.Tick findLastTickForSecurityAndMaxDate(
	        String queryString, int securityId, java.util.Date maxDate);
	
	/**
	 * <p>
	 * Does the same thing as
	 * {@link #findLastTickForSecurityAndMaxDate(int, java.util.Date)} with an
	 * additional flag called <code>transform</code>. If this flag is set to
	 * <code>TRANSFORM_NONE</code> then finder results will <strong>NOT</strong>
	 * be transformed during retrieval. If this flag is any of the other
	 * constants defined here then finder results <strong>WILL BE</strong>
	 * passed through an operation which can optionally transform the entities
	 * (into value objects for example). By default, transformation does not
	 * occur.
	 * </p>
	 */
	public Object findLastTickForSecurityAndMaxDate(int transform,
	        int securityId, java.util.Date maxDate);
	
	/**
	 * <p>
	 * Does the same thing as
	 * {@link #findLastTickForSecurityAndMaxDate(boolean, int, java.util.Date)}
	 * with an additional argument called <code>queryString</code>. This
	 * <code>queryString</code> argument allows you to override the query string
	 * defined in {@link #findLastTickForSecurityAndMaxDate(int, int securityId,
	 * java.util.Date maxDate)}.
	 * </p>
	 */
	public Object findLastTickForSecurityAndMaxDate(int transform,
	        String queryString, int securityId, java.util.Date maxDate);
	
}
