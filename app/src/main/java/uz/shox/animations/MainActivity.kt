package uz.shox.animations

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()


    }
    private fun initView(){
        val bounceBtn = findViewById<Button>(R.id.bounceBtn)
        val sequentialTxt = findViewById<TextView>(R.id.sequentialTxt)
        val togetherTxt = findViewById<TextView>(R.id.togetherTxt)
        val bounceTxt = findViewById<TextView>(R.id.bounceTxt)
        val sequentialBtn = findViewById<Button>(R.id.sequentialBtn)
        val togetherBtn = findViewById<Button>(R.id.togetherBtn)

        val bounce_anim: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val sequential_anim = AnimationUtils.loadAnimation(this, R.anim.sequential)
        val together_anim = AnimationUtils.loadAnimation(this, R.anim.together)

        bounceBtn.setOnClickListener {
            bounceTxt.startAnimation(bounce_anim)
        }
        sequentialBtn.setOnClickListener {
            sequentialTxt.startAnimation(sequential_anim)
        }
        togetherBtn.setOnClickListener {
            togetherTxt.startAnimation(together_anim)
        }
    }
}