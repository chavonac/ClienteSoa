package mx.com.msc;

import mx.com.msc.interfaces.ParametrosReporte;
import mx.com.msc.servicios.ws.GeneraReporte.Parametros;
import mx.com.msc.servicios.ws.Reportes;
import mx.com.msc.servicios.ws.Reportes_Service;


public class App {

    public static void main(String[] args) {
        String reporte = "ReportePrueba";
        ParametrosReporte pr = new ParametrosReporte();
        pr.put("extension", "pdf");
        pr.put("param1", "valor1");
        pr.put("param2", "valor2");
        generaReporte(reporte, pr);
    }

    private static void generaReporte(String nombreReporte, Parametros parametros) {
        Reportes_Service service = new Reportes_Service();
        Reportes port = service.getReportesPort();
        port.generaReporte(nombreReporte, parametros);
    }

}
