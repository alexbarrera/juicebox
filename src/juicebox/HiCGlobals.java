/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2011-2015 Broad Institute, Aiden Lab
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
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package juicebox;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Muhammad Shamim
 * @date 11/25/14
 */
public class HiCGlobals {

    // Changes Data Output Mode
    public static final boolean isRestricted = true;
    // Enable black border
    public static final boolean isBlackBorderActivated = false;
    // MainWindow variables
    public static final Color RULER_LINE_COLOR = new Color(0, 0, 230, 100);
    public static final int BIN_PIXEL_WIDTH = 1;
    // for plotting
    public static final String topChromosomeColor = "#0000FF";
    public static final String leftChromosomeColor = "#009900";
    public static final Color backgroundColor = new Color(204, 204, 204);
    public static final String stateFileName = "CurrentJuiceboxStates";
    public static final String xmlSavedStatesFileName = "JuiceboxStatesForExport.xml";
    // Feature2D hover text
    public static final boolean allowSpacingBetweenFeatureText = true;
    public static final ArrayList<String> savedStatesList = new ArrayList<String>();
    // min hic file version supported
    public static final int minVersion = 6;
    //public static final int bufferSize = 1048576;
    //public static final int bufferSize = 4194304;
    public static final int bufferSize = 2097152;
    // Base-pair resolutions
    public static final int[] bpBinSizes = {2500000, 1000000, 500000, 250000, 100000, 50000, 25000, 10000, 5000, 4000, 3000, 2000, 1000};
    public static final String[] bpBinSizeNames = {"2.5 MB", "1 MB", "500 KB", "250 KB", "100 KB", "50 KB", "25 KB",
            "10 KB", "5 KB", "4 KB", "3 KB", "2 KB", "1 KB"};
    // Fragment resolutions
    public static final int[] fragBinSizes = {500, 200, 100, 50, 20, 5, 2, 1};
    // Juicebox version (for display purposes only)
    private static final double versionNum = 1.4;
    // Juicebox title
    public static final String juiceboxTitle = "[Juicebox " + versionNum + "] Hi-C Map: ";
    // whether MatrixZoomData should cache or not
    public static boolean useCache = true;
    //public static final int bufferSize = 102400;
    public static boolean guiIsCurrentlyActive = false;
    public static boolean printVerboseComments = false;
    public static boolean slideshowEnabled = false;

    public static void verifySupportedHiCFileVersion(int version) throws RuntimeException {
        if (version < minVersion) {
            throw new RuntimeException("This file is version " + version +
                    ". Only versions 5 and greater are supported at this time.");
        }
    }

    public static List<Color> createNewPreDefMapColorGradient() {
        List<Color> colors = new ArrayList<Color>();
        colors.add(new Color(255, 242, 255));
        colors.add(new Color(255, 242, 255));
        colors.add(new Color(255, 230, 242));
        colors.add(new Color(255, 222, 230));
        colors.add(new Color(250, 218, 234));
        colors.add(new Color(255, 206, 226));
        colors.add(new Color(238, 198, 210));
        colors.add(new Color(222, 186, 182));
        colors.add(new Color(226, 174, 165));
        colors.add(new Color(214, 157, 145));
        colors.add(new Color(194, 141, 125));
        colors.add(new Color(218, 157, 121));
        colors.add(new Color(234, 182, 129));
        colors.add(new Color(242, 206, 133));
        colors.add(new Color(238, 222, 153));
        colors.add(new Color(242, 238, 161));
        colors.add(new Color(222, 238, 161));
        colors.add(new Color(202, 226, 149));
        colors.add(new Color(178, 214, 117));
        colors.add(new Color(149, 190, 113));
        colors.add(new Color(117, 170, 101));
        colors.add(new Color(113, 153, 89));
        colors.add(new Color(18, 129, 242));
        colors.add(new Color(255, 0, 0));
        colors.add(new Color(0, 0, 0));
        return colors;
    }

    public enum menuType {MAP, LOCATION, STATE}

}
