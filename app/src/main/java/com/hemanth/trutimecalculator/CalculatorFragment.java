package com.hemanth.trutimecalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by hemanth on 11/09/16.
 */
public class CalculatorFragment extends Fragment {

    public CalculatorFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);

        String[] list_date = {"MON","TUE","WED","THU","FRI"};

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), R.layout.list_item_date, R.id.list_item_date_textview, list_date);

        ListView listView_date = (ListView) rootView.findViewById(R.id.listView_date);
        listView_date.setAdapter(adapter);

        return rootView;
    }
}
