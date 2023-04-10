package guru.springframework.springdi.services.fauxImpl;

import guru.springframework.springdi.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatFauxService implements FauxService {
    @Override
    public String getDatasource() {
        return "uat";
    }
}
