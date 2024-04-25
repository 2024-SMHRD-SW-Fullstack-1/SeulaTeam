package 배열;

import java.util.Arrays;

public class Ex01배열08 {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";

	       //split을 사용해 특정 문자열을 기준으로 문자열 나누기 => String[]
	       
	        String[] scoreArr = score.split(",");
	        
	        System.out.println(Arrays.toString(scoreArr));
	        
	        //배열안에 저장되어 있는 각 알파벳(A,B,C,D,F)의 개수 구하기
	        //1. 각 알파벳의 개수를 저장할 공간 (변수5개, 개수를 저장할 배열 1개)
	        //int a=0, b=0, c=0, d=0, f=0;
	        int[] cntArr = new int[5]; // 0 0 0 0 0 
	        System.out.println(Arrays.toString(cntArr));
	        
	        
	        //2. 배열의 [0]번째 에 저장된 알파벳이 무엇인지 판단후에 개수 카운팅
	        for(int i=0; i<scoreArr.length; i++) {
	           switch(scoreArr[i]) {
	           case "A": cntArr[0]++; break;
	           case "B": cntArr[1]++; break;
	           case "C": cntArr[2]++; break;
	           case "D": cntArr[3]++; break;
	           default : cntArr[4]++;
	           }
	        }
	        
	        for(int i = 0; i<cntArr.length; i++) {
	           if(i==4) {
	              System.out.print((char)(65+i+1)+" : ");
	           }else {
	              System.out.print((char)(65+i)+" : ");
	           }
	           System.out.println(cntArr[i]);
	        }
	}

}
