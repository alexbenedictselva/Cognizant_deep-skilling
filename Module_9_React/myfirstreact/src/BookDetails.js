import React, { Component } from 'react';

const books = [
    { id: 1, title: 'Clean Code', author: 'Robert C. Martin', available: true },
    { id: 2, title: 'The Pragmatic Programmer', author: 'Andrew Hunt', available: false },
    { id: 3, title: 'You Don\'t Know JS', author: 'Kyle Simpson', available: true },
];

// Method 1: if-else conditional rendering
class BookDetails extends Component {
    constructor(props) {
        super(props);
        this.state = { showBooks: false };
    }

    render() {
        let content;
        if (this.state.showBooks) {
            content = (
                <div>
                    {books.map(book => (
                        <div key={book.id} style={{ border: '1px solid #ccc', margin: '8px', padding: '10px', borderRadius: '6px' }}>
                            <h4>{book.title}</h4>
                            <p>Author: {book.author}</p>
                            {book.available
                                ? <span style={{ color: 'green' }}>✔ Available</span>
                                : <span style={{ color: 'red' }}>✘ Not Available</span>
                            }
                        </div>
                    ))}
                </div>
            );
        } else {
            content = <p>Click the button to view book details.</p>;
        }

        return (
            <div style={{ padding: '15px' }}>
                <h2>📚 Book Details</h2>
                <small><i>Conditional Rendering: if-else</i></small>
                <br /><br />
                <button onClick={() => this.setState({ showBooks: !this.state.showBooks })}>
                    {this.state.showBooks ? 'Hide Books' : 'Show Books'}
                </button>
                <br /><br />
                {content}
            </div>
        );
    }
}

export default BookDetails;
