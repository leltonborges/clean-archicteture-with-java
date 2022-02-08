package br.com.main.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void testNaoDeveriaCriarTelefoneComDDDInvalido() {
        assertThrows(NullPointerException.class, () -> new Telefone(null, "1111-1111"));
        assertThrows(NullPointerException.class, () -> new Telefone("", "1111-1111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("ad", "1111-1111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("254", "1111-1111"));
    }

    @Test
    void testNaoDeveriaCriarTelefoneComNumeroInvalido() {
        assertThrows(NullPointerException.class, () -> new Telefone("32", null));
        assertThrows(NullPointerException.class, () -> new Telefone("32", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("32", "111-1111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("32", "1111-111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("32", "1111111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("32", "1111 1111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("32", "1111-a111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("32", "1111a111"));
    }

    @Test
    void testDeveriaCriarTelefoneValidoComDDD() {
        assertEquals("32", new Telefone("32", "1111-1111").getDdd());
        assertEquals("1111-1111", new Telefone("32", "1111-1111").getNumber());
        assertEquals("11111111", new Telefone("32", "11111111").getNumber());
        assertEquals("91111-1111", new Telefone("32", "91111-1111").getNumber());
        assertEquals("911111111", new Telefone("32", "911111111").getNumber());
    }
}