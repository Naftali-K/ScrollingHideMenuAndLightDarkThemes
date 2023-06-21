package com.example.scrollinghidemenuandlightdarkthemes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.scrollinghidemenuandlightdarkthemes.fragments.ListFragment;
import com.example.scrollinghidemenuandlightdarkthemes.fragments.TextFragment;

/**
 *  * Without tool bar set in the AndroidManifest.xml
 */
public class CollapsingTollBarWithFragmentsActivity extends AppCompatActivity {

    private ConstraintLayout listConstraintLayout, textConstraintLayout;
    private ImageView listImageView, textImageView;
    private View listUnderLineView, textUnderLineView;
    private int fragmentContainer;

    private int category = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toll_bar_with_fragments);
        setReferences();
        setSelectedCategory(category);

        listConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSelectedCategory(0);
            }
        });
        textConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSelectedCategory(1);
            }
        });

    }

    private void setReferences() {
        listConstraintLayout = findViewById(R.id.list_constraint_layout);
        listImageView = findViewById(R.id.list_image_view);
        listUnderLineView = findViewById(R.id.list_under_line_view);

        textConstraintLayout = findViewById(R.id.text_constraint_layout);
        textImageView = findViewById(R.id.text_image_view);
        textUnderLineView = findViewById(R.id.text_under_line_view);

        fragmentContainer = R.id.fragment_container;
    }

    private void fragmentReplace(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(fragmentContainer, fragment).commit();
    }

    private void setSelectedCategory(int category) {
        deactivateCategory();
        this.category = category;

        if (category == 0) {
            listImageView.setAlpha(1.0F);
            listUnderLineView.setAlpha(1.0F);
            fragmentReplace(new ListFragment());
        }
        if (category == 1) {
            textImageView.setAlpha(1.0F);
            textUnderLineView.setAlpha(1.0F);
            fragmentReplace(new TextFragment());
        }
    }

    private void deactivateCategory() {
        if (category == 0) {
            listImageView.setAlpha(0.6F);
            listUnderLineView.setAlpha(0.3F);
        }
        if (category == 1) {
            textImageView.setAlpha(0.6F);
            textUnderLineView.setAlpha(0.3F);
        }
    }
}