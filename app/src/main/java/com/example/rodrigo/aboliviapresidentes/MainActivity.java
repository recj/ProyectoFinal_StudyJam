package com.example.rodrigo.aboliviapresidentes;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Adapter.onAplicacionSelectedListener, InformacionFragment.OnFragmentInteractionListener {

    SoundPool mp;
    int good;

    RecyclerView aplicacionRecyclerView;
    Adapter aplicacionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp=new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        good= mp.load(this,R.raw.sound_bt,1);

        //principio

        aplicacionRecyclerView= (RecyclerView)findViewById(R.id.recyclerMain);
        aplicacionRecyclerView.setHasFixedSize(true);
        aplicacionRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        aplicacionAdapter= new Adapter(this,this);

        llenarDatos ();

        aplicacionRecyclerView.setAdapter(aplicacionAdapter);

        //fin

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#714330"));


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void llenarDatos() {
        List<presidente> lista = new ArrayList<>();
        lista.add(new presidente(R.drawable.simon_bolivar, "1º Presidente de Bolivia\n"+"Simón Bolívar\n" +"(1783 - 1830)", getString(R.string.Descripcion_SimonBolivar)));
        lista.add(new presidente(R.drawable.pre2, "2º Presidente de Bolivia\n" +
                "Antonio José de Sucre y Alcala\n"
                + " (1795 - 1830)", getString(R.string.Descripcion_Pres2)));
        lista.add(new presidente(R.drawable.pre3, "3º Presidente de Bolivia\n" +
                "José María Pérez de Urdininea\n" +
                " (1784 - 1865)", getString(R.string.Descripcion_Pres3)));
        lista.add(new presidente(R.drawable.pre4, "4º Presidente de Bolivia\n" +
                "José Miguel de Velasco Franco\n" +
                " (1795 - 1859)", getString(R.string.Descripcion_Pres4)));
        lista.add(new presidente(R.drawable.pre5, "5º Presidente de Bolivia\n" +
                "Pedro Blanco Soto\n" +
                " (1795 - 1829)", getString(R.string.Descripcion_Pres5)));
        lista.add(new presidente(R.drawable.pre7, "6º Presidente de Bolivia\n" +
                "Andrés de Santa Cruz y Calahumana\n" +
                " (1792 - 1865)", getString(R.string.Descripcion_Pres6)));
        lista.add(new presidente(R.drawable.pre9, "7º Presidente de Bolivia\n" +
                "Sebastián Ágreda\n" +
                " (1795 - 1875)", getString(R.string.Descripcion_Pres7)));
        lista.add(new presidente(R.drawable.pre10, "8º Presidente de Bolivia\n" +
                "Mariano Enrique Calvo\n" +
                " (1782 - 1842)", getString(R.string.Descripcion_Pres8)));
        lista.add(new presidente(R.drawable.pre11, "9º Presidente de Bolivia\n" +
                "José Ballivián y Segurola\n" +
                " (1805 - 1852)", getString(R.string.Descripcion_Pres9)));
        lista.add(new presidente(R.drawable.pre12, "10º Presidente de Bolivia\n" +
                "Eusebio Guilarte Vera\n" +
                " (1805 - 1849)", getString(R.string.Descripcion_Pres10)));
        lista.add(new presidente(R.drawable.pre14, "11º Presidente de Bolivia\n" +
                "Manuel Isidoro Belzu Humerez\n" +
                " (1808 - 1865)", getString(R.string.Descripcion_Pres11)));
        lista.add(new presidente(R.drawable.pre15, "12º Presidente de Bolivia\n" +
                "Jorge Córdova\n" +
                " (1822 - 1861)", getString(R.string.Descripcion_Pres12)));
        lista.add(new presidente(R.drawable.pre16, "13º Presidente de Bolivia\n" +
                "José María Linares Lizarazu\n" +
                " (1808 - 1861)", getString(R.string.Descripcion_Pres13)));
        lista.add(new presidente(R.drawable.pre18, "14º Presidente de Bolivia\n" +
                "José María de Achá Valiente", getString(R.string.Descripcion_Pres14)));
        lista.add(new presidente(R.drawable.pre19, "15º Presidente de Bolivia\n" +
                "Mariano Melgarejo Valencia\n" +
                " (1820 - 1871)", getString(R.string.Descripcion_Pres15)));
        lista.add(new presidente(R.drawable.pre20, "16º Presidente de Bolivia\n" +
                "Agustín Morales Hernández\n" +
                " (1808 - 1872)", getString(R.string.Descripcion_Pres16)));
        lista.add(new presidente(R.drawable.pre21, "17º Presidente de Bolivia\n" +
                "Tomás Frías Ametller\n" +
                " (1804 - 1884)", getString(R.string.Descripcion_Pres17)));
        lista.add(new presidente(R.drawable.pre22, "18º Presidente de Bolivia\n" +
                "Adolfo Ballivián Coll\n" +
                " (1831 - 1874)", getString(R.string.Descripcion_Pres18)));
        lista.add(new presidente(R.drawable.pre24, "19º Presidente de Bolivia\n" +
                "Hilarión Daza Groselle\n" +
                " (1840 - 1894)", getString(R.string.Descripcion_Pres19)));
        lista.add(new presidente(R.drawable.pre26, "20º Presidente de Bolivia\n" +
                "Narciso Campero Leyes\n" +
                " (1813 - 1896)", getString(R.string.Descripcion_Pres20)));
        lista.add(new presidente(R.drawable.pre27, "21º Presidente de Bolivia\n" +
                "Gregorio Pacheco Leyes\n" +
                " (1823 - 1899)  ", getString(R.string.Descripcion_Pres21)));
        lista.add(new presidente(R.drawable.pre28, "22º Presidente de Bolivia\n" +
                "Aniceto Arce Ruiz\n" +
                " (1824 - 1906)", getString(R.string.Descripcion_Pres22)));
        lista.add(new presidente(R.drawable.pre29, "23º Presidente de Bolivia\n" +
                "Mariano Baptista Caserta\n" +
                " (1832 - 1907)", getString(R.string.Descripcion_Pres23)));
        lista.add(new presidente(R.drawable.pre20, "24º Presidente de Bolivia\n" +
                "Severo Fernández Alonso Caballero\n" +
                " (1849 - 1925)", getString(R.string.Descripcion_Pres24)));
        lista.add(new presidente(R.drawable.pre32, "25º Presidente de Bolivia\n" +
                "José Manuel Pando Solares\n" +
                " (1848 - 1917)", getString(R.string.Descripcion_Pres25)));
        lista.add(new presidente(R.drawable.pre33, "26º Presidente de Bolivia\n" +
                "Ismael Montes Gamboa\n" +
                " (1861 - 1933)", getString(R.string.Descripcion_Pres26)));
        lista.add(new presidente(R.drawable.pre34, "27º Presidente de Bolivia\n" +
                "Eliodoro Villazón Montaño\n"+
                "(1848 - 1939)", getString(R.string.Descripcion_Pres27)));
        lista.add(new presidente(R.drawable.pre36, "28º Presidente de Bolivia\n" +
                "José Gutiérrez Guerra\n" +
                " (1869 - 1929)", getString(R.string.Descripcion_Pres28)));
        lista.add(new presidente(R.drawable.pre38, "29º Presidente de Bolivia\n" +
                "Bautista Saavedra Mallea\n" +
                " (1870 - 1939)", getString(R.string.Descripcion_Pres29)));
        lista.add(new presidente(R.drawable.pre39, "30º Presidente de Bolivia\n" +
                "Felipe Segundo Guzmán\n" +
                " (1879 - 1932)", getString(R.string.Descripcion_Pres30)));
        lista.add(new presidente(R.drawable.pre40, "31º Presidente de Bolivia\n" +
                "Hernando Siles Reyes\n" +
                " (1882 - 1942)", getString(R.string.Descripcion_Pres31)));
        lista.add(new presidente(R.drawable.pre42, "32º Presidente de Bolivia\n" +
                "Carlos Blanco Galindo\n" +
                " (1882 - 1943)", getString(R.string.Descripcion_Pres32)));
        lista.add(new presidente(R.drawable.pre43, "33º Presidente de Bolivia\n" +
                "Daniel Salamanca Urey\n" +
                " (1868 - 1935)", getString(R.string.Descripcion_Pres33)));
        lista.add(new presidente(R.drawable.pre44, "34º Presidente de Bolivia\n" +
                "José Luis Tejada Sorzano\n" +
                " (1882 - 1938)", getString(R.string.Descripcion_Pres34)));
        lista.add(new presidente(R.drawable.pre45, "35º Presidente de Bolivia\n" +
                "José David Toro Ruilova\n" +
                " (1898 - 1977)", getString(R.string.Descripcion_Pres35)));
        lista.add(new presidente(R.drawable.pre46, "36º Presidente de Bolivia\n" +
                "Germán Busch Becerra\n" +
                " (1904 - 1939)", getString(R.string.Descripcion_Pres36)));
        lista.add(new presidente(R.drawable.pre47, "37º Presidente de Bolivia\n" +
                "Carlos Quintanilla Quiroga\n" +
                " (1888 - 1964)  ", getString(R.string.Descripcion_Pres37)));
        lista.add(new presidente(R.drawable.pre48, "38º Presidente de Bolivia\n" +
                "Enrique Peñaranda Castillo\n" +
                " (1892 - 1969)", getString(R.string.Descripcion_Pres38)));
        lista.add(new presidente(R.drawable.pre49, "39º Presidente de Bolivia\n" +
                "Gualberto Villarroel López\n" +
                " (1908 - 1946)", getString(R.string.Descripcion_Pres39)));
        lista.add(new presidente(R.drawable.pre50, "40º Presidente de Bolivia\n" +
                "Néstor Guillén Olmos\n" +
                " (1890 - 1966)", getString(R.string.Descripcion_Pres40)));
        lista.add(new presidente(R.drawable.pre51, "41º Presidente de Bolivia\n" +
                "Tomás Monje Gutiérrez\n" +
                " (1884 - 1959)", getString(R.string.Descripcion_Pres41)));
        lista.add(new presidente(R.drawable.pre52, "42º Presidente de Bolivia\n" +
                "Enrique Hertzog Garaizabal\n" +
                " (1897 - 1981)", getString(R.string.Descripcion_Pres42)));
        lista.add(new presidente(R.drawable.pre53, "43º Presidente de Bolivia\n" +
                "Mamerto Urriolagoitia Harriague\n" +
                " (1895 - 1974 )", getString(R.string.Descripcion_Pres43)));
        lista.add(new presidente(R.drawable.pre54, "44º Presidente de Bolivia\n" +
                "Hugo Ballivián Rojas\n" +
                " (1901 - 1996) ", getString(R.string.Descripcion_Pres44)));
        lista.add(new presidente(R.drawable.pre55, "45º Presidente de Bolivia\n" +
                "Víctor Paz Estenssoro\n" +
                " (1907 - 2001)  ", getString(R.string.Descripcion_Pres45)));
        lista.add(new presidente(R.drawable.pre56, "46º Presidente de Bolivia\n" +
                "Hernán Siles Zuazo\n" +
                " (1913 - 1996)", getString(R.string.Descripcion_Pres46)));
        lista.add(new presidente(R.drawable.pre59, "47º Presidente de Bolivia \n" +
                " René Barrientos Ortuño \n" +
                " (1919 - 1969)", getString(R.string.Descripcion_Pres47)));
        lista.add(new presidente(R.drawable.pre61, "48º Presidente de Bolivia\n" +
                "Alfredo Ovando Candía\n" +
                " (1918 - 1982)", getString(R.string.Descripcion_Pres48)));
        lista.add(new presidente(R.drawable.pre63, "49º Presidente de Bolivia\n" +
                "Luis Adolfo Siles Salinas\n" +
                " (1925 - 2005 )", getString(R.string.Descripcion_Pres49)));
        lista.add(new presidente(R.drawable.pre65, "50º Presidente de Bolivia\n" +
                "Juan José Torres González\n" +
                " (1921 - 1976 )", getString(R.string.Descripcion_Pres50)));
        lista.add(new presidente(R.drawable.pre66, "51º Presidente de Bolivia\n" +
                "Hugo Banzer Suárez\n" +
                " (1926 - 2002 )", getString(R.string.Descripcion_Pres51)));
        lista.add(new presidente(R.drawable.pre67, "52º Presidente de Bolivia\n" +
                "Juan Pereda Asbún\n" +
                " (1931 - 2012 )", getString(R.string.Descripcion_Pres52)));
        lista.add(new presidente(R.drawable.pre68, "53º Presidente de Bolivia\n" +
                "David Padilla Arancibia\n" +
                " (1927 - 2016)   ", getString(R.string.Descripcion_Pres53)));
        lista.add(new presidente(R.drawable.pre69, "54º Presidente de Bolivia\n" +
                "Walter Guevara Arze\n" +
                " (1912 - 1996 )", getString(R.string.Descripcion_Pres54)));
        lista.add(new presidente(R.drawable.pre70, "55º Presidente de Bolivia\n" +
                "Alberto Natusch Busch\n" +
                " (1933 - 1994 ) ", getString(R.string.Descripcion_Pres55)));
        lista.add(new presidente(R.drawable.pre71, "56º Presidente de Bolivia\n" +
                "Lidia Gueiler Tejada\n" +
                " (1921 - 2011 )", getString(R.string.Descripcion_Pres56)));
        lista.add(new presidente(R.drawable.pre72, "57º Presidente de Bolivia\n" +
                "Luis García Meza Tejada\n" +
                " (1929)  ", getString(R.string.Descripcion_Pres57)));
        lista.add(new presidente(R.drawable.pre74, "58º Presidente de Bolivia\n" +
                "Celso Torrelio Villa\n" +
                " (1933 - 1999)  ", getString(R.string.Descripcion_Pres58)));
        lista.add(new presidente(R.drawable.pre76, "59º Presidente de Bolivia\n" +
                "Guido Vildoso Calderón\n" +
                " (1937)", getString(R.string.Descripcion_Pres59)));
        lista.add(new presidente(R.drawable.pre79, "60º Presidente de Bolivia\n" +
                "Jaime Paz Zamora\n" +
                " (1939)", getString(R.string.Descripcion_Pres60)));
        lista.add(new presidente(R.drawable.pre80, "61º Presidente de Bolivia\n" +
                "Gonzalo Sánchez de Lozada\n" +
                " (1930)", getString(R.string.Descripcion_Pres61)));
        lista.add(new presidente(R.drawable.pre82, "62º Presidente de Bolivia\n" +
                "Jorge Quiroga Ramírez\n" +
                " (1960)  ", getString(R.string.Descripcion_Pres62)));
        lista.add(new presidente(R.drawable.pre84, "63º Presidente de Bolivia\n" +
                "Carlos D. Mesa Gisbert\n" +
                " (1953)", getString(R.string.Descripcion_Pres63)));
        lista.add(new presidente(R.drawable.pre85, "64º Presidente de Bolivia\n" +
                "Eduardo Rodríguez Veltzé\n" +
                " (1956)", getString(R.string.Descripcion_Pres64)));
        lista.add(new presidente(R.drawable.pre86, "65º Presidente de Bolivia\n" +
                "Evo Morales Ayma\n" +
                " (1959)", getString(R.string.Descripcion_Pres65)));

        aplicacionAdapter.setDataset(lista);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment =null;
        Boolean FragmentoSeleccionado=false;

        if (id == R.id.nav_home) {
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
            mp.play(good,1,1,0,0,1);

            startActivity(intent);
            finish();
                // Handle the camera action
        } else if (id == R.id.nav_consulta) {
            Intent intent=new Intent(MainActivity.this,ConsultaWeb.class);
            mp.play(good,1,1,0,0,1);
            startActivity(intent);

            //finish();

        } else if (id == R.id.nav_bolivia) {
            Intent intent = new Intent(MainActivity.this, Bolivia.class);
            mp.play(good, 1, 1, 0, 0, 1);
            startActivity(intent);
        }else if (id == R.id.nav_informacion) {
            fragment =new InformacionFragment();
            FragmentoSeleccionado = true;
            mp.play(good,1,1,0,0,1);
        }

        if (FragmentoSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.Contenedor,fragment).commit();

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onAplicacionSelected(presidente aplicacion) {
        Intent intent = new Intent(getApplicationContext(),Detalle.class);
        intent.putExtra("equipo", aplicacion);
        startActivity(intent);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
