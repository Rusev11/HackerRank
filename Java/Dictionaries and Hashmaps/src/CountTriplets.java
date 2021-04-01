import java.util.*;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long length = Long.parseLong(input[0]);
        long r = Long.parseLong(input[1]);
        List<Long> arrayList = new ArrayList<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            arrayList.add(Long.parseLong(number));
        }
        System.out.println(countTriplets(arrayList, r));
    }

    static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        Map<Long, Integer> occurrence = new LinkedHashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (occurrence.containsKey(arr.get(i))) {
                occurrence.put(arr.get(i), occurrence.get(arr.get(i)) + 1);
                continue;
            }
            occurrence.put(arr.get(i), 1);
        }
        Integer counts = 0;
        for (Long entry : occurrence.keySet()) {
            Integer countFirst = occurrence.get(entry);
            Integer countSecond = occurrence.get(entry * r);
            Integer countThird = occurrence.get(entry * r * r);
            if (countFirst != null && countSecond != null && countThird != null) {
                counts += (countFirst * countSecond * countThird);
            }

        }
        return counts;
    }

}
