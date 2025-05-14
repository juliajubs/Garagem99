/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.julia.garagem99.repositories;

import java.util.List;
import local.julia.garagem99.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {
    
    List<Veiculo> findById(long id);
    List<Veiculo> findByCorIgnoreCase(String cor);
    List<Veiculo> findByAno(int ano);
    
    Veiculo findByIataCode(String iataCode);
    
}
