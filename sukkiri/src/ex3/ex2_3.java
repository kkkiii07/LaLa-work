package ex3;
public class ex2_3 {
  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなた名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();

    System.out.println("あなた年齢を入力してください");
    int age = new java.util.Scanner(System.in).nextInt();
    // int age = Integer.parseInt(ageString);

    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    
    System.out.println("占いの結果が出ました！");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1:大吉 2:中吉 3:小吉 4:凶");
  }
}