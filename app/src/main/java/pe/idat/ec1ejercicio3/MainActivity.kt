package pe.idat.ec1ejercicio3

import android.icu.util.Calendar
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.idat.ec1ejercicio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
        }
    override fun onClick(p0: View){
        val birthday = binding.etbirthday.text.toString().toInt()
        val actualyear = Calendar.getInstance().get(Calendar.YEAR)
        val edad = actualyear - birthday
        val mensaje = if(edad >=18){
            "Usted ya puede sacar su DNI"
        }else{
            "Usted aún no puede sacar su DNI. \nLe falta ${18-edad} años"
        }
        binding.tvresultado.text = mensaje
    }
}