package rusdianto.heru.simplequiz;

import rusdianto.heru.simplequiz.R;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Soal5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal5);
        
        // tombol jawab
        Button jawab = (Button) findViewById(R.id.jawab);
        
        // tombol jawab diklik
        jawab.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// radio group
				RadioGroup opsi = (RadioGroup) findViewById(R.id.opsi);
				
				// radio yang dicek
				int id = opsi.getCheckedRadioButtonId();
				
				// dialog
				AlertDialog.Builder dialog = new AlertDialog.Builder(Soal5.this);
				dialog.setCancelable(false);
				
				// tidak ada radio yang dicek
				if (id == -1) {
					// pesan error
					dialog.setTitle("Error");
					dialog.setMessage("Jawaban harus diisi.");
					dialog.setPositiveButton("OK", null);
					dialog.show();

				// ada radio yang dicek
				} else {
					// benar
					if (id == R.id.opsi1) {						
						// penjelasan
						dialog.setTitle("Benar");
						dialog.setMessage("Jawaban anda benar semua.");
						dialog.setPositiveButton("Selesai", null);
						dialog.show();
						
					// salah
					} else {
						// pesan salah
						dialog.setTitle("Salah");
						dialog.setMessage("Jawaban anda salah.");
						dialog.setPositiveButton("Sip", null);
						dialog.show();
					}
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
}
