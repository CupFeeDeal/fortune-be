package com.fortune.domain.tenGodsRelationship.entity;

import com.fortune.domain.tenGodsRelationship.enumerate.TenGodsRelationship;
import com.fortune.domain.yinYangFiveElements.entity.YinYangFIveElements;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TenGods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ten_gods_relationship")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "day_stem_id")
    private YinYangFIveElements dayStem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "other_yin_yang_five_elements_id")
    private YinYangFIveElements otherYinYangFiveElements;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TenGodsRelationship relationship;
}
