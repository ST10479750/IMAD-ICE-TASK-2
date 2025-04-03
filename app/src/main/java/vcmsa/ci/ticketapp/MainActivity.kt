package vcmsa.ci.ticketapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val speedInput = findViewById<EditText>(R.id.speedInput)
        val checkButton = findViewById<Button>(R.id.checkBtn)

        checkButton.setOnClickListener {
            val speed = speedInput.text.toString().toIntOrNull()

            if (speed == null) {
                Toast.makeText(this, "You not even driving!", Toast.LENGTH_SHORT).show()
            } else if (speed == 0 ) {
                Toast.makeText(this, "You not even driving!", Toast.LENGTH_SHORT).show()
            } else if (speed < 60) {
                Toast.makeText(this, "You are driving safely!", Toast.LENGTH_SHORT).show()
            } else if (speed <= 80) {
                Toast.makeText(this, "Warning! Drive carefully!", Toast.LENGTH_SHORT).show()
            } else if (speed <= 100) {
                Toast.makeText(this, "Fine: R500", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Fine: R2000", Toast.LENGTH_SHORT).show()
            }
        }
    }
}