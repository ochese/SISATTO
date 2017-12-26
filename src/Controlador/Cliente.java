/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Date;

/**
 *
 * @author oches_000
 */
public class Cliente {
    private String Nombre_Cliente;
    private String Apellido_Cliente;
    private int DNI_Cliente;
    private Date Fecha_Cumpleaños_cliente;

    public Cliente(String Nombre_Cliente, String Apellido_Cliente, int DNI_Cliente, Date Fecha_Cumpleaños_cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
        this.Apellido_Cliente = Apellido_Cliente;
        this.DNI_Cliente = DNI_Cliente;
        this.Fecha_Cumpleaños_cliente = Fecha_Cumpleaños_cliente;
    }

    
    
    
    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getApellido_Cliente() {
        return Apellido_Cliente;
    }

    public void setApellido_Cliente(String Apellido_Cliente) {
        this.Apellido_Cliente = Apellido_Cliente;
    }

    public int getDNI_Cliente() {
        return DNI_Cliente;
    }

    public void setDNI_Cliente(int DNI_Cliente) {
        this.DNI_Cliente = DNI_Cliente;
    }

    public Date getFecha_Cumpleaños_cliente() {
        return Fecha_Cumpleaños_cliente;
    }

    public void setFecha_Cumpleaños_cliente(Date Fecha_Cumpleaños_cliente) {
        this.Fecha_Cumpleaños_cliente = Fecha_Cumpleaños_cliente;
    }
    
    

}
