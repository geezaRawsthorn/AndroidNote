package com.example.guyrawsthorn.samplebook;

import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewActivity extends ListActivity {

    SimpleCursorAdapter dataAdapter;
    public databaseHelper dbHelper;
    //private ListView dataList;
    ArrayList<String> databaseList = new ArrayList<String>();
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        //databaseHelper db = new databaseHelper(this);

        //istView = (ListView) findViewById(R.id.list);
        DisplayList();


    }
//
//    public void newMethod(){
//        List<Note> values = dbHelper.getAllNotes();
//        ArrayAdapter<Note> adapter = new ArrayAdapter<Note>(this, android.R.layout.simple_list_item_1,values);
//        setListAdapter(adapter);
//    }
//
//    public void cursorMethod(){
//        // Find ListView to populate
//        //Cursor cursor = db.getAllTitles();
//        Cursor cursor = dbHelper.getAllTitles();
//        ListView lvItems = (ListView) findViewById(R.id.list);
//// Setup cursor adapter using cursor from last step
//
//        TodoCursorAdapter todoAdapter = new TodoCursorAdapter(this, cursor);
//// Attach cursor adapter to the ListView
//        lvItems.setAdapter(todoAdapter);
//    }


    public void DisplayList() {

        databaseHelper dbHelper = new databaseHelper(this);
        Cursor cursor = dbHelper.getAllTitles();

        String[] from = new String[]{
                dbHelper.KEY_TITLE,
                dbHelper.KEY_BODY};


        int[] to = new int[]{
                R.id.lvTitle,
                R.id.lvBody
        };

        dataAdapter = new SimpleCursorAdapter(this, R.layout.activity_note, cursor, from, to, 0);


        ListView listView = getListView();
        listView.setAdapter(dataAdapter);
    }
}
//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                deleteItem();
//            }
//        });

//    public void deleteItem() {
//
//        dbHelper.deleteNote();
//
//
//
//    }

//      public void ArrayListView(){

 //       ArrayList<String> list = dbHelper.getAllTitles();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_note, list);
//        list_view = (ListView) findViewById(R.id.list);
//        list_view.setAdapter( adapter );





//         ArrayAdapter<Note> listAdapter ;
//        listAdapter = new ArrayAdapter<Note>(this, R.layout.activity_view, list);
//        list_view.setAdapter( listAdapter );


        //populateListView();



//    private void populateListView(){
//
//        Cursor cursor = dbHelper.fetchAllNotes();
//
//        String[] from = new String [] {
//                dbHelper.KEY_TITLE,
//                dbHelper.KEY_BODY};
//
////      define the xml views
//
//        int [] to = new int[]{
//                R.id.lvTitle,
//                R.id.lvBody
//        };
//        SimpleCursorAdapter dataAdapter;
//        dataAdapter = new SimpleCursorAdapter(
//                getBaseContext(), R.layout.activity_view, cursor, from, to, 0
//        );
//        list_view = (ListView) findViewById(R.id.list);
//        list_view.setAdapter(dataAdapter);
//
//    }

