package cl.roothigh.primerintento;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class BlankFragment extends Fragment {

    Button play, pause, stop;

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle saveInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_blank,container, false);

        play = (Button) rootView.findViewById(R.id.playBtn);
        pause= (Button) rootView.findViewById(R.id.puseBtn);


        final MediaPlayer sound = MediaPlayer.create(getActivity(),R.raw.candestinoprueba);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.setLooping(false);
                sound.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sound.isPlaying()){
                    sound.pause();
                }
            }
        });

        return rootView;
    }

}