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
public class Dia1Fragment extends Fragment {


    public Dia1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Es lo que se reotrna al final al crear el código, pero necesitamos usar el objeto antes de retornarlo
        View vista = inflater.inflate(R.layout.fragment_dia1, container, false);
        String[] stringEventosD1S1 = {"10:10 Bienvenida", "11:00 Presentando a Cosmo", "12:00 Presentando a Wanda","1:00 Cocktail","2:00 Algo"};
        ListView listaEventosD1S1 = (ListView) vista.findViewById(R.id.ListaSala1);
        //Adapta :v el string a objetos independientes que se pueden mostrar en una lista
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, stringEventosD1S1);
        listaEventosD1S1.setAdapter(listViewAdapter);
        return vista;
    }

}
