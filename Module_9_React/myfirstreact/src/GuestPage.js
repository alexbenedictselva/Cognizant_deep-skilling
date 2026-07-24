import React from 'react';

const flights = [
    { id: 1, from: 'Chennai', to: 'Mumbai', date: '2025-08-01', price: 4500, airline: 'IndiGo' },
    { id: 2, from: 'Delhi', to: 'Bangalore', date: '2025-08-02', price: 5200, airline: 'Air India' },
    { id: 3, from: 'Hyderabad', to: 'Kolkata', date: '2025-08-03', price: 3800, airline: 'SpiceJet' },
];

const GuestPage = ({ onLogin }) => {
    return (
        <div style={{ padding: '20px' }}>
            <h2>Welcome, Guest!</h2>
            <p>Browse available flights below. Please login to book tickets.</p>
            <button onClick={onLogin}>Login</button>
            <hr />
            <h3>Available Flights</h3>
            {flights.map(flight => (
                <div key={flight.id} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px', borderRadius: '8px' }}>
                    <p><b>Airline:</b> {flight.airline}</p>
                    <p><b>From:</b> {flight.from} → <b>To:</b> {flight.to}</p>
                    <p><b>Date:</b> {flight.date}</p>
                    <p><b>Price:</b> ₹{flight.price}</p>
                    <button disabled style={{ background: '#aaa', color: '#fff', cursor: 'not-allowed' }}>
                        Book Ticket (Login Required)
                    </button>
                </div>
            ))}
        </div>
    );
};

export { flights };
export default GuestPage;
