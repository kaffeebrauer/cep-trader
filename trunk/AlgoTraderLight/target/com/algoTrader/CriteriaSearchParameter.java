// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateSearchParameter.vsl in andromda-spring-cartridge.
//
package com.algoTrader;

import java.util.regex.Pattern;

/**
 * A <code>CriteriaSearchParameter</code> represents a parameter for a
 * <code>CriteriaSearch</code>. <br>
 * <br>
 * The <code>parameterValue</code> is the actual value to be searched for. <br>
 * <br>
 * The <code>parameterPattern</code> describes the actual parameter which shall
 * be considered for
 * the search. It contains the dot-seperated path and the name of the parameter
 * starting at the
 * rootEntity of the actual <code>CriteriaSearch</code>. The pattern of a the
 * street of an address
 * of a person would look like <i>address.street </i> (assuming the entity
 * structure to be <code>aPerson.getAddress().getStreet()</code>). <br>
 * <br>
 * Usually, if a parameter is <code>null</code> (or if the parameter is of type
 * <code>String</code> and empty), it is not considered for a search. If
 * <code>searchIfIsNull</code> is <code>true</code> it is explicitly searched
 * for the parameter to be null (or empty if the parameter is of type
 * <code>String</code>).<br>
 * <br>
 * The <code>comparatorID</code> defines the comparator for the parameter. For
 * parameters of type <code>String</code> the default comparator is the
 * <code>LIKE_COMPARATOR</code>. The <code>EQUAL_COMPARATOR</code> is default
 * for other parameters.
 * 
 * @author Stefan Reichert
 * @author Peter Friese
 */
public class CriteriaSearchParameter {
	
	public static final Pattern	              PATTERN	                       = Pattern
	                                                                                   .compile("\\.");
	
	public static final int	                  LIKE_COMPARATOR	               = 0;
	public static final int	                  INSENSITIVE_LIKE_COMPARATOR	   = 1;
	public static final int	                  EQUAL_COMPARATOR	               = 2;
	public static final int	                  GREATER_THAN_OR_EQUAL_COMPARATOR	= 3;
	public static final int	                  GREATER_THAN_COMPARATOR	       = 4;
	public static final int	                  LESS_THAN_OR_EQUAL_COMPARATOR	   = 5;
	public static final int	                  LESS_THAN_COMPARATOR	           = 6;
	public static final int	                  IN_COMPARATOR	                   = 7;
	public static final int	                  NOT_EQUAL_COMPARATOR	           = 8;
	
	/** Order unset */
	public static final int	                  ORDER_UNSET	                   = -1;
	
	/** Ascending order */
	public static final int	                  ORDER_ASC	                       = 0;
	
	/** Descending order */
	public static final int	                  ORDER_DESC	                   = 1;
	
	/** Order relevance not set */
	public static final int	                  RELEVANCE_UNSET	               = -1;
	
	private Object	                          parameterValue;
	private String	                          parameterPattern;
	private boolean	                          searchIfIsNull	               = false;
	private org.hibernate.criterion.MatchMode	matchMode	                   = null;
	private int	                              comparatorID	                   = CriteriaSearchParameter.EQUAL_COMPARATOR;
	private int	                              orderDirection	               = CriteriaSearchParameter.ORDER_UNSET;
	private int	                              orderRelevance	               = CriteriaSearchParameter.RELEVANCE_UNSET;
	
	/**
	 * Constructor for CriteriaSearchParameter. Sets <code>searchIfIsNull</code>
	 * to <code>false</code> and uses the <code>EQUAL_COMPARATOR</code>.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 */
	public CriteriaSearchParameter(final Object parameterValue,
	        final String parameterPattern) {
		this(parameterValue, parameterPattern, false,
		        CriteriaSearchParameter.EQUAL_COMPARATOR);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter for a <code>String</code>
	 * parameter.
	 * Sets <code>searchIfIsNull</code> to <code>false</code> and uses the
	 * <code>LIKE_COMPARATOR</code>.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 */
	public CriteriaSearchParameter(final String parameterValue,
	        final String parameterPattern) {
		this(parameterValue, parameterPattern, false,
		        CriteriaSearchParameter.LIKE_COMPARATOR);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter for a <code>String[]</code>
	 * parameter.
	 * Sets <code>searchIfIsNull</code> to <code>false</code> and uses the
	 * <code>LIKE_COMPARATOR</code>.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 */
	public CriteriaSearchParameter(final String[] parameterValue,
	        final String parameterPattern) {
		this(parameterValue, parameterPattern, false,
		        CriteriaSearchParameter.LIKE_COMPARATOR);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter. Sets <code>searchIfIsNull</code>
	 * to <code>false</code>.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 */
	public CriteriaSearchParameter(final Object parameterValue,
	        final String parameterPattern, final int comparatorID) {
		this(parameterValue, parameterPattern, false, comparatorID);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 */
	public CriteriaSearchParameter(
	        final Object parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull) {
		this(parameterValue, parameterPattern, searchIfNull,
		        CriteriaSearchParameter.EQUAL_COMPARATOR);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 */
	public CriteriaSearchParameter(
	        final String parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull) {
		this(parameterValue, parameterPattern, searchIfNull,
		        CriteriaSearchParameter.LIKE_COMPARATOR);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 */
	public CriteriaSearchParameter(
	        final String[] parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull) {
		this(parameterValue, parameterPattern, searchIfNull,
		        CriteriaSearchParameter.LIKE_COMPARATOR);
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 * @param comparatorID
	 *            Indicates what comparator is to be used (e.g. like, =, <,
	 *            ...).
	 */
	public CriteriaSearchParameter(
	        final Object parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull,
	        final int comparatorID) {
		super();
		this.parameterValue = parameterValue;
		this.parameterPattern = parameterPattern;
		searchIfIsNull = searchIfNull;
		this.comparatorID = comparatorID;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final Object parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern, searchIfNull);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final String parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern, searchIfNull);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final String[] parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern, searchIfNull);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param searchIfIsNull
	 *            Indicates whether the query should contain an
	 *            <code>IS NULL</code> if the parameter is <code>null</code>.
	 * @param comparatorID
	 *            Indicates what comparator is to be used (e.g. like, =, <,
	 *            ...).
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final String parameterValue,
	        final String parameterPattern,
	        final boolean searchIfNull,
	        final int comparatorID,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern, searchIfNull, comparatorID);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param comparatorID
	 *            Indicates what comparator is to be used (e.g. like, =, <,
	 *            ...).
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final Object parameterValue,
	        final String parameterPattern,
	        final int comparatorID,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern, comparatorID);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final Object parameterValue,
	        final String parameterPattern,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final String parameterValue,
	        final String parameterPattern,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern);
		this.matchMode = matchMode;
	}
	
	/**
	 * Constructor for CriteriaSearchParameter.
	 * 
	 * @param parameterValue
	 *            The actual value of the parameter.
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 * @param matchMode
	 *            The hibernate matchmode to be used in string comparisons.
	 */
	public CriteriaSearchParameter(
	        final String[] parameterValue,
	        final String parameterPattern,
	        final org.hibernate.criterion.MatchMode matchMode) {
		this(parameterValue, parameterPattern);
		this.matchMode = matchMode;
	}
	
	/**
	 * @return The comparator to be used (e.g. like, =, <, ...).
	 */
	public int getComparatorID() {
		return comparatorID;
	}
	
	/**
	 * Sets the comparator to be used (e.g. like, =, <, ...).
	 * 
	 * @param comparatorID
	 *            The comprator ID.
	 */
	public void setComparatorID(final int comparatorID) {
		this.comparatorID = comparatorID;
	}
	
	/**
	 * @return The pattern of this parameter (dot-seperated path e.g.
	 *         person.address.street).
	 */
	public String getParameterPattern() {
		return parameterPattern;
	}
	
	/**
	 * Sets the pattern of this parameter.
	 * 
	 * @param parameterPattern
	 *            The pattern of this parameter (dot-seperated path e.g.
	 *            person.address.street).
	 */
	public void setParameterPattern(final String parameterPattern) {
		this.parameterPattern = parameterPattern;
	}
	
	/**
	 * Parse the parameter pattern and return the last part of the name.
	 * 
	 * @param parameterPattern
	 *            The parameter pattern.
	 * @return The last part of the parameter pattern, i.e. the attribute name.
	 */
	private String parseParameterName(final String parameterPattern) {
		// parsing the pattern of the parameter
		final String[] path = CriteriaSearchParameter.PATTERN
		        .split(parameterPattern);
		return path[path.length - 1];
	}
	
	/**
	 * @return The last part of the parameter pattern, i.e. the attribute name.
	 */
	public String getParameterName() {
		return parseParameterName(parameterPattern);
	}
	
	/**
	 * @return The value of this parameter.
	 */
	public Object getParameterValue() {
		return parameterValue;
	}
	
	/**
	 * Sets the value of this parameter.
	 * 
	 * @param parameterValue
	 *            The value of this parameter.
	 */
	public void setParameterValue(final Object parameterValue) {
		this.parameterValue = parameterValue;
	}
	
	/**
	 * @return Whether this parameter will be included in the search even if it
	 *         is <code>null</code>.
	 */
	public boolean isSearchIfIsNull() {
		return searchIfIsNull;
	}
	
	/**
	 * Defines whether parameter will be included in the search even if it is
	 * <code>null</code>.
	 * 
	 * @param searchIfNull
	 *            <code>true</code> if the parameter should be included in the
	 *            search
	 *            even if it is null, <code>false</code> otherwise.
	 */
	public void setSearchIfIsNull(final boolean searchIfNull) {
		searchIfIsNull = searchIfNull;
	}
	
	/**
	 * @return The hibernate matchmode of this parameter.
	 */
	public org.hibernate.criterion.MatchMode getMatchMode() {
		return matchMode;
	}
	
	/**
	 * Sets the hibernate matchmode of this parameter.
	 * 
	 * @param matchMode
	 *            The hibernate matchmode.
	 */
	public void setMatchMode(final org.hibernate.criterion.MatchMode matchMode) {
		this.matchMode = matchMode;
	}
	
	/**
	 * @return The order (ascending or descending) for this parameter.
	 * @see ORDER_ASC
	 * @see ORDER_DESC
	 * @see ORDER_UNSET
	 */
	public int getOrderDirection() {
		return orderDirection;
	}
	
	/**
	 * Sets the ordering for this parameter.
	 * 
	 * @param orderDirection
	 *            The ordering for this parameter.
	 */
	public void setOrderDirection(final int orderDirection) {
		this.orderDirection = orderDirection;
	}
	
	/**
	 * @return The relevance for this parameter.
	 * @see RELEVANCE_UNSET
	 */
	public int getOrderRelevance() {
		return orderRelevance;
	}
	
	/**
	 * Sets the ordering relevance for this parameter.
	 * 
	 * @param order
	 *            The ordering relevance for this parameter.
	 */
	public void setOrderRelevance(final int relevance) {
		orderRelevance = relevance;
	}
	
}