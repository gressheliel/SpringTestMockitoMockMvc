# Soporte para pruebas con Spring Boot
- @SpringBootTest : Carga el contexto de la aplicación de Spring
  - @Autowired : Permite cargar beans de la app.
```
    @Autowired
    CollegeStudent student;

    @Autowired
    StudentGrades studentGrades;
```
  - @Value :  Cargar propiedades desde properties (info.school.name=luv2code)
```
    @Value("${info.app.name}")
    private String appInfo;
    
    info.app.name=My Super Cool Gradebook
    info.school.name=luv2code
```
  - @Autowired ApplicationContext context;
    Acceso al Spring Application Context
  - @SpringBootTest(classes=MvcTestingExampleApplication.class) public class ApplicationExampleTest
    Si no se tiene la misma estructura de paquetes se puede agregar
  
- Dependencia : spring-boot-starter-test
  - Tiene una dependencia transitiva hacia JUnit 5. (La tenemos disponible en el project sin importarla)
  - mvn dependency:tree