import React from "react";

function ListofPlayers({ players }) {

  let players70 = [];

  return (
    <div>

      <h1>List of Players</h1>

      {players.map((item) => {
        return (
          <div key={item.name}>
            <li>
              Mr. {item.name}
              <span> {item.score}</span>
            </li>
          </div>
        );
      })}

      <hr />

      <h1>List of Players having Scores Less than 70</h1>

      {players.map((item) => {

        if (item.score <= 70) {
          players70.push(item);
        }

        return null;
      })}

      {players70.map((item) => {
        return (
          <div key={item.name}>
            <li>
              Mr. {item.name}
              <span> {item.score}</span>
            </li>
          </div>
        );
      })}

    </div>
  );
}

export default ListofPlayers;