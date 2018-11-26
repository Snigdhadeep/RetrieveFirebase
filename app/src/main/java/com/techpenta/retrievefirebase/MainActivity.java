package com.techpenta.retrievefirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

FirebaseDatabase firebaseDatabase;
DatabaseReference reference;
RecyclerView recyclerView;
    FirebaseRecyclerAdapter<Model,ViewHolder> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recy);
       // recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        firebaseDatabase = FirebaseDatabase.getInstance();
        reference = firebaseDatabase.getReference("Students");

        Log.i("w12",reference.toString());

        adapter=new FirebaseRecyclerAdapter<Model, ViewHolder>(
                Model.class,
                R.layout.itemlayout,
                ViewHolder.class,
                reference

        ) {
            @Override
            protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {

            //    viewHolder.setDetails(getApplicationContext(),model.getImage(),model.getPhone());
                Glide.with(getApplicationContext())
                        .load(model.image)
                        .into(viewHolder.imgview);
                viewHolder.txtview.setText(model.phone);

            }
        };
        recyclerView.setAdapter(adapter);
    }
    }


