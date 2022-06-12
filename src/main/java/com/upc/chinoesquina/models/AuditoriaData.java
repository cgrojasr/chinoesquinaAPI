package com.upc.chinoesquina.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AuditoriaData {
    private Boolean activo;
    @JsonIgnore
    @Column(name = "id_usuario_registro")
    private Integer idUsuarioRegistro;

    @JsonIgnore
    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @JsonIgnore
    @Column(name = "id_usuario_modifico")
    private Integer idUsuarioModifico;

    @JsonIgnore
    @Column(name = "fecha_modifico")
    private Date fechaModifico;

    @JsonIgnore
    private Boolean eliminado;

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getIdUsuarioRegistro() {
        return idUsuarioRegistro;
    }

    public void setIdUsuarioRegistro(Integer idUsuarioRegistro) {
        this.idUsuarioRegistro = idUsuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdUsuarioModifico() {
        return idUsuarioModifico;
    }

    public void setIdUsuarioModifico(Integer idUsuarioModifico) {
        this.idUsuarioModifico = idUsuarioModifico;
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
