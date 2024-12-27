package org.techhub.repository;
import java.sql.*;

public class DBSTATE {
	DBConfig config = DBConfig.getInstance();
	protected Connection conn = config.getConn();
	protected PreparedStatement stmt = config.getStatement();
	protected ResultSet rs = config.getResultSet();
}
