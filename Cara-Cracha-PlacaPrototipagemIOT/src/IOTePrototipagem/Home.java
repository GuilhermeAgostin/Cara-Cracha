package IOTePrototipagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Home 
{
    public SimpleDateFormat formato;
    public static void main(String[] args)  
    {
        String[] Placas = new String [4];

        Placa PrimeiraPlaca = new Placa("ArduinoUno", 16, false);
        PrimeiraPlaca.SetAnoLancamento("2010");
        PrimeiraPlaca.GetAnoDeLancamento();
        PrimeiraPlaca.Cor = "Azul";
        PrimeiraPlaca.GetNome();
        PrimeiraPlaca.GetCor();
        PrimeiraPlaca.SetEspecificacoes();
        
        try 
        {
            PrimeiraPlaca.GetWiFi();
        }
        catch (Exception e){}

        try 
        {
            PrimeiraPlaca.GetBluetooth();
        }
        catch (Exception e){}

        PrimeiraPlaca.GetMicroprocessador();
        PrimeiraPlaca.GetGPIO();

        Placas[0] = PrimeiraPlaca.Nome;

        PrimeiraPlaca.Divisao();

        Placa SegundaPlaca = new Placa("RaspberryPi3", 40, true);
        SegundaPlaca.SetAnoLancamento("2016");
        SegundaPlaca.GetAnoDeLancamento();
        SegundaPlaca.Cor = "Verde";
        SegundaPlaca.GetNome();
        SegundaPlaca.GetCor();
        SegundaPlaca.SetEspecificacoes();

        try 
        {
            SegundaPlaca.GetWiFi();
        }
        catch (Exception e){}

        SegundaPlaca.GetBluetooth();
        SegundaPlaca.GetMicroprocessador();
        SegundaPlaca.GetGPIO();
        SegundaPlaca.Divisao();

        Placas[1] = SegundaPlaca.Nome;

        Placa TerceiraPlaca = new Placa("SipeedMaixBit", 35, true);

        TerceiraPlaca.SetAnoLancamento("2019");
        TerceiraPlaca.GetAnoDeLancamento();
        TerceiraPlaca.Cor = "Preto";
        TerceiraPlaca.GetNome();
        TerceiraPlaca.GetCor();
        TerceiraPlaca.SetEspecificacoes();

        try 
        {
            TerceiraPlaca.GetWiFi();
        }
        catch (Exception e){}

        try 
        {
            TerceiraPlaca.GetBluetooth();
        }
        catch (Exception e){}

        TerceiraPlaca.GetMicroprocessador();
        TerceiraPlaca.GetGPIO();
        TerceiraPlaca.Divisao();

        Placas[2] = TerceiraPlaca.Nome;

        Placa QuartaPlaca = new Placa("Esp32", 25, true);

        QuartaPlaca.SetAnoLancamento("2016");
        QuartaPlaca.GetAnoDeLancamento();
        QuartaPlaca.Cor = "Preto";
        QuartaPlaca.GetNome();
        QuartaPlaca.GetCor();
        QuartaPlaca.SetEspecificacoes();

        try 
        {
            QuartaPlaca.GetWiFi();
        }
        catch (Exception e){}

        try 
        {
            QuartaPlaca.GetBluetooth();
        }
        catch (Exception e){}

        QuartaPlaca.GetMicroprocessador();
        QuartaPlaca.GetGPIO();
        QuartaPlaca.Divisao();

        Placas[3] = QuartaPlaca.Nome;

        System.out.println("\nForam inseridas as placas: \n");

        for (String i : Placas) 
        {
            System.out.println(i + "\n");
        }
        
    }
    
}
