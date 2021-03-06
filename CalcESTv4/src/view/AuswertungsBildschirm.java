package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.DataGehalt;
import model.WerbungsKosten;
import controller.Berechnungen;

public class AuswertungsBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7313978973201692631L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AuswertungsBildschirm() {
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAuswertung = new JLabel("Auswertung");
		lblAuswertung.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAuswertung.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuswertung.setBounds(10, 11, 414, 19);
		contentPane.add(lblAuswertung);

		final JLabel lblJahresbruttogehalt = new JLabel("JahresBruttoGehalt:");
		lblJahresbruttogehalt.setBounds(10, 40, 190, 14);
		contentPane.add(lblJahresbruttogehalt);

		final JLabel lblJahreslohnsteuer = new JLabel("JahresLohnsteuer:");
		lblJahreslohnsteuer.setBounds(10, 70, 190, 14);
		contentPane.add(lblJahreslohnsteuer);

		final JLabel lblJahressolizuschlag = new JLabel("JahresSoliZuschlag:");
		lblJahressolizuschlag.setBounds(10, 100, 190, 14);
		contentPane.add(lblJahressolizuschlag);

		final JLabel lblJahreskv = new JLabel("JahresKV:");
		lblJahreskv.setBounds(10, 130, 190, 14);
		contentPane.add(lblJahreskv);

		final JLabel lblJahrespv = new JLabel("JahresPV:");
		lblJahrespv.setBounds(10, 160, 190, 14);
		contentPane.add(lblJahrespv);

		final JLabel lblJahresav = new JLabel("JahresAV:");
		lblJahresav.setBounds(10, 190, 190, 14);
		contentPane.add(lblJahresav);

		final JLabel lblJahresrv = new JLabel("JahresRV:");
		lblJahresrv.setBounds(10, 220, 190, 14);
		contentPane.add(lblJahresrv);

		final JLabel lblWerbungskosten = new JLabel("Werbungskosten:");
		lblWerbungskosten.setBounds(250, 70, 190, 14);
		contentPane.add(lblWerbungskosten);

		final JLabel lblSummeEinkunft = new JLabel("Summe Einkunft:");
		lblSummeEinkunft.setBounds(250, 40, 190, 14);
		contentPane.add(lblSummeEinkunft);

		final JLabel lblVorsorgeaufwand = new JLabel("Vorsorgeaufwand:");
		lblVorsorgeaufwand.setBounds(250, 100, 190, 14);
		contentPane.add(lblVorsorgeaufwand);

		final JLabel lblSpenden = new JLabel("Spenden:");
		lblSpenden.setBounds(250, 130, 190, 14);
		contentPane.add(lblSpenden);

		final JLabel lblAgb = new JLabel("agB: ");
		lblAgb.setBounds(250, 160, 190, 14);
		contentPane.add(lblAgb);

		final JLabel lblZuVersteuerndesEinkommen = new JLabel(
				"zu verst. Einkommen:");
		lblZuVersteuerndesEinkommen.setBounds(250, 190, 190, 14);
		contentPane.add(lblZuVersteuerndesEinkommen);

		final JLabel lblBerechneteEst = new JLabel("berechnete ESt.:");
		lblBerechneteEst.setBounds(250, 220, 190, 14);
		contentPane.add(lblBerechneteEst);

		final JLabel lblErstattungnachzahlung = new JLabel(
				"Erstattung/Nachzahlung:");
		lblErstattungnachzahlung.setBounds(250, 250, 201, 14);
		contentPane.add(lblErstattungnachzahlung);

		JButton btnAuswertung = new JButton("Auswertung");
		btnAuswertung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblJahresbruttogehalt.setText(""
						+ DataGehalt.dg.getBruttoGehaltJahr());
				lblJahreslohnsteuer.setText(""
						+ DataGehalt.dg.getLohnSteuerJahr());
				lblJahressolizuschlag.setText(""
						+ DataGehalt.dg.getSoliZuschlagJahr());
				lblJahreskv.setText("" + DataGehalt.dg.getKrankenVersJahr());
				lblJahrespv.setText("" + DataGehalt.dg.getPflegeVersJahr());
				lblJahresav.setText("" + DataGehalt.dg.getArbeitslosenVersJahr());
				lblJahresrv.setText("" + DataGehalt.dg.getRentenVersJahr());

				lblSummeEinkunft.setText(""
						+ Berechnungen.SummeEinkunft(DataGehalt.dg
								.getBruttoGehaltJahr(), Berechnungen
								.WerbungsKosten((WerbungsKosten.wk
										.getArbeitsTage()), WerbungsKosten.wk
										.getEntfernungsKMWA(),
										WerbungsKosten.wk
												.getArbeitsMittelGezahlt(),
										WerbungsKosten.wk
												.getTelefonKostenGezahlt())));

				lblWerbungskosten.setText(""
						+ Berechnungen.WerbungsKosten(
								(WerbungsKosten.wk.getArbeitsTage()),
								WerbungsKosten.wk.getEntfernungsKMWA(),
								WerbungsKosten.wk.getArbeitsMittelGezahlt(),
								WerbungsKosten.wk.getTelefonKostenGezahlt()));
			}
		});
		btnAuswertung.setBounds(10, 258, 130, 23);
		contentPane.add(btnAuswertung);
	}

}
