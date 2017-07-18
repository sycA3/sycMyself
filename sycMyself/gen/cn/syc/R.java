/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package cn.syc;

public final class R {
    public static final class anim {
        public static final int dialog_enter_anim=0x7f040000;
        public static final int dialog_exit_anim=0x7f040001;
        public static final int dialog_loading_animation=0x7f040002;
        public static final int popup_enter=0x7f040003;
        public static final int popup_exit=0x7f040004;
        public static final int slide_in_from_bottom=0x7f040005;
        public static final int slide_in_from_top=0x7f040006;
        public static final int slide_out_to_bottom=0x7f040007;
        public static final int slide_out_to_top=0x7f040008;
    }
    public static final class attr {
        /**  BELOW HERE ARE DEPRECEATED. DO NOT USE. 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int ptrAdapterViewBackground=0x7f010010;
        /**  Style of Animation should be used displayed when pulling. 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>rotate</code></td><td>0x0</td><td></td></tr>
<tr><td><code>flip</code></td><td>0x1</td><td></td></tr>
</table>
         */
        public static final int ptrAnimationStyle=0x7f01000c;
        /**  Drawable to use as Loading Indicator. Changes both Header and Footer. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrDrawable=0x7f010006;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrDrawableBottom=0x7f010012;
        /**  Drawable to use as Loading Indicator in the Footer View. Overrides value set in ptrDrawable. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrDrawableEnd=0x7f010008;
        /**  Drawable to use as Loading Indicator in the Header View. Overrides value set in ptrDrawable. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrDrawableStart=0x7f010007;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrDrawableTop=0x7f010011;
        /**  A drawable to use as the background of the Header and Footer Loading Views 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int ptrHeaderBackground=0x7f010001;
        /**  Text Color of the Header and Footer Loading Views Sub Header 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int ptrHeaderSubTextColor=0x7f010003;
        /**  Base text color, typeface, size, and style for Header and Footer Loading Views 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrHeaderTextAppearance=0x7f01000a;
        /**  Text Color of the Header and Footer Loading Views 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int ptrHeaderTextColor=0x7f010002;
        /** 
        	Whether PullToRefreshListView has it's extras enabled. This allows the user to be 
        	able to scroll while refreshing, and behaves better. It acheives this by adding
        	Header and/or Footer Views to the ListView.
        
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static final int ptrListViewExtrasEnabled=0x7f01000e;
        /**  Mode of Pull-to-Refresh that should be used 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>disabled</code></td><td>0x0</td><td></td></tr>
<tr><td><code>pullFromStart</code></td><td>0x1</td><td></td></tr>
<tr><td><code>pullFromEnd</code></td><td>0x2</td><td></td></tr>
<tr><td><code>both</code></td><td>0x3</td><td></td></tr>
<tr><td><code>manualOnly</code></td><td>0x4</td><td></td></tr>
<tr><td><code>pullDownFromTop</code></td><td>0x1</td><td> These last two are depreacted </td></tr>
<tr><td><code>pullUpFromBottom</code></td><td>0x2</td><td></td></tr>
</table>
         */
        public static final int ptrMode=0x7f010004;
        /**  Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh. 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static final int ptrOverScroll=0x7f010009;
        /**  A drawable to use as the background of the Refreshable View 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int ptrRefreshableViewBackground=0x7f010000;
        /** 
        	Whether the Drawable should be continually rotated as you pull. This only
        	takes effect when using the 'Rotate' Animation Style.
        
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static final int ptrRotateDrawableWhilePulling=0x7f01000f;
        /**  Whether the user can scroll while the View is Refreshing 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static final int ptrScrollingWhileRefreshingEnabled=0x7f01000d;
        /**  Whether the Indicator overlay(s) should be used 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static final int ptrShowIndicator=0x7f010005;
        /**  Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int ptrSubHeaderTextAppearance=0x7f01000b;
    }
    public static final class color {
        public static final int bg_color=0x7f090003;
        public static final int black=0x7f090000;
        public static final int contents_text=0x7f090004;
        public static final int darkgreen=0x7f090002;
        public static final int encode_view=0x7f090005;
        public static final int green=0x7f090001;
        public static final int grgray=0x7f09001d;
        public static final int header=0x7f09001c;
        public static final int help_button_view=0x7f090006;
        public static final int help_view=0x7f090007;
        public static final int possible_result_points=0x7f090008;
        public static final int result_image_border=0x7f090009;
        public static final int result_minor_text=0x7f09000a;
        public static final int result_points=0x7f09000b;
        public static final int result_text=0x7f09000c;
        public static final int result_view=0x7f09000d;
        public static final int sbc_header_text=0x7f09000e;
        public static final int sbc_header_view=0x7f09000f;
        public static final int sbc_layout_view=0x7f090011;
        public static final int sbc_list_item=0x7f090010;
        public static final int sbc_page_number_text=0x7f090012;
        public static final int sbc_snippet_text=0x7f090013;
        public static final int share_text=0x7f090014;
        public static final int share_view=0x7f090015;
        public static final int status_text=0x7f090017;
        public static final int status_view=0x7f090016;
        public static final int transparent=0x7f090018;
        public static final int viewfinder_frame=0x7f090019;
        public static final int viewfinder_laser=0x7f09001a;
        public static final int viewfinder_mask=0x7f09001b;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Example customization of dimensions originally defined in res/values/dimens.xml
         (such as screen margins) for screens with more than 820dp of available width. This
         would include 7" and 10" devices in landscape (~960dp and ~1280dp respectively).
    
         */
        public static final int activity_horizontal_margin=0x7f050005;
        public static final int activity_vertical_margin=0x7f050006;
        public static final int header_footer_left_right_padding=0x7f050003;
        public static final int header_footer_top_bottom_padding=0x7f050004;
        public static final int indicator_corner_radius=0x7f050001;
        public static final int indicator_internal_padding=0x7f050002;
        public static final int indicator_right_padding=0x7f050000;
    }
    public static final class drawable {
        public static final int default_ptr_flip=0x7f020000;
        public static final int default_ptr_rotate=0x7f020001;
        public static final int ic_launcher=0x7f020002;
        public static final int indicator_arrow=0x7f020003;
        public static final int indicator_bg_bottom=0x7f020004;
        public static final int indicator_bg_top=0x7f020005;
        public static final int syc_dialog_bg=0x7f020006;
        public static final int syc_loading=0x7f020007;
    }
    public static final class id {
        public static final int action_gallery=0x7f060021;
        public static final int action_selectpic=0x7f060023;
        public static final int action_settings=0x7f060022;
        public static final int both=0x7f060003;
        public static final int btn_pop_album=0x7f060013;
        public static final int btn_pop_camera=0x7f060014;
        public static final int btn_pop_cancel=0x7f060015;
        public static final int clock=0x7f06000f;
        public static final int dialog_imgview=0x7f06000d;
        public static final int dialog_view=0x7f06001e;
        public static final int disabled=0x7f060004;
        public static final int fl_inner=0x7f060019;
        public static final int flip=0x7f06000a;
        public static final int gridview=0x7f060000;
        public static final int image=0x7f060011;
        public static final int img=0x7f06001f;
        public static final int manualOnly=0x7f060005;
        public static final int progressText=0x7f060017;
        public static final int progress_horizontal=0x7f060018;
        public static final int pullDownFromTop=0x7f060006;
        public static final int pullFromEnd=0x7f060007;
        public static final int pullFromStart=0x7f060008;
        public static final int pullUpFromBottom=0x7f060009;
        public static final int pull_refresh_grid=0x7f06000c;
        public static final int pull_to_refresh_image=0x7f06001a;
        public static final int pull_to_refresh_progress=0x7f06001b;
        public static final int pull_to_refresh_sub_text=0x7f06001d;
        public static final int pull_to_refresh_text=0x7f06001c;
        public static final int root=0x7f060010;
        public static final int rotate=0x7f06000b;
        public static final int scrollview=0x7f060002;
        public static final int selpic=0x7f060016;
        public static final int tipTextView=0x7f060020;
        public static final int title=0x7f060012;
        public static final int tx=0x7f06000e;
        public static final int webview=0x7f060001;
    }
    public static final class layout {
        public static final int activity_list_grid_pic=0x7f030000;
        public static final int activity_list_grid_pic_dialog=0x7f030001;
        public static final int activity_main=0x7f030002;
        public static final int grid_item=0x7f030003;
        public static final int popupwindow_camera_need=0x7f030004;
        public static final int popupwindow_pic=0x7f030005;
        public static final int pull_to_refresh_header_horizontal=0x7f030006;
        public static final int pull_to_refresh_header_vertical=0x7f030007;
        public static final int syc_dialog_loading=0x7f030008;
    }
    public static final class menu {
        public static final int list_grid_pic_menu=0x7f0a0000;
        public static final int main=0x7f0a0001;
    }
    public static final class string {
        public static final int ListGrid=0x7f07000a;
        public static final int action_gallery=0x7f07000b;
        public static final int action_selectpic=0x7f070009;
        public static final int action_settings=0x7f070008;
        public static final int app_name=0x7f070006;
        /**  Just use standard Pull Down String when pulling up. These can be set for languages which require it 
 Just use standard Pull Down String when pulling up. These can be set for languages which require it 
         */
        public static final int pull_to_refresh_from_bottom_pull_label=0x7f070003;
        public static final int pull_to_refresh_from_bottom_refreshing_label=0x7f070005;
        public static final int pull_to_refresh_from_bottom_release_label=0x7f070004;
        public static final int pull_to_refresh_pull_label=0x7f070000;
        public static final int pull_to_refresh_refreshing_label=0x7f070002;
        public static final int pull_to_refresh_release_label=0x7f070001;
        public static final int title=0x7f070007;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f080001;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f080002;
        public static final int PopupAnimation=0x7f080000;
        public static final int syc_Dialog_style=0x7f080003;
        /** 模糊
         */
        public static final int syc_transparent=0x7f080004;
    }
    public static final class styleable {
        /** Attributes that can be used with a PullToRefresh.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PullToRefresh_ptrAdapterViewBackground cn.syc:ptrAdapterViewBackground}</code></td><td> BELOW HERE ARE DEPRECEATED.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrAnimationStyle cn.syc:ptrAnimationStyle}</code></td><td> Style of Animation should be used displayed when pulling.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawable cn.syc:ptrDrawable}</code></td><td> Drawable to use as Loading Indicator.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableBottom cn.syc:ptrDrawableBottom}</code></td><td></td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableEnd cn.syc:ptrDrawableEnd}</code></td><td> Drawable to use as Loading Indicator in the Footer View.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableStart cn.syc:ptrDrawableStart}</code></td><td> Drawable to use as Loading Indicator in the Header View.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableTop cn.syc:ptrDrawableTop}</code></td><td></td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderBackground cn.syc:ptrHeaderBackground}</code></td><td> A drawable to use as the background of the Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderSubTextColor cn.syc:ptrHeaderSubTextColor}</code></td><td> Text Color of the Header and Footer Loading Views Sub Header </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderTextAppearance cn.syc:ptrHeaderTextAppearance}</code></td><td> Base text color, typeface, size, and style for Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderTextColor cn.syc:ptrHeaderTextColor}</code></td><td> Text Color of the Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrListViewExtrasEnabled cn.syc:ptrListViewExtrasEnabled}</code></td><td>
        	Whether PullToRefreshListView has it's extras enabled.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrMode cn.syc:ptrMode}</code></td><td> Mode of Pull-to-Refresh that should be used </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrOverScroll cn.syc:ptrOverScroll}</code></td><td> Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrRefreshableViewBackground cn.syc:ptrRefreshableViewBackground}</code></td><td> A drawable to use as the background of the Refreshable View </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrRotateDrawableWhilePulling cn.syc:ptrRotateDrawableWhilePulling}</code></td><td>
        	Whether the Drawable should be continually rotated as you pull.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrScrollingWhileRefreshingEnabled cn.syc:ptrScrollingWhileRefreshingEnabled}</code></td><td> Whether the user can scroll while the View is Refreshing </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrShowIndicator cn.syc:ptrShowIndicator}</code></td><td> Whether the Indicator overlay(s) should be used </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrSubHeaderTextAppearance cn.syc:ptrSubHeaderTextAppearance}</code></td><td> Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header </td></tr>
           </table>
           @see #PullToRefresh_ptrAdapterViewBackground
           @see #PullToRefresh_ptrAnimationStyle
           @see #PullToRefresh_ptrDrawable
           @see #PullToRefresh_ptrDrawableBottom
           @see #PullToRefresh_ptrDrawableEnd
           @see #PullToRefresh_ptrDrawableStart
           @see #PullToRefresh_ptrDrawableTop
           @see #PullToRefresh_ptrHeaderBackground
           @see #PullToRefresh_ptrHeaderSubTextColor
           @see #PullToRefresh_ptrHeaderTextAppearance
           @see #PullToRefresh_ptrHeaderTextColor
           @see #PullToRefresh_ptrListViewExtrasEnabled
           @see #PullToRefresh_ptrMode
           @see #PullToRefresh_ptrOverScroll
           @see #PullToRefresh_ptrRefreshableViewBackground
           @see #PullToRefresh_ptrRotateDrawableWhilePulling
           @see #PullToRefresh_ptrScrollingWhileRefreshingEnabled
           @see #PullToRefresh_ptrShowIndicator
           @see #PullToRefresh_ptrSubHeaderTextAppearance
         */
        public static final int[] PullToRefresh = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006, 0x7f010007,
            0x7f010008, 0x7f010009, 0x7f01000a, 0x7f01000b,
            0x7f01000c, 0x7f01000d, 0x7f01000e, 0x7f01000f,
            0x7f010010, 0x7f010011, 0x7f010012
        };
        /**
          <p>
          @attr description
           BELOW HERE ARE DEPRECEATED. DO NOT USE. 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrAdapterViewBackground
        */
        public static final int PullToRefresh_ptrAdapterViewBackground = 16;
        /**
          <p>
          @attr description
           Style of Animation should be used displayed when pulling. 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>rotate</code></td><td>0x0</td><td></td></tr>
<tr><td><code>flip</code></td><td>0x1</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name cn.syc:ptrAnimationStyle
        */
        public static final int PullToRefresh_ptrAnimationStyle = 12;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator. Changes both Header and Footer. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrDrawable
        */
        public static final int PullToRefresh_ptrDrawable = 6;
        /**
          <p>This symbol is the offset where the {@link cn.syc.R.attr#ptrDrawableBottom}
          attribute's value can be found in the {@link #PullToRefresh} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name cn.syc:ptrDrawableBottom
        */
        public static final int PullToRefresh_ptrDrawableBottom = 18;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator in the Footer View. Overrides value set in ptrDrawable. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrDrawableEnd
        */
        public static final int PullToRefresh_ptrDrawableEnd = 8;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator in the Header View. Overrides value set in ptrDrawable. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrDrawableStart
        */
        public static final int PullToRefresh_ptrDrawableStart = 7;
        /**
          <p>This symbol is the offset where the {@link cn.syc.R.attr#ptrDrawableTop}
          attribute's value can be found in the {@link #PullToRefresh} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name cn.syc:ptrDrawableTop
        */
        public static final int PullToRefresh_ptrDrawableTop = 17;
        /**
          <p>
          @attr description
           A drawable to use as the background of the Header and Footer Loading Views 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrHeaderBackground
        */
        public static final int PullToRefresh_ptrHeaderBackground = 1;
        /**
          <p>
          @attr description
           Text Color of the Header and Footer Loading Views Sub Header 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrHeaderSubTextColor
        */
        public static final int PullToRefresh_ptrHeaderSubTextColor = 3;
        /**
          <p>
          @attr description
           Base text color, typeface, size, and style for Header and Footer Loading Views 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrHeaderTextAppearance
        */
        public static final int PullToRefresh_ptrHeaderTextAppearance = 10;
        /**
          <p>
          @attr description
           Text Color of the Header and Footer Loading Views 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrHeaderTextColor
        */
        public static final int PullToRefresh_ptrHeaderTextColor = 2;
        /**
          <p>
          @attr description
          
        	Whether PullToRefreshListView has it's extras enabled. This allows the user to be 
        	able to scroll while refreshing, and behaves better. It acheives this by adding
        	Header and/or Footer Views to the ListView.
        


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrListViewExtrasEnabled
        */
        public static final int PullToRefresh_ptrListViewExtrasEnabled = 14;
        /**
          <p>
          @attr description
           Mode of Pull-to-Refresh that should be used 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>disabled</code></td><td>0x0</td><td></td></tr>
<tr><td><code>pullFromStart</code></td><td>0x1</td><td></td></tr>
<tr><td><code>pullFromEnd</code></td><td>0x2</td><td></td></tr>
<tr><td><code>both</code></td><td>0x3</td><td></td></tr>
<tr><td><code>manualOnly</code></td><td>0x4</td><td></td></tr>
<tr><td><code>pullDownFromTop</code></td><td>0x1</td><td> These last two are depreacted </td></tr>
<tr><td><code>pullUpFromBottom</code></td><td>0x2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name cn.syc:ptrMode
        */
        public static final int PullToRefresh_ptrMode = 4;
        /**
          <p>
          @attr description
           Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh. 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrOverScroll
        */
        public static final int PullToRefresh_ptrOverScroll = 9;
        /**
          <p>
          @attr description
           A drawable to use as the background of the Refreshable View 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrRefreshableViewBackground
        */
        public static final int PullToRefresh_ptrRefreshableViewBackground = 0;
        /**
          <p>
          @attr description
          
        	Whether the Drawable should be continually rotated as you pull. This only
        	takes effect when using the 'Rotate' Animation Style.
        


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrRotateDrawableWhilePulling
        */
        public static final int PullToRefresh_ptrRotateDrawableWhilePulling = 15;
        /**
          <p>
          @attr description
           Whether the user can scroll while the View is Refreshing 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrScrollingWhileRefreshingEnabled
        */
        public static final int PullToRefresh_ptrScrollingWhileRefreshingEnabled = 13;
        /**
          <p>
          @attr description
           Whether the Indicator overlay(s) should be used 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrShowIndicator
        */
        public static final int PullToRefresh_ptrShowIndicator = 5;
        /**
          <p>
          @attr description
           Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name cn.syc:ptrSubHeaderTextAppearance
        */
        public static final int PullToRefresh_ptrSubHeaderTextAppearance = 11;
    };
}
