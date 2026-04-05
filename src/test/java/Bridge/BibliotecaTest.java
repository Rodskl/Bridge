package Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

@Test
void deveRetornarSalarioBibliotecarioComGraduacao() {
    Escolaridade escolaridade = new Graduacao();
    Bibliotecario bibliotecario = new Bibliotecario(3000.0f);
    bibliotecario.setEscolaridade(escolaridade);
    assertEquals(3300.0f, bibliotecario.calcularSalario(), 0.01f);
}

@Test
void deveRetornarSalarioInspetorComEspecializacao() {
    Escolaridade escolaridade = new Especializacao();
    Inspetor inspetor = new Inspetor(1500.0f);
    inspetor.setEscolaridade(escolaridade);
    assertEquals(1800.0f, inspetor.calcularSalario(), 0.01f);
}
}