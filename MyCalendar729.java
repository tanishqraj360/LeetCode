import java.util.ArrayList;
import java.util.List;

public class MyCalendar729 {
  List<int[]> calendar;

  MyCalendar729() {
    calendar = new ArrayList<>();
  }

  public boolean book(int start, int end) {
    for (int[] iv : calendar) {
      if (iv[0] < end && start < iv[1]) {
        return false;
      }
    }

    calendar.add(new int[] { start, end });
    return true;
  }
}
