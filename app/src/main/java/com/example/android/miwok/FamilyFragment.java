/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.family_father, R.string.miwok_family_father,
                R.drawable.family_father, R.raw.family_father));
        words.add(new Word(R.string.family_mother, R.string.miwok_family_mother,
                R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word(R.string.family_son, R.string.miwok_family_son,
                R.drawable.family_son, R.raw.family_son));
        words.add(new Word(R.string.family_daughter, R.string.miwok_family_daughter,
                R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word(R.string.family_older_brother, R.string.miwok_family_older_brother,
                R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word(R.string.family_younger_brother, R.string.miwok_family_younger_brother,
                R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word(R.string.family_older_sister, R.string.miwok_family_older_sister,
                R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word(R.string.family_younger_sister, R.string.miwok_family_younger_sister,
                R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word(R.string.family_grandmother, R.string.miwok_family_grandmother,
                R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word(R.string.family_grandfather, R.string.miwok_family_grandfather,
                R.drawable.family_grandfather, R.raw.family_grandfather));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }


    }
