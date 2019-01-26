package com.alliance.model;

import java.io.Serializable;

public class MeterReadingSearchFilter extends SearchFilter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6559132564543296586L;
	private String fkLocationId;
	private String fkCustomerId;
	private String meterId;
	private String numOfDays;
	private String meterReader;
	private String meterSerial;
	private String meterName;
	private String reading;

	public String getFkLocationId() {
		return fkLocationId;
	}

	public void setFkLocationId(String fkLocationId) {
		this.fkLocationId = fkLocationId;
	}

	public String getFkCustomerId() {
		return fkCustomerId;
	}

	public void setFkCustomerId(String fkCustomerId) {
		this.fkCustomerId = fkCustomerId;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(String numOfDays) {
		this.numOfDays = numOfDays;
	}

	public String getMeterReader() {
		return meterReader;
	}

	public void setMeterReader(String meterReader) {
		this.meterReader = meterReader;
	}

	public String getMeterSerial() {
		return meterSerial;
	}

	public void setMeterSerial(String meterSerial) {
		this.meterSerial = meterSerial;
	}

	public String getMeterName() {
		return meterName;
	}

	public void setMeterName(String meterName) {
		this.meterName = meterName;
	}

	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	@Override
	public String toString() {
		return "MeterReadingSearchFilter [fkLocationId=" + fkLocationId + ", fkCustomerId=" + fkCustomerId + ", meterId=" + meterId + ", numOfDays=" + numOfDays + ", meterReader=" + meterReader + ", meterSerial=" + meterSerial + ", meterName=" + meterName + ", reading=" + reading + "]";
	}

}