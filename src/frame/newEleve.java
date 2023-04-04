package frame;
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class newEleve  extends JFrame {
	
	  public newEleve() {
		  
		  super("Ajout d'un nouveau cours"); //Titre de la fenêtre
		  
	        //Creation et apparition de la fenetre nouveau cours
	        JPanel contentCours = new JPanel();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(200, 200, 500, 300); //on se met en 100 100 et 800 de col et 300 lignes
			contentCours = new JPanel();
			contentCours.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentCours);
			contentCours.setLayout(null);
			setVisible(true);
	       
		  
	        //Création des boutons
	        JButton butValider = new JButton("Valider");
	        JButton butAnnuler = new JButton("Annuler");
	        
	        //Ajout des boutons dans le conteneur principal
	        contentCours.add(butValider);
	        butValider.setBounds(150, 100, 120, 40); //On place colonne 150, ligne 100 avec 120 de largeur et 40 longeur
	        
	        
	        //Action associée au bouton valider
	        butValider.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JOptionPane.showMessageDialog(null, "La création a réussi !", "Succès", JOptionPane.INFORMATION_MESSAGE);
	            }
	        });
	        
	        
	        ///////Création de la liste déroulante//////
	        
	        //récupération des noms
	        ArrayList<String> optionsList=SQL.data.NomsEleve();
	        JComboBox<String> listeDeroulante = new JComboBox<>(optionsList.toArray(new String[optionsList.size()]));
	        contentCours.add(listeDeroulante);
	        listeDeroulante.setBounds(150, 50, 120, 60);
	        
	        
	        //Ajout du conteneur principal dans la fenêtre

	        
	        //Affichage de la fenêtre

	        
	  }

}
