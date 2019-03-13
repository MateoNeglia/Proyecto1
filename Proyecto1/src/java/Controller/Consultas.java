package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Digital Gate
 */
public class Consultas extends Connex {

    public boolean authentication(String usuario, String pass) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consult = "select * from usuarios where usuario = ? and pass= ?";
            pst = getConnex().prepareStatement(consult);
            pst.setString(1, usuario);
            pst.setString(2, pass);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);

        } finally {
            try {
                if (getConnex() != null) {
                    getConnex().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        return false;
    }

    /*public static void main(String[] args) {
    Consultas cons = new Consultas();
    System.out.println(cons.authentication("juandomingoperon", "1234"));
    
    }*/
    public boolean registrar(String nombre, String apellido, String usuario, String pass) {

        PreparedStatement pst = null;

        try {
            String consulta = "insert into usuarios (usuario, apellido, nombre, pass) values (?, ?, ?, ?)";
            pst = getConnex().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, apellido);
            pst.setString(3, nombre);
            pst.setString(4, pass);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {

            System.err.println("ERROR" + ex);
        } finally {
            try {
                if (getConnex() != null) {
                    getConnex().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("ERROR" + e);
            }
        }

        return false;

    }
    public static void main(String[] args) {
    Consultas cons = new Consultas();
    System.out.println(cons.registrar("Lucas", "Costa", "isopopo", "654"));
    }
}
