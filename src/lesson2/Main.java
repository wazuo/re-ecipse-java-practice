package lesson2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの名前を入力して下さい。");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}

}
