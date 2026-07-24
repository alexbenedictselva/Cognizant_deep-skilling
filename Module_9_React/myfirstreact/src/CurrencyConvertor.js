import React, { Component } from 'react';

class CurrencyConvertor extends Component {
    constructor(props) {
        super(props);
        this.state = {
            rupees: '',
            euro: null
        };
    }

    handleChange = (e) => {
        this.setState({ rupees: e.target.value, euro: null });
    }

    handleSubmit = (e) => {
        e.preventDefault();
        const euroValue = (parseFloat(this.state.rupees) / 89.5).toFixed(2);
        this.setState({ euro: euroValue });
    }

    render() {
        return (
            <div style={{ padding: '20px' }}>
                <h2>Currency Convertor (INR → Euro)</h2>
                <form onSubmit={this.handleSubmit}>
                    <label>Enter Amount in Rupees (₹): </label>
                    <input
                        type="number"
                        value={this.state.rupees}
                        onChange={this.handleChange}
                        placeholder="Enter INR"
                    />
                    <br /><br />
                    <button type="submit">Convert</button>
                </form>
                {this.state.euro !== null && (
                    <h3>€ {this.state.euro} Euro</h3>
                )}
            </div>
        );
    }
}

export default CurrencyConvertor;
