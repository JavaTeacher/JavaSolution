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
 *   |_ MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		// HashMap 생성
		Map<String, List<Music>> map = new HashMap<>( );
		
		// 발라드용 ArrayList 생성
		List<Music> ballad = new ArrayList<>();
		ballad.add(new Music("팔레트", "아이유"));
		
		map.put("발라드", ballad);
		
		// 댄스용 ArrayList 생성
		List<Music> dance = new ArrayList<>();
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));

		map.put("댄스", dance);
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
			
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		dance.set(1, new Music("SIGNAL", "트와이스"));
		
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		dance.remove(0);
		
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
	}

	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			List<Music> list = map.get(key);
			
			int no = 0;
			for (Music m : list) {
				System.out.printf("%d. %s\n", ++no, m);
			}
		}
		System.out.println();		
	}
}
