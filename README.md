# Augmented Reality barcode & QR code navigation for >= Android 4.0 #

### What is this repository for? ###

* Uses the real time camera image to analyze it for barcodes. Main feature is a navigation to a goal barcode - arrows into the right direction are shown depending on a barcode matrix. The Features include automatically taking of photos when a barcode is recognized. Audio guidance is possible too .
* Version 1.0

### How do I get set up? ###
* IDE: Android Studio 1.5.1
* Dependencies: ZXing (Zebra Crossing) library for barcode detection (automatically included by Gradle)
* Navigation configuration: Barcode navigation matrix is located in com.michaeltroger.qrbarcodenavi.tools.BarcodeNavigation.java
* Navigation usage: the barcode matrix is a 2D array including the values of the barcodes to detect in the wished 2D order the navigation should accour. The destination barcode can be defined in the CameraPreviewView. 
* Images location: res/drawable | Sounds location: res/raw
* Automatically taking of photos: Flag in CameraPreviewView



### Who do I talk to? ###

* Repo owner and developer: michael.troger@student.pxl.be
