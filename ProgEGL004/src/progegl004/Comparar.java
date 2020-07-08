package progegl004;

public class Comparar {
    public static void Comparar(String Frase)
    {
       String Cadena=Frase;
       int a=0, e=0, i=0, o=0, u=0;
       int Contador=0;
       
       Contador=Cadena.indexOf("A");
       while (Contador!=-1)
       {
           a++;
           Contador=Cadena.indexOf("A",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("a");
       while (Contador!=-1)
       {
           a++;
           Contador=Cadena.indexOf("a",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("E");
       while (Contador!=-1)
       {
           e++;
           Contador=Cadena.indexOf("E",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("e");
       while (Contador!=-1)
       {
           e++;
           Contador=Cadena.indexOf("e",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("I");
       while (Contador!=-1)
       {
           i++;
           Contador=Cadena.indexOf("I",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("i");
       while (Contador!=-1)
       {
           i++;
           Contador=Cadena.indexOf("i",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("O");
       while (Contador!=-1)
       {
           o++;
           Contador=Cadena.indexOf("O",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("o");
       while (Contador!=-1)
       {
           o++;
           Contador=Cadena.indexOf("o",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("U");
       while (Contador!=-1)
       {
           u++;
           Contador=Cadena.indexOf("U",Contador+1);
       }
       Contador=0;
       Contador=Cadena.indexOf("u");
       while (Contador!=-1)
       {
           u++;
           Contador=Cadena.indexOf("u",Contador+1);
       }
       Formulario.jTextField2.setText(""+a);
       Formulario.jTextField3.setText(""+e);
       Formulario.jTextField4.setText(""+i);
       Formulario.jTextField5.setText(""+o);
       Formulario.jTextField6.setText(""+u);
    }
}
