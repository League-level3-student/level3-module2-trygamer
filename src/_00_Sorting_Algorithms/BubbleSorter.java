package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		System.out.println("t");
		int swap = 0;
		int a =0;
		while (a != -99) {
			swap=0;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {
					
					swap++;
					int el1 = array[i];
					int el2 = array[i + 1];

					array[i] = el2;
					array[i + 1] = el1;

				}

			}
			if (swap == 0) {
				a = -99;
		
			}
			display.updateDisplay();
		}

	}
	}
	

