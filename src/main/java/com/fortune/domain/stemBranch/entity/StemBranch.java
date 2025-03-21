package com.fortune.domain.stemBranch.entity;

import com.fortune.domain.yinYangFiveElements.entity.YinYangFIveElements;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class StemBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stem_branch_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yin_yang_five_elements_id")
    private YinYangFIveElements yinYangFiveElements;

    @Column(nullable = false)
    private String chineseName;

    @Column(nullable = false)
    private String koreanName;
}
