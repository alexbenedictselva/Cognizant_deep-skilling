import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails
        name="React Cohort"
        status="ongoing"
        startDate="2024-01-01"
        endDate="2024-06-30"
        trainer="John Doe"
      />
      <CohortDetails
        name="Java Cohort"
        status="completed"
        startDate="2023-06-01"
        endDate="2023-12-31"
        trainer="Jane Smith"
      />
    </div>
  );
}

export default App;
