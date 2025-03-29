package org.example.lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "", isLoading = false)
        println("Текущее состояние: $mainScreenState")
        println("Начинаем загрузку данных...")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Текущее состояние: $mainScreenState")
        Thread.sleep(3000)

        val loadedData = "Загруженные данные с сервера"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)
        println("Загрузка завершена.")
        println("Текущее состояние: $mainScreenState")
    }

    fun getCurrentState(): MainScreenState {
        return mainScreenState
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}