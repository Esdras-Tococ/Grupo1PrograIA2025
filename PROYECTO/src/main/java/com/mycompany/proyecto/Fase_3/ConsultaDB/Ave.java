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
@Table(name = "ave")
@NamedQueries({
    @NamedQuery(name = "Ave.findAll", query = "SELECT a FROM Ave a"),
    @NamedQuery(name = "Ave.findById", query = "SELECT a FROM Ave a WHERE a.id = :id"),
    @NamedQuery(name = "Ave.findByIdAnimal", query = "SELECT a FROM Ave a WHERE a.idAnimal = :idAnimal"),
    @NamedQuery(name = "Ave.findByVolador", query = "SELECT a FROM Ave a WHERE a.volador = :volador"),
    @NamedQuery(name = "Ave.findByTipoPlumas", query = "SELECT a FROM Ave a WHERE a.tipoPlumas = :tipoPlumas")})
public class Ave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Id
    @Basic(optional = false)
    @Column(name = "id_animal")
    private Integer idAnimal;
    @Basic(optional = false)
    @Column(name = "volador")
    private boolean volador;
    @Basic(optional = false)
    @Column(name = "tipo_plumas")
    private String tipoPlumas;

    public Ave() {
    }

    public Ave(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Ave(Integer idAnimal,boolean volador, String tipoPlumas) {
        this.idAnimal = idAnimal;
     
        this.volador = volador;
        this.tipoPlumas = tipoPlumas;
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

    public boolean getVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public String getTipoPlumas() {
        return tipoPlumas;
    }

    public void setTipoPlumas(String tipoPlumas) {
        this.tipoPlumas = tipoPlumas;
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
        if (!(object instanceof Ave)) {
            return false;
        }
        Ave other = (Ave) object;
        if ((this.idAnimal == null && other.idAnimal != null) || (this.idAnimal != null && !this.idAnimal.equals(other.idAnimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.proyecto.Fase_3.ConsultaDB.Ave[ idAnimal=" + idAnimal + " ]";
    }
    
}
