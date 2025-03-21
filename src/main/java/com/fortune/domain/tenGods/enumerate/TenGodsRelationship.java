package com.fortune.domain.tenGods.enumerate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum TenGodsRelationship {
    BIGEOB("비겁"),
    SIGSANG("식상"),
    JAESEONG("재성"),
    GWANSEONG("관성"),
    INSEONG("인성");

    private final String description;

    TenGodsRelationship(String description) {this.description = description;}
}
