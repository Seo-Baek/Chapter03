package chapter03;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum("Real");
		song.setArtist("������");
		song.setComposer("���μ�");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		
		Song song2 = new Song();
		song2.setTitle("�������");
		song2.setArtist("������̵�ɽ�");
		song2.show();
		
		
	}

}
