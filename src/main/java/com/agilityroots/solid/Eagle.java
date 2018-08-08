/**
 * 
 */
package com.agilityroots.solid;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author anadi
 *
 */
public class Eagle extends Bird {

	public Set<Double> freeFloat(double xDisplacement, double yDisplacement) {

		Set<Double> location = Stream.of(Double.valueOf(xDisplacement) + getAbscess(),
				Double.valueOf(yDisplacement) + getOrdinate(), getAltitude()).collect(Collectors.toSet());
		setLocation(location);
		return location;
	}
}
