package utez.edu.mx.cvhda9a.controller;


@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class User1Controller {

    @GetMapping("")
    public String getUser() {
        return "Hello World";
    }
}
