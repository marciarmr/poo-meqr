/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

/**
 *
 * @author T-102
 */
public class Empleado {
    
    private String nombre;
    private String materno;
    private String paterno;
    private Float sueldoBase;
    private String departamento;

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", materno=" + materno + ", paterno=" + paterno + ", sueldoBase=" + sueldoBase + ", departamento=" + departamento + '}';
    }
    
    public Empleado(String nombre, String materno, String paterno, Float sueldoBase, String departamento) {
        this.nombre = nombre;
        this.materno = materno;
        this.paterno = paterno;
        this.sueldoBase = sueldoBase;
        this.departamento = departamento;
    }
    
     public Empleado(){
        
        }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public Float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
}
