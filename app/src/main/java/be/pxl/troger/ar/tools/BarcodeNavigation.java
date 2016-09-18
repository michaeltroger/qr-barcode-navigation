package be.pxl.troger.ar.tools;


import android.graphics.Point;

/**
 *  barcode navigation includes hardcoded barcode matrix used for navigation
 *
 *  @author Michael Troger
 */
public class BarcodeNavigation {
    /**
     * the barcode matrix used for navigation
     */
    private static final String barcodeMatrix[][] =
            {
                    {"belgium", "cafe", "cat", "computer", "day"},
                    {"dertest", "dog", "gestern", "grass", "hallowelt"},
                    {"heute", "keyboard", "moon", "nature", "news"},
                    {"night", "peace", "phone", "rat", "restaurant"},
                    {"school", "star", "today", "tv", "yesterday"}
            };
    /**
     * the target barcode
     */
    private String targetBarcode;
    /**
     * the coordinates of the target barcode
     */
    private Point coordinatesTargetBarcode;

    /**
     * called on creation of an object
     * @param targetBarcode the target barcode for this navigation
     */
    public BarcodeNavigation(String targetBarcode) {
        this.targetBarcode = targetBarcode;
        coordinatesTargetBarcode = getBarcodeCoordinates(targetBarcode);
    }

    /**
     * calculate the directions from the given barcode to the destination
     * @param currentBarcode the value of the current barcode
     * @return returns the direction as string (left/right/up/down) or null
     * if not found or if already at destination
     */
    public String getDirections(String currentBarcode) {
        Point coordinatesCurrentBarcode = getBarcodeCoordinates(currentBarcode);

        if (coordinatesCurrentBarcode != null) {
            if (coordinatesCurrentBarcode.x < coordinatesTargetBarcode.x) {
                return "right";
            }
            if (coordinatesCurrentBarcode.x > coordinatesTargetBarcode.x) {
                return "left";
            }
            if (coordinatesCurrentBarcode.y < coordinatesTargetBarcode.y) {
                return "down";
            }
            if (coordinatesCurrentBarcode.y > coordinatesTargetBarcode.y) {
                return "up";
            }
            if (coordinatesCurrentBarcode.y == coordinatesTargetBarcode.y &&
                coordinatesCurrentBarcode.x == coordinatesTargetBarcode.x   ) {
                return "goal";
            }
        }

        return null;
    }

    /**
     * get the target barcode
     * @return returns the target barcode
     */
    public String getTargetBarcode() {
        return targetBarcode;
    }

    /**
     * get the barcode coordinates for the barcode value given
     * @param barcodeValue  the value of the current barcode
     * @return returns the coordinates of the barcode or null if not found
     */
    private static Point getBarcodeCoordinates(String barcodeValue) {
        for (int i = 0; i < barcodeMatrix.length; i++) {
            for (int j = 0; j < barcodeMatrix[0].length; j++) {
                if (barcodeMatrix[i][j].equals(barcodeValue)) {
                    return new Point(j, i);
                }
            }
        }

        return null;
    }


}
