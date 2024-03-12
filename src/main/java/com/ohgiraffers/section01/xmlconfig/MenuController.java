package com.ohgiraffers.section01.xmlconfig;

/* 필기
 *   Controller 의 역할
 *   view 즉 현재는 Application 에서 사용자가 입력한 정보를 파라미터 형태로 전달을 받으면
 *   전달받은 값들을 검증하거나 추가적인 정보가 필요한 경우 가공을 한 뒤,
 *   service 쪽으로 전달하기 위한 인스턴스를 담고 서비스의 비즈니스 로직을 담당하는 method 를 호출한다.
 *   또한 호출한 수행 결과를 반환 받아 어떠한 뷰를 다시 사용자에게 보여줄 것인지를 결정하는 역할을 한다.  */

import java.util.List;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        if(menuList != null) {
            printResult.printMenuList(menuList);

        } else {
            printResult.printErrorMessage("selectList");


        }

    }

}

