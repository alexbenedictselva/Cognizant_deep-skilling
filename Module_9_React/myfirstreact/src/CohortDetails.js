import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ name, status, startDate, endDate, trainer }) => {
    const titleColor = status === 'ongoing' ? 'green' : 'blue';

    return (
        <div className={styles.box}>
            <h3 style={{ color: titleColor }}>{name}</h3>
            <dl>
                <dt>Status</dt>
                <dd>{status}</dd>
                <dt>Start Date</dt>
                <dd>{startDate}</dd>
                <dt>End Date</dt>
                <dd>{endDate}</dd>
                <dt>Trainer</dt>
                <dd>{trainer}</dd>
            </dl>
        </div>
    );
};

export default CohortDetails;
