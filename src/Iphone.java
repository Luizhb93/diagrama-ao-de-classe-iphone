
public class Iphone implements Telefone,ReprodutorMusical, NavegadorInternet{

     public void ligar(){
        System.out.println("Ligando para um número");
     }

     public  void atender(){
        System.out.println("Atendendo");
     }

     public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio ");
     }

     public void tocar(){
        System.out.println("Tocando Música");
     }
     public void selecionarMusica(){
        System.out.println("Selecionando Música");
     }
     public void pausar(){
        System.out.println("Pausando Música");
     }

     public void exibirPagina(){
        System.out.println("Exibindo Pagina");
     }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

}