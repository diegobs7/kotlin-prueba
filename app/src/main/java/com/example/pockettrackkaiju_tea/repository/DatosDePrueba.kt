package com.example.pockettrackkaiju_tea.repository

import com.example.pockettrackkaiju_tea.model.CategoriaProducto
import com.example.pockettrackkaiju_tea.model.Movimiento
import com.example.pockettrackkaiju_tea.model.Producto
import com.example.pockettrackkaiju_tea.model.Rol
import com.example.pockettrackkaiju_tea.model.TipoMovimiento
import com.example.pockettrackkaiju_tea.model.TipoProducto
import com.example.pockettrackkaiju_tea.model.Usuario

object DatosDePrueba {

    val vendedor=Usuario(id = "U-1", nombre = "Thomas Araya", rol = Rol.VENDEDOR)
    val admin=Usuario(id = "U-2", nombre = "Andrés Marín", rol = Rol.ADMINISTRADOR)
    val inv=Usuario(id = "U-3", nombre = "Diego Bergeret", rol = Rol.ENCARGADO_INVENTARIO)

    val usuarios: List<Usuario> = listOf(vendedor,admin,inv)

    val productos = listOf(
        Producto(
            codigo = "KAI-001",
            nombre = "Polera Slam Dunk Shohoku",
            descripcion = "Polera 100% algodón con diseño de Hanamichi Sakuragi",
            categoria = CategoriaProducto.ANIME,
            tipo = TipoProducto.POLERA,
            precio = 16990,
            stockActual = 25,
            stockMinimo = 10,
            detalle = "Estampado en serigrafía tradicional"
        ),
        Producto(
            codigo = "KAI-002",
            nombre = "Polerón Canguro Zelda Tears of the Kingdom",
            descripcion = "Polerón con capucha y bolsillo frontal con logo de Zelda",
            categoria = CategoriaProducto.VIDEOJUEGOS,
            tipo = TipoProducto.POLERON_CANGURO,
            precio = 32990,
            stockActual = 8,
            stockMinimo = 5,
            detalle = null
        ),
        Producto(
            codigo = "KAI-003",
            nombre = "Polera Berserk Guts Armor",
            descripcion = "Polera negra manga corta con panel del manga de Berserk",
            categoria = CategoriaProducto.ANIME,
            tipo = TipoProducto.POLERA,
            precio = 16990,
            stockActual = 12,
            stockMinimo = 5,
            detalle = "Corte oversize"
        ),
        Producto(
            codigo = "KAI-004",
            nombre = "Polera Manga Larga Jujutsu Kaisen",
            descripcion = "Diseño de Satoru Gojo en técnica de semitono",
            categoria = CategoriaProducto.ANIME,
            tipo = TipoProducto.POLERA_MANGA_LARGA,
            precio = 19990,
            stockActual = 4,
            stockMinimo = 5,
            detalle = null
        ),
        Producto(
            codigo = "KAI-005",
            nombre = "Polera Chrono Trigger Team",
            descripcion = "Polera clásica con arte original del videojuego de SNES",
            categoria = CategoriaProducto.VIDEOJUEGOS,
            tipo = TipoProducto.POLERA,
            precio = 15990,
            stockActual = 20,
            stockMinimo = 10,
            detalle = "Edición limitada"
        ),
        Producto(
            codigo = "KAI-006",
            nombre = "Polerón Polo Hunter x Hunter",
            descripcion = "Polerón cuello redondo con bordado de la licencia de Cazador",
            categoria = CategoriaProducto.ANIME,
            tipo = TipoProducto.POLERON_POLO,
            precio = 28990,
            stockActual = 15,
            stockMinimo = 5,
            detalle = null
        ),
        Producto(
            codigo = "KAI-007",
            nombre = "Polera Asian Kaiju Oni Mask",
            descripcion = "Diseño original de máscara Oni estilo japonés",
            categoria = CategoriaProducto.ASIAN_KAIJU,
            tipo = TipoProducto.POLERA,
            precio = 17990,
            stockActual = 30,
            stockMinimo = 15,
            detalle = "Diseño exclusivo de la marca"
        ),
        Producto(
            codigo = "KAI-008",
            nombre = "Polera Sin Mangas Evangelion",
            descripcion = "Polera sin mangas ideal para verano, diseño EVA-01",
            categoria = CategoriaProducto.ANIME,
            tipo = TipoProducto.POLERA_SIN_MANGAS,
            precio = 14990,
            stockActual = 6,
            stockMinimo = 8,
            detalle = null
        ),
        Producto(
            codigo = "KAI-009",
            nombre = "Pack Stickers Pokémon Kanto",
            descripcion = "Set de 10 stickers de vinilo resistentes al agua",
            categoria = CategoriaProducto.VIDEOJUEGOS,
            tipo = TipoProducto.ACCESORIOS,
            precio = 4990,
            stockActual = 50,
            stockMinimo = 20,
            detalle = "Incluye los iniciales de Kanto"
        ),
        Producto(
            codigo = "KAI-010",
            nombre = "Polerón Canguro Akira",
            descripcion = "Polerón rojo icónico con diseño de la píldora de Akira",
            categoria = CategoriaProducto.ANIME,
            tipo = TipoProducto.POLERON_CANGURO,
            precio = 34990,
            stockActual = 3,
            stockMinimo = 5,
            detalle = "Algodón peinado premium"
        )
    )

    val movimientos = listOf(
        Movimiento(
            id = "MOV-1",
            codigoProducto = "KAI-001",
            tipo = TipoMovimiento.ENTRADA,
            cantidad = 20,
            motivo = "Recepción de mercadería de proveedor",
            fecha = "2026-10-01",
            usuario = inv
        ),
        Movimiento(
            id = "MOV-2",
            codigoProducto = "KAI-002",
            tipo = TipoMovimiento.SALIDA_VENTA,
            cantidad = 5,
            motivo = "Venta Nro. 1042",
            fecha = "2026-10-02",
            usuario = inv
        ),
        Movimiento(
            id = "MOV-3",
            codigoProducto = "KAI-004",
            tipo = TipoMovimiento.SALIDA_CONSUMO,
            cantidad = 1,
            motivo = "Uso interno en limpieza de local",
            fecha = "2026-10-03",
            usuario = admin
        ),
        Movimiento(
            id = "MOV-4",
            codigoProducto = "KAI-007",
            tipo = TipoMovimiento.AJUSTE,
            cantidad = 2,
            motivo = "Ajuste por producto dañado en góndola",
            fecha = "2026-10-04",
            usuario = inv
        )
    )
}










