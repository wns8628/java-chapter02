package chapter02;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

//	-----------------------------------------------------------------생성자
	public Song() {} //기본생성자
	public Song(String title, String artist) {
		//this.title =title .... 쭉 또적어준다 ㅅㅂ 중복 존나되네 		
		//초기화코드~~
		
		//그럴때 이렇게하면됨 자기자신생성자부르면되지 ㅇㅋ ?
		this(title, artist ,null,null,null,0);
		
	}
	public Song(String title, 
			String artist,
			String album,
			String composer, 
			String year, 
			int track){
	
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;

		//초기화코드~~
	}
//	--------------------------------------
	
	public void show() {
		System.out.println(
			artist + " "+
			title + "(" +
			album +", " +
			year + ", " +
			track+ "번 track, "+
			composer + " 작곡" +")"
		);		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	
	
}
