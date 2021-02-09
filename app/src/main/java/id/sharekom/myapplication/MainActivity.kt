package id.sharekom.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMain = findViewById<TextView>(R.id.tv_main)

        val service = RetrofitService.api.getInfoGempa()

        service.enqueue(object : Callback<Infogempa> {
            override fun onResponse(call: Call<Infogempa>, response: Response<Infogempa>) {
                if (response.code() == 200) {
                    val body = response.body()

                    if (body != null) {
                        tvMain.text = body.gempa.Jam
                    } else {
                        Toast.makeText(baseContext, "Data Kosong", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onFailure(call: Call<Infogempa>, t: Throwable) {
                tvMain.text = t.message.toString()
            }
        })
    }
}