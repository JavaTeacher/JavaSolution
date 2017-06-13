/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 21.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	
	/**
	 * @param title
	 * @param singer
	 * @param genre
	 */
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}
	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return title + " (" + singer + ")";
	}	
	
}
