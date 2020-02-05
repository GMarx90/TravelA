
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
 
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
			registry.addViewController("/log").setViewName("login");
	}
 
}