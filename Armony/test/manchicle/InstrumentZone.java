package manchicle;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Point2D;

import org.jfugue.realtime.RealtimePlayer;
import org.jfugue.theory.Note;

public class InstrumentZone {
	public int x, y, width, height;
	public Paint paint;
	public RealtimePlayer realtimePlayer;
	public Note note;

	public InstrumentZone(int x, int y, int width, int height, Paint paint, RealtimePlayer player, Note note) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.paint = paint;

		this.realtimePlayer = player;
		this.note = note;

	}

	public void paint(Graphics2D g2) {
		g2.setPaint(this.paint);
		g2.fillRect(x, y, width, height);

	}

	public void mousePressed(Point2D point) {
		if (((point.getX() >= x) && (point.getX() <= x + width))
				&& ((point.getY() >= y) && (point.getY() <= y + height))) {
			realtimePlayer.startNote(note);
		}
	}

	public void mouseReleased(Point2D point) {
		if (((point.getX() >= x) && (point.getX() <= x + width))
				&& ((point.getY() >= y) && (point.getY() <= y + height))) {
			realtimePlayer.stopNote(note);
		}
	}

}
