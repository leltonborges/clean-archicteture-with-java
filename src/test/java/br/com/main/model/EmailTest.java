package br.com.main.model;

import br.com.main.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void testNaoDeveriaCriarEmailsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("invalid"));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
    }

    @Test
    void testDeveriaCriarEmailsValidos(){
        assertEquals("foo@foo.com", new Email("foo@foo.com").getAddressEmail());
        assertEquals("foo.bar@foo.com", new Email("foo.bar@foo.com").getAddressEmail());
        assertEquals("foo.01_bar@foo.com", new Email("foo.01_bar@foo.com").getAddressEmail());
        assertEquals("bar_foo@foo.com", new Email("bar_foo@foo.com").getAddressEmail());
    }
}