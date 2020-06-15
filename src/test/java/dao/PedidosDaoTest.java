/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dao.Pedido;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author brian
 */
public class PedidosDaoTest {
    
    static PedidosDao pedidos=new PedidosDao();
    static Pedido pedido=new Pedido(1,3,2,new Date(2019-10-11),new Date(2019-10-18),new Date(2019-10-14),10,new BigDecimal(123.56),"Dam","Paseo de Extremadura","Madrid","Madrid","28002","España");
    
    public PedidosDaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class PedidosDao.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        PedidosDao instance = new PedidosDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    @Test
    public void testRead() {       
        System.out.println("read");
        Integer id =0;
        Pedido result = pedidos.read(id);
        assertEquals(result, null);
        id = 1;
        result = pedidos.read(id);
        assertEquals(result.getId(),id);
    }

    /**
     * Test of insert method, of class PedidosDao.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Pedido pedido = null;
        Integer expResult = null;
        Integer result = pedidos.insert(pedido);
        assertEquals(expResult, result);
        
        expResult=-1;
        Pedido pedido1=pedido;
        result=pedidos.insert(pedido1);
        assertEquals(expResult,result);
    }

    /**
     * Test of update method, of class PedidosDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.update(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PedidosDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");

        int result = pedidos.delete(pedido.getId());
        assertNotEquals(result, -1);
        
        result =pedidos.delete(1);
        assertEquals(result, -1);
    }

    /**
     * Test of listar method, of class PedidosDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Integer posicion = null;
        PedidosDao instance = new PedidosDao();
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
