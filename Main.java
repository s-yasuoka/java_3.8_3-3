public class Main{
  public static void main(String[] args){
    int isHungry = 1;
    String food = "いちご";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹いっぱいです。");
    } else {
      System.out.println("腹ペコです。");
      System.out.println(food + "をいただきます。");
    }
    System.out.println("ごちそうさまでした。");
  }
}