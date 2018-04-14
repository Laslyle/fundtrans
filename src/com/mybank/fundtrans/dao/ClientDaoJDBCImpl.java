package com.mybank.fundtrans.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mybank.fundtrans.domain.Client;
import com.mybank.fundtrans.domain.Fund;
import com.mybank.fundtrans.util.JDBCUtil;
import com.mysql.jdbc.EscapeTokenizer;

public class ClientDaoJDBCImpl implements ClientDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	public ClientDaoJDBCImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		List<Client> clients=new ArrayList<Client>();
		conn=JDBCUtil.getConnection();
		String sql="select * from client";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				String id=rs.getString("idcard");
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				Integer phone=rs.getInt("phone");
				String address=rs.getString("address");
				String email =rs.getString("email");
				String hobby=rs.getString("hobby");
				Date createTime=rs.getDate("createTime");
				Client client=new Client(id,name,sex,phone,address,email,hobby,createTime);
				clients.add(client);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, pstmt, conn);
		}
				
		return clients;
	}

	@Override
	public void insert(Client client) {
		// TODO Auto-generated method stub
           conn=JDBCUtil.getConnection();
           String sql="insert into client (name,sex,phone,address,email,hobby,createTime,idcard) values(?,?,?,?,?,?,?,?)";
           try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,client.getName());
			pstmt.setString(2,client.getSex());
			pstmt.setInt(3, client.getPhone());
			pstmt.setString(4,client.getAddredss());
			pstmt.setString(5,client.getEmail());
			pstmt.setString(6,client.getHobby());
			java.sql.Date date=new java.sql.Date(client.getCreateTime().getTime());
			pstmt.setDate(7,date );
			pstmt.setString(8,client.getIdcard() );
			int rs=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			JDBCUtil.close(rs, pstmt, conn);
		}
           }

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public Fund findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
