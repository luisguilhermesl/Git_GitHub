package com.mycompany._funcoesmat;

public class _FuncoesMat {

    public static void main(String[] args) {
        
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;
        
        //RAIZ QUADRADA
        /*
        Estamos calculando a raiz quadrada dos valores de x, y e 25.0 usando o 
        método Math.sqrt(), que retorna a raiz quadrada do valor passado como 
        argumento.
        */
        
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        
        System.out.println("RESULTADO EM RAIZ QUADRADA");
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 25 = " + c);
        
        // POTÊNCIA
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        
        System.out.println("\nRESULTADO EM POTÊNCIA");
        System.out.println(x + "elevado a " + y + " = " + a);
        System.out.println(x + "elevado ao quadrado = " + b);
        System.out.println("5 elevado ao quadrado = "+ c);

        //VALOR ABSOLUTO
        /*
        O valor absoluto de um número é o seu valor próprio, independentemente 
        da posição que ocupa no número. Por exemplo, no número 257, o valor 
        absoluto do 7 é 7, do 5 é 5 e do 2 é 2.  Além disso, o valor absoluto 
        de um número também representa a sua distância até zero numa reta 
        numérica. É sempre um valor positivo. Por exemplo, a distância entre 
        zero e três é 3, e a distância entre -3 e zero também é 3. 
        */
        a = Math.abs(y);
        b = Math.abs(z);
        
        System.out.println("\nRESULTADO EM VALOR ABSOLUTO");
        System.out.println("Valor absoluto de " + y + " = " + a);
        System.out.println("Valor absoluto de " + z + " = " + b);
        
       
    }
}
