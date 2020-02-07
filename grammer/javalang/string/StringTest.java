package javalang.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		
		/* concat */
		System.out.println("TEST concat");
		
		s1.concat(" SSAFY!!");
		System.out.println(s1); /* Hello 출력 - 문자열을 뒤로 추가, 수정x */
		String s2 = s1.concat(" SSAFY!!");
		System.out.println(s2); /* Hello SSAFY 출력 */
	
		/* replace */
		System.out.println("\nTEST replace");
		
		String s3 = "Hello";
		s3.replace('l', 'L');
		System.out.println(s3);	/* Hello 출력 - 바꾼 객체를 리턴, 수정x */
		System.out.println(s3.replace('l', 'e'));
		
		/* length, charAt, subString */
		System.out.println("\nTEST lnegth, charAt, subString");
		
		
		String s4 = "Hello";
		System.out.println("length : " + s4.length()); 			  		/* 문자열의 길이 리턴*/
		System.out.println("charAt 0 : " + s4.charAt(0)); 				/* 해당 인덱스의 문자 리턴*/
		System.out.println("substring (1,3) : " + s4.substring(1,3)); 	/* 시작인덱스, 끝인덱스+1 까지 스트링으로 리턴*/
		
		/* startsWith, endsWith, indexOf */
		System.out.println("\nTEST startsWith, endsWith, indexOf");
		
		String s5 = "Hello, SSAFY? we are here";
		System.out.println(s5.startsWith("He")); /*스트링이 해당 문자열로 시작하는지 확인하고 boolean값 리턴*/
		System.out.println(s5.endsWith("here")); /*스트링이 해당 문자열로 끝나는지 확인하고 boolean값 리턴*/
		System.out.println(s5.indexOf("SSAFY")); /*해당 문자열의 시작 인덱스 리턴, 없으면 -1 리턴*/
		System.out.println(s5.indexOf('e'));     /*해당 문자의 시작 인덱스 리턴, 없으면 -1 리턴*/
	
		/* compareTo */
		System.out.println("\nTEST compareTo");
		
		String s6 = "AAA";
		String s7 = "BBB";
		String s8 = "DD";
		System.out.println(s6.compareTo(s7));
		System.out.println(s7.compareTo(s8));
		
		/* trim */
		System.out.println("\nTEST trim");
		
		String s9 = "    Use Trim method!! ";
		s9.trim(); 
		System.out.println(s9);			/* 공백 제거, 자체 수정x*/
		System.out.println(s9.trim());
		
		/* contains */
		System.out.println("\nTEST contains");
		
		String s10 = "SSAFY Class!";
		if(s10.contains("Class")) {		/* 특정 스트링을 포함하는지 확인하고 boolean리턴, 공백도 인식*/
			System.out.println("s10 contains Class!");
		}
	}

}
