import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ConsecChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbcaddaee";
		// String str = "GeeksForGeeks";
		System.out.println(removeDuplicates(str));        
	}

	public static StringBuilder removeDuplicates(String str) {
		char arr[] = str.toCharArray();
		boolean flag = false;
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(str);
		for(int i=0; i< arr.length; i++) {
			if (i != arr.length - 1 && (arr[i] == arr[i+1])) {
				sb = sb.deleteCharAt(i);
				sb = sb.deleteCharAt(i);
				// System.out.println("----------------- "+ sb.toString());
				flag = true;
				break;
			}
		}
		if (flag)
			return removeDuplicates(sb.toString()); 
		else
			return sb;
	}

}
