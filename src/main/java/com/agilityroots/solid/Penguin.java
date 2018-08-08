/**
 * 
 */
package com.agilityroots.solid;

import java.util.Set;

/**
 * @author anadi
 *
 */
public class Penguin extends Bird {

	@Override
	public Set<Double> fly(double xDisplacement, double yDisplacement, double altitudeChange) {
		// We can't let penguins fly
		return null;
	}

	@Override
	public void setAltitude(double altitiude) {
		// This method does nothing
	}
}
