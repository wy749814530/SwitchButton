# SwitchButton
自定义SwutchButton控件

### 布局方式
```java
<com.wyu.switchbtn.SwitchButton
   android:id="@+id/switch_button"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:layout_marginTop="10dp" />

<com.wyu.switchbtn.SwitchButton
   android:id="@+id/switch_button_1"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:layout_marginTop="10dp"
   android:checked="true" />


<com.wyu.switchbtn.SwitchButton
   android:id="@+id/switch_button_2"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:layout_marginTop="10dp"
   android:checked="true"
   app:sb_show_indicator="false" />

<com.wyu.switchbtn.SwitchButton
   android:id="@+id/switch_button_3"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:layout_marginTop="10dp"
   android:checked="true"
   app:sb_checked_background_color="#fdc951" />

<com.wyu.switchbtn.SwitchButton
   android:id="@+id/switch_button_4"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:layout_marginTop="10dp"
   android:background="#FFF"
   app:sb_button_color="#db99c7"
   app:sb_checked_background_color="#a5dc88"
   app:sb_checked_button_color="#FF0080"
   app:sb_checked_line_color="#FFFFFF"
   app:sb_checked_line_width="1dp"
   app:sb_shadow_color="#A36F95"
   app:sb_uncheck_button_color="#fdc951"
   app:sb_uncheck_circle_color="#FF0080"
   app:sb_uncheck_circle_radius="3dp"
   app:sb_uncheck_circle_width="2dp" />

<com.wyu.switchbtn.SwitchButton
   android:id="@+id/switch_button_5"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:layout_marginTop="10dp"
   app:sb_enable_effect="true" />
       
 ```

```java
switchButton5.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(SwitchButton view, boolean isChecked) {
           Log.i(TAG, (isChecked?:"开启":"关闭"))
      }
});
```

### 开关设置方式
```java
   switchButton.setChecked(select);
   switchButton1.setChecked(select);
```

### styleable可设置项
```java
<declare-styleable name="SwitchButton">
    
   <attr name="android:checked" />
   <attr name="android:background" />
        
   <attr name="sb_shadow_radius" format="reference|dimension" />
   <attr name="sb_shadow_offset" format="reference|dimension" />
   <attr name="sb_shadow_color" format="reference|color" />
   <attr name="sb_uncheck_color" format="reference|color" />
   <attr name="sb_checked_background_color" format="reference|color" />

   <attr name="sb_border_width" format="reference|dimension" />
   <attr name="sb_checked_line_color" format="reference|color" />
   <attr name="sb_checked_line_width" format="reference|dimension" />
   <attr name="sb_checked_button_color" format="reference|color" />
   <attr name="sb_uncheck_button_color" format="reference|color" />
   <attr name="sb_uncheck_circle_color" format="reference|color" />
   <attr name="sb_uncheck_circle_width" format="reference|dimension" />
   <attr name="sb_uncheck_circle_radius" format="reference|dimension" />

   <attr name="sb_shadow_effect" format="reference|boolean" />
   <attr name="sb_effect_duration" format="reference|integer" />
   <attr name="sb_button_color" format="reference|color" />
   <attr name="sb_show_indicator" format="reference|boolean" />
   <attr name="sb_enable_effect" format="reference|boolean" />

</declare-styleable>
```
