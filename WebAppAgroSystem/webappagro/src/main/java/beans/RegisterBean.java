package beans;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class RegisterBean {



    private String nome;
    private String email;
    private String senha;

    public RegisterBean(String nome, String email, String senha) {

        super();

        this.email = email;
        this.nome = nome;
        this.senha = senha;
    

    }

    public static BigInteger Criptografarsenha(String senha) {

        MessageDigest md5;
        BigInteger senhaCrip = null;

        try {

            md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update(senha.getBytes(), 0, senha.length());

            senhaCrip = new BigInteger(1, md5.digest());

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return senhaCrip;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getSenha() {

        return senha;

    }

    public void setSenha(String senha) {

        this.senha = senha;

    }


}