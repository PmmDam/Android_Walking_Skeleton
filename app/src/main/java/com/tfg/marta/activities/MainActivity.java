package com.tfg.marta.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.tfg.marta.R;
import com.tfg.marta.fragments.TrainingsFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Barra inferior de navegación
    private BottomNavigationView _navView;

    //Manager para manajera la navegación entre fragments
    private FragmentManager _fragmentManager;

    //Lista con todos los fragments de la aplicación
    private List<Fragment> _fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _fragmentManager = getSupportFragmentManager();

        //Añadimos los fragments de la aplicación a la lista
        _fragments.add(new TrainingsFragment());

        _navView = (BottomNavigationView) findViewById(R.id.nav_view);
        _navView.setOnItemSelectedListener(new BottomNavVie_OnItemSelectedListener());

        displayFragment(0);
    }

    private void displayFragment(int position) {

        //Obtenemos el fragment de la lista en función de la posición
        Fragment fragment = _fragments.get(position);

        //Para gestionar la transacción entre fragments necesitamos crear una instancia de la clase
        //FragmentTransacion en función del fragmentManager
        FragmentTransaction transaction = _fragmentManager.beginTransaction();

        //Sustituye el fragment del el container especificado como parámetro por otro fragment que también se le
        //pasa como parámetro
        transaction.replace(R.id.content_frame_main_activity, fragment);

        //Confirmamos los cambios y se ejecuta la transacción
        transaction.commit();

    }

    private class BottomNavVie_OnItemSelectedListener implements NavigationBarView.OnItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.navigation_home:
                    displayFragment(0);
                    break;
                case R.id.navigation_dashboard:
                    displayFragment(1);
                    break;
                case R.id.navigation_profile:
                    displayFragment(2);
                    break;

                    /*
                case R.id.menu_idioma:
                    displayFragment(3);
                    getSupportActionBar().setTitle("IDIOMA");
                    break;
                case R.id.menu_salir:
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                    break;*/
            }
            return true;
        }
    }
}