package nikunj.madean.springapp;

import nikunj.madean.springapp.data.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.id.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "nikunj.madean.springapp")
public class Config implements WebMvcConfigurer {

public static final String prefix = "/WEB-INF/view/";
public static final String suffix = ".jsp";

@Bean
    public ViewResolver viewResolver(){

    UrlBasedViewResolver urlBasedViewResolver = new InternalResourceViewResolver();
    urlBasedViewResolver.setPrefix(prefix);
    urlBasedViewResolver.setSuffix(suffix);

    return urlBasedViewResolver;

}

@Bean
public Session session(){


    SessionFactory sessionFactory = new org.hibernate.cfg.Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();

    Session session = sessionFactory.getCurrentSession();
    return  session;

}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("mynewspring");
    }
}
