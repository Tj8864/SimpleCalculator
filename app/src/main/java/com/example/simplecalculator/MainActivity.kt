package com.example.simplecalculator

import android.annotation.SuppressLint
import android.drm.DrmStore
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bg = findViewById<ImageView>(R.id.blackBG)
        val one = findViewById<Button>(R.id.oneButton)
        val two = findViewById<Button>(R.id.twoButton)
        val three = findViewById<Button>(R.id.threeButton)
        val four = findViewById<Button>(R.id.fourButton)
        val five = findViewById<Button>(R.id.fiveButton)
        val six = findViewById<Button>(R.id.sixButton)
        val seven = findViewById<Button>(R.id.sevenButton)
        val eight = findViewById<Button>(R.id.eightButton)
        val nine = findViewById<Button>(R.id.nineButton)
        val zero = findViewById<Button>(R.id.zeroButton)
        val add = findViewById<Button>(R.id.addButton)
        val minus = findViewById<Button>(R.id.minusButton)
        val multiply = findViewById<Button>(R.id.multiplyButton)
        val decimal = findViewById<Button>(R.id.pointButton)
        val divide = findViewById<Button>(R.id.divideButton)
        val equal = findViewById<Button>(R.id.equalButton)
        val delete = findViewById<Button>(R.id.delButton)

        bg.setImageResource(R.drawable.black)

        val displayOne = findViewById<TextView>(R.id.firstDisplay)
        val displayTwo = findViewById<TextView>(R.id.displayTwo)
        val ansDisplay = findViewById<TextView>(R.id.answerDisplay)
        displayOne.text = ""
        displayOne.textSize = 40.0F
        displayTwo.text = ""
        displayTwo.textSize = 40.0F
        ansDisplay.text = ""
        ansDisplay.textSize = 30.0F

        var operationChoice = 0
        var lenPostDecimal = 0
        var answerString = ""
        var firstString = ""
        var secondString = ""
        var answerNum = 0.0
        var firstNum = 0.0
        var secondNum = 0.0
        var hasDecimalAlready = false

        one.text = "1"
        two.text = "2"
        three.text = "3"
        four.text = "4"
        five.text = "5"
        six.text = "6"
        seven.text = "7"
        eight.text = "8"
        nine.text = "9"
        zero.text = "0"
        add.text = "+"
        minus.text = "-"
        divide.text = "/"
        multiply.text = "x"
        equal.text = "="
        decimal.text = "."
        delete.text = "C"

        one.setBackgroundColor(Color.parseColor("#111111"))
        two.setBackgroundColor(Color.parseColor("#111111"))
        three.setBackgroundColor(Color.parseColor("#111111"))
        four.setBackgroundColor(Color.parseColor("#111111"))
        five.setBackgroundColor(Color.parseColor("#111111"))
        six.setBackgroundColor(Color.parseColor("#111111"))
        seven.setBackgroundColor(Color.parseColor("#111111"))
        eight.setBackgroundColor(Color.parseColor("#111111"))
        nine.setBackgroundColor(Color.parseColor("#111111"))
        zero.setBackgroundColor(Color.parseColor("#111111"))
        equal.setBackgroundColor(Color.parseColor("#111111"))
        add.setBackgroundColor(Color.parseColor("#222222"))
        minus.setBackgroundColor(Color.parseColor("#222222"))
        divide.setBackgroundColor(Color.parseColor("#222222"))
        multiply.setBackgroundColor(Color.parseColor("#222222"))
        decimal.setBackgroundColor(Color.parseColor("#111111"))
        delete.setBackgroundColor(Color.parseColor("#FF0000"))

        //one.setTextColor(getApplication().getResources().getColor(R.color.black))
        //two.setTextColor(getApplication().getResources().getColor(R.color.black))
        //three.setTextColor(getApplication().getResources().getColor(R.color.black))
        //four.setTextColor(getApplication().getResources().getColor(R.color.black))
        //five.setTextColor(getApplication().getResources().getColor(R.color.black))
        //six.setTextColor(getApplication().getResources().getColor(R.color.black))
        //seven.setTextColor(getApplication().getResources().getColor(R.color.black))
        //eight.setTextColor(getApplication().getResources().getColor(R.color.black))
        //nine.setTextColor(getApplication().getResources().getColor(R.color.black))
        //zero.setTextColor(getApplication().getResources().getColor(R.color.black))
        //add.setTextColor(getApplication().getResources().getColor(R.color.black))
        //minus.setTextColor(getApplication().getResources().getColor(R.color.black))
        //multiply.setTextColor(getApplication().getResources().getColor(R.color.black))
        //divide.setTextColor(getApplication().getResources().getColor(R.color.black))
        //decimal.setTextColor(getApplication().getResources().getColor(R.color.black))
        equal.setTextColor(Color.parseColor("#296d98"))
        //delete.setTextColor(getApplication().getResources().getColor(R.color.black))

        one.textSize = 40.0F
        two.textSize = 40.0F
        three.textSize = 40.0F
        four.textSize = 40.0F
        five.textSize = 40.0F
        six.textSize = 40.0F
        seven.textSize = 40.0F
        eight.textSize = 40.0F
        nine.textSize = 40.0F
        zero.textSize = 40.0F
        add.textSize = 40.0F
        multiply.textSize = 40.0F
        divide.textSize = 40.0F
        minus.textSize = 40.0F
        decimal.textSize = 40.0F
        equal.textSize = 40.0F
        delete.textSize = 40.0F

        one.setOnClickListener {
            firstString += "1"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        two.setOnClickListener {
            firstString += "2"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        three.setOnClickListener {
            firstString += "3"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        four.setOnClickListener {
            firstString += "4"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        five.setOnClickListener {
            firstString += "5"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        six.setOnClickListener {
            firstString += "6"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        seven.setOnClickListener {
            firstString += "7"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        eight.setOnClickListener {
            firstString += "8"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        nine.setOnClickListener {
            firstString += "9"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        zero.setOnClickListener {
            firstString += "0"
            if(hasDecimalAlready && lenPostDecimal<7){
                lenPostDecimal+=1
                displayOne.text = firstString
            }else if(firstString.length<10) {
                displayOne.text = firstString
            }else {
                displayOne.text = "Input too long"
                hasDecimalAlready = false
                lenPostDecimal = 0
                firstString = ""
            }
        }
        decimal.setOnClickListener {
            if(!hasDecimalAlready){
                hasDecimalAlready = true
                firstString += "."
            }
        }
        add.setOnClickListener {
            if(firstString != "" && secondString == ""){
                if(firstString[firstString.length - 1]=='.'){
                    firstString += "0"
                }
                if(firstString[0]=='.'){
                    firstString = "0$firstString"
                }
                hasDecimalAlready = false
                lenPostDecimal = 0
                secondString = firstString
                firstString = ""
                displayOne.text = firstString
                displayTwo.text = secondString
                operationChoice = 0
            }
        }
        minus.setOnClickListener {
            if(firstString != "" && secondString == ""){
                if(firstString[firstString.length - 1]=='.'){
                    firstString += "0"
                }
                if(firstString[0]=='.'){
                    firstString = "0$firstString"
                }
                hasDecimalAlready = false
                lenPostDecimal = 0
                secondString = firstString
                firstString = ""
                displayOne.text = firstString
                displayTwo.text = secondString
                operationChoice = 1
            }
        }
        multiply.setOnClickListener {
            if(firstString != "" && secondString == ""){
                if(firstString[firstString.length - 1]=='.'){
                    firstString += "0"
                }
                if(firstString[0]=='.'){
                    firstString = "0$firstString"
                }
                hasDecimalAlready = false
                lenPostDecimal = 0
                secondString = firstString
                firstString = ""
                displayOne.text = firstString
                displayTwo.text = secondString
                operationChoice = 2
            }
        }
        divide.setOnClickListener {
            if(firstString != "" && secondString == ""){
                if(firstString[firstString.length - 1]=='.'){
                    firstString += "0"
                }
                if(firstString[0]=='.'){
                    firstString = "0$firstString"
                }
                hasDecimalAlready = false
                lenPostDecimal = 0
                secondString = firstString
                firstString = ""
                displayOne.text = firstString
                displayTwo.text = secondString
                operationChoice = 2
            }
        }
        equal.setOnClickListener {
            if(firstString != "" && secondString != ""){
                firstNum = firstString.toDouble()
                if(secondString[secondString.length - 1] == '.'){
                    secondString += "0"
                }
                secondNum = secondString.toDouble()
                when(operationChoice){
                    0->answerNum = firstNum + secondNum
                    1->answerNum = secondNum - firstNum
                    2->answerNum = firstNum * secondNum
                    3->answerNum = secondNum / firstNum
                }
                answerString = answerNum.toString()
                ansDisplay.text = answerString
                firstString = ""
                secondString = ""
                displayOne.text = firstString
                displayTwo.text = secondString
                hasDecimalAlready = false
                lenPostDecimal = 0

            }
            else if(firstString == "" && secondString == "" && answerString != ""){
                firstString = answerString
                answerString = ""
                hasDecimalAlready = firstString.contains(".")
                if(hasDecimalAlready){
                    var temp = 0
                    for(i in 0..firstString.length){
                        if(firstString[i]=='.'){
                            temp = i
                            break
                        }
                    }
                    lenPostDecimal = firstString.length - temp - 1
                }
                displayOne.text = firstString
                ansDisplay.text = answerString
            }
        }
        delete.setOnClickListener {
            firstString = ""
            displayOne.text = firstString
            hasDecimalAlready = false
            lenPostDecimal = 0
        }
    }
}