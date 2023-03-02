package com.ll;

import com.ll.system.controller.SystemController;
import com.ll.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    /*
    private : 해당 멤버 변수가 같은 class 내에서만 접근 가능
    final : 변수가 값이 한 번 할당되면 변경이 불가능
    sc : class의 필드 값으로 멤버변수
     */
    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 ==");

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim(); // trim : 좌우 공백 제거

            if (command.equals("종료")) {
                systemController.exit();

                break;
            } else if (command.equals("등록")) {
                WiseSayingController.write();
            } else if (command.equals("목록")) {
                WiseSayingController.list();

            }


        }
    }
}
