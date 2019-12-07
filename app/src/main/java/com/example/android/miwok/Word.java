package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mSoundResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int mSoundResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiworkTranslation = miwokTranslation;
        this.mSoundResourceId = mSoundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mSoundResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiworkTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mSoundResourceId = mSoundResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getmSoundResourceId() { return mSoundResourceId; }

    public boolean hasImage() {
        if(mImageResourceId == NO_IMAGE_PROVIDED) {
            return false;
        }
        return true;
    }
}
