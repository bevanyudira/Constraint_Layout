package com.example.pertemuan_4_tugas

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan_4_tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Inisialisasi View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Mengatur View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set listener untuk tombol "Sign Up"
        binding.btnSignup.setOnClickListener {
            // Mengambil input dari EditText
            val email = binding.email.text.toString()
            val fullName = binding.fullname.text.toString()
            val username = binding.username.text.toString()
            val password = binding.password.text.toString().replace(Regex("."), "*")

            // Menampilkan hasil input dengan AlertDialog
            val message = """
                Email: $email
                Fullname: $fullName
                Username: $username
                Password: $password
            """.trimIndent()

            // Membuat dan menampilkan AlertDialog
            AlertDialog.Builder(this)
                .setTitle("Sign Up Success")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show()
        }
    }
}
