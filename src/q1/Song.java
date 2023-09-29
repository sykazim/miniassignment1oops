package q1;

import java.util.Objects;

public class Song {
	
	private String name;
	private String artist;
	private String album;
	private Long duration;
	
	
	
	public Song(String name, String artist, String album, Long duration) {
		super();
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(album, artist, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(album, other.album) && Objects.equals(artist, other.artist)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", artist=" + artist + ", album=" + album + ", duration=" + duration + "]";
	}
	
	
	

}
