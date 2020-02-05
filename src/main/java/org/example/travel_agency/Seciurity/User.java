@Getter @Setter
@NoArgsConstructor
@Entity
public class User implements UserDetails{
	@Id
	@GeneratedValue(Strategy=GenerationType.IDENTITY)
	private Intiger id;
	private String userName;
	private String userPassword;
	private String role;
	
	public AppUser(String  userName, String userPassword, String role) {
        this.userName=userName;
        this.userPassword=userPassword;
        this.role=role;
    }
	
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(role));}
		
	  @Override
    public String getPassword() {
        return userPassword;
    }

    @Override
    public String getUsername() {
        return userName;
    }
	@Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}