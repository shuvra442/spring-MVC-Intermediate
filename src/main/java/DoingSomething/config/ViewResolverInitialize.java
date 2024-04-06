package DoingSomething.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "DoingSomething.controller")
public class ViewResolverInitialize {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolvered = new InternalResourceViewResolver();
        viewResolvered.setPrefix("/WEB-INF/view/");
        viewResolvered.setSuffix(".jsp");
        return viewResolvered;
    }
}
