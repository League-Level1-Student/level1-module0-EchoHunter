void setup(){
      size(900, 900);
    background(25, 25, 60);
}


void draw(){
int x = (int)random(900);
int y = (int) random(900);
 makeMagical();
 if(mousePressed){
  for(int p = 0; p<50;p++){
  fill(frameCount,25,25);
    ellipse(getWormY(y),getWormX(x),10,10);
  
  }
 }
}
 float frequency = .004;
    float noiseInterval = 4;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
