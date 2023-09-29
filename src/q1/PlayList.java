package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PlayList {

	private static List<Song> playList;
	private static final Logger logger = Logger.getLogger(PlayList.class.getName());

	public String createPlayList() {
		playList = new ArrayList<>();
		return "play list created successfully";
	}

	public void addSong(Song song) {
		playList.add(song);
	}

	public void removeSong(Song song) {
		playList.remove(song);
	}

	public void playSongsFromPlaylist() {
		playList.stream().forEach(song -> {
			logger.info("Song played is "+ song);
		});
	}

}
