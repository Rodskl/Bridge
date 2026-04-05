package Bridge;

public abstract class Cargo {
    protected Escolaridade escolaridade;
    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public abstract float calcularSalario();
}