package POO_Exercicios_3.q4;

public class Main {
    public static void main(String[] args){
        Data data1 = new Data(13, 05, 1996);
        data1.imprimePrimeiroFormato();
        Data data12 = new Data(13, 05, 2022);
        data12.imprimePrimeiroFormato();

        Data data2 = new Data("Maio", 13, 1996);
        data2.imprimeSegundoFormato();
        Data data22 = new Data("Maio", 13, 2022);
        data22.imprimeSegundoFormato();

        Data data3 = new Data(134, 1996);
        data3.imprimeTerceiroFormato();
        Data data32 = new Data(134, 2022);
        data32.imprimeTerceiroFormato();
    }
}
