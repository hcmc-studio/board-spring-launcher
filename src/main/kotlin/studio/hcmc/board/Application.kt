package studio.hcmc.board

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = [
    "studio.hcmc.board.controller",
    "studio.hcmc.board.repository",
    "studio.hcmc.board.service",
])
class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Application>()
        }
    }
}