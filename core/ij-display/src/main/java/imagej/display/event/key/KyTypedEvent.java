package imagej.display.event.key;

import imagej.display.Display;

/**
 * An event indicating keyboard activity in a display.
 *
 * @author Curtis Rueden
 */
public class KyTypedEvent extends KyEvent {

	public KyTypedEvent(final Display display, final char character,
		final int code, final int modifiers)
	{
		super(display, character, code, modifiers);
	}

}
