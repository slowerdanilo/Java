package Classes;


public class Pessoa {
    
    //Atributos
    private float peso;
    private float altura;
    
    //Método construtor tem o mesmo nome da classe
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    //Métodos
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //metodos acessores
    //set
    public void setPeso (float peso){
        this.peso = peso;
    }
    //get
    public float getPeso(){
        return peso;
    }
    //set
    public void setAltura (float altura){
        this.altura = altura;
    }
    //get
    public float getAltura(){
        return altura;
    }
    
}
