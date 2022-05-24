package chap02;

public class Main {
  public static void main(String[] args) {
    // Random rnd = new Random();
    // int r = rnd.nextInt(5);
    int r = new java.util.Random().nextInt(-10);
    System.out.println("あなたは" + r + "歳ですね。");
  }
}