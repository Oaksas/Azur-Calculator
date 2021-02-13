package com.example.azcal


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.math.*
import org.mariuszgromada.math.mxparser.*


class MainActivity : AppCompatActivity() {
    lateinit var exp:EditText
    lateinit var del:Button
    lateinit var res:EditText


    fun  buttonIdentify(view: View){

        var btnPressed = view

        exp.setText((exp.text.toString() + btnPressed.getTag()))
        exp.setSelection(exp.getText().toString().length);


    }
    fun sinFun(view:View){
        if(exp.text.toString().isEmpty() ){
            res.setText("NaN")
        }
        else{

            var expp = exp.text.toString()
            var e :Expression= Expression(expp)
            var tempRes = sin((e.calculate())* PI/180)
            res.setText(String.format("%.3f", tempRes).toDouble().toString())
            exp.setText(String.format("%.3f", tempRes).toDouble().toString())




        }


    }

    fun cosFun(view:View){
        if(exp.text.toString().isEmpty() ){
            res.setText("NaN")
        }
        else{

            var expp = exp.text.toString()
            var e :Expression= Expression(expp)
            var tempRes = cos((e.calculate())* PI/180)
            res.setText(String.format("%.3f", tempRes).toDouble().toString())
            exp.setText(String.format("%.3f", tempRes).toDouble().toString())



        }


    }


    fun tanFun(view:View){
        if(exp.text.toString().isEmpty() ){
            res.setText("NaN")
        }
        else{

            var expp = exp.text.toString()
            var e :Expression= Expression(expp)
            var tempRes = tan((e.calculate())* PI/180)
            res.setText(String.format("%.3f", tempRes).toDouble().toString())
            exp.setText(String.format("%.3f", tempRes).toDouble().toString())




        }


    }



    fun sqrFun(view:View){

            var expp = exp.text.toString()
            var e :Expression= Expression(expp)
            var tempRes =((e.calculate())).pow(2)
            res.setText(String.format("%.3f", tempRes).toDouble().toString())
            exp.setText(String.format("%.3f", tempRes).toDouble().toString())


    }

    fun piFun(view:View){

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes:Double=0.0;
        if(e.calculate().toString() === "NaN"){
             tempRes =3.14159265359

        }else{
             tempRes = e.calculate() * 3.14159265359

        }
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())


    }
    fun eFun(view:View){

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes=0.0;
        if(e.calculate().toString() === "NaN"){
            tempRes =2.71828

        }else{
            tempRes = e.calculate() * 2.71828

        }
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())


    }



    fun cubeFun(view:View){

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes =((e.calculate())).pow(3)
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())

    }
    fun loga(view:View){

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes =log(10.0,((e.calculate())))
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())


    }


    fun sqrRtFun(view:View){

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes = sqrt((e.calculate()))
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())

    }
    fun lnFun(view:View){

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes = ln((e.calculate()))
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())


    }

    fun facto(view:View) {

        var expp = exp.text.toString()
        var e :Expression= Expression(expp)

        var temp:Int =e.calculate().toInt()

        var factorial: Long = 1
        for (i in 1..temp) {
            factorial *= i.toLong()
        }
        res.setText(factorial.toString())
        exp.setText(factorial.toString())
    }
    fun power(view:View) {



        var expp = exp.text.toString()
        var e :Expression= Expression(expp)
        var tempRes =(10.0).pow((e.calculate()))
        res.setText(String.format("%.3f", tempRes).toDouble().toString())
        exp.setText(String.format("%.3f", tempRes).toDouble().toString())

    }



    fun evalResult(view:View){
        var expression = exp.text.toString()
        var e :Expression= Expression(expression)

        res.setText(e.calculate().toString())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        del = findViewById<Button>(R.id.buttonDel)

        exp = findViewById(R.id.inputOp)

        res = findViewById(R.id.inputRes)



        del.setOnClickListener {
            exp.setText("")
        }

    }
}