import java.util.Scanner;
public class Activity1Object{
	Scanner sc = new Scanner(System.in);

	public Activity1Object(){
	}

	public void populate(int[] myArray){
		System.out.println("Enter " + myArray.length + " integers:");
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = sc.nextInt();
		}
		System.out.println("Confirming Integers input: ");
		for (int i = 0; i < myArray.length; i++){
			System.out.print("\t" + myArray[i]);
		}
		System.out.println();
	}

	public void print(int[] myArray){
		for (int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + "\t");
		}
		System.out.println();
	}

	public void bubbleSort(int[] myArray){
		System.out.println("\nSorting...\n");
		print(myArray);
		int n = myArray.length;
		for (int i = 0; i < n - 1; i++){
			for (int j = 0; j < n - i - 1; j++){
				if (myArray[j] > myArray[j + 1]){
					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					
					print(myArray);
				}
			}
		}
		System.out.println();
	}

	public void insertionSort(int[] myArray){
		System.out.println("\nSorting...\n");
		print(myArray);
		int n = myArray.length;
		for (int i = 1; i < n; i++){
			int key = myArray[i];
			int j = i - 1;
			while (j >= 0 && myArray[j] > key){
				myArray[j + 1] = myArray[j];
				j--;

				print(myArray);
			}
			myArray[j + 1] = key;

			print(myArray);
		}
		System.out.println();
	}
}
