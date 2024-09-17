package com.example.pgmanagement.DataClass

import com.example.pgmanagement.R

data class GuestDataClass(
    val personImage : Int ,
    val personName : String,
    val isRentPaid : Boolean ,
    val isEbPaid : Boolean
)

object MockGuest{
    fun getGuest() : List<GuestDataClass>{
        return listOf(
            GuestDataClass(R.drawable.person1 , "Manoj Thomas" , true , false),
            GuestDataClass(R.drawable.person, "Karpaga Raji", true, false),
            GuestDataClass(R.drawable.person2, "Naveen Chakravarthi", false, true),
            GuestDataClass(R.drawable.person3, "Vijaya Basker", true, true),
            GuestDataClass(R.drawable.person4, "Abishek Patil", false, false),
            GuestDataClass(R.drawable.person5, "Sethu venkatesh", true, false),
        )
    }
}
