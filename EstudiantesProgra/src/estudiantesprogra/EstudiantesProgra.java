/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantesprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EstudiantesProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TopEstudiantes arrEstudiantes[] = new TopEstudiantes[10];
            for(int i=0; i<arrEstudiantes.length; i++){
                JOptionPane.showConfirmDialog(null, "Datos: ");
                String NombreEstudiante = JOptionPane.showInputDialog("Nombre del estudiante");
                String curso = JOptionPane.showInputDialog("Nombre del curso?: ");
                String profesor = JOptionPane.showInputDialog("Nombre del profesor: ");
                int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Cual es su calificación?: "));
                    arrEstudiantes[i] = new TopEstudiantes(NombreEstudiante,curso,profesor,calificacion);
            for (i=0;i<10;i++){
                JOptionPane.showConfirmDialog(null, arrEstudiantes[i].getNombreEstudiante()+ "Curso: "+arrEstudiantes[i].getCurso()+ "Profesor: "+arrEstudiantes[i].getProfesor()+ " " +arrEstudiantes[i]+ "Calificación " +arrEstudiantes[i].getCalificacion());    
            }
            }
            
    }       
                
                
    }
    
