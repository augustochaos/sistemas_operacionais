package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SapoController implements ActionListener {
	private JLabel lblBolinha1;
	private JLabel lblBolinha2;
	private JButton btnIniciar;

	public SapoController(JLabel lblBolinha1, JLabel lblBolinha2,
			JButton btnIniciar) {
		this.lblBolinha1 = lblBolinha1;
		this.lblBolinha2 = lblBolinha2;
		this.btnIniciar = btnIniciar;
	}

	private void botaoBolinha() {
		Thread t1 = new ThreadSapo(lblBolinha1, btnIniciar);
		Thread t2 = new ThreadSapo(lblBolinha2, btnIniciar);
		t1.start();
		t2.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botaoBolinha();
	}
}