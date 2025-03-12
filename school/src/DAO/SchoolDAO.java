package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import VO.School;

public class SchoolDAO extends DBconnect {
	
	public ArrayList<School> searchSelect(String searchWord){
		
		String sql=" select * from school where school_name like '%" + searchWord +  "%' ";
		ArrayList<School> list = new ArrayList<>();
		
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while( rs.next() ) {
				School data = new School(
						rs.getInt("id"), rs.getString("diff"), rs.getString("school_name"), rs.getString("address"),
						rs.getInt("post_code"), rs.getString("tel"), rs.getString("fax"), rs.getString("education_office"),
						rs.getString("public_private"), rs.getString("homepage")
						);
				list.add(data);
			}
			
		} catch (SQLException e) {
			System.out.println("학교 검색 실패");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void saveData(String id, int schoolNum) {
		// id 변수는 로그인 한 아이디, schoolNum 은 선택한 학교 번호(id)
		// insert, delete, update 는 executeUpdate 메서드를 사용하고
		// 결과는 없기에 ResultSet 으로 받지 않아도 된다
		// 내가 선택한 학교번호가 테이블에 저장 될 수 있게 saveData 메서드 내용 만들기
		
		String sql = "insert into my_school(member_id , school_id) values('" + id + "' , " + schoolNum + ")";
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("내 학원 등록 실패");
			e.printStackTrace();
		}
		
		
	}
	
	
}
