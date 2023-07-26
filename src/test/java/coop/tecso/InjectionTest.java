package coop.tecso;


import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class InjectionTest {

    @Inject
    private AInterface<String, String> cacheString;

    @Inject
    private AInterface<Long, Long> cacheLong;

    @Test
    public void inyeccionOK() {
        Assertions.assertNotNull(cacheString);
        Assertions.assertNotNull(cacheLong);
        System.out.println(cacheString.get("hola", "mundo"));
        System.out.println(cacheLong.get(1L, 2L));
    }

}
