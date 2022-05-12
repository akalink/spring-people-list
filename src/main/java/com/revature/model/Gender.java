package com.revature.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="gender")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "gender",nullable = false)
    private String genderType;
}
