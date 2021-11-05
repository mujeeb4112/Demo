import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My String";
		char arr[] = str.toCharArray();
		for(int i=arr.length-1; i>=0 ;i--) {
			System.out.print(arr[i]);
		}
		
		int arrInt[] = {1,2,3,4,5};
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(x -> System.out.println(x));
		list.stream().filter(x -> x>1).forEach(System.out::print);
		//System.out.println(str);
		
		Map<String, String> map =new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		map.forEach((k,v) -> System.out.println(k + " " + v));
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("key --- "+ entry.getKey() + " value --- "+entry.getValue());
		}
		
		String str1 = "My name is is khan nam k k k";
		//occurence of each word in sentence;
		
		String wordArr[] = str1.split(" ");
		
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		
		for (String k : wordArr) {
			if (countMap.containsKey(k)) {
				countMap.put(k, countMap.get(k) + 1);
			} else {
				countMap.put(k, 1);
			}
		}
		
		countMap.forEach((k,v) -> System.out.println(k + " " + v));
		
//		int i, j, row=6;   
//		//outer loop for rows  
//		for(i=0; i<row; i++)   
//		{   
//		//inner loop for columns  
//		for(j=0; j<=i; j++)   
//		{   
//		//prints stars   
//		System.out.print("* ");   
//		}   
//		//throws the cursor in a new line after printing each line  
//		System.out.println();   
//		}   
		
		
		//
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}
		
		  int[] nums = { 3, 4, 2, 1, 6, 7 };
		  Arrays.stream(nums).forEach((e) -> System.out.println(e));
		  
	        List<String> items = new ArrayList<>();

	        items.add("coins");
	        items.add("pens");
	        items.add("keys");
	        items.add("sheets");

	        items.stream().filter(item -> (item.length() == 4)).forEach(System.out::println);
	        items.stream().forEach(System.out::println);
	        
	        
	        List<Integer> list1 = new ArrayList<>(
	                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
	                // Print the Arraylist
	            System.out.println("ArrayList with duplicates: "
	                               + list);
	}

}
