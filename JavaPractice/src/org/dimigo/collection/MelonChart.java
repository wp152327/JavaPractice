/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonChart
 * 
 * 1. Overview : 
 * 2. Date : 2017. 6. 12.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);
		
		list.add(1, new Music("SIGNAL", "트와이스"));
		System.out.println("-- << 2위 곡 추가 >> -- ");
		printList(list);
		
		Music a = list.get(1);
		Music b = list.get(2);
		list.set(2, a);
		list.set(1, b);
		System.out.println("-- << 3위 곡 변경 >> --");
		printList(list);
		
		list.remove(1);
		System.out.println("-- << 2위 곡 삭제 >> --");
		printList(list);
		
		list.removeAll(list);
		System.out.println("-- << 전체 리스트 제거 >> --");
		printList(list);
	}

	public static void printList(List<Music> list) {
		int i = 1;
		
		for(Music item : list) {
			System.out.println(i + ". " + item);
			i++;
		}
		
		System.out.println();
	}
}
