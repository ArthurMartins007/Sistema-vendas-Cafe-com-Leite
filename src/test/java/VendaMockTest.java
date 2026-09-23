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
import com.example.Venda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VendaMockTest {

    @Test
    public void deveCalcularTotalComItensMockados() {

        ItemVenda item1 = mock(ItemVenda.class);
        ItemVenda item2 = mock(ItemVenda.class);

        when(item1.calcularSubtotal()).thenReturn(100.0);
        when(item2.calcularSubtotal()).thenReturn(50.0);

        Cliente cliente = mock(Cliente.class);
        Funcionario funcionario = mock(Funcionario.class);

        Venda venda = new Venda(
                1L,
                cliente,
                funcionario
        );

        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        assertEquals(150.0, venda.calcularValorTotal());
    }

    @Test
    public void deveCalcularTotalDeTresItensMockados() {

        ItemVenda item1 = mock(ItemVenda.class);
        ItemVenda item2 = mock(ItemVenda.class);
        ItemVenda item3 = mock(ItemVenda.class);

        when(item1.calcularSubtotal()).thenReturn(100.0);
        when(item2.calcularSubtotal()).thenReturn(200.0);
        when(item3.calcularSubtotal()).thenReturn(50.0);

        Cliente cliente = mock(Cliente.class);
        Funcionario funcionario = mock(Funcionario.class);

        Venda venda = new Venda(
                1L,
                cliente,
                funcionario
        );

        venda.adicionarItem(item1);
        venda.adicionarItem(item2);
        venda.adicionarItem(item3);

        assertEquals(350.0, venda.calcularValorTotal());
    }
}
