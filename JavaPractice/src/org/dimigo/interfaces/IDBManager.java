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
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : yoojin
 * @version : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";

	void insert();

	void search();

	void update();

	void delete();

	static IDBManager getDBObject(String database) {
		if (ORACLE_DATABASE.equals(database)) {
			return new OracleDB();
		} else if (SYBASE_DATABASE.equals(database)) {
			return new SybaseDB();
		} else
			return null;
	}
}
