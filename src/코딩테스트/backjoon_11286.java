package 코딩테스트;

import java.io.*;
import java.util.*;
public class backjoon_11286 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		// comparator 이용하여 minheap 정렬 기준 만들기 
		PriorityQueue<Integer> minheap = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				if (Math.abs(n1) == Math.abs(n2)) {return n1 - n2;}
				return Math.abs(n1) - Math.abs(n2);
				
			}
		});
		
		// minheap에 추가
		for(int i=0; i< n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int k = Integer.parseInt(st.nextToken()); 
			// k가 0이 아닐 때
			if ( k != 0) {
				minheap.add(k);
			}
			// k가 0일 때
			if ( k == 0) {
				// k가 0인데 minheap이 비워져 있을 때
				if (minheap.isEmpty() == true) {
					System.out.println(0);
				}
				System.out.println(minheap.poll());
			
			}
		}
	}

}
