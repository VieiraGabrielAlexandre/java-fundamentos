package classe;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;
            System.out.println("outro: " + outro.nome);
            System.out.println("obj: " + this.nome);
            return this.nome.equals(outro.nome) && this.email.equals(outro.email);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + email.hashCode();
    }
}
