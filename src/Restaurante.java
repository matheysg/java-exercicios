public class Restaurante {
    // este é um exercício de herança e polimorfismo
    
    static class Comida {
        private String nome;

        public Comida(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void servir() {
            System.out.println("Servindo comida...");
        }
     }

// subclass sopa
static class Sopa extends Comida {
    public Sopa(String nome) {
        super(nome);
    }

    @Override
    public void servir() {
        System.out.println(getNome() + " é uma comida quente.");
    }
    
}

// subclasse sorvete
static class Sorvete extends Comida {
    public Sorvete(String nome) {
        super(nome);
    }

    @Override
    public void servir() {
        System.out.println(getNome() + " é uma comida fria.");
    }

}

// método principal
public static void main(String[] args) {
    Comida prato1 = new Sopa("Caldo verde");
    Comida prato2 = new Sorvete("Napolitano");

    System.out.println("Características dos pratos:");
    prato1.servir();
    prato2.servir();
    
}

}