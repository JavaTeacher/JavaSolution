/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * <pre>
 * org.dimigo.io
 * |_ ArakoMenu
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 18.
 * </pre>
 *
 * @author : teacher
 * @version : 1.0
 */
public class ArakoMenu {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			 BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) {
		
			String data;
			while ( (data = br.readLine()) != null ) {
				writer.write(data);
				writer.newLine();
			}
			
			// 버퍼 비우기
			writer.flush();
			
			while ( (data = reader.readLine()) != null ) {
				System.out.println(data);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
