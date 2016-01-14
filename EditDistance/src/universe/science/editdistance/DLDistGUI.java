package universe.science.editdistance;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class DLDistGUI extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jQuit;
	private JLabel jDLDistLabel;
	private JButton jCalculateButton;
	private JTextField jStr2TextField;
	private JTextField jStr1TextField;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				DLDistGUI inst = new DLDistGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public DLDistGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Damerau-Levenshtein Distance");
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("String 1");
				jLabel1.setBounds(24, 16, 44, 15);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("String 2");
				jLabel2.setBounds(24, 43, 44, 15);
			}
			{
				jStr1TextField = new JTextField();
				getContentPane().add(jStr1TextField);
				jStr1TextField.setText("diver");
				jStr1TextField.setBounds(86, 12, 214, 22);
			}
			{
				jStr2TextField = new JTextField();
				getContentPane().add(jStr2TextField);
				jStr2TextField.setText("driver");
				jStr2TextField.setBounds(86, 40, 214, 22);
			}
			{
				jCalculateButton = new JButton();
				getContentPane().add(jCalculateButton);
				jCalculateButton.setText("Calculate Damerau-Levenshtein Distance");
				jCalculateButton.setBounds(24, 99, 276, 22);
				jCalculateButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jCalculateButton.actionPerformed, event="+evt);
						String str1 = jStr1TextField.getText();
						String str2 = jStr2TextField.getText();
						int editDist = DamerauLevenshteinDistance.computeLevensteinDistance(str1, str2);
						jDLDistLabel.setText(""+editDist);
					}
				});
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Damerau-Levenshtein Distance");
				jLabel3.setBounds(24, 73, 227, 15);
			}
			{
				jDLDistLabel = new JLabel();
				getContentPane().add(jDLDistLabel);
				jDLDistLabel.setText("1");
				jDLDistLabel.setBounds(263, 73, 37, 15);
			}
			{
				jQuit = new JButton();
				getContentPane().add(jQuit);
				jQuit.setText("Quit");
				jQuit.setBounds(263, 137, 37, 22);
				jQuit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jQuit.actionPerformed, event="+evt);
						System.exit(0);
					}
				});
			}
			pack();
			this.setSize(337, 201);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
