package daily.solutions;

import daily.util.SortBase;

/**
 * Created by james on 1/19/2017.
 */
public class QuickSort extends SortBase {
    public void quickSort(String list[]) {
        quickSort(list, 0, list.length-1);
    }
	
	private void quickSort(String[] list, int from, int pivot) {
		if ( pivot - from >= 2 ) {
			int to = pivot-1;
			int fr = from;
			
			while ( fr < to ) {
				while ( fr < to && list[fr].compareTo(list[pivot]) < 0 ) ++fr;
				while ( fr < to && list[to].compareTo(list[pivot]) >= 0 ) --to;
				
				if ( fr < to ) {
					swap(list, fr, to);
				}
			}
			
			swap(list, to, pivot);
			quickSort(list, from, to-1);
			quickSort(list, to+1, pivot);
		}
	}
}
