package day_2;

//public class Loop {
//    public static void main(String[] args) {
//        // 반복문 -> 첫번째 벽
//
//        // while, for
//
//        // while
//
//        int i = 0;
//
//        while(i < 10){
//            System.out.println("안녕");
//            i++;
//        }
//
//        // for
//
//        for(int j = 0; i < 3; i++){
//            System.out.println("안녕");
//        }
//    }
//}



// 문제 : 1부터 100까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        for (int i = 0 ; i < 101 ; i++){
//            System.out.println(i);
//        }
//        // 출력
//        // 1
//        // 2
//        // 3
//        // 4
//        // 5
//        // ...
//        // 100
//    }
//}
//-------------------------------------------------------------

//class Main {
//    public static void main(String[] args) {
//
//        for (int i = 1; i < 51; i++){
//            System.out.println(i * 2);
//        }
//
//        for(int i = 2; i <= 100; i = i + 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i < 101; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//
//        // 문제1. 1 ~ 100까지 수중 짝수만 출력
//        //2
//        //4
//        //6
//        //8
//        //...
//        //100
//
//        // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
//        //1:odd
//        //2:even
//        //3:odd
//        //4:even
//        //5:odd
//        //6:even
//        //7:odd
//        //8:even
//        //...
//        //100:even
//        for (int i = 1; i < 101; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + ":even");
//            }
//            else {
//                System.out.println(i + ":odd");
//            }
//        }
//    }
//}
//
//------------------------------------------------------------------------------------------------------------

/*
축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,

현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.

손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)

현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
*/

// 79 84 89
//class Loop {
//    public static void main(String[] args) {
//        int time = 74;
//        int score = 0;
//
//
//        for(int i = time; i < 90 ; i += 5){
//            score++;
//        }
//        System.out.println(score);
//        // 출력 : 4
//    }
//}

//--------------------------------------------------------------


// a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
// 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
// ex )
// 오름차순 :  1, 2, 3, 4, 5
// 내림차순 :  5, 4, 3, 2, 1

//class Main{
//    public static void main(String[] args) {
//        int a = 12;
//        int b = 5;
//
//
//        // v1
//        if(a > b){
//            for(int i = b; i < a; i++){
//                System.out.println(i);
//            }
//        }
//        else{
//            for(int i = a; i < b; i++){
//                System.out.println(i);
//            }
//        }
//
//        // v2
//
//        if(a > b) {
//            int c = a;
//            a = b;
//            b = c;
//        }
//
//        for(int i = a; i <= b; i++) {
//            System.out.println(i);
//        }
//    }
//}