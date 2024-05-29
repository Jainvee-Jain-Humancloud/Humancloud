package humancloud;

import java.util.ArrayList;
import java.util.List;

public class PalindromNumberInArray {

	public static void checkPalindrom(int[] arr) {
        String str ="";
		List<Integer> ar = new ArrayList<>();
		
		for (int i = 0; i <= arr.length - 1; i++) {
			boolean flag = true;
			str = "" + arr[i];
			
			for (int j = 0, k = str.length() - 1; j <= str.length() / 2 && k >= str.length() / 2; j++, k--) {
				if (str.charAt(j) != str.charAt(k)) {
					flag = false;
					break;
				}
			}
			int val = Integer.parseInt(str);   //String str = "123";
												//Scanner scanner = new Scanner(str);
												//int number = scanner.nextInt();
												//System.out.println(number);  // Outputs 123
												//scanner.close();
			
			if (flag==true) {
				ar.add(val);
				
					
			}
			

		}
		System.out.println(ar);
		
	}

	public static void main(String[] args) {
		int arr[] = { 3456, 4554, 121, 675, 64, 6789876 };
		checkPalindrom(arr);
		
	}

}
