**Backend Task 2** 

**Application like Oyo room has to be created**

**base package : com.cg.apps.hotelbooking**

**Modules**

com.cg.apps.hotelms
         
com.cg.apps.roomms
               
 com.cg.apps.guestms     


**Operations**
1) find all available rooms in hotel

2) Allot Room for a guest in hotel

3) guest can checkout

4) find all guests currently living in hotel

5) find all guests checkedOut today from hotel



**Sprints**


1) create project

2) create hotelms (skip relation part with rooms) check it is working in ui

3) create roomms (skip relation part with hotel) check it is working in ui

4) setup relation between Hotel, Room , complete and correct the service implementions

5) create guestms , setup relation between Guest, GuestTransaction and with Room, complete service implementation

**Rest endpoints**

**6) open rest endpoints for hotel service**

a) Add Hotel 

b) find hotel by id 

c) find all guests living in a hotel 

d) find all guests checked out today

**7) open rest end points for room service**

a) Add Room

b) find Room by id

c) find room by floor number and room number

d) find all rooms in a hotel

e) find all available rooms in a hotel

**8)Open rest endpoints for guest service**

a) allot a room for a guest

b) guest checked out from hotel 

c) transaction history of a guest
 
 GuestTransaction{

id:Long

amount: double

dateTime: LocalDateTime

guest:Guest

}


Guest {

id:Long

name: String

adharId: String

room:Room

rentedDateTime:LocalDateTime;

transactions: List <GuestTransaction>

recentTransaction: GuestTransaction

checkoutDateTime: LocalDateTime

}



IGuestService{

Guest findById(Long guestId)

Guest allotRoom(String adharId, String guestName, Long hotelId, int roomNumber, int floorNumber, double rent)

List <GuestTransaction> transactionsHistory(Long guestId)

Guest checkout(Long guestId, Long hotelId, int roomNumber, int floorNumber)

}


Hotel{

hotelId : Long

hotelName: String

address: String 

rooms: List <Room>

}

IHotelService{

Hotel findById(Long hotelId)

Hotel addHotel(String hotelName, String address, List <Room> rooms)

Set <Guest>  findAllGuestsLivingInHotel(Long hotelId)

List <Guest>  findAllGuestsCheckedOutTodayInHotel(Long hotelId)

}


Room {

roomId:Long

floorNumer: Integer

roomNumber: Integer

hotel : Hotel

available : Boolean

cost: double

}


IRoomService{

Room addroom(Long hotelId, int floorNo, int roomNo, double cost) 

Room findById(Long roomId)

Room findRoom(Long hotelId,int floorNo, int roomNo)

List <Room>  findAllRoomsInHotel(Long hotelId)

List <Room>  availableRoomsInHotel(Long hotelId)

}

 
     

