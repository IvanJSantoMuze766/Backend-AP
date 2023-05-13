package com.portfolio.ism.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String institucionE;
    @NotBlank
    private String descripcionE;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE, String institucionE, String descripcionE) {
        this.nombreE = nombreE;
        this.institucionE = institucionE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }
    
    public String getInstitucionE() {
        return institucionE;
    }

    public void setInstitucionE(String institucionE) {
        this.institucionE = institucionE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
}