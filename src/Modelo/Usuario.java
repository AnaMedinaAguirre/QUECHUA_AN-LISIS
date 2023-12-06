
package Modelo;

public class Usuario {
    private String nombre;
    private String email;
    private int puntos;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void SumarPuntos(int respuestas){
        this.puntos += 5*respuestas;
    }

}
