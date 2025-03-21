package com.fortune.domain.tenGods.entity;

import com.fortune.domain.common.enumerate.StemBranch;
import com.fortune.domain.tenGods.enumerate.TenGodsRelationship;
import com.fortune.domain.users.enumerate.Gender;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TenGodsDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ten_gods_meaning_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ten_gods_id")
    private TenGods tenGods;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StemBranch type;

    @Enumerated(EnumType.STRING)
    @Column
    private Gender gender;

    @Column(nullable = false)
    private String description;
}
