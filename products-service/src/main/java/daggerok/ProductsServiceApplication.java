package daggerok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ProductsServiceApplication {

  @RestController
  public static class ProductsResource {

    @GetMapping
    public Map<String, String> products() {

      return new HashMap<String, String>() {{
        put("message", "products response");
      }};
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(ProductsServiceApplication.class, args);
  }
}
