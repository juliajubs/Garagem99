/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.julia.garagem99.controllers;

import java.util.List;
import local.julia.garagem99.entities.Veiculo;
import local.julia.garagem99.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Controller de Garagem
 * @author sesideva
 */
@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    /**
     * Endpiont /garagem/garagem
     * Return TODOS os veiculos da base de dados.
     * @return
     */
    @GetMapping("/garagem")
    public List<Veiculo> findAll(){
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
    
}
