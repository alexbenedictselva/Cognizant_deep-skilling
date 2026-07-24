import React, { Component } from 'react';
import { flights } from './GuestPage';

class UserPage extends Component {
    constructor(props) {
        super(props);
        this.state = { bookedFlight: null };
    }

    bookTicket = (flight) => {
        this.setState({ bookedFlight: flight });
        alert(`Ticket booked successfully for ${flight.airline}: ${flight.from} → ${flight.to}`);
    }

    render() {
        const { onLogout } = this.props;
        const { bookedFlight } = this.state;

        return (
            <div style={{ padding: '20px' }}>
                <h2>Welcome, User!</h2>
                <button onClick={onLogout}>Logout</button>
                <hr />
                <h3>Available Flights</h3>
                {flights.map(flight => (
                    <div key={flight.id} style={{ border: '1px solid #4caf50', margin: '10px', padding: '10px', borderRadius: '8px' }}>
                        <p><b>Airline:</b> {flight.airline}</p>
                        <p><b>From:</b> {flight.from} → <b>To:</b> {flight.to}</p>
                        <p><b>Date:</b> {flight.date}</p>
                        <p><b>Price:</b> ₹{flight.price}</p>
                        <button
                            onClick={() => this.bookTicket(flight)}
                            style={{ background: '#4caf50', color: '#fff', padding: '6px 12px', border: 'none', borderRadius: '4px', cursor: 'pointer' }}
                        >
                            Book Ticket
                        </button>
                    </div>
                ))}
                {bookedFlight && (
                    <div style={{ marginTop: '20px', padding: '10px', background: '#e8f5e9', borderRadius: '8px' }}>
                        <h4>✅ Booking Confirmed!</h4>
                        <p>{bookedFlight.airline}: {bookedFlight.from} → {bookedFlight.to} on {bookedFlight.date}</p>
                        <p>Amount Paid: ₹{bookedFlight.price}</p>
                    </div>
                )}
            </div>
        );
    }
}

export default UserPage;
