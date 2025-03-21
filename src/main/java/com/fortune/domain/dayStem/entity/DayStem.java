package com.fortune.domain.dayStem.entity;

import com.fortune.domain.yinYangFiveElements.entity.YinYangFIveElements;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class DayStem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "day_stem_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "day_stem_id")
    private YinYangFIveElements dayStem;

    @Column(nullable = false)
    private String nickname;

    @Column
    private String description1;

    @Column
    private String description2;

    @Column
    private String description3;

    @Column
    private String description4;
}
