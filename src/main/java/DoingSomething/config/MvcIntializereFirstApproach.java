package DoingSomething.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MvcIntializereFirstApproach  /* implements WebApplicationInitializer */ {

    /**
     *
     * @param servletContext
     * @throws ServletException
     *
     * it's  a first approach to write spring MVC with Annotation based
     */
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
//        applicationContext.register(ViewResolverInitialize.class);
//
//        DispatcherServlet dispatcherServlet= new DispatcherServlet(applicationContext);
//        ServletRegistration.Dynamic cuustomServlet= servletContext.addServlet("spring",dispatcherServlet);
//        cuustomServlet.setLoadOnStartup(1);
//        cuustomServlet.addMapping("/alien/*");
//    }
}
