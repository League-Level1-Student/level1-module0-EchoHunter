int rand = (int)random(256);
int rand2 = (int)random(256);
int rand3 = (int)random(256);
int rand4 = (int)random(500);
int score = 0;
 int y = 0;
void setup(){
      size(500, 500);
}

void draw(){
  
  background(rand, rand2, rand3);
  rand = (int)random(256);
rand2 = (int)random(256);
 rand3 = (int)random(256);
 

    fill(0, 50, 255);
    stroke(0,0, 255);
    ellipse(rand4,y , 15, 15);
     rect(mouseX,  450, 50, 50);
     if(y==450){
     checkCatch(rand4);
     rand4=(int)random(500);
     y=0;
     }
   
     fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    
    y=y+5;
     
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+50)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    
  }
