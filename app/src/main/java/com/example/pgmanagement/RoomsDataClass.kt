package com.example.pgmanagement

data class RoomsDataClass(
    val roomName : String ,
    val roomType : Boolean,
    val roomSharing : String,
    val isFullyOccupied : Boolean
)

object MockRooms{
    fun getRooms() : List<RoomsDataClass>{
        return listOf(
            RoomsDataClass("1", true, "3 Sharing", false),
            RoomsDataClass("2", false, "2 Sharing", true),
            RoomsDataClass("3", true, "2 Sharing", false),
            RoomsDataClass("4", false, "3 Sharing", true),
            RoomsDataClass("5", true, "4 Sharing", false),
            RoomsDataClass("6", true, "3 Sharing", true),
            RoomsDataClass("7", false, "2 Sharing", false),
            RoomsDataClass("8", true, "4 Sharing", true),
            RoomsDataClass("9", false, "3 Sharing", false),
            RoomsDataClass("10", true, "2 Sharing", true),
            RoomsDataClass("11", false, "3 Sharing", true),
            RoomsDataClass("12", true, "2 Sharing", false),
            RoomsDataClass("13", false, "4 Sharing", true),
            RoomsDataClass("14", true, "3 Sharing", false),
            RoomsDataClass("15", false, "2 Sharing", true),
            RoomsDataClass("16", true, "4 Sharing", false),
            RoomsDataClass("17", true, "3 Sharing", true),
            RoomsDataClass("18", false, "2 Sharing", false),
            RoomsDataClass("19", true, "4 Sharing", true),
            RoomsDataClass("20", false, "3 Sharing", false)
        )
    }
}
