/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 14.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public interface IDBManager {
	
	// DATABASE 종류 상수
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";

	// CRUD 명세 : 실제로는 매개변수와 리턴타입이 주어짐
	void insert();
	
	void search();
	
	void update();
	
	void delete(); 
	
	static IDBManager getDBObject(String database) {
		if (database == null || database.equals("")) return null;
		
		if (database.equals(ORACLE_DATABASE)) {
			return new OracleDB();
		} else if (database.equals(SYBASE_DATABASE)) {
			return new SybaseDB();
		}
		
		return null;
	}
}
