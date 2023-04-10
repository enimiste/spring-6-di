package guru.springframework.springdi.services.fauxImpl;

import guru.springframework.springdi.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdFauxService implements FauxService {
    @Override
    public String getDatasource() {
        return "prod";
    }
}
