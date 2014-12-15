package chelsa.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Chelsa on 12/15/14.
 */
public class ColorWheel {
        //member variables (properties about the object)

        public String [] mColors= {
                "#A600A6",

                "#7C1F7C",

                "#6C006C",

                "#D235D2",

                "#D25FD2",

                "#E40045",

                "#AB2B52",

                "#94002D",

                "#F13C73",

                "#F16D95",

                "#530FAD",

                "#4F2982",

                "#330570",

                "#8243D6",

                "#996AD6"
        };
        //Method(abilities: things that the object can do)
        public int getColor(){

            String color = "";

            //Randomly select a color
            Random randomGenerator = new Random(); //Construct a new Random Number Generator
            int randomNumber = randomGenerator.nextInt(mColors.length);

            color = mColors[randomNumber];
            int colorAsInt = Color.parseColor(color);
            return colorAsInt;

        }
    }

