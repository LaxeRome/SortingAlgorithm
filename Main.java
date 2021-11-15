import java.util.*;

public class Main {

  private static double[] num;

  private static int[] times;

  private static double[] adj;

  private static int nNums;

  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    nNums = sin.nextInt();
    num = new double[nNums];
    times = new int[nNums];
    for(int i = 0; i < nNums; i++) {
      num[i] = sin.nextDouble();
    }
    sort();
  }

  public static void sort() {
    adj = new double[num.length];
    for(int i = 0; i < num.length; i++) {
      if(i == 0) {
        adj[i] = num[i];
      } else if (num[i] > adj[i-1] && i >= 0) {

      }
    }
  }

  public static void printResult() {
    for(int i = 0; i < times.length; i++) {
      System.out.println(i+1 + ". " + times[i]);
    }
  }
}