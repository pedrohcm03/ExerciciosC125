public class Zumbi {
    String nome;
    double vida = 50;
    boolean alimentado = true;

    void alimentar(double vida){
        if(alimentado){
            System.out.println("Já estou alimentado");
        }else{
            this.vida += vida;
            System.out.println("Me alimentei: " + vida + "pontos de vida");
            System.out.println("Agora estou com: " + this.vida + "pontos de vida");
            if(this.vida >= 100)
                alimentado = true;
        }
    }

    void perderVida(double vida){
        this.vida -= vida;
        if(this.vida < 100)
            alimentado = false;
    }
}
