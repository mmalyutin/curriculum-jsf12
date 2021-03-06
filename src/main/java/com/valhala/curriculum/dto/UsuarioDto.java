/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.curriculum.dto;

import java.io.Serializable;

/**
 * @author bruno
 */
public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = -9216022405443925385L;
	
    private Integer id;
    private String nome;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(obj instanceof UsuarioDto)) {
            return false;
        }
        final UsuarioDto other = (UsuarioDto) obj;
        
        return this.email.equals(other.email);
    }

    @Override
    public String toString() {
    	return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + '}';
    }

}
