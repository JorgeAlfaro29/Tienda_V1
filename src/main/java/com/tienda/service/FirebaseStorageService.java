package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    //generar metodo de cargar imagen para ir a firebase
    //se crea la carpeta en firebase y se almacen las imagenes que se vayan a utilizar

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-9279e.appspot.com";// id se puede ver en el json

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-9279e-firebase-adminsdk-fcryb-5ae03b15be.json";

}
