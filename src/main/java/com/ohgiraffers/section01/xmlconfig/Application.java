package com.ohgiraffers.section01.xmlconfig;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 필기
        *   우리는 아직 view 즉 사용자들이 정보를 입력할 수 있는 화면을 배우지 않았다.
        *   따라서 아직은 Application 이 view 라고 생각하고 진행을 해보자.
        *   */

        /* 필기
        *   시스템 요구사항
        *   1. 메뉴 전체 조회
        *   2. 메뉴 코드로 메뉴 조회
        *   3. 신규 메뉴 추가
        *   4. 메뉴 수정
        *   5. 메뉴 삭제
        *   */

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("=============오지라퍼 메뉴 관리 시스템============");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 메뉴 코드로 메뉴 조회하기");
            System.out.println("3. 신규 메뉴 등록하기");
            System.out.println("4. 메뉴 수정하기");
            System.out.println("5. 메뉴 삭제하기");
            System.out.println("메뉴 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.selectAllMenu(); break;
                case 2 : break;
                case 3 : break;
                case 4 : break;
                case 5 : break;
                default:
                    System.out.println("잘못된 메뉴를 입력하셨습니다."); break;
            }

        } while (true);

    }
}
