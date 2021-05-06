import DataTable from "components/DataTable";
import Footer from "components/footer";
import NavBar from "components/index";

function App() {
  return (

    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">olá Mundo</h1>
      </div>
      <DataTable />
      <Footer />
    </>
  );

}

export default App;
