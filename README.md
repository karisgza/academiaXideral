<h1> Proyectos de la academia BackEnd QE Copilot </h1>

<h4>Semana 2 - Dependency Injection </h4>

La inyección de dependencias es un patrón de diseño donde una clase recibe los objectos que necesita del exterior en lugar de crearlos dentro de ella misma.

Cuando las clases crean estos objetos internamente existe el problema del <strong> alto acomplamiento </strong>. En nuestro ejemplo la clase <strong>Mascota</strong> siempre sería un perro por poner un ejemplo. Pero qué tal si en el futuro queremos crear otro tipo mascota? Tendríamos qué modificar el código de la clase <strong>Mascota</strong>. 

El <strong> alto acomplamiento </strong> también dificulta el realizar las <strong> pruebas unitarias </strong> de nuestro código. No podemos probar la clase Mascota en aislamiento porque siempre habría qué ejecutar el código tal cual está en la clase, es decir, no podríamos enviar un valor 'mock'. 

Para resolver estos problemas creamos una interfaz <strong>Mascota</strong> que es implementada por las clases <strong>Perro</strong> y <strong>Gato</strong>. La interfaz tiene un solo método <strong>hablar</strong> el cual es implementado por <strong>Perro</strong> y <strong>Gato</strong> de diferentes maneras. La clase <strong>EscuelaDeMascotas</strong> recibe la dependencia por constructor pero no sabe el tipo de Mascota que recibe ni crea una nueva Mascota, solo recibe. Posteriormente, en la clase <strong>Main</strong> armamos el objeto en la línea 5, el cual luego se pasa a <strong>EscuelaDeMascotas</strong>. Si cambiáramos esta línea, podríamos cambiar el comportamiento porque en esta línea decidimos si enviar un Perro o un Gato. 



