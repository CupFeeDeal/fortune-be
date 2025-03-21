package com.fortune.domain.users.entity;

import com.fortune.domain.users.enumerate.Gender;
import com.fortune.domain.users.enumerate.Solar;
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
}
