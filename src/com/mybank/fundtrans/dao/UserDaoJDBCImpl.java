package com.mybank.fundtrans.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mybank.fundtrans.util.JDBCUtil;

public class UserDaoJDBCImpl implements UserDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	@Override
	public boolean findIt(String userName, String password) {
		// TODO Auto-generated method stub
		boolean flag=false;
		conn=JDBCUtil.getConnection();
		String sql="select * from user where name=? and password=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			JDBCUtil.close(rs, pstmt, conn);
		}

		return flag;
	}

}
