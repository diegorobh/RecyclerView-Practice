package com.example.recyclerviewexcercise.Model

class CompositeItem(ingredient:String, header: String, isHeader: Boolean) {

    lateinit var ingredient: String
        private set

    lateinit var header: String
        private set

    var isHeader = false

        private set

    init {
        this.ingredient = ingredient
        this.header = header
        this.isHeader = isHeader
    }

    companion object {
        fun withCreature(creature: String): CompositeItem {
            val composite = CompositeItem("","",false)
            composite.ingredient = creature
            return composite
        }

        fun withHeader(header: String): CompositeItem {
            val composite = CompositeItem("","",true)
            composite.header = header
            composite.isHeader = true
            return composite
        }
    }

    override fun toString(): String {
        return if (isHeader) header else ingredient
    }
}