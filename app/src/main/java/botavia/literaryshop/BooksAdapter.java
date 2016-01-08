package botavia.literaryshop;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class BooksAdapter extends BaseExpandableListAdapter {

    private Context content;
    private HashMap<String,List<String>> BookesCategory;
    private List<String> BookesList;

    public BooksAdapter (Context content,HashMap<String,List<String>> BookesCategory, List<String> BookesList)
    {
        this.content=content;
        this.BookesCategory=BookesCategory;
        this.BookesList=BookesList;
    }


    @Override
    // number of subtitle in each list
    public int getChildrenCount(int arg0) {
        return BookesCategory.get(BookesList.get(arg0)).size();
    }

    @Override
    //number of available group
    public Object getGroup(int arg0) {
        return BookesList.get(arg0);
    }

    @Override
    public int getGroupCount() {
        return BookesList.size();
    }

    @Override
    public Object getChild(int parent, int child) {

        return BookesCategory.get(BookesList.get(parent)).get(child);//obgect
    }

    @Override
    public long getGroupId(int arg0) {
        return arg0;
    }

    @Override
    public long getChildId(int parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentView) {
        String group_title = (String) getGroup(parent);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//define the converView
            convertView = inflater.inflate(R.layout.parent, parentView, false); //make the convertview
        }
            TextView parent_textview = (TextView) convertView.findViewById(R.id.parent_txt);
            parent_textview.setTypeface(null, Typeface.BOLD);
            parent_textview.setText(group_title);

        return convertView;
    }

    @Override
    //return a view from each sub category
    public View getChildView(int parent, int child, boolean LastChild, View convertView, ViewGroup parentView) {
        String child_view = (String) getChild(parent,child);
        //creat a convert view
        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child,parentView,false); //make the convertview
        }
        TextView child_textview = (TextView) convertView.findViewById(R.id.child_txt);
        child_textview.setText(child_view);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
