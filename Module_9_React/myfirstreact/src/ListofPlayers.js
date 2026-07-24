import React from 'react';

const players = [
    { name: 'Rohit Sharma', score: 85 },
    { name: 'Shubman Gill', score: 62 },
    { name: 'Virat Kohli', score: 95 },
    { name: 'Shreyas Iyer', score: 45 },
    { name: 'KL Rahul', score: 70 },
    { name: 'Hardik Pandya', score: 55 },
    { name: 'Ravindra Jadeja', score: 38 },
    { name: 'Axar Patel', score: 60 },
    { name: 'Jasprit Bumrah', score: 20 },
    { name: 'Mohammed Shami', score: 15 },
    { name: 'Kuldeep Yadav', score: 30 },
];

const ListofPlayers = () => {
    const players70 = [];

    players.map((item) => {
        if (item.score <= 70) {
            players70.push(item);
        }
    });

    return (
        <div>
            <h3>All Players</h3>
            <ul>
                {players.map((item) => {
                    return (
                        <div key={item.name}>
                            <li>
                                Mr. {item.name}
                                <span> {item.score} </span>
                            </li>
                        </div>
                    );
                })}
            </ul>

            <h3>Players with score below 70</h3>
            <ul>
                {players70.map((item) => (
                    <div key={item.name}>
                        <li>
                            Mr. {item.name}
                            <span> {item.score} </span>
                        </li>
                    </div>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;
