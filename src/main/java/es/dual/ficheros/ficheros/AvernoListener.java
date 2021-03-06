package es.dual.ficheros.ficheros;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AvernoListener extends TimerTask implements ServletContextListener {
	private Timer timerCreacion;

	@Override
	public void run() {
		Demonio satanael = new Demonio();
		satanael.invocacion();
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		if (timerCreacion != null) {
			timerCreacion.cancel();
		}
	}

	public void contextInitialized(ServletContextEvent arg0) {
		timerCreacion = new Timer();
		timerCreacion.schedule(this, 120000, 3600000);
	}
}
