
package com.doublechaintech.retailscm.damagespace;
import com.doublechaintech.retailscm.AccessKey;


public class DamageSpaceTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
<<<<<<< HEAD
	static final String TABLE_NAME="damage_space_data";
=======
	public static final String TABLE_NAME="damage_space_data";
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	static final String COLUMN_ID = "id";
	static final String COLUMN_LOCATION = "location";
	static final String COLUMN_CONTACT_NUMBER = "contact_number";
	static final String COLUMN_TOTAL_AREA = "total_area";
	static final String COLUMN_LATITUDE = "latitude";
	static final String COLUMN_LONGITUDE = "longitude";
	static final String COLUMN_WAREHOUSE = "warehouse";
	static final String COLUMN_LAST_UPDATE_TIME = "last_update_time";
	static final String COLUMN_VERSION = "version";
 
<<<<<<< HEAD
	static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_LOCATION, COLUMN_CONTACT_NUMBER, COLUMN_TOTAL_AREA, COLUMN_LATITUDE, COLUMN_LONGITUDE, COLUMN_WAREHOUSE, COLUMN_LAST_UPDATE_TIME, 
		COLUMN_VERSION};
	static final String []NORMAL_CLOUMNS = {
=======
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_LOCATION, COLUMN_CONTACT_NUMBER, COLUMN_TOTAL_AREA, COLUMN_LATITUDE, COLUMN_LONGITUDE, COLUMN_WAREHOUSE, COLUMN_LAST_UPDATE_TIME, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
		COLUMN_LOCATION, COLUMN_CONTACT_NUMBER, COLUMN_TOTAL_AREA, COLUMN_LATITUDE, COLUMN_LONGITUDE, COLUMN_WAREHOUSE, COLUMN_LAST_UPDATE_TIME
		};
	
	
}


