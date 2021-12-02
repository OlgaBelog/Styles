package com.olgaversion4.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

const val TAG: String = "MainActivity"
var CounterActivity: Int = 1

class MainActivity : AppCompatActivity() {

    fun funLog (i : Int) {
        when (i) {
            1 -> { Log.d(TAG, "1 Ты видел деву на скале")
                CounterActivity++
            }
            2 -> { Log.d(TAG, "2 В одежде белой над волнами")
                CounterActivity++
            }
            3 -> { Log.d(TAG, "3 Когда, бушуя в бурной мгле")
                CounterActivity++
        }
            4 -> { Log.d(TAG, "4 Играло море с берегами,")
                CounterActivity++
        }
            5 -> { Log.d(TAG, "5 Когда луч молний озарял")
                CounterActivity++
        }
            6 -> { Log.d(TAG, "6 Ее всечасно блеском алым")
                CounterActivity++
        }
            7 -> { Log.d(TAG, "7 И ветер бился и летал")
                CounterActivity++
        }
            8 -> { Log.d(TAG, "8 С ее летучим покрывалом?")
                CounterActivity++
        }
            9 -> { Log.d(TAG, "9 Прекрасно море в бурной мгле")
                CounterActivity++
            }
            10 -> { Log.d(TAG, "10 И небо в блесках без лазури;")
                CounterActivity++
            }
            11 -> { Log.d(TAG, "11 Но верь мне: дева на скале")
                CounterActivity++
            }
            12 -> { Log.d(TAG, "12 Прекрасней волн, небес и бури. ")
                CounterActivity++
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        funLog(CounterActivity)


    }

    override fun onStart() {
        super.onStart()
        funLog(CounterActivity)
    }

    override fun onResume() {
        super.onResume()
        funLog(CounterActivity)

    }

    override fun onPause() {
        super.onPause()
        funLog(CounterActivity)
    }

    override fun onStop() {
        super.onStop()
        funLog(CounterActivity)
    }

    override fun onRestart() {
        super.onRestart()
        funLog(CounterActivity)
    }

    override fun onDestroy() {
        super.onDestroy()
        funLog(CounterActivity)
    }

}