import './App.css';

function App() {
  const catalogItems = [
    { name: "Dan", category: "Developer", website: "dandeveloper.dev" },
    { name: "Fatima", category: "Doctor", website: "fatimahealth.com" },
    { name: "Juan", category: "Community Leader", website: "juan.me" },
    { name: "Dan", category: "Developer", website: "dandeveloper.dev" },
    { name: "Fatima", category: "Doctor", website: "fatimahealth.com" },
    { name: "Juan", category: "Community Leader", website: "juan.me" },
    { name: "Dan", category: "Developer", website: "dandeveloper.dev" },
    { name: "Fatima", category: "Doctor", website: "fatimahealth.com" },
    { name: "Juan", category: "Community Leader", website: "juan.me" },
    { name: "Dan", category: "Developer", website: "dandeveloper.dev" },
    { name: "Fatima", category: "Doctor", website: "fatimahealth.com" },
    { name: "Juan", category: "Community Leader", website: "juan.me" },
    { name: "Dan", category: "Developer", website: "dandeveloper.dev" },
    { name: "Fatima", category: "Doctor", website: "fatimahealth.com" },
    { name: "Juan", category: "Community Leader", website: "juan.me" }
  ];

  return (
    <div className="app">
      <h2 className="title">Professions</h2>
      <div className="grid">
        {catalogItems.map((item, index) => (
          <div className="card" key={index}>
            <h2 className="name">{item.name}</h2>
            <h3 className="category">Specialty: {item.category}</h3>
            <a
              href={`https://${item.website}`}
              target="_blank"
              rel="noopener noreferrer"
              className="button"
            >
              Learn more
            </a>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App; 