package balh9.h10;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TestProgramma
{   
    //Instance variabelen
    private TextField Size;
    private final Button setSize;
    private Label Zin;
    private final Button opblazen;
    private Bal bal;

    
    
    TestProgramma(GridPane p)
    {
        //Objecten aanmaken
        Size = new TextField();
        setSize = new Button("Bereken");
        Zin = new Label();
        opblazen = new Button("Opblazen");
        bal = new Bal();
               
        //De size aangeven van de bal
        setSize.setOnAction(event -> {
            try
            {                                                         
                int size1 = Integer.parseInt(Size.getText());
                
                if(size1 < 0 || size1 > 50)
                {
                     throw new VerkeerdewaardeException();
                }
                bal.setSize(size1);
                Zin.setText("De bal is " + bal.getSize() + " cm");

                
            
            }
            catch(NumberFormatException e)
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fout");
                alert.setHeaderText("Helaas een fout");
                alert.setContentText( e.getMessage() );

                alert.showAndWait();
                
            }
            catch(VerkeerdewaardeException ex)
            {
                System.out.println("Je moet een waarde tussen 0 - 50 invullen");
                
            }                       
        });
        
        //Bal opblazen en verhogen met 2
        opblazen.setOnAction(event -> {
            
            int size1 = Integer.parseInt(Size.getText());
            bal.opblazen();
            System.out.println("Boem!" + bal.getSize());                                   
        });
        
        //Objecten toevoegen aan de Pane
        p.add(Size, 1, 1);
        p.add(setSize,1,2);
        p.add(Zin, 1, 3);
        p.add(opblazen, 2, 2);

    }
        
}
