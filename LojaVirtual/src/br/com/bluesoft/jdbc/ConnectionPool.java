package br.com.bluesoft.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.hsqldb.jdbc.JDBCPool;

public class ConnectionPool {

	 private JDBCPool dataSource;

	ConnectionPool() {
        JDBCPool pool = new JDBCPool();
        pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
        pool.setUser("SA");
        pool.setPassword("");
        this.dataSource = pool;
        
    }
	
	 Connection getConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
		return connection;
	}

}
