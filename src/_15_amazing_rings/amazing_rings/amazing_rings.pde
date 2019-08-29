void setup() {
  size(1200,600);
 background(#E5BCDC);
 noFill();
}
int size = 300;
int count = 0;
int x1 = 300;
int x2 = 900;
int speed = 5;
void draw(){
   background(#E5BCDC);
  for(int size = 300; size>=10; size-= 5){
    ellipse(x1, 300, size, size);
  ellipse(x2, 300, size, size);
  }
  
    x1+=speed;
    x2-=speed;
   
   
   if(x1>=1050||x1<=150){
speed=-speed;
}

  }
  
