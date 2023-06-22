package while_;

import java.util.Scanner;

public class TestClass09 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name1, name2;
	System.out.print("1이름입력 : ");
	name1 = input.next();
	System.out.print("2이름입력 : ");
	name2 = input.next();
	
	System.out.println("name1 == name2 : "+(name1.equals(name2)));
	if(name1.equals(name2)) {
		System.out.println("이름이 같다");
	}else {
		System.out.println("이름이 다르다");
	}
}
}
