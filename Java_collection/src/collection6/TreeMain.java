package collection6;

import java.util.TreeSet;

public class TreeMain {
	
	public static void main(String[] args) {
	
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(35); tree.add(41); tree.add(29);  
		tree.add(9); tree.add(15); tree.add(20);  
		tree.add(56); tree.add(49); tree.add(11);  
		tree.add(17); tree.add(89); tree.add(39);  
		
		System.out.println(tree);
		
		System.out.println( tree.headSet(20) );
		System.out.println( tree.tailSet(20) );
		
		// 특정 값 기준으로 작은 데이터 모두 찾기 - headSet
		// 특정 값 기준으로 큰 데이터 모두 찾기 - tailSet
		
		System.out.println( tree.first() ); // 첫번쨰 값
		System.out.println( tree.last() );  // 마지막 값
		
		System.out.println( tree.higher(29) ); 
		System.out.println( tree.higher(100) );
		// higher - 해당 값 보다 큰 값중에 가장 가까운 값 하나 , 없으면 null
		
		System.out.println( tree.lower(30) );
		System.out.println( tree.lower(6) );
		// lower - higher 의 반대
		
		System.out.println( tree.ceiling(39) ); 
		// higher - 초과, ceiling - 이상
		
		System.out.println( tree.floor(17) );
		// lower - 미만 , floor - 이하
		
		System.out.println( tree.subSet(17, 41) );
		// subSet - 범위 지정하여 검색
		// subSet(a,b) - a 이상 b 미만
		
		
	}
	
}
