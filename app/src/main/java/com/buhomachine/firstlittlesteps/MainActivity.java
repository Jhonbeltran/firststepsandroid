package com.buhomachine.firstlittlesteps;
//importamos archivos que requerimos
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//MainActivity hereda de AppCompatActivity ||
// AppCompatActivity hereda de CompatActivity.. hasta que heredan de Application
public class MainActivity extends AppCompatActivity {

    @Override
    //Clase onCreate que recibe un objeto tipo bundle
    //Este metodo se ejecuta de inmediato cuando inicio una aplicacion en android
    protected void onCreate(Bundle savedInstanceState) {
        //bundle nos ayuda a persistir ciertos datos en nuestra app luego de que el usuario cierra la app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //A esta actividad le voy a configurar una vista
        //R se encarga del manejo de los recursos a un codigo java

        //importamos la clase y hacemos el cast
        Button boton = (Button) findViewById(R.id.boton);
        final EditText nombre = (EditText) findViewById(R.id.nombre);
        final TextView saludo = (TextView) findViewById(R.id.saludo);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre_del_usuario = nombre.getText().toString();
                saludo.setText("Hola "+ nombre_del_usuario);
            }
        });

    }


}
