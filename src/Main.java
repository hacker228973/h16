import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new HashMap<String, LocalDate>();
        map.put("Петя", LocalDate.of(1999, 5, 1));
        map.put("Петя2", LocalDate.of(1999, 5, 1));
        map.put("Петя3", LocalDate.of(1999, 5, 1));
        map.put("Петя4", LocalDate.of(1999, 6, 1));
        map.put("Петя5", LocalDate.of(1999, 6, 1));
        map.put("Петя6", LocalDate.of(1999, 6, 1));
        map.put("Петя7", LocalDate.of(1999, 7, 1));
        map.put("Петя8", LocalDate.of(1999, 7, 1));
        map.put("Петя9", LocalDate.of(1999, 7, 1));
        map.put("Сталин", LocalDate.of(1878, 12, 18));


        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            LocalDate date = pair.getValue();
            int month = date.getMonthValue();

            if (month == 5 || month == 6 || month == 7)
                iterator.remove();
        }

    }
}
