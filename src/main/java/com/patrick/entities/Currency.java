package com.patrick.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "currency")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;
    private Double amount_chargable;
    private String desc_chargable;

    @Override
    public String toString() {
        return "Academic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
