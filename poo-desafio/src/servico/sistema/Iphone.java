package servico.sistema;

import servico.musica.RepodutorMusicial;
import servico.navegador.NavegadorInternet;
import servico.phone.AparelhoTelefonico;

public class Iphone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        
        System.out.println("Iniciando a página!");
    }

    @Override
    public void adicionarNovaAba() {
        
        System.out.println("Nova aba!");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Atualizando a página!");
    }

    @Override
    public void ligar() {
        
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        
        System.out.println("Atender!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void tocar() {

        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {

        System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica() {

        System.out.println("Selecione uma música.");
    }
    
       
    
}
