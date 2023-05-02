package com.example.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/mbti/{name}")
    @ResponseBody
    public String showMbti(@PathVariable String name) {
        return switch (name) {
            case "홍길동" -> {
                char j = 'J';
                yield  "INF" + j;
            }
            case "홍길순","임꺽정" -> "ENFP";
            case "황인성" -> "ESTJ";
            case "고우영","고우영2" -> {
                char j = 'J';
                yield  "ISF" + j;
            }
            default -> "모름";
        };
    }

//    @GetMapping("/plus")//?a=2&b=2 =4가 나온다
//    @ResponseBody
//    public int showPlus(int a, int b){
//        return a+b;
//    }
//    @GetMapping("/minus")
//    @ResponseBody
//    public int showMinus(int a,int b){
//        return a-b;
//    }
//    int a;
//    @GetMapping("/increase") //위에 변수를 선언을 해주고, return에 증감연산자 사용/ 매개변수x
//    @ResponseBody
//    public int Increase(){
//      return a++;
//    }
//    @GetMapping("/name")
//    @ResponseBody
//    public String Name(){
//        return "고우영";
//    }
//    @GetMapping("/age")
//    @ResponseBody
//    public int Age(){
//        return 31;
//    }
//    @GetMapping("/height")
//    @ResponseBody
//    public int Height(){
//        return 171;
//    }
}


