
import axios from 'axios';
import { useEffect, useState } from 'react';

import Chart from 'react-apexcharts';
import { VendaSoma } from 'types/sales';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}

function GraficoRosca() {

const [chartData, setChartData] = useState<ChartData>({ labels: [], series: []});

useEffect(()=> {
    axios.get(`${BASE_URL}/sales/soma-por-vendedor`)
    .then(response => {
        const data = response.data as VendaSoma[];
        const myLabels = data.map(x => x.sellerName);
        const mySeries = data.map(x => x.soma);

        setChartData ({ labels: myLabels, series: mySeries });
    });
}, []);
    
    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );

}

export default GraficoRosca;