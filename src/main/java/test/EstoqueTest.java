package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// MORRA MOCKITO MORRA

class EstoqueTest {

    @org.testng.annotations.Test
    void deveIdentificarEstoqueAbaixoDoMinimo() {

        Produto produto = mock(Produto.class);

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
    void naoDeveIdentificarEstoqueAbaixoDoMinimoQuandoQuantidadeForSuficiente() {

        Produto produto = mock(Produto.class);

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
    void deveDarBaixaNoEstoque() {

        Produto produto = mock(Produto.class);

        Estoque estoque = new Estoque(
                1L,
                produto,
                20,
                10,
                50
        );

        estoque.darBaixa(5);

        assertEquals(15, estoque.getQuantidadeAtual());
    }

    @Test
    void deveLancarExcecaoQuandoEstoqueForInsuficiente() {

        Produto produto = mock(Produto.class);

        Estoque estoque = new Estoque(
                1L,
                produto,
                5,
                2,
                50
        );

        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> estoque.darBaixa(10)
        );

        assertEquals(
                "Estoque insuficiente para baixa.",
                excecao.getMessage()
        );
    }

    @Test
    void deveAssociarProdutoMockadoAoEstoque() {

        Produto produto = mock(Produto.class);

        Estoque estoque = new Estoque(
                1L,
                produto,
                20,
                10,
                50
        );

        assertSame(produto, estoque.getProduto());
    }
}