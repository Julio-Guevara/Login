package salazar.guevara.login

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() , View.OnClickListener{
    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            val usuario = etUsuario.text.trim().toString()
            val pass = etPass.text.trim().toString()
            if(usuario.equals("julio") && pass.equals("hola")){
                val intent = Intent(this,SegundaActivity::class.java)
                intent.putExtra("usuario",usuario)
                startActivity(intent)
            }else{
                toast("no entraste")
            }
        }
    }
}
