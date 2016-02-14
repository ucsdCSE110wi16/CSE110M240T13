package cse110mt13.tritonprofessorraterv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class AddComment extends AppCompatActivity {

    private RatingBar ratingC;
    private RatingBar ratingE;
    private RatingBar ratingH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_comment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.ac_Submit_B).setOnClickListener(onclickListener);;
        findViewById(R.id.ac_Cancel_B).setOnClickListener(onclickListener);;

        // addListenerOnRatingC();
    }

    /*
    public void addListenerOnRatingC(){
        ratingC =(RatingBar) findViewById(R.id.ratingC);
        ratingC.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                float ratingC = rating;
            }
        });
    }
    */

    private View.OnClickListener onclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ac_Submit_B:
                     /*  TODO: write backend function to determine whether clicking on search
                   should jump to none found page, or search-found page
                 */
                    finish(); //end current activity
                    startActivity(new Intent(AddComment.this, ProfPage.class)); //create a new activity
                    break;
                case R.id.ac_Cancel_B:
                    finish(); //end current activity
                    startActivity(new Intent(AddComment.this, ProfPage.class)); //create a new activity
                    break;
            }
        }
    };




}
