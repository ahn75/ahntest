package studentschool;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class School {
	// 
	Student[] students;
	
	// 
	public int getStudentCount() {
		students = new Student [10];
		
		return 0;
	}
	
	public static void main(String args[]) {
	    
	        Map<Integer,String> map = new HashMap<Integer,String>();
	        
	        map.put(01, "양효션");
	        map.put(02, "홍용표");
	        map.put(03, "황진호");
	        map.put(04, "김동진");
	        map.put(05, "전경수");
	        
	        System.out.println(map);
	        System.out.println(map.get(4));
	        
	        Map<Integer,String> sortedMap = new TreeMap<Integer,String>(map);
	        System.out.println(sortedMap);
	    
	 }
	
	
/*	
	public static void main(String[] args) {  
		School s1 = new School();
		School s2 = new School();
		s1.getStudentCount();
		s2.getStudentCount();
		// School.getStudentCount();

		
	}
*/
	
//	class Student {
//		int id;
//	}

}
