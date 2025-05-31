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
@Table(name = "reptil")
@NamedQueries({
    @NamedQuery(name = "Reptil.findAll", query = "SELECT r FROM Reptil r"),
    @NamedQuery(name = "Reptil.findById", query = "SELECT r FROM Reptil r WHERE r.id = :id"),
    @NamedQuery(name = "Reptil.findByTipoEscamas", query = "SELECT r FROM Reptil r WHERE r.tipoEscamas = :tipoEscamas"),
    @NamedQuery(name = "Reptil.findByVenenoso", query = "SELECT r FROM Reptil r WHERE r.venenoso = :venenoso"),
    @NamedQuery(name = "Reptil.findByIdAnimal", query = "SELECT r FROM Reptil r WHERE r.idAnimal = :idAnimal")})
public class Reptil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Column(name = "tipo_escamas")
    private String tipoEscamas;
    @Column(name = "venenoso")
    private Boolean venenoso;
    @Id
    @Basic(optional = false)
    @Column(name = "id_animal")
    private Integer idAnimal;

    public Reptil() {
    }

    public Reptil(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Reptil(Integer idAnimal, int id) {
        this.idAnimal = idAnimal;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
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
        if (!(object instanceof Reptil)) {
            return false;
        }
        Reptil other = (Reptil) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto.Fase_3.ConsultaDB.Reptil[ idAnimal=" + idAnimal + " ]";
    }
    
}
