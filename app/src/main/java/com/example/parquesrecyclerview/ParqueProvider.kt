package com.example.parquesrecyclerview

class ParqueProvider {
    companion object {
        val listaParque = listOf<Parque>(
            Parque(
                nombreParque = "Parque del Retiro",
                descripcion = "Parque historico y de recreo en Madrid",
                fotoParque = "https://saltaconmigo.com/blog/wp-content/uploads/2020/09/Fin-de-semana-en-Madrid-Retiro-Estanque.jpg"
            ),
            Parque(
                nombreParque = "Parque María Luisa",
                descripcion="Parque junto a la Plaza España on gran cantidad de aves, plantas, y zonas de juego en Sevilla",
                fotoParque = "https://offloadmedia.feverup.com/sevillasecreta.co/wp-content/uploads/2020/06/24070607/shutterstock_1324665797-1-1024x651.jpg"
            ),
            Parque(
                nombreParque="Parque Güell",
                descripcion="Parque público con jardines y elementos arquitectonicos en Barcelona",
                fotoParque="https://www.barcelo.com/guia-turismo/wp-content/uploads/2019/04/parque-guell.jpg"
            ),
            Parque(
                nombreParque="Central Park",
                descripcion = "Parque urbano público situado en el distrito metropolitano de Manhattan, en la ciudad de Nueva York, Estados Unidos",
                fotoParque="https://cdn2.civitatis.com/estados-unidos/nueva-york/guia/central-park.jpg"
            ),
            Parque(
                nombreParque="Hyde Park",
                descripcion ="Hyde Park es un parque situado en Londres",
                fotoParque="https://mywowo.net/media/images/cache/londra_hyde_park_03_kensington_gardens_jpg_1200_630_cover_85.jpg"
            )
        )
    }
}