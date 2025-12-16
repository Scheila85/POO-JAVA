package Heranca_Interface_Polimorfismo.Autenticador_Senha;

public class Usuario implements Autenticavel {
    
    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login=login;
        this.senha=senha;
    }

    @Override
    public String autenticarLogin(String loginDigitado, String senhaDigitada) {
        if(login.equals(loginDigitado) & senha.equals(senhaDigitada)){
            return "Acesso liberado.";
        }else{
            return "Acesso negado! Senha ou usuário inválido.";
        }
    }
}
