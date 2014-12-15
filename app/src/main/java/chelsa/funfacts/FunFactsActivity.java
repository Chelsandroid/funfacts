package chelsa.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables and assign them the views from the layout files
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFact);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //The button was clicked, so update factLabel with new fact
                String fact = "";
                //Randomly select a fact
                Random randomGenerator = new Random(); //Construct a new Random Number Generator
                int randomNumber = randomGenerator.nextInt(3);

                /* Convert the randomNumber to a text fact
                *0 = Ants stretch when they wake up in the morning
                * 1= Ostriches can run faster than horses
                * 2 = Olympic gold medals are actually mostly made of silver.
                 */
               /* String[] factStrings = {"Ants stretch when they wake up in the morning",
                        "Ostriches can run faster than horses",
                        "Olympic gold medals are actually made of silver"
                        };*/
                if(randomNumber == 0) {
                 fact = "Ants stretch when they wake up in the morning";
                }
                else if(randomNumber == 1) {
                    fact = "Ostriches can run faster than horses";
                }

                else if(randomNumber == 2) {
                    fact = "Olympic gold medals are actually mostly made of silver.";
                }
                else {
                    fact = "Sorry there was an error.";
                }
                //Update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
