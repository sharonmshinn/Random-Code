import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers would you like to sort?: ");
		int index = scanner.nextInt();
		System.out.println("Enter " + index + " numbers: ");
		
		int[] unsorted = new int[index];
		for(int i=0; i<index; i++) {
			unsorted[i] = scanner.nextInt();
		}
		
		
		for(int i=1; i<index; i++) {
			int compare = unsorted[i];
			int j = i -1;
			while(j>=0 && unsorted[j] > compare) {
				unsorted[j+1] = unsorted[j];
				j = j-1;
			}
			unsorted[j+1] = compare;
		}
		
		
		System.out.println("Sorted numbers: ");
		for(int i=0; i<index; i++) {
			System.out.println(unsorted[i]);
		}
    scanner.close();
	}
}
