package principal;

import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class Principal {
	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Sunday Blody Sunday");
		minhaMusica.setCantor("U2");
		
		for (int i = 0; i < 1000; i++) {
			minhaMusica.reproduz();
		}
		
		for (int i = 0; i < 50; i++) {
			minhaMusica.curte();
		}
		/*=*/
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("Historia da Musica");
		meuPodcast.setApresentador("Jvas");
		
		for (int i = 0; i < 5000; i++) {
			meuPodcast.reproduz();
		}
		
		for (int i = 0; i < 1000; i++) {
			meuPodcast.curte();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(minhaMusica);
		preferidas.inclui(meuPodcast);
		
	}
	
}
