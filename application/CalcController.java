package application;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author rodomod
 */
public class CalcController implements Initializable {
    
    @FXML
private TextField displayField;   
double firstnum;
double secondnum;
 String operation = "+,-,*,/";  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  

    @FXML
    private void handleButton1Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (1) );
    }

    @FXML
    private void handleButton0Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (0));
    }

    @FXML
    private void handleButton9Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (9));
    }

    @FXML
    private void handleButton2Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (2));
    }

    @FXML
    private void handleButton3Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (3));
    }

    @FXML
    private void handleButton7Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (7));
    }

    @FXML
    private void handleButton6Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (6));
    }

    @FXML
    private void handleButton5Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (5));
    }

    @FXML
    private void handleButton4Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (4));
    }

    @FXML
    private void handleButtonSqrtAction(ActionEvent event) {
        double firstnum=Double.parseDouble(displayField.getText());
	double secondnum=Double.parseDouble(displayField.getText());
		String jd=displayField.getText();
	if(jd.indexOf("")==0)displayField.setText(Math.sqrt(firstnum*secondnum/secondnum)+"");
    }

    @FXML
    private void handleButton8Action(ActionEvent event) {
        displayField.setText(displayField.getText() + (8));
    }

    @FXML
    private void handleButtonPntAction(ActionEvent event) {
        String Pnt=displayField.getText();
        if(!Pnt.contains("."))displayField.setText(displayField.getText()+".");
    }

    @FXML
    private void handleButtonOpsAction(ActionEvent event) {
        double ops=Double.parseDouble(String.valueOf(displayField.getText()));
        ops=ops*(-1);
        displayField.setText(String.valueOf(ops));
    }

    @FXML
    private void handleButtonCAction(ActionEvent event) {
        String temp=displayField.getText();
        displayField.setText(temp.substring(0,temp.length()-1));
    }

    @FXML
    private void handleButtonCEAction(ActionEvent event) {
        displayField.setText(""); 
    }

    @FXML
    private void handleButtonMulAction(ActionEvent event) {
        firstnum=Double.parseDouble(displayField.getText());
		displayField.setText("");
		operation="*";
    }

    @FXML
    private void handleButtonSubAction(ActionEvent event) {
        firstnum=Double.parseDouble(displayField.getText());
		displayField.setText("");
		operation="-";
    }

    @FXML
    private void handleButtonSumAction(ActionEvent event) {
        firstnum=Double.parseDouble(displayField.getText());
		displayField.setText("");
		operation="+";
    }
    @FXML
    private void handleButtonDivideAction(ActionEvent event) {
        firstnum=Double.parseDouble(displayField.getText());
		displayField.setText("");
		operation="/";
    }

    @FXML
    private void handleButtonStartAction(ActionEvent event) {
        double   secondnum=Double.parseDouble(displayField.getText());
   if(operation=="+"){
       displayField.setText((firstnum+secondnum)+"");
   }
  else if(operation=="-"){
       displayField.setText((firstnum-secondnum)+"");
   }
  else if(operation=="*"){
       displayField.setText((firstnum*secondnum)+"");
   }
   else if(operation=="/"){
       displayField.setText((firstnum/secondnum)+"");
   }
            


    }
    
}
