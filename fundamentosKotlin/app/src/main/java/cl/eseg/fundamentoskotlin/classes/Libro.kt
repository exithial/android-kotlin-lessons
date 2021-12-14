package cl.eseg.fundamentoskotlin.classes

data class Libro(
    val id: Int,
    var nombre: String,
    var descripcion: String,
    var autor: String,
    var numeroPaginas: Int,
    var publicado: Boolean
) {
    fun mostrarDetalle() = println(
        """
        Nombre:                 $nombre
        Descripción:            $descripcion
        Autor:                  $autor
        Número de páginas:      $numeroPaginas
        Publicado:              $publicado
        """.trimIndent()
    )
}