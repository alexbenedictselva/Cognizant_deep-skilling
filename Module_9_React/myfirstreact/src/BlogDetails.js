import React, { useState } from 'react';

const blogs = [
    { id: 1, title: 'Getting Started with React', category: 'React', published: true },
    { id: 2, title: 'Understanding Hooks', category: 'React', published: false },
    { id: 3, title: 'CSS Modules in Depth', category: 'CSS', published: true },
    { id: 4, title: 'Node.js Best Practices', category: 'Node', published: false },
];

// Method 2: Ternary operator
// Method 3: Short-circuit && operator
const BlogDetails = () => {
    const [filter, setFilter] = useState('all');

    const filtered = filter === 'published'
        ? blogs.filter(b => b.published)
        : filter === 'draft'
            ? blogs.filter(b => !b.published)
            : blogs;

    return (
        <div style={{ padding: '15px' }}>
            <h2>📝 Blog Details</h2>
            <small><i>Conditional Rendering: Ternary & Short-circuit (&&)</i></small>
            <br /><br />

            {/* Ternary: toggle filter buttons */}
            <button onClick={() => setFilter('all')} style={{ marginRight: '8px', fontWeight: filter === 'all' ? 'bold' : 'normal' }}>All</button>
            <button onClick={() => setFilter('published')} style={{ marginRight: '8px', fontWeight: filter === 'published' ? 'bold' : 'normal' }}>Published</button>
            <button onClick={() => setFilter('draft')} style={{ fontWeight: filter === 'draft' ? 'bold' : 'normal' }}>Drafts</button>

            <br /><br />

            {/* Short-circuit &&: only show count if filtered list is non-empty */}
            {filtered.length > 0 && <p>Showing {filtered.length} blog(s):</p>}

            {filtered.length === 0 && <p style={{ color: 'gray' }}>No blogs found.</p>}

            {filtered.map(blog => (
                <div key={blog.id} style={{ border: '1px solid #ccc', margin: '8px', padding: '10px', borderRadius: '6px' }}>
                    <h4>{blog.title}</h4>
                    <p>Category: {blog.category}</p>
                    {/* Ternary for status badge */}
                    <span style={{ color: blog.published ? 'green' : 'orange' }}>
                        {blog.published ? '✔ Published' : '⏳ Draft'}
                    </span>
                </div>
            ))}
        </div>
    );
};

export default BlogDetails;
