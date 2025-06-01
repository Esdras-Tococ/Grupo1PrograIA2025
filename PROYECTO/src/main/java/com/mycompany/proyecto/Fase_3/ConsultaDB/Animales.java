/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jovany
 */
@Entity
@Table(name = "animales")
@NamedQueries({
    @NamedQuery(name = "Animales.findAll", query = "SELECT a FROM Animales a"),
    @NamedQuery(name = "Animales.findById", query = "SELECT a FROM Animales a WHERE a.id = :id"),
    @NamedQuery(name = "Animales.findByNombre", query = "SELECT a FROM Animales a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Animales.findByPeso", query = "SELECT a FROM Animales a WHERE a.peso = :peso"),
    @NamedQuery(name = "Animales.findByEdad", query = "SELECT a FROM Animales a WHERE a.edad = :edad"),
    @NamedQuery(name = "Animales.findByAlias", query = "SELECT a FROM Animales a WHERE a.alias = :alias"),
    @NamedQuery(name = "Animales.findByConsumo", query = "SELECT a FROM Animales a WHERE a.consumo = :consumo"),
    @NamedQuery(name = "Animales.findByDieta", query = "SELECT a FROM Animales a WHERE a.dieta = :dieta"),
    @NamedQuery(name = "Animales.findByAltura", query = "SELECT a FROM Animales a WHERE a.altura = :altura"),
    @NamedQuery(name = "Animales.findByClasificacion", query = "SELECT a FROM Animales a WHERE a.clasificacion = :clasificacion")})
public class Animales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "peso")
    private BigInteger peso;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "alias")
    private String alias;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "consumo")
    private BigDecimal consumo;
    @Column(name = "dieta")
    private String dieta;
    @Column(name = "altura")
    private BigDecimal altura;
    @Column(name = "clasificacion")
    private String clasificacion;

    public Animales() {
    }

    public Animales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getPeso() {
        return peso;
    }

    public void setPeso(BigInteger peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public BigDecimal getConsumo() {
        return consumo;
    }

    public void setConsumo(BigDecimal consumo) {
        this.consumo = consumo;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animales)) {
            return false;
        }
        Animales other = (Animales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto.Fase_3.ConsultaDB.Animales[ id=" + id + " ]";
    }

    public void setAltura(BigInteger altura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
