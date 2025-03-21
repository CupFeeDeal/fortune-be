package com.fortune.domain.users.entity;

import com.fortune.domain.heavenlyStemsEarthlyBranches.entity.HeavenlyStemsEarthlyBranches;
import com.fortune.domain.users.enumerate.Gender;
import com.fortune.domain.users.enumerate.Solar;
import com.fortune.domain.yinYangFiveElements.entity.YinYangFIveElements;
import com.fortune.global.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer birthYear;

    @Column(nullable = false)
    private Integer birthMonth;

    @Column(nullable = false)
    private Integer birthDay;

    @Column(nullable = false)
    private Integer birthTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Solar solar;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column
    private Integer age;

    @Column
    private Integer greatLuck;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hour_stem_element_id")
    private YinYangFIveElements hourStemElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "day_stem_element_id")
    private YinYangFIveElements dayStemElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "month_stem_element_id")
    private YinYangFIveElements monthStemElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "year_stem_element_id")
    private YinYangFIveElements yearStemElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hour_branch_element_id")
    private YinYangFIveElements hourBranchElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "day_branch_element_id")
    private YinYangFIveElements dayBranchElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "month_branch_element_id")
    private YinYangFIveElements monthBranchElement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "year_branch_element_id")
    private YinYangFIveElements yearBranchElement;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hour_stem_id")
    private HeavenlyStemsEarthlyBranches hourStem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "day_stem_id")
    private HeavenlyStemsEarthlyBranches dayStem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "month_stem_id")
    private HeavenlyStemsEarthlyBranches monthStem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "year_stem_id")
    private HeavenlyStemsEarthlyBranches yearStem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hour_branch_id")
    private HeavenlyStemsEarthlyBranches hourBranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "day_branch_id")
    private HeavenlyStemsEarthlyBranches dayBranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "month_branch_id")
    private HeavenlyStemsEarthlyBranches monthBranch;
}
