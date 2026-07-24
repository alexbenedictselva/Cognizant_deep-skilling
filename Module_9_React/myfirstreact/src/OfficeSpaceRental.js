import React from 'react';
import sr from './office.jpg';
import './OfficeSpace.css';

const element = "Office Space";

const jsxatt = (
    <img
        src={sr}
        width="25%"
        height="25%"
        alt="Office Space"
    />
);

const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
};

const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "Regus", Rent: 75000, Address: "Mumbai" },
    { Name: "WeWork", Rent: 90000, Address: "Bangalore" },
    { Name: "Awfis", Rent: 45000, Address: "Hyderabad" },
    { Name: "Smartworks", Rent: 65000, Address: "Pune" },
];

const OfficeSpaceRental = () => {
    return (
        <div style={{ padding: '20px' }}>
            <h1>{element}, at Affordable Range</h1>

            {jsxatt}

            <h1>Name: {ItemName.Name}</h1>
            <h3>Rent: Rs. {ItemName.Rent}</h3>
            <h3>Address: {ItemName.Address}</h3>

            <hr />
            <h2>All Office Spaces</h2>
            {officeList.map((office, index) => {
                let colors = [];
                if (office.Rent <= 60000) {
                    colors.push('textRed');
                } else {
                    colors.push('textGreen');
                }
                return (
                    <div key={index} style={{ marginBottom: '10px' }}>
                        <h3>Name: {office.Name}</h3>
                        <h3 className={colors.join('')}>Rent: Rs. {office.Rent}</h3>
                        <h3>Address: {office.Address}</h3>
                        <hr />
                    </div>
                );
            })}
        </div>
    );
};

export default OfficeSpaceRental;
