import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Maszyna {
	private String nazwa;
	private Long id;

	public static ArrayList<Maszyna> generujMaszyna(int i, long id, long id2) {
		Maszyna maszyna;
		ArrayList<Maszyna> result = new ArrayList<>();

		for (int j = 0; j < i; j++) {
			maszyna = Maszyna.builder().id(id + i + j).nazwa("Maszyna " + i).build();
			result.add(maszyna);

		}
		return result;
	}
}
