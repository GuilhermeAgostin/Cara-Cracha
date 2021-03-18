package IOTePrototipagem;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Placa 
{
    public String Nome;
    private boolean ConexaoBluetooth;
    private boolean ConexaoWifi;
    public String Cor;
    private Date AnoDeLancamento = null;
    private int GPIO; // General Purpose Input/Output 
    private boolean Microprocessador;

    public void SetConexaoBluetooth() 
    {
        switch(Nome) {
            case "ArduinoUno":
              ConexaoBluetooth = false;
              break;
            case "SipeedMaixBit":
              ConexaoBluetooth = false;
              break;
            case "RaspberryPi3":
              ConexaoBluetooth = true;
              break;
            case "Esp32":
              ConexaoBluetooth = true;
              break;
        }
    }

    public void GetBluetooth() 
    {
        System.out.println(ConexaoBluetooth ? "\nÉ possível conectar ao Bluetooth" : "\nNão é possível se conectar ao Bluetooth"); 

    }

    public void SetEspecificacoes() 
    {
        switch(Nome) {
            case "ArduinoUno":
              ConexaoWifi = false;
              ConexaoBluetooth = false;
              break;
            case "SipeedMaixBit":
              ConexaoWifi = false;
              ConexaoBluetooth = false;
              break;
            case "RaspberryPi3":
              ConexaoWifi = true;
              ConexaoBluetooth = true;
              break;
            case "Esp32":
              ConexaoWifi = true;
              ConexaoBluetooth = true;
              break;
        }
    }

    public void ExecutarConsole(String texto) 
    {
        System.out.println(texto);
    }

    public String GetNome() 
    {
        System.out.println("\nO nome da placa é " + this.Nome);
        return Nome;
    }

    public String GetCor() 
    {
        System.out.println("\nA Cor da placa é " + this.Cor);
        return Cor;
    }

    public void GetWiFi() 
    {
        System.out.println(ConexaoWifi ? "\nÉ possível conectar ao Wi-Fi" : "\nNão é possível se conectar ao Wi-Fi"); 
    }

    public boolean GetMicroprocessador() 
    {
        if(this.Microprocessador == true)
        {
            System.out.println("\nA placa possui microprocessador");
        }
        else
        {
            System.out.println("\nA placa possui microcontrolador");
        }
        return Microprocessador;
    }

    public int GetGPIO()
    {
        System.out.println("\nA placa possui " + this.GPIO + " GPIO's");
        return GPIO;
    }

    public void SetAnoLancamento(String data) 
    { 
        try 
        {    
            AnoDeLancamento = new SimpleDateFormat("yyyy").parse(data); 
        } 
        catch (ParseException e)
        {
            e.printStackTrace();
        }  
    }

    public Date GetAnoDeLancamento()
    {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        System.out.println("\nO ano de lançamento é " +formato.format(AnoDeLancamento)); 
        return AnoDeLancamento;
    }

    public void Divisao()
    {
        System.out.println("_________________________________________________________________________________________");
    }

    public Placa (String Nome, int GPIO, boolean Microprocessador) 
    {
        this.Nome = Nome;
        this.GPIO = GPIO;
        this.Microprocessador = Microprocessador;
    }
   
}


