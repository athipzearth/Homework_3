package com.example.homework_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.homework_3.model.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        RecyclerView rv = findViewById(R.id.word_lis_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    WordItem[] item = {
            new WordItem(R.drawable.i1,"Solid Gold OVO x Air Jordans","$2 Million"),
            new WordItem(R.drawable.i2,"Michael Jordan’s Game Worn","$190,373"),
            new WordItem(R.drawable.i3,"Buscemi 100 MM Diamond","$132,000"),
            new WordItem(R.drawable.i4,"Air Jordan 12 (Flu Game)","$104,000"),
            new WordItem(R.drawable.i5,"Air Jordan 12 OVO","$100,000"),
            new WordItem(R.drawable.i6,"Diamond Encrusted Air Force 1","$50,000"),
            new WordItem(R.drawable.i7,"Air Jordan 11 ‘Jeter’","$40,000"),
            new WordItem(R.drawable.i8,"Air Jordan 2 OG","$31,000"),
            new WordItem(R.drawable.i9,"Eminem x Carhartt Air Jordan 4","$30,000"),
            new WordItem(R.drawable.i10,"DJ Khaled x Air Jordan 3 ‘Grateful’","$25,000")
    };
    public MyAdapter() {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_word, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(item[position].imageResId);
        holder.wordTextView.setText(item[position].word);
        holder.wordTextView2.setText(item[position].word2);
    }

    @Override
    public int getItemCount() {
        return item.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView wordTextView;
        TextView wordTextView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.word_text_view);
            wordTextView2 = itemView.findViewById(R.id.word_text_view2);
        }
    }
}