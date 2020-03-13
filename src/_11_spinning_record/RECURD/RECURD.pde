import ddf.minim.*;   
PImage pictureOfRecord;                       
int angle =  5;
Minim minim;        //as a member variable
  AudioPlayer song;  
void setup() {
  size(600, 600);                                 //in setup method
  pictureOfRecord= loadImage("record.png");      //in setup method
  pictureOfRecord.resize(height, width);
minim = new Minim(this);    //in the setup method
  song = minim.loadFile("66897__mikemunkie__bossanova.wav", 512);   //in the setup method
}
void draw() {
  background(255,255,255);
  
  if (mousePressed) {

    rotateImage(pictureOfRecord, angle);
  song.play();
 angle =  angle+5;
}

  image(pictureOfRecord, 0, 0);  //in draw method
  song.pause();
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
