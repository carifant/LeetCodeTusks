package easy_tasks;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    List<Integer> list = new ArrayList<>();

    while (x != 0) {
      list.add(x % 10);
      x = x / 10;
    }
    int index = 1;
    for (int i = 0; i < list.size() / 2; i++) {
      if (!list.get(i).equals(list.get(list.size() - index))) {
        return false;
      } else {
        index++;
      }
    }return true;
  }
}
