package com.revature.PeopleList.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="person", schema = "public")
@NoArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="fullName", nullable = false)
    private String fullName;

    @Column(name="age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "ethnicity_id")
    private Ethnicity ethnicity;
}
