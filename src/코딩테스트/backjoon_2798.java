package 코딩테스트;
import java.util.*;
import java.io.*;

public class backjoon_2798 {
	static int m,n;
	static int best = 0;
	static int arr [];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int [n];
		for(int i=0; i< arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

	}
	
	static void Combination(int start, int count, int sum) {
		if(count == 3) {
			if (sum > best && sum <= m) best = sum;
			return;
		}
		
		for(int i = start; i < n; i++) {
			Combination(start + 1, count + 1, sum + arr[i]);
		}
	}

}
