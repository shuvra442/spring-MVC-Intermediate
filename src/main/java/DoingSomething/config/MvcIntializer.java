package DoingSomething.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Approach::->> 2
     *
     * This a second approach and standard approach MVC annotation based....
     *
     */

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ViewResolverInitialize.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/alien/*"};
    }
}
