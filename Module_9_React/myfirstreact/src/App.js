import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  return (
    <div>
      <h1 style={{ textAlign: 'center', background: '#37474f', color: '#fff', padding: '15px', margin: 0 }}>
        📖 Blogger App
      </h1>
      <BookDetails />
      <hr />
      <BlogDetails />
      <hr />
      <CourseDetails />
    </div>
  );
}

export default App;
