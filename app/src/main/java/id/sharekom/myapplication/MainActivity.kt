package id.sharekom.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import id.sharekom.myapplication.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val service = RetrofitService.api.getInfoGempa()

        with(binding) {
            service.enqueue(object : Callback<Infogempa> {
                override fun onResponse(call: Call<Infogempa>, response: Response<Infogempa>) {
                    if (response.code() == 200) {
                        val body = response.body()

                        if (body != null) {
                            with(body.gempa) {
                                tvPotensiValue.text = Potensi
                                tvTanggalValue.text = Tanggal
                                tvJamValue.text = Jam
                                tvCoordinatesValue.text = getString(R.string.coordinates_value, Lintang, Bujur)
                                tvMagnitude.text = Magnitude
                                tvKedalamanValue.text = Kedalaman
                                tvWilayah1Value.text = Wilayah1
                                tvWilayah2Value.text = Wilayah2
                                tvWilayah3Value.text = Wilayah3
                                tvWilayah4Value.text = Wilayah4
                                tvWilayah5Value.text = Wilayah5
                                setImageCoordinates()
                            }
                        } else {
                            Toast.makeText(baseContext, "Data Kosong", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

                override fun onFailure(call: Call<Infogempa>, t: Throwable) {
                    t.printStackTrace()
                }
            })
        }
    }

    private fun setImageCoordinates() {
        Glide.with(baseContext)
                .load("https://data.bmkg.go.id/eqmap.gif")
                .into(binding.ivCoordinates)
    }
}