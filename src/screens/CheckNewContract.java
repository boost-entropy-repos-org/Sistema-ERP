package screens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connectionbd.ConnectionModule;
import javax.swing.JOptionPane;
/**
 *
 * @author willi
 */
public class CheckNewContract extends javax.swing.JFrame {
    int x = 0;
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;
    public CheckNewContract() {
        initComponents();
        ConnectionModule connect = new ConnectionModule();
        connection = connect.getConnectionMySQL();
        inputBank.setEnabled(false);
        inputAccountType.setEnabled(false);
    }
    public void setAdmissal(String cpf){
        inputCPFEmployee.setText(cpf);
        String sql ="select admissionDate, functionEmployee, salary, commission, foodVoucher, mealTicket, transportationVouchers, pisAndPasep, bank, agency, accountBank, bankType from employee where id=(select max(id) from employee where cpf=?)";
        try {
            pst=connection.prepareStatement(sql);
            pst.setString(1, cpf);
            rs= pst.executeQuery();
            if(rs.next()){
                inputReadmittedDate.setText(rs.getString(1));
                inputOccupation.setText(rs.getString(2));
                inputSalary.setText(rs.getString(3));
                inputCommission.setText(rs.getString(4));
                inputFoodVoucher.setText(rs.getString(5));
                inputMealTicket.setText(rs.getString(6));
                inputTranportationVoucher.setText(rs.getString(7));
                inputPIS.setText(rs.getString(8));
                inputBank.setSelectedItem(rs.getString(9));
                inputAgency.setText(rs.getString(10));
                inputAccount.setText(rs.getString(11));
                inputAccountType.setSelectedItem(rs.getString(12));
                setInformation();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void setReadmissal(String cpf, String date){
        inputCPFEmployee.setText(cpf);
        txtReadmittedEmployee.setText("READMISSÃO DE FUNCIONÁRIO");
        txtReadmittedDate.setText("Data de Readmissão");
        this.setTitle("Readmissão");
        String sql ="select readmissionDate, functionEmployee, salary, commission, foodVoucher, mealTicket, transportationVouchers, pisAndPasep, bank, agency, accountBank, bankType from readmissionEmployee where id=(select max(id) from readmissionEmployee where cpf=? and readmissionDate=?)";
        try {
            pst=connection.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.setString(2, date);
            rs= pst.executeQuery();
            if(rs.next()){
                inputReadmittedDate.setText(rs.getString(1));
                inputOccupation.setText(rs.getString(2));
                inputSalary.setText(rs.getString(3));
                inputCommission.setText(rs.getString(4));
                inputFoodVoucher.setText(rs.getString(5));
                inputMealTicket.setText(rs.getString(6));
                inputTranportationVoucher.setText(rs.getString(7));
                inputPIS.setText(rs.getString(8));
                inputBank.setSelectedItem(rs.getString(9));
                inputAgency.setText(rs.getString(10));
                inputAccount.setText(rs.getString(11));
                inputAccountType.setSelectedItem(rs.getString(12));
                setInformation();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void setInformation(){
        String sql ="select id, nameEmployee from employee where cpf=?";
        try {
            pst2=connection.prepareStatement(sql);
            pst2.setString(1, inputCPFEmployee.getText());
            rs2= pst2.executeQuery();
            if(rs2.next()){
                inputCodeEmployee.setText(rs2.getString(1));
                inputEmployeeName.setText(rs2.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtReadmittedDate = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JLabel();
        txtCommission = new javax.swing.JLabel();
        txtSalary = new javax.swing.JLabel();
        txtFoodVoucher = new javax.swing.JLabel();
        txtTranportationVoucher = new javax.swing.JLabel();
        txtMealTicket = new javax.swing.JLabel();
        txtPIS = new javax.swing.JLabel();
        txtBank = new javax.swing.JLabel();
        txtAgency = new javax.swing.JLabel();
        txtAccount = new javax.swing.JLabel();
        txtAccountType = new javax.swing.JLabel();
        inputOccupation = new javax.swing.JTextField();
        inputAccountType = new javax.swing.JComboBox<>();
        inputReadmittedDate = new javax.swing.JTextField();
        inputPIS = new javax.swing.JTextField();
        inputAgency = new javax.swing.JTextField();
        inputAccount = new javax.swing.JTextField();
        inputTranportationVoucher = new javax.swing.JTextField();
        inputBank = new javax.swing.JComboBox<>();
        inputSalary = new javax.swing.JTextField();
        inputCommission = new javax.swing.JTextField();
        inputFoodVoucher = new javax.swing.JTextField();
        inputMealTicket = new javax.swing.JTextField();
        inputCPFEmployee = new javax.swing.JTextField();
        inputCodeEmployee = new javax.swing.JTextField();
        txtEmployeeCode = new javax.swing.JLabel();
        txtEmployeeCPF = new javax.swing.JLabel();
        inputEmployeeName = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JLabel();
        buttonPrinter = new javax.swing.JButton();
        txtReadmittedEmployee = new javax.swing.JLabel();
        txtPercent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admissão");
        setResizable(false);
        getContentPane().setLayout(null);

        txtReadmittedDate.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtReadmittedDate.setText("Data da Admissão");
        getContentPane().add(txtReadmittedDate);
        txtReadmittedDate.setBounds(20, 150, 160, 20);

        txtOccupation.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtOccupation.setText("Função");
        getContentPane().add(txtOccupation);
        txtOccupation.setBounds(220, 150, 70, 20);

        txtCommission.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtCommission.setText("Comissão");
        getContentPane().add(txtCommission);
        txtCommission.setBounds(690, 150, 80, 20);

        txtSalary.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtSalary.setText("Remuneração");
        getContentPane().add(txtSalary);
        txtSalary.setBounds(550, 150, 110, 20);

        txtFoodVoucher.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtFoodVoucher.setText("Vale Alimentação");
        getContentPane().add(txtFoodVoucher);
        txtFoodVoucher.setBounds(20, 230, 130, 20);

        txtTranportationVoucher.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtTranportationVoucher.setText("Vale Transporte");
        getContentPane().add(txtTranportationVoucher);
        txtTranportationVoucher.setBounds(350, 230, 130, 20);

        txtMealTicket.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtMealTicket.setText("Vale Refeição");
        getContentPane().add(txtMealTicket);
        txtMealTicket.setBounds(190, 230, 110, 20);

        txtPIS.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtPIS.setText("PIS/PASEP");
        getContentPane().add(txtPIS);
        txtPIS.setBounds(530, 230, 90, 20);

        txtBank.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtBank.setText("Banco");
        getContentPane().add(txtBank);
        txtBank.setBounds(20, 310, 60, 20);

        txtAgency.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtAgency.setText("Agência");
        getContentPane().add(txtAgency);
        txtAgency.setBounds(420, 310, 70, 20);

        txtAccount.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtAccount.setText("Conta");
        getContentPane().add(txtAccount);
        txtAccount.setBounds(580, 310, 50, 20);

        txtAccountType.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtAccountType.setText("Tipo de Conta");
        getContentPane().add(txtAccountType);
        txtAccountType.setBounds(20, 390, 110, 20);

        inputOccupation.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputOccupation);
        inputOccupation.setBounds(220, 180, 290, 30);

        inputAccountType.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        inputAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "CONTA CORRENTE", "POUPANÇA", "CONTA SALÁRIO" }));
        getContentPane().add(inputAccountType);
        inputAccountType.setBounds(20, 420, 270, 30);

        inputReadmittedDate.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputReadmittedDate);
        inputReadmittedDate.setBounds(20, 180, 110, 30);

        inputPIS.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputPIS);
        inputPIS.setBounds(530, 260, 260, 30);

        inputAgency.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputAgency);
        inputAgency.setBounds(420, 340, 110, 30);

        inputAccount.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputAccount);
        inputAccount.setBounds(580, 340, 270, 30);

        inputTranportationVoucher.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputTranportationVoucher);
        inputTranportationVoucher.setBounds(350, 260, 100, 30);

        inputBank.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        inputBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ACESSO SOLUCOES DE PAGAMENTO S", "ADVANCED CORRET.CAMBIO LTDA", "AGK CORRETORA DE CAMBIO S.A.", "AL5 S.A.CRED. FINANC. E INVEST", "AMAZONIA CORRETORA DE CAMBIO L", "ATIVA INVESTIMENTOS S.A.", "AVISTA S.A. CREDITO.FINAN. E", "B.OF A.MERRILL LYNCH B.MULT.S.", "B&T ASSOCIADOS CORRETORA DE CA", "BANCO ABC-BRASIL S.A.", "BANCO ABN AMRO S.A.", "BANCO AGIBANK S.A.", "BANCO ALFA S.A.", "BANCO ALVORADA S.A.", "BANCO ANDBANK BRASIL S.A.", "BANCO ARBI S.A.", "BANCO B3 S.A.", "BANCO BARI INVESTIMENO E FINA", "BANCO BMG S.A.", "BANCO BNP PARIBAS BRASIL S.A.", "BANCO BOCOM BBM S.A.", "BANCO BRADESCARD S.A.", "BANCO BRADESCO BBI S.A.", "BANCO BRADESCO BERJ S.A.", "BANCO BRADESCO S.A.", "BANCO BS2 S.A.", "BANCO BTG PACTUAL S.A.", "BANCO C6 CONSIGNADO S.A.", "BANCO C6 S.A.", "BANCO CAIXA GERAL - BRASIL S.A.", "BANCO CAPITAL S.A.", "BANCO CARGILL S.A", "BANCO CEDULA S.A.", "BANCO CETELEM S.A.", "BANCO CIFRA S.A.", "BANCO CITIBANK S.A.", "BANCO CLASSICO S.A.", "BANCO CM CAPITAL MARKETS CCTVM", "BANCO COOPERATIOVO SICREDI S.A.", "BANCO COOPERATIVO DO BRASIL S.A.", "BANCO CREDIT AGRICOLE BRASIL S.A.", "BANCO CREDIT SUISSE(BRASIL) S", "BANCO CREFISA S.A.", "BANCO CSF S.A.", "BANCO DA AMAZONIA S.A.", "BANCO DA CHINA BRASIL S.A.", "BANCO DAYCOVAL S.A.", "BANCO DE LA NACION ARGENTINA", "BANCO DE LA PROV. DE BUENOS AL", "BANCO DE PERNAMBUCO S.A. - BANDE", "BANCO DIGIMAIS S.A.", "BANCO DIGIO S.A.", "BANCO DO BRASIL S.A.", "BANCO DO EST. DE SERGIPE S.A.", "BANCO DO EST. DO PARA S.A.", "BANCO DO NORDESTE DO BRASIL S.A.", "BANCO FATOR S.A.", "BANCO FIBRA S.A.", "BANCO FINAXIS S.A.", "BANCO GM S.A.", "BANCO GUANABARA S.A.", "BANCO HSBC S.A.", "BANCO INBURSA S.A.", "BANCO INDUSTRIAL DO BRASIL S.A.", "BANCO INDUSVAL S.A.", "BANCO INTER S.A.", "BANCO INVESTCRED UNIBANCO S.A.", "BANCO ITAU BBA S.A.", "BANCO ITAU HOLDING FINANCEIRA", "BANCO ITAUBANK S.A.", "BANCO J. P. MORGAN S.A.", "BANCO J. SAFRA S.A.", "BANCO JOHN DEERE S.A.", "BANCO KEB HANA DO BRASIL S.A.", "BANCO LUSO BRASILEIRO S.A.", "BANCO MAXIMA S.A.", "BANCO MECANTIL DO BRASIL S.A.", "BANCO MERCEDES-BENZ DO BRASIL", "BANCO MIZUHO DO BRASIL S.A.", "BANCO MODAL S.A.", "BANCO MORGAN STANLEY S.A.", "BANCO MUFG BRASIL S.A.", "BANCO NAC.DESENV.ECON. SOCIAL", "BANCO OLE CONSIGNADO S.A.", "BANCO ORIGINAL DO AGRONEGOCIO", "BANCO ORIGINAL S.A.", "BANCO OURINVEST S.A.", "BANCO PAN S.A.", "BANCO PAULISTA S.A.", "BANCO PINA. S.A.", "BANCO RADOBANK INTERNATIONAL B", "BANCO RANDON S.A.", "BANCO RENDIMENTO S.A.", "BANCO RIBEIRAO PRETO S.A.", "BANCO RODOBENS S.A.", "BANCO SAFRA S.A.", "BANCO SANTANDER (BRASIL) S.A.", "BANCO SC TULLET PREBON", "BANCO SEMEAR S.A.", "BANCO SISTEMA S.A.", "BANCO SMARTBANK S.A.", "BANCO SOCIETE GENERALE BRASIL", "BANCO SOFISA S.A.", "BANCO SUMITOMO MITSUI BRASILEI", "BANCO TOPAZIO S.A.", "BANCO TOYOTA DO BRASIL S.A.", "BANCO TRIANGULO S.A.", "BANCO TRICURY S.A.", "BANCO UNICO S.A.", "BANCO VOLKSWAGEN S.A.", "BANCO VOTORANTIM S.A.", "BANCO VR S.A.", "BANCO WESTERN UNION DO BRASIL", "BANCO WOORI BANK DO BRASIL S.A.", "BANCO XP S.A.", "BANCOSEGURO S.A.", "BANESTES S.A. BCO.EST.ESPIRITO", "BARI COMPANHIA HIPOTECARIA", "BBC LEASING S.A. - ARRENDAMENTO", "BCG LIQUIDEZ DISTR TITS VLRS M", "BCO BRADESCO FINANCIAMENTOS S.A.", "BCO.EST.R.GRANDE DO SUL S.A.", "BCO.ITAU BMG CONSIGNADO S.A.", "BCV - BANCO DE CRÉDITO E VAREJ", "BEXS BANCO DE CAMBIO S.A.", "BEXS CORRETORA DE CAMBIO S/A", "BI UBS BRASIL", "BNY MELLON BANCO S.A.", "BOLETOBANCARIO.COM TEC DE PAGT", "BPP INSTITUIÇÃO DE PAGAMENTOS", "BR PARTNERS BCO INVEST. S.A.", "BRB-BANCO DE BRASILIA S.A.", "BRK S.A. CRED. FINANC E INVEST", "BRL TRUST DIST. DE TIT. E VAL.", "BROKER BRASIL CORRET CAMBIO LT", "BS2 DIST. DE TIT. E VAL. MOB.", "CAIXA ECONOMICA FEDERAL", "CAMBIONET CORRETORA DE CÂMBIO", "CAROL DISTR. D. TIT. E VAL. IM", "CARTOS SOCIEDADE DE CREDITO DI", "CARUANA S.A. - SOC.CRED. FINAN", "CASA DO CREDITO S.A. SOC.D.CRED.", "CC UNIPRIME CENTRAL", "CC UNIPRIME NORTE DO PARANA", "CENTRAL COOP.EC.CR.MUTUO ESP.S", "CHINA CONSTRUCTION BANK (BRASIL", "CIELO S.A.", "CITIBANCK N.A.", "CODEPE - CORRETORA DE VALORES", "COMMERZBANK BRASIL S.A. - BANC", "CONFED.NAC.COOP.CENTRAIS ECON", "CONFIDENCE CORRETORA DE CÂMBIO", "COOP CRED RURAL DE IBIAM-SULCR", "COOP CRED RURAL PEQ AGRICULTOR", "COOP DE CRED RURAL DE ABELARDO", "COOP DE CRED.RURAL DA REG DA M", "COOP. DE CRED. RURAL D.PRIMAVE", "COOP.CRED.MUTUO DESP.TR.DE STA", "COOP.D.CRED.RURAL DE OUROSULC", "COOP.D.CRED.RURAL DE S. MIGUE", "COOPERATIVA CENTRAL SANTA CATAR", "COOPERATIVA DE CREDITO RURAL C", "COOPERFORTE-COOP DE ECON E CRE", "CORA SOCIEDADE DE CREDITO DIRE", "CREDIALIANCA COOP CRED RURAL", "CREDICOAMO CRED.RURAL COOP", "CREDISIS-CENTRAL DE COOP DE CR", "CREDIT SUISSE HG CORRETORA", "CREDITAS SOC. DE CREDITO DIRET", "CREFAZ SOC DE CRED AO MICROEMP", "DECYSEO CORRETORA DE CAMBIO LT", "DEUTSCHE BANK S.A.-BANCO ALEMA", "EASYNVEST TIT CORR VALORES S.A.", "FACTA FINANCEIRA S.A.", "FAIR CORRETORA DE CAMBIO S.A.", "FFA SOC DE CRED AO MIC E A EMP", "FIDUCIA SOC DE CRED AO MICRO E", "FRAM CAPITAL DIST DE TIT E VAL", "FRENT CORRETORA DE CAMBIO LTD", "GENIAL INVEST. COR DE VAL MOBI", "GERENCIANET PAGAMENTOS DO BRASIL", "GET MONEY CORRETORA DE CAMBIO", "GOLDMAN SACHS DO BRASIL. BCO MU", "GUIDE INVEST S.A. CORRETORA DE", "GUITTA CORRETORA DE CAMBIO", "HAITONG BANCO DE INVEST DO BRA", "HIPERCARD BANCO MULTIPLO S.A.", "HS FINANCEIRA S/A", "HUB PAGAMENTOS S.A.", "IB CORRET. DE CAMBIO. TIT.E VA", "ICAP DO BRASIL CORRETORA TITS", "ICBC DO BRASIL BCO MULTIPLO S.", "ING BANK N.V.", "INTESA SANPAOLO BRASIL S.A.", "ITAU UNIBANCO S.A.", "JP MORGAN CHASE BANK", "KDB DO BRASIL", "KIRTON BANK S.A. BCO. MULTIPLO", "LASTRO RDV DISTR D TIT E VAL M", "LECCA CREDITO FINANC.E INVESTI", "LEVYCAM - CORRET DE CAMBIO E V", "MAGLIANO S.A. COR.CAMB VLS MOBL", "MERCADOPAGO COM", "MONEY PLUS SOC DE CRED MICROEM", "MONEYCORP BANCO DE CAMBIO S.A.", "MS SOC DE CRED AO MICRO E EMP", "MSB BANK - BANCO DE CAMBIO", "NECTON INV SA CORRET DE VAL MO", "NEXT", "NOVA FUTURA CTVM LTDA", "NOVA PLATAFORMA DE COBRANÇA", "NOVO BANCO CONTINENTAL S.A.B - M", "NU PAGAMENTOS S.A.", "OLIVEIRA TRUST DIST TIT.VAL MO", "OM DIST DE TIT E VAL MOBILIARI", "OMNI BANCO S.A.", "ORAMA DIST DE TITULOS E VALORES", "OTIMO SOCIEDADE DE CREDITO DIR", "PAGSEGURO INTERNET S.A.", "PARANA BANCO S.A.", "PARATI-CREDITO FINANCIAMENTO E", "PARMETAL DISTRI. TIT. VAL. IMO", "PEFISA S.A. -CRED. FINANCIAMENT", "PI DIST. DE TIT. E VAL. MOBILI", "PLANNER CORRET. DE VALORES S.A.", "PLURAL S.A. BCO MULTIPLO", "POLOCRED SOC.CRED.MICROEMP.EMP", "PORTOPAR DIST. TIT. E VAL. MOB", "PORTOPCRED S.A. CRED.FINANC E IN", "QI SOCIEDADE DE CRÉDITO DIRETO", "RB CAPITAL INVESTIMENTOS DTVM", "REALIZE CRED. FINANC. E INVEST", "RENANSCENCA DIST.TIT.VAL.MOB.L.", "SAGITUR CORRETORA DE CAMBIO LT", "SCOTIABANK BRASIL S/A B.MULTIP", "SELECIONAR", "SENFF S.A. - CRED. FINANC. E IN", "SENSO CORR.CAMB.VAL.MOBILIARIO", "SERVICOOP-COOP DE CRED DOS SER", "SOC.DE CRED.AO MICROEMP.E EMP.", "SOCOPA SOCIEDADE CORRETORA PAU", "SOLIDUS S.A. C. CAMB. E VAL. MO", "SOROCRED CRED. FINAN. E INVESTI", "STATE STREET BRASIL S.A. - BCO", "STONE PAGAMENTOS S.A.", "SUPER PAGAMENTOS E ADMDE MEIOS", "TERRA INV. DIST. E TIT. E VAL", "TORO CORRETORA DE TIT E VALORES", "TRAVELEX BANCO DE CAMBIO S.A.", "TREVISO CORRETORA DE CAMBIO S/", "TRINUS CAPITAL DIST DE TIT E V", "UNICRED", "UNICRED CENTRAL RS-C.C.EC CRED", "UNS NRASIL CCTMV S.A.", "UP.P SOC DE EMPREST ENTRE PRESS", "VIP'S DE CORRETORA DE CAMBIO L", "VISION S.A. CORRETORA DE CAMBI", "VITREO DISTRIBUIDORA DE TIT E", "VORTX DIST. DE TIT. E VAL. MOB", "WARREN CORRET E VALORES IMOB", "XP INVEST.CORR.CAMP.VLS MOB.S.", "ZEMA CREDITO, FINANCIAMENTO IN" }));
        getContentPane().add(inputBank);
        inputBank.setBounds(20, 340, 360, 30);

        inputSalary.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputSalary);
        inputSalary.setBounds(550, 180, 100, 30);

        inputCommission.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputCommission);
        inputCommission.setBounds(690, 180, 100, 30);

        inputFoodVoucher.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputFoodVoucher);
        inputFoodVoucher.setBounds(20, 260, 100, 30);

        inputMealTicket.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputMealTicket);
        inputMealTicket.setBounds(190, 260, 100, 30);

        inputCPFEmployee.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputCPFEmployee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCPFEmployeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCPFEmployeeFocusLost(evt);
            }
        });
        inputCPFEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCPFEmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCPFEmployeeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCPFEmployeeKeyTyped(evt);
            }
        });
        getContentPane().add(inputCPFEmployee);
        inputCPFEmployee.setBounds(240, 110, 120, 30);

        inputCodeEmployee.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputCodeEmployee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCodeEmployeeFocusGained(evt);
            }
        });
        inputCodeEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCodeEmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCodeEmployeeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCodeEmployeeKeyTyped(evt);
            }
        });
        getContentPane().add(inputCodeEmployee);
        inputCodeEmployee.setBounds(20, 110, 70, 30);

        txtEmployeeCode.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtEmployeeCode.setText("Código do Funcionário");
        getContentPane().add(txtEmployeeCode);
        txtEmployeeCode.setBounds(20, 80, 180, 20);

        txtEmployeeCPF.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtEmployeeCPF.setText("CPF do Funcionário");
        getContentPane().add(txtEmployeeCPF);
        txtEmployeeCPF.setBounds(240, 80, 150, 20);

        inputEmployeeName.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputEmployeeName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputEmployeeNameFocusGained(evt);
            }
        });
        inputEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputEmployeeNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputEmployeeNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputEmployeeNameKeyTyped(evt);
            }
        });
        getContentPane().add(inputEmployeeName);
        inputEmployeeName.setBounds(440, 110, 410, 30);

        txtEmployeeName.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtEmployeeName.setText("Nome do Funcionário");
        getContentPane().add(txtEmployeeName);
        txtEmployeeName.setBounds(440, 80, 210, 20);

        buttonPrinter.setText("IMPRIMIR");
        getContentPane().add(buttonPrinter);
        buttonPrinter.setBounds(20, 470, 90, 30);

        txtReadmittedEmployee.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtReadmittedEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReadmittedEmployee.setText("ADMISSÃO DE FUNCIONÁRIO");
        getContentPane().add(txtReadmittedEmployee);
        txtReadmittedEmployee.setBounds(200, 20, 440, 32);

        txtPercent.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtPercent.setText("%");
        getContentPane().add(txtPercent);
        txtPercent.setBounds(800, 180, 20, 30);

        setSize(new java.awt.Dimension(882, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputCPFEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCPFEmployeeFocusGained
       
    }//GEN-LAST:event_inputCPFEmployeeFocusGained

    private void inputCPFEmployeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCPFEmployeeFocusLost

    }//GEN-LAST:event_inputCPFEmployeeFocusLost

    private void inputCPFEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCPFEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFEmployeeKeyPressed

    private void inputCPFEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCPFEmployeeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFEmployeeKeyReleased

    private void inputCPFEmployeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCPFEmployeeKeyTyped

    }//GEN-LAST:event_inputCPFEmployeeKeyTyped

    private void inputCodeEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCodeEmployeeFocusGained
       
    }//GEN-LAST:event_inputCodeEmployeeFocusGained

    private void inputCodeEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeEmployeeKeyPressed

    private void inputCodeEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeEmployeeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeEmployeeKeyReleased

    private void inputCodeEmployeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeEmployeeKeyTyped

    }//GEN-LAST:event_inputCodeEmployeeKeyTyped

    private void inputEmployeeNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmployeeNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmployeeNameFocusGained

    private void inputEmployeeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEmployeeNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmployeeNameKeyPressed

    private void inputEmployeeNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEmployeeNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmployeeNameKeyReleased

    private void inputEmployeeNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEmployeeNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmployeeNameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckNewContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckNewContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckNewContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckNewContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckNewContract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPrinter;
    private javax.swing.JTextField inputAccount;
    private javax.swing.JComboBox<String> inputAccountType;
    private javax.swing.JTextField inputAgency;
    private javax.swing.JComboBox<String> inputBank;
    private javax.swing.JTextField inputCPFEmployee;
    public static javax.swing.JTextField inputCodeEmployee;
    private javax.swing.JTextField inputCommission;
    private javax.swing.JTextField inputEmployeeName;
    private javax.swing.JTextField inputFoodVoucher;
    private javax.swing.JTextField inputMealTicket;
    private javax.swing.JTextField inputOccupation;
    private javax.swing.JTextField inputPIS;
    private javax.swing.JTextField inputReadmittedDate;
    private javax.swing.JTextField inputSalary;
    private javax.swing.JTextField inputTranportationVoucher;
    private javax.swing.JLabel txtAccount;
    private javax.swing.JLabel txtAccountType;
    private javax.swing.JLabel txtAgency;
    private javax.swing.JLabel txtBank;
    private javax.swing.JLabel txtCommission;
    private javax.swing.JLabel txtEmployeeCPF;
    private javax.swing.JLabel txtEmployeeCode;
    private javax.swing.JLabel txtEmployeeName;
    private javax.swing.JLabel txtFoodVoucher;
    private javax.swing.JLabel txtMealTicket;
    private javax.swing.JLabel txtOccupation;
    private javax.swing.JLabel txtPIS;
    private javax.swing.JLabel txtPercent;
    private javax.swing.JLabel txtReadmittedDate;
    private javax.swing.JLabel txtReadmittedEmployee;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JLabel txtTranportationVoucher;
    // End of variables declaration//GEN-END:variables
}
