package com.example.pgmanagement

data class DummyBranchDC(
    val image : Int ,
    val branch : String ,
    val location : String
)

object MockList
{
    fun getModel() : List<DummyBranchDC>
    {
        val item1 = DummyBranchDC(R.drawable.pgimage, "Red Branch", "Guindy")
        val item2 = DummyBranchDC(R.drawable.pg2, "Blue Branch", "T. Nagar")
        val item3 = DummyBranchDC(R.drawable.pg3, "Green Branch", "Velachery")
        val item4 = DummyBranchDC(R.drawable.pg5, "Yellow Branch", "Adyar")
        val item5 = DummyBranchDC(R.drawable.pg10, "Purple Branch", "Porur")
        val item6 = DummyBranchDC(R.drawable.pg6, "Orange Branch", "Anna Nagar")
        val item7 = DummyBranchDC(R.drawable.pg7, "Pink Branch", "Tambaram")
        val item8 = DummyBranchDC(R.drawable.pg8, "Cyan Branch", "Kodambakkam")
        val item9 = DummyBranchDC(R.drawable.pg9, "Magenta Branch", "Mylapore")
        val item10 = DummyBranchDC(R.drawable.pg10, "Lime Branch", "Perambur")

        val itemList : ArrayList<DummyBranchDC> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        itemList.add(item7)
        itemList.add(item8)
        itemList.add(item9)
        itemList.add(item10)

        return itemList
    }
}
