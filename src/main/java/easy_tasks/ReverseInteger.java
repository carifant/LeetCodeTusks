package easy_tasks;

public class ReverseInteger {

  int newMethod(int x) {
    String s = Integer.toString(x);
    if (s.startsWith("-")) {
      String split = s.substring(1);
      StringBuilder stringBuilder = new StringBuilder(split);
      stringBuilder.reverse();
      if (Long.parseLong(stringBuilder.toString()) >= 2147483647 || Long.parseLong(stringBuilder.toString()) <= -2147483648 ) {
        return 0;
      }
      int result = Integer.parseInt(String.valueOf(stringBuilder));
      return result * -1;
    } else {

      StringBuilder stringBuilder = new StringBuilder(s);
      stringBuilder.reverse();
      if (Long.parseLong(stringBuilder.toString()) >= 2147483647 || Long.parseLong(stringBuilder.toString()) <= -2147483648 ) {
        return 0;
      }
      return Integer.parseInt(String.valueOf(stringBuilder));
    }
  }
}
