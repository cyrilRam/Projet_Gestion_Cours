package frame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import SQL.data;

public class frameTest extends JFrame  {
	
	  public frameTest() {
		  
	        super("Gestion des cours"); //Titre de la fenêtre
	        
	        //Jpanel
	        JPanel contentPane = new JPanel();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 533, 334);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			setVisible(true);
	       
	        
	        
	        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Gestion des boutons %%%%%%%%%%%%%%%%%%%
	        //Création des boutons et Titre du bouton
			//JLabel Cours = new JLabel("Ajouter Cours ");
	        JButton newCours = new JButton("Ajouter");
	        JButton newFact = new JButton("Nouvelle Facture");
	        
	    
	        //Ajout des actions listeners aux boutons
	        
	        //Ajout nouvel Eleve
	        newCours.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	newEleve eleve=new frame.newEleve();
	            }
	        });
	        
	        //
	        
	        //Ajout des boutons dans le conteneur principal
	        contentPane.add(newCours);
	        newCours.setBounds(80, 53, 161, 60);
	        contentPane.add(newFact);
	        newFact.setBounds(250, 53, 161, 60);
	        
	      
	
	        
	        /*
	         
	        //Création de la barre de menu
	        JMenuBar menuBar = new JMenuBar();
	        
	        //Création des menus
	        JMenu fichierMenu = new JMenu("Fichier");
	        JMenu editionMenu = new JMenu("Edition");
	        JMenu aideMenu = new JMenu("Aide");
	        
	        //Ajout des menus dans la barre de menu
	        menuBar.add(fichierMenu);
	        menuBar.add(editionMenu);
	        menuBar.add(aideMenu);
	        
	        //Création des sous-menus
	        JMenuItem nouveauMenuItem = new JMenuItem("Nouveau");
	        JMenuItem ouvrirMenuItem = new JMenuItem("Ouvrir");
	        JMenuItem enregistrerMenuItem = new JMenuItem("Enregistrer");
	        JMenuItem quitterMenuItem = new JMenuItem("Quitter");
	        
	        //Ajout des sous-menus dans le menu "Fichier"
	        fichierMenu.add(nouveauMenuItem);
	        fichierMenu.add(ouvrirMenuItem);
	        fichierMenu.add(enregistrerMenuItem);
	        fichierMenu.addSeparator();
	        fichierMenu.add(quitterMenuItem);
	        
	        //Ajout de la barre de menu dans la fenêtre
	        setJMenuBar(menuBar);
	        */
	       
	        
	        
	  }

}
