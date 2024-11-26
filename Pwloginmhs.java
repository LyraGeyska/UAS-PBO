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
@Table(name = "pwloginmhs")
@NamedQueries({
    @NamedQuery(name = "Pwloginmhs.findAll", query = "SELECT p FROM Pwloginmhs p"),
    @NamedQuery(name = "Pwloginmhs.findByUsername", query = "SELECT p FROM Pwloginmhs p WHERE p.username = :username"),
    @NamedQuery(name = "Pwloginmhs.findByPassword", query = "SELECT p FROM Pwloginmhs p WHERE p.password = :password")})
public class Pwloginmhs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public Pwloginmhs() {
    }

    public Pwloginmhs(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pwloginmhs)) {
            return false;
        }
        Pwloginmhs other = (Pwloginmhs) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UASPBO.Pwloginmhs[ username=" + username + " ]";
    }
    
}
