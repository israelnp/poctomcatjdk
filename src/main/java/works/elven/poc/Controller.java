package works.elven.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("hello")
    public List<String> listar(){
        return List.of("Hello", "World", "Elven", "Works");
    }
}
