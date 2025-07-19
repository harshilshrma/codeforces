import java.util.Scanner;

public class StringTask {
  public static boolean isVowel(char c) {
    if (
      c == 'a' || c == 'A' ||
      c == 'e' || c == 'E' ||
      c == 'i' || c == 'I' ||
      c == 'o' || c == 'O' ||
      c == 'u' || c == 'U') return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder();
    String s = sc.nextLine();
    for (char c : s.toCharArray()) {
      if (isVowel(c)) continue;
      else {
        str.append('.');
        str.append(Character.toLowerCase(c));
      }
    }

    System.out.println(str.toString());
    sc.close();
  }
}