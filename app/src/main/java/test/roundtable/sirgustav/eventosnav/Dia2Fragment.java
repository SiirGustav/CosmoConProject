package test.roundtable.sirgustav.eventosnav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dia2Fragment extends Fragment {


    public Dia2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Es lo que se retorna al final al crear el código, pero necesitamos usar el objeto antes de retornarlo
        View vista = inflater.inflate(R.layout.fragment_dia2, container, false);
        String[] stringEventosD2S1 = {"10:10 Bienvenida", "11:00 Presentando a Timmy", "12:00 Dime lindura","1:00 Cocktail","2:00 Algo"};
        ListView listaEventosD2S1 = (ListView) vista.findViewById(R.id.ListaSala1);
        //Adapta :v el string a objetos independientes que se pueden mostrar en una lista
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, stringEventosD2S1);
        listaEventosD2S1.setAdapter(listViewAdapter);
        return vista;
    }

}
