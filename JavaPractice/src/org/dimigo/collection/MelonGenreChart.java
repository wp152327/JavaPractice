/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonGenreChart
 * 
 * 1. Overview : 
 * 2. Date : 2017. 6. 5.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		List<Music> ballede = new ArrayList<>(), dance = new ArrayList<>();
		ballede.add(new Music("팔레트","아이유"));
		dance.add(new Music("I LUV IT","PSY"));
		dance.add(new Music("맞지?","언니쓰"));
		
		map.put("발라드",ballede);
		map.put("댄스",dance);
		
		System.out.println("<< 멜론 장르별 차트>>");
		printMap(map);
		
		System.out.println("<< 댄스 2위 곡 변경>>");
		dance.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("<<댄스 1위 곡 삭제>>");
		dance.remove(0);
		printMap(map);
		
		System.out.println("<<전체 리스트 삭제");
		map.clear();
		printMap(map);

	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String str : map.keySet()){
			System.out.println("["+str+"]");
			int i = 1;
			for(Music music : map.get(str)){
				
			}
		}
		System.out.println();
	}

}
