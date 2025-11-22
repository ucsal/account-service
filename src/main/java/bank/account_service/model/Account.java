package bank.account_service.model;

public class Account {

    private Long id;
    private String tipoConta;


    public Account() {
    }

    public Account(Long id, String tipoConta) {
        this.id = id;
        this.tipoConta = tipoConta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}


