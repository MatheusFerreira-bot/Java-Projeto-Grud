
package Fornecedor;

public class Fornecedor {
    
    private int CodFornecedor;
    private String NomeEmpresa;
    private long CNPJ;
    private String Endereco;
    private long Telefone;
    private String Email;
    private String NomeContato;
    private String Tipo;
    private String CondPagamento;
    private String PrazoEntrega;

    public int getCodFornecedor() {
        return CodFornecedor;
    }

    public void setCodFornecedor(int CodFornecedor) {
        this.CodFornecedor = CodFornecedor;
    }
    
    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public long getTelefone() {
        return Telefone;
    }

    public void setTelefone(long Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNomeContato() {
        return NomeContato;
    }

    public void setNomeContato(String NomeContato) {
        this.NomeContato = NomeContato;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCondPagamento() {
        return CondPagamento;
    }

    public void setCondPagamento(String CondPagamento) {
        this.CondPagamento = CondPagamento;
    }

    public String getPrazoEntrega() {
        return PrazoEntrega;
    }

    public void setPrazoEntrega(String PrazoEntrega) {
        this.PrazoEntrega = PrazoEntrega;
    }

    
    
}