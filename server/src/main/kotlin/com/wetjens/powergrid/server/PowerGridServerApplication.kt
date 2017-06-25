package com.wetjens.powergrid.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PowerGridServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(PowerGridServerApplication::class.java, *args)
}