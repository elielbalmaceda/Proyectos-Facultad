package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChico;
    private String nombreCompleto;
    private String mailChico; 

    // Getters y setters

    public int getIdChico() {
        return idChico;
    }
    public void setIdChico(int idChico) {
        this.idChico = idChico;
    }
    
        public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

         public String getMailChico() {
        return mailChico;
    }
    public void setMailChico(String mailChico) {
        this.mailChico = mailChico;
    }
}
