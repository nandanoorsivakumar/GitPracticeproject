package com.adesso.gitpractict;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final Calculator calculator = new Calculator();

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculator.add(a, b);
    }

    @GetMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calculator.sub(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculator.multiply(a, b);
    }

    @GetMapping("/dividedby")
    public double dividedby(@RequestParam int a, @RequestParam int b) {
        return calculator.dividedby(a, b);
    }

    @GetMapping("/square/{a}")
    public double square(@PathVariable int a) {
        return calculator.square(a);
    }

    @GetMapping("/cube/{a}")
    public int cube(@PathVariable int a) {
        return calculator.cube(a);
    }
}