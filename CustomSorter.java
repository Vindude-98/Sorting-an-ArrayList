import java.util.*;

public class CustomSorter {

	public static <T> void selectionSort(List<T> list, Comparator<? super T> comparator) {
		int n = list.size();
		
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				T temp = list.get(i);
				list.set(i,  list.get(minIndex));
				list.set(minIndex, temp);
			}
		}
	}
}
