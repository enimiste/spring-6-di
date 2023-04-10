package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.FauxService;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final FauxService fauxService;

    public FauxController(FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String dataSource(){
        return fauxService.getDatasource();
    }
}
