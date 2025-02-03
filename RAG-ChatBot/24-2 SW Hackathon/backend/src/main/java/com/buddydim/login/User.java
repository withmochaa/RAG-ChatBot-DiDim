package com.buddydim.login;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
//import sejong_team.matching.SejongProfile.Entity.Profile;


@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User { // 이거 이름 User로 변경
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId; // 이거 추가
    private String name;
    private String department;
    private String status;
    private String grade;

    public User(Long userId, String name, String department, String status, String grade) {
        this.userId = userId;
        this.name = name;
        this.department = department;
        this.status = status;
        this.grade = grade;
//            this.profile =profile;
    }
}
