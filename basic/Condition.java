public class Condition{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("입력하세요:");

        //int score = 93;
/*
        int score = sc.nextInt();
        if( score >= 60 ){
            System.out.println("합격");
            if( score >= 90){
                System.out.println("1등급");
            }else if( score  >= 70){
                System.out.println("2등급");
            }else{
                System.out.println("3등급");
            }
        }else{
            System.out.println("불합격");
        }
*/
        /*내가시도한코드
        int year = 2022;
        int birthYear = 2021;
        int age = year - birthYear;
        //7세 미만은 영유아, 8~13세까지 어린이,
        //14~19세까지 청소년, 20세이상은 성인

        int y = sc.nextInt();
        if( y < 7 ){
            System.out.println("영유아");
        }else if( y>=7 && y<=13 ){ //y>=7은 필요없었다고한다..
            System.out.println("어린이");
        }else if( y>=14 && y<=19 ){
            System.out.println("청소년");
        }else{
            System.out.println("성인");
        }       
        */ 
/*강사님 코드
        if(age>=20){
        }else if(age >=14){
        }else if(age >=8){
        }else{
        }
*/
        //출생년도에 해당하는 12지를 출력하시오.
        //2022년 출생자는 호랑이, 2021년-소, 2020년-쥐
        //년도를 12로 나눈 나머지가 0이면 원숭이, 1이면 닭, 2이면 개, 3이면 돼지,
        //4이면 쥐, 5이면 소, 6이면 호랑이, 7이면 토끼, 
        //8이면 용, 9이면 뱀, 10이면 말, 11이면 양
        
        int yr = sc.nextInt();
        int n = yr%12;
        if(n == 0){
            System.out.println("원숭이");
        }else if(n == 1){
            System.out.println("닭");
        }else if(n == 1){
            System.out.println("개");
        }else if(n == 1){
            System.out.println("돼지");
        }else if(n == 1){
            System.out.println("쥐");
        }else if(n == 1){
            System.out.println("소");
        }else if(n == 1){
            System.out.println("호랑이");
        }else if(n == 1){
            System.out.println("토끼");
        }else if(n == 1){
            System.out.println("용");
        }else if(n == 1){
            System.out.println("뱀");
        }else if(n == 1){
            System.out.println("말");
        }else{
            System.out.println("양");
        }
         
        /* 시도한것
        int yr = sc.nextInt();
        int n = yr%12;
        switch(n) {
            case 0:
                System.out.println("원숭이");
                break;
            case 1:
                System.out.println("닭");
                break;
            case 2:
                System.out.println("개");
                break;   
            case 3:
                System.out.println("돼지");
                break;
            case 4:
                System.out.println("쥐");
                break;
            case 5:
                System.out.println("소");
                break;
            case 6:
                System.out.println("호랑이");
                break;   
            case 7:
                System.out.println("토끼");
                break; 
            default:
                System.out.println("띠");
        }
        */
        
        /*
        가위바위보게임: 
        컴퓨터가 가위를 내고 사용자가 바위를 낸 경우 "이겼습니다"를 출력
                                                 보
                                                 가위
        0: 가위, 1: 바위, 2: 보
        */
        char c1 = 9996;
        int computer;
        //computer = 0;
        computer = (int)(Math.random()*3); //Math.random()의 반환값이 0.0<=r<1.0
                                                       //Math.random()*3              0.0<=r<3.0
                                                       //(int)                               0<=r<3
        int user;
        System.out.println("가위-0, 바위-1,보-2를 입력하세요:");
        user = sc.nextInt();
        switch(computer){
        case 0: System.out.println("컴퓨터가 가위를 냈습니다.");
                  break;
        case 1: System.out.println("컴퓨터가 바위를 냈습니다.");
                  break;
        case 2: System.out.println("컴퓨터가 보를 냈습니다.");
                  break;            
        }
        if(computer == user){
            System.out.println("비겼습니다");
        }else if((computer==0 && user==1)||
                 (computer==1 && user==2)||
                 (computer==2 && user==0)){
            System.out.println("이겼습니다"); 
        }else{
            System.out.println("졌습니다");
        }      
       
        

    }
}
