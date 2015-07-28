package com.example.banukumara.hack27july;

/**
 * Created by Banukumar A on 28-07-2015.
 */
public class datablase_of_files  {

    private String _name;
    private String _content;

    public datablase_of_files() {   //empty constructor
    }

    public datablase_of_files(String content) {
        this._content = content;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public String get_name() {
        return _name;
    }

    public String get_content() {
        return _content;
    }
}
