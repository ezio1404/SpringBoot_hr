package com.alliance.model;

public class MeterReaderSearchFilter extends SearchFilter {
	private String id;
	private String deviceId;
	private String commProtocol;
	private String modelNumber;
	private String serialNumber;
	private String imei;
	private String fxtSerial;
	private String simCard;
	private String powerSupplySerialNumber;
	private String installDate;
	private String batteryDate;
	private String readingTime;
	private String ipAddress;
	private String lastInternalTemp;
	private String lastExternalTemp;
	private String lastSignalStrength;
	private String timezone;
	private String acPower;
	private String acPowerFailures;
	private String locationLongitude;
	private String locationLatitude;
	private String meterCount;
	private String version;
	private String fkCustomerId;
	private String fkLocationId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCommProtocol() {
		return commProtocol;
	}

	public void setCommProtocol(String commProtocol) {
		this.commProtocol = commProtocol;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getFxtSerial() {
		return fxtSerial;
	}

	public void setFxtSerial(String fxtSerial) {
		this.fxtSerial = fxtSerial;
	}

	public String getSimCard() {
		return simCard;
	}

	public void setSimCard(String simCard) {
		this.simCard = simCard;
	}

	public String getPowerSupplySerialNumber() {
		return powerSupplySerialNumber;
	}

	public void setPowerSupplySerialNumber(String powerSupplySerialNumber) {
		this.powerSupplySerialNumber = powerSupplySerialNumber;
	}

	public String getInstallDate() {
		return installDate;
	}

	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}

	public String getBatteryDate() {
		return batteryDate;
	}

	public void setBatteryDate(String batteryDate) {
		this.batteryDate = batteryDate;
	}

	public String getReadingTime() {
		return readingTime;
	}

	public void setReadingTime(String readingTime) {
		this.readingTime = readingTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLastInternalTemp() {
		return lastInternalTemp;
	}

	public void setLastInternalTemp(String lastInternalTemp) {
		this.lastInternalTemp = lastInternalTemp;
	}

	public String getLastExternalTemp() {
		return lastExternalTemp;
	}

	public void setLastExternalTemp(String lastExternalTemp) {
		this.lastExternalTemp = lastExternalTemp;
	}

	public String getLastSignalStrength() {
		return lastSignalStrength;
	}

	public void setLastSignalStrength(String lastSignalStrength) {
		this.lastSignalStrength = lastSignalStrength;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getAcPower() {
		return acPower;
	}

	public void setAcPower(String acPower) {
		this.acPower = acPower;
	}

	public String getAcPowerFailures() {
		return acPowerFailures;
	}

	public void setAcPowerFailures(String acPowerFailures) {
		this.acPowerFailures = acPowerFailures;
	}

	public String getLocationLongitude() {
		return locationLongitude;
	}

	public void setLocationLongitude(String locationLongitude) {
		this.locationLongitude = locationLongitude;
	}

	public String getLocationLatitude() {
		return locationLatitude;
	}

	public void setLocationLatitude(String locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

	public String getMeterCount() {
		return meterCount;
	}

	public void setMeterCount(String meterCount) {
		this.meterCount = meterCount;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFkCustomerId() {
		return fkCustomerId;
	}

	public void setFkCustomerId(String fkCustomerId) {
		this.fkCustomerId = fkCustomerId;
	}

	public String getFkLocationId() {
		return fkLocationId;
	}

	public void setFkLocationId(String fkLocationId) {
		this.fkLocationId = fkLocationId;
	}

	@Override
	public String toString() {
		return "MeterReaderSearchFilter [id=" + id + ", deviceId=" + deviceId + ", commProtocol=" + commProtocol + ", modelNumber=" + modelNumber + ", serialNumber=" + serialNumber + ", imei=" + imei + ", fxtSerial=" + fxtSerial + ", simCard=" + simCard + ", powerSupplySerialNumber=" + powerSupplySerialNumber + ", installDate=" + installDate + ", batteryDate=" + batteryDate + ", readingTime=" + readingTime + ", ipAddress=" + ipAddress + ", lastInternalTemp=" + lastInternalTemp
			+ ", lastExternalTemp=" + lastExternalTemp + ", lastSignalStrength=" + lastSignalStrength + ", timezone=" + timezone + ", acPower=" + acPower + ", acPowerFailures=" + acPowerFailures + ", locationLongitude=" + locationLongitude + ", locationLatitude=" + locationLatitude + ", meterCount=" + meterCount + ", version=" + version + ", fkCustomerId=" + fkCustomerId + ", fkLocationId=" + fkLocationId + "]";
	}

}
