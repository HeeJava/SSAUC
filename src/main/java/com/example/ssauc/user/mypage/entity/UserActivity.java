package com.example.ssauc.user.mypage.entity;


import com.example.ssauc.user.login.entity.Users;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_activity")
public class UserActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id")
    private Long activityId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "avg_response_time")
    private Long avgResponseTime;

    @Column(name = "monthly_trade_count")
    private Long monthlyTradeCount;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
}
