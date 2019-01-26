package com.alliance.constants;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.boot.model.naming.Identifier;

import com.alliance.utility.StringUtility;

public class StringConstants {

	private static final String convertToSnakeCase(String columnName) {
		final String regex = "([a-z])([A-Z])";
		final String replacement = "$1_$2";
		return columnName.replaceAll(regex, replacement).toLowerCase();
	}

	public static final String EMPTY_STRING = "";

	public static final String START = "start";
	public static final String END = "end";
	public static final String QUERY_LIKE = "LIKE";
	public static final String QUERY_EQUALS = "=";

	public static final String[] customerSearchParameters = new String[] { "name", "street", "city", "state", "zip", "country", "email", "contact", "phone", "phoneType" };
	public static final HashMap<String, String> customerSearchParametersMap;
	static {
		customerSearchParametersMap = new HashMap<String, String>();
		for (String customerSearchParam : customerSearchParameters) {
			customerSearchParametersMap.put(customerSearchParam, convertToSnakeCase(customerSearchParam));
		}
	}

	public static final String[] meterReaderSearchParameters = new String[] { "id", "deviceId", "commProtocol", "modelNumber", "serialNumber", "imei", "fxtSerial", "simCard", "powerSupplySerialNumber", "installDate", "batteryDate", "readingTime", "ipAddress", "lastInternalTemp", "lastExternalTemp", "lastSignalStrength", "timezone", "acPower", "acPowerFailures", "locationLongitude", "locationLatitude", "meterCount", "version", "fkCustomerId", "fkLocationId" };

	public static final HashMap<String, String> meterReaderSearchParametersMap;
	static {
		meterReaderSearchParametersMap = new HashMap<String, String>();
		for (String meterReaderSearchParam : meterReaderSearchParameters) {
			meterReaderSearchParametersMap.put(meterReaderSearchParam, convertToSnakeCase(meterReaderSearchParam));
		}
	}

	public static final String[] meterSearchParameters = new String[] { "id", "version", "transmitterId", "name", "registeredSerialNumber", "bodySerialNumber", "description", "brand", "size", "scale", "installDate", "calibrationDate", "calibrationInterval", "calibrationDue", "units", "type", "fkMeterReaderId", "fkLocationId", "fkCustomerId" };
	public static final HashMap<String, String> meterSearchParametersMap;
	static {
		meterSearchParametersMap = new HashMap<String, String>();
		for (String meterSearchParam : meterSearchParameters) {
			meterSearchParametersMap.put(meterSearchParam, convertToSnakeCase(meterSearchParam));
		}
	}

	public static final String[] meterReadingSearchParameters = new String[] { "id", "fkTransmitterId", "imei", "ism", "lengthSerial", "messageLength", "meterId", "meterSerial", "meterType", "protocol", "reading", "rssi", "timestamp", "actualTimeReceived", "crc", "messageType", "packetId" };
	public static final HashMap<String, String> meterReadingSearchParametersMap;
	static {
		meterReadingSearchParametersMap = new HashMap<String, String>();
		for (String meterReadingSearchParam : meterReadingSearchParameters) {
			meterReadingSearchParametersMap.put(meterReadingSearchParam, convertToSnakeCase(meterReadingSearchParam));
		}
	}

	public static final String[] locationSearchParameters = new String[] { "id", "alternatePhone", "alternatePhoneType", "city", "country", "email", "fkCustomerId", "manager", "phone", "phoneType", "siteName", "siteNumber", "state", "street", "zip", };
	public static final HashMap<String, String> locationSearchParametersMap;
	static {
		locationSearchParametersMap = new HashMap<String, String>();
		for (String locationSearchParam : locationSearchParameters) {
			locationSearchParametersMap.put(locationSearchParam, convertToSnakeCase(locationSearchParam));
		}
	}

}
