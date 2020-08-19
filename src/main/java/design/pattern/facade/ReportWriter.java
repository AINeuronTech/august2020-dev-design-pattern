package design.pattern.facade;

public class ReportWriter {
    public void writeHtmlReport(Report report, String location) {
        report.getHeader().getHeaderInfo();
        report.getData().getReportDate();
        report.getFooter().getReportFooter();
    }

    public void writePdfReport(Report report, String location) {
        report.getHeader().getHeaderInfo();
        report.getData().getReportDate();
        report.getFooter().getReportFooter();
    }
}
