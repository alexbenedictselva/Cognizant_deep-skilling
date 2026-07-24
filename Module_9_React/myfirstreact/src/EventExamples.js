import React, { Component } from 'react';

class EventExamples extends Component {
    constructor(props) {
        super(props);
        this.state = { counter: 0 };
    }

    increment = () => {
        this.setState({ counter: this.state.counter + 1 });
    }

    sayHello = () => {
        alert("Hello! Welcome to Event Handling in React.");
    }

    decrement = () => {
        this.setState({ counter: this.state.counter - 1 });
    }

    sayWelcome = (msg) => {
        alert(msg);
    }

    onPress = (e) => {
        alert("I was clicked");
    }

    render() {
        return (
            <div style={{ padding: '20px' }}>
                <h2>Counter: {this.state.counter}</h2>

                <button onClick={() => { this.increment(); this.sayHello(); }}>
                    Increment
                </button>
                &nbsp;
                <button onClick={this.decrement}>Decrement</button>

                <br /><br />

                <button onClick={() => this.sayWelcome("welcome")}>Say Welcome</button>

                <br /><br />

                <button onMouseDown={this.onPress}>OnPress Event</button>
            </div>
        );
    }
}

export default EventExamples;
