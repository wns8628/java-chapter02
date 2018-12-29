package chapter02;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setTrack(3);
		song.setComposer("이민수");
		song.setYear("2010");
		song.show();
		
		Song song2 = new Song("Love Shot", "EXO", "엑소앨범1", "작곡가1","2018",3);
		song2.show();
		
		Song song3 = new Song("Tempo","EXO");
		song3.show();
	}

}
