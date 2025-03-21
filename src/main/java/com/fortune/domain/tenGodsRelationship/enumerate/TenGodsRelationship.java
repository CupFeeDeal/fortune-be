package com.fortune.domain.tenGodsRelationship.enumerate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum TenGodsRelationship {
    PARALLEL("비겁"),
    SIGSANG("식상"),
    WEALTH("재성"),
    OFFICER("관성"),
    RESOURCE("인성");

    private final String description;

    TenGodsRelationship(String description) {this.description = description;}
}
