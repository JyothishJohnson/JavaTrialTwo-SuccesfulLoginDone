package com.example.android.javatrialtwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;

//import com.firebase.ui.auth.AuthUI;

public class Home extends AppCompatActivity {

    private String mUsername;
    private String mUserPhotoUrl;
    public static final int RC_SIGN_IN = 1;
   //FirebaseAuthProvider fb;
   // CallbackManager callbackManager;
  //  private FirebaseAuth mFirebaseAuth;
  //  private FirebaseAuth.AuthStateListener mAuthStateListener;
    String firebaseName;
    String firebasePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle= getIntent().getExtras();
        if(bundle!=null){
            firebaseName=bundle.getString("username");
            firebasePhoto=bundle.getString("photourl");
        }

        Toast.makeText(this,"Username : "+ firebaseName +"PhotoURL : "+ firebasePhoto ,Toast.LENGTH_SHORT).show();

        //callbackManager = CallbackManager.Factory.create();

        setContentView(R.layout.activity_home);

      //  mFirebaseAuth = FirebaseAuth.getInstance();


        TextView basicConcepts = (TextView) findViewById(R.id.b1);
        TextView controlStatements = (TextView) findViewById(R.id.b2);
        TextView arrays = (TextView) findViewById(R.id.b3);
        TextView classesAndObjects = (TextView) findViewById(R.id.b4);
        TextView moreOnClasses = (TextView) findViewById(R.id.b5);
        TextView exceptionsAndMore = (TextView) findViewById(R.id.b6);
        TextView forum= (TextView ) findViewById(R.id.b7);


        basicConcepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(Home.this, Basic.class);
                startActivity(basicConceptsIntent);
            }
        });

        controlStatements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(Home.this, ControlStatements.class);
                startActivity(basicConceptsIntent);
            }
        });

        arrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(Home.this, ArraysTopic.class);
                basicConceptsIntent.putExtra("username",firebaseName);
                basicConceptsIntent.putExtra("userPhoto",firebasePhoto);
                startActivity(basicConceptsIntent);
            }
        });

        classesAndObjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(Home.this, ClassesAndObjects.class);
                startActivity(basicConceptsIntent);
            }
        });

        moreOnClasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(Home.this, MoreOnClasses.class);
                startActivity(basicConceptsIntent);
            }
        });

        exceptionsAndMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicConceptsIntent = new Intent(Home.this, Exceptions.class);
                startActivity(basicConceptsIntent);
            }
        });

        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forumIntent = new Intent(Home.this, ForumActivity.class);
                forumIntent.putExtra("username",firebaseName);
                forumIntent.putExtra("userPhoto",firebasePhoto);
                startActivity(forumIntent);
            }
        });


        /*  mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

                if (firebaseUser != null) {

                    onSignedInInitialize(firebaseUser.getDisplayName(),firebaseUser.getPhotoUrl().toString());

                    Toast.makeText(getApplicationContext(), "Signed In as " + mUsername  , Toast.LENGTH_SHORT).show();
                } else {


                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setIsSmartLockEnabled(false)
                                    .setTheme(R.style.SuperTheme)
                                    .setProviders(Arrays.asList(
                                            new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                            new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build(),
                                            new AuthUI.IdpConfig.Builder(AuthUI.FACEBOOK_PROVIDER).build()
                                            // new AuthUI.IdpConfig.Builder(AuthUI.TWITTER_PROVIDER).build()
                                    ))
                                    .build(),
                            RC_SIGN_IN);
                }
            }
        };*/


    }

  /*  @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            if (resultCode == RESULT_OK) {
               // finish();

            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "SignIn Cancelled", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.sign_out_menu:
                AuthUI.getInstance().signOut(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


  /*  @Override
    protected  void onPause() {
        super.onPause();
        if (mAuthStateListener != null) {
            mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
        }


    }*/

  /*  @Override
    protected  void onResume(){
        super.onResume();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);



    }*/

    /*private  void onSignedInInitialize(String username, String userPhoto){
        mUsername=username;
        mUserPhotoUrl= userPhoto;



    }*/



    }





