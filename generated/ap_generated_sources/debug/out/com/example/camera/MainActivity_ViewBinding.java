// Generated code from Butter Knife. Do not modify!
package com.example.camera;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f080057;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_camera, "field 'btn_camera' and method 'onCaptureImageClick'");
    target.btn_camera = Utils.castView(view, R.id.btn_camera, "field 'btn_camera'", ImageView.class);
    view7f080057 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCaptureImageClick();
      }
    });
    target.img_preview = Utils.findRequiredViewAsType(source, R.id.img_preview, "field 'img_preview'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_camera = null;
    target.img_preview = null;

    view7f080057.setOnClickListener(null);
    view7f080057 = null;
  }
}
