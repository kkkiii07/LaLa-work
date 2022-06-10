package ex03;

public class ex3_3_5 {
  public static void main(String[] args) {
    System.out.println("文字を入力してください");
    String str1 = new java.util.Scanner(System.in).nextLine();
    System.out.println("もうひとつ文字を入力してください");
    String str2 = new java.util.Scanner(System.in).nextLine();

    if (str1.equals(str2)) {
      System.out.println("同じです");
    } else {
      System.out.println("違います");
    }
  }
}