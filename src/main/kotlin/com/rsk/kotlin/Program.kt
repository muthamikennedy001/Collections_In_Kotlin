package com.rsk.kotlin

import com.rsk.java.Meeting
import com.rsk.java.Organizer
import java.lang.UnsupportedOperationException

fun main(args: Array<String>) {
    /* to be able to assign null to it then
    make it a null list of nullable persons using List<Person?>? */
    var people: MutableList<Person?>? = null
    people= mutableListOf(Person(23), Person(23))
    people.add(null)
    //allows person: Person? to be nullable
    for (person: Person? in people) {
        println(person?.age )

    }
    //allows person: Person? to be nullable
    for (person: Person in people.filterNotNull() ) {
        println(person.age )

    }

}
class Person(val age:Int):Organizer{
    override fun processMeeting(meetings: MutableList<Meeting>?) {
         throw UnsupportedOperationException("not implemented")
    }

}