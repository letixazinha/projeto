package dominoproj;

public class Diamante extends Pedra{
    public int getValorDiamante(){
            int valor;
            int[] pontas = new int[2];
            int ponta1 = pontas[0];
            int ponta2 = pontas[1];

         if(ponta1 > ponta2){
             valor = (ponta2*ponta2) - (ponta1*ponta1);
     
     }
         else {
         valor = ponta1 - ponta2;
     }
         return valor;
     }

     }
