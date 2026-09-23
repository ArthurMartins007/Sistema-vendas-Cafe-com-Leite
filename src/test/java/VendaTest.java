/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duliz
 */
import com.example.Cliente;
import com.example.Funcionario;
import com.example.ItemVenda;
import com.example.Produto;
import com.example.Venda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendaTest {

    @Test
    public void deveAdicionarItemNaVenda() {

        Cliente cliente = new Cliente(
                "12345678900",
                null,
                "Joao",
                "Rua A"
        );

        Funcionario funcionario = new Funcionario(
                "Carlos",
                "Vendedor",
                "98765432100"
        );

        Venda venda = new Venda(
                1L,
                cliente,
                funcionario
        );

        Produto produto = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        ItemVenda item = new ItemVenda(
                produto,
                2,
                50.0,
                0.0
        );

        venda.adicionarItem(item);

        assertEquals(1, venda.getItens().size());
    }

    @Test
    public void deveCalcularTotalDaVenda() {

        Cliente cliente = new Cliente(
                "12345678900",
                null,
                "Joao",
                "Rua A"
        );

        Funcionario funcionario = new Funcionario(
                "Carlos",
                "Vendedor",
                "98765432100"
        );

        Venda venda = new Venda(
                1L,
                cliente,
                funcionario
        );

        Produto produto1 = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de ferro",
                50.0
        );

        Produto produto2 = new Produto(
                2L,
                "Furadeira",
                2.0,
                "Furadeira eletrica",
                200.0
        );

        ItemVenda item1 = new ItemVenda(
                produto1,
                2,
                50.0,
                0.0
        );

        ItemVenda item2 = new ItemVenda(
                produto2,
                1,
                200.0,
                20.0
        );

        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        assertEquals(280.0, venda.calcularValorTotal());
    }

    @Test
    public void vendaSemItensDeveTerTotalZero() {

        Cliente cliente = new Cliente(
                "12345678900",
                null,
                "Joao",
                "Rua A"
        );

        Funcionario funcionario = new Funcionario(
                "Carlos",
                "Vendedor",
                "98765432100"
        );

        Venda venda = new Venda(
                1L,
                cliente,
                funcionario
        );

        assertEquals(0.0, venda.calcularValorTotal());
    }
}