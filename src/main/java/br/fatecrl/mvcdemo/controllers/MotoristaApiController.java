package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Motorista;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/motoristas")
public class MotoristaApiController {


    private static final List<Motorista> motoristas = new ArrayList<Motorista>();

    public MotoristaApiController() {

        motoristas.add(new Motorista("0001", "Lucas", "3", "BRA2E19"));
        motoristas.add(new Motorista("0002", "Bruno", "4", "QYG8E46"));
        motoristas.add(new Motorista("0003", "Luiz", "5", "JSK8I56"));
    }

    @GetMapping
    public List<Motorista> getMotorista(){
        return motoristas;
    }

}