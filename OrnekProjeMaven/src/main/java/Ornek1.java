import org.apache.commons.lang3.StringUtils;

public class Ornek1 {

	public static void main(String[] args) {
		String ornekGirdi = "  ab  c  ";
		String sonuc = StringUtils.deleteWhitespace(ornekGirdi);
		System.out.println(sonuc);
	}

}
