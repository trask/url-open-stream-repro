// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String root() throws IOException {
        URL url_name = new URL("http://whatismyip.akamai.com");
        BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
        return sc.readLine().trim();
    }
}
