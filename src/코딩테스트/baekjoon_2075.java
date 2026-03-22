package 코딩테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_2075 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int [] narray = new int [n * n];
		int id = 0;
		
		// 한 라인씩 읽은 걸 배열에 저장
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for (int j=0; j < n; j++) {
				narray[id++] = Integer.parseInt(st.nextToken());
			}
		}
		// 정렬
		Arrays.sort(narray);
		
		// N번째 큰 수
		System.out.print(narray[n * n - n]);
	}

}
