package com.portfolio.ism.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    
    private String linkP;

    public DtoProyectos() {
    }

    public DtoProyectos(String nombreP, String descripcionP, String linkP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.linkP = linkP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }
}