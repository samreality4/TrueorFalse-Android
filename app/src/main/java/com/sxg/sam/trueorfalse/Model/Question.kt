package com.sxg.sam.trueorfalse.Model

class Question{
    var questionText :String = ""
    var questionAnswer:Boolean = false

init {

}

    constructor(text:String, answer: Boolean){
        questionText = text
        questionAnswer = answer

    }


}