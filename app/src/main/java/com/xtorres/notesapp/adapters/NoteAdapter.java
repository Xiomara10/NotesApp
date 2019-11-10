package com.xtorres.notesapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xtorres.notesapp.R;
import com.xtorres.notesapp.models.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private List<Note> notes;

    public NoteAdapter(){
        this.notes = new ArrayList<>();
    }

    public void setNotes(List<Note> notes){
        this.notes = notes;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView titleText;
        public TextView descriptionText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.text_title);
            descriptionText = itemView.findViewById(R.id.text_description);

        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Note note = this.notes.get(position);
        viewHolder.titleText.setText(note.getTitle());
        viewHolder.descriptionText.setText(note.getDescription());
    }

    @Override
    public int getItemCount() {
        return this.notes.size();
    }
}
