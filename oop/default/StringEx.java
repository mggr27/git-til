
public class StringEx {

	public static void main(String[] args) {
		String s1 = new String("가나다");
		String s2 = new String("가나다");
		String s3 = "가나다";
		String s4 = "가나다";
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //true
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s1+"라마"); //가나다라마
		System.out.println(s1); //가나다
		System.out.println(s1.substring(1, 3)); //시작인덱스,끝인덱스바로 앞문자까지출력
		
		s1 += "라마"; //s1 = s1 + "라마";
//		System.out.println(s1+="라마");
		char c = s1.charAt(0); //0번 인덱스에 해당하는 문자출력
		System.out.println(c); //가
//		System.out.println(s1.charAt(-1)); //음수안됨 파이썬만
		
		int size = s1.length(); //배열의 길이: 참조변수명.length
		System.out.println(size); //5
		
		//Palindrome문자열 : 가나다나가 ABBA
		String palindrome = "가나다나가";
		//TODO
		//palindrome 문자열입니다 가 출력
	
//		palindrome = "ABBA";
		//TODO
		//palindrome 문자열입니다 가 출력
		
//		palindrome = "ABCD";
		//TODO
		//palindrome 문자열이 아닙니다 가 출력
		
		int length = palindrome.length();
		int half = length / 2;

		int i = 0;		
		for(int j = length - 1; i<half; i++, j--) {
			if(palindrome.charAt(i) !=palindrome.charAt(j)) {
				break;
			}
		}
		if(i == half) {
			System.out.println("palindrome 문자열입니다.");
		}else {
			System.out.println("palindrome 문자열이 아닙니다.");
		}
		
		
		/*my
		int p = palindrome.length();
		if(p%2==0) {
			for(int i=0; i<=p/2; i++) {
				char front = palindrome.charAt(i);
				char back = palindrome.charAt(p-i-1);
				if(front == back) {
					
				}
			}
		}
		*/
		
		String str = "https://news.naver.com/main/clusterArticles.naver?id=c_202205031110_00000070&mode=LSD&mid=shm&sid1=105&oid=018&aid=0005206604";
		//str = "https://www.naver.com";
		String hostName; //str의 host : news.naver.com
		String path; //str의 path : main/clusterArticles.naver
		String queryString; //str의 querystring : id=c_202205031110_00000070&mode=LSD&mid=shm&sid1=105&oid=018&aid=0005206604
		
		String regex = "\\?"; //정규표현식이 와야하는자리 \\붙이고 \\?이렇게 써야 일반문자열?, 그냥쓰면 정규표현식?임
		int limit = 2; // split메서드 PatternSyntaxException
		String[] arr = str.split(regex, limit); //배열의 크기를 2개로 
		System.out.println("arr[0]:" + arr[0]);
		if(arr.length>=2) {
			System.out.println("arr[1]:"+arr[1]); //ArrayIndexOutOfBoundsException
		}
		System.out.println("arr[1]:" + arr[1]);
		
		
		String hostNameNPath = arr[0]; // https://news.naver.com/main/clusterArticles.naver
        // https://www.naver.com
//		hostNameNPath.indexOf(":"); //문자에 해당하는 인덱스를 반환
//		System.out.println(hostNameNPath.indexOf("/", 5+3)); 
		int beginIndex = hostNameNPath.indexOf(":")+3; //5+3
		int endIndex = hostNameNPath.indexOf("/",beginIndex); //22, 해당문자가 존재하지않는다는뜻의-1
		if(endIndex !=-1) {
		hostName = hostNameNPath.substring(beginIndex,endIndex);
		//hostNameNPath.substring(endIndex+1, hostNameNPath.length());
		path = hostNameNPath.substring(endIndex+1);
		}else {
			hostName = hostNameNPath;
			path = "";
		}
		System.out.println("호스트명:"+hostName);
		System.out.println("패스:"+path);
				
		if(arr.length >=2) {
			queryString = arr[1]; //?sid=105 구분되어짐?과 &경계로
			String[] queryStringArr = queryString.split("&");
			for(int index=0; index<queryStringArr.length; index++) {
			String q = queryStringArr[index];
			String[] qArr = q.split("=",2);
			String qName = qArr[0];
			String qValue = qArr[1];
			System.out.println("쿼리스트링 이름은"+ qName+ ", 값은"+ qValue); 
			
			/*
			쿼리스트링 이름은id , 값은c_202205031110_00000070
			쿼리스트링 이름은mode, 값은LSD
			쿼리스트링 이름은mid, 값은shm
			쿼리스트링 이름은sid1, 값은105
			쿼리스트링 이름은oid, 값은018
			쿼리스트링 이름은aid, 값은0005206604
			*/
			}
		}
	}

}
