package com.fortune.domain.common.enumerate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum StemBranch {
    HOUR_STEM("시간"),
    DAY_STEM("일간"),
    MONTH_STEM("월간"),
    YEAR_STEM("연간"),
    HOUR_BRANCH("시지"),
    DAY_BRANCH("일지"),
    MONTH_BRANCH("월지"),
    YEAR_BRANCH("연지");

    private final String description;

    StemBranch(String description) {this.description = description;}
}
