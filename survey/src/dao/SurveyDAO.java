package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import vo.Survey;

public class SurveyDAO extends DBconnect {
	
	
	public ArrayList<Survey> question() {
		
		ArrayList<Survey> survey = new ArrayList<>();
		
		String sql = "select * from survey";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while( rs.next() ) {
				Survey sv = new Survey( rs.getInt("id"), rs.getString("question") );
				survey.add(sv);				
			}
		} catch (SQLException e) {
			System.out.println("문제 출력 실패");
			e.printStackTrace();
		}
		
		return survey;
		
	}
	
	

	
	
	
	
}
