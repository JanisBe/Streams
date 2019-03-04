import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ObszarMontazowy extends Obszar {

	private ArrayList<Linia> listaLinii;

}
