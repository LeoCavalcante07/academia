package br.senai.sp.jandira.cliente;

public class Cliente {

	// Atributos
	private String nome;
	private String dtNasc;
	private double peso;
	private double altura;
	private String sexo;
	private double imc;
	private String nivel;
	private double tmb;
	private double fmc;
	

	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setIdade(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getImc(){
		this.imc = this.peso / ((this.altura / 100) * (this.altura / 100));
		return imc;
	}
	
	public void setImc(double imc){
		this.imc = imc;
	}
	
	public String getNivel(){
		return nivel;
	}
	
	public void setNivel(String nivel){
		this.nivel = nivel;
	}
	
	
	public double getTmb(){
		return tmb;
	}
	
	public void setTmb(double tmb){
		this.tmb = tmb;
	}

	
	public double getFmc(){
		
		return fmc;
	}
	
	public void setFmc(double fmc){
		this.fmc = fmc;
		
	}
	
	
	
	// Métodos
	public String calcImc(){
			
		if(imc <= 16.9){
			return "Muito abaixo do peso/nFádiga";
		}else if(imc >= 17 && imc <= 18.4){
			return "Abaixo do peso";
		}else if(imc >= 18.5 && imc <= 24.9){
			return "Peso Normal";
		}else if(imc >= 25 && imc <= 29.9){
			return "Acima do peso";
		}else if(imc >= 30 && imc <= 34.9){
			return "Obesidade Grau I";
		}else if(imc >= 35 && imc <= 40){
			return "Obesidade Grau II";
		}else{
			return "Obesidade Grau III";
		}
			
	}
	
	
	public void calcTmb(){	
		//definidno calculo de homem e mulher
		/*if(sexo == "Homem"){
			tmb = 66 + (13.7 * peso) +  (5 * altura) - (6.8 * idade);		
		}else{
			tmb = 665 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade );		
		}*/
		
		//atribuindo nivel de atividade a formula
		if(nivel == "Sedentário"){
			tmb = tmb * 1.20;
		}else if(nivel == "Levemente ativo"){
			tmb = tmb * 1.37;
		}else if(nivel == "Moderadamente ativo"){
			tmb = tmb * 1.55;
		}else if(nivel == "Bastante ativo"){
			tmb = tmb * 1.72;
		}else{
			tmb = tmb * 1.90;
		}
		
	}
	
	
	public void calcFmc(){
		/*if(sexo== "Homem"){
			fmc = ((210 - (0.5 * idade)) - peso / 100)+ 4;
			
		}*/
		/*else{
			fmc = ((210 - (0.5 * idade)) - peso / 100);
		

		}*/
		
	}
	
	
	
}
