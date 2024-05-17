package pl.globallogic.exercises.ex48;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
