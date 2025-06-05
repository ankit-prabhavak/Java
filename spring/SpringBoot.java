package spring;

/**
 * Spring Boot: Concepts, Structure, and RESTful Web Services
 * ----------------------------------------------------------
 * Spring Boot is a framework built on top of Spring that simplifies the setup, configuration,
 * and development of Spring applications. It enables rapid development with minimal configuration.
 *
 * Key Concepts Covered:
 * - Spring Boot Build Systems
 * - Spring Boot Code Structure
 * - Spring Boot Runners
 * - Logger
 * - Building RESTful Web Services
 * - RestController, RequestMapping, RequestBody, PathVariable, RequestParam
 * - HTTP Methods: GET, POST, PUT, DELETE
 * - Building Web Applications
 *
 * ---------------------------------------------------------------------------
 * 1. Spring Boot Build Systems
 * ---------------------------------------------------------------------------
 * - Common build tools: Maven (pom.xml), Gradle (build.gradle)
 * - These manage dependencies, plugins, and project structure.
 *
 * Example (Maven pom.xml dependency):
 *   <dependency>
 *       <groupId>org.springframework.boot</groupId>
 *       <artifactId>spring-boot-starter-web</artifactId>
 *   </dependency>
 *
 * ---------------------------------------------------------------------------
 * 2. Spring Boot Code Structure
 * ---------------------------------------------------------------------------
 * - Typical structure:
 *   src/main/java/
 *       com/example/demo/
 *           DemoApplication.java      // Main class with @SpringBootApplication
 *           controller/
 *               MyController.java
 *           service/
 *               MyService.java
 *           model/
 *               MyModel.java
 *   src/main/resources/
 *       application.properties        // Configuration file
 *
 * ---------------------------------------------------------------------------
 * 3. Spring Boot Runners
 * ---------------------------------------------------------------------------
 * - The main class is annotated with @SpringBootApplication and contains the main() method.
 * - SpringApplication.run() starts the embedded server and application context.
 *
 * Example:
 *   @SpringBootApplication
 *   public class DemoApplication {
 *       public static void main(String[] args) {
 *           SpringApplication.run(DemoApplication.class, args);
 *       }
 *   }
 *
 * ---------------------------------------------------------------------------
 * 4. Logger
 * ---------------------------------------------------------------------------
 * - Use org.slf4j.Logger or org.springframework.boot.logging for logging.
 *
 * Example:
 *   private static final Logger logger = LoggerFactory.getLogger(MyController.class);
 *   logger.info("Message");
 *
 * ---------------------------------------------------------------------------
 * 5. Building RESTful Web Services
 * ---------------------------------------------------------------------------
 * - Use @RestController to define REST endpoints.
 * - Use @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping for HTTP methods.
 * - Use @RequestBody for JSON request bodies.
 * - Use @PathVariable for URL path variables.
 * - Use @RequestParam for query parameters.
 *
 * Example REST Controller:
 *   @RestController
 *   @RequestMapping("/api")
 *   public class MyController {
 *       @GetMapping("/hello")
 *       public String hello() {
 *           return "Hello, World!";
 *       }
 *
 *       @PostMapping("/add")
 *       public MyModel add(@RequestBody MyModel model) {
 *           // process model
 *           return model;
 *       }
 *
 *       @GetMapping("/user/{id}")
 *       public String getUser(@PathVariable int id) {
 *           return "User ID: " + id;
 *       }
 *
 *       @GetMapping("/search")
 *       public String search(@RequestParam String q) {
 *           return "Search: " + q;
 *       }
 *   }
 *
 * ---------------------------------------------------------------------------
 * 6. HTTP Methods in REST APIs
 * ---------------------------------------------------------------------------
 * - GET: Retrieve data
 * - POST: Create new data
 * - PUT: Update existing data
 * - DELETE: Remove data
 *
 * Example:
 *   @GetMapping("/items")         // GET
 *   @PostMapping("/items")        // POST
 *   @PutMapping("/items/{id}")    // PUT
 *   @DeleteMapping("/items/{id}") // DELETE
 *
 * ---------------------------------------------------------------------------
 * 7. Building Web Applications
 * ---------------------------------------------------------------------------
 * - Spring Boot can serve static content (HTML, CSS, JS) from src/main/resources/static.
 * - Use @Controller and Thymeleaf templates for dynamic web pages.
 * - application.properties is used for configuration (server port, DB, etc.).
 *
 * ---------------------------------------------------------------------------
 * Summary Table:
 * ---------------------------------------------------------------------------
 * | Concept         | Annotation/Example/Usage                             |
 * |-----------------|------------------------------------------------------|
 * | Build System    | Maven, Gradle                                        |
 * | Main Class      | @SpringBootApplication, SpringApplication.run()       |
 * | REST Controller | @RestController, @RequestMapping                     |
 * | HTTP Methods    | @GetMapping, @PostMapping, @PutMapping, @DeleteMapping|
 * | Request Body    | @RequestBody                                         |
 * | Path Variable   | @PathVariable                                        |
 * | Request Param   | @RequestParam                                        |
 * | Logger          | LoggerFactory.getLogger(), logger.info()              |
 * | Static Content  | src/main/resources/static                            |
 * | Config          | application.properties                               |
 *
 * ---------------------------------------------------------------------------
 * Advantages:
 * - Rapid development, embedded server, minimal configuration, production-ready features, easy REST API creation.
 * Disadvantages:
 * - Larger executable size, less control over server internals, learning curve for advanced features.
 */

public class SpringBoot {
    // This class is for documentation and summary only.
}