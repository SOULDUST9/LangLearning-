function mean(array){
    let mean = 0;
    for (let i=0; i<array.length; i++){
      mean = mean + array[i];
    }
    mean = mean/array.length;
    return mean;
  }
  
  function median(array){
  
    for (let i=0; i<array.length ; i++){
      for (let j=0; j<array.length - 1 ; j++){
  
        let val1 = array[j];
        let val2 = array[j+1];
  
        if (val2 < val1){
          array[j] = val2;
          array[j+1] = val1;
        }
      }
    }
    let middle = Math.floor(array.length/2);
    return array[middle];
  }
  
  const recentTikTokViews = [1932, 2300, 453, 5222, 6733, 7402, 8334];
  const recentInstagramViews = [936, 2576, 453, 7013, 5489, 7402, 3921];
  const recentYouTubeViews = [2300, 453, 5222, 989, 6733, 7402, 2789];
  
  
  console.log("TikTok: ");
  console.log("mean: "+ mean(recentTikTokViews));
  console.log("median: "+ median(recentTikTokViews));
  
  console.log("");
  console.log("Instagram: ");
  console.log("mean: "+ mean(recentInstagramViews));
  console.log("median: "+ median(recentInstagramViews));
  
  console.log("");
  console.log("YouTube: ");
  console.log("mean: "+ mean(recentYouTubeViews));
  console.log("median: "+ median(recentYouTubeViews));