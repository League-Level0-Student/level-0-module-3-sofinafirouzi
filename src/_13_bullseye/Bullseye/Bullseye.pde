void setup() {
  size(600,600);
  background(#E5BCDC);
}
int size = 300;
int count = 0;
void draw(){
  
  if(count % 2 == 0){
  fill(#BCDFE5);
}
else {
  fill(#FAF7BB);
  }
  
  ellipse(300, 300, size, size);
  if(size>50){
    size -= 40;
  }
  

count++;
  
  
}
