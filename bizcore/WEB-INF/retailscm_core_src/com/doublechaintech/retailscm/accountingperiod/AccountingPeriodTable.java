
package com.doublechaintech.retailscm.accountingperiod;
import com.doublechaintech.retailscm.AccessKey;


public class AccountingPeriodTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
<<<<<<< HEAD
	static final String TABLE_NAME="accounting_period_data";
=======
	public static final String TABLE_NAME="accounting_period_data";
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
	static final String COLUMN_ID = "id";
	static final String COLUMN_NAME = "name";
	static final String COLUMN_START_DATE = "start_date";
	static final String COLUMN_END_DATE = "end_date";
	static final String COLUMN_ACCOUNT_SET = "account_set";
	static final String COLUMN_VERSION = "version";
 
<<<<<<< HEAD
	static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_NAME, COLUMN_START_DATE, COLUMN_END_DATE, COLUMN_ACCOUNT_SET, 
		COLUMN_VERSION};
	static final String []NORMAL_CLOUMNS = {
=======
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_NAME, COLUMN_START_DATE, COLUMN_END_DATE, COLUMN_ACCOUNT_SET, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
>>>>>>> 502e8b8dfc403300a992b5083e79c722e85d1854
		COLUMN_NAME, COLUMN_START_DATE, COLUMN_END_DATE, COLUMN_ACCOUNT_SET
		};
	
	
}


