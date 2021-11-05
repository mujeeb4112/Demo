import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;import java.util.PriorityQueue;import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Demo {
	
	

	public static void main(String[] args) {
		String s="abbcaddaee";
		String finalStr = "";
		List<String> list =new ArrayList<String>();
		
		char arr[] = s.toCharArray();

		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<arr.length;i++){
			
		}
		
		
		
//		char arr[] = s.toCharArray();
//		Queue<String> pq= new ConcurrentLinkedQueue<>();
//		
//		for(int i=0;i<arr.length;i++){
//			if(i!=arr.length-1){
//			if(!(arr[i] == arr[i+1])){
//				System.out.println("----------" +arr[i]);
//				finalStr = finalStr + arr[i];
//				pq.add(String.valueOf(arr[i]));
//			} else {
//				list.add(String.valueOf(arr[i]));
//			}
//			}
//		}
//		System.out.println(finalStr);
//		
//		String str2 = "";
//		char[] arr1=finalStr.toCharArray();
//		
//			Iterator iterator = pq.iterator();
//			list.forEach(x->{
//	        while (iterator.hasNext()) {
//	        	
//	        		if(x.equals(iterator.next())){
//	        			pq.remove(x);
//	        		}
//	            //System.out.print(iterator.next() + " 0000------");
//	        	
//	        }
//			});
//	        
//	        Iterator iterator1 = pq.iterator();
//	        
//	        while (iterator1.hasNext()) {
//	        	System.out.print(iterator1.next() + " 0000------");
//	        }
//		

	}

}
