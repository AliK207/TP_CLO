/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Porte extends Composant {
	
	public abstract void probe(SondeTable tableSondes);
	public abstract void unprobe(SondeTable tableSondes);
}
