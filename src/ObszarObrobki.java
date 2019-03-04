import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ObszarObrobki extends Obszar {
	private ArrayList<Linia> listaLinii;
	private ArrayList<Maszyna> maszyny;

}
