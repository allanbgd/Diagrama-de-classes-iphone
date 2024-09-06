

public class iphone implements aparelhoTelefonico, navegadorNaInternet, reprodutorMusicial {
    @Override
    public void ligar() {
       
        
    }
    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }
    @Override
    public void iniciaCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
        
    }

//reprodutor musical

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }   
    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
}

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    
}

//navegador na internet
@Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    
}
@Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    
}

@Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    
}


}
