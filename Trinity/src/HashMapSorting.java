import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	private final int value;

	public HashMapSorting(int val) {
		value = val;
	}

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Vikram", 22);
		map.put("Preeti", 8);
		map.put("Ashish", 18);
		map.put("Rony", 5);
		map.put("Shilpa", 21);
		map.put("Bhavina", 7);
		Collections.synchronizedMap(map);

		TreeMap<String, Integer> treeMap = new TreeMap<>(map);
		System.out.println(treeMap);

		Set<Entry<String, Integer>> mapData = map.entrySet();
		List<Entry<String, Integer>> arrayList = new ArrayList<>(mapData);
		Collections.sort(arrayList, new Comparator<Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int val1 = o1.getValue();
				int val2 = o2.getValue();
				return val1 > val2 ? 1 : -1;
			}

		});
		System.out.println(arrayList);
		Map<String, Integer> sortedMap = new LinkedHashMap();
		for (Entry<String, Integer> entry : arrayList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap);
	}

}
