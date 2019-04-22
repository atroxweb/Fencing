package ca.pufferfish.fencing;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MapsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        startService(new Intent(this,AddLocationService.class));
    }

    public void addGeofencesButtonHandler(View view)
    {
        TextView text = findViewById(R.id.add_geofences_button);
        text.setText("Add");

    }
    public void removeGeofencesButtonHandler(View view)
    {
        TextView text = findViewById(R.id.remove_geofences_button);
        text.setText("Remove");

    }
}