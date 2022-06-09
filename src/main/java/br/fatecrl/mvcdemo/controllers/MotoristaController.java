package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Motorista;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/motoristas")
public class MotoristaController {

    private static final List<Motorista> motoristas = new ArrayList<Motorista>();

    public MotoristaController() {
        motoristas.add(new Motorista("0001", "Lucas", "3", "BRA2E19"));
        motoristas.add(new Motorista("0002", "Bruno", "4", "QYG8E46"));
        motoristas.add(new Motorista("0003", "Luiz", "5", "JSK8I56"));
    }

    @GetMapping
    public String getMotorista(Model model)
    {
        model.addAttribute("motoristas", motoristas);
        return "motoristas";

    }
}
