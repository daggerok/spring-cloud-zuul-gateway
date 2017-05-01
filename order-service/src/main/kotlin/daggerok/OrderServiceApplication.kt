package daggerok

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@EnableDiscoveryClient
@SpringBootApplication
class OrderServiceApplication

fun main(args: Array<String>) {
  SpringApplication.run(OrderServiceApplication::class.java, *args)
}

@RestController class OrderResource {
  @GetMapping fun orders(): Map<String, String>
      = mapOf("message" to "order service response")
}
