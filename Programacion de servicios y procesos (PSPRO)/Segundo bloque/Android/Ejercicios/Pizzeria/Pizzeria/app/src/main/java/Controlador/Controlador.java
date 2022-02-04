package Controlador;

import android.os.Build;

import androidx.annotation.RequiresApi;

import Clases.Usuario;
import modelo.DAOPizzeria;

public class Controlador {
    public static boolean registrarUsuario(String email, String passwd){
        Usuario u = new Usuario(email, passwd);

        return DAOPizzeria.getInstance().insertarUsuario(u);
    }

    public static boolean usuarioExist(String email){
        boolean existe=false;
        for(int i  = 0; i < DAOPizzeria.getInstance().listarUsuarios().size(); i++){
            if (DAOPizzeria.getInstance().listarUsuarios().get(i).getEmail().equals(email)) {
                existe = true;
                i = DAOPizzeria.getInstance().listarUsuarios().size();
            }
        }

        return existe;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static boolean comprobarLogin(String email, String passwd){
        boolean errores=false;
        if(DAOPizzeria.getInstance().listarUsuarios().isEmpty()) {
            errores = true;
        }
        else
        {
            for (Usuario u : DAOPizzeria.getInstance().listarUsuarios()) {
                if (!u.getEmail().equals(email) && u.getPassword().equals(passwd)) {
                    errores = true;
                }
                else {
                    errores = false;
                    break;
                }
            }
        }

        return errores;
    }

    public static Usuario tomarUsuario(String email){
        return DAOPizzeria.getInstance().sacarUsuario(email);
    }
}
