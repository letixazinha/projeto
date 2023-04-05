package dominoproj;

public class Ouro extends Pedra{
    
        public int getValorOuro(){
            int valor;
            int[] pontas = new int[2];
            int ponta1 = pontas[0];
            int ponta2 = pontas[1];

             if(ponta1 > ponta2){
                 valor = ponta1 - ponta2;
         
         }
             else {
             valor = ponta2 - ponta1;
         }
             return valor;
     }
     }
    

