package cn.readsense.koinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.readsense.koinsample.oben.Student
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>()

        student.beSmart()

    }

}
