package q1;

public class UserClient {

	public static void main(String[] args) {
		Song song = new Song("tere bin", "xyz", "pqrs", 50L);
		Song newSong = new Song("pahla nasha", "dhdj", "kodkdo", 30L);
		PlayList playList = new PlayList();
		playList.createPlayList();
		playList.addSong(song);
		playList.addSong(newSong);
		playList.playSongsFromPlaylist();
		playList.removeSong(song);
		playList.playSongsFromPlaylist();

	}

}
