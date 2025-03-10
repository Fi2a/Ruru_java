package collection7;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(100, "이순신"); 
		tree.put(341, "김유신"); 
		tree.put(541, "장영실"); 
		tree.put(874, "나문희"); 
		tree.put(241, "이순재"); 
		tree.put(234, "박하선"); 
		
		System.out.println( tree );
		
		// TreeMap 검색 메서드 - key 기준
		
		System.out.println( tree.headMap(300) ); // 값보다 작은 모든 key
		System.out.println( tree.tailMap(500) ); // 값보다 큰 모든 key
		
		System.out.println( tree.firstKey() ); 	 // 첫번쨰 key
		System.out.println( tree.firstEntry() ); // 첫번째 key, value 
		System.out.println( tree.lastKey() );
		System.out.println( tree.lastEntry() );
		
		System.out.println( tree.higherKey(345) );
		System.out.println( tree.higherEntry(345) );
		System.out.println( tree.lowerKey(300) );
		System.out.println( tree.lowerEntry(500) );
		
		System.out.println( tree.ceilingKey(342) );
		System.out.println( tree.ceilingEntry(342) );
		System.out.println( tree.floorKey(240) );
		System.out.println( tree.floorEntry(240) );
		
		System.out.println( tree.subMap(200, 600) );
		
		
		
	}
	
}
