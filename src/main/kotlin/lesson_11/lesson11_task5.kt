package org.example.lesson_11

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(userIdCounter++, userName)
        members.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val author = members.find { it.userId == authorId }
        if (author != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            return newMessage
        }
        return null
    }

    fun printThread() {
        for (message in messages) {
            val author = members.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.userName}: ${message.message}")
            }
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Asteroid_destroyer")
    val user2 = forum.createNewUser("Megatron")

    forum.createNewMessage(user1.userId, "Привет всем")
    forum.createNewMessage(user2.userId, "Привет-привет")

    forum.printThread()
}

