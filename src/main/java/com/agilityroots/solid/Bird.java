package com.agilityroots.solid;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bird {

	private Double abscess;
	private Double ordinate;
	private Double altitude;
	private Set<Double> location;

	public void setLocation(double abscess, double ordinate) {
		this.abscess = Double.valueOf(abscess);
		this.ordinate = Double.valueOf(ordinate);
	}

	public void setLocation(Set<Double> location) {
		this.location = location;
	}

	public void setAltitude(double altitiude) {
		this.altitude = Double.valueOf(altitiude);
	}

	public Double getAbscess() {
		return abscess;
	}

	public Double getOrdinate() {
		return ordinate;
	}

	public Double getAltitude() {
		return altitude;
	}

	public Set<Double> getLocation() {
		location = Stream.of(abscess, ordinate, altitude).collect(Collectors.toSet());
		return location;
	}

	public void draw(Set<Double> location) {
		System.out.println("I hereby draweth the Bird!");
	}

	public Set<Double> fly(double xDisplacement, double yDisplacement, double altitudeChange) {
		System.out.println("Flap flap flap");
		location = Stream.of(Double.valueOf(xDisplacement) + abscess, Double.valueOf(yDisplacement) + ordinate,
				Double.valueOf(altitudeChange) + altitude).collect(Collectors.toSet());
		return location;
	}
}