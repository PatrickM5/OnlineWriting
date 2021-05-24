package com.patrick.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "academic")
public class Academic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double amount_chargable;
    private String desc_chargable;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_id", referencedColumnName = "id")
    private Service service;


    @Override
    public String toString() {
        return "Academic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
