/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.bd.app;

import DAO.Dao;
import entidades.Carro;
import entidades.Cliente;
import entidades.Locacao;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class JPABDAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = Dao.consultaByPlaca("cba-3456");
        System.out.println(car.toString());
      /* List<Carro> lista = Dao.consultaCarros();
       for(Carro car : lista){
           System.out.println(car.toString());           
       }*/
        
        
        
        /*Cliente c = new Cliente();
        c.setNome("Pedro");
        c.setCpf("123");
        c.setFone("1234-4567");
        c.setEmail("pedro@gmail.com");
        
        if(Dao.persist(c))
            System.out.println("Cliente inserido com sucesso");
        */
      /*  Carro car = new Carro();
        car.setPlaca("cba-3456");
        car.setModelo("Fusca");
        car.setMarca("wolks");
        car.setKm(10000);
        car.setArcondicionado(Boolean.TRUE);
        car.setDirecaohidraulico(Boolean.TRUE);
        
        if(Dao.persist(car))
           System.out.println("Carro inserido com sucesso");
        
        /*
        Locacao loc = new Locacao();
        loc.setCpfcliente(c);
        loc.setIdcarro(car);
        if(Dao.persist(loc))
           System.out.println("Locação inserida com sucesso");
        
       Cliente c = Dao.selecionarByCPF("123");
       System.out.print(c.toString());
       
       List<Cliente> lista = Dao.selecionarTodos();
       for(Cliente cli: lista){
         System.out.println(cli.toString());  
       }
       */
    }
    
}
