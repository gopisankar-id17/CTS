import React from "react";
import officeImg from "./office.jpg";
import "./App.css";

function App() {

  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "Regus", Rent: 70000, Address: "Bangalore" },
    { Name: "WeWork", Rent: 85000, Address: "Hyderabad" }
  ];

  return (
    <div>
      <h1>Office Space Rental App</h1>

      <img src={officeImg} alt="Office" width="400" height="250" />

      <h2>Office Details</h2>

      <p><b>Name:</b> {office.Name}</p>

 <p
  className={office.Rent <= 60000 ? "textRed" : "textGreen"}
>
    <b>Rent:</b> {office.Rent}
</p>
      <p><b>Address:</b> {office.Address}</p>


      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item, index) => (

          <div key={index}>

            <h3>{item.Name}</h3>

            <p
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              Rent: {item.Rent}
            </p>

            <p>Address: {item.Address}</p>

            <hr />

          </div>

        ))
      }

    </div>
  );
}

export default App;