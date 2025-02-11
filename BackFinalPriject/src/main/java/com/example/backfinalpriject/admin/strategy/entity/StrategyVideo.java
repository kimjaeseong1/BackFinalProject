package com.example.backfinalpriject.admin.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="strategy_video")
@Builder
public class StrategyVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private Long id;

    @ManyToOne(targetEntity = Strategy.class,fetch = FetchType.LAZY)
    @JoinColumn(name="strategy_id")
    private Strategy strategy;

    @Column(name="video_link")
    private String videoLink;
}
