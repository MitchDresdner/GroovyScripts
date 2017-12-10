class LineParser {

  def requestNumber(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl + ","
  }
  
  def noticeDate(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl + ","
  }
  
  def caseType(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl + ","
  }
  
  def aNumber(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl + ","
  }
  
  def social(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl + ","
  }
  
  def code(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl + ","
  }
  
  def serviceCtr(java.io.BufferedReader ip) {
    def nl = ip.readLine()
    print nl //+ ","
  }
  
  // java -jar pdfbox-app-2.0.8.jar ExtractText -console "C:\Home\Docs\SamplePDF\Sample Bionotice Applicant.pdf" | groovy LineParser.groovy
  public static void main(String[] args) {
    
	def input = System.in.newReader()
	
	def lp = new LineParser()
	
    def ok = true
    while (ok) {
      def ln = input.readLine()
	  //println "Line: " + ln
      ok = ln != null
	  
	  if (ln == null) { ok = false; continue; }
	  if (ln.contains("REQUEST NUMBER")) { lp.requestNumber(input); continue; }
	  if (ln.contains("NOTICE DATE")) { lp.noticeDate(input); continue; }	  
	  if (ln.contains("CASE TYPE")) { lp.noticeDate(input); continue; }	  
	  if (ln.contains("SOCIAL SECURITY NUMBER USCIS A")) { print","; lp.aNumber(input); continue; }		// empty social
	  if (ln.contains("SOCIAL SECURITY")) { print","; lp.social(input); continue; }	
	  if (ln.contains("USCIS A")) { lp.caseType(input); continue; }
	  if (ln.contains("CODE")) { lp.code(input); continue; }
	  if (ln.contains("SERVICE CENTER")) { lp.serviceCtr(input); continue; }
	  if (ln.contains("CASE TYPE")) { lp.noticeDate(input); continue; }
	  if (ln.contains("CASE TYPE")) { lp.noticeDate(input); continue; }
	  if (ln.contains("PAGE")) { print "\n"; ok = false; continue; }
	  
    }
  }
}