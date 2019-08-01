void setup() {
  size(1200,600);
 background(#E5BCDC);
}
int size = 300;
int count = 0;
int x1 = 300;
int x2 = 900;
int speed = 5;
void draw(){
 
  if(count % 2 == 0){
  fill(#BCBCBC);
}
else {
  noFill();
  }
  //frame rate increase
  ellipse(x1, 300, size, size);
   ellipse(x2, 300, size, size);
  if(size>10){
    size -= 5;
  }
  else{
    size=300;
    x1+=speed;
    x2-=speed;
    background(#E5BCDC);
  }
   

  
  

count++;

  
  
}
