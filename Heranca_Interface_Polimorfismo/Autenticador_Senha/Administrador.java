package Heranca_Interface_Polimorfismo.Autenticador_Senha;

public class Administrador implements Autenticavel {
    private String loginAdm;
    private String senhaAdm;

    public Administrador(String loginAdm, String senhaAdm){
        this.loginAdm=loginAdm;
        this.senhaAdm=senhaAdm;
    }

        @Override
    public String autenticarLogin(String loginDigitado, String senhaDigitada) {
        if(loginAdm.equals(loginDigitado) & senhaAdm.equals(senhaDigitada)){
            return "Acesso liberado.";
        }else{
            return "Acesso negado! Senha ou usuário inválido.";
        }
    }
}
