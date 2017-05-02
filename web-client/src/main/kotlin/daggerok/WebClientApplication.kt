package daggerok

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
class WebClientApplication

fun main(args: Array<String>) {
  SpringApplication.run(WebClientApplication::class.java, *args)
}
