package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa {

private String documento;
private String tipo;

public PessoaJuridica(String doc,String tip){
    this.documento = doc;
    this.tipo = tip;

}

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String falarDocumento(){
        return "Documento: "+getDocumento();
    }

    


}