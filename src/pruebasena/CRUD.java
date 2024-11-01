/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasena;

import java.sql.*;

public class CRUD {
    // Método para insertar datos
    public void insertarDato(int id, String descripcion) {
        String query = "INSERT INTO tipos_telefono (id_tipo_tel, desc_tipo_tel) VALUES (?, ?)";
        Connection con = null; // Declaración de conexión
        try {
            con = dbConnection.conectar(); // Llama al método para conectar
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, descripcion);
            ps.executeUpdate();
            System.out.println("Dato insertado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar dato: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cierre de la conexión
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }

    // Método para leer datos
    public void leerDatos() {
        String query = "SELECT * FROM tipos_telefono"; // Consulta SQL
        Connection con = null; // Declaración de conexión
        ResultSet rs = null; // Declaración de ResultSet

        try {
            con = dbConnection.conectar(); // Llama al método para conectar
            PreparedStatement ps = con.prepareStatement(query);
            rs = ps.executeQuery(); // Ejecuta la consulta
            
            while (rs.next()) {
                int id = rs.getInt("id_tipo_tel"); // Asegúrate de que el nombre de la columna sea correcto
                String descripcion = rs.getString("desc_tipo_tel"); // Asegúrate de que el nombre de la columna sea correcto
                System.out.println("ID: " + id + " Descripción: " + descripcion); // Corrige printIn a println
            }
        } catch (SQLException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cierre de ResultSet y conexión
            try {
                if (rs != null) rs.close(); // Cerrar el ResultSet
                if (con != null) con.close(); // Cerrar la conexión
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // Método para actualizar datos
    public void actualizarDato(int id, String nuevaDescripcion) {
        String query = "UPDATE tipos_telefono SET desc_tipo_tel = ? WHERE id_tipo_tel = ?";
        Connection con = null; // Declaración de conexión
        try {
            con = dbConnection.conectar(); // Llama al método para conectar
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nuevaDescripcion);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate(); // Ejecuta la actualización
            
            if (rowsAffected > 0) {
                System.out.println("Dato actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un dato con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar dato: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cierre de la conexión
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }

    // Método para eliminar datos
    public void eliminarDato(int id) {
        String query = "DELETE FROM tipos_telefono WHERE id_tipo_tel = ?";
        Connection con = null; // Declaración de conexión
        try {
            con = dbConnection.conectar(); // Llama al método para conectar
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate(); // Ejecuta la eliminación
            
            if (rowsAffected > 0) {
                System.out.println("Dato eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un dato con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar dato: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cierre de la conexión
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}



