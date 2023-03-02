package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new App(sc).run();
        /*
        자동차 a자동차 = new 자동차
        위와 같이 class 혹은 객체에 대한 변수가 선언되지 않았다면
        new 자동차()와 같이 리모콘을 선언해 변수 선언하지 않고
        class가 가지고 있는 객체들을 곧 바로 사용할 수 있음
        */

        sc.close();
    }
}
