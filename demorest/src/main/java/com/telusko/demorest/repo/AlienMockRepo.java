package com.telusko.demorest.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.*;


import com.telusko.demorest.model.Alien;

public class AlienMockRepo {

	List<Alien> aliens;
	
	Connection con;
	
	public AlienMockRepo() {
		
		String url = "jdbc:mysql://localhost:3306/restdb";
		String uname = "root";
		String pwd = "rootpassword";
		
		try {
			
		   Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.out.println("inside alien mock repo");
		aliens = new ArrayList<Alien>();
		Alien alien = new Alien();
		alien.setId(1);
		alien.setName("asmita");
		alien.setPoints(5);
		
		Alien alien2 = new Alien();
		alien2.setId(2);
		alien2.setName("anirban");
		alien2.setPoints(10);
		
		aliens.add(alien);
		aliens.add(alien2);*/
	}
	
	public List<Alien> getAliens(){
		
		List<Alien> aliens = new ArrayList<Alien>();
		String sql = "select * from alien";
		
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				aliens.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return aliens;
	}
	
	public Alien getAlienById(int id) {
		
		//List<Alien> aliens = new ArrayList<Alien>();
		String sql = "select * from alien where aid = ?";
		Alien a = new Alien();
		PreparedStatement st;
		try {
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				
			while(rs.next()) {
				
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
			}
			}else {
				a=null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return a;
	}

	public void createAlien(Alien a) {
		
		String sql = "insert into alien values(?,?,?)";
		
		PreparedStatement st;
		try {
			st = con.prepareStatement(sql);
			st.setInt(1, a.getId());
			st.setString(2, a.getName());
			st.setInt(3, a.getPoints());
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//return a;
	}
	
	public void updateAlien(Alien a) {
		String sql = "update alien set aname = ?, points = ? where aid=?";
		PreparedStatement st;
		try {
			st = con.prepareStatement(sql);
			
			st.setString(1, a.getName());
			st.setInt(2, a.getPoints());
			st.setInt(3, a.getId());
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteAlien(int aid) {
		// TODO Auto-generated method stub
		String sql = "delete from alien where aid = ?";
		PreparedStatement st;
		try {
			st = con.prepareStatement(sql);
			
			
			st.setInt(1 , aid);
			
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
