const goodreadsInfo = {
    currentlyReading: [
      {
        title: "",
        author: ""
      }
    ],
  
    wantToRead: [
      {
        title: "",
        author: ""
      }
    ]
  }
  book1 = {
    title: "a",
    author: "a"
  };
  book2 = {
    title: "b",
    author: "b"
  };
  book3 = {
    title: "c",
    author: "c"
  };
  
  const addNewBooks = (Info, ...books) => {
    let newArray = [...Info.wantToRead, ...books];
    Info.wantToRead = newArray;
    return;
  }
  
  const showGoodreadsInfo = (info) => {
    const currentlyReading = info.currentlyReading;
    const wantToRead = info.wantToRead;
  
    console.log("Currently Reading:");
    for (let book of currentlyReading) {
      console.log(`${book.title} by ${book.author}`);
    }
  
    console.log();
    console.log("Want to Read:");
    for (let book of wantToRead) {
      console.log(`${book.title} by ${book.author}`);
    }
  };
  
  addNewBooks(goodreadsInfo, book1, book2, book3);
  console.log(goodreadsInfo.wantToRead);
  showGoodreadsInfo(goodreadsInfo);