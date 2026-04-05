package Bridge;

public class Bibliotecario extends Cargo {

    public Bibliotecario(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }
}