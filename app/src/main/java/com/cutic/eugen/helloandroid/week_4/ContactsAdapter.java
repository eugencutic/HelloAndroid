package com.cutic.eugen.helloandroid.week_4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cutic.eugen.helloandroid.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    private List<Contact> mContacts;

    public ContactsAdapter(List<Contact> mContacts) {
        this.mContacts = mContacts;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.contact_item, viewGroup, false);
        return new ContactsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        Contact currentContact = mContacts.get(i);
        contactsViewHolder.mTextViewFirstName.setText(currentContact.getFirstName());
        contactsViewHolder.mTextViewLastName.setText(currentContact.getLastName());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
