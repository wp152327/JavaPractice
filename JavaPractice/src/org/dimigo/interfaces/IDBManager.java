/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ IDBManager
 * 
 * 1. Overview : 
 * 2. Date : 2017. 5. 25.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject(String database) {
		IDBManager dbObject = null;
		
		if(database.equals(ORACLE_DATABASE)) {
			dbObject =  new OracleDB();
		} else {
			dbObject = new SybaseDB();
		}
		
		return dbObject;
	}
}
