package com.fortune.domain.yinYangFiveElements.enumerate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum YinYang {
    YIN("음"), YANG("양");

    private final String description;

    YinYang(String description) {this.description = description;}
}
