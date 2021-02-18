package nikunj.madean.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Baseballplayer implements coach{

    service serviceclass;

    @Value("${foo.email}")
    String email;


    @Autowired
    @Qualifier("moneyclass")
    Money moneyclass;

  //   constructor injection which is passed by spring (Autowiring)

  //  @Autowired
    public Baseballplayer(service serviceclass){
        this.serviceclass = serviceclass;
    }

    public String getworkout() {

        isserviceavaible();

        return "Baseball game";
    }

    private void isserviceavaible() {

        System.out.println(serviceclass.isavaible());

    }

     // setter injection will be called by spring
    public void setMoney(Moneyclass moneyclass){

        this.moneyclass = moneyclass;

    }

    public Money getmoneyclass(){

       System.out.println(this.moneyclass.getmoney());
return this.moneyclass;
    }

    public void setEmail(){

        System.out.println(this.email);

    }

    // method annotation
@PostConstruct
    public void runbefore(){

        System.out.println("Connecting to databse");
        setEmail();
    }




}
