import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Linia {
	private Long id;
	private String nazwa;
	private ArrayList<Wyrob> wyroby;
	private ArrayList<Maszyna> maszyna;

	public static ArrayList<Linia> generujLinia(int i, long id, long id2) {
		Linia linia;
		ArrayList<Linia> result = new ArrayList<>();

		for (int j = 0; j < i; j++) {
			linia = Linia.builder().id(id + i + j).nazwa("linia " + i + j).build();
			linia.setWyroby(Wyrob.generujWyrob(4, 1l, 1l));
			linia.setMaszyna(Maszyna.generujMaszyna(2, 2l, 2l));
			result.add(linia);
		}
		return result;
	}
}
