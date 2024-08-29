package Funcionario;

public class Funcionario {

    private int CodFuncionario;
    private String NomeCompleto;
    private long CPF;
    private String Endereco;
    private long Telefone;
    private String Email;
    private String DataAdmissao;
    private String Cargo;
    private float Salario;
    private String Departamento;

    public int getCodFuncionario() {
        return CodFuncionario;
    }

    public void setCodFuncionario(int CodFuncionario) {
        this.CodFuncionario = CodFuncionario;
    }
    
    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
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

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

}
