package com.revature.PeopleList.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="ethnicity")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Ethnicity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ethnicity",nullable = false)
    private String ethnicityType;
}
