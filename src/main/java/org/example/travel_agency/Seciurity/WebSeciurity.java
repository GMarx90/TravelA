public class WebSeciurity extends WebSecurityConfigurerAdapter{
	
	private UserServie userService;
	
	public WebSeciurity (UserServie userService){
		this.userService=userService;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	auth.UserService(userService);}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/log").authenicated()
	.and()
	.formLogin().permitAll();}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/", "/log").permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/user/**").hasRole("USER")
			.anyRequest().authenticated()
		.and()
		.formLogin()
			.loginPage("/log")
			.defaultSuccessUrl("/")
		.and()
		.logout()
			.logoutSuccessUrl("/");