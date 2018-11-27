package com.cutic.eugen.helloandroid.week_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cutic.eugen.helloandroid.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerViewContacts;
    private List<Contact> mContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mRecyclerViewContacts = (RecyclerView)findViewById(R.id.recyclerview_contacts);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this );
        mRecyclerViewContacts.setLayoutManager(layoutManager);

        mContacts = getContacts();

        ContactsAdapter contactsAdapter = new ContactsAdapter(mContacts);

        mRecyclerViewContacts.setAdapter(contactsAdapter);
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Ion", "Ioneascu") );
        contacts.add(new Contact("Android", "Cupcake") );
        contacts.add(new Contact("Android", "Donut") );
        contacts.add(new Contact("Android", "Pie") );
        contacts.add(new Contact("Ioana", "Ioneascu") );
        contacts.add(new Contact("John", "Doe") );
        contacts.add(new Contact("John1", "Doe1") );
        contacts.add(new Contact("John2", "Doe2") );
        contacts.add(new Contact("John3", "Doe3") );
        contacts.add(new Contact("John4", "Doe4") );

        return contacts;
    }
}
