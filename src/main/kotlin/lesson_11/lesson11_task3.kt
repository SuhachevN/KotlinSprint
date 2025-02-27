package org.example.lesson_11

class User(
    val nickname: String,
    val avatar: String,
    var status: String,
) {
    fun updateStatus(newStatus: String) {
        status = newStatus
    }
}

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<User> = mutableListOf(),
) {
    fun addParticipant(user: User) {
        participants.add(user)
    }

    fun updateParticipantStatus(nickname: String, newStatus: String) {
        participants.find { it.nickname == nickname }?.updateStatus(newStatus)
    }

    fun displayInfo() {
        println("Комната: $title")
        println("Участники:")
        for (participant in participants) {
            println("${participant.avatar} ${participant.nickname} - ${participant.status}")
        }
    }
}

fun main() {

    val user1 = User("Asteroid_destroyer", "ಠ益ಠ", "пользователь заглушен")
    val user2 = User("Galactic_researcher", "ಥ益ಥ", "микрофон выключен")

    val room = Room("\uD83C\uDF0B", "Строим планы по захвату планеты")

    room.addParticipant(user1)
    room.addParticipant(user2)

    room.updateParticipantStatus("Asteroid_destroyer", "пользователь разговаривает")

    room.displayInfo()
}
