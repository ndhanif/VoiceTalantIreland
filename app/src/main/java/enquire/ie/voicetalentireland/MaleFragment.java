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


public class MaleFragment extends Fragment {

    public MaleFragment() {
        // Required empty public constructor
    }

    Button bPlay;

    MediaPlayer song1, song2, song3, song4, song5, song6;

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

        song1 = MediaPlayer.create(getActivity(), R.raw.barryb);
        song2 = MediaPlayer.create(getActivity(), R.raw.anthnoyb);
        song3 = MediaPlayer.create(getActivity(), R.raw.jhonb);
        song4 = MediaPlayer.create(getActivity(), R.raw.ed);
        song5 = MediaPlayer.create(getActivity(), R.raw.jason);
        song6 = MediaPlayer.create(getActivity(), R.raw.paddy);


        final ItemData itemsData[] = {
                new ItemData("Barry Barnes ", R.drawable.boy, "Native Wexford Actor, rich tone, fluent Irish speaker"),
                new ItemData("Anthony Brophy", R.drawable.boy, "Native Dublin, Anthony has been living in the states for the last few years, but is now back in Ireland and eager to work"),
                new ItemData("John Burke ", R.drawable.boy, "Native Dublin, a very natural read…….."),
                new ItemData("Ed Cosgrave", R.drawable.boy, "Ed is from Navan in County Meath…."),
                new ItemData("Jason Crook ", R.drawable.boy, "Native young Dubliner, enthusiastic & a fresh talent"),
                new ItemData("Paddy Dean", R.drawable.boy, "Friendly neutral voice, actor and sometimes clown…")};


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
                new RecyclerItemClickListener(this.getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
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


                        } else if (position == 5) {

                            if (bPlay.getText().toString().equals("PLAY")) {

                                bPlay.setText("PAUSE");
                                song6.start();
                            } else {
                                bPlay.setText("PLAY");
                                song6.pause();
                            }



                        }


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

