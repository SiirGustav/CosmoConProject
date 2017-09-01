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
public class Dia3Fragment extends Fragment {


    public Dia3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Es lo que se retorna al final al crear el código, pero necesitamos usar el objeto antes de retornarlo
        View vista = inflater.inflate(R.layout.fragment_dia3, container, false);
        String[] stringEventosD3S1 = {"10:10 Bienvenida", "11:00 Presentando al Alets", "12:00 Presentando al Gustav","1:00 Cazuela","2:00 Algo"};
        ListView listaEventosD3S1 = (ListView) vista.findViewById(R.id.ListaSala1);
        //Adapta :v el string a objetos independientes que se pueden mostrar en una lista
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, stringEventosD3S1);
        listaEventosD3S1.setAdapter(listViewAdapter);
        return vista;
    }

}
