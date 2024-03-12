package com.ohgiraffers.section01.xmlconfig;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.*;

//DTO는 Data Transfer Object
// 계층 간(Controlelr, View, Business Layer) 데이터 교환을 위한 Java Bean를 의미
// DTO는 로직을 가지지 않는 데이터 객체이고, getter, setter 메소드만 가진 클래스

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString

//@Data         => 위에 다섯가지 요서를 한 번에 포함하는 어노테이션. @DATA를 사용할 순 있지만 에러 발생 가능성이 있기 때문에


public class MenuDTO {

    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {}

    public MenuDTO(int code, String name, int price, int categoryCode, String orderableStatus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
