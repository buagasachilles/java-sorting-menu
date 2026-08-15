import java.util.Scanner;
public class Activity1{
	public static void main(String[] args){
		final int MAXSIZE = 5;
		int[] nums = new int[MAXSIZE];
		Activity1Object ar = new Activity1Object();
		Scanner sc = new Scanner(System.in);

		int choice = 0, selectedSort = 0;
		int[] bubble = null;
		int[] insertion = null;
		
		while(choice != 5){
				System.out.println("- - - - - - - - - - -");
				System.out.println("1 - POPULATE\n2 - PRINT\n3 - BUBBLE SORT\n4 - INSERTION SORT\n5 - EXIT");
				System.out.println("- - - - - - - - - - -");
				System.out.print("Choice: ");
				choice = sc.nextInt();
		
				switch (choice) {
					case 1:
						ar.populate(nums);
						break;
					
					case 2:
						if (selectedSort == 3){
							ar.bubbleSort(bubble);
						} else if (selectedSort == 4){
							ar.insertionSort(insertion);
						} else {
							System.out.println("\n---	Choose a sorting method:	---\n");
						}
						break;
		
					case 3:
						System.out.println("\nSorting using Bubble Sort...");
						selectedSort = choice;
						bubble = nums.clone();
						break;
						
					case 4:
						System.out.println("\nSorting using Insertion Sort...");
						selectedSort = choice;
						insertion = nums.clone();
						break;
				
					default:
						break;
			}
		}

	}
}
