package negocio.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Usuario implements Serializable {

    private String nome;
    private String identificacao;
    private String senha;
    private LocalDate dataDeNascimeto;

    public Usuario(String nome, String identificacao, String senha, LocalDate dataDeNascimeto) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.senha = senha;
        this.dataDeNascimeto = dataDeNascimeto;
    }

    // Método abstrato getTipo
    public abstract String getTipo();

    /**
     * Equals: Usuário
     */

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        if (obj instanceof Usuario) {
            Usuario param = (Usuario) obj;
            if ((param.getIdentificacao() != null) && param.getIdentificacao().equals(this.getIdentificacao())) {
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * toString: Usuario
     */
    @Override
    public String toString() {

        
        String resultado = "";
        resultado += "Nome: " + this.getNome();
        resultado += "\n" + "Data de Nascimento: " + this.getDataDeNascimeto().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        resultado += "\n" + "ID: " + this.getIdentificacao();
        return resultado;
    }

    public boolean validar() {
        // TODO Auto-generated method stub
        return true;
    }

    // Getters & Setters
    public LocalDate getDataDeNascimeto() {
        return dataDeNascimeto;
    }

    public void setDataDeNascimeto(LocalDate dataDeNascimeto) {
        this.dataDeNascimeto = dataDeNascimeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
