package app.entity;

public class Empleado {
    private String nombre, rfc, curp, direccion, tipo;
    private int telefono, edad;
    private char sexo;

    public Empleado (){}
    
    public Empleado(String nombre, String rfc, String curp, String direccion, String tipo, int telefono, int edad, char sexo) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.curp = curp;
        this.direccion = direccion;
        this.tipo = tipo;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
