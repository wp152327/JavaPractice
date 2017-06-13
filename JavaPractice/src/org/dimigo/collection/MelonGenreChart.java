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
 * org.dimigo.jeonyunminhandsome
 ^   |_JeonYunMinVeryHandsome
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author : whhh5108
 * @version : 1.0
 * 
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Music>> music = new HashMap<String, List<Music>>();
		
		List<Music> dance = new ArrayList();
		List<Music> balad = new ArrayList();
		
		balad.add(new Music("팔레트", "아이유"));
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));
		
		music.put("발라드", balad);
		music.put("댄스", dance);
		
		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMusic(music);
		
		dance.set(1, new Music("SIGNAL", "트와이스"));
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		printMusic(music);
		
		dance.remove(0);
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		printMusic(music);
		
		music.clear();
		System.out.println("-- << 리스트 전체 삭제 >> --");
		printMusic(music);
	}
	
	private static void printMusic(Map<String, List<Music>> map) {
		for(String genre : map.keySet()) {
			int i=1;
			System.out.println("[" + genre + "]");
			for(Music music : map.get(genre)) {
				System.out.println(i + ". " + music);
				i++;
			}
		}
		System.out.println();
	}

}
