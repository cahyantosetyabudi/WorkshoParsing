package unikom.codelabs.or.id.workshopparsing.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import unikom.codelabs.or.id.workshopparsing.Model.GitHubModel;
import unikom.codelabs.or.id.workshopparsing.R;

/**
 * Created by cahyantosetyabudi on 6/3/16.
 */
public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.ViewHolder>{
    private List<GitHubModel> githubList;

    public GithubAdapter(List<GitHubModel> githubList){
        this.githubList = githubList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_item_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        GitHubModel github = githubList.get(position);
        holder.txtId.setText(String.valueOf(github.getId()));
        holder.txtName.setText(github.getName());
        holder.txtFullName.setText(github.getFull_name());
    }

    @Override
    public int getItemCount() {
        return githubList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtId;
        public TextView txtName;
        public TextView txtFullName;

        public ViewHolder(View itemView){
            super(itemView);
            txtId = (TextView)itemView.findViewById(R.id.main_txt_id);
            txtName = (TextView)itemView.findViewById(R.id.main_txt_name);
            txtFullName = (TextView)itemView.findViewById(R.id.main_txt_fullname);
        }
    }
}
