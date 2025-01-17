# Estructura de los tests
- Setup         Set expectations with mock responses       when(doSomeWork()).thenReturn(resp)
- Execute       Call the method you want to test    
- Assert        Check the result & verify
- Verify        Optionally verify 

- Se deben inyectar en el main los beans:
```
	@Bean(name = "applicationExample")
	ApplicationService getApplicationService() {
		return new ApplicationService();
	}

	@Bean(name = "applicationDao")
	ApplicationDao getApplicationDao() {
		return new ApplicationDao();
	}
```
## Option 1
- @Mock        : Inyecta las dependencias(las Simuladas)
- @InjectMocks : Inyecta la capa a probar

## Option 2  Spring Boot Support
- @MockBean
  - Sustituye a @Mock
  - Incluye la funcionalidad de @Mock, Agrega el bean al ApplicationContext
  - Inyecta las dependencias(las Simuladas)
- @Autowired      
  - Sustituye a @InjectMocks
  - Inyecta la capa a probar

