// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package com.algoTrader.entity;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>com.algoTrader.entity.Strategy</code>.
 * </p>
 * 
 * @see com.algoTrader.entity.Strategy
 */
public abstract class StrategyDaoBase
        extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
        implements com.algoTrader.entity.StrategyDao {
	
	private com.algoTrader.entity.TransactionDao	transactionDao;
	
	/**
	 * Sets the reference to <code>transactionDao</code>.
	 */
	public void setTransactionDao(
	        final com.algoTrader.entity.TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}
	
	/**
	 * Gets the reference to <code>transactionDao</code>.
	 */
	protected com.algoTrader.entity.TransactionDao getTransactionDao() {
		return transactionDao;
	}
	
	private com.algoTrader.entity.PositionDao	positionDao;
	
	/**
	 * Sets the reference to <code>positionDao</code>.
	 */
	public void setPositionDao(
	        final com.algoTrader.entity.PositionDao positionDao) {
		this.positionDao = positionDao;
	}
	
	/**
	 * Gets the reference to <code>positionDao</code>.
	 */
	protected com.algoTrader.entity.PositionDao getPositionDao() {
		return positionDao;
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#load(int, int)
	 */
	@Override
	public java.lang.Object load(final int transform, final int id) {
		final java.lang.Object entity = getHibernateTemplate().get(
		        com.algoTrader.entity.StrategyImpl.class,
		        new java.lang.Integer(id));
		return transformEntity(transform,
		        (com.algoTrader.entity.Strategy) entity);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#load(int)
	 */
	@Override
	public com.algoTrader.entity.Strategy load(final int id) {
		return (com.algoTrader.entity.Strategy) this.load(
		        StrategyDao.TRANSFORM_NONE, id);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#loadAll()
	 */
	@Override
	public java.util.Collection loadAll() {
		return this.loadAll(StrategyDao.TRANSFORM_NONE);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#loadAll(int)
	 */
	@Override
	public java.util.Collection loadAll(final int transform) {
		final java.util.Collection results = getHibernateTemplate().loadAll(
		        com.algoTrader.entity.StrategyImpl.class);
		transformEntities(transform, results);
		return results;
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#create(com.algoTrader.entity.Strategy)
	 */
	@Override
	public com.algoTrader.entity.Strategy create(
	        final com.algoTrader.entity.Strategy strategy) {
		return (com.algoTrader.entity.Strategy) this.create(
		        StrategyDao.TRANSFORM_NONE, strategy);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#create(int transform,
	 *      com.algoTrader.entity.Strategy)
	 */
	@Override
	public java.lang.Object create(final int transform,
	        final com.algoTrader.entity.Strategy strategy) {
		if (strategy == null) { throw new IllegalArgumentException(
		        "Strategy.create - 'strategy' can not be null"); }
		getHibernateTemplate().save(strategy);
		return transformEntity(transform, strategy);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#create(java.util.Collection)
	 */
	@Override
	public java.util.Collection create(final java.util.Collection entities) {
		return create(StrategyDao.TRANSFORM_NONE, entities);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#create(int, java.util.Collection)
	 */
	@Override
	public java.util.Collection create(final int transform,
	        final java.util.Collection entities) {
		if (entities == null) { throw new IllegalArgumentException(
		        "Strategy.create - 'entities' can not be null"); }
		getHibernateTemplate().execute(
		        new org.springframework.orm.hibernate3.HibernateCallback()
		    {
			    @Override
			    public java.lang.Object doInHibernate(
			            final org.hibernate.Session session)
			            throws org.hibernate.HibernateException
			    {
				    for (final java.util.Iterator entityIterator = entities
				            .iterator(); entityIterator.hasNext();)
				    {
					    create(transform,
					            (com.algoTrader.entity.Strategy) entityIterator
					                    .next());
				    }
				    return null;
			    }
		    });
		return entities;
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#create(java.lang.String, boolean,
	 *      double, java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy create(
	        final java.lang.String name,
	        final boolean autoActivate,
	        final double allocation,
	        final java.lang.String modules) {
		return (com.algoTrader.entity.Strategy) this.create(
		        StrategyDao.TRANSFORM_NONE, name, autoActivate, allocation,
		        modules);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#create(int, java.lang.String,
	 *      boolean, double, java.lang.String)
	 */
	@Override
	public java.lang.Object create(
	        final int transform,
	        final java.lang.String name,
	        final boolean autoActivate,
	        final double allocation,
	        final java.lang.String modules) {
		final com.algoTrader.entity.Strategy entity = new com.algoTrader.entity.StrategyImpl();
		entity.setName(name);
		entity.setAutoActivate(autoActivate);
		entity.setAllocation(allocation);
		entity.setModules(modules);
		return this.create(transform, entity);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#update(com.algoTrader.entity.Strategy)
	 */
	@Override
	public void update(final com.algoTrader.entity.Strategy strategy) {
		if (strategy == null) { throw new IllegalArgumentException(
		        "Strategy.update - 'strategy' can not be null"); }
		getHibernateTemplate().update(strategy);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#update(java.util.Collection)
	 */
	@Override
	public void update(final java.util.Collection entities) {
		if (entities == null) { throw new IllegalArgumentException(
		        "Strategy.update - 'entities' can not be null"); }
		getHibernateTemplate().execute(
		        new org.springframework.orm.hibernate3.HibernateCallback()
		    {
			    @Override
			    public java.lang.Object doInHibernate(
			            final org.hibernate.Session session)
			            throws org.hibernate.HibernateException
			    {
				    for (final java.util.Iterator entityIterator = entities
				            .iterator(); entityIterator.hasNext();)
				    {
					    update((com.algoTrader.entity.Strategy) entityIterator
					            .next());
				    }
				    return null;
			    }
		    });
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#remove(com.algoTrader.entity.Strategy)
	 */
	@Override
	public void remove(final com.algoTrader.entity.Strategy strategy) {
		if (strategy == null) { throw new IllegalArgumentException(
		        "Strategy.remove - 'strategy' can not be null"); }
		getHibernateTemplate().delete(strategy);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#remove(int)
	 */
	@Override
	public void remove(final int id) {
		final com.algoTrader.entity.Strategy entity = this.load(id);
		if (entity != null) {
			this.remove(entity);
		}
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#remove(java.util.Collection)
	 */
	@Override
	public void remove(final java.util.Collection entities) {
		if (entities == null) { throw new IllegalArgumentException(
		        "Strategy.remove - 'entities' can not be null"); }
		getHibernateTemplate().deleteAll(entities);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByName(java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy
	        findByName(final java.lang.String name) {
		return (com.algoTrader.entity.Strategy) this.findByName(
		        StrategyDao.TRANSFORM_NONE, name);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByName(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy findByName(
	        final java.lang.String queryString, final java.lang.String name) {
		return (com.algoTrader.entity.Strategy) this.findByName(
		        StrategyDao.TRANSFORM_NONE, queryString, name);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByName(int, java.lang.String)
	 */
	@Override
	public java.lang.Object findByName(final int transform,
	        final java.lang.String name) {
		return this.findByName(transform,
		        "from StrategyImpl where name = :name ", name);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByName(int, java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public java.lang.Object findByName(final int transform,
	        final java.lang.String queryString, final java.lang.String name) {
		try {
			final org.hibernate.Query queryObject = super.getSession(false)
			        .createQuery(queryString);
			queryObject.setCacheable(true);
			queryObject.setParameter("name", name);
			final java.util.Set results = new java.util.LinkedHashSet(
			        queryObject.list());
			java.lang.Object result = null;
			if (results != null) {
				if (results.size() > 1) {
					throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					        "More than one instance of 'com.algoTrader.entity.Strategy"
					                +
					                "' was found when executing query --> '" +
					                queryString + "'");
				} else if (results.size() == 1) {
					result = results.iterator().next();
				}
			}
			result = transformEntity(transform,
			        (com.algoTrader.entity.Strategy) result);
			return result;
		} catch (final org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByNameFetched(java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy findByNameFetched(
	        final java.lang.String name) {
		return (com.algoTrader.entity.Strategy) this.findByNameFetched(
		        StrategyDao.TRANSFORM_NONE, name);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByNameFetched(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public com.algoTrader.entity.Strategy findByNameFetched(
	        final java.lang.String queryString, final java.lang.String name) {
		return (com.algoTrader.entity.Strategy) this.findByNameFetched(
		        StrategyDao.TRANSFORM_NONE, queryString, name);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByNameFetched(int,
	 *      java.lang.String)
	 */
	@Override
	public java.lang.Object findByNameFetched(final int transform,
	        final java.lang.String name) {
		return this.findByNameFetched(transform,
		        "from StrategyImpl as st where st.name = :name ", name);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findByNameFetched(int,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public java.lang.Object findByNameFetched(final int transform,
	        final java.lang.String queryString, final java.lang.String name) {
		try {
			final org.hibernate.Query queryObject = super.getSession(false)
			        .createQuery(queryString);
			queryObject.setCacheable(true);
			queryObject.setParameter("name", name);
			final java.util.Set results = new java.util.LinkedHashSet(
			        queryObject.list());
			java.lang.Object result = null;
			if (results != null) {
				if (results.size() > 1) {
					throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					        "More than one instance of 'com.algoTrader.entity.Strategy"
					                +
					                "' was found when executing query --> '" +
					                queryString + "'");
				} else if (results.size() == 1) {
					result = results.iterator().next();
				}
			}
			result = transformEntity(transform,
			        (com.algoTrader.entity.Strategy) result);
			return result;
		} catch (final org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findAutoActivateStrategies()
	 */
	@Override
	public java.util.List findAutoActivateStrategies() {
		return this.findAutoActivateStrategies(StrategyDao.TRANSFORM_NONE);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findAutoActivateStrategies(java.lang.String)
	 */
	@Override
	public java.util.List findAutoActivateStrategies(
	        final java.lang.String queryString) {
		return this.findAutoActivateStrategies(StrategyDao.TRANSFORM_NONE,
		        queryString);
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findAutoActivateStrategies(int)
	 */
	@Override
	public java.util.List findAutoActivateStrategies(final int transform) {
		return this
		        .findAutoActivateStrategies(
		                transform,
		                "select s from StrategyImpl as s where s.autoActivate = true order by s.id");
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#findAutoActivateStrategies(int,
	 *      java.lang.String)
	 */
	@Override
	public java.util.List findAutoActivateStrategies(final int transform,
	        final java.lang.String queryString) {
		try {
			final org.hibernate.Query queryObject = super.getSession(false)
			        .createQuery(queryString);
			queryObject.setCacheable(true);
			final java.util.List results = queryObject.list();
			transformEntities(transform, results);
			return results;
		} catch (final org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#getPortfolioCashBalanceDouble()
	 */
	@Override
	public double getPortfolioCashBalanceDouble() {
		try {
			return handleGetPortfolioCashBalanceDouble();
		} catch (final Throwable th) {
			throw new java.lang.RuntimeException(
			        "Error performing 'com.algoTrader.entity.StrategyDao.getPortfolioCashBalanceDouble()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPortfolioCashBalanceDouble()}
	 */
	protected abstract double handleGetPortfolioCashBalanceDouble()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#getPortfolioSecuritiesCurrentValueDouble()
	 */
	@Override
	public double getPortfolioSecuritiesCurrentValueDouble() {
		try {
			return handleGetPortfolioSecuritiesCurrentValueDouble();
		} catch (final Throwable th) {
			throw new java.lang.RuntimeException(
			        "Error performing 'com.algoTrader.entity.StrategyDao.getPortfolioSecuritiesCurrentValueDouble()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for
	 * {@link #getPortfolioSecuritiesCurrentValueDouble()}
	 */
	protected abstract double handleGetPortfolioSecuritiesCurrentValueDouble()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#getPortfolioMaintenanceMarginDouble()
	 */
	@Override
	public double getPortfolioMaintenanceMarginDouble() {
		try {
			return handleGetPortfolioMaintenanceMarginDouble();
		} catch (final Throwable th) {
			throw new java.lang.RuntimeException(
			        "Error performing 'com.algoTrader.entity.StrategyDao.getPortfolioMaintenanceMarginDouble()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for
	 * {@link #getPortfolioMaintenanceMarginDouble()}
	 */
	protected abstract double handleGetPortfolioMaintenanceMarginDouble()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#getPortfolioInitialMarginDouble()
	 */
	@Override
	public double getPortfolioInitialMarginDouble() {
		try {
			return handleGetPortfolioInitialMarginDouble();
		} catch (final Throwable th) {
			throw new java.lang.RuntimeException(
			        "Error performing 'com.algoTrader.entity.StrategyDao.getPortfolioInitialMarginDouble()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPortfolioInitialMarginDouble()}
	 */
	protected abstract double handleGetPortfolioInitialMarginDouble()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#getPortfolioNetLiqValueDouble()
	 */
	@Override
	public double getPortfolioNetLiqValueDouble() {
		try {
			return handleGetPortfolioNetLiqValueDouble();
		} catch (final Throwable th) {
			throw new java.lang.RuntimeException(
			        "Error performing 'com.algoTrader.entity.StrategyDao.getPortfolioNetLiqValueDouble()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPortfolioNetLiqValueDouble()}
	 */
	protected abstract double handleGetPortfolioNetLiqValueDouble()
	        throws java.lang.Exception;
	
	/**
	 * @see com.algoTrader.entity.StrategyDao#getPortfolioAvailableFundsDouble()
	 */
	@Override
	public double getPortfolioAvailableFundsDouble() {
		try {
			return handleGetPortfolioAvailableFundsDouble();
		} catch (final Throwable th) {
			throw new java.lang.RuntimeException(
			        "Error performing 'com.algoTrader.entity.StrategyDao.getPortfolioAvailableFundsDouble()' --> " +
			                th,
			        th);
		}
	}
	
	/**
	 * Performs the core logic for {@link #getPortfolioAvailableFundsDouble()}
	 */
	protected abstract double handleGetPortfolioAvailableFundsDouble()
	        throws java.lang.Exception;
	
	/**
	 * Allows transformation of entities into value objects
	 * (or something else for that matter), when the <code>transform</code> flag
	 * is set to one of the constants defined in
	 * <code>com.algoTrader.entity.StrategyDao</code>, please note
	 * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so
	 * the entity itself
	 * will be returned.
	 * 
	 * If the integer argument value is unknown {@link #TRANSFORM_NONE} is
	 * assumed.
	 * 
	 * @param transform
	 *            one of the constants declared in
	 *            {@link com.algoTrader.entity.StrategyDao}
	 * @param entity
	 *            an entity that was found
	 * @return the transformed entity (i.e. new value object, etc)
	 * @see #transformEntities(int,java.util.Collection)
	 */
	protected java.lang.Object transformEntity(final int transform,
	        final com.algoTrader.entity.Strategy entity) {
		java.lang.Object target = null;
		if (entity != null) {
			switch (transform) {
				case TRANSFORM_NONE: // fall-through
				default:
					target = entity;
			}
		}
		return target;
	}
	
	/**
	 * Transforms a collection of entities using the
	 * {@link #transformEntity(int,com.algoTrader.entity.Strategy)} method. This
	 * method does not instantiate a new collection.
	 * <p/>
	 * This method is to be used internally only.
	 * 
	 * @param transform
	 *            one of the constants declared in
	 *            <code>com.algoTrader.entity.StrategyDao</code>
	 * @param entities
	 *            the collection of entities to transform
	 * @see #transformEntity(int,com.algoTrader.entity.Strategy)
	 */
	protected void transformEntities(final int transform,
	        final java.util.Collection entities) {
		switch (transform) {
			case TRANSFORM_NONE: // fall-through
			default:
				// do nothing;
		}
	}
	
}