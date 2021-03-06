/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.curriculum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 * @author bruno
 */
@Entity
@Table(name = "tb_usuario")
public class Usuario extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 6995562910263380576L;
	
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, Set<Curriculo> curriculos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 21;
        hash = 31 * hash + (this.email == null ? 0 : this.email.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Usuario)) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        
        return this.email.equals(other.email);
    }

    @Override
    public String toString() {
    	return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + '}';
    }

}
