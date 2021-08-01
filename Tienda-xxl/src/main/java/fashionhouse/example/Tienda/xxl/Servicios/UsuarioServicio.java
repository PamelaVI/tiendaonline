package fashionhouse.example.Tienda.xxl.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fashionhouse.example.Tienda.xxl.Entity.Usuario;

@Service
public interface UsuarioServicio{
    public Iterable<Usuario> findAll();
    public Optional<Usuario> findById(long id );
    public Usuario save(Usuario usuario);
    public void deleteById(Long id);
	public void deleteUsuario(Long id);
    public Object updateUsuario(Long id);
    public Usuario createdUsuario(Usuario usuario);
    public Usuario getUsuario(Long id);
    public List<Usuario> getAllUsuarios();
}