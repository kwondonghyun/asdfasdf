package com.example.com.list;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

        import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    ArrayList<Data> items = new ArrayList<>();
    Context mContext;

    public CustomAdapter(ArrayList<Data> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item1, null);
        TextView bgTitle = view.findViewById(R.id.big_title);
        TextView smTitle = view.findViewById(R.id.small_title);

        Data data = items.get(position);
        bgTitle.setText(data.getBigTitle());
        smTitle.setText(data.getSmallTitle());
        return view;
    }
}
