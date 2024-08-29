create database objetos;

create table login(
	CodLogin int not null primary key auto_increment,
	Usuario varchar(50) not null,
	Senha varchar(15) not null,
	Status varchar(20) not null
)

create table Cliente(
	CodCliente int not null primary key auto_increment,
	Nome varchar(100) not null,
	CPF varchar(11) not null,
	Endereco varchar(150) not null,
	Telefone int not null,
	Email varchar(100) not null,
	DataNascimento varchar(20) not null,
	Sexo varchar(15) not null,
	EstadoCivil varchar(20) not null,
	Profissao varchar(100) not null
);

create table Produtos(
	CodProduto int not null primary key auto_increment,
	NomeProduto varchar(100) not null,
	CodigoProduto varchar(30) not null,
	Descricao varchar(150) not null,
	Preco decimal(10,2) not null,
	QuantidadeEstoque int not null,
	Categoria varchar(100) not null,
	DataValidade varchar(20) not null,
	Fornecedor varchar(30) not null,
	LocEstoque varchar(150) not null
);

create table Funcionario(
	CodFuncionario int not null primary key auto_increment,
	NomeCompleto varchar(150) not null,
	CPF int(11) not null,
	Endereco varchar(150) not null,
	Telefone int(20) not null,
	Email varchar(100) not null,
	DataAdmissao varchar(20) not null,
	Cargo varchar(50) not null,
	Salario decimal(10,2) not null,
	Departamento varchar(100) not null
);

create table Fornecedor(
	CodFornecedor int not null primary key auto_increment,
	NomeEmpresa varchar(150) not null,
	CNPJ int(14) not null,
	Endereco varchar(150) not null,
	Telefone int(20) not null,
	Email varchar(100) not null,
	NomeContato varchar(100) not null,
	Tipo varchar(50) not null,
	CondPagamento varchar(50) not null,
	PrazoEntrega varchar(30) not null
);

create table Alunos(
	CodAlunos int not null primary key auto_increment,
	Nome varchar(100) not null,
	CPF varchar(11) not null,
	Endereco varchar(150) not null,
	Telefone int not null,
	Email varchar(100) not null,
	DataNasc varchar(20) not null,
	SerieAno int not null,
	NomeResponsavel varchar(100),
	EscolaOrigem varchar(150)
);

create table Veiculo(
	CodVeiculo int not null primary key auto_increment,
	PlacaVeiculo varchar(20) not null,
	Marca varchar(30) not null,
	Modelo varchar(30) not null,
	AnoFabricacao year not null,
	Cor varchar(20) not null,
	TipoCombustivel varchar(20) not null,
	NumeroChassi int not null,
	Quilometragem decimal(10,2) not null,
	DataRevisao varchar(20) not null
);

create table Eventos(
	CodEventos int not null primary key auto_increment,
	NomeEvento varchar(200) not null,
	DataEvento varchar(20) not null,
	HorarioInicio varchar(50) not null,
	HorarioTermino varchar(50) not null,
	LocalEvento varchar(150) not null,
	Descricao varchar(150) not null,
	Publico varchar(100) not null,
	CapacidadeMax int not null,
	Organizador varchar(150) not null
);

create table ContaPagar(
	CodContaPagar int not null primary key auto_increment,
	DescricaoConta varchar(300) not null,
	Preco decimal(10,2) not null,
	DataVencimento varchar(20) not null,
	DataPagamento varchar(20) not null,
	Fornecedor varchar(50) not null,
	Categoria varchar(50) not null,
	StatusPag varchar(20) not null,
	MetodoPag varchar(20) not null,
	Observacao varchar(200) not null
);

create table Livros(
	CodLivros int not null primary key auto_increment,
	Titulo varchar(150) not null,
	Autor varchar(100) not null,
	ISBN int not null,
	Editora varchar(30) not null,
	AnoPub year not null,
	Genero varchar(20) not null,
	NumPag int not null,
	Idioma varchar(20) not null,
	LocBiblioteca varchar(100) not null
);
