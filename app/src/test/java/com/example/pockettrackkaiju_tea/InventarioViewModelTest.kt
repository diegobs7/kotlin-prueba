package com.example.pockettrackkaiju_tea

import com.example.pockettrackkaiju_tea.model.CategoriaProducto
import com.example.pockettrackkaiju_tea.model.Producto
import com.example.pockettrackkaiju_tea.model.TipoProducto
import com.example.pockettrackkaiju_tea.viewmodel.InventarioViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class InventarioViewModelTest {

    private val viewModel = InventarioViewModel()

    @Test
    fun catalogoTiene10Productos() {
        assertEquals(10, viewModel.productos.value.size)
    }

    @Test
    fun buscarProductoPorCodigoIgnoraMayusculas() {
        assertNotNull(viewModel.buscarProducto("kai-001"))
    }

    @Test
    fun alertaCuandoStockEsMenorOIgualAlMinimo() {
        // KAI-004: stock 4, mínimo 5 → en alerta · KAI-001: stock 25, mínimo 10 → no
        assertTrue(viewModel.estaEnAlerta(viewModel.buscarProducto("KAI-004")!!))
        assertFalse(viewModel.estaEnAlerta(viewModel.buscarProducto("KAI-001")!!))
    }

    @Test
    fun historialDeUnProductoSoloTraeSusMovimientos() {
        assertEquals(1, viewModel.movimientosDe("KAI-004").size)
    }

    private fun productoDePrueba(codigo: String, precio: Int = 1000) = Producto(
        codigo = codigo,
        nombre = "Producto de prueba",
        descripcion = "",
        categoria = CategoriaProducto.OTROS,
        tipo = TipoProducto.ACCESORIOS,
        precio = precio,
        stockActual = 5,
        stockMinimo = 2
    )

    @Test
    fun productoNuevoApareceEnElCatalogo() {
        assertTrue(viewModel.agregarProducto(productoDePrueba("KAI-999")))
        assertEquals(11, viewModel.productos.value.size)
    }

    @Test
    fun rechazaCodigoRepetido() {
        assertFalse(viewModel.agregarProducto(productoDePrueba("KAI-001")))
        assertEquals(10, viewModel.productos.value.size)
    }

    @Test
    fun rechazaPrecioCero() {
        assertFalse(viewModel.agregarProducto(productoDePrueba("KAI-998", precio = 0)))
    }
}