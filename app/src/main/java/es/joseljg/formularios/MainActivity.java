package es.joseljg.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private RadioButton rb_opcion1;
   private RadioButton rb_opcion2;
   private RadioButton rb_opcion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb_opcion1 = (RadioButton)findViewById(R.id.rb_opcion1);
        rb_opcion2 = (RadioButton)findViewById(R.id.rb_opcion2);
        rb_opcion3 = (RadioButton)findViewById(R.id.rb_opcion3);
    }

    public void elegirOpcion(View view) {
        boolean opcionseleccionada = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.rb_opcion1:
                if(opcionseleccionada)
                {
                    Toast.makeText(this,"opcion1 seleccionada", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rb_opcion2:
                if(opcionseleccionada)
                {
                    Toast.makeText(this,"opcion2 seleccionada", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rb_opcion3:
                if(opcionseleccionada)
                {
                    Toast.makeText(this,"opcion3 seleccionada", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

    public void mostrarOpcion(View view) {
        if(rb_opcion1.isChecked())
        {
            Toast.makeText(this,"opcion1 seleccionada", Toast.LENGTH_SHORT).show();
        }
        else if(rb_opcion2.isChecked())
        {
            Toast.makeText(this,"opcion2 seleccionada", Toast.LENGTH_SHORT).show();
        }
        else if(rb_opcion3.isChecked())
        {
            Toast.makeText(this,"opcion3 seleccionada", Toast.LENGTH_SHORT).show();
        }
    }

    public void acepto(View view) {
        boolean seleccionado = ((CheckBox)view).isChecked();
        if(seleccionado)
        {
            Toast.makeText(this,"has aceptado", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"no acepta", Toast.LENGTH_SHORT).show();
        }
    }
}