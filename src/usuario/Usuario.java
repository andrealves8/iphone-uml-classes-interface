package usuario;

import aparelhoCelular.Iphone;
import apps.musica.MusicPlayer;
import apps.musica.ReprodutorMusical;

public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar();
	
		ReprodutorMusical mp = new MusicPlayer();
		mp.tocar();

	}

}
