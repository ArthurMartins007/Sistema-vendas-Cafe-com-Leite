/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duliz
 */

import com.example.Estoque;
import com.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EstoqueTest {

    @Test
    public void deveIdentificarEstoqueAbaixoDoMinimo() {

        Produto produto = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        Estoque estoque = new Estoque(
                1L,
                produto,
                5,
                10,
                50
        );

        assertTrue(estoque.isAbaixoDoMinimo());
    }

    @Test
    public void naoDeveIdentificarEstoqueAbaixoDoMinimo() {

        Produto produto = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        Estoque estoque = new Estoque(
                1L,
                produto,
                20,
                10,
                50
        );

        assertFalse(estoque.isAbaixoDoMinimo());
    }

    @Test
    public void deveDiminuirQuantidadeAoDarBaixa() {

        Produto produto = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        Estoque estoque = new Estoque(
                1L,
                produto,
                20,
                5,
                50
        );

        estoque.darBaixa(5);

        assertEquals(15, estoque.getQuantidadeAtual());
    }

    @Test
    public void naoDevePermitirBaixaMaiorQueEstoque() {

        Produto produto = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        Estoque estoque = new Estoque(
                1L,
                produto,
                10,
                5,
                50
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> estoque.darBaixa(20)
        );
    }
}
