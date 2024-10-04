import java.util.TreeMap;

public class MyCalendar729a {
  TreeMap<Integer, Integer> calendar;

  MyCalendar729a() {
    calendar = new TreeMap<>();
  }

  public boolean book(int start, int end) {
    Integer prev = calendar.floorKey(start);
    Integer next = calendar.ceilingKey(start);

    if ((prev == null || calendar.get(prev) <= start) && (next == null || end <= next)) {
      calendar.put(start, end);
      return true;
    }
    return false;
  }
}
