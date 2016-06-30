package enquire.ie.voicetalentireland;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by barryoreilly on 31/3/16.
 */
public class YoungsterFragment extends Fragment {

    MediaPlayer song1, song2, song3, song4, song5, song6;
    Button bPlay;
    public YoungsterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView2);

        song1 =  MediaPlayer.create(getActivity(), R.raw.luke);
        song2 =  MediaPlayer.create(getActivity(), R.raw.cormac);
        song3 =  MediaPlayer.create(getActivity(), R.raw.jessica);
        song4 =  MediaPlayer.create(getActivity(), R.raw.ebha);
        song5 =  MediaPlayer.create(getActivity(), R.raw.mich);
        song6 =  MediaPlayer.create(getActivity(), R.raw.marc);

        final ItemData itemsData[] = {
                new ItemData("Luke Kilmurray ",R.drawable.yong,"Born 2008"),
                new ItemData("Cormac Melia",R.drawable.yong,"Born 2007"),
                new ItemData("Jessica Benwell ",R.drawable.yong,"Born 2007"),
                new ItemData("Eabha Deely",R.drawable.yong,"Born 2007"),
                new ItemData("Michael Larkin ",R.drawable.yong,"Born 2006"),
                new ItemData("Marcus Geraghty",R.drawable.yong,"")};


//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // 3. create an adapter
        MyAdapter mAdapter = new MyAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this.getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                         bPlay = (Button) view.findViewById(R.id.button);
                        // do whatever

                        if (position == 0) {
                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song1.start();
                            } else {
                                bPlay.setText("PLAY");
                                song1.pause();
                            }


                        } else if (position == 1) {

                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song2.start();
                            } else {
                                bPlay.setText("PLAY");
                                song2.pause();
                            }


                        } else if (position == 2) {

                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song3.start();
                            } else {
                                bPlay.setText("PLAY");
                                song3.pause();
                            }


                        } else if (position == 3) {

                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song4.start();
                            } else {
                                bPlay.setText("PLAY");
                                song4.pause();
                            }


                        } else if (position == 4) {

                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song5.start();
                            } else {
                                bPlay.setText("PLAY");
                                song5.pause();
                            }


                        }

                        else if (position == 5) {

                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song6.start();
                            } else {
                                bPlay.setText("PLAY");
                                song6.pause();
                            }


                        }




                    }

                    @Override
                    public void onItemLongClick(View view, int position) {

                    }
                })
        );


        return view;
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        // Make sure that we are currently visible
        if (this.isVisible()) {
            // If we are becoming invisible, then...
            if (!isVisibleToUser) {
                if (song1.isPlaying())
                {
                    song1.pause();
                    bPlay.setText("PLAY");
                }
                if (song2.isPlaying())
                {
                    song2.pause();
                    bPlay.setText("PLAY");
                }
                if (song3.isPlaying())
                {
                    song3.pause();
                    bPlay.setText("PLAY");
                }
                if (song4.isPlaying())
                {
                    song4.pause();
                    bPlay.setText("PLAY");
                }
                if (song5.isPlaying())
                {
                    song5.pause();
                    bPlay.setText("PLAY");
                }
                if (song6.isPlaying())
                {
                    song6.pause();
                    bPlay.setText("PLAY");
                }
            }

            else {
                //do what you want to do

            }
        }
    }
    @Override
    public void onStop() {
        super.onStop();

        if (song1.isPlaying())
        {
            song1.stop();
        }
        if (song2.isPlaying())
        {
            song2.stop();
        }
        if (song3.isPlaying())
        {
            song3.stop();
        }
        if (song4.isPlaying())
        {
            song4.stop();
        }
        if (song5.isPlaying())
        {
            song5.stop();
        }
        if (song6.isPlaying())
        {
            song6.stop();
        }


    }



}

