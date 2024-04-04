/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiantesprogra;

/**
 *
 * @author Aulas Heredia
 */
public class TopEstudiantes {
    
    public String NombreEstudiante;
    public String curso;
    public String profesor;
    public int calificacion;

    public TopEstudiantes(String NombreEstudiante, String curso, String profesor, int calificacion) {
        this.NombreEstudiante = NombreEstudiante;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}

