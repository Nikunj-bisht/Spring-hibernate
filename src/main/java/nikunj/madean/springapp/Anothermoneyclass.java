package nikunj.madean.springapp;

import org.springframework.stereotype.Component;

@Component
public class Anothermoneyclass implements Money{
    public int getmoney() {
        return 2000;
    }
}
