import ListofPlayers from './ListofPlayers';
import { IndianPlayers, OddPlayers, EvenPlayers } from './IndianPlayers';

const flag = true;

function App() {
  return (
    <div>
      {flag ? (
        <div>
          <h2>List of Players</h2>
          <ListofPlayers />
        </div>
      ) : (
        <div>
          <h2>Indian Players (Merged)</h2>
          <ul>{IndianPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>
          <h2>Odd Team Players</h2>
          <OddPlayers>{IndianPlayers}</OddPlayers>
          <h2>Even Team Players</h2>
          <EvenPlayers>{IndianPlayers}</EvenPlayers>
        </div>
      )}
    </div>
  );
}

export default App;
