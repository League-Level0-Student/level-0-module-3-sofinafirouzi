


for(int bottle = 99; bottle > 0; bottle --) {
  
  String lyrics =  bottle +" bottles of beer on the wall,"+ bottle +" bottles of beer. Take one down and pass it around,"+ (bottle -1) + " bottles of beer on the wall.";
println(lyrics);
if(bottle < 2){
  String lyricsb = lyrics + "\n No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.";
  println(lyricsb);
  
}
}
