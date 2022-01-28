package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import db.MySQL;
import models.Darbuotojai;


public class DarbuotojaiDAO{
	
	public DarbuotojaiDAO() {
		
	}
	
	public List<Darbuotojai> getDarbuotojas(){
		PreparedStatement s;
		try {
			s = MySQL.getConnection().prepareStatement("SELECT * FROM darbuotojai ORDER BY Name ASC");
			ResultSet r = s.executeQuery();
			List<Darbuotojai> darbuotojas = new LinkedList<>();
			while (r.next()) {
				darbuotojas.add(
						new Darbuotojai(
								r.getInt("id"), 
								r.getString("Name"), 
								r.getString("Surname"),
								r.getString("gender"), 
								r.getString("phone"), 
								r.getString("birthday"),
								r.getString("education"))
						);
			}
			return darbuotojas;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Darbuotojai getDarbuotojas(Integer id) {
		PreparedStatement s;
		try {
			s = MySQL.getConnection().prepareStatement("SELECT * FROM darbuotojai WHERE id=?");

			s.setInt(1, id);
			ResultSet r = s.executeQuery();
			r.next();
			return new Darbuotojai(r.getInt("id"), r.getString("Name"), r.getString("surname"),
					r.getString("gender"), r.getString("phone"), r.getString("birthday"),
					r.getString("education"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Darbuotojai[] getDarbuotojasArray() {
		List<Darbuotojai> darbuotojas=this.getDarbuotojas();
		Darbuotojai[] result=new Darbuotojai[darbuotojas.size()];
		int i=0;
		for(Darbuotojai c:darbuotojas) {
			result[i++]=c;
		}
		return result;
	}
	
	public void updateDarbuotojai(Darbuotojai darbuotojai) {
		// 
		PreparedStatement s;
		try {
			s = MySQL.getConnection().prepareStatement("UPDATE darbuotojai SET name=?, surname=?, gender=?, phone=?, birthday=?, education=? WHERE id=?");

			s.setString(1, darbuotojai.getName());
			s.setString(2, darbuotojai.getSurname());
			s.setString(3, darbuotojai.getGender());
			s.setString(4, darbuotojai.getPhone());
			s.setString(5, darbuotojai.getBirthday());
			s.setString(6, darbuotojai.getEducation());
			s.setInt(7, darbuotojai.getId());
			s.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}
	
	public void newDarbuotojai(Darbuotojai darbuotojai) {
		// 
		PreparedStatement s;
		try {
		
			s = MySQL.getConnection().prepareStatement("INSERT INTO darbuotojai (name, surname, gender, phone, birthday, education) VALUE (?, ?, ?, ?, ?, ?)");

			s.setString(1, darbuotojai.getName());
			s.setString(2, darbuotojai.getSurname());
			s.setString(3, darbuotojai.getGender());
			s.setString(4, darbuotojai.getPhone());
			s.setString(5, darbuotojai.getBirthday());
			s.setString(6, darbuotojai.getEducation());
//			s.setInt(7, darbuotojai.getId());
			s.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}
	
	
	public void deleteDarbuotojai(Darbuotojai darbuotojai) {
		// 
		PreparedStatement s;
		try {
		
			s = MySQL.getConnection().prepareStatement("DELETE FROM darbuotojai where id=?");

			s.setString(1, darbuotojai.getId().toString());

			s.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}
}