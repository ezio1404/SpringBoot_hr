package com.alliance.model;

public class MeterSearchFilter extends SearchFilter {
	private String id;
	private String version;
	private String transmitterId;
	private String name;
	private String registeredSerialNumber;
	private String bodySerialNumber;
	private String description;
	private String brand;
	private String size;
	private String scale;
	private String installDate;
	private String calibrationDate;
	private String calibrationInterval;
	private String calibrationDue;
	private String units;
	private String type;
	private String fkMeterReaderId;
	private String fkLocationId;
	private String fkCustomerId;
	private String meterId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTransmitterId() {
		return transmitterId;
	}

	public void setTransmitterId(String transmitterId) {
		this.transmitterId = transmitterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisteredSerialNumber() {
		return registeredSerialNumber;
	}

	public void setRegisteredSerialNumber(String registeredSerialNumber) {
		this.registeredSerialNumber = registeredSerialNumber;
	}

	public String getBodySerialNumber() {
		return bodySerialNumber;
	}

	public void setBodySerialNumber(String bodySerialNumber) {
		this.bodySerialNumber = bodySerialNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getInstallDate() {
		return installDate;
	}

	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}

	public String getCalibrationDate() {
		return calibrationDate;
	}

	public void setCalibrationDate(String calibrationDate) {
		this.calibrationDate = calibrationDate;
	}

	public String getCalibrationInterval() {
		return calibrationInterval;
	}

	public void setCalibrationInterval(String calibrationInterval) {
		this.calibrationInterval = calibrationInterval;
	}

	public String getCalibrationDue() {
		return calibrationDue;
	}

	public void setCalibrationDue(String calibrationDue) {
		this.calibrationDue = calibrationDue;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFkMeterReaderId() {
		return fkMeterReaderId;
	}

	public void setFkMeterReaderId(String fkMeterReaderId) {
		this.fkMeterReaderId = fkMeterReaderId;
	}

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

	@Override
	public String toString() {
		return "MeterSearchFilter [id=" + id + ", version=" + version + ", transmitterId=" + transmitterId + ", name=" + name + ", registeredSerialNumber=" + registeredSerialNumber + ", bodySerialNumber=" + bodySerialNumber + ", description=" + description + ", brand=" + brand + ", size=" + size + ", scale=" + scale + ", installDate=" + installDate + ", calibrationDate=" + calibrationDate + ", calibrationInterval=" + calibrationInterval + ", calibrationDue=" + calibrationDue + ", units=" + units
			+ ", type=" + type + ", fkMeterReaderId=" + fkMeterReaderId + ", fkLocationId=" + fkLocationId + ", fkCustomerId=" + fkCustomerId + ", meterId=" + meterId + "]";
	}

}
