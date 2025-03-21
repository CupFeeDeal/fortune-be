package com.fortune.domain.yinYangFiveElements.enumerate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum FiveElements {
    WOOD("목"),
    FIRE("화"),
    EARTH("토"),
    METAL("금"),
    WATER("수");

    private final String description;

    FiveElements(String description) {this.description = description;}
}
