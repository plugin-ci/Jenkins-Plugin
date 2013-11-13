/*
 * The MIT License
 *
 * Copyright 2013 Goblom.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.pluginci.jenkins_plugin;

import hudson.model.UnprotectedRootAction;
import java.util.Random;
/**
 *
 * @author Goblom
 */
public class Crunching implements UnprotectedRootAction {
    private final Random random = new Random();
    
    public String getQuote() {
        return MESSAGES[random.nextInt(MESSAGES.length)];
    }
    
    public String getImage() {
        return IMAGES[random.nextInt(IMAGES.length)];
    }
    
    public String getIconFileName() {
        return "/plugin/PluginCI/icon.png";
    }
    
    public String getDisplayName() {
        return "Crunching Data";
    }
    
    public String getUrlName() {
        return "crunching";
    }
    
    private final String[] MESSAGES = {
        "Compiling Plugins",
        "Crunching Data",
        "Breaking Bukkit",
        "How Do I Compile",
        "Bucket*"
    };
    
    private final String[] IMAGES = {
        "lava_bucket.gif",
        "water_bucket.gif",
        "loading_screen"
    };
}
