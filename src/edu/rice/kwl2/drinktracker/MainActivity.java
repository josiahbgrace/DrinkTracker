package edu.rice.kwl2.drinktracker;

import android.os.Bundle;
import android.app.ActionBar;
import android.view.MenuInflater;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	//TODO: Create the person
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { //main function
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //for the options menu in the corner
        // Inflate the menu; this adds items to the action bar if it is present.
    	getActionBar().setDisplayShowTitleEnabled(false); //hide "DrinkTracker"
    	getActionBar().setDisplayShowHomeEnabled(false); //hide icon
    	getMenuInflater().inflate(R.menu.main, menu);
        MenuInflater inflater = getMenuInflater(); //used for action bar buttons
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    //Below are methods that would update the number of drinks when buttons are pushed
    public void updateNumDrinksBeer(View view){
    	person.getCurrentEvent.addDrink("Beer",1.0);
    	TextView textView = (TextView) findViewById(R.id.textView1);
    	textView.setText(person.getCurrentEvent.getNumDrinks());
    }
    
    public void updateNumDrinksShot(View view){
    	person.getCurrentEvent.addDrink("Shot",1.0);
    	TextView textView = (TextView) findViewById(R.id.textView1);
    	textView.setText(person.getCurrentEvent.getNumDrinks());
    }
    
    public void updateNumDrinksCup(View view){
    	person.getCurrentEvent.addDrink("Jungle",1.5);
    	TextView textView = (TextView) findViewById(R.id.textView1);
    	textView.setText(person.getCurrentEvent.getNumDrinks());
    }
    
    public void updateNumDrinksWine(View view){
    	person.getCurrentEvent.addDrink("Wine",1.0);
    	TextView textView = (TextView) findViewById(R.id.textView1);
    	textView.setText(person.getCurrentEvent.getNumDrinks());
    }
    
}
