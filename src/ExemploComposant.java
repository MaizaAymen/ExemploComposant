package swiswi;

/* Importation les bibliothèques nécessaires */
import javax.swing.*; // Bibliothèque mta3 les composants graphiques
import javax.swing.text.JTextComponent; // Pour les composants texte
import java.awt.*; // Pour le design (layouts, dimensions)

public class ExemploComposant extends JFrame { // Na3mlou fenêtre principale

    /* Déclaration les variables */
    private JTabbedPane tabbedPane; // Onglets mta3 les composants (kima les onglets f Firefox)

    /* Constructeur - hetha l partie li tetsa3ed ki na3mlou new ExemploComposant() */
    public ExemploComposant() {
        /* Configuration de base mta3 la fenêtre */
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Ki n9elbou la fenêtre, l'app kamla tfaskh
        setTitle("Exemple composants"); // Titre mta3 la fenêtre
        
        /* Initialisation les composants */
        tabbedPane = new JTabbedPane(); // Na3mlou système onglets
        this.add(tabbedPane); // Nzidouh l fenêtre principale

        /* Na3mlou appel mta3 méthode addComponent bech nzidou kol composant f onglet mte3ou */
        
        // Onglet 1: Labels
        addComponent("Label", 
            new JLabel(UIManager.getIcon("FileView.computerIcon")), // Icône système (kima icône ordi)
            new JLabel("Libellé avec du texte")); // Texte normal
            
        // Onglet 2: Champs texte
        addComponent("Text Field", new JTextField("champ de texte")); // Zone saisie simple (kima recherche Google)
        
        // Onglet 3: Zone texte kbira
        addComponent("Text Area", new JTextArea("zone de texte")); // Zone texte kbira (kima commentaire Facebook)
        
        // Onglet 4: Liste déroulante
        addComponent("Combo Box", new JComboBox<>(new String[] {"Bleu", "Rouge", "Vert"})); // Menu déroulant (kima filtre mta3 jumia)
        
        // Onglet 5: Checkbox
        addComponent("Check Box", new JCheckBox("une boîte à cocher")); // Case à cocher (kima ki t7eb t5tar option)
        
        // Onglet 6: Spinner
        addComponent("Spinner", new JSpinner()); // Flèches bech nzidou w n9al9ou nombre (kima quantité f jumia)
        
        // Onglet 7: Editeur HTML
        addComponent("Editor", new JEditorPane("text/html", "<p>Un éditeur de texte <strong>formaté</strong></p>")); // Editeur texte riche (kima Word)
        
        // Onglet 8: Barre de progression
        JProgressBar progressBar = new JProgressBar(); // Barra progression (kima ki ttelecharge fichier)
        progressBar.setValue(60); // 60% m3amra
        addComponent("Progress Bar", progressBar);
        
        // Onglet 9: Bouton
        addComponent("Button", new JButton("Un bouton")); // Bouton normal (kima "Valider")

        /* Paramètres finale mta3 la fenêtre */
        setSize(500, 400); // Dimensions: 500 largeur, 400 hauteur
        setLocationRelativeTo(null); // Fenêtre f centre écran
    }

    /* Méthode privée bech nzid composant f onglet */
    private void addComponent(String title, JComponent... components) {
        // Na3mlou panel jdid
        JPanel panel = new JPanel(new FlowLayout()); // FlowLayout yrabi les composants l9adham (kima mots f ligne)
        
        // Boucle bech nzidou kol composant l panel
        for (JComponent component : components) {
            panel.add(component); // Nzidou composant
        }
        
        // Nzidou panel l onglet jdid
        tabbedPane.add(title, panel); // title = ism onglet, panel = contenu
    }

    /* Méthode principale - hetha li tetsa3ed ki nlanci l'app */
    public static void main(String[] args) {
        try {
            // Nesta3mlou design système (Windows/Mac/Linux)
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace(); // Ken fama erreur, nharjouha f console
        }
        
        /* Na3mlou l'interface f thread graphique (best practice) */
        SwingUtilities.invokeLater(() -> {
            ExemploComposant window = new ExemploComposant(); // Na3mlou instance jdida
            window.setVisible(true); // Nharjou la fenêtre
        });
    }
}