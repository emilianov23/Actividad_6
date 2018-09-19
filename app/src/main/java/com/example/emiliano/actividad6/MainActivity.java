package com.example.emiliano.actividad6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.ViewGroup;
import android.transition.TransitionManager;
import android.transition.Transition;

public class MainActivity extends AppCompatActivity {
    Scene mAScene;
    Scene mAnotherScene;
    ViewGroup mSceneRoot;
    Transition transitionMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);



        mAScene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, context: this);
        mAnotherScene = Scene.getSceneForLayout(mSceneRoot, R.layout.another_scene, context: this);
        transitionMgr = TransitionInflater.from(this),inflateTransition(R.transition.fade_transition);
    }

    public void goToScene2 (View view){
        TransitionManager.got(mAScene, transitionMgr);
    }

    public void goToScene1 (View view) {
        TransitionManager.got(mAScene, transitionMgr);
    }
}
