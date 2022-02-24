package com.example.androidlab

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체 획득
        //val binding = ActivityMainBinding.inflate(layoutInflater)
        // 액티비티 화면 출력
        //setContentView(binding.root)

        // 뷰 객체 이용
        //binding.visibleBtn.setOnClickListener {
        //    binding.targetView.visibility = View.VISIBLE
        //}
        //binding.invisibleBtn.setOnClickListener {
        //    binding.targetView.visibility = View.INVISIBLE
        //}
        /*//이름 문자열 출력 TextView 생성
       val name = TextView(this).apply {
           typeface = Typeface.DEFAULT_BOLD
           text = "Lake Louise"
       }
       //이미지 출력 ImageView 생성
       val image = ImageView(this).also {
           it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.hihihihi))
       }
       //주소 문자열 출력 TextView 생성
       val address = TextView(this).apply {
           typeface = Typeface.DEFAULT_BOLD
           text = "Lake Louise, AB, 캐나다"
       }
       val layout = LinearLayout(this).apply {
           orientation = LinearLayout.VERTICAL
           gravity = Gravity.CENTER
           //LinearLayout 객체에 TextView, ImageView, TextView 객체 추가
           addView(name, WRAP_CONTENT, WRAP_CONTENT)
           addView(image, WRAP_CONTENT, WRAP_CONTENT)
           addView(address, WRAP_CONTENT, WRAP_CONTENT)
       }
       //LinearLayout 객체를 화면에 출력
       setContentView(layout)*/

        //화면 출력 XML 명시
        setContentView(R.layout.activity_main)

       /*val text: TextView = findViewById(R.id.text1)
        text.setOnClickListener {
            targetView.visibility = View.VISIBLE
        }*/
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang", "Touch down event x: ${event.x}, rawX: ${event.rawX}")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("kkang", "Touch up event")
            }
        }
        return super.onTouchEvent(event)
    }
}
