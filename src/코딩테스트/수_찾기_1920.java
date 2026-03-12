package 코딩테스트;

import java.util.Random;
public class 수_찾기_1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int N = (int)(Math.random() * 100000) + 1; // 자연수 N 생성
		int M = (int)(Math.random() * 100000) + 1; // 자연수 M 생성
		int [] Narray = new int[N]; // N 수 만큼의 배열 생성
		int [] Marray = new int[M]; // M 수 만큼의 배열 생성
		
		// Narray에 정수 난수 생성
		for(int i=0; i < Narray.length; i++) {
			Narray[i] = random.nextInt();
		}
		// Marray에 정수 난수 생성
		for(int i=0; i < Marray.length; i++) {
			Marray[i] = random.nextInt();
		}
		
		// 함수 호출
		comparison(Marray, Narray);
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