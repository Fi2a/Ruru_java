package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMt {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("수박", 15000);
		map.put("바나나", 5400);
		map.put("앵두", 2300);
		map.put("딸기", 12400);

		System.out.println(map);
		
		map.put("수박", 19000);
		System.out.println(map);
		
		if( map.containsKey("수박") )
			System.out.println("수박이 key로 사용중");
		// 포함여부는 contains 에 key , value 가 따로 있다.
		
		System.out.println( map.keySet() );
		System.out.println( map.values() );
		
		System.out.println( map.get("앵두") );
		System.out.println( map.get("참외") );
		
		// 맵에 저장되어있는 특정 key 의 value 값 변경
		map.put("앵두", 3100);
		System.out.println( map );
		
		map.replace("앵두", 4300);
		System.out.println( map );
		// put 메서드는 새로운 값 저장 또는 벼녁
		
		map.put("토마토", 5600);
		System.out.println(map);
		
		map.replace("구아바",9800);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println( map.entrySet() );
		
		for( Entry<String, Integer> ent : map.entrySet() ) {
			System.out.println( ent.getKey() +" " + ent.getValue() );
		}
		
		HashMap<String, Active> cmd = new HashMap<>();
		cmd.put("회원가입", new Member() );
		cmd.put("게시판", new Board() );
		cmd.put("게임", new Game() );
		
		String command = "게시판";
		
		Active action = cmd.get(command);
		action.save();
		
		
		
		
	}

}

/*
	Map  - key 와 value 로 이루어진 구조
		   key 는 중복 불가, value 는 중복 가능
		   조회방법은 key 를 통해 value 찾기
		   
		   HashMap , TreeMap
*/