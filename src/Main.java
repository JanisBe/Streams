import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

public class Main {

	public static void main(String[] args) {
		ObszarMontazowy la = new ObszarMontazowy();
		la.setImieKierownika("Kierownik");
		la.setListaLinii(Linia.generujLinia(2, 3l, 3l));
		HashSet<String> hash = Sets.newHashSet();
		hash.add("asdasd");
		hash.add("asdasd");
		String res = la.getListaLinii().stream().map(w -> w.getWyroby()).flatMap(Collection::stream)
				.map(Wyrob::toString).collect(Collectors.joining("\n"));
		System.out.println(res);
		System.out.println(hash.toString());
	}

}
