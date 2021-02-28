package com.example.deardiary;

public class Task {

    private String description;
    private boolean isChecked;
    private boolean isEdit;

    public Task() {
        this.description = "";
        setChecked(false);
        setEdit(true);
    }

    public Task(String description) {
        this.description = description;
        setChecked(false);
        setEdit(true);
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isEdit() {
        return isEdit;
    }

    public void setEdit(boolean edit) {
        isEdit = edit;
    }
}
