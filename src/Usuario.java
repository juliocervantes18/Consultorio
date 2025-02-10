public class Usuario {
    private String usuario;
    private String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public boolean validaracceso(String user, String pass) {
        return this.usuario.equals(user) && this.contraseña.equals(pass);
    }
}

