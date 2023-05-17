import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	CadastrarUsuario.class,
	VisualizarUsuario.class,
	EditarUsuario.class,
	DeletarUsuario.class
})

public class SuiteTestes {

}
