/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duliz
 */
import com.example.ItemVenda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemVendaMockTest {

    @Test
    public void deveRetornarSubtotalMockado() {

        ItemVenda item = mock(ItemVenda.class);

        when(item.calcularSubtotal()).thenReturn(150.0);

        assertEquals(150.0, item.calcularSubtotal());
    }

    @Test
    public void deveRetornarQuantidadeMockada() {

        ItemVenda item = mock(ItemVenda.class);

        when(item.getQuantidade()).thenReturn(5);

        assertEquals(5, item.getQuantidade());
    }
}