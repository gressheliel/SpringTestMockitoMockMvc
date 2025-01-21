# Create Student, Simple test
- @TestPropertySource("/application.properties") Carga properties para la prueba
- En Spring Boot si hay una BD embebida, se autoconfigura la conexion
- Como tenemos la dependencía de H2, se autoconfigura la conexión
- Crear StudentDao y StudentAndGradeService para crear estudiante