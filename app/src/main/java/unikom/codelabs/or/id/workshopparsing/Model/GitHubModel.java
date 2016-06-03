package unikom.codelabs.or.id.workshopparsing.Model;

/**
 * Created by cahyantosetyabudi on 6/3/16.
 */
public class GitHubModel {
    private int id;
    private String name;
    private String full_name;

    public GitHubModel(int id, String name, String full_name) {
        this.id = id;
        this.name = name;
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
