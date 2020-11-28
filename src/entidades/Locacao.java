/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.Cliente;
import entidades.Carro;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "locacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locacao.findAll", query = "SELECT l FROM Locacao l"),
    @NamedQuery(name = "Locacao.findById", query = "SELECT l FROM Locacao l WHERE l.id = :id"),
    @NamedQuery(name = "Locacao.findByDataretirada", query = "SELECT l FROM Locacao l WHERE l.dataretirada = :dataretirada"),
    @NamedQuery(name = "Locacao.findByData", query = "SELECT l FROM Locacao l WHERE l.data = :data"),
    @NamedQuery(name = "Locacao.findByDatadevolucao", query = "SELECT l FROM Locacao l WHERE l.datadevolucao = :datadevolucao")})
public class Locacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dataretirada")
    @Temporal(TemporalType.DATE)
    private Date dataretirada;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "datadevolucao")
    @Temporal(TemporalType.DATE)
    private Date datadevolucao;
    @JoinColumn(name = "idcarro", referencedColumnName = "id")
    @ManyToOne
    private Carro idcarro;
    
    @JoinColumn(name = "cpfcliente", referencedColumnName = "cpf")
    @ManyToOne
    private Cliente cpfcliente;

    public Locacao() {
    }

    public Locacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataretirada() {
        return dataretirada;
    }

    public void setDataretirada(Date dataretirada) {
        this.dataretirada = dataretirada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(Date datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public Carro getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(Carro idcarro) {
        this.idcarro = idcarro;
    }

    public Cliente getCpfcliente() {
        return cpfcliente;
    }

    public void setCpfcliente(Cliente cpfcliente) {
        this.cpfcliente = cpfcliente;
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
        if (!(object instanceof Locacao)) {
            return false;
        }
        Locacao other = (Locacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.bd.app.Locacao[ id=" + id + " ]";
    }
    
}
