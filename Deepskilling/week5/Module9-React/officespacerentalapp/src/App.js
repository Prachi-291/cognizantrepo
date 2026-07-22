import React from "react";

function App() {

  // Office Space Object
  const item = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai",
    Image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72"
  };

  // List of Office Space Objects
  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72"
    },
    {
      Name: "ABC Business Center",
      Rent: 65000,
      Address: "Bangalore",
      Image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2"
    },
    {
      Name: "Tech Park",
      Rent: 45000,
      Address: "Hyderabad",
      Image: "https://images.unsplash.com/photo-1497366216548-37526070297c"
    }
  ];

  return (
    <div>

      {/* Heading */}
      <h1>Office Space , at Affordable Range</h1>

      {/* Display Office Spaces */}
      {offices.map((item, index) => {

        // Apply color according to Rent
        let colors = [];

        if (item.Rent <= 60000) {
          colors.push("textRed");
        } else {
          colors.push("textGreen");
        }

        return (
          <div key={index}>

            {/* Office Image */}
            <img
              src={item.Image}
              width="25%"
              height="25%"
              alt="Office Space"
            />

            {/* Office Name */}
            <h2>
              Name: {item.Name}
            </h2>

            {/* Office Rent */}
            <h3
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              Rent: Rs. {item.Rent}
            </h3>

            {/* Office Address */}
            <h4>
              Address: {item.Address}
            </h4>

            <hr />

          </div>
        );
      })}

    </div>
  );
}

export default App;