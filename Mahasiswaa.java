/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASPBO;

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
 * @author Lyra Geyska
 */
@Entity
@Table(name = "mahasiswaa")
@NamedQueries({
    @NamedQuery(name = "Mahasiswaa.findAll", query = "SELECT m FROM Mahasiswaa m"),
    @NamedQuery(name = "Mahasiswaa.findByNim", query = "SELECT m FROM Mahasiswaa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswaa.findByNama", query = "SELECT m FROM Mahasiswaa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswaa.findByAlamat", query = "SELECT m FROM Mahasiswaa m WHERE m.alamat = :alamat"),
    @NamedQuery(name = "Mahasiswaa.findByAsalsma", query = "SELECT m FROM Mahasiswaa m WHERE m.asalsma = :asalsma"),
    @NamedQuery(name = "Mahasiswaa.findByNamaortu", query = "SELECT m FROM Mahasiswaa m WHERE m.namaortu = :namaortu")})
public class Mahasiswaa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "asalsma")
    private String asalsma;
    @Column(name = "namaortu")
    private String namaortu;

    public Mahasiswaa() {
    }

    public Mahasiswaa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalsma() {
        return asalsma;
    }

    public void setAsalsma(String asalsma) {
        this.asalsma = asalsma;
    }

    public String getNamaortu() {
        return namaortu;
    }

    public void setNamaortu(String namaortu) {
        this.namaortu = namaortu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswaa)) {
            return false;
        }
        Mahasiswaa other = (Mahasiswaa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UASPBO.Mahasiswaa[ nim=" + nim + " ]";
    }
    
}
