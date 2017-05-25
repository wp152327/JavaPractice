/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ DBTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 5. 25.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDBManager database = IDBManager.getDBObject("SYBASE");
		System.out.println("<< 변경 전 >>");
		crud(database);
		System.out.println();
		database = IDBManager.getDBObject("ORACLE");
		System.out.println("<< 변경 후 >>");
		crud(database);
	}
	
	private static void crud(IDBManager db) {
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
