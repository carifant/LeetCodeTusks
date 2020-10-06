package easy_tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int result = 0;
    char[] arr = s.toCharArray();
    List<Character> list = new ArrayList<>();
    for (int i = 0; i < arr.length - 1; i++) {
      if (map.get(arr[i]) < map.get(arr[i + 1])) {
        list.add(arr[i]);
      }
    }
    for (char x : arr) {
      result = result + map.get(x);
    }
    for (Character character : list) {
      result = result - map.get(character) * 2;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new RomanToInteger().romanToInt("IX"));
  }
}
