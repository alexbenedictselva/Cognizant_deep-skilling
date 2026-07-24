import React, { Component } from 'react';

const courses = [
    { id: 1, name: 'React Fundamentals', level: 'beginner', enrolled: true },
    { id: 2, name: 'Advanced JavaScript', level: 'advanced', enrolled: false },
    { id: 3, name: 'Node.js & Express', level: 'intermediate', enrolled: true },
    { id: 4, name: 'MongoDB Essentials', level: 'beginner', enrolled: false },
];

// Method 4: Returning null to hide component
const LevelBadge = ({ level }) => {
    // Method 5: switch-case conditional rendering
    switch (level) {
        case 'beginner':
            return <span style={{ background: '#c8e6c9', padding: '2px 8px', borderRadius: '4px' }}>🟢 Beginner</span>;
        case 'intermediate':
            return <span style={{ background: '#fff9c4', padding: '2px 8px', borderRadius: '4px' }}>🟡 Intermediate</span>;
        case 'advanced':
            return <span style={{ background: '#ffcdd2', padding: '2px 8px', borderRadius: '4px' }}>🔴 Advanced</span>;
        default:
            return null;
    }
};

class CourseDetails extends Component {
    constructor(props) {
        super(props);
        this.state = { showEnrolledOnly: false, selectedLevel: 'all' };
    }

    render() {
        const { showEnrolledOnly, selectedLevel } = this.state;

        // Method 6: IIFE (Immediately Invoked Function Expression) for inline logic
        const filtered = (() => {
            let result = courses;
            if (showEnrolledOnly) result = result.filter(c => c.enrolled);
            if (selectedLevel !== 'all') result = result.filter(c => c.level === selectedLevel);
            return result;
        })();

        return (
            <div style={{ padding: '15px' }}>
                <h2>🎓 Course Details</h2>
                <small><i>Conditional Rendering: null return, switch-case, IIFE</i></small>
                <br /><br />

                <label>
                    <input
                        type="checkbox"
                        checked={showEnrolledOnly}
                        onChange={() => this.setState({ showEnrolledOnly: !showEnrolledOnly })}
                    />
                    &nbsp;Show Enrolled Only
                </label>
                &nbsp;&nbsp;
                <select
                    value={selectedLevel}
                    onChange={e => this.setState({ selectedLevel: e.target.value })}
                >
                    <option value="all">All Levels</option>
                    <option value="beginner">Beginner</option>
                    <option value="intermediate">Intermediate</option>
                    <option value="advanced">Advanced</option>
                </select>

                <br /><br />

                {/* null return: hides message when courses exist */}
                {filtered.length === 0 && <p style={{ color: 'gray' }}>No courses match the selected filters.</p>}

                {filtered.map(course => (
                    <div key={course.id} style={{ border: '1px solid #ccc', margin: '8px', padding: '10px', borderRadius: '6px' }}>
                        <h4>{course.name}</h4>
                        <LevelBadge level={course.level} />
                        &nbsp;&nbsp;
                        {/* Short-circuit && for enrollment status */}
                        {course.enrolled && <span style={{ color: 'blue' }}>✔ Enrolled</span>}
                        {!course.enrolled && <span style={{ color: 'gray' }}>Not Enrolled</span>}
                    </div>
                ))}
            </div>
        );
    }
}

export default CourseDetails;
