package com.vzome.core.model;

import com.vzome.core.algebra.AlgebraicVector;
import java.util.Comparator;


/**
 * @author Scott Vorthmann
 */
public class Connector extends Manifestation implements Comparable<Connector>, Comparator<Connector>
{

	public Connector( AlgebraicVector loc )
	{
		super();
		
		m_center = loc;
	}

	private final AlgebraicVector m_center;

	@Override
	public AlgebraicVector getLocation()
    {
		return m_center;
	}

	@Override
	public int hashCode()
	{
	    return m_center .hashCode();
	}

	@Override
	public  boolean equals( Object other )
	{
		if ( other == null )
			return false;
		if ( other == this )
			return true;
		if ( ! ( other instanceof Connector ) )
			return false;
		Connector conn = (Connector) other;
		return this .getLocation() .equals( conn .getLocation() );
	}

	@Override
	public int compareTo(Connector other) {
		if ( other == null )
			return -1;
		if ( this == other )
			return 0;
		if ( this.equals(other) )
			return 0;
		return this.getLocation().compareTo( other.getLocation() );
	}
	
	@Override
	public int compare(Connector o1, Connector o2) {
		return (o1 == null)
				? ((o2 == null) ? 0 : -1)
				: o1.compareTo(o2);
	}
	
	@Override
    public String toString()
    {
        return "connector at " + m_center .toString();
    }
}
