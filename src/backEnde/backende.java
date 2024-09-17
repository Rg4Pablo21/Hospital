package backEnde;

import java.util.HashMap;
 class Validador{
    // Método para validar los datos de usuario y contraseña
    public HashMap<String, String> revisarDatos(String nombreUsuario, String claveUsuario) {
        HashMap<String, String> resultadoVerificacion = new HashMap<>();

        // Verificar si el usuario y la contraseña existen en la "base de datos"
        if (usuarioEsValido(nombreUsuario, claveUsuario)) {
            // Si los datos son correctos, retornar la información del usuario
            resultadoVerificacion.put("Usuario", nombreUsuario);
            resultadoVerificacion.put("Estado", "Éxito");
        } else {
            // Si los datos no son válidos, retornar un mensaje de error
            resultadoVerificacion.put("Error", "Usuario o contraseña incorrectos");
        }

        return resultadoVerificacion;
    }

    // Método simulado para verificar si el usuario y la contraseña son correctos
    private boolean usuarioEsValido(String nombreUsuario, String claveUsuario) {
        // Aquí se debería verificar en una base de datos real. Por ahora, simulamos que "admin" es válido
        return "admin".equals(nombreUsuario) && "admin123".equals(claveUsuario);
    }
}
