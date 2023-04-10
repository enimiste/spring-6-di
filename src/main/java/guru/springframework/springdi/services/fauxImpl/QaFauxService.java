package guru.springframework.springdi.services.fauxImpl;

import guru.springframework.springdi.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QaFauxService implements FauxService {
    @Override
    public String getDatasource() {
        return "qa";
    }
}
