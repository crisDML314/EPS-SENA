/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Usuario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Vistas.Admin_AgregarMedicos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADSI
 */
public class AdminMedicoController {
    
    static Usuario user = new Usuario();
    
    public void ValidarAddUsuarioMedico(String TipoDocumento, String Documento, 
            String Nombre, String Contraseña, String Consultorio,int rol){
        try{
            user.TipoDocumento = TipoDocumento;
            user.Documento = Integer.parseInt(Documento);
            user.Nombre = Nombre;
            user.Contraseña = Contraseña;
            user.Consultorio = Consultorio;
            user.rol = rol;
            boolean response = user.AddUsuario();
            if(response){
                JOptionPane.showMessageDialog(null, "Medico insertado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar al Medico");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
