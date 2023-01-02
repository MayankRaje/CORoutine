package com.example.new_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.delay as delay

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"//

    //DELAY

//    @OptIn(DelicateCoroutinesApi::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        GlobalScope.launch {
//            delay(5000L)
//            Log.d(TAG,"COUrOUTOUNE SAYS hello frirnds ${Thread.currentThread().name}")
//        }
//        Log.d(TAG," hello frirnds from threrad ${Thread.currentThread().name}") //executed in our Main activity so I st
//    }

    //SUSPEND FUNCTION

//    @OptIn(DelicateCoroutinesApi::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        GlobalScope.launch {
//
//            var call1=doNetworkCall1()
//            Log.d(TAG,"NetworkCall1 ${Thread.currentThread().name}")
//        }
//
//    }
//    suspend fun doNetworkCall1():String{
//        delay(3000L)
//        return "This is NetworkCall1"
//    }

    //COrOUTUNINE cONTEXT

//    @OptIn(DelicateCoroutinesApi::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        GlobalScope.launch (Dispatchers.IO){
//            Log.d(TAG,"COrOUTUNINE cONTEXT  ${Thread.currentThread().name}") //1
//            val ans=doNetworkCall1()
//            withContext(Dispatchers.Main){
//                //code inside this function will be executed inmain threads
//
//                Log.d(TAG,"Setting text in thread  ${Thread.currentThread().name}") //2
//                tvDummy.text=ans
//            }
//        }
//
//    }
//       suspend fun doNetworkCall1():String{
//        delay(3000L)
//        return "This is NetworkCall1"
//    }

    //4--runBlocking


//    @OptIn(DelicateCoroutinesApi::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        Log.d(TAG,"bfr run blocking")
//        runBlocking {
//           launch (Dispatchers.IO){
//               delay(3000L)
//               Log.d(TAG,"finished couRoutine IO 1")
//           }
//            launch (Dispatchers.IO){
//                delay(3000L)
//                Log.d(TAG,"finished couRoutine IO 2")
//            }
//            Log.d(TAG,"start of run blocking")
//            delay(100L)
//            Log.d(TAG,"find of run blocking")
//        }
//        Log.d(TAG,"After run blocking")
//    }
//       suspend fun doNetworkCall1():String{
//        delay(3000L)
//        return "This is NetworkCall1"
//    }
//}

    // jOBS WAITING CANCELATION
//@OptIn(DelicateCoroutinesApi::class)
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//
//    Log.d(TAG,"bfr run blocking")
//    runBlocking {
//        launch (Dispatchers.IO){
//            delay(3000L)
//            Log.d(TAG,"finished couRoutine IO 1")
//        }
//        launch (Dispatchers.IO){
//            delay(3000L)
//            Log.d(TAG,"finished couRoutine IO 2")
//        }
//        Log.d(TAG,"start of run blocking")
//        delay(100L)
//        Log.d(TAG,"find of run blocking")
//    }
//    Log.d(TAG,"After run blocking")
//}
//    suspend fun doNetworkCall1():String{
//        delay(3000L)
//        return "This is NetworkCall1"
//    }
//}
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val job = GlobalScope.launch{
            repeat(5) {
                Log.d(TAG, "coroutiNE is still working.........")
                //delay(3000L)
            }
        }

        runBlocking {

                job.join()
               //delay(3000L)
                Log.d(TAG, "finished couRoutine IO 1")
            }
        }
    }
