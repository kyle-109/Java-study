package _5;

import java.util.Scanner;

/*
 * 대문자는 소문자로, 소문자는 대문자로 변환하시오
 * helloWorlD 
 *
 * 배열 for if 
 */
public class Main {
	public static void main(String[] args) {
		
		// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		// at java.lang.String.charAt(String.java:658)
		// at _5.Main.main(Main.java:24)
		// 

/*
		System.out.println("대소문자를 바꾸고 싶은 문구를 입력하세요.");
		Scanner scan = new Scanner(System.in); // 문자열 입력
		String input ="";
		input = scan.nextLine(); // 입력받은 문자열 저장
		String output = "";// 최종 출력 문자열 저장

		String[] arr = input.split(""); // 한글자씩 배열에 저장
		char tmp; // 쪼갠 문자열을 한글자씩 저장할 변수

		for (int i = 0; i <= arr.length; i++) {
			tmp = input.charAt(i); // 쪼갠 문자열을 한글자씩 저장
			if ((65 <= tmp) && (tmp <= 90)) {  // 문자가 대문자인가요..? 65 <= tmp  <= 90
				output += input.valueOf(tmp).toLowerCase(); // 소문자로 변환
			} else if((97<=tmp)&&(tmp<=122)) {// 소문자 확인
				output += input.valueOf(tmp).toUpperCase(); // 대문지로변환
			}else {
				output += (char) tmp;
			}
		}
		System.out.println("변환된 문자열: "+output);
		*/
		
		 Scanner sc = new Scanner(System.in);
	        String input=sc.nextLine();
	        
	        char[] arr;
	        arr= input.toCharArray();
	        
	        for(int i=0; i<arr.length; ++i){
	            if(65<=arr[i] && arr[i]<=90){
	                arr[i]=(char)(arr[i]+32);
	                continue;
	                }
	            if (97<=arr[i] && arr[i]<=122){
	                arr[i]=(char)(arr[i]-32);
	                continue;
	            }
	            }
	       
	            System.out.print(arr);
	        }
	    }
	