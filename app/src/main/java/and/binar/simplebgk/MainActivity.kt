package and.binar.simplebgk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var tv_player : TextView
    lateinit var tv_musuh : TextView
    lateinit var btn_reset : ImageButton
    lateinit var imageView4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       tv_player = findViewById(R.id.tv_player)
        tv_musuh = findViewById(R.id.tv_musuh)
        btn_reset = findViewById(R.id.btn_reset)
        btn_reset.setOnClickListener {
            tv_player.setText("");
            imageView4.setImageDrawable(resources.getDrawable(R.drawable.vs))
            tv_musuh.setText("")
        }

        imageView4= findViewById(R.id.imageView4)
    }

        // 0 rock, 1 paper, 2 scissors
        fun paperButtonPressed(view: View){
            val musuhChoice = Random.nextInt(2)
            when(musuhChoice){
                0 -> tv_musuh.text = "Com memilih Batu"
                1 -> tv_musuh.text = "Com memilih Kertas"
                2 -> tv_musuh.text = "Com memilih Gunting"
            }
            tv_player.text = "Kamu memilih Kertas"
            when(musuhChoice){
                0 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.pemain1_win))
                1 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.draw))
                2 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.pemain2_win))
            }

        }

        fun rockButtonPressed(view: View){
            val musuhChoice = Random.nextInt(2)
            when(musuhChoice){
                0 -> tv_musuh.text = "Com memilih Batu"
                1 -> tv_musuh.text = "Com memilih Kertas"
                2 -> tv_musuh.text = "Com memilih Gunting"
            }
            tv_player.text = "Kamu memilih Batu"
            when(musuhChoice){
                0 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.draw))
                1 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.pemain2_win))
                2 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.pemain1_win))
            }


        }

        fun scissorsButtonPressed(view: View){
            val musuhChoice = Random.nextInt(2)
            when(musuhChoice){
                0 -> tv_musuh.text = "Com memilih Batu"
                1 -> tv_musuh.text = "Com memilih Kertas"
                2 -> tv_musuh.text = "Com memilih Gunting"
            }
            tv_player.text = "Kamu memilih Gunting"
            when(musuhChoice){
                0 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.pemain2_win))
                1 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.pemain1_win))
                2 -> imageView4.setImageDrawable(resources.getDrawable(R.drawable.draw))
            }

        }

    }