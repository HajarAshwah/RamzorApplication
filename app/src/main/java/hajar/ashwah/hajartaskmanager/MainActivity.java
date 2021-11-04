package hajar.ashwah.hajartaskmanager;
//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 - github token
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

//listener 1
public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //1.buld menu xml
    //2.to add menu (3 points right-top corner)to the current activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {////////
        //                         the xml menu file
        getMenuInflater().inflate(R.menu.main_minu,menu);
        return true;
    }
//3.select item event handler
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId()==R.id.ItmSettings)
        {
            Intent i=new Intent(getApplicationContext(),SettingsActivity.class);
            startActivity(i);
        }
        if (item.getItemId()==R.id.ItmHistory);
        {
            Intent i=new Intent(getApplicationContext(),HistoryActivity.class);
            startActivity(i);
        }
        if (item.getItemId()==R.id.ItmSign);
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Are You Sure?");
            builder.setCancelable(true);
            builder.setPositiveButton("YES",this);
            builder.setNegativeButton("NO",this);
            AlertDialog dialog=builder.create();
            dialog.show();
        }
return true;
}

    /**
     * event handler
     * @param dialogInterface the active dialog
     * @param which
     */

    @Override
    public void onClick(DialogInterface dialogInterface, int which) {
// 4.listener react for each action
        if (which==dialogInterface.BUTTON_POSITIVE)
        {
            Toast.makeText(getApplicationContext(), "long out", Toast.LENGTH_SHORT).show();
            dialogInterface.cancel();
        finish();//to close current activity
        }
        if (which==dialogInterface.BUTTON_NEGATIVE)
        {
            Toast.makeText(getApplicationContext(), "long out canceled", Toast.LENGTH_SHORT).show();
            dialogInterface.cancel();
        }

    }
}