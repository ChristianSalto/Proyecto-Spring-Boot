package com.hazerta.alienigenas.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id; 
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="alienigena")
public class Alienigena {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    
    @Column(name="codplaneta", nullable = false)
    private int codPlaneta;

    public int getCodPlaneta() {
        return this.codPlaneta;
    }

    public void setCodPlaneta(int codPlaneta) {
        this.codPlaneta = codPlaneta;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}