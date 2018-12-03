
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCases {

    NextDate sistema;

    @BeforeEach
    public void init(){
        sistema = null;
        sistema = new NextDate(8,2,1998);
    }


    @Test//Teste para um mês com 31 dias
    public void run1(){

        assertEquals("8/3/1998",sistema.run(8,2,1998));
    }

    @Test//Teste para um mês com 31 dias e é enviado o ultimo dia
    public void run2(){
        assertEquals("9/1/1998",sistema.run(8,31,1998));
    }

    @Test//Teste para um mês com 30 dias
    public void run3(){
        assertEquals("4/3/1998",sistema.run(4,2,1998));
    }

    @Test//Teste para um mês com 30 dias e é enviado o ultimo dia
    public void run4(){

        assertEquals("5/1/1998",sistema.run(4,30,1998));
    }

    @Test//Teste para um mês com 30 dias mas o dia é inválido
    public void run5(){
        assertEquals("Invalid Input Date", sistema.run(4,32,1998));
    }

    @Test//Teste para o mês de dezembro
    public void run6(){
        assertEquals("12/2/1998",sistema.run(12,1,1998));
    }

    @Test//Teste para o mês de dezembro e é enviado o ultimo dia
    public void run7(){
        assertEquals("1/1/1999",sistema.run(12,31,1998));
    }

    @Test//Teste para o mês de dezembro com o ano = 2021
    public void run8(){
        assertEquals("Invalid Next Year",sistema.run(12,31,2021));
    }

    @Test//Teste para o mês de fevereiro
    public void run9(){
        assertEquals("2/2/1998",sistema.run(2,1,1998));
    }

    @Test//Teste para o mês de fevereiro com o dia = 28 num ano bissexto
    public void run10(){
        assertEquals("2/29/2016",sistema.run(2,28,2016));
    }

    @Test//Teste para o mês de fevereiro com o dia = 28 num ano não bissexto
    public void run11(){
        assertEquals("3/1/2017",sistema.run(2,28,2017));
    }

    @Test//Teste para o mês de fevereiro com o dia = 29 num ano bissexto
    public void run12(){
        assertEquals("3/1/2016",sistema.run(2,29,2016));
    }

    @Test//Teste para o mês de fevereiro com o dia = 29 num ano não bissexto
    public void run13(){
        assertEquals("Invalid Input Date",sistema.run(2,29,2017));
    }

    @Test
    public void run14(){
        assertEquals("Invalid Input Date",sistema.run(2,30,2017));
    }
}
