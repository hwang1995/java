package ch18.exam12;

import java.io.Console;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		System.out.print("아이디를 입력하세요 : " );
		String name = console.readLine();
		System.out.print("비밀번호를 입력하세요 : " );
		String pw = new String(console.readPassword());
		System.out.println(name + " " + pw);
	}

}
