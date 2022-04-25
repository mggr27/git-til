
public class Array2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		
//		arr[1][0] = 1;
//		arr[1][1] = 2;
//		arr[1][2] = 3;
//		arr[1][3] = 4;
//		
//		arr[2][0] = 1;
//		arr[2][1] = 2;
//		arr[2][2] = 3;
//		arr[2][3] = 4;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = j + 1;				
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("---");
		
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		int arr2[][] = new int[3][4];
		int num2=1;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++,num2++) {
				arr2[i][j] =num2;
			}
		}
		for(int i=0; i<arr2.length; i++){
			for(int j=0; j<arr2[0].length; j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---");
		
		//1 4 7 10
		//2 5 8 11
		//3 6 9 12
		int arr3[][] = new int[3][4];
		int num3=1;
		for(int col=0; col<arr3[0].length; col++) {
			for(int row=0; row<arr3.length; row++, num3++) {
				arr3[row][col]=num3;				
			}
		}
		for(int row=0; row<arr3.length; row++) {
			for(int col=0; col<arr3[0].length; col++) {
				System.out.print(arr3[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("---");	
			
		//A B C D
		//E F G H
		//I J K L
		char arr4[][] = new char[3][4];
		char alpha = 'A';
		for(int i=0; i<arr4.length; i++){
			for(int j=0; j<arr4[0].length; j++,alpha++){
				arr4[i][j] = alpha;
			}
		}
		for(int i=0; i<arr4.length; i++){
			for(int j=0; j<arr4[0].length; j++){
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---");
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
		int[][] arr5 = new int[4][];
//		arr5[0] = new int[1];
//		arr5[1] = new int[2];
//		arr5[2] = new int[3];
//		arr5[3] = new int[4];
		
		int num5 = 1;
		for(int row=0; row<arr5.length; row++) {
			arr5[row] = new int[row+1]; //열 생성
			//값대입
			for(int col=0; col<arr5[row].length; col++, num5++) {
				arr5[row][col] = num5;
			}
		}
		for(int row=0; row<arr5.length; row++) {
			for(int col=0; col<arr5[row].length; col++) {
				System.out.print(arr5[row][col]);
			}
			System.out.println();
		}
		System.out.println("---");
//		int[][] scores = new int[5][3];
//		scores[0][0] = 9;
//		scores[0][1] = 8;
//		scores[0][2] = 5;
		int[][] scores = { {9, 8, 5},
				  {10, 3, 5},
				  {7, 10, 8},
				   {3, 2, 1},
				   {5, 6, 7}
				 }; //배열초기화
		//각학생의 총점과 평균을 계산하시오
		//int totalScore = scores[0][0]+scores[0][1]+scores[0][2];
		//int totalScore = 0;
		/*
		1번 학생의 총점은 22이고 평균은 7.3333335이다
		2번 학생의 총점은 18이고 평균은 6.0이다
		3번 학생의 총점은 25이고 평균은 8.333333이다
		4번 학생의 총점은  6이고 평균은 2.0이다
		5번 학생의 총점은 18이고 평균은 6.0이다
		*/
		int studentCnt = scores.length;
		int subjectCnt = scores[0].length;		
				
		for(int row=0; row<studentCnt; row++) {
			int studentTotalScore = 0;
			for(int col=0; col<studentCnt; col++) {
				studentTotalScore += scores[row][col];
			}
			float studentAvg = (float)studentTotalScore / subjectCnt;
			System.out.println(row+1+"번 학생의 총점은"+studentTotalScore+"이고 평균은"+studentAvg+"이다");
		}
		
	        //과목별 평균을 계산하시오
		/*
		국어과목의 평균은 6.8
		영어과목의 평균은 5.8
		수학과목의 평균은 5.2
		*/
		String []subjects = {"국어","영어","수학"};
		int[] subjectTotalScore = new int[subjectCnt];
		
		for(int row=0; row<studentCnt; row++) { // 1차원 배열 (길이 : 3)
			for (int col=0; col<subjectCnt; col++) { // 2차원 배열 (길이 : 5)
				subjectTotalScores[col] += scores[row][col];
			}
		}
		for(int col=0; col<subjectCnt; col++) {
			float subjectAvg = (float)subjectTotalScores[col]/studentCnt;
			System.out.println(subjects[col]+"과목의 평균은"+subjectAvg);
		}
				
		int[][] arr6 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] arr7 = new int[4][4];
		int num=12;
//		for(int i=0; i<arr7.length; i++) {
//			for(int j=0; j<arr7[0].length; j++) {
//				num++;
//				arr7[j][i]=num;				
//			}
//		}
		/*
		int[][] ar = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] ar1 = new int[4][4];
		
		for(int i =0; i<arr.length;i++) {
			for(int j=3; j>-1; j--) {
				ar1[i][j] = ar[j][i];
				System.out.print(ar1[i][j]);
			}
			System.out.println();
		}
		*/
		/*
		for(int i=0; i<arr6.length; i++) {
			int now = (arr6[i].length-1)-i;
			for(int j=0; j<arr6[i].length;j++) {
				arr7[j][now] = arr6[i][j];
			}
		}
		*/
		
		for(int i=0; i<arr7.length; i++) {
			for(int j=0; j<arr7[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
			
	}
}
