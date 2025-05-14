package local.julia.garagem99.service;

import java.util.List;
import java.util.stream.Collectors;
import local.julia.garagem99.DTO.VeiculoDTO;
import local.julia.garagem99.entities.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import local.julia.garagem99.repositories.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {

    @Autowired
    private GaragemRepository garagemRepository;

    public List<VeiculoDTO> findAll() {
        List<Veiculo> resultGaragem = garagemRepository.findAll();
        
        List<VeiculoDTO> resultDTO = resultGaragem.stream()
                .map (x -> new VeiculoDTO(x)).toList();
                return resultDTO;
                        
    }

    public List<Veiculo> findById(long id) {
        List<Veiculo> result = garagemRepository.findById(id);
        return null;
    }

    public List<VeiculoDTO> findByCor(String cor) {
        List<Veiculo> resultGaragem = garagemRepository.findByCorIgnoreCase(cor);
        return resultGaragem.stream()
                .map(x -> new VeiculoDTO(x))
                .collect(Collectors.toList());
    }

    public List<VeiculoDTO> findByAno(int ano) {
        List<Veiculo> resultGaragem = garagemRepository.findByAno(ano);
        return resultGaragem.stream()
                .map(x -> new VeiculoDTO(x))
                .collect(Collectors.toList());
    }
}



