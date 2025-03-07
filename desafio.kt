// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel = Nivel.BASICO) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val conteudos = listOf(
        ConteudoEducacional("Kotlin Nivel I"), 
        ConteudoEducacional("Kotlin Nivel II"),
        ConteudoEducacional("Kotlin Nivel III"),
    )
    val formacao = Formacao("Desenvolvimento Backend com Kotlin", conteudos, Nivel.INTERMEDIARIO)

    val rodrigo = Usuario("Rodrigo Rodrigoso")
    val isis = Usuario("Isis Valverde")
    
    formacao.matricular(rodrigo)
    formacao.matricular(isis)
    
    println(formacao)
    println("Inscritos: ${formacao.inscritos}")
}
