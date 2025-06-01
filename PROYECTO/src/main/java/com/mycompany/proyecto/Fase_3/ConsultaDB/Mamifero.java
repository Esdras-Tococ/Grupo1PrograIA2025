/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.Fase_3.ConsultaDB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jovany
 */
@Entity
@Table(name = "mamifero")
@NamedQueries({
    @NamedQuery(name = "Mamifero.findAll", query = "SELECT m FROM Mamifero m"),
    @NamedQuery(name = "Mamifero.findById", query = "SELECT m FROM Mamifero m WHERE m.id = :id"),
    @NamedQuery(name = "Mamifero.findByIdAnimal", query = "SELECT m FROM Mamifero m WHERE m.idAnimal = :idAnimal"),
    @NamedQuery(name = "Mamifero.findByPelaje", query = "SELECT m FROM Mamifero m WHERE m.pelaje = :pelaje"),
    @NamedQuery(name = "Mamifero.findByEspecie", query = "SELECT m FROM Mamifero m WHERE m.especie = :especie")})
public class Mamifero implements Serializable {
    @Id
    @Basic(optional = false)
    @Column(name = "id_animal")
    private Integer idAnimal;

    @Column(name = "id", insertable = false, updatable = false)
    private int id; 
    
    
    
    @Basic(optional = false)
    
    
    
    @Column(name = "pelaje")
    private String pelaje;
    @Basic(optional = false)
    @Column(name = "especie")
    private String especie;

    public Mamifero() {
    }

    public Mamifero(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Mamifero(Integer idAnimal, String pelaje, String especie) {
        this.idAnimal = idAnimal;
     
        this.pelaje = pelaje;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnimal != null ? idAnimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mamifero)) {
            return false;
        }
        Mamifero other = (Mamifero) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto.Fase_3.ConsultaDB.Mamifero[ idAnimal=" + idAnimal + " ]";
    }
    
}
