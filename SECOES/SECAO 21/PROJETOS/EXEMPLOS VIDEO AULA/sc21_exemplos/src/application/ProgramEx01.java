package application;

import java.sql.Connection;

import db.DB;

public class ProgramEx01 {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		System.out.println("TESTE");
		DB.closeConnection();
		System.out.println("RODEI");
	}

}
