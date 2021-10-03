// Generated by view binder compiler. Do not edit!
package com.appsnipp.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.appsnipp.education.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPagerCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardViewCourse;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView tvCantidadCursos;

  @NonNull
  public final TextView tvTitulo;

  private ItemPagerCardBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardViewCourse,
      @NonNull ImageView image, @NonNull TextView tvCantidadCursos, @NonNull TextView tvTitulo) {
    this.rootView = rootView;
    this.cardViewCourse = cardViewCourse;
    this.image = image;
    this.tvCantidadCursos = tvCantidadCursos;
    this.tvTitulo = tvTitulo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPagerCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPagerCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_pager_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPagerCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardViewCourse;
      CardView cardViewCourse = ViewBindings.findChildViewById(rootView, id);
      if (cardViewCourse == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.tv_cantidad_cursos;
      TextView tvCantidadCursos = ViewBindings.findChildViewById(rootView, id);
      if (tvCantidadCursos == null) {
        break missingId;
      }

      id = R.id.tv_titulo;
      TextView tvTitulo = ViewBindings.findChildViewById(rootView, id);
      if (tvTitulo == null) {
        break missingId;
      }

      return new ItemPagerCardBinding((ConstraintLayout) rootView, cardViewCourse, image,
          tvCantidadCursos, tvTitulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
