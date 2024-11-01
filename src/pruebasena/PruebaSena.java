/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasena;

/**
 *
 * @author jonyA
 */
public class PruebaSena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dbConnection dbc=new dbConnection();
        //dbc.conectar();
        
        CRUD operaciones=new CRUD();
        
        //operaciones.insertarDato(2,"PERSONAL");
        
        //operaciones.leerDatos();
        
        //operaciones.actualizarDato(4, "PERSONAL 2 de prueba");
        
        operaciones.eliminarDato(3);
    }
    
}
