package com.example.pc.contactos.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PC on 17/08/2016.
 */
public class helper extends SQLiteOpenHelper {

    Context contexto;


    //se crea una base de datos con el nombre que se tendra en nuestro esquema
    //se debe pasar el contexto
    public helper(Context context) {

        super(context,esquema.NOMBRE_BASE,null,esquema.VERSION_BASE);
        this.contexto=context;

    }

    //cuando se llama a este metodo se pasa como parametro a la base de datos creada
    //anteriormente
    //en este metodo se creara la tabla de datos de nuestra aplicacion , se ejecuta la sentencia sql
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sentencia="CREATE TABLE "+ esquema.NOMBRE_TABLA+" ( "+
                                          esquema.CONTACTO_ID+ "INTEGER PRIMARY KEY AUTOINCREMENT , "+
                                          esquema.CONTACTO_NOMBRE+ "TEXT NOT NULL, "+
                                          esquema.CONTACTO_TELEFONO+ "TEXT NOT NULL, "+
                                          esquema.CONTACTO_ESPECIALIDAD+ "TEXT NOT NULL, "+
                                          esquema.CONTACTO_BIOGRAFIA+ "TEXT NOT NULL, "+
                                          esquema.CONTACTO_AVATAR+ "TEXT NOT NULL, "+
                                           "UNIQUE (" + esquema.CONTACTO_ID + ") )";

        sqLiteDatabase.execSQL(sentencia);

        insertarDatos(sqLiteDatabase);

    }

    private void insertarDatos(SQLiteDatabase sqLiteDatabase) {

        insertar(sqLiteDatabase, new contacto("Carlos Perez", "Abogado penalista",
                "300 200 1111", "Gran profesional con experiencia de 5 años en casos penales.",
                "carlos_perez.jpg"));
        insertar(sqLiteDatabase, new contacto("Daniel Samper", "Abogado accidentes de tráfico",
                "300 200 2222", "Gran profesional con experiencia de 5 años en accidentes de tráfico.",
                "daniel_samper.jpg"));
        insertar(sqLiteDatabase, new contacto("Lucia Aristizabal", "Abogado de derechos laborales",
                "300 200 3333", "Gran profesional con más de 3 años de experiencia en defensa de los trabajadores.",
                "lucia_aristizabal.jpg"));
        insertar(sqLiteDatabase, new contacto("Marina Acosta", "Abogado de familia",
                "300 200 4444", "Gran profesional con experiencia de 5 años en casos de familia.",
                "marina_acosta.jpg"));
        insertar(sqLiteDatabase, new contacto("Olga Ortiz", "Abogado de administración pública",
                "300 200 5555", "Gran profesional con experiencia de 5 años en casos en expedientes de urbanismo.",
                "olga_ortiz.jpg"));
        insertar(sqLiteDatabase, new contacto("Pamela Briger", "Abogado fiscalista",
                "300 200 6666", "Gran profesional con experiencia de 5 años en casos de derecho financiero",
                "pamela_briger.jpg"));
        insertar(sqLiteDatabase, new contacto("Rodrigo Benavidez", "Abogado Mercantilista",
                "300 200 1111", "Gran profesional con experiencia de 5 años en redacción de contratos mercantiles",
                "rodrigo_benavidez.jpg"));
        insertar(sqLiteDatabase, new contacto("Tom Bonz", "Abogado penalista",
                "300 200 1111", "Gran profesional con experiencia de 5 años en casos penales.",
                "tom_bonz.jpg"));


    }

    private long insertar(SQLiteDatabase sqLiteDatabase , contacto datos) {

           return  sqLiteDatabase.insert(esquema.NOMBRE_TABLA,null,datos.aContentValues());

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }



}
