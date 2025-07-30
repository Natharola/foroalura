# 📚 Foro Alura - API REST con Spring Boot

Foro Alura es una aplicación desarrollada en **Java con Spring Boot**, que expone una **API REST** para la gestión de un foro en línea.  
Permite a los usuarios crear, listar, actualizar y eliminar tópicos, así como gestionar autores y cursos asociados.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA (Hibernate)**
- **Spring Validation**
- **Spring Security + JWT**
- **MySQL** como base de datos relacional
- **Maven** como gestor de dependencias

---

## 📂 Estructura del proyecto

src
└── main
├── java/alura/foro/api
│ ├── controller # Controladores REST
│ ├── domain # Entidades y modelos
│ ├── repository # Repositorios JPA
│ └── service # Lógica de negocio
└── resources
├── application.properties
└── db/migration (Flyway)

yaml
Copiar
Editar

---

## ⚙️ Configuración del entorno

1. Clona este repositorio:
   ```bash
   git clone https://github.com/Natharola/foroalura.git
Accede a la carpeta del proyecto:

bash
Copiar
Editar
cd foroalura
Configura tu base de datos MySQL en src/main/resources/application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/foroalura
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=validate
Ejecuta la aplicación:

bash
Copiar
Editar
mvn spring-boot:run
🔑 Autenticación
La aplicación utiliza JWT (JSON Web Tokens) para autenticar y autorizar a los usuarios.
El flujo básico es:

El usuario se registra/inicia sesión.

El backend genera un token JWT.

El cliente debe enviar el token en cada request (header Authorization: Bearer <token>).

📌 Endpoints principales
Autenticación
POST /login → Autenticación de usuarios

Tópicos
POST /topicos → Crear un nuevo tópico

GET /topicos → Listar todos los tópicos

GET /topicos/{id} → Detalle de un tópico

PUT /topicos/{id} → Actualizar un tópico

DELETE /topicos/{id} → Eliminar un tópico

🛠️ Migraciones de Base de Datos
El proyecto usa Flyway para versionar la base de datos.
Las migraciones se encuentran en:

css
Copiar
Editar
src/main/resources/db/migration
🤝 Contribución
Haz un fork del proyecto 🍴

Crea tu rama de feature: git checkout -b feature/nueva-funcionalidad

Haz commit de tus cambios: git commit -m "Agrega nueva funcionalidad"

Haz push a tu rama: git push origin feature/nueva-funcionalidad

Abre un Pull Request 🚀

👩‍💻 Autora
Nathaly Rodríguez Lagos
Proyecto realizado como parte de la formación en Alura Latam.
