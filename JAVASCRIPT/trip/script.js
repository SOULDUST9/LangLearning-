const departTripTicket = {
    name: "Sebastian",
    from: "Canada", 
    to: "Italy",
    businessClass: false,
    upgrade() {
      if (this.businessClass == false){
        this.businessClass = true;
        console.log("Congrats, your ticket has been upgraded to business class.")
      }else {
        console.log("Your ticket is already business class!")
      }
    }, 
    leaveTime: 18,
    arriveTime: 5,
    flightTime(){
      console.log("the time you leave is: " + this.leaveTime + " and your arrival time is: " + this.arriveTime);
      let time; 
      if (this.arriveTime > this.leaveTime){
        time = this.arriveTime - this.leaveTime;
      }else{
        time = (24 - this.leaveTime) + this.arriveTime;
      }
      console.log("Thus your flight time is: " + time);
    }
  };
  
  
  departTripTicket.upgrade();
  departTripTicket.flightTime();
  departTripTicket.upgrade();
  
  