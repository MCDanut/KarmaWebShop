package ro.codemart.WebShopReactJS.Entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ProductTest {

    @Test
    void serializeSpecification() {
        String expected = "{\"spec1\":\"val1\",\"spec2\":\"val2\",\"spec3\":\"val3\"}";
        Map<String,String> specs = new LinkedHashMap<>();
        specs.put("spec1", "val1");
        specs.put("spec2", "val2");
        specs.put("spec3", "val3");
        Product product = Product.builder().specificationMap(specs).build();

        product.serializeSpecification();
        String actual = product.getSpecification();


        assertEquals(expected, actual);
    }

    @Test
    void deserializeSpecification() {
        String specs = "{\"spec1\":\"val1\",\"spec2\":\"val2\",\"spec3\":\"val3\"}";
        Map<String,String> expected = new LinkedHashMap<>();
        expected.put("spec1", "val1");
        expected.put("spec2", "val2");
        expected.put("spec3", "val3");
        Product product = Product.builder().specification(specs).build();

        product.deserializeSpecification();
        Map<String,String> actual = product.getSpecificationMap();

        assertEquals(expected, actual);
    }
}