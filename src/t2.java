
public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 3, 4, 1, 7, 9};
		int temp;
		
		for(int i=0; i< arr.length; i++){
			System.out.println(arr.length + "   "+ i);
			
			for(int j=0; j< arr.length; j++){
				if (arr[i] < arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}

		}
		
		System.out.println("Printing Sorted List ...");  
		for(int i=0;i<arr.length;i++)  
		{  
		  System.out.println(arr[i]);  
		}

	}

}
