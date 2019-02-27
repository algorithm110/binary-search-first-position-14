
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data1[] = {1,4,4,5,7,7,8,9,9,10};
		int target1 = 1;
		
		int data2[] = {1, 2, 3, 3, 4, 5, 10};
		int target2 = 3;
		
		int data3[] = {1, 2, 3, 3, 4, 5, 10};
		int target3 = 6;
		
		int ans1 = BinarySearchFirstPosition.binarySearch(data1, target1);
		System.out.println("ans1 = " + ans1);
		
		int ans2 = BinarySearchFirstPosition.binarySearch(data2, target2);
		System.out.println("ans1 = " + ans2);
		
		int ans3 = BinarySearchFirstPosition.binarySearch(data3, target3);
		System.out.println("ans1 = " + ans3);
		
		
		

	}

}
