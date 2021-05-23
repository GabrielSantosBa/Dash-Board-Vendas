import NavBar from "components";
import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import Footer from "components/footer";
import GraficoRosca from "components/GraficoRosca";


function Dashboard() {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dash Vendas</h1>

                <div className="row">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Grafico de Barras ( % )</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Grafico de Rosca ( % )</h5>
                        <GraficoRosca />
                    </div>
                </div>
                <div className="py-3">
                    <h2 className="text-primary text-center">Todas as vendas</h2>
                </div>
                <DataTable />
                <Footer />
            </div>




        </>

    );

}

export default Dashboard;