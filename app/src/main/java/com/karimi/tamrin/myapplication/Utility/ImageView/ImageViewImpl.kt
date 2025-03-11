package com.karimi.tamrin.myapplication.Utility.ImageView

class ImageViewImpl :ImageSetup {
    override fun loadImageView(imageView: MyImageView, imageAddress: String) {
        if (imageView is MyImageView){
            imageView.setImageURI(imageAddress)
        }

    }
}