package com.sagas.actions;

import com.google.common.base.Preconditions;
import org.apache.commons.io.IOUtils;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class TestResources {
    public static void main(String[] args) throws IOException {
        /*
        // InputStream is=TestResources.class.getClassLoader().getResourceAsStream("/actions.yml");
        InputStream is=Thread.currentThread().getContextClassLoader().getResourceAsStream("actions.yml");
        // Preconditions.checkNotNull(is);
        // URL url = TestResources.class.getClassLoader().getResource("actions.yml");
        // InputStream strm = url.openStream();
        String cnt=IOUtils.toString(is, Charset.defaultCharset());
        System.out.println(cnt);
        */
        String cnt=IOUtils.toString(new FileReader("conf/actions.yml"));
        System.out.println(cnt);
    }
}
