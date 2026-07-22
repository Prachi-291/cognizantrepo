import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();

    this.state = {
      amount: "",
      currency: "Euro",
    };
  }

  handleChange = (event) => {
    this.setState({
      amount: event.target.value,
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const rupees = parseFloat(this.state.amount);

    const euro = rupees / 80;

    alert("Converting to Euro Amount is " + euro);
  };

  render() {
    return (
      <div>
        <h1 style={{ color: "green" }}>
          Currency Convertor!!!
        </h1>

        <form onSubmit={this.handleSubmit}>
          <label>Amount: </label>

          <input
            type="number"
            value={this.state.amount}
            onChange={this.handleChange}
          />

          <br /><br />

          <label>Currency: </label>

          <input
            type="text"
            value={this.state.currency}
            readOnly
          />

          <br /><br />

          <button type="submit">
            Submit
          </button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;