package chap02;

import java.util.Scanner;

public class Main03 {
  public static void main(String[] args) {
    System.out.println("あなたの名前は？");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();

    System.out.println("あなたの年齢は？");
    int age = scan.nextInt();

    System.out.println
    ("ようこそ、" + age + "歳の" + name + "さん");
  }
}