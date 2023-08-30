


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
public class dd {
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
					dd window = new dd();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public dd (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Area of figures");
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

		final JLabel Y1 = new JLabel();
		Y1.setText("Y");
		Y1.setBounds(60,10,500,60);
		Y1.setOpaque(false);
		Y1.setFont(new Font("Tahoma", Font.BOLD,18));
		Y1.setForeground(Color.black);
		f.getContentPane().add(Y1);

		
		final JLabel me = new JLabel();
		me.setText("-");
		me.setBounds(75,10,500,60);
		me.setOpaque(false);
		me.setFont(new Font("Tahoma", Font.BOLD,18));
		me.setForeground(Color.black);
		f.getContentPane().add(me);

		
		final JLabel YB1 = new JLabel();
		YB1.setText("Y1");
		YB1.setBounds(80,10,500,60);
		YB1.setOpaque(false);
		YB1.setFont(new Font("Tahoma", Font.BOLD,18));
		YB1.setForeground(Color.black);
		f.getContentPane().add(YB1);

		
		final JLabel Ig = new JLabel();
		Ig.setText("=");
		Ig.setBounds(100,10,500,60);
		Ig.setOpaque(false);
		Ig.setFont(new Font("Tahoma", Font.BOLD,18));
		Ig.setForeground(Color.black);
		f.getContentPane().add(Ig);

		
		final JLabel m = new JLabel();
		m.setText("m");
		m.setBounds(115,10,500,60);
		m.setOpaque(false);
		m.setFont(new Font("Tahoma", Font.BOLD,18));
		m.setForeground(Color.black);
		f.getContentPane().add(m);

		
	
		final JLabel X1 = new JLabel();
		X1.setText("(X");
		X1.setBounds(135,10,500,60);
		X1.setOpaque(false);
		X1.setFont(new Font("Tahoma", Font.BOLD,18));
		X1.setForeground(Color.black);
		f.getContentPane().add(X1);

		
		final JLabel me1 = new JLabel();
		me1.setText("-");
		me1.setBounds(155,10,500,60);
		me1.setOpaque(false);
		me1.setFont(new Font("Tahoma", Font.BOLD,18));
		me1.setForeground(Color.black);
		f.getContentPane().add(me1);

		

		final JLabel XB1 = new JLabel();
		XB1.setText("X1)");
		XB1.setBounds(165,10,500,60);
		XB1.setOpaque(false);
		XB1.setFont(new Font("Tahoma", Font.BOLD,18));
		XB1.setForeground(Color.black);
		f.getContentPane().add(XB1);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel EA = new JLabel("A)");
		EA.setOpaque(false);
		EA.setBackground(Color.cyan);
		EA.setForeground(Color.black);
		EA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EA.setBounds(40, 90, 1000, 20);
		f.getContentPane().add(EA);

		
		final JSpinner A1 = new JSpinner();
		A1.setModel(new SpinnerNumberModel(1,0, 10, 1));
		A1.setFont(new Font("Tahoma", Font.BOLD, 20));
		A1.setBounds(80, 90, 50, 20);
		f.getContentPane().add(A1);
	
		
		JLabel AX1 = new JLabel("X");
		AX1.setOpaque(false);
		AX1.setBackground(Color.cyan);
		AX1.setForeground(Color.black);
		AX1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AX1.setBounds(65, 90, 1000, 20);
		f.getContentPane().add(AX1);

		
		final JSpinner A2 = new JSpinner();
		A2.setModel(new SpinnerNumberModel(1, 0, 10, 1));
		A2.setFont(new Font("Tahoma", Font.BOLD, 20));
		A2.setBounds(150, 90, 50, 20);
		f.getContentPane().add(A2);

		
		JLabel AY1 = new JLabel("Y");
		AY1.setOpaque(false);
		AY1.setBackground(Color.cyan);
		AY1.setForeground(Color.black);
		AY1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AY1.setBounds(135, 90, 1000, 20);
		f.getContentPane().add(AY1);

		
		
		JLabel EB = new JLabel("B)");
		EB.setOpaque(false);
		EB.setBackground(Color.cyan);
		EB.setForeground(Color.black);
		EB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EB.setBounds(40, 120, 1000, 20);
		f.getContentPane().add(EB);

		
		final JSpinner B1 = new JSpinner();
		B1.setModel(new SpinnerNumberModel(1, 0, 10, 1));
		B1.setFont(new Font("Tahoma", Font.BOLD, 20));
		B1.setBounds(80, 120, 50, 20);
		f.getContentPane().add(B1);

		
		JLabel BX1 = new JLabel("M");
		BX1.setOpaque(false);
		BX1.setBackground(Color.cyan);
		BX1.setForeground(Color.black);
		BX1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BX1.setBounds(65, 120, 1000, 20);
		f.getContentPane().add(BX1);

		

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		final JLabel Y11 = new JLabel();
		Y11.setText("Y");
		Y11.setBounds(60,140,500,60);
		Y11.setOpaque(false);
		Y11.setFont(new Font("Tahoma", Font.BOLD,18));
		Y11.setForeground(Color.black);
		f.getContentPane().add(Y11);

		
		final JLabel me11 = new JLabel();
		me11.setText("-");
		me11.setBounds(75,140,500,60);
		me11.setOpaque(false);
		me11.setFont(new Font("Tahoma", Font.BOLD,18));
		me11.setForeground(Color.black);
		f.getContentPane().add(me11);

		
		final JLabel YB11 = new JLabel();
		YB11.setText("Y1");
		YB11.setBounds(80,140,500,60);
		YB11.setOpaque(false);
		YB11.setFont(new Font("Tahoma", Font.BOLD,18));
		YB11.setForeground(Color.black);
		f.getContentPane().add(YB11);

		
		final JLabel Ig1 = new JLabel();
		Ig1.setText("=");
		Ig1.setBounds(100,140,500,60);
		Ig1.setOpaque(false);
		Ig1.setFont(new Font("Tahoma", Font.BOLD,18));
		Ig1.setForeground(Color.black);
		f.getContentPane().add(Ig1);

		final JLabel m1 = new JLabel();
		m1.setText("m");
		m1.setBounds(115,140,500,60);
		m1.setOpaque(false);
		m1.setFont(new Font("Tahoma", Font.BOLD,18));
		m1.setForeground(Color.black);
		f.getContentPane().add(m1);

		
	
		final JLabel X11 = new JLabel();
		X11.setText("(X");
		X11.setBounds(135,140,500,60);
		X11.setOpaque(false);
		X11.setFont(new Font("Tahoma", Font.BOLD,18));
		X11.setForeground(Color.black);
		f.getContentPane().add(X11);

		
		final JLabel me111 = new JLabel();
		me111.setText("-");
		me111.setBounds(155,140,500,60);
		me111.setOpaque(false);
		me111.setFont(new Font("Tahoma", Font.BOLD,18));
		me111.setForeground(Color.black);
		f.getContentPane().add(me111);

		

		final JLabel XB11 = new JLabel();
		XB11.setText("X1)");
		XB11.setBounds(165,140,500,60);
		XB11.setOpaque(false);
		XB11.setFont(new Font("Tahoma", Font.BOLD,18));
		XB11.setForeground(Color.black);
		f.getContentPane().add(XB11);

		
		final JLabel fff = new JLabel();
		fff.setText("Punto en la linea");
		fff.setBounds(50,175,500,60);
		fff.setOpaque(false);
		fff.setFont(new Font("Tahoma", Font.BOLD,18));
		fff.setForeground(Color.black);
		f.getContentPane().add(fff);

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



		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



final JLabel A = new JLabel();
A.setText("A");
A.setBounds(15,20,500,60);
A.setOpaque(false);
A.setBackground(Color.red);
A.setFont(new Font("Tahoma", Font.BOLD,18));
A.setForeground(Color.black);
f.getContentPane().add(A);

	

JSpinner sxA =new JSpinner();
sxA.setModel(new SpinnerNumberModel(0,0,10,1));
sxA.setFont(new Font("Thoma", Font.BOLD,20));
sxA.setBounds(30,40,40,20);
f.getContentPane().add(sxA);


final JLabel XA1 = new JLabel();
XA1.setText("X");
XA1.setBounds(75,20,500,60);
XA1.setOpaque(false);
XA1.setBackground(Color.red);
XA1.setFont(new Font("Tahoma", Font.BOLD,18));
XA1.setForeground(Color.black);
f.getContentPane().add(XA1);


JSpinner syA =new JSpinner();
syA.setModel(new SpinnerNumberModel(0,0,10,1));
syA.setFont(new Font("Thoma", Font.BOLD,20));
syA.setBounds(95,40,40,20);
f.getContentPane().add(syA);


final JLabel YA1 = new JLabel();
YA1.setText("Y");
YA1.setBounds(140,20,500,60);
YA1.setOpaque(false);
YA1.setBackground(Color.red);
YA1.setFont(new Font("Tahoma", Font.BOLD,18));
YA1.setForeground(Color.black);
f.getContentPane().add(YA1);


final JLabel B = new JLabel();
B.setText("B");
B.setBounds(15,60,500,60);
B.setOpaque(false);
B.setBackground(Color.red);
B.setFont(new Font("Tahoma", Font.BOLD,18));
B.setForeground(Color.black);
f.getContentPane().add(B);


JSpinner sxB =new JSpinner();
sxB.setModel(new SpinnerNumberModel(0,0,10,1));
sxB.setFont(new Font("Thoma", Font.BOLD,20));
sxB.setBounds(30,80,40,20);
f.getContentPane().add(sxB);

	
final JLabel XB2 = new JLabel();
XB2.setText("X");
XB2.setBounds(75,60,500,60);
XB2.setOpaque(false);
XB2.setBackground(Color.red);
XB2.setFont(new Font("Tahoma", Font.BOLD,18));
XB2.setForeground(Color.black);
f.getContentPane().add(XB2);


JSpinner syB =new JSpinner();
syB.setModel(new SpinnerNumberModel(0,0,10,1));
syB.setFont(new Font("Thoma", Font.BOLD,20));
syB.setBounds(95,80,40,20);
f.getContentPane().add(syB);


final JLabel YB2 = new JLabel();
YB2.setText("Y");
YB2.setBounds(140,60,500,60);
YB2.setOpaque(false);
YB2.setBackground(Color.red);
YB2.setFont(new Font("Tahoma", Font.BOLD,18));
YB2.setForeground(Color.black);
f.getContentPane().add(YB2);


final JLabel C1 = new JLabel();
C1.setText("C");
C1.setBounds(15,100,500,60);
C1.setOpaque(false);
C1.setBackground(Color.red);
C1.setFont(new Font("Tahoma", Font.BOLD,18));
C1.setForeground(Color.black);
f.getContentPane().add(C1);


JSpinner sxC =new JSpinner();
sxC.setModel(new SpinnerNumberModel(0,0,10,1));
sxC.setFont(new Font("Thoma", Font.BOLD,20));
sxC.setBounds(30,120,40,20);
f.getContentPane().add(sxC);

	
final JLabel XC = new JLabel();
XC.setText("X");
XC.setBounds(75,100,500,60);
XC.setOpaque(false);
XC.setBackground(Color.red);
XC.setFont(new Font("Tahoma", Font.BOLD,18));
XC.setForeground(Color.black);
f.getContentPane().add(XC);


JSpinner syC =new JSpinner();
syC.setModel(new SpinnerNumberModel(0,0,10,1));
syC.setFont(new Font("Thoma", Font.BOLD,20));
syC.setBounds(95,120,40,20);
f.getContentPane().add(syC);


final JLabel YC = new JLabel();
YC.setText("Y");
YC.setBounds(140,100,500,60);
YC.setOpaque(false);
YC.setBackground(Color.red);
YC.setFont(new Font("Tahoma", Font.BOLD,18));
YC.setForeground(Color.black);
f.getContentPane().add(YC);


final JLabel RE = new JLabel();
RE.setText("Area");
RE.setBounds(200,100,500,60);
RE.setOpaque(false);
RE.setBackground(Color.red);
RE.setFont(new Font("Tahoma", Font.BOLD,18));
RE.setForeground(Color.black);
f.getContentPane().add(RE);




JLabel V =new JLabel();
V.setText("");
V.setBounds(215,110,30,30);
V.setOpaque(false);
V.setFont(new Font("Tahoma", Font.BOLD,18));
V.setBackground(Color.YELLOW);
f.getContentPane().add(V);


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



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	 }
}
