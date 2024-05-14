package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

@GetMapping("/ciao/{regione}")

public User salutare(@RequestParam String nome, @PathVariable String regione) {
String saluto ="ciao, " + nome + "com'è il tempo in "+ regione + "?";
return new User(nome, regione, saluto);
}
}
