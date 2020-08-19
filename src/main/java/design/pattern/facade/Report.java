package design.pattern.facade;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Report {
    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;
}

