package com.portfolio.ism.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String empresaE;
    @NotBlank
    private String descripcionE;
    
    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreE, String empresaE, String descripcionE) {
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }
    
    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
}