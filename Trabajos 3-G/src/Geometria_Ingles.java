
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Geometria_Ingles {
	private JFrame f;
	private final ButtonGroup A=new ButtonGroup();
	private final ButtonGroup B=new ButtonGroup();
	private final ButtonGroup C=new ButtonGroup();
	private final ButtonGroup D=new ButtonGroup();
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Geometria_Ingles window = new Geometria_Ingles();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Geometria_Ingles (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Area of ​​figures");
		f.setBounds(300,200,700,500);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.red);
		
		final JLabel Ti = new JLabel();
		Ti.setText("Select what you want to get:");
		Ti.setBounds(20,0,500,60);
		Ti.setOpaque(false);
		Ti.setBackground(Color.red);
		Ti.setFont(new Font("Tahoma", Font.BOLD,18));
		Ti.setForeground(Color.black);
		f.getContentPane().add(Ti);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		final JInternalFrame ventanitaA = new JInternalFrame("Pending");
		ventanitaA.getContentPane().setBackground(Color.white);
		ventanitaA.setClosable(true);
		ventanitaA.setResizable(true);
		ventanitaA.setMaximizable(true);
		ventanitaA.setBounds(290, 10, 380, 200);
		ventanitaA.getContentPane().setLayout(null);
		f.getContentPane().add(ventanitaA);

		JPanel Panel = new JPanel();
		Panel.setForeground(Color.BLUE);
		Panel.setBorder(new TitledBorder(null, "X", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Panel.setBackground(Color.green);
		Panel.setBounds(10, 10, 120, 110);
		f.getContentPane().add(Panel);
		Panel.setLayout(null);
		ventanitaA.add(Panel);
		
		final JLabel XA = new JLabel();
		XA.setText("X");
		XA.setBounds(15,10,500,60);
		XA.setOpaque(false);
		XA.setBackground(Color.red);
		XA.setFont(new Font("Tahoma", Font.BOLD,18));
		XA.setForeground(Color.black);
		f.getContentPane().add(XA);
		ventanitaA.add(XA);
		Panel.add(XA);
			
		JSpinner s1 =new JSpinner();
		s1.setModel(new SpinnerNumberModel(0,-10,10,1));
		s1.setFont(new Font("Thoma", Font.BOLD,20));
		s1.setBounds(30,30,40,20);
		f.getContentPane().add(s1);
		ventanitaA.add(s1);
		Panel.add(s1);
	
		final JRadioButton rbs = new JRadioButton("x-");
		rbs.setOpaque(false);
		rbs.setBounds(70, 30, 50, 8);
		rbs.setOpaque(false);
		A.add(rbs);
		ventanitaA.add(rbs);
		Panel.add(rbs);

		final JRadioButton rbss = new JRadioButton("x+");
		rbss.setOpaque(false);
		rbss.setBounds(70, 42, 50, 8);
		rbss.setOpaque(false);
		A.add(rbss);
		ventanitaA.add(rbss);
		Panel.add(rbss);
		
		JSpinner s2 =new JSpinner();
		s2.setModel(new SpinnerNumberModel(0,-10,10,1));
		s2.setFont(new Font("Thoma", Font.BOLD,20));
		s2.setBounds(30,60,40,20);
		f.getContentPane().add(s2);
		ventanitaA.add(s2);
		Panel.add(s2);
		
		final JLabel YA = new JLabel();
		YA.setText("X1");
		YA.setBounds(8,40,500,60);
		YA.setOpaque(false);
		YA.setBackground(Color.red);
		YA.setFont(new Font("Tahoma", Font.BOLD,18));
		YA.setForeground(Color.black);
		f.getContentPane().add(YA);
		ventanitaA.add(YA);
		Panel.add(YA);
		
		final JRadioButton rbs1 = new JRadioButton("x-");
		rbs1.setOpaque(false);
		rbs1.setBounds(70, 60, 50, 8);
		rbs1.setOpaque(false);
		B.add(rbs1);
		ventanitaA.add(rbs1);
		Panel.add(rbs1);

		final JRadioButton RBamas = new JRadioButton("x+");
		RBamas.setOpaque(false);
		RBamas.setBounds(70, 72, 50, 8);
		RBamas.setOpaque(false);
		B.add(RBamas);
		ventanitaA.add(RBamas);
		Panel.add(RBamas);
		
		JPanel Panel1 = new JPanel();
		Panel1.setForeground(Color.BLUE);
		Panel1.setBorder(new TitledBorder(null, "Y", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Panel1.setBackground(Color.green);
		Panel1.setBounds(150, 10, 120, 110);
		f.getContentPane().add(Panel1);
		Panel1.setLayout(null);
		ventanitaA.add(Panel1);
		
		final JLabel XBl = new JLabel();
		XBl.setText("Y");
		XBl.setBounds(15,10,500,60);
		XBl.setOpaque(false);
		XBl.setBackground(Color.red);
		XBl.setFont(new Font("Tahoma", Font.BOLD,18));
		XBl.setForeground(Color.black);
		f.getContentPane().add(XBl);
		ventanitaA.add(XBl);
		Panel1.add(XBl);
		
		JSpinner s3 =new JSpinner();
		s3.setModel(new SpinnerNumberModel(0,-10,10,1));
		s3.setFont(new Font("Thoma", Font.BOLD,20));
		s3.setBounds(30,30,40,20);
		f.getContentPane().add(s3);
		ventanitaA.add(s3);
		Panel1.add(s3);
		
		final JRadioButton RBme1 = new JRadioButton("y-");
		RBme1.setOpaque(false);
		RBme1.setBounds(70, 30, 50, 8);
		RBme1.setOpaque(false);
		C.add(RBme1);
		ventanitaA.add(RBme1);
		Panel1.add(RBme1);

		final JRadioButton RBmas1 = new JRadioButton("y+");
		RBmas1.setOpaque(false);
		RBmas1.setBounds(70, 42, 50, 8);
		RBmas1.setOpaque(false);
		C.add(RBmas1);
		ventanitaA.add(RBmas1);
		Panel1.add(RBmas1);
		
		JSpinner s4 =new JSpinner();
		s4.setModel(new SpinnerNumberModel(0,-10,10,1));
		s4.setFont(new Font("Thoma", Font.BOLD,20));
		s4.setBounds(30,60,40,20);
		f.getContentPane().add(s4);
		ventanitaA.add(s4);
		Panel1.add(s4);
		
		final JRadioButton RBame1 = new JRadioButton("y-");
		RBame1.setOpaque(false);
		RBame1.setBounds(70, 60, 50, 8);
		RBame1.setOpaque(false);
		D.add(RBame1);
		ventanitaA.add(RBame1);
		Panel1.add(RBame1);

		final JRadioButton RBamas1 = new JRadioButton("y+");
		RBamas1.setOpaque(false);
		RBamas1.setBounds(70, 72, 50, 8);
		RBamas1.setOpaque(false);
		D.add(RBamas1);
		ventanitaA.add(RBamas1);
		Panel1.add(RBamas1);
		
		final JLabel YB = new JLabel();
		YB.setText("Y1");
		YB.setBounds(8,40,500,60);
		YB.setOpaque(false);
		YB.setBackground(Color.red);
		YB.setFont(new Font("Tahoma", Font.BOLD,18));
		YB.setForeground(Color.black);
		f.getContentPane().add(YB);
		ventanitaA.add(YB);
		Panel1.add(YB);
		
		final JLabel RES = new JLabel();
		RES.setText("M=");
		RES.setBounds(160,110,500,60);
		RES.setOpaque(false);
		RES.setBackground(Color.red);
		RES.setFont(new Font("Tahoma", Font.BOLD,18));
		RES.setForeground(Color.black);
		f.getContentPane().add(RES);
		ventanitaA.add(RES);
		Panel1.add(YB);
		
		JButton movedor = new JButton ("Calcular");
		movedor.setBounds(275,50,90,30);
		movedor.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
			{
				int x,x1,y,y1,total,total1;
				x=(Integer)(s1.getValue());
				x1=(Integer)(s2.getValue());
				y=(Integer)(s3.getValue());
				y1=(Integer)(s4.getValue());	
				total=x-x1;
				total1=y-y1;
				RES.setText("M= "+total1+"/"+total);
				
				{
		}
				}
	});
	f.getContentPane().add(movedor);
	ventanitaA.add(movedor);
	
				
		ventanitaA.setVisible(false);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final JCheckBox BA = new JCheckBox("Pending");
		BA.setSelected(false);
		BA.setBounds(10, 60, 120, 23);
		BA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BA.setOpaque(false);
		f.getContentPane();
		A.add(BA);
		BA.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				ventanitaA.setVisible(true);
			}
	});

		f.getContentPane().add(BA);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		final JInternalFrame ventanitaB = new JInternalFrame("Abscissa and ordered line");
		ventanitaB.getContentPane().setBackground(Color.gray);
		ventanitaB.setClosable(true);
		ventanitaB.setResizable(true);
		ventanitaB.setMaximizable(true);
		ventanitaB.setBounds(10, 150, 280, 300);
		ventanitaB.getContentPane().setLayout(null);
		f.getContentPane().add(ventanitaB);
		
		
		final JLabel Y1 = new JLabel();
		Y1.setText("Y");
		Y1.setBounds(60,10,500,60);
		Y1.setOpaque(false);
		Y1.setFont(new Font("Tahoma", Font.BOLD,18));
		Y1.setForeground(Color.black);
		f.getContentPane().add(Y1);
		ventanitaB.add(Y1);
		
		final JLabel me = new JLabel();
		me.setText("-");
		me.setBounds(75,10,500,60);
		me.setOpaque(false);
		me.setFont(new Font("Tahoma", Font.BOLD,18));
		me.setForeground(Color.black);
		f.getContentPane().add(me);
		ventanitaB.add(me);
		
		final JLabel YB1 = new JLabel();
		YB1.setText("Y1");
		YB1.setBounds(80,10,500,60);
		YB1.setOpaque(false);
		YB1.setFont(new Font("Tahoma", Font.BOLD,18));
		YB1.setForeground(Color.black);
		f.getContentPane().add(YB1);
		ventanitaB.add(YB1);
		
		final JLabel Ig = new JLabel();
		Ig.setText("=");
		Ig.setBounds(100,10,500,60);
		Ig.setOpaque(false);
		Ig.setFont(new Font("Tahoma", Font.BOLD,18));
		Ig.setForeground(Color.black);
		f.getContentPane().add(Ig);
		ventanitaB.add(Ig);
		
		final JLabel m = new JLabel();
		m.setText("m");
		m.setBounds(115,10,500,60);
		m.setOpaque(false);
		m.setFont(new Font("Tahoma", Font.BOLD,18));
		m.setForeground(Color.black);
		f.getContentPane().add(m);
		ventanitaB.add(m);
		
	
		final JLabel X1 = new JLabel();
		X1.setText("(X");
		X1.setBounds(135,10,500,60);
		X1.setOpaque(false);
		X1.setFont(new Font("Tahoma", Font.BOLD,18));
		X1.setForeground(Color.black);
		f.getContentPane().add(X1);
		ventanitaB.add(X1);
		
		final JLabel me1 = new JLabel();
		me1.setText("-");
		me1.setBounds(155,10,500,60);
		me1.setOpaque(false);
		me1.setFont(new Font("Tahoma", Font.BOLD,18));
		me1.setForeground(Color.black);
		f.getContentPane().add(me1);
		ventanitaB.add(me1);
		

		final JLabel XB1 = new JLabel();
		XB1.setText("X1)");
		XB1.setBounds(165,10,500,60);
		XB1.setOpaque(false);
		XB1.setFont(new Font("Tahoma", Font.BOLD,18));
		XB1.setForeground(Color.black);
		f.getContentPane().add(XB1);
		ventanitaB.add(XB1);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel EA = new JLabel("A)");
		EA.setOpaque(false);
		EA.setBackground(Color.cyan);
		EA.setForeground(Color.black);
		EA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EA.setBounds(40, 90, 1000, 20);
		f.getContentPane().add(EA);
		ventanitaB.add(EA);
		
		final JSpinner A1 = new JSpinner();
		A1.setModel(new SpinnerNumberModel(1,0, 10, 1));
		A1.setFont(new Font("Tahoma", Font.BOLD, 20));
		A1.setBounds(80, 90, 50, 20);
		f.getContentPane().add(A1);
		ventanitaB.add(A1);
		
		JLabel AX1 = new JLabel("X");
		AX1.setOpaque(false);
		AX1.setBackground(Color.cyan);
		AX1.setForeground(Color.black);
		AX1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AX1.setBounds(65, 90, 1000, 20);
		f.getContentPane().add(AX1);
		ventanitaB.add(AX1);
		
		final JSpinner A2 = new JSpinner();
		A2.setModel(new SpinnerNumberModel(1, 0, 10, 1));
		A2.setFont(new Font("Tahoma", Font.BOLD, 20));
		A2.setBounds(150, 90, 50, 20);
		f.getContentPane().add(A2);
		ventanitaB.add(A2);
		
		JLabel AY1 = new JLabel("Y");
		AY1.setOpaque(false);
		AY1.setBackground(Color.cyan);
		AY1.setForeground(Color.black);
		AY1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AY1.setBounds(135, 90, 1000, 20);
		f.getContentPane().add(AY1);
		ventanitaB.add(AY1);
		
		
		JLabel EB = new JLabel("B)");
		EB.setOpaque(false);
		EB.setBackground(Color.cyan);
		EB.setForeground(Color.black);
		EB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EB.setBounds(40, 120, 1000, 20);
		f.getContentPane().add(EB);
		ventanitaB.add(EB);
		
		final JSpinner B1 = new JSpinner();
		B1.setModel(new SpinnerNumberModel(1, 0, 10, 1));
		B1.setFont(new Font("Tahoma", Font.BOLD, 20));
		B1.setBounds(80, 120, 50, 20);
		f.getContentPane().add(B1);
		ventanitaB.add(B1);
		
		JLabel BX1 = new JLabel("M");
		BX1.setOpaque(false);
		BX1.setBackground(Color.cyan);
		BX1.setForeground(Color.black);
		BX1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BX1.setBounds(65, 120, 1000, 20);
		f.getContentPane().add(BX1);
		ventanitaB.add(BX1);
		

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		final JLabel Y11 = new JLabel();
		Y11.setText("Y");
		Y11.setBounds(60,140,500,60);
		Y11.setOpaque(false);
		Y11.setFont(new Font("Tahoma", Font.BOLD,18));
		Y11.setForeground(Color.black);
		f.getContentPane().add(Y11);
		ventanitaB.add(Y11);
		
		final JLabel me11 = new JLabel();
		me11.setText("-");
		me11.setBounds(75,140,500,60);
		me11.setOpaque(false);
		me11.setFont(new Font("Tahoma", Font.BOLD,18));
		me11.setForeground(Color.black);
		f.getContentPane().add(me11);
		ventanitaB.add(me11);
		
		final JLabel YB11 = new JLabel();
		YB11.setText("Y1");
		YB11.setBounds(80,140,500,60);
		YB11.setOpaque(false);
		YB11.setFont(new Font("Tahoma", Font.BOLD,18));
		YB11.setForeground(Color.black);
		f.getContentPane().add(YB11);
		ventanitaB.add(YB11);
		
		final JLabel Ig1 = new JLabel();
		Ig1.setText("=");
		Ig1.setBounds(100,140,500,60);
		Ig1.setOpaque(false);
		Ig1.setFont(new Font("Tahoma", Font.BOLD,18));
		Ig1.setForeground(Color.black);
		f.getContentPane().add(Ig1);
		ventanitaB.add(Ig1);
		
		final JLabel m1 = new JLabel();
		m1.setText("m");
		m1.setBounds(115,140,500,60);
		m1.setOpaque(false);
		m1.setFont(new Font("Tahoma", Font.BOLD,18));
		m1.setForeground(Color.black);
		f.getContentPane().add(m1);
		ventanitaB.add(m1);
		
	
		final JLabel X11 = new JLabel();
		X11.setText("(X");
		X11.setBounds(135,140,500,60);
		X11.setOpaque(false);
		X11.setFont(new Font("Tahoma", Font.BOLD,18));
		X11.setForeground(Color.black);
		f.getContentPane().add(X11);
		ventanitaB.add(X11);
		
		final JLabel me111 = new JLabel();
		me111.setText("-");
		me111.setBounds(155,140,500,60);
		me111.setOpaque(false);
		me111.setFont(new Font("Tahoma", Font.BOLD,18));
		me111.setForeground(Color.black);
		f.getContentPane().add(me111);
		ventanitaB.add(me111);
		

		final JLabel XB11 = new JLabel();
		XB11.setText("X1)");
		XB11.setBounds(165,140,500,60);
		XB11.setOpaque(false);
		XB11.setFont(new Font("Tahoma", Font.BOLD,18));
		XB11.setForeground(Color.black);
		f.getContentPane().add(XB11);
		ventanitaB.add(XB11);
		
		final JLabel fff = new JLabel();
		fff.setText("Punto en la linea");
		fff.setBounds(50,175,500,60);
		fff.setOpaque(false);
		fff.setFont(new Font("Tahoma", Font.BOLD,18));
		fff.setForeground(Color.black);
		f.getContentPane().add(fff);
		ventanitaB.add(fff);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		JButton ma = new JButton ("Calcular");
		ma.setBounds(90,230,90,30);
		ma.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
			{
		int y,m,x;
				double total;
				x=(int)(A1.getValue());
				y=(int)(A2.getValue());
				m=(int)(B1.getValue());
				YB11.setText(""+y);
				m1.setText(""+m);
				XB11.setText(""+x+")");
				total=m*x;
				total=total+y;
				total=total/m;
				fff.setText(""+total);
				{
		}
				}
	});
	f.getContentPane().add(ma);
	ventanitaB.add(ma);

		ventanitaB.setVisible(false);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final JCheckBox BB = new JCheckBox("Abscissa and ordered line");
		BB.setSelected(false);
		BB.setBounds(10, 100, 300, 23);
		BB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BB.setOpaque(false);
		f.getContentPane();
		A.add(BB);
	BB.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				ventanitaB.setVisible(true);

			}
	});

		f.getContentPane().add(BB);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
final JInternalFrame ventanitaC = new JInternalFrame("Tabulation");
ventanitaC.getContentPane().setBackground(Color.yellow);
ventanitaC.setClosable(true);
ventanitaC.setResizable(true);
ventanitaC.setMaximizable(true);
ventanitaC.setBounds(290, 210, 380, 240);
ventanitaC.getContentPane().setLayout(null);
f.getContentPane().add(ventanitaC);


final JLabel A = new JLabel();
A.setText("A");
A.setBounds(15,20,500,60);
A.setOpaque(false);
A.setBackground(Color.red);
A.setFont(new Font("Tahoma", Font.BOLD,18));
A.setForeground(Color.black);
f.getContentPane().add(A);
ventanitaC.add(A);
	

JSpinner sxA =new JSpinner();
sxA.setModel(new SpinnerNumberModel(0,-10,10,1));
sxA.setFont(new Font("Thoma", Font.BOLD,20));
sxA.setBounds(30,40,40,20);
f.getContentPane().add(sxA);
ventanitaC.add(sxA);

final JLabel XA1 = new JLabel();
XA1.setText("X");
XA1.setBounds(75,20,500,60);
XA1.setOpaque(false);
XA1.setBackground(Color.red);
XA1.setFont(new Font("Tahoma", Font.BOLD,18));
XA1.setForeground(Color.black);
f.getContentPane().add(XA1);
ventanitaC.add(XA1);

JSpinner syA =new JSpinner();
syA.setModel(new SpinnerNumberModel(0,-10,10,1));
syA.setFont(new Font("Thoma", Font.BOLD,20));
syA.setBounds(95,40,40,20);
f.getContentPane().add(syA);
ventanitaC.add(syA);

final JLabel YA1 = new JLabel();
YA1.setText("Y");
YA1.setBounds(140,20,500,60);
YA1.setOpaque(false);
YA1.setBackground(Color.red);
YA1.setFont(new Font("Tahoma", Font.BOLD,18));
YA1.setForeground(Color.black);
f.getContentPane().add(YA1);
ventanitaC.add(YA1);

final JLabel B = new JLabel();
B.setText("B");
B.setBounds(15,60,500,60);
B.setOpaque(false);
B.setBackground(Color.red);
B.setFont(new Font("Tahoma", Font.BOLD,18));
B.setForeground(Color.black);
f.getContentPane().add(B);
ventanitaC.add(B);

JSpinner sxB =new JSpinner();
sxB.setModel(new SpinnerNumberModel(0,-10,10,1));
sxB.setFont(new Font("Thoma", Font.BOLD,20));
sxB.setBounds(30,80,40,20);
f.getContentPane().add(sxB);
ventanitaC.add(sxB);
	
final JLabel XB2 = new JLabel();
XB2.setText("X");
XB2.setBounds(75,60,500,60);
XB2.setOpaque(false);
XB2.setBackground(Color.red);
XB2.setFont(new Font("Tahoma", Font.BOLD,18));
XB2.setForeground(Color.black);
f.getContentPane().add(XB2);
ventanitaC.add(XB2);

JSpinner syB =new JSpinner();
syB.setModel(new SpinnerNumberModel(0,-10,10,1));
syB.setFont(new Font("Thoma", Font.BOLD,20));
syB.setBounds(95,80,40,20);
f.getContentPane().add(syB);
ventanitaC.add(syB);

final JLabel YB2 = new JLabel();
YB2.setText("Y");
YB2.setBounds(140,60,500,60);
YB2.setOpaque(false);
YB2.setBackground(Color.red);
YB2.setFont(new Font("Tahoma", Font.BOLD,18));
YB2.setForeground(Color.black);
f.getContentPane().add(YB2);
ventanitaC.add(YB2);

final JLabel C1 = new JLabel();
C1.setText("C");
C1.setBounds(15,100,500,60);
C1.setOpaque(false);
C1.setBackground(Color.red);
C1.setFont(new Font("Tahoma", Font.BOLD,18));
C1.setForeground(Color.black);
f.getContentPane().add(C1);
ventanitaC.add(C1);

JSpinner sxC =new JSpinner();
sxC.setModel(new SpinnerNumberModel(0,0,10,1));
sxC.setFont(new Font("Thoma", Font.BOLD,20));
sxC.setBounds(30,120,40,20);
f.getContentPane().add(sxC);
ventanitaC.add(sxC);
	
final JLabel XC = new JLabel();
XC.setText("X");
XC.setBounds(75,100,500,60);
XC.setOpaque(false);
XC.setBackground(Color.red);
XC.setFont(new Font("Tahoma", Font.BOLD,18));
XC.setForeground(Color.black);
f.getContentPane().add(XC);
ventanitaC.add(XC);

JSpinner syC =new JSpinner();
syC.setModel(new SpinnerNumberModel(0,0,10,1));
syC.setFont(new Font("Thoma", Font.BOLD,20));
syC.setBounds(95,120,40,20);
f.getContentPane().add(syC);
ventanitaC.add(syC);

final JLabel YC = new JLabel();
YC.setText("Y");
YC.setBounds(140,100,500,60);
YC.setOpaque(false);
YC.setBackground(Color.red);
YC.setFont(new Font("Tahoma", Font.BOLD,18));
YC.setForeground(Color.black);
f.getContentPane().add(YC);
ventanitaC.add(YC);

final JLabel RE = new JLabel();
RE.setText("Area");
RE.setBounds(200,100,500,60);
RE.setOpaque(false);
RE.setBackground(Color.red);
RE.setFont(new Font("Tahoma", Font.BOLD,18));
RE.setForeground(Color.black);
f.getContentPane().add(RE);
ventanitaC.add(RE);



JLabel V =new JLabel();
V.setText("");
V.setBounds(215,110,30,30);
V.setOpaque(false);
V.setFont(new Font("Tahoma", Font.BOLD,18));
V.setBackground(Color.YELLOW);
f.getContentPane().add(V);
ventanitaC.add(V);

JButton m12 = new JButton ("Calcular");
m12.setBounds(200,50,90,30);
m12.addMouseListener(new MouseAdapter()
{
	@Override
	final	public void mouseClicked(MouseEvent arg0)
	{
		V.setText("²");
		int T1,T2,T3,T4,T5,T6;
		int TostiResu,TostiResu2,TostiResu3;
		int TostiResul,TostiResul2,TostiResul3;
		int TostiLOCO,TostiLOCO2,TostiLOCO3;
		int TostiLOCO4;
	
		T1=(Integer)(sxA.getValue());

		T2=(Integer)(syA.getValue());

		T3=(Integer)(sxB.getValue());

		T4=(Integer)(syB.getValue());
	
		T5=(Integer)(sxC.getValue());

		T6=(Integer)(syC.getValue());

		T1=(Integer)(sxA.getValue());

		T2=(Integer)(syA.getValue());
	
		
		TostiResu=T1*T4;
		TostiResu2=T3*T6;
		TostiResu3=T5*T2;
		RE.setText("+"+TostiResu+"+"+TostiResu2+"+"+TostiResu3);
		
		TostiResul=T1*T6;
		TostiResul2=T5*T4;
		TostiResul3=T3*T2;
		RE.setText("+"+TostiResul+"+"+TostiResul2+"+"+TostiResul3);
		
		RE.setText("+"+TostiResu+"+"+TostiResu2+"+"+TostiResu3+"-"+TostiResul+"-"+TostiResul2+"-"+TostiResul3);
		
		TostiLOCO=TostiResu+TostiResu2+TostiResu3;
		TostiLOCO2=TostiResul+TostiResul2+TostiResul3;
		RE.setText("+"+TostiLOCO+"-"+TostiLOCO2);
		
		TostiLOCO3=TostiLOCO-TostiLOCO2;
		RE.setText(""+TostiLOCO3);
		
		TostiLOCO4=TostiLOCO3/2;
		RE.setText(""+TostiLOCO4);
		{
}
		}
});
f.getContentPane().add(m12);
ventanitaC.add(m12);

ventanitaC.setVisible(false);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
final JCheckBox C = new JCheckBox("Tabulation");
C.setSelected(false);
C.setBounds(10, 140, 300, 23);
C.setFont(new Font("Tahoma", Font.PLAIN, 16));
C.setOpaque(false);
f.getContentPane();
A.add(C);
C.addMouseListener(new MouseAdapter()

{	
	@Override
final	public void mouseClicked(MouseEvent arg0)
	{
		ventanitaC.setVisible(true);

	}
});

f.getContentPane().add(C);	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
JLabel manualsito = new JLabel();
manualsito.setText("First you have to take the slope, the formula");
manualsito.setOpaque(false);
manualsito.setBackground(Color.cyan);
manualsito.setForeground(Color.black);
manualsito.setFont(new Font("Tahoma", Font.PLAIN, 15));
manualsito.setBounds(10, 20, 400, 15);
f.getContentPane().add(manualsito);

JLabel manualsito2 = new JLabel();
manualsito2.setText("is y2-y1 / x2-x1, once you take the slope you");
manualsito2.setOpaque(false);
manualsito2.setBackground(Color.cyan);
manualsito2.setForeground(Color.black);
manualsito2.setFont(new Font("Tahoma", Font.PLAIN, 15));
manualsito2.setBounds(10, 40, 400, 15);
f.getContentPane().add(manualsito2);

JLabel manualsito3 = new JLabel();
manualsito3.setText("have to take out the area,the formula for taking");
manualsito3.setOpaque(false);
manualsito3.setBackground(Color.cyan);
manualsito3.setForeground(Color.black);
manualsito3.setFont(new Font("Tahoma", Font.PLAIN, 15));
manualsito3.setBounds(10, 60, 400, 15);
f.getContentPane().add(manualsito3);

JLabel manualsito4 = new JLabel();
manualsito4.setText("out the area is y-y1 = m (x-x1).");
manualsito4.setOpaque(false);
manualsito4.setBackground(Color.cyan);
manualsito4.setForeground(Color.black);
manualsito4.setFont(new Font("Tahoma", Font.PLAIN, 15));
manualsito4.setBounds(10, 80, 400, 15);
f.getContentPane().add(manualsito4);


		final JInternalFrame ventanitaD = new JInternalFrame("Manual");
		ventanitaD.getContentPane().setBackground(Color.gray);
		ventanitaD.setClosable(true);
		ventanitaD.setResizable(true);
		ventanitaD.setMaximizable(true);
		ventanitaD.setBounds(290, 0, 390, 455);
		ventanitaD.getContentPane().setLayout(null);
		f.getContentPane().add(ventanitaD);
		ventanitaD.add(manualsito);
		ventanitaD.add(manualsito2);
		ventanitaD.add(manualsito3);
		ventanitaD.add(manualsito4);
		
		
		ventanitaD.setVisible(false);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		final JCheckBox D = new JCheckBox("Manual");
		D.setSelected(false);
		D.setBounds(10, 180, 300, 23);
		D.setFont(new Font("Tahoma", Font.PLAIN, 16));
		D.setOpaque(false);
		f.getContentPane();
		A.add(D);
	D.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				ventanitaD.setVisible(true);

			}
	});

		f.getContentPane().add(D);
		

	
	 }
}