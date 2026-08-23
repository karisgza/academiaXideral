<h1> Proyectos de la academia BackEnd QE Copilot </h1>

<h4>Semana 2 - Dependency Injection </h4>

La inyección de dependencias es un patrón de diseño donde una clase recibe los objectos que necesita del exterior en lugar de crearlos dentro de ella misma.

Cuando las clases crean estos objetos internamente existe el problema del <strong> alto acomplamiento </strong>. En nuestro ejemplo la clase Mascota siempre sería del tipo Perro por poner un ejemplo. Pero qué tal si en el futuro queremos crear otro tipo de Mascota? Tendríamos qué modificar el código de Mascota. 

El <strong> alto acomplamiento </strong> también dificulta el realizar las <strong> pruebas unitarias </strong> de nuestro código. No podemos probar la clase Mascota en aislamiento porque siempre habría qué ejecutar el código tal cual está en la clase, es decir, no podríamos enviar un valor 'mock'. 

Para resolver estos problemas creamos una interfaz Mascota que es implementada por las clases Perro y Gato. La interfaz tiene un solo método 'hablar' el cual es implementado por Perro y Gato de diferentes maneras. La clase EscuelaDeMascotas recibe la dependencia por constructor pero no sabe el tipo de Mascota que recibe ni crea una nueva Mascota, solo recibe. Posteriormente en la clase Main armamos el objeto en la línea 5, el cual luego se pasa a EscuelaDeMascotas. Si cambiáramos esta línea, podríamos cambiar el comportamiento porque en esta línea decidimos si enviar un Perro o un Gato. 




se creó para solucionar dos problemas principales: el acomplamiento y la testeabilidad. E
