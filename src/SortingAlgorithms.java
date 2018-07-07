public class SortingAlgorithms {
	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
	}
	
	public static void printArray(String[] array) {
		for (String num : array) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
	}
	
	public static void selectionSort(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i] > array[j]) {
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	}
	
	public static void selectionSort(String[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i].compareTo(array[j]) > 0) {
	                String temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	}
	
	public static void sleepSort(int[] array) {
		int max = array[0];
		int min = array[array.length - 1];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];				
			} else if (array[i] < min) {
				min = array[i];				
			}
		}
		
		System.out.println("The max is " + max);
		System.out.println("The min is " + min);
		
		int timer = min;
		
		while (timer < max) {
			for (int i = min; i < array.length; i++)
					if (array[i] == timer)
						System.out.println(array[i]);
			
			timer++;
		}
		
		System.out.println(max);
	}
}
