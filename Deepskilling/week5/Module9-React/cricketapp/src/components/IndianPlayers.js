import React from "react";

function IndianPlayers({ IndianTeam }) {

  // Destructuring
  const [first, second, third, fourth, fifth] = IndianTeam;

  // Odd Players
  const OddPlayers = ({ first, third, fifth }) => {
    return (
      <div>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </div>
    );
  };

  // Even Players
  const EvenPlayers = ({ second, fourth }) => {
    return (
      <div>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
      </div>
    );
  };

  // T20 Players
  const T20Players = [
    "First Player",
    "Second Player",
    "Third Player"
  ];

  // Ranji Trophy Players
  const RanjiTrophyPlayers = [
    "Fourth Player",
    "Fifth Player",
    "Sixth Player"
  ];

  // Merge two arrays
  const IndianPlayers = [
    ...T20Players,
    ...RanjiTrophyPlayers
  ];

  return (
    <div>

      <h1>Odd Players</h1>

      <OddPlayers
        first={first}
        third={third}
        fifth={fifth}
      />

      <hr />

      <h1>Even Players</h1>

      <EvenPlayers
        second={second}
        fourth={fourth}
      />

      <hr />

      <h1>List of Indian Players Merged:</h1>

      {IndianPlayers.map((player, index) => {
        return (
          <li key={index}>
            {player}
          </li>
        );
      })}

    </div>
  );
}

export default IndianPlayers;