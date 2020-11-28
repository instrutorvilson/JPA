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

/**
 *
 * @author User
 */
public class JPABDAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNome("João");
        c.setCpf("321.456.789-53");
        c.setFone("1234-4567");
        c.setEmail("joao@gmail.com");
        
        if(Dao.persist(c))
            System.out.println("Cliente inserido com sucesso");
        
        Carro car = new Carro();
        car.setPlaca("bef-2345");
        car.setModelo("Ford Ka");
        car.setMarca("Ford");
        car.setKm(10000);
        car.setArcondicionado(Boolean.TRUE);
        car.setDirecaohidraulico(Boolean.TRUE);
        
        if(Dao.persist(car))
           System.out.println("Carro inserido com sucesso");
        
        Locacao loc = new Locacao();
        loc.setCpfcliente(c);
        loc.setIdcarro(car);
        if(Dao.persist(loc))
           System.out.println("Locação inserida com sucesso");
        
    }
    
}
