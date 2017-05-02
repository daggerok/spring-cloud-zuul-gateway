package daggerok

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@EnableDiscoveryClient
@SpringBootApplication
class ProductServiceApplication

fun main(args: Array<String>) {
  SpringApplication.run(ProductServiceApplication::class.java, *args)
}

@RestController class ProductResource {
  @GetMapping fun orders(): Map<String, String>
      = mapOf("message" to "product service response")
}
