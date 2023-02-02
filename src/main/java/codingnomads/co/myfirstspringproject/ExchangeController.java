package codingnomads.co.myfirstspringproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangeController {

    private final PositionService positionService;

    public ExchangeController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/buy")
    public String confirmBuy(){
        return positionService.processPosition(true);
    }

    @GetMapping("/sell")
    public String confirmSell(){
        return positionService.processPosition(false);
    }

    @GetMapping("/success")
    public String confirmSuccess(){
        return positionService.success();
    }
}
