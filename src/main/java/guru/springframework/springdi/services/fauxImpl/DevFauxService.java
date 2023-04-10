package guru.springframework.springdi.services.fauxImpl;

import guru.springframework.springdi.services.FauxService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevFauxService implements FauxService {
    @Override
    public String getDatasource() {
        return "dev";
    }
}
