import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
public class MasajesAlPastor {
		private JFrame miFormulario;
		private final ButtonGroup g_civil = new ButtonGroup();
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
		MasajesAlPastor window = new MasajesAlPastor();
		window.miFormulario.setVisible(true);
		}catch (Exception e) {
		e.printStackTrace();
		}
		}
		});
		}
		public MasajesAlPastor() {
		initialize();
		}
		private void initialize() {
		miFormulario = new JFrame();
		miFormulario.getContentPane().setBackground(new Color(0,0,0));
		miFormulario.setTitle("Masajes La mano secreta");
		miFormulario.setBounds(50, 100, 600,400);
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		

		final JSpinner s_edad = new JSpinner();
		s_edad.setModel(new SpinnerNumberModel(0, 0, 150, 1));
		s_edad.setFont(new Font("Tahoma", Font.BOLD, 15));
		s_edad.setBounds(130,260,60,25);
		miFormulario.getContentPane().add(s_edad);	
		
		JLabel e_tiempo= new JLabel("Tiempo:");
		e_tiempo.setOpaque(false);
		e_tiempo.setForeground(Color.green);
		e_tiempo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		e_tiempo.setBounds(35,260,100,25);
		miFormulario.getContentPane().add(e_tiempo);
		
		JPanel j_tipo = new JPanel();
		j_tipo.setForeground(Color.green);
		j_tipo.setBorder(new TitledBorder(null,"Tipo", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), Color.green));
		j_tipo.setBackground(Color.black);
		j_tipo.setBounds(50, 60, 120, 100);
		miFormulario.getContentPane().add(j_tipo);
		j_tipo.setLayout(null);
		
		final JRadioButton r_indu = new JRadioButton("Indu");
		r_indu.setOpaque(false);
		r_indu.setForeground(Color.green);
		r_indu.setSelected(false);
		r_indu.setBounds(10,20, 85, 20);
		r_indu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		g_civil.add(r_indu);
		j_tipo.add(r_indu);
		
		final JRadioButton r_Fran = new JRadioButton("Frances");
		r_Fran.setOpaque(false);
		r_Fran.setForeground(Color.green);
		r_Fran.setSelected(false);
		r_Fran.setBounds(10,40, 85, 20);
		r_Fran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		g_civil.add(r_Fran);
		j_tipo.add(r_Fran);
		

		final JRadioButton r_eua = new JRadioButton("Americano");
		r_eua.setOpaque(false);
		r_eua.setForeground(Color.green);
		r_eua.setSelected(false);
		r_eua.setBounds(10,60, 85, 20);
		r_eua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		g_civil.add(r_eua);
		j_tipo.add(r_eua);
		
		JPanel j_add = new JPanel();
		j_add.setForeground(Color.green);
		j_add.setBorder(new TitledBorder(null,"Adicionales", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), Color.green));
		j_add.setBackground(Color.black);
		j_add.setBounds(240,60, 150, 100);
		miFormulario.getContentPane().add(j_add);
		j_add.setLayout(null);
		
		final JCheckBox ch_extranjero = new JCheckBox("Aceite de almendras");
		ch_extranjero.setSelected(false);
		ch_extranjero.setForeground(Color.green);
		ch_extranjero.setBounds(10,20, 160, 20);
		ch_extranjero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ch_extranjero.setOpaque(false);
		j_add.add(ch_extranjero);
		
		final JCheckBox ch_extranjero1 = new JCheckBox("Relajacion aromatica");
		ch_extranjero1.setSelected(false);
		ch_extranjero1.setForeground(Color.green);
		ch_extranjero1.setBounds(10,40, 160, 20);
		ch_extranjero1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ch_extranjero1.setOpaque(false);
		j_add.add(ch_extranjero1);
		
		final JCheckBox ch_extranjero11 = new JCheckBox("Piedras volcanicas");
		ch_extranjero11.setSelected(false);
		ch_extranjero11.setForeground(Color.green);
		ch_extranjero11.setBounds(10,60, 160, 20);
		ch_extranjero11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ch_extranjero11.setOpaque(false);
		j_add.add(ch_extranjero11);
		
		JLabel e_horas= new JLabel("Horas");
		e_horas.setOpaque(false);
		e_horas.setForeground(Color.green);
		e_horas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		e_horas.setBounds(200,260,100,25);
		miFormulario.getContentPane().add(e_horas);
		
		JLabel e_total= new JLabel("");
		e_total.setText("Total=");
		e_total.setForeground(Color.green);
		e_total.setFont(new Font("Tahoma", Font.PLAIN, 20));
		e_total.setBounds(300,260,200,25);
		miFormulario.getContentPane().add(e_total);
		
		JButton b_calcular = new JButton("Calcular");
		b_calcular.setBounds(300,190,100,30);
		b_calcular.addMouseListener(new MouseAdapter()
			{
			@Override
			public void mouseClicked(MouseEvent arg0)
				{
				int horas;
				horas=(Integer)(s_edad.getValue());
				int total;			
				if(r_indu.isSelected()){
					horas=horas*200;
					total=horas;
					e_total.setText("Total="+total);
					if(ch_extranjero.isSelected()){
					total=total+100;
					e_total.setText("Total="+total);
					}
					if(ch_extranjero1.isSelected()){
						total=total+50;
						e_total.setText("Total="+total);
					}
					if(ch_extranjero11.isSelected()){
						total=total+100;
						e_total.setText("Total="+total);
					}
					
				}
				if(r_Fran.isSelected()){
					horas=horas*300;
					total=horas;
					e_total.setText("Total="+total);
					if(ch_extranjero.isSelected()){
					total=total+100;
					e_total.setText("Total="+total);
					}
					if(ch_extranjero1.isSelected()){
						total=total+50;
						e_total.setText("Total="+total);
					}
					if(ch_extranjero11.isSelected()){
						total=total+100;
						e_total.setText("Total="+total);
					}
				}
				
					
				}
			});
		miFormulario.getContentPane().add(b_calcular);

		}
}

