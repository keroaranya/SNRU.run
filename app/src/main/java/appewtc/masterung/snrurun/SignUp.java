package appewtc.masterung.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    //Explicit
    private EditText nameEditText,userEditText,passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choicelRadioButton, choice2RadioButton , choice3RadioButton ,
            choice4RadioButton,choice5RadioButton;
    private String nameString , userString , passwordSTring ,ragavata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //Bind Widget
        bindWiget();

    }//Main Method

    private void bindWiget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragavata);
        choicelRadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);


    }

    public void clickSignupSignUpMain(View view){
        //Get value From EditText
        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordSTring = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("")||userString.equals("")||passwordSTring.equals("")){
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง","กรุณากรอกทุกช่องค่ะ");

        }else {

        }
    }


} // Main Class
