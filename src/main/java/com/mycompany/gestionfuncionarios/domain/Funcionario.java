package com.mycompany.gestionfuncionarios.domain;

public class Funcionario {

    private int id_funcionario;
    private String nombre;
    private String apellido;
    private String tipo_identificacion;
    private String direccion;
    private String sexo;
    private String f_nacimiento;
    private int tel;
    private int num_documento;
    private String nivel_educativo;

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String id_nivel_educativo) {
        this.nivel_educativo = id_nivel_educativo;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
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

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(int num_documento) {
        this.num_documento = num_documento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

}
