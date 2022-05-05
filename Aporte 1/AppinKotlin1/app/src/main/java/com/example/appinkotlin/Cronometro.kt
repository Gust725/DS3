package com.example.appinkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Chronometer
import android.widget.ImageView
import android.widget.Toast

class Cronometro : AppCompatActivity() {

    private lateinit var playBtn :ImageView
    private lateinit var pauseBtn :ImageView
    private lateinit var chronomter:Chronometer
    var isPlay = false
    var pauseOffSet :Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cronometro)
        playBtn = findViewById(R.id.playBtn)
        pauseBtn = findViewById(R.id.pauseBtn)
        chronomter = findViewById(R.id.chronoMterPlay)
        playBtn.setOnClickListener {
            if (!isPlay){
                chronomter.base = SystemClock.elapsedRealtime() - pauseOffSet
                chronomter.start()
                pauseBtn.visibility = View.VISIBLE
                playBtn.setImageResource(R.drawable.stop)
                textMsg("El cronometro inicio",this)
                isPlay  =true

            }
            else{
                chronomter.base = SystemClock.elapsedRealtime()
                pauseOffSet = 0
                chronomter.stop()
                playBtn.setImageResource(R.drawable.play)
                pauseBtn.visibility = View.GONE
                textMsg("El cronometro paro",this)
                isPlay = false
            }

        }
        pauseBtn.setOnClickListener {
            if (isPlay){
                chronomter.stop()
                pauseOffSet = SystemClock.elapsedRealtime() - chronomter.base
                isPlay = false
                pauseBtn.setImageResource(R.drawable.play)
                textMsg("El cronometro se pauso",this)
            }
            else{
                chronomter.base = SystemClock.elapsedRealtime() - pauseOffSet
                chronomter.start()
                pauseBtn.setImageResource(R.drawable.pausa)
                textMsg("El cronometro continua",this)
                isPlay = true
            }
        }

    }
    fun textMsg(s:String,c:Context){
        Toast.makeText(c,s,Toast.LENGTH_SHORT).show()
    }

}