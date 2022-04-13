package POO_Exercicios_3.q4;

public class Data {
    private int dia;
    private int dias;
    private int mesN;
    private int ano;
    private String mesS;
    
    Data(int dia, int mesN, int ano){
        this.dia = dia;
        this.mesN = mesN;
        this.ano = ano;
    }

    Data(String mesS, int dia, int ano){
        this.dia = dia;
        this.mesS = mesS;
        this.ano = ano;
    }

    Data(int dias, int ano){
        this.dias = dias;
        this.ano = ano;
    }

    public void imprimePrimeiroFormato(){
        System.out.println("Data: " + dia + "/" + mesN + "/" + ano);
    }
    
    public void imprimeSegundoFormato(){
        System.out.println("Data: " + mesS + " " + dia + ", " + ano);
    }
    
    public void imprimeTerceiroFormato(){
        System.out.println("Data: " + dias + " " + ano);
    }
}
