package enquire.ie.voicetalentireland;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FemaleFragment extends Fragment {

    Fragment fragment;
    Button button;
    MediaPlayer song1, song2, song3, song4;
    Button bPlay;
    String songpath;
    public FemaleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        song1 =  MediaPlayer.create(getActivity(), R.raw.amelia);
        song2 =  MediaPlayer.create(getActivity(), R.raw.rose_handerson);
        song3 =  MediaPlayer.create(getActivity(), R.raw.unakava);
        song4 =  MediaPlayer.create(getActivity(), R.raw.jennifer);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView1);
        registerForContextMenu(recyclerView);


        final ItemData itemsData[] = {
//                new ItemData("Pom Boyd",R.drawable.girl,"Neutral warm tone, perfect for financial or food products…"),
//                new ItemData("Ali Coffey",R.drawable.girl,"A native Dubliner with a lovely warm voice."),
                new ItemData("Amelia Crowley  ", R.drawable.girl, "Experienced & versatile,from smooth & silky to…"),
                new ItemData("Rose Henderson ", R.drawable.girl, "An energetic, youthful voice with lots of experience."),
                new ItemData("Una Kavanagh ", R.drawable.girl, "Native Cork, Cara is new to voice-overs but behaves like she has been doing them for years, a natural."),
                new ItemData("Jennifer Maguire ", R.drawable.girl, "Native Dubliner, lovely sincere voice.")};


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
                            if (bPlay.getText().toString().equals("PLAY")){

                                bPlay.setText("PAUSE");
                                song1.start();
                            }else{
                                bPlay.setText("PLAY");
                                song1.pause();
                            }


                        } else if (position == 1) {

                            if (bPlay.getText().toString().equals("PLAY")){

                                bPlay.setText("PAUSE");
                                song2.start();
                            }else{
                                bPlay.setText("PLAY");
                                song2.pause();
                            }



                        } else if (position == 2) {

                            if (bPlay.getText().toString().equals("PLAY")){

                                bPlay.setText("PAUSE");
                                song3.start();
                            }else{
                                bPlay.setText("PLAY");
                                song3.pause();
                            }


                        } else if (position == 3) {

                            if (bPlay.getText().toString().equals("PLAY")){

                                bPlay.setText("PAUSE");
                                song4.start();
                            }else{
                                bPlay.setText("PLAY");
                                song4.pause();
                            }



                        }


                    }

                    @Override
                    public void onItemLongClick(View view, int position) {
                        Log.i("app", "onItemLongClick position = " + position);


                        if(position==0)
                        {



                            String sharePath = Environment.getExternalStorageDirectory().getPath() + R.raw.amelia;
                            Uri uri = Uri.parse(sharePath);
                            Intent share = new Intent(Intent.ACTION_SEND);
                            share.setType("audio/*");
                            share.putExtra(Intent.EXTRA_STREAM, uri);
                            startActivity(Intent.createChooser(share, "Share Sound File"));






                        }
                    }
                })

        );







        return view;
    }


    //stop audio when activity is change
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

    }
}
