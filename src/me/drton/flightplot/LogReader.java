package me.drton.flightplot;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 * User: ton Date: 03.06.13 Time: 17:45
 */
public interface LogReader {
    void close() throws IOException;

    boolean seek(long time) throws IOException;

    long readUpdate(Map<String, Object> update) throws IOException;

    Collection<String> getFields();
}