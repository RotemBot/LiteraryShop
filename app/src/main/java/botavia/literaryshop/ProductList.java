package botavia.literaryshop;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.datasource.DatabaseList;

public class ProductList extends AppCompatActivity {

    HashMap<String,List<String>> BooksCategory;
    List<String> BooksList;
    ExpandableListView ExpList;
    BooksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        ExpList = (ExpandableListView) findViewById(R.id.exp_list);
        BooksCategory = DatabaseList.getData();//call to hashMap
        BooksList = new ArrayList<String>(BooksCategory.keySet()); // get the key of the bookes
        adapter = new BooksAdapter(this,BooksCategory,BooksList);
        ExpList.setAdapter(adapter);


        };
    }


