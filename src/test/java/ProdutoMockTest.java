/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duliz
 */
import com.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProdutoMockTest {

    @Test
    public void deveRetornarNomeDoProdutoMockado() {

        Produto produto = mock(Produto.class);

        when(produto.getNome()).thenReturn("Martelo");

        assertEquals("Martelo", produto.getNome());
    }

    @Test
    public void deveRetornarPrecoDoProdutoMockado() {

        Produto produto = mock(Produto.class);

        when(produto.getPreco()).thenReturn(50.0);

        assertEquals(50.0, produto.getPreco());
    }

    @Test
    public void deveRetornarIdDoProdutoMockado() {

        Produto produto = mock(Produto.class);

        when(produto.getId()).thenReturn(10L);

        assertEquals(10L, produto.getId());
    }
}
