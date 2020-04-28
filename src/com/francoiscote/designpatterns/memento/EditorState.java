package com.francoiscote.designpatterns.memento;


/*
    Memento pattern: to implement undo mechanisms in our classes
*/

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
