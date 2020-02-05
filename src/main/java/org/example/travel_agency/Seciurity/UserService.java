public class UserService implements UserDetailsService {
	
	
	private UserRepository userRepository

	@Autowired
	public UserService (UserRepository userRepository){
	this.userRepository=userRepository;
	
	   @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return appUserRepository.findByUserName(s);
    }

}