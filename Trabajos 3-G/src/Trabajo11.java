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
public class Trabajo11 {
	private JFrame f;
	private JFrame f1;
	private JFrame f2;
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
					Trabajo11 window = new Trabajo11();
					window.f.setVisible(true);
					window.f1.setVisible(true);
					window.f2.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Trabajo11 (){
		initialize();
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("                                          Formulas");
		f.setBounds(610,100,370,400);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.green);
		
		f1=new JFrame();
		f1.setTitle("                     Ordered at the origin");
		f1.setBounds(50,100,370,400);
		
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane().setLayout(null);
		f1.getContentPane().setBackground(Color.green);

		f2=new JFrame();
		f2.setTitle("                     Ordered at the origin");
		f2.setBounds(1150,100,370,400);
		
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.getContentPane().setLayout(null);
		f2.getContentPane().setBackground(Color.green);
		
		final JCheckBox C1 = new JCheckBox("Ordered at the origin");
		C1.setSelected(false);
		C1.setBounds(100, 60, 250, 23);
		C1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		C1.setOpaque(false);
		f.getContentPane();
		A.add(C1);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

final JLabel Y1 = new JLabel();
Y1.setText("Y");
Y1.setBounds(60,10,500,60);
Y1.setOpaque(true);
Y1.setFont(new Font("Tahoma", Font.BOLD,18));
Y1.setForeground(Color.black);
f1.getContentPane().add(Y1);


final JLabel me = new JLabel();
me.setText("-");
me.setBounds(75,10,500,60);
me.setOpaque(true);
me.setFont(new Font("Tahoma", Font.BOLD,18));
me.setForeground(Color.black);
f1.getContentPane().add(me);


final JLabel YB1 = new JLabel();
YB1.setText("Y1");
YB1.setBounds(80,10,500,60);
YB1.setOpaque(true);
YB1.setFont(new Font("Tahoma", Font.BOLD,18));
YB1.setForeground(Color.black);
f1.getContentPane().add(YB1);


final JLabel Ig = new JLabel();
Ig.setText("=");
Ig.setBounds(100,10,500,60);
Ig.setOpaque(true);
Ig.setFont(new Font("Tahoma", Font.BOLD,18));
Ig.setForeground(Color.black);
f1.getContentPane().add(Ig);


final JLabel m = new JLabel();
m.setText("m");
m.setBounds(115,10,500,60);
m.setOpaque(true);
m.setFont(new Font("Tahoma", Font.BOLD,18));
m.setForeground(Color.black);
f1.getContentPane().add(m);



final JLabel X1 = new JLabel();
X1.setText("(X");
X1.setBounds(135,10,500,60);
X1.setOpaque(true);
X1.setFont(new Font("Tahoma", Font.BOLD,18));
X1.setForeground(Color.black);
f1.getContentPane().add(X1);


final JLabel me1 = new JLabel();
me1.setText("-");
me1.setBounds(155,10,500,60);
me1.setOpaque(true);
me1.setFont(new Font("Tahoma", Font.BOLD,18));
me1.setForeground(Color.black);
f1.getContentPane().add(me1);



final JLabel XB1 = new JLabel();
XB1.setText("X1)");
XB1.setBounds(165,10,500,60);
XB1.setOpaque(true);
XB1.setFont(new Font("Tahoma", Font.BOLD,18));
XB1.setForeground(Color.black);
f1.getContentPane().add(XB1);

JLabel EA = new JLabel("A)");
EA.setOpaque(true);
EA.setBackground(Color.cyan);
EA.setForeground(Color.black);
EA.setFont(new Font("Tahoma", Font.PLAIN, 20));
EA.setBounds(40, 90, 1000, 20);
f1.getContentPane().add(EA);


final JSpinner A1 = new JSpinner();
A1.setModel(new SpinnerNumberModel(1,0, 10, 1));
A1.setFont(new Font("Tahoma", Font.BOLD, 20));
A1.setBounds(80, 90, 50, 20);
f1.getContentPane().add(A1);


JLabel AX1 = new JLabel("X");
AX1.setOpaque(true);
AX1.setBackground(Color.cyan);
AX1.setForeground(Color.black);
AX1.setFont(new Font("Tahoma", Font.PLAIN, 20));
AX1.setBounds(65, 90, 1000, 20);
f1.getContentPane().add(AX1);


final JSpinner A2 = new JSpinner();
A2.setModel(new SpinnerNumberModel(1, 0, 10, 1));
A2.setFont(new Font("Tahoma", Font.BOLD, 20));
A2.setBounds(150, 90, 50, 20);
f1.getContentPane().add(A2);


JLabel AY1 = new JLabel("Y");
AY1.setOpaque(true);
AY1.setBackground(Color.cyan);
AY1.setForeground(Color.black);
AY1.setFont(new Font("Tahoma", Font.PLAIN, 20));
AY1.setBounds(135, 90, 1000, 20);
f1.getContentPane().add(AY1);



JLabel EB = new JLabel("B)");
EB.setOpaque(true);
EB.setBackground(Color.cyan);
EB.setForeground(Color.black);
EB.setFont(new Font("Tahoma", Font.PLAIN, 20));
EB.setBounds(40, 120, 1000, 20);
f1.getContentPane().add(EB);


final JSpinner B1 = new JSpinner();
B1.setModel(new SpinnerNumberModel(1, 0, 10, 1));
B1.setFont(new Font("Tahoma", Font.BOLD, 20));
B1.setBounds(80, 120, 50, 20);
f1.getContentPane().add(B1);


JLabel BX1 = new JLabel("M");
BX1.setOpaque(true);
BX1.setBackground(Color.cyan);
BX1.setForeground(Color.black);
BX1.setFont(new Font("Tahoma", Font.PLAIN, 20));
BX1.setBounds(65, 120, 1000, 20);
f1.getContentPane().add(BX1);


final JLabel Y11 = new JLabel();
Y11.setText("Y");
Y11.setBounds(60,140,500,60);
Y11.setOpaque(true);
Y11.setFont(new Font("Tahoma", Font.BOLD,18));
Y11.setForeground(Color.black);
f1.getContentPane().add(Y11);


final JLabel me11 = new JLabel();
me11.setText("-");
me11.setBounds(75,140,500,60);
me11.setOpaque(true);
me11.setFont(new Font("Tahoma", Font.BOLD,18));
me11.setForeground(Color.black);
f1.getContentPane().add(me11);


final JLabel YB11 = new JLabel();
YB11.setText("Y1");
YB11.setBounds(80,140,500,60);
YB11.setOpaque(true);
YB11.setFont(new Font("Tahoma", Font.BOLD,18));
YB11.setForeground(Color.black);
f1.getContentPane().add(YB11);


final JLabel Ig1 = new JLabel();
Ig1.setText("=");
Ig1.setBounds(100,140,500,60);
Ig1.setOpaque(true);
Ig1.setFont(new Font("Tahoma", Font.BOLD,18));
Ig1.setForeground(Color.black);
f1.getContentPane().add(Ig1);

final JLabel m1 = new JLabel();
m1.setText("m");
m1.setBounds(115,140,500,60);
m1.setOpaque(true);
m1.setFont(new Font("Tahoma", Font.BOLD,18));
m1.setForeground(Color.black);
f1.getContentPane().add(m1);



final JLabel X11 = new JLabel();
X11.setText("(X");
X11.setBounds(135,140,500,60);
X11.setOpaque(true);
X11.setFont(new Font("Tahoma", Font.BOLD,18));
X11.setForeground(Color.black);
f1.getContentPane().add(X11);


final JLabel me111 = new JLabel();
me111.setText("-");
me111.setBounds(155,140,500,60);
me111.setOpaque(true);
me111.setFont(new Font("Tahoma", Font.BOLD,18));
me111.setForeground(Color.black);
f1.getContentPane().add(me111);



final JLabel XB11 = new JLabel();
XB11.setText("X1)");
XB11.setBounds(165,140,500,60);
XB11.setOpaque(true);
XB11.setFont(new Font("Tahoma", Font.BOLD,18));
XB11.setForeground(Color.black);
f1.getContentPane().add(XB11);


final JLabel fff = new JLabel();
fff.setText("Punto en la linea");
fff.setBounds(50,175,500,60);
fff.setOpaque(true);
fff.setFont(new Font("Tahoma", Font.BOLD,18));
fff.setForeground(Color.black);
f1.getContentPane().add(fff);


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
f1.getContentPane().add(ma);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		C1.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				Y1.setOpaque(false);
				me.setOpaque(false);
				YB1.setOpaque(false);
				m.setOpaque(false);
				Ig.setOpaque(false);
				X1.setOpaque(false);
				me1.setOpaque(false);
				XB1.setOpaque(false);
				EA.setOpaque(false);
				AX1.setOpaque(false);
				AY1.setOpaque(false);
				EB.setOpaque(false);
				BX1.setOpaque(false);
				Y11.setOpaque(false);
				me11.setOpaque(false);
				YB11.setOpaque(false);
				Ig1.setOpaque(false);
				m1.setOpaque(false);
				X11.setOpaque(false);
				me111.setOpaque(false);
				XB11.setOpaque(false);
				fff.setOpaque(false);

			}
	});

		f.getContentPane().add(C1);

	
		final JCheckBox C2 = new JCheckBox("General equation of the straight line");
		C2.setSelected(false);
		C2.setBounds(30, 140, 290, 23);
		C2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		C2.setOpaque(false);
		f.getContentPane();
		A.add(C2);

		C2.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
		
			}
	});

		f.getContentPane().add(C2);
		
		final JCheckBox C3 = new JCheckBox("Manual");
		C3.setSelected(false);
		C3.setBounds(100, 220, 290, 23);
		C3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C3.setOpaque(false);
		f.getContentPane();
		A.add(C3);

		C3.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
		
			}
	});

		f.getContentPane().add(C3);


	}
}