package ch07_08;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

	public static void main(String[] args) {
		//ArrayList 생성
		List<Book> list = new ArrayList<>();
		
		Book b1 = new Book();
		b1.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();
				
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println("도서멍\t출판사\t단가\t수량\t금액");
		for(int i=0;i<list.size();i++) {
			Book b = list.get(i);
			System.out.println(b.getBookName()+"\t"+
			b.getPress()+"\t"+b.getPrice()+"\t"+
			b.getAmount()+"\t"+b.getMoney());
		}
			
	}

}
