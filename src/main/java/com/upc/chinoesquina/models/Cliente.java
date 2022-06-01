package com.upc.chinoesquina.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    private String nombre;
    private String apellido;
    private Integer id_documento_identidad;
    private String nro_documento;
    private String email;
    private Boolean activo;
    private Integer id_usuario_registro;
    private Date fecha_registro;
    private Integer id_usuario_modifico;
    private Date fecha_modifico;
    private Boolean eliminado;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId_documento_identidad() {
        return id_documento_identidad;
    }

    public void setId_documento_identidad(Integer id_documento_identidad) {
        this.id_documento_identidad = id_documento_identidad;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getId_usuario_registro() {
        return id_usuario_registro;
    }

    public void setId_usuario_registro(Integer id_usuario_registro) {
        this.id_usuario_registro = id_usuario_registro;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Integer getId_usuario_modifico() {
        return id_usuario_modifico;
    }

    public void setId_usuario_modifico(Integer id_usuario_modifico) {
        this.id_usuario_modifico = id_usuario_modifico;
    }

    public Date getFecha_modifico() {
        return fecha_modifico;
    }

    public void setFecha_modifico(Date fecha_modifico) {
        this.fecha_modifico = fecha_modifico;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
