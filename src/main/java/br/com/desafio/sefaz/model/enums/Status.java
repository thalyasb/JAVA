package br.com.desafio.sefaz.model.enums;

public enum Status {
	
	EFETIVO("Efetivo"), AGUARDANDO("Aguardando");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return status;
    }

    @Override
    public String toString(){
        return this.status;
    }
}
