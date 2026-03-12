package 코딩테스트;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
public class 수_찾기_1920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 바이트 입력을 문자로 바꿔서 읽기
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine()); // 입력 한 줄을 읽고 공백 기준으로 나누기
		int N = Integer.parseInt(tokenizer.nextToken());
		int [] NArray = new int[N];
		for(int i=0; i < NArray.length; i++) {
			NArray[i] = Integer.parseInt(tokenizer.nextToken()); // 공백 기준으로 나눈 걸 다시 정수로 변환
		}
		
		int M = Integer.parseInt(tokenizer.nextToken());
		int [] MArray = new int[M];
		for(int i=0; i< MArray.length; i++) {
			MArray[i] = Integer.parseInt(tokenizer.nextToken());
		}
		
		
		// 함수 호출
		comparison(NArray, MArray);
	}
	// 비교 함수
	public static void comparison(int[] a, int[] b) {
		int [] Resultarray = new int[a.length]; // 결과 배열 생성
		// 입력 배열 두개를 비교하면서 같은 수가 있으면 결과 배열의 해당 칸을 1로 변경
		for(int i=0; i < a.length; i++) {
			for(int k=0; k <b.length;) {
				if (a[i] == b [k]) { Resultarray[i] = 1; break;}
				else k++;
			}
		}
		// 결과 배열 출력
		for(int i=0; i <Resultarray.length; i++ ) {
			System.out.println(Resultarray[i]);
		}
	}

}