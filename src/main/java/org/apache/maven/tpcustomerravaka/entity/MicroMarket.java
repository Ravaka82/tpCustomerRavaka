/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.apache.maven.tpcustomerravaka.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author user
 */
@Entity
@Table(name = "micro_market")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MicroMarket.findAll", query = "SELECT m FROM MicroMarket m"),
    @NamedQuery(name = "MicroMarket.findByMarketId", query = "SELECT m FROM MicroMarket m WHERE m.marketId = :marketId"),
    @NamedQuery(name = "MicroMarket.findByMarketName", query = "SELECT m FROM MicroMarket m WHERE m.marketName = :marketName"),
    @NamedQuery(name = "MicroMarket.findByMarketArea", query = "SELECT m FROM MicroMarket m WHERE m.marketArea = :marketArea")})
public class MicroMarket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "market_id")
    private Integer marketId;
    @Size(max = 100)
    @Column(name = "market_name")
    private String marketName;
    @Size(max = 255)
    @Column(name = "market_area")
    private String marketArea;

    public MicroMarket() {
    }

    public MicroMarket(Integer marketId) {
        this.marketId = marketId;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketArea() {
        return marketArea;
    }

    public void setMarketArea(String marketArea) {
        this.marketArea = marketArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marketId != null ? marketId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MicroMarket)) {
            return false;
        }
        MicroMarket other = (MicroMarket) object;
        if ((this.marketId == null && other.marketId != null) || (this.marketId != null && !this.marketId.equals(other.marketId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.apache.maven.tpcustomerravaka.entity.MicroMarket[ marketId=" + marketId + " ]";
    }
    
}
