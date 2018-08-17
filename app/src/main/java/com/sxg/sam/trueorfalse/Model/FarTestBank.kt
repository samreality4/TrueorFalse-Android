package com.sxg.sam.trueorfalse.Model


class FarTestBank {

  var testBank : MutableList<Question>? = null

    init {

        testBank?.add(Question("According to the FASB and IASB conceptual frameworks, " +
                "the primary users of financial reports include investors, creditors, and lenders"
                , true))

        testBank?.add(Question("According to the FASB and IASB conceptual frameworks, " +
                "useful information must exhibit the fundamental\n" +
                "qualitative characteristics of faithful representation and relevance."
                , true))

        testBank?.add(Question("According to the FASB and IASB conceptual frameworks, " +
                "useful information must exhibit the fundamental\n" +
                "qualitative characteristics of faithful representation and relevance."
                , true))

    }


}