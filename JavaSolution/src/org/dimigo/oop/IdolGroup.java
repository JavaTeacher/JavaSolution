package org.dimigo.oop;

public class IdolGroup {
	
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] memberName = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리", "그외"}
		};

		for(int i=0; i<groupName.length; i++) {
			System.out.println("<< " + groupName[i] + " >>");
			
			for(int j=0; j<memberName[i].length; j++) {
				System.out.println(memberName[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
