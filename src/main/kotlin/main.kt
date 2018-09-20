import java.util.*

fun main(args: Array<String>){
    var quit: String?
    var search: String
    val plate =     listOf(Platenumber(1,"Auwal MS","KAD612AC","Brown","Hyundai","Registered",2010,2016),
                                           Platenumber(2,"Jamilu Hatsi","KAN613AA","Red","Honda","Not Registered",2011,2017),
                                           Platenumber(3,"Kalil Garko","BDA614AB","Green","Peugeout","Registered",2012,2018),
                                           Platenumber(4,"Khadija Dogowa","UGO615AD","Blue","Toyota","Not Registered",2013,2019),
                                           Platenumber(5,"Hadiza Muntari","DAL616AF","Orange","Campry","Registered",2014,2020),
                                           Platenumber(6,"Ummi Ahmad","MKW617AG","Yellow","Honda Civic","Not Registered",2015,2021),
                                           Platenumber(7,"Ramatu Kakanda","NAS618AK","Purple","Range Rover","Not Registered",2016,2022),
                                           Platenumber(8,"Hamisu Gwarzo","NSR619AJ","White","Mercedes","Registered",2017,2023))

    do {

        println("Choose an option \n(a)Search Plate Number \n(b)View all Plate Number")
        val enter = Scanner(System.`in`)
        val choose: String = enter.nextLine()

        if (choose == "a" || choose == "A") {

            println("Search using Plate Number")
            val select = Scanner(System.`in`)
            search = select.nextLine()
            println(Find(search,plate))

        } else if (choose == "b" || choose == "B") {
            //println(plate.groupBy { it.serial })
            println(DisplayPlates(plate))

        }
        else {

            println("Invalid Entry")
        }
        println("Do you want to search again (Y/N)")
        val exit = Scanner(System.`in`)
        quit = exit.nextLine()

    }while (quit=="y" || quit=="Y" )
    println("Thank you for using Kano Plate Number Directory")
}
fun Find(locate: String ,plate: List<Platenumber>){
    println("Record found Details Below:")
    for(query in plate){
        if (query.plate_num == locate){
            println("-----------------")
            println("Serial Number: ${query.Serial}")
            println("Name: ${query.name}")
            println("Plate Number: ${query.plate_num}")
            println("Color: ${query.color}")
            println("Model: ${query.model}")
            println("Status: ${query.status}")
            println("Year Issued: ${query.issued_year}")
            println("Expired Year: ${query.expired_year}")
            println("-----------------")
            return
        }
    }
    println("Record not found")
}

fun DisplayPlates(plate: List<Platenumber>){
    println("All Plate Numbers")
    for (display in plate){
        println("-----------------")
        println("Serial Number: ${display.Serial}")
        println("Name: ${display.name}")
        println("Plate Number: ${display.plate_num}")
        println("Color: ${display.color}")
        println("Model: ${display.model}")
        println("Status: ${display.status}")
        println("Year Issued: ${display.issued_year}")
        println("Expired Year: ${display.expired_year}")
        println("-----------------")

    }

}


