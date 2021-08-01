package fashionhouse.example.Tienda.xxl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fashionhouse.example.Tienda.xxl.Entity.Usuario;
import fashionhouse.example.Tienda.xxl.Repository.UsuarioRepository;
import fashionhouse.example.Tienda.xxl.Servicios.UsuarioServicio;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServicio usuarioServicio;
    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository){
    }
    @GetMapping("/Usuario")
    public List<Usuario>getAllUsuarios(){
        return usuarioServicio.getAllUsuarios();
    }

    @GetMapping("/Usuario{id}")
    public ResponseEntity< Usuario>getUsuario(@PathVariable(value="id")Long id){
        Usuario usuario=usuarioServicio.getUsuario(id);
        return ResponseEntity.ok().body(usuario);
    }
    @PostMapping("/Usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario createdUsuario(@RequestBody Usuario usuario){
        return usuarioServicio.createdUsuario(usuario);
    }

    @PutMapping("/Usuario/{id}/Actualizar")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable(value="id") Long id,@RequestBody Usuario usuario, Object Usuario){
        Usuario =usuarioServicio.updateUsuario(id);
        return ResponseEntity.ok(usuario);
    }
       

    
    @DeleteMapping("/Usuario/{id}/eliminar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuarioById(@PathVariable(value= "id") Long id){
        usuarioServicio.deleteUsuario(id);
    }
    
    
}
