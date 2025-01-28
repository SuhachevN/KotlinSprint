package org.example.lesson_11

class RecipeCategory(
    val id: Int,
    val name: String,
    val description: String?,
    val recipes: List<String>,

){}

class Recipe(
    val id: Int,
    val title: String,
    val instructions: String,
    val categoryId: Int,
    val ingredients: List<String>,
    val numberOfServings: Int,
){}

class Ingredient(
val id: Int,
val name: String,
val quantity: String,
val unit: String,
){}