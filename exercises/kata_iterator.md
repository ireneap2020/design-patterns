## KATA Google y Facebook ##

### Grupo # 3 ###
- APAZA PERALTA IRENE JENNY 
- AGUILAR PEREZ KLEBER I. 
- BARJA HOYOS KEVIN EDUARDO 
- RIBERA YELY GALINDO  

### Objetivo ###
Utilizar el patrón ***Iterator*** como solución para integrar el uso de distintas estructuras de datos.

### Descripción ###
La empresa Alenasoft obtuvo un contrato con Google para publicar cierta información de todos sus usuarios con fines sociales.
La estructura del usuario Google es la siguiente:

    class GoogleUser {
        private String name;
        private String email;
    }
Para el acceso a la información Google provee el método:

    public GoogleUser[] getGoogleUsers();

Que devuelve a todos los usuarios google.

Con esta información se debe:

 - Mostrar a todos los clientes de Google

En el futuro la empresa Facebook vio con agrado publicar cierta información de usuarios, por lo que decidio contactar a Alenasoft para, al igual que Google, publicar información.
La empresa al contar con un equipo fuerte en POO decidio aceptar.

La estructura del usuario Facebook es la siguiente:

    class FacebookUser {
        private String fbName;
        private String fbUrl;
    }
Para el acceso a la información Facebook provee el método:

    public List<FacebookUser> getFacebookUsers();

En un futuro la empresa CRE tiene pensado contratar a Alenasoft para publicar información de montos a pagar de sus clientes
La estructura que usa CRE para este caso es:

    class CREUser {
        private int id;
        private UserData userData;
    }
    class UserData {
        private String name;
        private String address;
        private double payment;
    }
  Para el acceso a la información CRE provee el método:

    public Map<id, UserData> getCREinfo();
    
### Pasos para aplicación del patron en Cre ###
- Creamos los pojo's CREUser y UserData 
- Creamos la clase agregada CREApi
- Para mayor consistencia con las otras apis cambiamos la firma del método por


    public Map<id, CREUser> getCREUsers();
- Para mayor consistencia con las otras apis cambiamos la firma del método por       
- Creamos el iterador concreto CREUserIterator y trabajamos sobre la estructura Map
- En el cliente IteratorApp hacemos uso de estas clases.
