/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duliz
 */
import com.example.ItemVenda;
import com.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemVendaTest {

    @Test
    public void deveCalcularSubtotalSemDesconto() {

        Produto produto = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        ItemVenda item = new ItemVenda(
                produto,
                3,
                50.0,
                0.0
        );

        assertEquals(150.0, item.calcularSubtotal());
    }

    @Test
    public void deveCalcularSubtotalComDesconto() {

        Produto produto = new Produto(
                1L,
                "Furadeira",
                2.0,
                "Furadeira eletrica",
                200.0
        );

        ItemVenda item = new ItemVenda(
                produto,
                3,
                200.0,
                50.0
        );

        assertEquals(550.0, item.calcularSubtotal());
    }

    @Test
    public void deveRetornarQuantidadeCorreta() {

        Produto produto = new Produto(
                1L,
                "Chave de fenda",
                0.5,
                "Chave de fenda simples",
                20.0
        );

        ItemVenda item = new ItemVenda(
                produto,
                5,
                20.0,
                0.0
        );

        assertEquals(5, item.getQuantidade());
    }
}