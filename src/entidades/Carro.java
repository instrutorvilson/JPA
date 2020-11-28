/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "carro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carro.findAll", query = "SELECT c FROM Carro c"),
    @NamedQuery(name = "Carro.findById", query = "SELECT c FROM Carro c WHERE c.id = :id"),
    @NamedQuery(name = "Carro.findByPlaca", query = "SELECT c FROM Carro c WHERE c.placa = :placa"),
    @NamedQuery(name = "Carro.findByMarca", query = "SELECT c FROM Carro c WHERE c.marca = :marca"),
    @NamedQuery(name = "Carro.findByModelo", query = "SELECT c FROM Carro c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Carro.findByKm", query = "SELECT c FROM Carro c WHERE c.km = :km"),
    @NamedQuery(name = "Carro.findByArcondicionado", query = "SELECT c FROM Carro c WHERE c.arcondicionado = :arcondicionado"),
    @NamedQuery(name = "Carro.findByDirecaohidraulico", query = "SELECT c FROM Carro c WHERE c.direcaohidraulico = :direcaohidraulico")})
public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "km")
    private Integer km;
    @Column(name = "arcondicionado")
    private Boolean arcondicionado;
    @Column(name = "direcaohidraulico")
    private Boolean direcaohidraulico;
    
    @OneToMany(mappedBy = "idcarro")
    private Collection<Locacao> locacaoCollection;

    public Carro() {
    }

    public Carro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Boolean getArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(Boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public Boolean getDirecaohidraulico() {
        return direcaohidraulico;
    }

    public void setDirecaohidraulico(Boolean direcaohidraulico) {
        this.direcaohidraulico = direcaohidraulico;
    }

    @XmlTransient
    public Collection<Locacao> getLocacaoCollection() {
        return locacaoCollection;
    }

    public void setLocacaoCollection(Collection<Locacao> locacaoCollection) {
        this.locacaoCollection = locacaoCollection;
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
        if (!(object instanceof Carro)) {
            return false;
        }
        Carro other = (Carro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + ", arcondicionado=" + arcondicionado + ", direcaohidraulico=" + direcaohidraulico + ", locacaoCollection=" + locacaoCollection + '}';
    }

    
    
}
