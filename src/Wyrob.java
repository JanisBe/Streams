import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wyrob {
	private Long id;
	private String nazwa;
	private Long partNo;

	public static ArrayList<Wyrob> generujWyrob(int i, long id, long id2) {
		Wyrob wyrob;
		ArrayList<Wyrob> result = new ArrayList<>();
		for (int j = 0; j < i; j++) {
			wyrob = Wyrob.builder().id(id + j + i).nazwa("Wyrob nr " + j + i).partNo(id + j + i).build();
			result.add(wyrob);
		}
		return result;
	}
}
