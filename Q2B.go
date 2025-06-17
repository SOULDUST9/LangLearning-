
/**
 * A2 Question 2 A)
 * */

 func intGenerator(wg *sync.WaitGroup, stop <-chan bool) <-chan int64{
	intStream := make(chan int64)
	go func() {
		defer func() {wg.Done()}()
		defer close(intStream)
		var i int64
		for {
 		i++
 		select {
			case <-stop:
			return
			case intStream <- i:
 			}
		}
	}()
	return intStream
}

func main() {
	stop := make(chan bool)
	defer close(stop)
	var wg sync.WaitGroup
	wg.Add(1)
	intChannel := intGenerator(&wg, stop)
	for i:=0; i<15; i++ { // printing loop
	 	fmt.Printf("%d ", <-intChannel)
	}
	stop <- true // stop the thread
	wg.Wait() // synchronisation
}