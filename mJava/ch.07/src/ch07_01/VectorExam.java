package ch07_01;

import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		System.out.println("초기사이즈:" + v.capacity());
		v.add("first"); v.add(2); v.add(3.5);
		v.add(4);v.add(5);v.add(6);
		v.add(7);v.add(8);v.add(9);
		v.add(10);v.add(11);
		System.out.println("변경된 사이즈:" + v.capacity());
		
		System.out.println("초기 데이터");
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
		
	}

}
