package com.fortune.domain.yinYangFiveElements.entity;

import com.fortune.domain.yinYangFiveElements.enumerate.FiveElements;
import com.fortune.domain.yinYangFiveElements.enumerate.YinYang;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class YinYangFIveElements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "yin_yang_five_elements_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FiveElements fiveElement;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private YinYang yinYang;

    @Column(nullable = false)
    private String description;
}
