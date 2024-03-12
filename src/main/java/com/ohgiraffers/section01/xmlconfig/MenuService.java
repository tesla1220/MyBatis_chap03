package com.ohgiraffers.section01.xmlconfig;

/* 필기.
 *   Service 의 역할
 *   1. SqlSession 생성
 *   2. DAO(Data Access Object)의 메소드 호출
 *   3. 트랜젝션(commit,rollback) 제어
 *   4. SqlSession 닫기
 *  */

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class MenuService {

    private final MenuDAO menuDAO;

    public MenuService() {
        this.menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        sqlSession.close();

        return menuList;

    }
}