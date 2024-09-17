package backEnde;

public class ValidadorDeUsuarios {
    public boolean validar(String usuario, String contrasena) {
        return "usuario".equals(usuario) && "contrasena".equals(contrasena);
    }
}