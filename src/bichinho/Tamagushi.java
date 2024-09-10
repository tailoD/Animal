package bichinho;

public class Tamagushi {
    private String nome;
    private Double fome;
    private Double tedio;
    private int idade;
    
    public Tamagushi(String nome, Double fome, Double tedio, int idade){
        this.nome=nome;
        this.fome=fome;
        this.tedio=tedio;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFome() {
        return fome;
    }

    public void setFome(Double fome) {
        this.fome = fome;
    }

    public Double getTedio() {
        return tedio;
    }

    public void setTedio(Double tedio) {
        this.tedio = tedio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void brincar (Double minutos){
        if (minutos * 0.5 < tedio){
            System.out.println("Bichinho entediado");
            tedio -= (minutos * 0.5);
            System.out.println("Nivel de tedio: " + tedio);
        
        
        }else{
            System.out.println("Os niveis de tedio estao zerados");
        }
    }
    
    public void alimentar(Double quantidade){
        if (quantidade * 0.75 < fome){
            fome -= (quantidade * 0.75);
            System.out.println("Nivel de fome: " + fome);
        }else{
            System.out.println("O bichinho nao tem fome");
        }
    }
    
    public void humor(){
        Double humor;
        humor = fome   + tedio;
        
        if (humor<10){
            System.out.println(nome + " esta de otimo humor!!");
            System.out.println("Nivel de humor: " + humor);
        }else if(humor>10 && humor <50){
            System.out.println(nome + " esta de humor moderado");
            System.out.println("Nivel de humor: " + humor);
        }else if(humor >50 && humor <120){
            System.out.println(nome + " esta de mal humor...");
            System.out.println("Nivel de humor: " + humor);
        }else if (humor>120){
            System.out.println(nome + " esta estremamaente zangado!!!");
            System.out.println("Nivel de humor da fera: " + humor);
        }
    }
    
}