package com.example.jesus_pol_act10
import javafx.fxml.FXML
import javafx.scene.control.ChoiceBox
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.collections.ObservableList

class HelloController {
    @FXML
    private lateinit var pokemonImageView1: ImageView
    @FXML
    private lateinit var pokemonImageView2: ImageView
    @FXML
    private lateinit var pokemonImageView3: ImageView
    @FXML
    private lateinit var pokemonImageView4: ImageView
    @FXML
    private lateinit var pokemonImageView5: ImageView

    @FXML
    private lateinit var pokemonChoiceBox1: ChoiceBox<String>
    @FXML
    private lateinit var pokemonChoiceBox2: ChoiceBox<String>
    @FXML
    private lateinit var pokemonChoiceBox3: ChoiceBox<String>
    @FXML
    private lateinit var pokemonChoiceBox4: ChoiceBox<String>
    @FXML
    private lateinit var pokemonChoiceBox5: ChoiceBox<String>



    @FXML
    fun initialize() {
        // Crear una lista de opciones para el primer ChoiceBox
        val opcionesPokemon1 = FXCollections.observableArrayList("Pikachu", "Bulbasaur", "Charmander", "Squirtle")
        // Añadir las opciones al primer ChoiceBox
        pokemonChoiceBox1.items = opcionesPokemon1

        // Puedes hacer lo mismo para los demás ChoiceBox de la misma manera
        val opcionesPokemon2 = FXCollections.observableArrayList("Pidgey", "Eevee", "Jigglypuff", "Snorlax")
        pokemonChoiceBox2.items = opcionesPokemon2

        val opcionesPokemon3 = FXCollections.observableArrayList("Blastoise", "Venusaur", "Charizard", "Raichu")
        pokemonChoiceBox3.items = opcionesPokemon3

        val opcionesPokemon4 = FXCollections.observableArrayList("Squirtle", "Bulbasaur", "Charmander", "Pikachu")
        pokemonChoiceBox4.items = opcionesPokemon4

        val opcionesPokemon5 = FXCollections.observableArrayList("Mewtwo", "Mew", "Lugia", "Ho-Oh")
        pokemonChoiceBox5.items = opcionesPokemon5
    }

    private fun loadPokemonImages() {
        pokemonImageView1.image = Image("https://es.wikipedia.org/wiki/Archivo:Amaterasu_cave_crop.jpg")
        pokemonImageView2.image = Image("https://es.wikipedia.org/wiki/Archivo:Amaterasu_cave_crop.jpg")
        pokemonImageView3.image = Image("https://es.wikipedia.org/wiki/Archivo:Amaterasu_cave_crop.jpg")
        pokemonImageView4.image = Image("https://es.wikipedia.org/wiki/Archivo:Amaterasu_cave_crop.jpg")
        pokemonImageView5.image = Image("https://es.wikipedia.org/wiki/Archivo:Amaterasu_cave_crop.jpg")
    }


}

class FXCollections {
    companion object {
        fun observableArrayList(vararg items: String): ObservableList<String> {
            return observableArrayList(*items)
        }
    }
}
