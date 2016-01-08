package botavia.literaryshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

import entities.Customer;
import entities.Gender;

public class CustomerSignUpActivity extends AppCompatActivity {

    //The RegEx pattern to match the password
    final static Pattern passwordPattern = Pattern.compile("(([a-z]+\\d+)|(\\d+[a-z]+))([a-z]*\\d*[a-z]*\\d*)");
    // Email validity pattern
    final static Pattern emailPattern = Pattern.compile("([a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+){0,3})");
    // from 1/1/1950 to 31/12/2019
    final static Pattern datePattern = Pattern.compile("((0?[1-9]{1})|([1-2][0-9])|(3[0-1]))\\/((0?[1-9]{1})|(1[0-2]))\\/((20[0-1][0-9])|(19[5-9][0-9]))");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_sign_up);
    }

    public void register(View V) {
        TextView errorMessage = (TextView)findViewById(R.id.error_message_registration);
        errorMessage.setVisibility(View.INVISIBLE);

        EditText eName = (EditText) findViewById(R.id.customerName);
        String name = eName.getText().toString();

        //check if the name was not left empty
        if(name.equals("")) {
            errorMessage.setText(getResources().getText(R.string.name_empty).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        EditText eAddress = (EditText) findViewById(R.id.customerAddress);
        String address = eName.getText().toString();

        //check if the name was not left empty
        if(address.equals("")) {
            errorMessage.setText(getResources().getText(R.string.address_empty).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        EditText Eemail = (EditText)findViewById(R.id.customerEmail);
        String email = Eemail.getText().toString();

        //check if the email was not left empty
        if(email.equals("")) {
            errorMessage.setText(getResources().getText(R.string.email_empty).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        Matcher emailMatcher = emailPattern.matcher(email);
        //check if the chosen password is legal
        if (!emailMatcher.matches()) {
            errorMessage.setText(getResources().getText(R.string.illegal_email).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        //check if email exists in the database
        if(MainActivity.databaseList.doesCustomerEmailExist(email)) {
            errorMessage.setText(getResources().getText(R.string.email_taken).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        // Check that the date was entered in a valid format
        EditText eDate = (EditText) findViewById(R.id.birthDate);
        String date = eDate.getText().toString();

        Matcher dateMatcher = datePattern.matcher(date);
        //check if the chosen password is legal
        if (!dateMatcher.matches()) {
            errorMessage.setText(getResources().getText(R.string.illegal_date).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        EditText ePassword = (EditText) findViewById(R.id.password);
        EditText eConfirm = (EditText) findViewById(R.id.confirmPassword);

        String password = ePassword.getText().toString();

        //check if matches confirmation
        if (!password.equals(eConfirm.getText().toString())) {
            errorMessage.setText(getResources().getText(R.string.passwords_dont_match).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        Matcher passwordMatcher = passwordPattern.matcher(password);
        //check if the chosen password is legal
        if (!passwordMatcher.matches()) {
            errorMessage.setText(getResources().getText(R.string.illegal_password).toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        // retrieve the selected gender
        RadioGroup selectGender = (RadioGroup) findViewById(R.id.genderSelect);
        int selectGenderId = selectGender.getCheckedRadioButtonId();

        Gender gender = Gender.MALE;

        if (selectGenderId == R.id.customerRadioFemale) {
            gender = Gender.FEMALE;
        }

        // Format the birth date
        Scanner dateScanner = new Scanner(date);
        dateScanner.useDelimiter("\\/");
        int day = dateScanner.nextInt();
        int month = dateScanner.nextInt();
        int year = dateScanner.nextInt();
        Date birthDate = new Date(day,month,year);

        Customer newCustomer = new Customer(name, address, birthDate, email, gender, password);

        try {
            MainActivity.databaseList.addCustomer(newCustomer);
        }

        catch (Exception a) {
            errorMessage.setText(a.getMessage().toString());
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        Intent loginInten = new Intent(this, ProductList.class);
        startActivity(loginInten);
    }
}
