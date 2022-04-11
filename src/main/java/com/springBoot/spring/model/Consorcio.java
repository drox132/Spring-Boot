package com.springBoot.spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "consorcio")

public class Consorcio {
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Getter @Setter @Id @Column(name = "id")
    private long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "cuit")
    private String cuit;

    @Getter @Setter @Column(name = "correo")
    private String correo;


}
