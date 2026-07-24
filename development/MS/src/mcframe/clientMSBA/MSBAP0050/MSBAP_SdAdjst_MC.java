package mcframe.clientMSBA.MSBAP0050;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP5020.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowStatusEvent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import javafx.application.Platform;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.PieChart.Data;
import mcframe.clientCore.beans.fxgraph.MCFXGraph;
import mcframe.clientCore.beans.fxgraph.MCFXGraphCore;
import mcframe.clientCore.beans.fxgraph.MCFXGraphData;
import mcframe.clientCore.beans.fxgraph.MCFXGraphDelegate;
import mcframe.clientCore.beans.fxgraph.MCFXGraphDetailsTooltip;
import mcframe.clientCore.beans.fxgraph.MCFXGraphDetailsTooltipPie;
import mcframe.clientCore.beans.plaf.metal.MCMetalLookAndFeel;
import javafx.embed.swing.JFXPanel;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Arrays;
import mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBAP_SdAdjst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBAP_SdAdjst_MC extends MSBAP_SdAdjst_MC_A implements IfVHMapperPanel, MCFXGraphDelegate {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// dividerの位置を格納する変数
	int saveLoc1 = 0;
	int saveLoc2 = 0;
	int saveLoc3 = 0;

	protected MAUCP_VHMapper<Rslt1R, DispRslt1R> _vhM = new MAUCP_VHMapper<>();

	protected Map<MCNumber, MCList<DispRslt1R>> _grpNoHMap = new HashMap<>();

	protected Map<MCNumber, MCList<Rslt1R>> _grpNoVMap = new HashMap<>();

	protected DispRslt1R _bakRslt1R = null;

	/** 明細のデータ項目 */
	protected MCColumnConfig[] _qtys = null;
	/** 日付部分の項目名 */
	protected String[] _qtyCols = null;
	/** フラグ部分の項目名 */
	protected String[] _flgCols = null;

	/** 明細のフラグ項目 */
	protected MCColumnConfig[] _flgs = null;

	protected Map<String, MCDate> _colMap = new HashMap<>();
	protected Map<String, Integer> _dateMap = new HashMap<>();
	protected Map<MCDate, MCColumnConfig> _dateMap2 = new HashMap<>();
	protected Map<MCDate, MCColumnConfig> _editableFlgMap = new HashMap<>();

	// 検索時点の在庫推移を保持
	MCList<DispRslt1R> _dispRslt1BakL = MCList.create(DispRslt1R.class);

	// 稼働日判定用キャッシュ
	MCList<Rslt1R> _wkDayL = MCList.create(Rslt1R.class);
	// 供給計画キャッシュ
	Map<List<Comparable<?>>, MCList<Rslt3R>> _Rslt3L = new HashMap<List<Comparable<?>>, MCList<Rslt3R>>();

	// シミュレーションオーダキャッシュ
	Map<List<Comparable<?>>, MCList<Rslt4R>> _Rslt4L = new HashMap<List<Comparable<?>>, MCList<Rslt4R>>();

	// 日次需要情報キャッシュ
	Map<List<Comparable<?>>, MCList<Rslt5R>> _Rslt5L = new HashMap<List<Comparable<?>>, MCList<Rslt5R>>();


	// グラフインスタンス
	public MCFXGraph _innerGraph = null;
	public MCFXGraph _outerGraph = null;

	private Integer[] _graphTypeList = {MCFXGraphData.GraphType_Line, MCFXGraphData.GraphType_Bar, MCFXGraphData.GraphType_Bar};
	private String _graphTitle = ""; // グラフのタイトル
	private String[] _valueColumns = {"stk_qty", "gr_qty", "gi_qty"}; // グラフの数値カラム名
	private String[] _labelColumnList = {"disp_schd_dt"}; // グラフのラベルカラム名
	private String[] _graphColorList = {getDispString("color_stk"), getDispString("color_gr"), getDispString("color_gi")}; // グラフの色
	private String _labelColumnName = getDispString("label_dt"); // グラフのラベルカラム名
	private String[] _valueColumnsName = {getDispString("label_stk"), getDispString("label_gr"), getDispString("label_gi")}; // グラフの数値カラム名
	private String _valueLabel = "";
	protected JFXPanel _fxPanel = null;

	// グラフ表示用にキャッシュ
	Map<List<Comparable<?>>, MCList<Rslt1R>> _bakRslt1L = new HashMap<List<Comparable<?>>, MCList<Rslt1R>>();
	MCList<Rslt1R> _rslt1L = MCList.create(Rslt1R.class);

	protected MCIndexKey _idxKey = null;

	/** 最大の表示期間 */
	protected final int _max_day_duration = 498;
	/** 最大の表示月 */
	//月次の最大表示は5年
	protected final int _max_month_duration = 60;
	/** 土曜日の色 */
	protected Color _sat_color = getPgmSettingColorNE(this, new Color(176,196,222), "color.sat");
	/** 日曜日の色 */
	protected Color _sun_color = getPgmSettingColorNE(this, new Color(255,192,203), "color.sun");
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_SdAdjst_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBAP_SdAdjst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected String _fileType_Csv = "csv";
	protected String _fileType_Excel = "excel";
	protected String _slash = "/";
	protected String[] _csvQtyCols = new String[]{
			CsvR.$qty01, CsvR.$qty02, CsvR.$qty03, CsvR.$qty04, CsvR.$qty05, CsvR.$qty06, CsvR.$qty07, CsvR.$qty08, CsvR.$qty09, CsvR.$qty10, 
			CsvR.$qty11, CsvR.$qty12, CsvR.$qty13, CsvR.$qty14, CsvR.$qty15, CsvR.$qty16, CsvR.$qty17, CsvR.$qty18, CsvR.$qty19, CsvR.$qty20, 
			CsvR.$qty21, CsvR.$qty22, CsvR.$qty23, CsvR.$qty24, CsvR.$qty25, CsvR.$qty26, CsvR.$qty27, CsvR.$qty28, CsvR.$qty29, CsvR.$qty30, 
			CsvR.$qty31, CsvR.$qty32, CsvR.$qty33, CsvR.$qty34, CsvR.$qty35, CsvR.$qty36, CsvR.$qty37, CsvR.$qty38, CsvR.$qty39, CsvR.$qty40, 
			CsvR.$qty41, CsvR.$qty42, CsvR.$qty43, CsvR.$qty44, CsvR.$qty45, CsvR.$qty46, CsvR.$qty47, CsvR.$qty48, CsvR.$qty49, CsvR.$qty50, 
			CsvR.$qty51, CsvR.$qty52, CsvR.$qty53, CsvR.$qty54, CsvR.$qty55, CsvR.$qty56, CsvR.$qty57, CsvR.$qty58, CsvR.$qty59, CsvR.$qty60, 
			CsvR.$qty61, CsvR.$qty62, CsvR.$qty63, CsvR.$qty64, CsvR.$qty65, CsvR.$qty66, CsvR.$qty67, CsvR.$qty68, CsvR.$qty69, CsvR.$qty70, 
			CsvR.$qty71, CsvR.$qty72, CsvR.$qty73, CsvR.$qty74, CsvR.$qty75, CsvR.$qty76, CsvR.$qty77, CsvR.$qty78, CsvR.$qty79, CsvR.$qty80, 
			CsvR.$qty81, CsvR.$qty82, CsvR.$qty83, CsvR.$qty84, CsvR.$qty85, CsvR.$qty86, CsvR.$qty87, CsvR.$qty88, CsvR.$qty89, CsvR.$qty90, 
			CsvR.$qty91, CsvR.$qty92, CsvR.$qty93, CsvR.$qty94, CsvR.$qty95, CsvR.$qty96, CsvR.$qty97, CsvR.$qty98, CsvR.$qty99, CsvR.$qty100,
			CsvR.$qty101, CsvR.$qty102, CsvR.$qty103, CsvR.$qty104, CsvR.$qty105, CsvR.$qty106, CsvR.$qty107, CsvR.$qty108, CsvR.$qty109, CsvR.$qty110,
			CsvR.$qty111, CsvR.$qty112, CsvR.$qty113, CsvR.$qty114, CsvR.$qty115, CsvR.$qty116, CsvR.$qty117, CsvR.$qty118, CsvR.$qty119, CsvR.$qty120,
			CsvR.$qty121, CsvR.$qty122, CsvR.$qty123, CsvR.$qty124, CsvR.$qty125, CsvR.$qty126, CsvR.$qty127, CsvR.$qty128, CsvR.$qty129, CsvR.$qty130,
			CsvR.$qty131, CsvR.$qty132, CsvR.$qty133, CsvR.$qty134, CsvR.$qty135, CsvR.$qty136, CsvR.$qty137, CsvR.$qty138, CsvR.$qty139, CsvR.$qty140,
			CsvR.$qty141, CsvR.$qty142, CsvR.$qty143, CsvR.$qty144, CsvR.$qty145, CsvR.$qty146, CsvR.$qty147, CsvR.$qty148, CsvR.$qty149, CsvR.$qty150,
			CsvR.$qty151, CsvR.$qty152, CsvR.$qty153, CsvR.$qty154, CsvR.$qty155, CsvR.$qty156, CsvR.$qty157, CsvR.$qty158, CsvR.$qty159, CsvR.$qty160,
			CsvR.$qty161, CsvR.$qty162, CsvR.$qty163, CsvR.$qty164, CsvR.$qty165, CsvR.$qty166, CsvR.$qty167, CsvR.$qty168, CsvR.$qty169, CsvR.$qty170,
			CsvR.$qty171, CsvR.$qty172, CsvR.$qty173, CsvR.$qty174, CsvR.$qty175, CsvR.$qty176, CsvR.$qty177, CsvR.$qty178, CsvR.$qty179, CsvR.$qty180,
			CsvR.$qty181, CsvR.$qty182, CsvR.$qty183, CsvR.$qty184, CsvR.$qty185, CsvR.$qty186, CsvR.$qty187, CsvR.$qty188, CsvR.$qty189, CsvR.$qty190,
			CsvR.$qty191, CsvR.$qty192, CsvR.$qty193, CsvR.$qty194, CsvR.$qty195, CsvR.$qty196, CsvR.$qty197, CsvR.$qty198, CsvR.$qty199, CsvR.$qty200,
			CsvR.$qty201, CsvR.$qty202, CsvR.$qty203, CsvR.$qty204, CsvR.$qty205, CsvR.$qty206, CsvR.$qty207, CsvR.$qty208, CsvR.$qty209, CsvR.$qty210,
			CsvR.$qty211, CsvR.$qty212, CsvR.$qty213, CsvR.$qty214, CsvR.$qty215, CsvR.$qty216, CsvR.$qty217, CsvR.$qty218, CsvR.$qty219, CsvR.$qty220,
			CsvR.$qty221, CsvR.$qty222, CsvR.$qty223, CsvR.$qty224, CsvR.$qty225, CsvR.$qty226, CsvR.$qty227, CsvR.$qty228, CsvR.$qty229, CsvR.$qty230,
			CsvR.$qty231, CsvR.$qty232, CsvR.$qty233, CsvR.$qty234, CsvR.$qty235, CsvR.$qty236, CsvR.$qty237, CsvR.$qty238, CsvR.$qty239, CsvR.$qty240,
			CsvR.$qty241, CsvR.$qty242, CsvR.$qty243, CsvR.$qty244, CsvR.$qty245, CsvR.$qty246, CsvR.$qty247, CsvR.$qty248, CsvR.$qty249, CsvR.$qty250,
			CsvR.$qty251, CsvR.$qty252, CsvR.$qty253, CsvR.$qty254, CsvR.$qty255, CsvR.$qty256, CsvR.$qty257, CsvR.$qty258, CsvR.$qty259, CsvR.$qty260,
			CsvR.$qty261, CsvR.$qty262, CsvR.$qty263, CsvR.$qty264, CsvR.$qty265, CsvR.$qty266, CsvR.$qty267, CsvR.$qty268, CsvR.$qty269, CsvR.$qty270,
			CsvR.$qty271, CsvR.$qty272, CsvR.$qty273, CsvR.$qty274, CsvR.$qty275, CsvR.$qty276, CsvR.$qty277, CsvR.$qty278, CsvR.$qty279, CsvR.$qty280,
			CsvR.$qty281, CsvR.$qty282, CsvR.$qty283, CsvR.$qty284, CsvR.$qty285, CsvR.$qty286, CsvR.$qty287, CsvR.$qty288, CsvR.$qty289, CsvR.$qty290,
			CsvR.$qty291, CsvR.$qty292, CsvR.$qty293, CsvR.$qty294, CsvR.$qty295, CsvR.$qty296, CsvR.$qty297, CsvR.$qty298, CsvR.$qty299, CsvR.$qty300,
			CsvR.$qty301, CsvR.$qty302, CsvR.$qty303, CsvR.$qty304, CsvR.$qty305, CsvR.$qty306, CsvR.$qty307, CsvR.$qty308, CsvR.$qty309, CsvR.$qty310,
			CsvR.$qty311, CsvR.$qty312, CsvR.$qty313, CsvR.$qty314, CsvR.$qty315, CsvR.$qty316, CsvR.$qty317, CsvR.$qty318, CsvR.$qty319, CsvR.$qty320,
			CsvR.$qty321, CsvR.$qty322, CsvR.$qty323, CsvR.$qty324, CsvR.$qty325, CsvR.$qty326, CsvR.$qty327, CsvR.$qty328, CsvR.$qty329, CsvR.$qty330,
			CsvR.$qty331, CsvR.$qty332, CsvR.$qty333, CsvR.$qty334, CsvR.$qty335, CsvR.$qty336, CsvR.$qty337, CsvR.$qty338, CsvR.$qty339, CsvR.$qty340,
			CsvR.$qty341, CsvR.$qty342, CsvR.$qty343, CsvR.$qty344, CsvR.$qty345, CsvR.$qty346, CsvR.$qty347, CsvR.$qty348, CsvR.$qty349, CsvR.$qty350,
			CsvR.$qty351, CsvR.$qty352, CsvR.$qty353, CsvR.$qty354, CsvR.$qty355, CsvR.$qty356, CsvR.$qty357, CsvR.$qty358, CsvR.$qty359, CsvR.$qty360,
			CsvR.$qty361, CsvR.$qty362, CsvR.$qty363, CsvR.$qty364, CsvR.$qty365, CsvR.$qty366, CsvR.$qty367, CsvR.$qty368, CsvR.$qty369, CsvR.$qty370,
			CsvR.$qty371, CsvR.$qty372, CsvR.$qty373, CsvR.$qty374, CsvR.$qty375, CsvR.$qty376, CsvR.$qty377, CsvR.$qty378, CsvR.$qty379, CsvR.$qty380,
			CsvR.$qty381, CsvR.$qty382, CsvR.$qty383, CsvR.$qty384, CsvR.$qty385, CsvR.$qty386, CsvR.$qty387, CsvR.$qty388, CsvR.$qty389, CsvR.$qty390,
			CsvR.$qty391, CsvR.$qty392, CsvR.$qty393, CsvR.$qty394, CsvR.$qty395, CsvR.$qty396, CsvR.$qty397, CsvR.$qty398, CsvR.$qty399, CsvR.$qty400,
			CsvR.$qty401, CsvR.$qty402, CsvR.$qty403, CsvR.$qty404, CsvR.$qty405, CsvR.$qty406, CsvR.$qty407, CsvR.$qty408, CsvR.$qty409, CsvR.$qty410,
			CsvR.$qty411, CsvR.$qty412, CsvR.$qty413, CsvR.$qty414, CsvR.$qty415, CsvR.$qty416, CsvR.$qty417, CsvR.$qty418, CsvR.$qty419, CsvR.$qty420,
			CsvR.$qty421, CsvR.$qty422, CsvR.$qty423, CsvR.$qty424, CsvR.$qty425, CsvR.$qty426, CsvR.$qty427, CsvR.$qty428, CsvR.$qty429, CsvR.$qty430,
			CsvR.$qty431, CsvR.$qty432, CsvR.$qty433, CsvR.$qty434, CsvR.$qty435, CsvR.$qty436, CsvR.$qty437, CsvR.$qty438, CsvR.$qty439, CsvR.$qty440,
			CsvR.$qty441, CsvR.$qty442, CsvR.$qty443, CsvR.$qty444, CsvR.$qty445, CsvR.$qty446, CsvR.$qty447, CsvR.$qty448, CsvR.$qty449, CsvR.$qty450,
			CsvR.$qty451, CsvR.$qty452, CsvR.$qty453, CsvR.$qty454, CsvR.$qty455, CsvR.$qty456, CsvR.$qty457, CsvR.$qty458, CsvR.$qty459, CsvR.$qty460,
			CsvR.$qty461, CsvR.$qty462, CsvR.$qty463, CsvR.$qty464, CsvR.$qty465, CsvR.$qty466, CsvR.$qty467, CsvR.$qty468, CsvR.$qty469, CsvR.$qty470,
			CsvR.$qty471, CsvR.$qty472, CsvR.$qty473, CsvR.$qty474, CsvR.$qty475, CsvR.$qty476, CsvR.$qty477, CsvR.$qty478, CsvR.$qty479, CsvR.$qty480,
			CsvR.$qty481, CsvR.$qty482, CsvR.$qty483, CsvR.$qty484, CsvR.$qty485, CsvR.$qty486, CsvR.$qty487, CsvR.$qty488, CsvR.$qty489, CsvR.$qty490,
			CsvR.$qty491, CsvR.$qty492, CsvR.$qty493, CsvR.$qty494, CsvR.$qty495, CsvR.$qty496, CsvR.$qty497, CsvR.$qty498, CsvR.$qty499
			};

	/**
	 * Panel[Btn]のボタン[out_file]の押下時の処理
	 */
	@Override
	public void doBtn_out_file(MCEventInfo info) {
		clearCsvData();
		setCsvLabels();
		setCsvData();
		writeCsvFile();
		clearCsvData();
	}
	protected void setCsvLabels() {
		MCDate fr = getCndR().dmnd_dt_fr();
		for (int i = 0; i< _csvQtyCols.length; i ++) {
			if (i == 0) {
				String nm = getDispString("label_term") + String.valueOf(fr.addDay(-1).getYear()) + _slash
						+ String.valueOf(fr.addDay(-1).getMonth()) + _slash
						+ String.valueOf(fr.addDay(-1).getDay());
				setCsvLabel("qty00", nm);
			}
			if (i == _csvQtyCols.length-1) {
				String nm = String.valueOf(fr.addDay(i).getYear()) + _slash
						+ String.valueOf(fr.addDay(i).getMonth()) + _slash
						+ String.valueOf(fr.addDay(i).getDay() + getDispString("label_term"));
				setCsvLabel(_csvQtyCols[i], nm);
				continue;
			}
			String nm = String.valueOf(fr.addDay(i).getYear()) + _slash
					+ String.valueOf(fr.addDay(i).getMonth()) + _slash
					+ String.valueOf(fr.addDay(i).getDay());
			setCsvLabel(_csvQtyCols[i], nm);
		}
	}
	protected void setCsvData() {
		MCDate fr = getCndR().dmnd_dt_fr();
		addAll(getCsvL(), getDispRslt1L(), createMap_CsvR_DispRslt1R(fr));
	}
	protected void writeCsvFile() {
		if (isSame(getFileType(), _fileType_Csv)) {
			doCSVOutAction(CsvTable, MCWriteType.ALL);
		}
		else if (isSame(getFileType(), _fileType_Excel)) {
			doExcelOutAction(CsvTable, MCWriteType.ALL);
		}
	}
	
	protected Map_CsvR_DispRslt1R<CsvR,DispRslt1R> createMap_CsvR_DispRslt1R(MCDate fr) {
		return new Map_CsvR_DispRslt1R<CsvR, DispRslt1R>(fr);
	}
	public class Map_CsvR_DispRslt1R<D extends CsvR, S extends DispRslt1R> extends MCRowMapper<D,S>{
		protected MCDate _fr;
		public Map_CsvR_DispRslt1R(MCDate fr) {
			_fr = fr;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(CsvR.$itm_cd, DispRslt1R.$itm_cd);
			addColumnPathMap(CsvR.$itm_sub1, DispRslt1R.$itm_sub1);
			addColumnPathMap(CsvR.$itm_sub2, DispRslt1R.$itm_sub2);
			addColumnPathMap(CsvR.$itm_sub3, DispRslt1R.$itm_sub3);
			addColumnPathMap(CsvR.$itm_nm, DispRslt1R.$itm_nm);
			addColumnPathMap(CsvR.$strg_loc_cd, DispRslt1R.$loc_cd);
			addColumnPathMap(CsvR.$strg_loc_nm, DispRslt1R.$loc_nm);
			addColumnPathMap(CsvR.$strg_wg_cd, DispRslt1R.$wg_cd);
			addColumnPathMap(CsvR.$strg_wg_nm, DispRslt1R.$wg_nm);
			addColumnPathMap(CsvR.$sd_adjst_dtl_typ, DispRslt1R.$sd_adjst_dtl_typ);
			addColumnPathMap(CsvR.$sd_adjst_dtl_typ_nm, DispRslt1R.$sd_adjst_dtl_typ_nm);
			addColumnPathMap(CsvR.$rqmt_typ, DispRslt1R.$rqmt_typ);
			addColumnPathMap(CsvR.$prod_pln_typ, DispRslt1R.$prod_pln_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
				dest.dmnd_dt_fr(_fr);
				dest.qty00(src.qty00());
				dest.qty01(src.qty01());
				dest.qty02(src.qty02());
				dest.qty03(src.qty03());
				dest.qty04(src.qty04());
				dest.qty05(src.qty05());
				dest.qty06(src.qty06());
				dest.qty07(src.qty07());
				dest.qty08(src.qty08());
				dest.qty09(src.qty09());
				dest.qty10(src.qty10());
				dest.qty11(src.qty11());
				dest.qty12(src.qty12());
				dest.qty13(src.qty13());
				dest.qty14(src.qty14());
				dest.qty15(src.qty15());
				dest.qty16(src.qty16());
				dest.qty17(src.qty17());
				dest.qty18(src.qty18());
				dest.qty19(src.qty19());
				dest.qty20(src.qty20());
				dest.qty21(src.qty21());
				dest.qty22(src.qty22());
				dest.qty23(src.qty23());
				dest.qty24(src.qty24());
				dest.qty25(src.qty25());
				dest.qty26(src.qty26());
				dest.qty27(src.qty27());
				dest.qty28(src.qty28());
				dest.qty29(src.qty29());
				dest.qty30(src.qty30());
				dest.qty31(src.qty31());
				dest.qty32(src.qty32());
				dest.qty33(src.qty33());
				dest.qty34(src.qty34());
				dest.qty35(src.qty35());
				dest.qty36(src.qty36());
				dest.qty37(src.qty37());
				dest.qty38(src.qty38());
				dest.qty39(src.qty39());
				dest.qty40(src.qty40());
				dest.qty41(src.qty41());
				dest.qty42(src.qty42());
				dest.qty43(src.qty43());
				dest.qty44(src.qty44());
				dest.qty45(src.qty45());
				dest.qty46(src.qty46());
				dest.qty47(src.qty47());
				dest.qty48(src.qty48());
				dest.qty49(src.qty49());
				dest.qty50(src.qty50());
				dest.qty51(src.qty51());
				dest.qty52(src.qty52());
				dest.qty53(src.qty53());
				dest.qty54(src.qty54());
				dest.qty55(src.qty55());
				dest.qty56(src.qty56());
				dest.qty57(src.qty57());
				dest.qty58(src.qty58());
				dest.qty59(src.qty59());
				dest.qty60(src.qty60());
				dest.qty61(src.qty61());
				dest.qty62(src.qty62());
				dest.qty63(src.qty63());
				dest.qty64(src.qty64());
				dest.qty65(src.qty65());
				dest.qty66(src.qty66());
				dest.qty67(src.qty67());
				dest.qty68(src.qty68());
				dest.qty69(src.qty69());
				dest.qty70(src.qty70());
				dest.qty71(src.qty71());
				dest.qty72(src.qty72());
				dest.qty73(src.qty73());
				dest.qty74(src.qty74());
				dest.qty75(src.qty75());
				dest.qty76(src.qty76());
				dest.qty77(src.qty77());
				dest.qty78(src.qty78());
				dest.qty79(src.qty79());
				dest.qty80(src.qty80());
				dest.qty81(src.qty81());
				dest.qty82(src.qty82());
				dest.qty83(src.qty83());
				dest.qty84(src.qty84());
				dest.qty85(src.qty85());
				dest.qty86(src.qty86());
				dest.qty87(src.qty87());
				dest.qty88(src.qty88());
				dest.qty89(src.qty89());
				dest.qty90(src.qty90());
				dest.qty91(src.qty91());
				dest.qty92(src.qty92());
				dest.qty93(src.qty93());
				dest.qty94(src.qty94());
				dest.qty95(src.qty95());
				dest.qty96(src.qty96());
				dest.qty97(src.qty97());
				dest.qty98(src.qty98());
				dest.qty99(src.qty99());
				dest.qty101(src.qty101());
				dest.qty102(src.qty102());
				dest.qty103(src.qty103());
				dest.qty104(src.qty104());
				dest.qty105(src.qty105());
				dest.qty106(src.qty106());
				dest.qty107(src.qty107());
				dest.qty108(src.qty108());
				dest.qty109(src.qty109());
				dest.qty110(src.qty110());
				dest.qty111(src.qty111());
				dest.qty112(src.qty112());
				dest.qty113(src.qty113());
				dest.qty114(src.qty114());
				dest.qty115(src.qty115());
				dest.qty116(src.qty116());
				dest.qty117(src.qty117());
				dest.qty118(src.qty118());
				dest.qty119(src.qty119());
				dest.qty120(src.qty120());
				dest.qty121(src.qty121());
				dest.qty122(src.qty122());
				dest.qty123(src.qty123());
				dest.qty124(src.qty124());
				dest.qty125(src.qty125());
				dest.qty126(src.qty126());
				dest.qty127(src.qty127());
				dest.qty128(src.qty128());
				dest.qty129(src.qty129());
				dest.qty130(src.qty130());
				dest.qty131(src.qty131());
				dest.qty132(src.qty132());
				dest.qty133(src.qty133());
				dest.qty134(src.qty134());
				dest.qty135(src.qty135());
				dest.qty136(src.qty136());
				dest.qty137(src.qty137());
				dest.qty138(src.qty138());
				dest.qty139(src.qty139());
				dest.qty140(src.qty140());
				dest.qty141(src.qty141());
				dest.qty142(src.qty142());
				dest.qty143(src.qty143());
				dest.qty144(src.qty144());
				dest.qty145(src.qty145());
				dest.qty146(src.qty146());
				dest.qty147(src.qty147());
				dest.qty148(src.qty148());
				dest.qty149(src.qty149());
				dest.qty150(src.qty150());
				dest.qty151(src.qty151());
				dest.qty152(src.qty152());
				dest.qty153(src.qty153());
				dest.qty154(src.qty154());
				dest.qty155(src.qty155());
				dest.qty156(src.qty156());
				dest.qty157(src.qty157());
				dest.qty158(src.qty158());
				dest.qty159(src.qty159());
				dest.qty160(src.qty160());
				dest.qty161(src.qty161());
				dest.qty162(src.qty162());
				dest.qty163(src.qty163());
				dest.qty164(src.qty164());
				dest.qty165(src.qty165());
				dest.qty166(src.qty166());
				dest.qty167(src.qty167());
				dest.qty168(src.qty168());
				dest.qty169(src.qty169());
				dest.qty170(src.qty170());
				dest.qty171(src.qty171());
				dest.qty172(src.qty172());
				dest.qty173(src.qty173());
				dest.qty174(src.qty174());
				dest.qty175(src.qty175());
				dest.qty176(src.qty176());
				dest.qty177(src.qty177());
				dest.qty178(src.qty178());
				dest.qty179(src.qty179());
				dest.qty180(src.qty180());
				dest.qty181(src.qty181());
				dest.qty182(src.qty182());
				dest.qty183(src.qty183());
				dest.qty184(src.qty184());
				dest.qty185(src.qty185());
				dest.qty186(src.qty186());
				dest.qty187(src.qty187());
				dest.qty188(src.qty188());
				dest.qty189(src.qty189());
				dest.qty190(src.qty190());
				dest.qty191(src.qty191());
				dest.qty192(src.qty192());
				dest.qty193(src.qty193());
				dest.qty194(src.qty194());
				dest.qty195(src.qty195());
				dest.qty196(src.qty196());
				dest.qty197(src.qty197());
				dest.qty198(src.qty198());
				dest.qty199(src.qty199());
				dest.qty200(src.qty200());
				dest.qty201(src.qty201());
				dest.qty202(src.qty202());
				dest.qty203(src.qty203());
				dest.qty204(src.qty204());
				dest.qty205(src.qty205());
				dest.qty206(src.qty206());
				dest.qty207(src.qty207());
				dest.qty208(src.qty208());
				dest.qty209(src.qty209());
				dest.qty210(src.qty210());
				dest.qty211(src.qty211());
				dest.qty212(src.qty212());
				dest.qty213(src.qty213());
				dest.qty214(src.qty214());
				dest.qty215(src.qty215());
				dest.qty216(src.qty216());
				dest.qty217(src.qty217());
				dest.qty218(src.qty218());
				dest.qty219(src.qty219());
				dest.qty220(src.qty220());
				dest.qty221(src.qty221());
				dest.qty222(src.qty222());
				dest.qty223(src.qty223());
				dest.qty224(src.qty224());
				dest.qty225(src.qty225());
				dest.qty226(src.qty226());
				dest.qty227(src.qty227());
				dest.qty228(src.qty228());
				dest.qty229(src.qty229());
				dest.qty230(src.qty230());
				dest.qty231(src.qty231());
				dest.qty232(src.qty232());
				dest.qty233(src.qty233());
				dest.qty234(src.qty234());
				dest.qty235(src.qty235());
				dest.qty236(src.qty236());
				dest.qty237(src.qty237());
				dest.qty238(src.qty238());
				dest.qty239(src.qty239());
				dest.qty240(src.qty240());
				dest.qty241(src.qty241());
				dest.qty242(src.qty242());
				dest.qty243(src.qty243());
				dest.qty244(src.qty244());
				dest.qty245(src.qty245());
				dest.qty246(src.qty246());
				dest.qty247(src.qty247());
				dest.qty248(src.qty248());
				dest.qty249(src.qty249());
				dest.qty250(src.qty250());
				dest.qty251(src.qty251());
				dest.qty252(src.qty252());
				dest.qty253(src.qty253());
				dest.qty254(src.qty254());
				dest.qty255(src.qty255());
				dest.qty256(src.qty256());
				dest.qty257(src.qty257());
				dest.qty258(src.qty258());
				dest.qty259(src.qty259());
				dest.qty260(src.qty260());
				dest.qty261(src.qty261());
				dest.qty262(src.qty262());
				dest.qty263(src.qty263());
				dest.qty264(src.qty264());
				dest.qty265(src.qty265());
				dest.qty266(src.qty266());
				dest.qty267(src.qty267());
				dest.qty268(src.qty268());
				dest.qty269(src.qty269());
				dest.qty270(src.qty270());
				dest.qty271(src.qty271());
				dest.qty272(src.qty272());
				dest.qty273(src.qty273());
				dest.qty274(src.qty274());
				dest.qty275(src.qty275());
				dest.qty276(src.qty276());
				dest.qty277(src.qty277());
				dest.qty278(src.qty278());
				dest.qty279(src.qty279());
				dest.qty280(src.qty280());
				dest.qty281(src.qty281());
				dest.qty282(src.qty282());
				dest.qty283(src.qty283());
				dest.qty284(src.qty284());
				dest.qty285(src.qty285());
				dest.qty286(src.qty286());
				dest.qty287(src.qty287());
				dest.qty288(src.qty288());
				dest.qty289(src.qty289());
				dest.qty290(src.qty290());
				dest.qty291(src.qty291());
				dest.qty292(src.qty292());
				dest.qty293(src.qty293());
				dest.qty294(src.qty294());
				dest.qty295(src.qty295());
				dest.qty296(src.qty296());
				dest.qty297(src.qty297());
				dest.qty298(src.qty298());
				dest.qty299(src.qty299());
				dest.qty300(src.qty300());
				dest.qty301(src.qty301());
				dest.qty302(src.qty302());
				dest.qty303(src.qty303());
				dest.qty304(src.qty304());
				dest.qty305(src.qty305());
				dest.qty306(src.qty306());
				dest.qty307(src.qty307());
				dest.qty308(src.qty308());
				dest.qty309(src.qty309());
				dest.qty310(src.qty310());
				dest.qty311(src.qty311());
				dest.qty312(src.qty312());
				dest.qty313(src.qty313());
				dest.qty314(src.qty314());
				dest.qty315(src.qty315());
				dest.qty316(src.qty316());
				dest.qty317(src.qty317());
				dest.qty318(src.qty318());
				dest.qty319(src.qty319());
				dest.qty320(src.qty320());
				dest.qty321(src.qty321());
				dest.qty322(src.qty322());
				dest.qty323(src.qty323());
				dest.qty324(src.qty324());
				dest.qty325(src.qty325());
				dest.qty326(src.qty326());
				dest.qty327(src.qty327());
				dest.qty328(src.qty328());
				dest.qty329(src.qty329());
				dest.qty330(src.qty330());
				dest.qty331(src.qty331());
				dest.qty332(src.qty332());
				dest.qty333(src.qty333());
				dest.qty334(src.qty334());
				dest.qty335(src.qty335());
				dest.qty336(src.qty336());
				dest.qty337(src.qty337());
				dest.qty338(src.qty338());
				dest.qty339(src.qty339());
				dest.qty340(src.qty340());
				dest.qty341(src.qty341());
				dest.qty342(src.qty342());
				dest.qty343(src.qty343());
				dest.qty344(src.qty344());
				dest.qty345(src.qty345());
				dest.qty346(src.qty346());
				dest.qty347(src.qty347());
				dest.qty348(src.qty348());
				dest.qty349(src.qty349());
				dest.qty350(src.qty350());
				dest.qty351(src.qty351());
				dest.qty352(src.qty352());
				dest.qty353(src.qty353());
				dest.qty354(src.qty354());
				dest.qty355(src.qty355());
				dest.qty356(src.qty356());
				dest.qty357(src.qty357());
				dest.qty358(src.qty358());
				dest.qty359(src.qty359());
				dest.qty360(src.qty360());
				dest.qty361(src.qty361());
				dest.qty362(src.qty362());
				dest.qty363(src.qty363());
				dest.qty364(src.qty364());
				dest.qty365(src.qty365());
				dest.qty366(src.qty366());
				dest.qty367(src.qty367());
				dest.qty368(src.qty368());
				dest.qty369(src.qty369());
				dest.qty370(src.qty370());
				dest.qty371(src.qty371());
				dest.qty372(src.qty372());
				dest.qty373(src.qty373());
				dest.qty374(src.qty374());
				dest.qty375(src.qty375());
				dest.qty376(src.qty376());
				dest.qty377(src.qty377());
				dest.qty378(src.qty378());
				dest.qty379(src.qty379());
				dest.qty380(src.qty380());
				dest.qty381(src.qty381());
				dest.qty382(src.qty382());
				dest.qty383(src.qty383());
				dest.qty384(src.qty384());
				dest.qty385(src.qty385());
				dest.qty386(src.qty386());
				dest.qty387(src.qty387());
				dest.qty388(src.qty388());
				dest.qty389(src.qty389());
				dest.qty390(src.qty390());
				dest.qty391(src.qty391());
				dest.qty392(src.qty392());
				dest.qty393(src.qty393());
				dest.qty394(src.qty394());
				dest.qty395(src.qty395());
				dest.qty396(src.qty396());
				dest.qty397(src.qty397());
				dest.qty398(src.qty398());
				dest.qty399(src.qty399());
				dest.qty400(src.qty400());
				dest.qty401(src.qty401());
				dest.qty402(src.qty402());
				dest.qty403(src.qty403());
				dest.qty404(src.qty404());
				dest.qty405(src.qty405());
				dest.qty406(src.qty406());
				dest.qty407(src.qty407());
				dest.qty408(src.qty408());
				dest.qty409(src.qty409());
				dest.qty410(src.qty410());
				dest.qty411(src.qty411());
				dest.qty412(src.qty412());
				dest.qty413(src.qty413());
				dest.qty414(src.qty414());
				dest.qty415(src.qty415());
				dest.qty416(src.qty416());
				dest.qty417(src.qty417());
				dest.qty418(src.qty418());
				dest.qty419(src.qty419());
				dest.qty420(src.qty420());
				dest.qty421(src.qty421());
				dest.qty422(src.qty422());
				dest.qty423(src.qty423());
				dest.qty424(src.qty424());
				dest.qty425(src.qty425());
				dest.qty426(src.qty426());
				dest.qty427(src.qty427());
				dest.qty428(src.qty428());
				dest.qty429(src.qty429());
				dest.qty430(src.qty430());
				dest.qty431(src.qty431());
				dest.qty432(src.qty432());
				dest.qty433(src.qty433());
				dest.qty434(src.qty434());
				dest.qty435(src.qty435());
				dest.qty436(src.qty436());
				dest.qty437(src.qty437());
				dest.qty438(src.qty438());
				dest.qty439(src.qty439());
				dest.qty440(src.qty440());
				dest.qty441(src.qty441());
				dest.qty442(src.qty442());
				dest.qty443(src.qty443());
				dest.qty444(src.qty444());
				dest.qty445(src.qty445());
				dest.qty446(src.qty446());
				dest.qty447(src.qty447());
				dest.qty448(src.qty448());
				dest.qty449(src.qty449());
				dest.qty450(src.qty450());
				dest.qty451(src.qty451());
				dest.qty452(src.qty452());
				dest.qty453(src.qty453());
				dest.qty454(src.qty454());
				dest.qty455(src.qty455());
				dest.qty456(src.qty456());
				dest.qty457(src.qty457());
				dest.qty458(src.qty458());
				dest.qty459(src.qty459());
				dest.qty460(src.qty460());
				dest.qty461(src.qty461());
				dest.qty462(src.qty462());
				dest.qty463(src.qty463());
				dest.qty464(src.qty464());
				dest.qty465(src.qty465());
				dest.qty466(src.qty466());
				dest.qty467(src.qty467());
				dest.qty468(src.qty468());
				dest.qty469(src.qty469());
				dest.qty470(src.qty470());
				dest.qty471(src.qty471());
				dest.qty472(src.qty472());
				dest.qty473(src.qty473());
				dest.qty474(src.qty474());
				dest.qty475(src.qty475());
				dest.qty476(src.qty476());
				dest.qty477(src.qty477());
				dest.qty478(src.qty478());
				dest.qty479(src.qty479());
				dest.qty480(src.qty480());
				dest.qty481(src.qty481());
				dest.qty482(src.qty482());
				dest.qty483(src.qty483());
				dest.qty484(src.qty484());
				dest.qty485(src.qty485());
				dest.qty486(src.qty486());
				dest.qty487(src.qty487());
				dest.qty488(src.qty488());
				dest.qty489(src.qty489());
				dest.qty490(src.qty490());
				dest.qty491(src.qty491());
				dest.qty492(src.qty492());
				dest.qty493(src.qty493());
				dest.qty494(src.qty494());
				dest.qty495(src.qty495());
				dest.qty496(src.qty496());
				dest.qty497(src.qty497());
				dest.qty498(src.qty498());
				dest.qty499(src.qty499());
		}
	}
	protected boolean isReadCsvFileErr() {
		// framemanagerのExcel入力の処理でエラーが発生しているか
		MCMessageList fwMsgL = CsvTable.getBeansReader().getMsgList();
		if (fwMsgL != null && !fwMsgL.isEmpty()) {
			MCMessageList msgL = new MCMessageList();
			for (MCMessage msg : fwMsgL) {
				CsvR causeR = (CsvR)msg.getCauseRow();
				if (isNull(causeR)) {
					msgL.add(msg);
				}
				else if (MSC_SD_ADJST_DTL_TYP.isSPPLYENT(causeR.sd_adjst_dtl_typ())) {
					msgL.add(msg);
				}
			}
			if (msgL != null && !msgL.isEmpty()) {
				message(msgL);
				return true;
			}
		}
		return false;
	}
	/**
	 * Panel[Btn]のボタン[in_file]の押下時の処理
	 */
	@Override
	public void doBtn_in_file(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();
			clearCsvData();
			readCsvFile();
			if (isReadCsvFileErr()) return;
			if (isNull(getCsvL())) {
				return ;
			}
			MCMessageList msgL = new MCMessageList();
			// 入力データのチェック
			msgL.addAll(checkCsv());
			// ファイルの取り込み
			msgL.addAll(showCsvVH());
			clearCsvData();
			showCsvInEndMsg(msgL);
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}
	protected void clearCsvData() {
		getCsvL().clear();
	}
	protected void showCsvInEndMsg(MCMessageList msgL) {
		sortMessageList(msgL);
		msgL.add(0, msgFileImported());
		messageNoSort(msgL);
	}
	protected boolean hasErrMsg(MCMessageList msgL) {
		for (MCMessage msg : msgL) {
			if (isErrMsg(msg)) {
				return true;
			}
		}
		return false;
	}
	protected boolean isErrMsg(MCMessage msg) {
		return msg.getLevel() == MCMessageLevel.ERROR
				|| msg.getLevel() == MCMessageLevel.FATAL
				|| msg.getLevel() == MCMessageLevel.PROBLEM
				|| msg.getLevel() == MCMessageLevel.WARN;
	}
	protected void readCsvFile() {
		if (isSame(getFileType(), _fileType_Csv)) {
			doCSVInAction(CsvTable);
		}
		else if (isSame(getFileType(), _fileType_Excel)) {
			doExcelInAction(CsvTable);
		}
	}
	protected String getFileType() {
		String fileType = getPgmSettingStringNE(this, _fileType_Csv, "file.type");
		if (!isSame(fileType, _fileType_Csv) && !isSame(fileType, _fileType_Excel)) {
			return _fileType_Csv;
		}
		return fileType;
	}
	protected void setCsvLabel(String col, String name) {
		MCColumnConfig cc = CsvTable.getColumnConfig("Csv." + col);
		if (cc != null) {
			cc.setMessageName(name);
		}
	}
	protected MCMessageList checkCsv() {
		MCMessageList msgL = new MCMessageList();
		MCList<Rslt1R> vFixDtlL = MCList.create(Rslt1R.class);
		for (DispRslt1R h : getDispRslt1L()) {
			if (isInptRow(h)) {
				MCList<Rslt1R> l = _grpNoVMap.get(h.grp_peg_no());
				vFixDtlL.addAll(l.subList(Rslt1R.$sd_adjst_dtl_typ, MSC_SD_ADJST_DTL_TYP.SPPLYENT.value()));
			}
		}
		String[] fixKeys = null;
		fixKeys = new String[] {
				Rslt1R.$itm_cd,
				Rslt1R.$itm_sub1,
				Rslt1R.$itm_sub2,
				Rslt1R.$itm_sub3,
				Rslt1R.$loc_cd
				};
		MCIndexKey fixIdx = vFixDtlL.createIndex(fixKeys);
		for (int i = 0; i < getCsvL().size(); i ++) {
			CsvR r = getCsvL().get(i);
			r.grp_peg_no(null);
			r.setStringNE("loc_cd", r.strg_loc_cd());
			if (!MSC_SD_ADJST_DTL_TYP.isSPPLYENT(r.sd_adjst_dtl_typ())) {
				continue;
			}
			MCList<Rslt1R> fixL = vFixDtlL.subList(fixIdx, r.toArray(fixKeys));
			if (isNull(fixL)) {
				msgL.add(new MCMessage(MSBAP0001, toFileRowNo(i),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this)
						, r.getStringNE("loc_cd")));
				continue;
			}
			Rslt1R fixR = fixL.get(0);
			r.grp_peg_no(fixR.grp_peg_no()); // 取込対象の目印
		}
		return msgL;
	}
	/**
	 * コンテナの行番号から、ファイルの行番号に変換する
	 */
	protected int toFileRowNo(int i) {
		i++;
		if (isUsedNameLine()) {
			i++;
		}
		if (isUsedTitleLine()) {
			i++;
		}
		return i;
	}
	protected MCMessageList showCsvVH() {
		MCMessageList msgL = new MCMessageList();
		for (MCList<CsvR> grpL : getCsvL().groupList(CsvR.$grp_peg_no)) {
			CsvR baseR = grpL.get(0);
			MCNumber grpPegNo = baseR.grp_peg_no();
			if (isNull(grpPegNo)) {
				continue;
			}
			// 需給調整対象外の品目については無視する
			if (!MAC_RQMT_TYP.isNON(baseR.rqmt_typ()) || !MAC_PROD_PLN_TYP.isDMND_USE(baseR.prod_pln_typ())) {
				continue;
			}
			
			MCList<DispRslt1R> hList = _grpNoHMap.get(grpPegNo);

			// 入力ファイル内の供給（入力）の画面への反映
			DispRslt1R editSplH = hList.getFirst(DispRslt1R.$sd_adjst_dtl_typ, MSC_SD_ADJST_DTL_TYP.SPPLYENT.value());
			MCList<Rslt1R> vList = _grpNoVMap.get(grpPegNo);
			for (CsvR row : grpL) {
				for (int n = 0; n < _csvQtyCols.length; n ++) {
					String numCol = _csvQtyCols[n];
					MCDate ymd = row.dmnd_dt_fr().addDay(n);
					// 入力ファイルの日付が、検索条件の範囲外のときは無視する
					if (ymd.lt(getCndR().dmnd_dt_fr())) {
						continue;
					}
					if (ymd.gt(getCndR().dmnd_dt_to())) {
						break;
					}
					MCNumber qty = row.getNumber(numCol);
					String[] keys = {Rslt1R.$sd_adjst_dtl_typ,Rslt1R.$schd_dt};
					Comparable<?>[] vals = {MSC_SD_ADJST_DTL_TYP.SPPLYENT.value(),ymd};

					Rslt1R vR = vList.getFirst(keys, vals);
					
					// 数量に変更がないときは無視する
					if (isNull(vR) || 
							(isNull(vR.schd_qty()) && isNull(qty)) || 
							(!isNull(vR.schd_qty()) && vR.schd_qty().eq(qty)) ) {
						continue;
					}
					// 供給(入力)カラムが入力不可の場合は無視する
					else if (!editSplH.getBoolean(getFlgColnm()[n])) {
						continue;
					}
					else {
						vR.schd_qty(qty);
						vR.setStatus(MCRow.MODIFY);
						copyDispRslt1InfoToRslt3(editSplH, vR);
					}
				}
			}
			// 在庫推移の再計算とグラフのリフレッシュ
			DispRslt1R dispRslt1R = DispRslt1R.create();
			dispRslt1R.itm_cd(baseR.itm_cd());
			dispRslt1R.itm_sub1(baseR.itm_sub1());
			dispRslt1R.itm_sub2(baseR.itm_sub2());
			dispRslt1R.itm_sub3(baseR.itm_sub3());
			dispRslt1R.loc_cd(baseR.strg_loc_cd());
			refreshGraph(dispRslt1R);
		}
		return msgL;
	}
	/**
	 * 在庫推移での入力を供給計画の該当項目に反映する(Import用)<br>
	 * @param info
	 */
	protected void copyDispRslt1InfoToRslt3(DispRslt1R editSplH, Rslt1R vR) {

		MCIndexKey idx = getDispRslt1L().createIndex(DispRslt1R.$itm_cd,
				DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,
				DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);

		// 供給（入力）の編集
		MCList<DispRslt1R> tgtL = MCList.create(DispRslt1R.class);
		tgtL = getDispRslt1L().subList(idx, vR.itm_cd(), vR.itm_sub1(), vR.itm_sub2(),
				vR.itm_sub3(), vR.loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLYENT.value());

		for (DispRslt1R r : tgtL) {
			int i = _dateMap.get(vR.schd_dt().toString());
			r.setNumber(getColnm()[i], vR.schd_qty());
		}
		
		DispRslt1R rslt1R = editSplH;
		DispRslt1R spplyRslt1R = DispRslt1R.create();
		MCDate dt = vR.schd_dt();

		MCIndexKey idxKey = getDispRslt1L().createIndex(getDispRslt1Keys());
		String[] keyArr = new String[] { rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd() };
		MCList<DispRslt1R> rslt1L = getDispRslt1L().subList(idxKey, keyArr);

		for (DispRslt1R r : rslt1L) {
			if (MSC_SD_ADJST_DTL_TYP.isDMND(r.sd_adjst_dtl_typ())) {
				r.check(true);
			}
			if (MSC_SD_ADJST_DTL_TYP.isSPPLY(r.sd_adjst_dtl_typ())) {
				spplyRslt1R = r;
			}
		}

		if (isNull(_Rslt3L.get(toMapKey(keyArr)))
				|| _Rslt3L.get(toMapKey(keyArr)).size() == 0) {
			int i = _dateMap.get(dt.toString());
			rslt1R.setNumber(getColnm()[i], vR.schd_qty());
			spplyRslt1R.setNumber(getColnm()[i], rslt1R.getNumber(getColnm()[i]));
			insRowToRslt3(rslt1R, dt);
		}
		else {
			MCList<Rslt3R> Rslt3L = _Rslt3L
					.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(),
							rslt1R.itm_sub3(), rslt1R.loc_cd()));
			boolean exists = false;

			for (Rslt3R Rslt3R : Rslt3L) {
				if (isSame(Rslt3R.due_dt(), dt)) {
					if (!Rslt3R.isStatusDelete()) {
						// イベントを発生させないため、コンテナに直接値を設定
						Rslt3R.itm_cd(rslt1R.itm_cd());
						Rslt3R.itm_sub1(rslt1R.itm_sub1());
						Rslt3R.itm_sub2(rslt1R.itm_sub2());
						Rslt3R.itm_sub3(rslt1R.itm_sub3());
						Rslt3R.itm_nm(rslt1R.itm_nm());
						int i = _dateMap.get(dt.toString());
						rslt1R.setNumber(getColnm()[i], vR.schd_qty());
						if (isNull(rslt1R.getNumber(getColnm()[i]))) {
							spplyRslt1R.setNumber(getColnm()[i], null);
							if (!isNull(Rslt3R.dly_sd_no())) {
								Rslt3R.setStatus(MCRow.DELETE);
							}
							else {
								Rslt3L.remove(Rslt3R);
								_Rslt3L.put(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(),
										rslt1R.itm_sub2(), rslt1R.itm_sub3(),
										rslt1R.loc_cd()), Rslt3L);
								showDlySd(rslt1R);
							}
						}
						else {
							Rslt3R.base_unit_qty(rslt1R.getNumber(getColnm()[i]));
							if (Rslt3R.base_unit_qty().gt(nvl(Rslt3R.order_reg_qty(), MCNumber.ZERO))) {
								spplyRslt1R.setNumber(getColnm()[i], Rslt3R.base_unit_qty().subtract(nvl(Rslt3R.order_reg_qty(), MCNumber.ZERO)));
							}
							else {
								spplyRslt1R.setNumber(getColnm()[i], null);
							}

							if (isSame(MCRow.NONE, Rslt3R.getStatus())) {
								Rslt3R.setStatus(MCRow.MODIFY);
							}
							_Rslt3L.put(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(),
									rslt1R.itm_sub2(), rslt1R.itm_sub3(),
									rslt1R.loc_cd()), Rslt3L);
						}
						exists = true;
						break;
					}
				}
			}

			if (!exists) {
				int i = _dateMap.get(dt.toString());
				rslt1R.setNumber(getColnm()[i], vR.schd_qty());
				spplyRslt1R.setNumber(getColnm()[i], rslt1R.getNumber(getColnm()[i]));
				insRowToRslt3(rslt1R, dt);
			}
		}
	}

	protected void insRowToRslt3(DispRslt1R rslt1R, MCDate dt) {
		Rslt3R rslt3R = Rslt3R.create();

		// イベントを発生させないため、コンテナに直接値を設定
		rslt3R.setStatus(MCRow.CREATE);
		rslt3R.itm_cd(rslt1R.itm_cd());
		rslt3R.itm_sub1(rslt1R.itm_sub1());
		rslt3R.itm_sub2(rslt1R.itm_sub2());
		rslt3R.itm_sub3(rslt1R.itm_sub3());
		rslt3R.itm_nm(rslt1R.itm_nm());
		rslt3R.base_unit_cd(rslt1R.unit_cd());
		rslt3R.base_unit_nm(rslt1R.unit_nm());
		rslt3R.base_unit_dec_place(rslt1R.dec_place());

		int i = _dateMap.get(dt.toString());
		rslt3R.base_unit_qty(rslt1R.getNumber(getColnm()[i]));
		rslt3R.strg_loc_cd(rslt1R.loc_cd());
		rslt3R.strg_loc_nm(rslt1R.loc_nm());
		rslt3R.strg_wg_cd(rslt1R.wg_cd());
		rslt3R.strg_wg_nm(rslt1R.wg_nm());
		rslt3R.due_dt(dt);

		String[] keyArr = new String[] { rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd() };
		MCList<Rslt3R> tmpL = _Rslt3L.get(toMapKey(keyArr));
		if (isNull(tmpL)) {
			tmpL = MCList.create(Rslt3R.class);
		}
		tmpL.add(rslt3R);
		_Rslt3L.put(toMapKey(keyArr), tmpL);
		if (!isNull(getRslt3L())) {
			Rslt3R tmpRslt3R = getRslt3L().get(0);
			if (tmpRslt3R.itm_cd().equals(rslt3R.itm_cd())
					&& tmpRslt3R.itm_sub1().equals(rslt3R.itm_sub1())
					&& tmpRslt3R.itm_sub2().equals(rslt3R.itm_sub2())
					&& tmpRslt3R.itm_sub3().equals(rslt3R.itm_sub3())
					&& tmpRslt3R.strg_loc_cd().equals(rslt3R.strg_loc_cd())) {
				getRslt3L().add(rslt3R);
			}
		}
		else {
			getRslt3L().add(rslt3R);
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0150(MCEventInfo info) {
		DispRslt1R rslt1R = DispRslt1Table.getSelectedMCRow();

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0150");
		mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg dmndRecStsSrch = (mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP0150.CndR to = mcframe.clientMSBC.MSBCP0150.CndR.create();
		to.ope(dmndRecStsSrch.Cnd_ope_INT.getActionCommand());
		if(isNull(rslt1R)) {
			to.wg_cd(getCndR().wg_cd());
		}
		else {
			to.wg_cd(rslt1R.wg_cd());
		}
		to.sim_mrp_no(getCndR().sim_mrp_no());
		to.sim_mrp_typ(MSC_SIM_MRP_TYP.SD_ADJST.value());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Rslt4Btn]のボタン[rfrct]の押下時の処理
	 */
	@Override
	public void doRslt4Btn_rfrct(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();
			simItmOrderRfrct();
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}
	}

	/**
	 * シミュレーションオーダを供給計画にコピー
	 */
	protected void simItmOrderRfrct() {
		if(getRslt4L().subList(Rslt4R.$check, true).size() == 0) {
			message(new MCMessage(MAUDP0038));
			return;
		}

		Rslt3R bakRslt3R = null;
		MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd,
				DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,
				DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
		DispRslt1R rslt1R = DispRslt1Table.getSelectedMCRow();
		if(isNull(rslt1R)) {
			rslt1R = _bakRslt1R;
			if(isNull(rslt1R)) {
				return;
			}
		}
		String[] keyArr = new String[] { rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd() };
		List<Comparable<?>> mapKey = toMapKey(keyArr);

		DispRslt1R tgtRslt1R = getDispRslt1L().getFirst(idxKey, rslt1R.itm_cd(),
				rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd(),
				MSC_SD_ADJST_DTL_TYP.DMND.value());
		tgtRslt1R.check(true);

		for(Rslt4R r : getRslt4L().subList(Rslt4R.$check, true)) {
			Rslt3R rslt3R = insertRow(Rslt3Table);
			bakRslt3R = rslt3R;
			rslt3R.base_unit_qty(r.inst_qty());
			rslt3R.due_dt(r.due_dt());
			rslt3R.itm_cd(rslt1R.itm_cd());
			rslt3R.itm_sub1(rslt1R.itm_sub1());
			rslt3R.itm_sub2(rslt1R.itm_sub2());
			rslt3R.itm_sub3(rslt1R.itm_sub3());
			rslt3R.itm_nm(rslt1R.itm_nm());
			rslt3R.sno1_mng_typ(rslt1R.sno1_mng_typ());
			rslt3R.sno2_mng_typ(rslt1R.sno2_mng_typ());
			rslt3R.sno3_mng_typ(rslt1R.sno3_mng_typ());
			rslt3R.sno4_mng_typ(rslt1R.sno4_mng_typ());
			rslt3R.sno1(r.sno1());
			rslt3R.sno2(r.sno2());
			rslt3R.sno3(r.sno3());
			rslt3R.sno4(r.sno4());
			rslt3R.strg_loc_cd(rslt1R.loc_cd());
			rslt3R.strg_loc_nm(rslt1R.loc_nm());
			rslt3R.strg_wg_cd(rslt1R.wg_cd());
			rslt3R.strg_wg_nm(rslt1R.wg_nm());
			rslt3R.base_unit_cd(rslt1R.unit_cd());
			rslt3R.base_unit_nm(rslt1R.unit_nm());
			rslt3R.base_unit_dec_place(rslt1R.dec_place());
			if(getRslt4BtnR().rqst_inc_flg()) {
				rslt3R.mfg_loc_cd(r.mfg_loc_cd());
				rslt3R.mfg_loc_nm(r.mfg_loc_nm());
				rslt3R.sppl_cd(r.sppl_cd());
				rslt3R.sppl_nm(r.sppl_nm());
				rslt3R.rqst_loc_cd(r.rqst_loc_cd());
				rslt3R.rqst_loc_nm(r.rqst_loc_nm());
				rslt3R.rqst_wg_cd(r.rqst_wg_cd());
				rslt3R.rqst_wg_nm(r.rqst_wg_nm());
			}

			rslt3R.setStatus(MCRow.CREATE);
			MCList<Rslt3R> tmpL = _Rslt3L.get(mapKey);
			if(isNull(tmpL)) {
				tmpL = MCList.create(rslt3R);
			}
			tmpL.add(rslt3R);
			_Rslt3L.put(mapKey, tmpL);

			copyRslt3ToDispRslt1(rslt3R, true, false, idxKey);
		}
		if(!isNull(bakRslt3R)) {
			refreshGraph(bakRslt3R);
		}
	}
	/**
	 * Panel[Rslt2Hdr]のボタン[openGraph]の押下時の処理
	 */
	@Override
	public void doRslt2Hdr_openGraph(MCEventInfo info) {
		if(_outerGraph == null) {
			_outerGraph = new MCFXGraph();
			// 外部グラフを使う場合はgraphDelegate必須
			_outerGraph.setGraphDelegate(this);

			MCList<Rslt1R> list = _rslt1L;

			_outerGraph.setSameAxis(true);

			// 外部に表示する場合のinitメソッド
			_outerGraph.initOuterGraphControl(
					this // 呼び出しパネル
					,_graphTitle // グラフタイトル
					,_graphTypeList // グラフタイプ
					,_graphColorList // グラフカラー
					,list // MCListを指定
					,Arrays.asList(_labelColumnList) // グラフのラベルになるカラム名を指定
					,_labelColumnName // グラフのラベルカラム名
					,Arrays.asList(_valueColumns) // グラフのデータになるカラムを指定
					,Arrays.asList(_valueColumnsName) // グラフの数値カラム名
					,_valueLabel // Y軸の表示ラベル
			);
		}
	}
	/**
	 * Panel[Rslt1Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_select_all(MCEventInfo info) {
		doSelectAll(DispRslt1Table);
	}
	/**
	 * Panel[Rslt1Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_deselect_all(MCEventInfo info) {
		doDeselectAll(DispRslt1Table);
	}
	/**
	 * Panel[Rslt4Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doRslt4Btn_select_all(MCEventInfo info) {
		doSelectAll(Rslt4Table);
	}
	/**
	 * Panel[Rslt4Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doRslt4Btn_deselect_all(MCEventInfo info) {
		doDeselectAll(Rslt4Table);
	}
	/**
	 * [MS_MSBAL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0050_Srch01Caller<P extends MSBAP_SdAdjst, B extends MS_MSBAL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0050_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDispRslt1L());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_dmnd_dt_fr, Cnd_dmnd_dt_to));
			msgList.addAll(checkAtLeastOne(Cnd_adjst_tgt_flg, Cnd_adjst_not_tgt_flg));

			if (Cnd_ope_MON.isSelected()) {
				// 検索する期間(月)が範囲内であること
				MCDate endDt = getCndR().dmnd_dt_to();
				MCDate stDt = getCndR().dmnd_dt_fr();
				if (!isNull(stDt) && !isNull(endDt)
						&& (endDt.diffMonth(stDt) >= _max_month_duration)) {
					MCMessage msg = new MCMessage(getCndR(), CndR.$dmnd_dt_fr, MSUCP0002);
					msgList.add(msg);
				}
			}
			else {
				// 検索する期間(日)が範囲内であること
				MCDate endDt = getCndR().dmnd_dt_to();
				MCDate stDt = getCndR().dmnd_dt_fr();
				if (!isNull(stDt) && !isNull(endDt)
						&& (endDt.diffDay(stDt) >= _max_day_duration)) {
					MCMessage msg = new MCMessage(getCndR(), CndR.$dmnd_dt_fr, MSUCP0102);
					msgList.add(msg);
				}
			}
		}

		@Override
		protected void clear() {
			super.clear();

			getDispRslt1L().clear();
			clearCacheVH();
			clearHiddenList();
		}

		@Override
		protected void show() {
			super.show();

			setHiddenList(bridge.down0());
			setHiddenList(bridge.down1(), bridge.down2(), bridge.down3());
			showSub();
			showVH();
			calcStk(null);
			// シミュレーション結果自動反映
			simItmOrderAutoRfrct();
		}

		protected void showSub() {
			// 検索時点の開始日終了日の保持
			getCopyCndR().dmnd_dt_fr(getCndR().dmnd_dt_fr());
			getCopyCndR().dmnd_dt_to(getCndR().dmnd_dt_to());
		}

		protected void showVH() {
			// グループを識別する番号を設定する
			showVHEditVList();

			// 可変カラムのラベル名を設定する
			showVHInitColInfo();

			// 縦横変換処理を実行する
			_vhM.convertVH(getRslt1L(), _vhM.getCachedHAllL());

			// 縦横変換した後の横データを加工する
			showVHEditHList();

			// 横データを表示する
			_vhM.doTableDispChange();
		}

		protected void showVHEditVList() {
			MCNumber grpPegNo = MCNumber.ZERO;
			for (MCList<Rslt1R> l : getRslt1L().groupList(getRslt1Keys())) {
				grpPegNo = grpPegNo.add(1);
				for (Rslt1R r : l) {
					r.grp_peg_no(grpPegNo);
				}
				_grpNoVMap.put(grpPegNo, l);
			}
		}

		protected void showVHInitColInfo() {
			// 可変カラムを識別するための値（縦リストの「VH_KEY」が「ELM」の項目の値）と可変カラムのラベル名を設定する
			MCList<MCRow> dtList = MCList.create(MCRow.class);
			MCDate frDt = getCopyCndR().dmnd_dt_fr();
			MCDate toDt = getCopyCndR().dmnd_dt_to();
			if (Cnd_ope_MON.isSelected()) {
				frDt = MAUCP_DateUtil.getPeriodStDt(getCopyCndR().dmnd_dt_fr(),
						MAC_PERIOD_TYP.MONTHLY.value(), getCo().ac_cl_day());
				toDt = MAUCP_DateUtil.getPeriodEndDt(getCopyCndR().dmnd_dt_to(),
						MAC_PERIOD_TYP.MONTHLY.value(), getCo().ac_cl_day());
			}
			for (int i = 0; i <= _max_day_duration; i++) {
				MCDate dt = null;
				if (Cnd_ope_MON.isSelected()) {
					if (i == 0) {
						dt = frDt.addDay(i - 1);
					}
					else {
						dt = frDt.addMonth(i - 1);
					}
				}
				else {
					dt = frDt.addDay(i - 1);
				}
				if (dt.gt(toDt)) {
					break;
				}
				MCRow o = dtList.createRow();
				// 可変カラムを識別するための値を設定する
				o.setDateNE(Rslt1R.$schd_dt, dt);
				// 可変カラムのラベル名を設定する
				if(i == 0) {
					if (Cnd_ope_MON.isSelected()) {
						o.setStringNE(MAUCP_VHMapper.ELM_LABEL,
								getDispString("label_term").concat(toY2MString(dt)));
					}
					else {
						o.setStringNE(MAUCP_VHMapper.ELM_LABEL,
								getDispString("label_term").concat(toY2MDString(dt)));
					}
				}
				else {
					if (Cnd_ope_MON.isSelected()) {
						o.setStringNE(MAUCP_VHMapper.ELM_LABEL, toY2MString(dt));
					}
					else {
						o.setStringNE(MAUCP_VHMapper.ELM_LABEL, toY2MDString(dt));
					}
				}
				dtList.add(o);
			}
			MCRow o = dtList.createRow();
			MCDate dt = null;
			if (!Cnd_ope_MON.isSelected()) {
				dt = toDt.addDay(1);
				o.setDateNE(Rslt1R.$schd_dt, dt);
				o.setStringNE(MAUCP_VHMapper.ELM_LABEL,
						toY2MDString(dt).concat(getDispString("label_term")));
				dtList.add(o);
			}

			_vhM.initColInfo(dtList);

			MCDate fr_dt = null;
			long pt = 0;
			if (Cnd_ope_MON.isSelected()) {
				fr_dt = frDt;
				pt = toDt.diffMonth(fr_dt) + 1;
			}
			else {
				fr_dt = frDt;
				pt = toDt.diffDay(fr_dt) + 1;
			}

			for (int i = 0; i <= pt; i++) {
				MCDate tmpDate = fr_dt.addDay(i-1);
				_colMap.put(getQtys()[i].getBaseRowColumnName(), tmpDate);
				_dateMap.put(tmpDate.toString(), i);
				_dateMap2.put(tmpDate, getQtys()[i]);
				if(!isSame(i, 0)) {
					_editableFlgMap.put(tmpDate, getFlgs()[i-1]);
				}
			}
		}

		protected void showVHEditHList() {
			MCList<DispRslt1R> hList = _vhM.getCachedHAllL();
			for (DispRslt1R r : hList) {
				if(MSC_SD_ADJST_DTL_TYP.isDMND(r.sd_adjst_dtl_typ())) {
					r.disp_itm(r.itm_nm());
					r.disp_loc(r.loc_nm());
					r.disp_wg(r.wg_nm());
				}
				else if(MSC_SD_ADJST_DTL_TYP.isSPLN(r.sd_adjst_dtl_typ())) {
					r.disp_itm(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), panel));
					r.disp_loc(r.loc_cd());
					r.disp_wg(r.wg_cd());
				}
				else if(MSC_SD_ADJST_DTL_TYP.isGI(r.sd_adjst_dtl_typ())) {
					if(!getCndR().dmndDtl()) {
						r.disp_itm(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), panel));
						r.disp_loc(r.loc_cd());
						r.disp_wg(r.wg_cd());
					}
				}

				// 入力可能
				if(isInptRow(r)) {
					MCDate dt = getCopyCndR().dmnd_dt_fr().addDay(-1);
					MCDate endDt = getCopyCndR().dmnd_dt_to().addDay(1);
					int i = 0;

					for(MCColumnConfig qtyCol : getQtys()) {
						if(qtyCol != columnDispRslt1_qty00 && qtyCol != columnDispRslt1_qty499) {
							if(dt.addDay(i).lt(endDt)) {
								setEditableQtyCol(r, dt.addDay(i), qtyCol);
							}
						}
						i++;
					}
				}
			}

			crtGrpNoHCache(hList);
		}

		protected void crtGrpNoHCache(MCList<DispRslt1R> hList) {
			MCSortPolicy sp = crtSortVH();
			for (MCList<DispRslt1R> l : hList.groupList(DispRslt1R.$grp_peg_no)) {
				l.sort(sp);
				_grpNoHMap.put(l.get(0).grp_peg_no(), l);
			}
		}

		/**
		 * シミュレーションオーダを検索時に供給計画に自動一括反映
		 */
		protected void simItmOrderAutoRfrct() {
			if (!getCndR().sim_auto_ref_flg()) {
				return;
			}

			Rslt3R bakRslt3R = null;
			MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd,
					DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,
					DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);

			for (Rslt4R r : bridge.down2()) {
				DispRslt1R rslt1R = getDispRslt1L().getFirst(idxKey, r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd(),
						MSC_SD_ADJST_DTL_TYP.DMND.value());
				if (isNull(rslt1R)) {
					continue;
				}
				String[] keyArr = new String[] {
						rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(),
						rslt1R.itm_sub3(), rslt1R.loc_cd()
				};
				List<Comparable<?>> mapKey = toMapKey(keyArr);

				rslt1R.check(true);
				Rslt3R rslt3R = insertRow(Rslt3Table);
				bakRslt3R = rslt3R;
				rslt3R.base_unit_qty(r.inst_qty());
				rslt3R.due_dt(r.due_dt());
				rslt3R.itm_cd(rslt1R.itm_cd());
				rslt3R.itm_sub1(rslt1R.itm_sub1());
				rslt3R.itm_sub2(rslt1R.itm_sub2());
				rslt3R.itm_sub3(rslt1R.itm_sub3());
				rslt3R.itm_nm(rslt1R.itm_nm());
				rslt3R.sno1_mng_typ(rslt1R.sno1_mng_typ());
				rslt3R.sno2_mng_typ(rslt1R.sno2_mng_typ());
				rslt3R.sno3_mng_typ(rslt1R.sno3_mng_typ());
				rslt3R.sno4_mng_typ(rslt1R.sno4_mng_typ());
				rslt3R.sno1(r.sno1());
				rslt3R.sno2(r.sno2());
				rslt3R.sno3(r.sno3());
				rslt3R.sno4(r.sno4());
				rslt3R.strg_loc_cd(rslt1R.loc_cd());
				rslt3R.strg_loc_nm(rslt1R.loc_nm());
				rslt3R.strg_wg_cd(rslt1R.wg_cd());
				rslt3R.strg_wg_nm(rslt1R.wg_nm());
				rslt3R.base_unit_cd(rslt1R.unit_cd());
				rslt3R.base_unit_nm(rslt1R.unit_nm());
				rslt3R.base_unit_dec_place(rslt1R.dec_place());
				if (getCndR().rqst_inc_flg()) {
					rslt3R.mfg_loc_cd(r.mfg_loc_cd());
					rslt3R.mfg_loc_nm(r.mfg_loc_nm());
					rslt3R.sppl_cd(r.sppl_cd());
					rslt3R.sppl_nm(r.sppl_nm());
					rslt3R.rqst_loc_cd(r.rqst_loc_cd());
					rslt3R.rqst_loc_nm(r.rqst_loc_nm());
					rslt3R.rqst_wg_cd(r.rqst_wg_cd());
					rslt3R.rqst_wg_nm(r.rqst_wg_nm());
				}
				rslt3R.setStatus(MCRow.CREATE);
				MCList<Rslt3R> tmpL = _Rslt3L.get(mapKey);
				if (isNull(tmpL)) {
					tmpL = MCList.create(rslt3R);
				}
				tmpL.add(rslt3R);
				_Rslt3L.put(mapKey, tmpL);

				copyRslt3ToDispRslt1(rslt3R, true, false, idxKey);
			}
			// 在庫推移の再計算とグラフのリフレッシュ
			for (Rslt4R r : bridge.down2().groupBy(Rslt4R.$itm_cd, Rslt4R.$itm_sub1,
					Rslt4R.$itm_sub2, Rslt4R.$itm_sub3, Rslt4R.$strg_loc_cd)) {
				Rslt3R rslt3R = Rslt3R.create();
				rslt3R.itm_cd(r.itm_cd());
				rslt3R.itm_sub1(r.itm_sub1());
				rslt3R.itm_sub2(r.itm_sub2());
				rslt3R.itm_sub3(r.itm_sub3());
				rslt3R.strg_loc_cd(r.strg_loc_cd());
				refreshGraph(rslt3R);
			}
			// 次回検索時に、再度シミュレーションレコードが自動反映されないように、検索条件をクリア
			getCndR().sim_auto_ref_flg(false);
			getCndR().rqst_inc_flg(false);
		}


		@Override
		protected void adjustList() {
			super.adjustList();

			DispRslt1Table.adjustWidth();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			if (Cnd_ope_MON.isSelected()) {
				panel.setDividerLocation("StkTab", 2, true);
				panel.setDividerLocation("SpplyTab", 0, false);
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();

			getRslt2HdrR().itm_cd(null);
			getRslt2HdrR().itm_sub1(null);
			getRslt2HdrR().itm_sub2(null);
			getRslt2HdrR().itm_sub3(null);
			getRslt2HdrR().itm_nm(null);
			getRslt2HdrR().loc_cd(null);
			getRslt2HdrR().loc_nm(null);

			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
		}
	}

	/**
	 * [MS_MSBAL0050_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0050_Srch02Caller<P extends MSBAP_SdAdjst, B extends MS_MSBAL0050_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0050_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_dmnd_dt_fr, Cnd_dmnd_dt_to));
			msgList.addAll(checkAtLeastOne(Cnd_adjst_tgt_flg, Cnd_adjst_not_tgt_flg));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();

			panel.setDividerLocation("StkTab", 0, false);
			panel.setDividerLocation("SpplyTab", saveLoc2, true);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBAL0050_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0050_Upd01Caller<P extends MSBAP_SdAdjst, B extends MS_MSBAL0050_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		// チェック対象のリスト
		protected MCList<DispRslt1R> _Rslt1LForCall = MCList.create(DispRslt1R.class);
		protected MCList<Rslt3R> _Rslt3LForCall = MCList.create(Rslt3R.class);

		protected MS_MSBAL0050_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			// 裏リストを差し替える
			setHiddenList();

			_Rslt1LForCall = getDispRslt1L().subList(DispRslt1R.$check, true);
			for(DispRslt1R r : _Rslt1LForCall) {
				String[] keyArr = new String[] {
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd()
				};
				MCList<Rslt3R> tmpL = _Rslt3L.get(toMapKey(keyArr));
				if(isNull(tmpL)) {
					continue;
				}
				for(Rslt3R rslt3R : tmpL) {
					if(!rslt3R.isStatusNone()) {
						_Rslt3LForCall.add(rslt3R);
					}
				}
			}

			// 非表示リストのブロックにGUIIndexを連番で設定
			for(int i=0; i < _Rslt3LForCall.size(); i++) {
				_Rslt3LForCall.get(i).setGUIIndex(i);
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			bridge.up0().setAll(_Rslt1LForCall);
			bridge.up1().setAll(_Rslt3LForCall);
		}

		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(1, _Rslt3LForCall);
			return result;
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(1, _Rslt3LForCall);
			return result;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 下段は正しくGUIInedexが付与されていないため、上段のみチェック
			checkReqSub(msgList, getRslt1L());
		}

		@Override
		protected void show() {
			super.show();

			DispRslt1R rslt1R = DispRslt1Table.getSelectedMCRow();
			showDlySd(rslt1R);
			setModeChg();
			setBtnMode();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_MON.isSelected()) {
			callMS_MSBAL0050_Srch01();
		}
		else if(Cnd_ope_REF.isSelected()) {
			callMS_MSBAL0050_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if(Cnd_ope_REF.isSelected()) {
			createMS_MSBAL0050_Srch02().execDL();
		}
	}
	/**
	 * Panel[Rslt3Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doRslt3Btn_radd(MCEventInfo info) {
		Rslt3R Rslt3R = insertRow(Rslt3Table);

		doRslt3_radd_sub(Rslt3R);
	}

	/**
	 * 供給計画一覧の行追加ボタン押下時処理
	 * @param Rslt3R
	 */
	protected void doRslt3_radd_sub(Rslt3R Rslt3R) {
		if(isNull(Rslt3R)) {
			return;
		}

		DispRslt1R rslt1R = DispRslt1Table.getSelectedMCRow();
		if(isNull(rslt1R)) {
			rslt1R = _bakRslt1R;
			if(isNull(rslt1R)) {
				return;
			}
		}
		Rslt3R.itm_cd(rslt1R.itm_cd());
		Rslt3R.itm_sub1(rslt1R.itm_sub1());
		Rslt3R.itm_sub2(rslt1R.itm_sub2());
		Rslt3R.itm_sub3(rslt1R.itm_sub3());
		Rslt3R.itm_nm(rslt1R.itm_nm());
		Rslt3R.sno1_mng_typ(rslt1R.sno1_mng_typ());
		Rslt3R.sno2_mng_typ(rslt1R.sno2_mng_typ());
		Rslt3R.sno3_mng_typ(rslt1R.sno3_mng_typ());
		Rslt3R.sno4_mng_typ(rslt1R.sno4_mng_typ());
		Rslt3R.strg_loc_cd(rslt1R.loc_cd());
		Rslt3R.strg_loc_nm(rslt1R.loc_nm());
		Rslt3R.strg_wg_cd(rslt1R.wg_cd());
		Rslt3R.strg_wg_nm(rslt1R.wg_nm());
		Rslt3R.base_unit_cd(rslt1R.unit_cd());
		Rslt3R.base_unit_nm(rslt1R.unit_nm());
		Rslt3R.base_unit_dec_place(rslt1R.dec_place());

		// 対象日のみ表示の場合は期間開始日をデフォルト設定する
		if(getCndR().selectDlyDisp()) {
			Rslt3R.due_dt(getCopyCndR().dmnd_dt_fr());
		}

		String[] keyArr = new String[] { Rslt3R.itm_cd(), Rslt3R.itm_sub1(), Rslt3R.itm_sub2(), Rslt3R.itm_sub3(), Rslt3R.strg_loc_cd() };
		MCList<Rslt3R> tmpL = _Rslt3L.get(toMapKey(keyArr));
		if(isNull(tmpL)) {
			tmpL = MCList.create(Rslt3R);
		}
		tmpL.add(Rslt3R);
		_Rslt3L.put(toMapKey(Rslt3R.itm_cd(), Rslt3R.itm_sub1(), Rslt3R.itm_sub2(), Rslt3R.itm_sub3(), Rslt3R.strg_loc_cd()), tmpL);
	}

	/**
	 * Panel[Rslt3Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doRslt3Btn_rdel(MCEventInfo info) {
		Rslt3R Rslt3R = deleteRow(Rslt3Table);

		doRslt3_rdel_sub(Rslt3R);
		setBtnMode();
	}

	/**
	 * 供給計画一覧の行削除ボタン押下時処理
	 * @param Rslt3R
	 */
	protected void doRslt3_rdel_sub(Rslt3R rslt3R) {
		if(isNull(rslt3R)) {
			return;
		}

		if(isNull(rslt3R.due_dt())) {
			return;
		}

		int i = _dateMap.get(rslt3R.due_dt().toString());

		MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd, DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3, DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
		DispRslt1R rslt1R = getDispRslt1L().getFirst(idxKey, rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLYENT.value());
		DispRslt1R spplyRslt1R = getDispRslt1L().getFirst(idxKey, rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLY.value());

		if(isNull(rslt1R) || isNull(spplyRslt1R)) {
			return;
		}

		MCNumber bfQty = MCNumber.ZERO;
		MCNumber bfSpplyQty = MCNumber.ZERO;
		if(!isNull(rslt1R.getNumber(getColnm()[i]))) {
			bfQty = rslt1R.getNumber(getColnm()[i]);
		}
		if(!isNull(spplyRslt1R.getNumber(getColnm()[i]))) {
			bfSpplyQty = spplyRslt1R.getNumber(getColnm()[i]);
		}

		if(rslt3R.isStatusDelete() || rslt3R.isStatusCreate()) {
			rslt1R.setNumber(getColnm()[i], bfQty.subtract(rslt3R.base_unit_qty()));
			if(nvl(rslt3R.base_unit_qty(), MCNumber.ZERO).gt(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))) {
				spplyRslt1R.setNumber(getColnm()[i], bfSpplyQty.subtract(nvl(rslt3R.base_unit_qty(), MCNumber.ZERO).subtract(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))));
			}
		}
		else {
			rslt1R.setNumber(getColnm()[i], bfQty.add(rslt3R.base_unit_qty()));
			if(nvl(rslt3R.base_unit_qty(), MCNumber.ZERO).gt(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))) {
				spplyRslt1R.setNumber(getColnm()[i], bfSpplyQty.add(nvl(rslt3R.base_unit_qty(), MCNumber.ZERO).subtract(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))));
			}
		}

		MCIndexKey rslt3IdxKey = getRslt3L().createIndex(Rslt3R.$itm_cd, Rslt3R.$itm_sub1, Rslt3R.$itm_sub2, Rslt3R.$itm_sub3, Rslt3R.$strg_loc_cd, Rslt3R.$due_dt);
		MCList<Rslt3R> Rslt3L = getRslt3L().subList(rslt3IdxKey, rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), rslt3R.due_dt());
		if(isNull(Rslt3L)) {
			return;
		}
		int cnt = Rslt3L.size() - Rslt3L.subList(Status.DELETE).size();
		if(cnt > 1) {
			rslt1R.setBoolean(getFlgColnm()[i-1], false);
		}
		else {
			rslt1R.setBoolean(getFlgColnm()[i-1], true);
		}

		calcStk(rslt1R);

		MCList<Rslt1R> tmpL = _bakRslt1L.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()));
		_rslt1L.setAll(tmpL);
		// 在庫推移グラフの表示をリフレッシュ
		_innerGraph.refreshGraph();
		if(_outerGraph != null) {
			_outerGraph.refreshGraph();
		}
	}


	/**
	 * Panel[Rslt3Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doRslt3Btn_rcopy(MCEventInfo info) {
		doRslt3_rcopy_sub();
	}

	/**
	 * 供給計画一覧の行コピーボタン押下時処理
	 * @return
	 */
	protected Rslt3R doRslt3_rcopy_sub() {

		Rslt3R cpRow = doRcopyCommon(Rslt3Table);
		if (isNull(cpRow)) {
			return null;
		}

		cpRow.dly_sd_no(null);
		cpRow.dly_sd_upd_cntr(null);
		cpRow.fix_flg(false);
		cpRow.order_reg_qty(MCNumber.ZERO);
		cpRow.old_base_unit_qty(null);
		cpRow.old_due_dt(null);
		cpRow.old_mfg_loc_cd(null);
		cpRow.old_mfg_loc_nm(null);
		cpRow.old_sppl_cd(null);
		cpRow.old_sppl_nm(null);
		cpRow.old_rqst_loc_cd(null);
		cpRow.old_rqst_loc_nm(null);
		cpRow.old_rqst_wg_cd(null);
		cpRow.old_rqst_wg_nm(null);

		String[] keyArr = new String[] { cpRow.itm_cd(), cpRow.itm_sub1(), cpRow.itm_sub2(), cpRow.itm_sub3(), cpRow.strg_loc_cd() };
		MCList<Rslt3R> hiddenList = _Rslt3L.get(toMapKey(keyArr));
		if(isNull(hiddenList)) {
			hiddenList = MCList.create(Rslt3R.class);
		}
		hiddenList.add(cpRow);
		_Rslt3L.put(toMapKey(keyArr), hiddenList);

		MCIndexKey idxkey = getDispRslt1L().createIndex(getDispRslt1Keys());
		MCList<DispRslt1R> rslt1L = getDispRslt1L().subList(idxkey, keyArr);
		MCIndexKey idxKey2 = getDispRslt1L().createIndex(DispRslt1R.$itm_cd,
				DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,
				DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
		for(DispRslt1R r : rslt1L) {
			if(MSC_SD_ADJST_DTL_TYP.isDMND(r.sd_adjst_dtl_typ())) {
				setValueEx(columnDispRslt1_check, r.getGUIIndex(), true);

				copyRslt3ToDispRslt1(cpRow, true, true, idxKey2);

				calcStk(r);

				MCList<Rslt1R> tmpL = _bakRslt1L.get(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd()));
				_rslt1L.setAll(tmpL);
				// 在庫推移グラフの表示をリフレッシュ
				_innerGraph.refreshGraph();
				if(_outerGraph != null) {
					_outerGraph.refreshGraph();
				}
			}
		}

		setBtnMode();

		return cpRow;
	}

	/**
	 * 行コピー共通処理<BR>
	 * @param <R>
	 * @param table 行コピー対象テーブル
	 * @return
	 */
	protected <R extends Rslt3R> R doRcopyCommon(MCTable<R> table) {

		if (table.getSelectedMCRow() == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		R cpRow = copyRow(table);
		if (isNull(cpRow)) {
			return null;
		}

		return cpRow;
	}


	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBAL0050_Upd01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		DispRslt1_qty00_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty01_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty02_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty03_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty04_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty05_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty06_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty07_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty08_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty09_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty10_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty11_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty12_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty13_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty14_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty15_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty16_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty17_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty18_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty19_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty20_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty21_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty22_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty23_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty24_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty25_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty26_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty27_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty28_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty29_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty30_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty31_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty32_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty33_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty34_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty35_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty36_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty37_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty38_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty39_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty40_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty41_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty42_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty43_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty44_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty45_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty46_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty47_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty48_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty49_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty50_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty51_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty52_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty53_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty54_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty55_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty56_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty57_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty58_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty59_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty60_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty61_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty62_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty63_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty64_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty65_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty66_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty67_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty68_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty69_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty70_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty71_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty72_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty73_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty74_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty75_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty76_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty77_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty78_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty79_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty80_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty81_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty82_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty83_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty84_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty85_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty86_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty87_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty88_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty89_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty90_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty91_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty92_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty93_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty94_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty95_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty96_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty97_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty98_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty99_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty100_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty101_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty102_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty103_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty104_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty105_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty106_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty107_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty108_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty109_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty110_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty111_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty112_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty113_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty114_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty115_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty116_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty117_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty118_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty119_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty120_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty121_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty122_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty123_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty124_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty125_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty126_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty127_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty128_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty129_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty130_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty131_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty132_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty133_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty134_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty135_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty136_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty137_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty138_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty139_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty140_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty141_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty142_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty143_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty144_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty145_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty146_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty147_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty148_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty149_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty150_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty151_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty152_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty153_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty154_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty155_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty156_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty157_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty158_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty159_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty160_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty161_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty162_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty163_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty164_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty165_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty166_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty167_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty168_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty169_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty170_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty171_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty172_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty173_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty174_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty175_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty176_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty177_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty178_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty179_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty180_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty181_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty182_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty183_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty184_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty185_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty186_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty187_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty188_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty189_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty190_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty191_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty192_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty193_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty194_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty195_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty196_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty197_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty198_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty199_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty200_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty201_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty202_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty203_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty204_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty205_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty206_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty207_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty208_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty209_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty210_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty211_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty212_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty213_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty214_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty215_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty216_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty217_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty218_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty219_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty220_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty221_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty222_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty223_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty224_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty225_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty226_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty227_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty228_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty229_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty230_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty231_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty232_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty233_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty234_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty235_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty236_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty237_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty238_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty239_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty240_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty241_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty242_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty243_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty244_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty245_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty246_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty247_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty248_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty249_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty250_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty251_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty252_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty253_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty254_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty255_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty256_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty257_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty258_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty259_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty260_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty261_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty262_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty263_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty264_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty265_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty266_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty267_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty268_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty269_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty270_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty271_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty272_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty273_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty274_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty275_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty276_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty277_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty278_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty279_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty280_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty281_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty282_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty283_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty284_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty285_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty286_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty287_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty288_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty289_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty290_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty291_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty292_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty293_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty294_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty295_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty296_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty297_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty298_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty299_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty300_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty301_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty302_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty303_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty304_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty305_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty306_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty307_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty308_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty309_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty310_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty311_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty312_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty313_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty314_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty315_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty316_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty317_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty318_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty319_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty320_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty321_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty322_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty323_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty324_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty325_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty326_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty327_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty328_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty329_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty330_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty331_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty332_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty333_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty334_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty335_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty336_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty337_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty338_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty339_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty340_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty341_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty342_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty343_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty344_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty345_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty346_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty347_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty348_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty349_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty350_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty351_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty352_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty353_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty354_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty355_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty356_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty357_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty358_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty359_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty360_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty361_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty362_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty363_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty364_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty365_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty366_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty367_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty368_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty369_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty370_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty371_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty372_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty373_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty374_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty375_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty376_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty377_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty378_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty379_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty380_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty381_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty382_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty383_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty384_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty385_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty386_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty387_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty388_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty389_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty390_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty391_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty392_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty393_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty394_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty395_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty396_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty397_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty398_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty399_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty400_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty401_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty402_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty403_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty404_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty405_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty406_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty407_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty408_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty409_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty410_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty411_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty412_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty413_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty414_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty415_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty416_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty417_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty418_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty419_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty420_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty421_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty422_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty423_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty424_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty425_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty426_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty427_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty428_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty429_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty430_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty431_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty432_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty433_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty434_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty435_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty436_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty437_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty438_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty439_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty440_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty441_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty442_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty443_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty444_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty445_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty446_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty447_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty448_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty449_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty450_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty451_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty452_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty453_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty454_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty455_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty456_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty457_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty458_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty459_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty460_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty461_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty462_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty463_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty464_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty465_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty466_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty467_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty468_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty469_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty470_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty471_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty472_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty473_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty474_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty475_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty476_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty477_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty478_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty479_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty480_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty481_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty482_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty483_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty484_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty485_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty486_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty487_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty488_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty489_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty490_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty491_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty492_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty493_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty494_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty495_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty496_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty497_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty498_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);
		DispRslt1_qty499_p_PPanel.setRelateBeans(columnDispRslt1_unit_cd, columnDispRslt1_dec_place);

		Rslt3_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt3_itm_cd, columnRslt3_itm_sub1, columnRslt3_itm_sub2,
				columnRslt3_itm_sub3, columnRslt3_sno1_mng_typ, columnRslt3_sno2_mng_typ,
				columnRslt3_sno3_mng_typ, columnRslt3_sno4_mng_typ);
		Rslt3_base_unit_qty_p_PPanel.setRelateBeans(columnRslt3_base_unit_cd, columnRslt3_base_unit_dec_place);
		Rslt3_order_reg_qty_p_PPanel.setRelateBeans(columnRslt3_base_unit_cd, columnRslt3_base_unit_dec_place);
		Rslt3_old_base_unit_qty_p_PPanel.setRelateBeans(columnRslt3_base_unit_cd, columnRslt3_base_unit_dec_place);
		Rslt4_inst_qty_p_PPanel.setRelateBeans(columnRslt4_base_unit_cd, columnRslt4_base_unit_dec_place);
		Rslt4_yeild_qty_p_PPanel.setRelateBeans(columnRslt4_base_unit_cd, columnRslt4_base_unit_dec_place);
		Rslt5_base_unit_qty_p_PPanel.setRelateBeans(columnRslt5_base_unit_cd, columnRslt5_base_unit_dec_place);

		Rslt3_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setStatusColumn();
		getCndR().adjst_tgt_flg(true);
	}

	protected void setStatusColumn() {
		DispRslt1Table.setStatusColumnVisible(false);
		Rslt3Table.setStatusColumnVisible(true);
		Rslt5Table.setStatusColumnVisible(false);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
		// 休日(土・日)のヘッダ色設定
		setTblHdr();

		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.ENABLE);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			DispRslt1Table.selectLeftmostColumn(0);
		}
		Ctrl_ctrl_PPanel.expand(false);

		setBtnMode();
	}

	@Override
	public void setSRCH_MONStatus() {
		super.setSRCH_MONStatus();
		setBtnMode();
	}

	@Override
	public void setMONStatus() {
		super.setMONStatus();
		setBtnMode();
		// 休日(土・日)のヘッダ色設定(月次での検索の場合はすべてクリア)
		setTblHdrClear();

		// 横テーブルの利用しない可変カラムのモードを非表示にする
		_vhM.setUsedElmColumnMode(MCMode.ENABLE);
	}

	protected void setBtnMode() {
		Rslt3R r = Rslt3Table.getSelectedMCRow();

		// 行追加、行削除、行コピー、反映ボタン
		if (isUpdStatus()) {
			if (r == null || Rslt3Table.getViewRows().size() == 0) {
				DispRslt1R row = DispRslt1Table.getSelectedMCRow();

				if(row != null) {
					if (!MAC_RQMT_TYP.isNON(row.rqmt_typ()) || !MAC_PROD_PLN_TYP.isDMND_USE(row.prod_pln_typ())) {
						Rslt3Btn_radd.setMode(MCMode.DISABLE);
						Rslt4Btn_select_all.setMode(MCMode.DISABLE);
						Rslt4Btn_deselect_all.setMode(MCMode.DISABLE);
						Rslt4Btn_rfrct.setMode(MCMode.DISABLE);
					}
					else {
						setDefaultMode(Rslt3Btn_radd);
						setDefaultMode(Rslt4Btn_select_all);
						setDefaultMode(Rslt4Btn_deselect_all);
						setDefaultMode(Rslt4Btn_rfrct);
					}
				}
				// テーブル操作ボタン
				Rslt3Btn_rdel.setMode(MCMode.DISABLE);
				Rslt3Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				DispRslt1R row = DispRslt1Table.getSelectedMCRow();
				if(row == null || Rslt3Table.getViewRows().size() == 0) {
					Rslt3Btn_radd.setMode(MCMode.DISABLE);
					Rslt3Btn_rdel.setMode(MCMode.DISABLE);
					Rslt3Btn_rcopy.setMode(MCMode.DISABLE);
					Rslt4Btn_select_all.setMode(MCMode.DISABLE);
					Rslt4Btn_deselect_all.setMode(MCMode.DISABLE);
					Rslt4Btn_rfrct.setMode(MCMode.DISABLE);
				}
				else {
					if (!MAC_RQMT_TYP.isNON(row.rqmt_typ()) || !MAC_PROD_PLN_TYP.isDMND_USE(row.prod_pln_typ())) {
						Rslt3Btn_radd.setMode(MCMode.DISABLE);
						Rslt3Btn_rdel.setMode(MCMode.DISABLE);
						Rslt3Btn_rcopy.setMode(MCMode.DISABLE);
						Rslt4Btn_select_all.setMode(MCMode.DISABLE);
						Rslt4Btn_deselect_all.setMode(MCMode.DISABLE);
						Rslt4Btn_rfrct.setMode(MCMode.DISABLE);
					}
					else {
						if(r.fix_flg()) {
							Rslt3Btn_rdel.setMode(MCMode.DISABLE);
						}
						else {
							setDefaultMode(Rslt3Btn_rdel);
						}
						setDefaultMode(Rslt3Btn_radd);
						setDefaultMode(Rslt3Btn_rcopy);
						setDefaultMode(Rslt4Btn_select_all);
						setDefaultMode(Rslt4Btn_deselect_all);
						setDefaultMode(Rslt4Btn_rfrct);
					}
				}
			}
		}
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isRegStatus() {
		return isUpdStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
			FoldTab.focusActiveFirstComponent();

			DispRslt1Table.setStatusColumnVisible(false);
			Rslt3Table.setStatusColumnVisible(true);

			StkTabPanel.setVisible(true);
			Rslt5Panel.setVisible(true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
			DispRslt1Table.setStatusColumnVisible(false);
			Rslt3Table.setStatusColumnVisible(false);

			StkTabPanel.setVisible(false);
			Rslt5Panel.setVisible(false);
		}
		else if (Cnd_ope_MON.isSelected()) {
			setSRCH_MONStatus();
			FoldTab.focusActiveFirstComponent();

			DispRslt1Table.setStatusColumnVisible(false);
			Rslt3Table.setStatusColumnVisible(true);

			StkTabPanel.setVisible(true);
			Rslt5Panel.setVisible(true);
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			DispRslt1Table.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_MON.isSelected()) {
			setMONStatus();
			DispRslt1Table.selectLeftmostColumn(0);
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装
	@Override
	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy) {
		// テーブルのソート処理。縦横変換クラスから呼び出される。
		return super.sort(table, policy);
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装
	@Override
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column) {
		// 何もなし
	}


	// -----------------------------------------------
	// event/listener
	@Override
	public void doDispRslt1_NC(MCEventInfo info) {
		super.doDispRslt1_NC(info);

		_rslt1L.clear();

		int idx = info.getOldIndex();
		if (idx >= 0) {
			DispRslt1R row = getDispRslt1L().get(idx);
			String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
			_Rslt3L.put(toMapKey(keyArr), getRslt3L().clone());
		}

		idx = info.getEventIndex();
		if (idx >= 0) {
			int oldIdx = info.getOldIndex();

			DispRslt1R row = getDispRslt1L().get(idx);

			_bakRslt1R = row.clone();

			showDlySd(row);
			showSimItmOrder(row);
			showDlyDmnd(row);
			setBtnMode();

			// 検索結果を取得した時点でソートされているため、ソートは不要
			Rslt3Table.adjustWidth();
			Rslt4Table.adjustWidth();
			Rslt5Table.adjustWidth();

			MCList<Rslt1R> rslt1L = _bakRslt1L.get(toMapKey(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd()));
			_rslt1L.addAll(rslt1L);

			getRslt2HdrR().itm_cd(row.itm_cd());
			getRslt2HdrR().itm_sub1(row.itm_sub1());
			getRslt2HdrR().itm_sub2(row.itm_sub2());
			getRslt2HdrR().itm_sub3(row.itm_sub3());
			getRslt2HdrR().itm_nm(row.itm_nm());
			getRslt2HdrR().loc_cd(row.loc_cd());
			getRslt2HdrR().loc_nm(row.loc_nm());

			DispRslt1R oldRow = null;
			if(oldIdx >= 0) {
				oldRow = getDispRslt1L().get(oldIdx);
			}
			// 選択行の品目、場所が変わらない場合はグラフの再表示などを行わない
			if(!isNull(oldRow) && isSame(row.itm_cd(), oldRow.itm_cd()) && isSame(row.itm_sub1(), oldRow.itm_sub1()) && isSame(row.itm_sub2(), oldRow.itm_sub2()) && isSame(row.itm_sub3(), oldRow.itm_sub3()) && isSame(row.loc_cd(), oldRow.loc_cd())) {
				return;
			}
		}
		else {
			getRslt2HdrR().itm_cd(null);
			getRslt2HdrR().itm_sub1(null);
			getRslt2HdrR().itm_sub2(null);
			getRslt2HdrR().itm_sub3(null);
			getRslt2HdrR().itm_nm(null);
			getRslt2HdrR().loc_cd(null);
			getRslt2HdrR().loc_nm(null);
		}

		// 在庫推移グラフの表示をリフレッシュ
		_innerGraph.refreshGraph();
		if(_outerGraph != null) {
			_outerGraph.refreshGraph();
		}
	}

	protected void showDlySd(DispRslt1R row) {
		if (!isNull(row)){
			if(getCndR().selectDlyDisp()) {
				String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
				getRslt3L().setAll(_Rslt3L.get(toMapKey(keyArr)));
				doDtlTableFilter(null);
				return;
			}
			else {
				String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
				getRslt3L().setAll(_Rslt3L.get(toMapKey(keyArr)));
			}
			showSub(Rslt3Table);
		}
		else {
			getRslt3L().clear();
		}
	}

	protected void showSimItmOrder(DispRslt1R row) {
		if (!isNull(row)){
			if(getCndR().selectDlyDisp()) {
				String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
				getRslt4L().setAll(_Rslt4L.get(toMapKey(keyArr)));
				doDtlTableFilter(null);
				return;
			}
			else {
				String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
				getRslt4L().setAll(_Rslt4L.get(toMapKey(keyArr)));
			}
			showSub(Rslt4Table);
		}
		else {
			getRslt4L().clear();
		}
	}

	protected void showDlyDmnd(DispRslt1R row) {
		if (!isNull(row)){
			if(getCndR().selectDlyDisp()) {
				String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
				getRslt5L().setAll(_Rslt5L.get(toMapKey(keyArr)));
				doDtlTableFilter(null);
				return;
			}
			else {
				String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
				getRslt5L().setAll(_Rslt5L.get(toMapKey(keyArr)));
			}
			showSub(Rslt5Table);
		}
		else {
			getRslt5L().clear();
		}
	}

	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);
		}
	}

	@Override
	public void doRslt3_NC(MCEventInfo info) {
		super.doRslt3_NC(info);
		setBtnMode();
	}

	protected void clearHiddenList() {
		_dispRslt1BakL = MCList.create(DispRslt1R.class);
		_Rslt3L = new HashMap<List<Comparable<?>>, MCList<Rslt3R>>();
		_Rslt4L = new HashMap<List<Comparable<?>>, MCList<Rslt4R>>();
		_Rslt5L = new HashMap<List<Comparable<?>>, MCList<Rslt5R>>();
		_bakRslt1L = new HashMap<List<Comparable<?>>, MCList<Rslt1R>>();
		_colMap = new HashMap<>();
		_dateMap = new HashMap<>();
		_dateMap2 = new HashMap<>();
		_editableFlgMap = new HashMap<>();

		_rslt1L.clear();
		// 在庫推移グラフの表示をリフレッシュ
		_innerGraph.refreshGraph();
		if(_outerGraph != null) {
			_outerGraph.refreshGraph();
		}
	}

	/**
	 * 在庫推移の検索結果を設定する。（稼働日判定用）
	 * @param dlySd　検索した結果の在庫推移
	 */
	protected void setHiddenList(MCList<Rslt1R> rslt1L) {
		String[] wkDayKey = new String[] {Rslt1R.$loc_cd, Rslt1R.$schd_dt, Rslt1R.$wrk_day_flg};
		_wkDayL.setAll(rslt1L.groupBy(wkDayKey));
	}
	/**
	 * 供給計画の検索結果を設定する。
	 * @param dlySd　検索した結果の供給計画
	 * @param simItmOrder　検索した結果のシミュレーションオーダ
	 * @param dlyDmnd 検索した結果の日次需要情報
	 */
	protected void setHiddenList(MCList<Rslt3R> dlySd, MCList<Rslt4R> simItmOrder, MCList<Rslt5R> dlyDmnd) {
		String[] dlySdKeyArr = getRslt3Keys();
		String[] simItmOrderKeyArr = getRslt4Keys();
		String[] dlyDmndKeyArr = getRslt5Keys();

		MCIndexKey dlySdIdxKey = dlySd.createIndex(dlySdKeyArr);
		MCIndexKey simItmOrderIdxKey = simItmOrder.createIndex(simItmOrderKeyArr);
		MCIndexKey dlyDmndIdxKey = dlyDmnd.createIndex(dlyDmndKeyArr);

		for(Rslt3R r : dlySd.groupBy(dlySdKeyArr)) {
			String[] keyArr = new String[] { r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd() };
			MCList<Rslt3R> val = dlySd.subList(dlySdIdxKey, keyArr);
			_Rslt3L.put(toMapKey(keyArr), val);
		}

		for(Rslt4R r : simItmOrder.groupBy(simItmOrderKeyArr)) {
			String[] keyArr = new String[] { r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd() };
			MCList<Rslt4R> val = simItmOrder.subList(simItmOrderIdxKey, keyArr);
			_Rslt4L.put(toMapKey(keyArr), val);
		}

		for(Rslt5R r: dlyDmnd.groupBy(dlyDmndKeyArr)) {
			String[] keyArr = new String[] { r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_loc_cd() };
			MCList<Rslt5R> val = dlyDmnd.subList(dlyDmndIdxKey, keyArr);
			_Rslt5L.put(toMapKey(keyArr), val);
		}
	}

	/**
	 * 選択している品目、場所を元に裏リストを差し替える
	 */
	protected void setHiddenList() {
		DispRslt1R row = DispRslt1Table.getSelectedMCRow();
		if(!isNull(row)) {
			String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
			_Rslt3L.put(toMapKey(keyArr), getRslt3L().clone());
		}
	}

	/**
	 * 配列をMapのキーに変換する
	 */
	protected List<Comparable<?>> toMapKey(Comparable<?>... in) {
		List<Comparable<?>> ret = new ArrayList<Comparable<?>>();
		if (in == null) {
			return ret;
		}
		for (Comparable<?> c : in) {
			ret.add(c);
		}
		return ret;
	}


	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRslt1L())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getDispRslt1L(), getRslt2HdrR(), getRslt3L(), getRslt4L(), getRslt5L());
		clearHiddenList();
		setSrchStatus();
		clearSrchStatus();

		if(Cnd_ope_REF.isSelected()) {
			saveLoc1 = this.getDividerLocation("StkTab");
			saveLoc2 = this.getDividerLocation("SpplyTab");
			saveLoc3 = this.getDividerLocation("Rslt5Panel");
			this.setDividerLocation("StkTab", 0, false);
			this.setDividerLocation("SpplyTab", saveLoc2, true);
		}
		else if (Cnd_ope_UPD.isSelected() || Cnd_ope_MON.isSelected()) {
			this.setDividerLocation("StkTab", saveLoc1, false);
			this.setDividerLocation("SpplyTab", saveLoc2, false);
		}
	}

	@Override
	protected void listInit() {
		super.listInit();

		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, DispRslt1Table, getRslt1L());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。グループの下に空行を入れる場合は最後にnullを指定する。
		java.util.LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(Rslt1R.$schd_qty, "");
		_vhM.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {Rslt1R.$schd_dt, Rslt1R.$schd_qty});
		dispList.add(new String[] {Rslt1R.$schd_dt, Rslt1R.$schd_qty});
		_vhM.setDispInfo(dispList);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		for (MCColumnConfig c : getQtys()) {
			c.addLCListener(this);
			c.addNEListener(this);
		}

		columnRslt3_base_unit_qty.addLCListener(this);
		columnRslt3_due_dt.addLCListener(this);
		columnRslt3_base_unit_qty.addVCListener(this);
		columnRslt3_due_dt.addVCListener(this);

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(Rslt3Table, createRslt3ListListener());
	}

	protected MAUDP_RowListener createRslt3ListListener() {
		return new Rslt3ListRowListener();
	}

	protected class Rslt3ListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				Rslt3R Rslt3R = (Rslt3R)r;
				MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd, DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3, DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
				DispRslt1R rslt1R = getDispRslt1L().getFirst(idxKey, Rslt3R.itm_cd(), Rslt3R.itm_sub1(), Rslt3R.itm_sub2(), Rslt3R.itm_sub3(), Rslt3R.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.DMND.value());
				if(!isNull(rslt1R)) {
					rslt1R.check(true);

					calcStk(rslt1R);

					MCList<Rslt1R> tmpL = _bakRslt1L.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()));
					_rslt1L.setAll(tmpL);
					// 在庫推移グラフの表示をリフレッシュ
					_innerGraph.refreshGraph();
					if(_outerGraph != null) {
						_outerGraph.refreshGraph();
					}
				}
			}
		}
	}


	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearCacheVH();
	}

	protected void clearCacheVH() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.initColInfo(MCList.create(MCRow.class));
		_vhM.clearElmColsLabel();

		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhM.clearCachedList();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DispRslt1Table.setSortable(false);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);

		// 横テーブルの「ソート順変更」を無効にする
		if (beans == DispRslt1Table) {
			config.ignoreSortOrder(true);
		}

		return config;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		// 縦横変換クラスのソート処理を呼び出す
		if (table == DispRslt1Table) {
			return sortVH(policy);
		}
		return super.sort(table, policy);
	}

	protected boolean sortVH(MCSortPolicy policy) {
		return _vhM.sortHTable(crtSortVH());
	}

	protected MCSortPolicy crtSortVH() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, DispRslt1R.$itm_cd);
		sp.add(SortType.ASC, DispRslt1R.$itm_sub1);
		sp.add(SortType.ASC, DispRslt1R.$itm_sub2);
		sp.add(SortType.ASC, DispRslt1R.$itm_sub3);
		sp.add(SortType.ASC, DispRslt1R.$wg_cd);
		sp.add(SortType.ASC, DispRslt1R.$loc_cd);
		sp.add(SortType.ASC, DispRslt1R.$sd_adjst_dtl_typ);
		return sp;
	}

	protected boolean isInptRow(DispRslt1R r) {
		if (isNull(r)) {
			return false;
		}
		else if (Cnd_ope_MON.isSelected()) {
			return false;
		}
		else if (MSC_SD_ADJST_DTL_TYP.isSPPLYENT(r.sd_adjst_dtl_typ())) {
			return true;
		}
		return false;
	}

	protected void setEditableQtyCol(DispRslt1R r, MCDate dt, MCColumnConfig qtyCol) {

		MCColumnConfig editableQtyCol = getEditableQtyCol(qtyCol);

		// 非稼働日は、供給（入力セル）を非活性にする。
		Rslt1R wkDayR = _wkDayL.getFirst(new String[] {Rslt1R.$loc_cd, Rslt1R.$schd_dt}, new Comparable[] {r.loc_cd(), dt});
		if (getCndR().non_spply_ent_flg() && !isNull(wkDayR) && !wkDayR.wrk_day_flg()) {
			r.setBoolean(editableQtyCol.getBaseRowColumnName(), false);
			return;
		}
		if (isNull(r.getValue(qtyCol.getBaseRowColumnName() ))) {
			r.setBoolean(editableQtyCol.getBaseRowColumnName(), true);
		}
		else {
			String[] keyArr = new String[] { r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd() };
			MCList<Rslt3R> tmpL = _Rslt3L.get(toMapKey(keyArr));
			if(isNull(tmpL)) {
				r.setBoolean(editableQtyCol.getBaseRowColumnName(), true);
				return;
			}
			MCIndexKey idxKey = tmpL.createIndex(Rslt3R.$due_dt);
			tmpL = tmpL.subList(idxKey, dt);
			if(!isNull(tmpL) && tmpL.size() > 1) {
				r.setBoolean(editableQtyCol.getBaseRowColumnName(), false);
			}
			else {
				if(!isNull(tmpL)) {
					Rslt3R tmpR = tmpL.get(0);
					if(tmpR.fix_flg()) {
						r.setBoolean(editableQtyCol.getBaseRowColumnName(), false);
					}
					else {
						r.setBoolean(editableQtyCol.getBaseRowColumnName(), true);
					}
				}
				else {
					r.setBoolean(editableQtyCol.getBaseRowColumnName(), true);
				}
			}
		}
	}

	protected MCColumnConfig getEditableQtyCol(MCColumnConfig qtyCol) {
		if (qtyCol == columnDispRslt1_qty01) {
			return columnDispRslt1_editable_qty01_flg;
		}
		if (qtyCol == columnDispRslt1_qty02) {
			return columnDispRslt1_editable_qty02_flg;
		}
		if (qtyCol == columnDispRslt1_qty03) {
			return columnDispRslt1_editable_qty03_flg;
		}
		if (qtyCol == columnDispRslt1_qty04) {
			return columnDispRslt1_editable_qty04_flg;
		}
		if (qtyCol == columnDispRslt1_qty05) {
			return columnDispRslt1_editable_qty05_flg;
		}
		if (qtyCol == columnDispRslt1_qty06) {
			return columnDispRslt1_editable_qty06_flg;
		}
		if (qtyCol == columnDispRslt1_qty07) {
			return columnDispRslt1_editable_qty07_flg;
		}
		if (qtyCol == columnDispRslt1_qty08) {
			return columnDispRslt1_editable_qty08_flg;
		}
		if (qtyCol == columnDispRslt1_qty09) {
			return columnDispRslt1_editable_qty09_flg;
		}
		if (qtyCol == columnDispRslt1_qty10) {
			return columnDispRslt1_editable_qty10_flg;
		}
		if (qtyCol == columnDispRslt1_qty11) {
			return columnDispRslt1_editable_qty11_flg;
		}
		if (qtyCol == columnDispRslt1_qty12) {
			return columnDispRslt1_editable_qty12_flg;
		}
		if (qtyCol == columnDispRslt1_qty13) {
			return columnDispRslt1_editable_qty13_flg;
		}
		if (qtyCol == columnDispRslt1_qty14) {
			return columnDispRslt1_editable_qty14_flg;
		}
		if (qtyCol == columnDispRslt1_qty15) {
			return columnDispRslt1_editable_qty15_flg;
		}
		if (qtyCol == columnDispRslt1_qty16) {
			return columnDispRslt1_editable_qty16_flg;
		}
		if (qtyCol == columnDispRslt1_qty17) {
			return columnDispRslt1_editable_qty17_flg;
		}
		if (qtyCol == columnDispRslt1_qty18) {
			return columnDispRslt1_editable_qty18_flg;
		}
		if (qtyCol == columnDispRslt1_qty19) {
			return columnDispRslt1_editable_qty19_flg;
		}
		if (qtyCol == columnDispRslt1_qty20) {
			return columnDispRslt1_editable_qty20_flg;
		}
		if (qtyCol == columnDispRslt1_qty21) {
			return columnDispRslt1_editable_qty21_flg;
		}
		if (qtyCol == columnDispRslt1_qty22) {
			return columnDispRslt1_editable_qty22_flg;
		}
		if (qtyCol == columnDispRslt1_qty23) {
			return columnDispRslt1_editable_qty23_flg;
		}
		if (qtyCol == columnDispRslt1_qty24) {
			return columnDispRslt1_editable_qty24_flg;
		}
		if (qtyCol == columnDispRslt1_qty25) {
			return columnDispRslt1_editable_qty25_flg;
		}
		if (qtyCol == columnDispRslt1_qty26) {
			return columnDispRslt1_editable_qty26_flg;
		}
		if (qtyCol == columnDispRslt1_qty27) {
			return columnDispRslt1_editable_qty27_flg;
		}
		if (qtyCol == columnDispRslt1_qty28) {
			return columnDispRslt1_editable_qty28_flg;
		}
		if (qtyCol == columnDispRslt1_qty29) {
			return columnDispRslt1_editable_qty29_flg;
		}
		if (qtyCol == columnDispRslt1_qty30) {
			return columnDispRslt1_editable_qty30_flg;
		}
		if (qtyCol == columnDispRslt1_qty31) {
			return columnDispRslt1_editable_qty31_flg;
		}
		if (qtyCol == columnDispRslt1_qty32) {
			return columnDispRslt1_editable_qty32_flg;
		}
		if (qtyCol == columnDispRslt1_qty33) {
			return columnDispRslt1_editable_qty33_flg;
		}
		if (qtyCol == columnDispRslt1_qty34) {
			return columnDispRslt1_editable_qty34_flg;
		}
		if (qtyCol == columnDispRslt1_qty35) {
			return columnDispRslt1_editable_qty35_flg;
		}
		if (qtyCol == columnDispRslt1_qty36) {
			return columnDispRslt1_editable_qty36_flg;
		}
		if (qtyCol == columnDispRslt1_qty37) {
			return columnDispRslt1_editable_qty37_flg;
		}
		if (qtyCol == columnDispRslt1_qty38) {
			return columnDispRslt1_editable_qty38_flg;
		}
		if (qtyCol == columnDispRslt1_qty39) {
			return columnDispRslt1_editable_qty39_flg;
		}
		if (qtyCol == columnDispRslt1_qty40) {
			return columnDispRslt1_editable_qty40_flg;
		}
		if (qtyCol == columnDispRslt1_qty41) {
			return columnDispRslt1_editable_qty41_flg;
		}
		if (qtyCol == columnDispRslt1_qty42) {
			return columnDispRslt1_editable_qty42_flg;
		}
		if (qtyCol == columnDispRslt1_qty43) {
			return columnDispRslt1_editable_qty43_flg;
		}
		if (qtyCol == columnDispRslt1_qty44) {
			return columnDispRslt1_editable_qty44_flg;
		}
		if (qtyCol == columnDispRslt1_qty45) {
			return columnDispRslt1_editable_qty45_flg;
		}
		if (qtyCol == columnDispRslt1_qty46) {
			return columnDispRslt1_editable_qty46_flg;
		}
		if (qtyCol == columnDispRslt1_qty47) {
			return columnDispRslt1_editable_qty47_flg;
		}
		if (qtyCol == columnDispRslt1_qty48) {
			return columnDispRslt1_editable_qty48_flg;
		}
		if (qtyCol == columnDispRslt1_qty49) {
			return columnDispRslt1_editable_qty49_flg;
		}
		if (qtyCol == columnDispRslt1_qty50) {
			return columnDispRslt1_editable_qty50_flg;
		}
		if (qtyCol == columnDispRslt1_qty51) {
			return columnDispRslt1_editable_qty51_flg;
		}
		if (qtyCol == columnDispRslt1_qty52) {
			return columnDispRslt1_editable_qty52_flg;
		}
		if (qtyCol == columnDispRslt1_qty53) {
			return columnDispRslt1_editable_qty53_flg;
		}
		if (qtyCol == columnDispRslt1_qty54) {
			return columnDispRslt1_editable_qty54_flg;
		}
		if (qtyCol == columnDispRslt1_qty55) {
			return columnDispRslt1_editable_qty55_flg;
		}
		if (qtyCol == columnDispRslt1_qty56) {
			return columnDispRslt1_editable_qty56_flg;
		}
		if (qtyCol == columnDispRslt1_qty57) {
			return columnDispRslt1_editable_qty57_flg;
		}
		if (qtyCol == columnDispRslt1_qty58) {
			return columnDispRslt1_editable_qty58_flg;
		}
		if (qtyCol == columnDispRslt1_qty59) {
			return columnDispRslt1_editable_qty59_flg;
		}
		if (qtyCol == columnDispRslt1_qty60) {
			return columnDispRslt1_editable_qty60_flg;
		}
		if (qtyCol == columnDispRslt1_qty61) {
			return columnDispRslt1_editable_qty61_flg;
		}
		if (qtyCol == columnDispRslt1_qty62) {
			return columnDispRslt1_editable_qty62_flg;
		}
		if (qtyCol == columnDispRslt1_qty63) {
			return columnDispRslt1_editable_qty63_flg;
		}
		if (qtyCol == columnDispRslt1_qty64) {
			return columnDispRslt1_editable_qty64_flg;
		}
		if (qtyCol == columnDispRslt1_qty65) {
			return columnDispRslt1_editable_qty65_flg;
		}
		if (qtyCol == columnDispRslt1_qty66) {
			return columnDispRslt1_editable_qty66_flg;
		}
		if (qtyCol == columnDispRslt1_qty67) {
			return columnDispRslt1_editable_qty67_flg;
		}
		if (qtyCol == columnDispRslt1_qty68) {
			return columnDispRslt1_editable_qty68_flg;
		}
		if (qtyCol == columnDispRslt1_qty69) {
			return columnDispRslt1_editable_qty69_flg;
		}
		if (qtyCol == columnDispRslt1_qty70) {
			return columnDispRslt1_editable_qty70_flg;
		}
		if (qtyCol == columnDispRslt1_qty71) {
			return columnDispRslt1_editable_qty71_flg;
		}
		if (qtyCol == columnDispRslt1_qty72) {
			return columnDispRslt1_editable_qty72_flg;
		}
		if (qtyCol == columnDispRslt1_qty73) {
			return columnDispRslt1_editable_qty73_flg;
		}
		if (qtyCol == columnDispRslt1_qty74) {
			return columnDispRslt1_editable_qty74_flg;
		}
		if (qtyCol == columnDispRslt1_qty75) {
			return columnDispRslt1_editable_qty75_flg;
		}
		if (qtyCol == columnDispRslt1_qty76) {
			return columnDispRslt1_editable_qty76_flg;
		}
		if (qtyCol == columnDispRslt1_qty77) {
			return columnDispRslt1_editable_qty77_flg;
		}
		if (qtyCol == columnDispRslt1_qty78) {
			return columnDispRslt1_editable_qty78_flg;
		}
		if (qtyCol == columnDispRslt1_qty79) {
			return columnDispRslt1_editable_qty79_flg;
		}
		if (qtyCol == columnDispRslt1_qty80) {
			return columnDispRslt1_editable_qty80_flg;
		}
		if (qtyCol == columnDispRslt1_qty81) {
			return columnDispRslt1_editable_qty81_flg;
		}
		if (qtyCol == columnDispRslt1_qty82) {
			return columnDispRslt1_editable_qty82_flg;
		}
		if (qtyCol == columnDispRslt1_qty83) {
			return columnDispRslt1_editable_qty83_flg;
		}
		if (qtyCol == columnDispRslt1_qty84) {
			return columnDispRslt1_editable_qty84_flg;
		}
		if (qtyCol == columnDispRslt1_qty85) {
			return columnDispRslt1_editable_qty85_flg;
		}
		if (qtyCol == columnDispRslt1_qty86) {
			return columnDispRslt1_editable_qty86_flg;
		}
		if (qtyCol == columnDispRslt1_qty87) {
			return columnDispRslt1_editable_qty87_flg;
		}
		if (qtyCol == columnDispRslt1_qty88) {
			return columnDispRslt1_editable_qty88_flg;
		}
		if (qtyCol == columnDispRslt1_qty89) {
			return columnDispRslt1_editable_qty89_flg;
		}
		if (qtyCol == columnDispRslt1_qty90) {
			return columnDispRslt1_editable_qty90_flg;
		}
		if (qtyCol == columnDispRslt1_qty91) {
			return columnDispRslt1_editable_qty91_flg;
		}
		if (qtyCol == columnDispRslt1_qty92) {
			return columnDispRslt1_editable_qty92_flg;
		}
		if (qtyCol == columnDispRslt1_qty93) {
			return columnDispRslt1_editable_qty93_flg;
		}
		if (qtyCol == columnDispRslt1_qty94) {
			return columnDispRslt1_editable_qty94_flg;
		}
		if (qtyCol == columnDispRslt1_qty95) {
			return columnDispRslt1_editable_qty95_flg;
		}
		if (qtyCol == columnDispRslt1_qty96) {
			return columnDispRslt1_editable_qty96_flg;
		}
		if (qtyCol == columnDispRslt1_qty97) {
			return columnDispRslt1_editable_qty97_flg;
		}
		if (qtyCol == columnDispRslt1_qty98) {
			return columnDispRslt1_editable_qty98_flg;
		}
		if (qtyCol == columnDispRslt1_qty99) {
			return columnDispRslt1_editable_qty99_flg;
		}
		if (qtyCol == columnDispRslt1_qty100) {
			return columnDispRslt1_editable_qty100_flg;
		}
		if (qtyCol == columnDispRslt1_qty101) {
			return columnDispRslt1_editable_qty101_flg;
		}
		if (qtyCol == columnDispRslt1_qty102) {
			return columnDispRslt1_editable_qty102_flg;
		}
		if (qtyCol == columnDispRslt1_qty103) {
			return columnDispRslt1_editable_qty103_flg;
		}
		if (qtyCol == columnDispRslt1_qty104) {
			return columnDispRslt1_editable_qty104_flg;
		}
		if (qtyCol == columnDispRslt1_qty105) {
			return columnDispRslt1_editable_qty105_flg;
		}
		if (qtyCol == columnDispRslt1_qty106) {
			return columnDispRslt1_editable_qty106_flg;
		}
		if (qtyCol == columnDispRslt1_qty107) {
			return columnDispRslt1_editable_qty107_flg;
		}
		if (qtyCol == columnDispRslt1_qty108) {
			return columnDispRslt1_editable_qty108_flg;
		}
		if (qtyCol == columnDispRslt1_qty109) {
			return columnDispRslt1_editable_qty109_flg;
		}
		if (qtyCol == columnDispRslt1_qty110) {
			return columnDispRslt1_editable_qty110_flg;
		}
		if (qtyCol == columnDispRslt1_qty111) {
			return columnDispRslt1_editable_qty111_flg;
		}
		if (qtyCol == columnDispRslt1_qty112) {
			return columnDispRslt1_editable_qty112_flg;
		}
		if (qtyCol == columnDispRslt1_qty113) {
			return columnDispRslt1_editable_qty113_flg;
		}
		if (qtyCol == columnDispRslt1_qty114) {
			return columnDispRslt1_editable_qty114_flg;
		}
		if (qtyCol == columnDispRslt1_qty115) {
			return columnDispRslt1_editable_qty115_flg;
		}
		if (qtyCol == columnDispRslt1_qty116) {
			return columnDispRslt1_editable_qty116_flg;
		}
		if (qtyCol == columnDispRslt1_qty117) {
			return columnDispRslt1_editable_qty117_flg;
		}
		if (qtyCol == columnDispRslt1_qty118) {
			return columnDispRslt1_editable_qty118_flg;
		}
		if (qtyCol == columnDispRslt1_qty119) {
			return columnDispRslt1_editable_qty119_flg;
		}
		if (qtyCol == columnDispRslt1_qty120) {
			return columnDispRslt1_editable_qty120_flg;
		}
		if (qtyCol == columnDispRslt1_qty121) {
			return columnDispRslt1_editable_qty121_flg;
		}
		if (qtyCol == columnDispRslt1_qty122) {
			return columnDispRslt1_editable_qty122_flg;
		}
		if (qtyCol == columnDispRslt1_qty123) {
			return columnDispRslt1_editable_qty123_flg;
		}
		if (qtyCol == columnDispRslt1_qty124) {
			return columnDispRslt1_editable_qty124_flg;
		}
		if (qtyCol == columnDispRslt1_qty125) {
			return columnDispRslt1_editable_qty125_flg;
		}
		if (qtyCol == columnDispRslt1_qty126) {
			return columnDispRslt1_editable_qty126_flg;
		}
		if (qtyCol == columnDispRslt1_qty127) {
			return columnDispRslt1_editable_qty127_flg;
		}
		if (qtyCol == columnDispRslt1_qty128) {
			return columnDispRslt1_editable_qty128_flg;
		}
		if (qtyCol == columnDispRslt1_qty129) {
			return columnDispRslt1_editable_qty129_flg;
		}
		if (qtyCol == columnDispRslt1_qty130) {
			return columnDispRslt1_editable_qty130_flg;
		}
		if (qtyCol == columnDispRslt1_qty131) {
			return columnDispRslt1_editable_qty131_flg;
		}
		if (qtyCol == columnDispRslt1_qty132) {
			return columnDispRslt1_editable_qty132_flg;
		}
		if (qtyCol == columnDispRslt1_qty133) {
			return columnDispRslt1_editable_qty133_flg;
		}
		if (qtyCol == columnDispRslt1_qty134) {
			return columnDispRslt1_editable_qty134_flg;
		}
		if (qtyCol == columnDispRslt1_qty135) {
			return columnDispRslt1_editable_qty135_flg;
		}
		if (qtyCol == columnDispRslt1_qty136) {
			return columnDispRslt1_editable_qty136_flg;
		}
		if (qtyCol == columnDispRslt1_qty137) {
			return columnDispRslt1_editable_qty137_flg;
		}
		if (qtyCol == columnDispRslt1_qty138) {
			return columnDispRslt1_editable_qty138_flg;
		}
		if (qtyCol == columnDispRslt1_qty139) {
			return columnDispRslt1_editable_qty139_flg;
		}
		if (qtyCol == columnDispRslt1_qty140) {
			return columnDispRslt1_editable_qty140_flg;
		}
		if (qtyCol == columnDispRslt1_qty141) {
			return columnDispRslt1_editable_qty141_flg;
		}
		if (qtyCol == columnDispRslt1_qty142) {
			return columnDispRslt1_editable_qty142_flg;
		}
		if (qtyCol == columnDispRslt1_qty143) {
			return columnDispRslt1_editable_qty143_flg;
		}
		if (qtyCol == columnDispRslt1_qty144) {
			return columnDispRslt1_editable_qty144_flg;
		}
		if (qtyCol == columnDispRslt1_qty145) {
			return columnDispRslt1_editable_qty145_flg;
		}
		if (qtyCol == columnDispRslt1_qty146) {
			return columnDispRslt1_editable_qty146_flg;
		}
		if (qtyCol == columnDispRslt1_qty147) {
			return columnDispRslt1_editable_qty147_flg;
		}
		if (qtyCol == columnDispRslt1_qty148) {
			return columnDispRslt1_editable_qty148_flg;
		}
		if (qtyCol == columnDispRslt1_qty149) {
			return columnDispRslt1_editable_qty149_flg;
		}
		if (qtyCol == columnDispRslt1_qty150) {
			return columnDispRslt1_editable_qty150_flg;
		}
		if (qtyCol == columnDispRslt1_qty151) {
			return columnDispRslt1_editable_qty151_flg;
		}
		if (qtyCol == columnDispRslt1_qty152) {
			return columnDispRslt1_editable_qty152_flg;
		}
		if (qtyCol == columnDispRslt1_qty153) {
			return columnDispRslt1_editable_qty153_flg;
		}
		if (qtyCol == columnDispRslt1_qty154) {
			return columnDispRslt1_editable_qty154_flg;
		}
		if (qtyCol == columnDispRslt1_qty155) {
			return columnDispRslt1_editable_qty155_flg;
		}
		if (qtyCol == columnDispRslt1_qty156) {
			return columnDispRslt1_editable_qty156_flg;
		}
		if (qtyCol == columnDispRslt1_qty157) {
			return columnDispRslt1_editable_qty157_flg;
		}
		if (qtyCol == columnDispRslt1_qty158) {
			return columnDispRslt1_editable_qty158_flg;
		}
		if (qtyCol == columnDispRslt1_qty159) {
			return columnDispRslt1_editable_qty159_flg;
		}
		if (qtyCol == columnDispRslt1_qty160) {
			return columnDispRslt1_editable_qty160_flg;
		}
		if (qtyCol == columnDispRslt1_qty161) {
			return columnDispRslt1_editable_qty161_flg;
		}
		if (qtyCol == columnDispRslt1_qty162) {
			return columnDispRslt1_editable_qty162_flg;
		}
		if (qtyCol == columnDispRslt1_qty163) {
			return columnDispRslt1_editable_qty163_flg;
		}
		if (qtyCol == columnDispRslt1_qty164) {
			return columnDispRslt1_editable_qty164_flg;
		}
		if (qtyCol == columnDispRslt1_qty165) {
			return columnDispRslt1_editable_qty165_flg;
		}
		if (qtyCol == columnDispRslt1_qty166) {
			return columnDispRslt1_editable_qty166_flg;
		}
		if (qtyCol == columnDispRslt1_qty167) {
			return columnDispRslt1_editable_qty167_flg;
		}
		if (qtyCol == columnDispRslt1_qty168) {
			return columnDispRslt1_editable_qty168_flg;
		}
		if (qtyCol == columnDispRslt1_qty169) {
			return columnDispRslt1_editable_qty169_flg;
		}
		if (qtyCol == columnDispRslt1_qty170) {
			return columnDispRslt1_editable_qty170_flg;
		}
		if (qtyCol == columnDispRslt1_qty171) {
			return columnDispRslt1_editable_qty171_flg;
		}
		if (qtyCol == columnDispRslt1_qty172) {
			return columnDispRslt1_editable_qty172_flg;
		}
		if (qtyCol == columnDispRslt1_qty173) {
			return columnDispRslt1_editable_qty173_flg;
		}
		if (qtyCol == columnDispRslt1_qty174) {
			return columnDispRslt1_editable_qty174_flg;
		}
		if (qtyCol == columnDispRslt1_qty175) {
			return columnDispRslt1_editable_qty175_flg;
		}
		if (qtyCol == columnDispRslt1_qty176) {
			return columnDispRslt1_editable_qty176_flg;
		}
		if (qtyCol == columnDispRslt1_qty177) {
			return columnDispRslt1_editable_qty177_flg;
		}
		if (qtyCol == columnDispRslt1_qty178) {
			return columnDispRslt1_editable_qty178_flg;
		}
		if (qtyCol == columnDispRslt1_qty179) {
			return columnDispRslt1_editable_qty179_flg;
		}
		if (qtyCol == columnDispRslt1_qty180) {
			return columnDispRslt1_editable_qty180_flg;
		}
		if (qtyCol == columnDispRslt1_qty181) {
			return columnDispRslt1_editable_qty181_flg;
		}
		if (qtyCol == columnDispRslt1_qty182) {
			return columnDispRslt1_editable_qty182_flg;
		}
		if (qtyCol == columnDispRslt1_qty183) {
			return columnDispRslt1_editable_qty183_flg;
		}
		if (qtyCol == columnDispRslt1_qty184) {
			return columnDispRslt1_editable_qty184_flg;
		}
		if (qtyCol == columnDispRslt1_qty185) {
			return columnDispRslt1_editable_qty185_flg;
		}
		if (qtyCol == columnDispRslt1_qty186) {
			return columnDispRslt1_editable_qty186_flg;
		}
		if (qtyCol == columnDispRslt1_qty187) {
			return columnDispRslt1_editable_qty187_flg;
		}
		if (qtyCol == columnDispRslt1_qty188) {
			return columnDispRslt1_editable_qty188_flg;
		}
		if (qtyCol == columnDispRslt1_qty189) {
			return columnDispRslt1_editable_qty189_flg;
		}
		if (qtyCol == columnDispRslt1_qty190) {
			return columnDispRslt1_editable_qty190_flg;
		}
		if (qtyCol == columnDispRslt1_qty191) {
			return columnDispRslt1_editable_qty191_flg;
		}
		if (qtyCol == columnDispRslt1_qty192) {
			return columnDispRslt1_editable_qty192_flg;
		}
		if (qtyCol == columnDispRslt1_qty193) {
			return columnDispRslt1_editable_qty193_flg;
		}
		if (qtyCol == columnDispRslt1_qty194) {
			return columnDispRslt1_editable_qty194_flg;
		}
		if (qtyCol == columnDispRslt1_qty195) {
			return columnDispRslt1_editable_qty195_flg;
		}
		if (qtyCol == columnDispRslt1_qty196) {
			return columnDispRslt1_editable_qty196_flg;
		}
		if (qtyCol == columnDispRslt1_qty197) {
			return columnDispRslt1_editable_qty197_flg;
		}
		if (qtyCol == columnDispRslt1_qty198) {
			return columnDispRslt1_editable_qty198_flg;
		}
		if (qtyCol == columnDispRslt1_qty199) {
			return columnDispRslt1_editable_qty199_flg;
		}
		if (qtyCol == columnDispRslt1_qty200) {
			return columnDispRslt1_editable_qty200_flg;
		}
		if (qtyCol == columnDispRslt1_qty201) {
			return columnDispRslt1_editable_qty201_flg;
		}
		if (qtyCol == columnDispRslt1_qty202) {
			return columnDispRslt1_editable_qty202_flg;
		}
		if (qtyCol == columnDispRslt1_qty203) {
			return columnDispRslt1_editable_qty203_flg;
		}
		if (qtyCol == columnDispRslt1_qty204) {
			return columnDispRslt1_editable_qty204_flg;
		}
		if (qtyCol == columnDispRslt1_qty205) {
			return columnDispRslt1_editable_qty205_flg;
		}
		if (qtyCol == columnDispRslt1_qty206) {
			return columnDispRslt1_editable_qty206_flg;
		}
		if (qtyCol == columnDispRslt1_qty207) {
			return columnDispRslt1_editable_qty207_flg;
		}
		if (qtyCol == columnDispRslt1_qty208) {
			return columnDispRslt1_editable_qty208_flg;
		}
		if (qtyCol == columnDispRslt1_qty209) {
			return columnDispRslt1_editable_qty209_flg;
		}
		if (qtyCol == columnDispRslt1_qty210) {
			return columnDispRslt1_editable_qty210_flg;
		}
		if (qtyCol == columnDispRslt1_qty211) {
			return columnDispRslt1_editable_qty211_flg;
		}
		if (qtyCol == columnDispRslt1_qty212) {
			return columnDispRslt1_editable_qty212_flg;
		}
		if (qtyCol == columnDispRslt1_qty213) {
			return columnDispRslt1_editable_qty213_flg;
		}
		if (qtyCol == columnDispRslt1_qty214) {
			return columnDispRslt1_editable_qty214_flg;
		}
		if (qtyCol == columnDispRslt1_qty215) {
			return columnDispRslt1_editable_qty215_flg;
		}
		if (qtyCol == columnDispRslt1_qty216) {
			return columnDispRslt1_editable_qty216_flg;
		}
		if (qtyCol == columnDispRslt1_qty217) {
			return columnDispRslt1_editable_qty217_flg;
		}
		if (qtyCol == columnDispRslt1_qty218) {
			return columnDispRslt1_editable_qty218_flg;
		}
		if (qtyCol == columnDispRslt1_qty219) {
			return columnDispRslt1_editable_qty219_flg;
		}
		if (qtyCol == columnDispRslt1_qty220) {
			return columnDispRslt1_editable_qty220_flg;
		}
		if (qtyCol == columnDispRslt1_qty221) {
			return columnDispRslt1_editable_qty221_flg;
		}
		if (qtyCol == columnDispRslt1_qty222) {
			return columnDispRslt1_editable_qty222_flg;
		}
		if (qtyCol == columnDispRslt1_qty223) {
			return columnDispRslt1_editable_qty223_flg;
		}
		if (qtyCol == columnDispRslt1_qty224) {
			return columnDispRslt1_editable_qty224_flg;
		}
		if (qtyCol == columnDispRslt1_qty225) {
			return columnDispRslt1_editable_qty225_flg;
		}
		if (qtyCol == columnDispRslt1_qty226) {
			return columnDispRslt1_editable_qty226_flg;
		}
		if (qtyCol == columnDispRslt1_qty227) {
			return columnDispRslt1_editable_qty227_flg;
		}
		if (qtyCol == columnDispRslt1_qty228) {
			return columnDispRslt1_editable_qty228_flg;
		}
		if (qtyCol == columnDispRslt1_qty229) {
			return columnDispRslt1_editable_qty229_flg;
		}
		if (qtyCol == columnDispRslt1_qty230) {
			return columnDispRslt1_editable_qty230_flg;
		}
		if (qtyCol == columnDispRslt1_qty231) {
			return columnDispRslt1_editable_qty231_flg;
		}
		if (qtyCol == columnDispRslt1_qty232) {
			return columnDispRslt1_editable_qty232_flg;
		}
		if (qtyCol == columnDispRslt1_qty233) {
			return columnDispRslt1_editable_qty233_flg;
		}
		if (qtyCol == columnDispRslt1_qty234) {
			return columnDispRslt1_editable_qty234_flg;
		}
		if (qtyCol == columnDispRslt1_qty235) {
			return columnDispRslt1_editable_qty235_flg;
		}
		if (qtyCol == columnDispRslt1_qty236) {
			return columnDispRslt1_editable_qty236_flg;
		}
		if (qtyCol == columnDispRslt1_qty237) {
			return columnDispRslt1_editable_qty237_flg;
		}
		if (qtyCol == columnDispRslt1_qty238) {
			return columnDispRslt1_editable_qty238_flg;
		}
		if (qtyCol == columnDispRslt1_qty239) {
			return columnDispRslt1_editable_qty239_flg;
		}
		if (qtyCol == columnDispRslt1_qty240) {
			return columnDispRslt1_editable_qty240_flg;
		}
		if (qtyCol == columnDispRslt1_qty241) {
			return columnDispRslt1_editable_qty241_flg;
		}
		if (qtyCol == columnDispRslt1_qty242) {
			return columnDispRslt1_editable_qty242_flg;
		}
		if (qtyCol == columnDispRslt1_qty243) {
			return columnDispRslt1_editable_qty243_flg;
		}
		if (qtyCol == columnDispRslt1_qty244) {
			return columnDispRslt1_editable_qty244_flg;
		}
		if (qtyCol == columnDispRslt1_qty245) {
			return columnDispRslt1_editable_qty245_flg;
		}
		if (qtyCol == columnDispRslt1_qty246) {
			return columnDispRslt1_editable_qty246_flg;
		}
		if (qtyCol == columnDispRslt1_qty247) {
			return columnDispRslt1_editable_qty247_flg;
		}
		if (qtyCol == columnDispRslt1_qty248) {
			return columnDispRslt1_editable_qty248_flg;
		}
		if (qtyCol == columnDispRslt1_qty249) {
			return columnDispRslt1_editable_qty249_flg;
		}
		if (qtyCol == columnDispRslt1_qty250) {
			return columnDispRslt1_editable_qty250_flg;
		}
		if (qtyCol == columnDispRslt1_qty251) {
			return columnDispRslt1_editable_qty251_flg;
		}
		if (qtyCol == columnDispRslt1_qty252) {
			return columnDispRslt1_editable_qty252_flg;
		}
		if (qtyCol == columnDispRslt1_qty253) {
			return columnDispRslt1_editable_qty253_flg;
		}
		if (qtyCol == columnDispRslt1_qty254) {
			return columnDispRslt1_editable_qty254_flg;
		}
		if (qtyCol == columnDispRslt1_qty255) {
			return columnDispRslt1_editable_qty255_flg;
		}
		if (qtyCol == columnDispRslt1_qty256) {
			return columnDispRslt1_editable_qty256_flg;
		}
		if (qtyCol == columnDispRslt1_qty257) {
			return columnDispRslt1_editable_qty257_flg;
		}
		if (qtyCol == columnDispRslt1_qty258) {
			return columnDispRslt1_editable_qty258_flg;
		}
		if (qtyCol == columnDispRslt1_qty259) {
			return columnDispRslt1_editable_qty259_flg;
		}
		if (qtyCol == columnDispRslt1_qty260) {
			return columnDispRslt1_editable_qty260_flg;
		}
		if (qtyCol == columnDispRslt1_qty261) {
			return columnDispRslt1_editable_qty261_flg;
		}
		if (qtyCol == columnDispRslt1_qty262) {
			return columnDispRslt1_editable_qty262_flg;
		}
		if (qtyCol == columnDispRslt1_qty263) {
			return columnDispRslt1_editable_qty263_flg;
		}
		if (qtyCol == columnDispRslt1_qty264) {
			return columnDispRslt1_editable_qty264_flg;
		}
		if (qtyCol == columnDispRslt1_qty265) {
			return columnDispRslt1_editable_qty265_flg;
		}
		if (qtyCol == columnDispRslt1_qty266) {
			return columnDispRslt1_editable_qty266_flg;
		}
		if (qtyCol == columnDispRslt1_qty267) {
			return columnDispRslt1_editable_qty267_flg;
		}
		if (qtyCol == columnDispRslt1_qty268) {
			return columnDispRslt1_editable_qty268_flg;
		}
		if (qtyCol == columnDispRslt1_qty269) {
			return columnDispRslt1_editable_qty269_flg;
		}
		if (qtyCol == columnDispRslt1_qty270) {
			return columnDispRslt1_editable_qty270_flg;
		}
		if (qtyCol == columnDispRslt1_qty271) {
			return columnDispRslt1_editable_qty271_flg;
		}
		if (qtyCol == columnDispRslt1_qty272) {
			return columnDispRslt1_editable_qty272_flg;
		}
		if (qtyCol == columnDispRslt1_qty273) {
			return columnDispRslt1_editable_qty273_flg;
		}
		if (qtyCol == columnDispRslt1_qty274) {
			return columnDispRslt1_editable_qty274_flg;
		}
		if (qtyCol == columnDispRslt1_qty275) {
			return columnDispRslt1_editable_qty275_flg;
		}
		if (qtyCol == columnDispRslt1_qty276) {
			return columnDispRslt1_editable_qty276_flg;
		}
		if (qtyCol == columnDispRslt1_qty277) {
			return columnDispRslt1_editable_qty277_flg;
		}
		if (qtyCol == columnDispRslt1_qty278) {
			return columnDispRslt1_editable_qty278_flg;
		}
		if (qtyCol == columnDispRslt1_qty279) {
			return columnDispRslt1_editable_qty279_flg;
		}
		if (qtyCol == columnDispRslt1_qty280) {
			return columnDispRslt1_editable_qty280_flg;
		}
		if (qtyCol == columnDispRslt1_qty281) {
			return columnDispRslt1_editable_qty281_flg;
		}
		if (qtyCol == columnDispRslt1_qty282) {
			return columnDispRslt1_editable_qty282_flg;
		}
		if (qtyCol == columnDispRslt1_qty283) {
			return columnDispRslt1_editable_qty283_flg;
		}
		if (qtyCol == columnDispRslt1_qty284) {
			return columnDispRslt1_editable_qty284_flg;
		}
		if (qtyCol == columnDispRslt1_qty285) {
			return columnDispRslt1_editable_qty285_flg;
		}
		if (qtyCol == columnDispRslt1_qty286) {
			return columnDispRslt1_editable_qty286_flg;
		}
		if (qtyCol == columnDispRslt1_qty287) {
			return columnDispRslt1_editable_qty287_flg;
		}
		if (qtyCol == columnDispRslt1_qty288) {
			return columnDispRslt1_editable_qty288_flg;
		}
		if (qtyCol == columnDispRslt1_qty289) {
			return columnDispRslt1_editable_qty289_flg;
		}
		if (qtyCol == columnDispRslt1_qty290) {
			return columnDispRslt1_editable_qty290_flg;
		}
		if (qtyCol == columnDispRslt1_qty291) {
			return columnDispRslt1_editable_qty291_flg;
		}
		if (qtyCol == columnDispRslt1_qty292) {
			return columnDispRslt1_editable_qty292_flg;
		}
		if (qtyCol == columnDispRslt1_qty293) {
			return columnDispRslt1_editable_qty293_flg;
		}
		if (qtyCol == columnDispRslt1_qty294) {
			return columnDispRslt1_editable_qty294_flg;
		}
		if (qtyCol == columnDispRslt1_qty295) {
			return columnDispRslt1_editable_qty295_flg;
		}
		if (qtyCol == columnDispRslt1_qty296) {
			return columnDispRslt1_editable_qty296_flg;
		}
		if (qtyCol == columnDispRslt1_qty297) {
			return columnDispRslt1_editable_qty297_flg;
		}
		if (qtyCol == columnDispRslt1_qty298) {
			return columnDispRslt1_editable_qty298_flg;
		}
		if (qtyCol == columnDispRslt1_qty299) {
			return columnDispRslt1_editable_qty299_flg;
		}
		if (qtyCol == columnDispRslt1_qty300) {
			return columnDispRslt1_editable_qty300_flg;
		}
		if (qtyCol == columnDispRslt1_qty301) {
			return columnDispRslt1_editable_qty301_flg;
		}
		if (qtyCol == columnDispRslt1_qty302) {
			return columnDispRslt1_editable_qty302_flg;
		}
		if (qtyCol == columnDispRslt1_qty303) {
			return columnDispRslt1_editable_qty303_flg;
		}
		if (qtyCol == columnDispRslt1_qty304) {
			return columnDispRslt1_editable_qty304_flg;
		}
		if (qtyCol == columnDispRslt1_qty305) {
			return columnDispRslt1_editable_qty305_flg;
		}
		if (qtyCol == columnDispRslt1_qty306) {
			return columnDispRslt1_editable_qty306_flg;
		}
		if (qtyCol == columnDispRslt1_qty307) {
			return columnDispRslt1_editable_qty307_flg;
		}
		if (qtyCol == columnDispRslt1_qty308) {
			return columnDispRslt1_editable_qty308_flg;
		}
		if (qtyCol == columnDispRslt1_qty309) {
			return columnDispRslt1_editable_qty309_flg;
		}
		if (qtyCol == columnDispRslt1_qty310) {
			return columnDispRslt1_editable_qty310_flg;
		}
		if (qtyCol == columnDispRslt1_qty311) {
			return columnDispRslt1_editable_qty311_flg;
		}
		if (qtyCol == columnDispRslt1_qty312) {
			return columnDispRslt1_editable_qty312_flg;
		}
		if (qtyCol == columnDispRslt1_qty313) {
			return columnDispRslt1_editable_qty313_flg;
		}
		if (qtyCol == columnDispRslt1_qty314) {
			return columnDispRslt1_editable_qty314_flg;
		}
		if (qtyCol == columnDispRslt1_qty315) {
			return columnDispRslt1_editable_qty315_flg;
		}
		if (qtyCol == columnDispRslt1_qty316) {
			return columnDispRslt1_editable_qty316_flg;
		}
		if (qtyCol == columnDispRslt1_qty317) {
			return columnDispRslt1_editable_qty317_flg;
		}
		if (qtyCol == columnDispRslt1_qty318) {
			return columnDispRslt1_editable_qty318_flg;
		}
		if (qtyCol == columnDispRslt1_qty319) {
			return columnDispRslt1_editable_qty319_flg;
		}
		if (qtyCol == columnDispRslt1_qty320) {
			return columnDispRslt1_editable_qty320_flg;
		}
		if (qtyCol == columnDispRslt1_qty321) {
			return columnDispRslt1_editable_qty321_flg;
		}
		if (qtyCol == columnDispRslt1_qty322) {
			return columnDispRslt1_editable_qty322_flg;
		}
		if (qtyCol == columnDispRslt1_qty323) {
			return columnDispRslt1_editable_qty323_flg;
		}
		if (qtyCol == columnDispRslt1_qty324) {
			return columnDispRslt1_editable_qty324_flg;
		}
		if (qtyCol == columnDispRslt1_qty325) {
			return columnDispRslt1_editable_qty325_flg;
		}
		if (qtyCol == columnDispRslt1_qty326) {
			return columnDispRslt1_editable_qty326_flg;
		}
		if (qtyCol == columnDispRslt1_qty327) {
			return columnDispRslt1_editable_qty327_flg;
		}
		if (qtyCol == columnDispRslt1_qty328) {
			return columnDispRslt1_editable_qty328_flg;
		}
		if (qtyCol == columnDispRslt1_qty329) {
			return columnDispRslt1_editable_qty329_flg;
		}
		if (qtyCol == columnDispRslt1_qty330) {
			return columnDispRslt1_editable_qty330_flg;
		}
		if (qtyCol == columnDispRslt1_qty331) {
			return columnDispRslt1_editable_qty331_flg;
		}
		if (qtyCol == columnDispRslt1_qty332) {
			return columnDispRslt1_editable_qty332_flg;
		}
		if (qtyCol == columnDispRslt1_qty333) {
			return columnDispRslt1_editable_qty333_flg;
		}
		if (qtyCol == columnDispRslt1_qty334) {
			return columnDispRslt1_editable_qty334_flg;
		}
		if (qtyCol == columnDispRslt1_qty335) {
			return columnDispRslt1_editable_qty335_flg;
		}
		if (qtyCol == columnDispRslt1_qty336) {
			return columnDispRslt1_editable_qty336_flg;
		}
		if (qtyCol == columnDispRslt1_qty337) {
			return columnDispRslt1_editable_qty337_flg;
		}
		if (qtyCol == columnDispRslt1_qty338) {
			return columnDispRslt1_editable_qty338_flg;
		}
		if (qtyCol == columnDispRslt1_qty339) {
			return columnDispRslt1_editable_qty339_flg;
		}
		if (qtyCol == columnDispRslt1_qty340) {
			return columnDispRslt1_editable_qty340_flg;
		}
		if (qtyCol == columnDispRslt1_qty341) {
			return columnDispRslt1_editable_qty341_flg;
		}
		if (qtyCol == columnDispRslt1_qty342) {
			return columnDispRslt1_editable_qty342_flg;
		}
		if (qtyCol == columnDispRslt1_qty343) {
			return columnDispRslt1_editable_qty343_flg;
		}
		if (qtyCol == columnDispRslt1_qty344) {
			return columnDispRslt1_editable_qty344_flg;
		}
		if (qtyCol == columnDispRslt1_qty345) {
			return columnDispRslt1_editable_qty345_flg;
		}
		if (qtyCol == columnDispRslt1_qty346) {
			return columnDispRslt1_editable_qty346_flg;
		}
		if (qtyCol == columnDispRslt1_qty347) {
			return columnDispRslt1_editable_qty347_flg;
		}
		if (qtyCol == columnDispRslt1_qty348) {
			return columnDispRslt1_editable_qty348_flg;
		}
		if (qtyCol == columnDispRslt1_qty349) {
			return columnDispRslt1_editable_qty349_flg;
		}
		if (qtyCol == columnDispRslt1_qty350) {
			return columnDispRslt1_editable_qty350_flg;
		}
		if (qtyCol == columnDispRslt1_qty351) {
			return columnDispRslt1_editable_qty351_flg;
		}
		if (qtyCol == columnDispRslt1_qty352) {
			return columnDispRslt1_editable_qty352_flg;
		}
		if (qtyCol == columnDispRslt1_qty353) {
			return columnDispRslt1_editable_qty353_flg;
		}
		if (qtyCol == columnDispRslt1_qty354) {
			return columnDispRslt1_editable_qty354_flg;
		}
		if (qtyCol == columnDispRslt1_qty355) {
			return columnDispRslt1_editable_qty355_flg;
		}
		if (qtyCol == columnDispRslt1_qty356) {
			return columnDispRslt1_editable_qty356_flg;
		}
		if (qtyCol == columnDispRslt1_qty357) {
			return columnDispRslt1_editable_qty357_flg;
		}
		if (qtyCol == columnDispRslt1_qty358) {
			return columnDispRslt1_editable_qty358_flg;
		}
		if (qtyCol == columnDispRslt1_qty359) {
			return columnDispRslt1_editable_qty359_flg;
		}
		if (qtyCol == columnDispRslt1_qty360) {
			return columnDispRslt1_editable_qty360_flg;
		}
		if (qtyCol == columnDispRslt1_qty361) {
			return columnDispRslt1_editable_qty361_flg;
		}
		if (qtyCol == columnDispRslt1_qty362) {
			return columnDispRslt1_editable_qty362_flg;
		}
		if (qtyCol == columnDispRslt1_qty363) {
			return columnDispRslt1_editable_qty363_flg;
		}
		if (qtyCol == columnDispRslt1_qty364) {
			return columnDispRslt1_editable_qty364_flg;
		}
		if (qtyCol == columnDispRslt1_qty365) {
			return columnDispRslt1_editable_qty365_flg;
		}
		if (qtyCol == columnDispRslt1_qty366) {
			return columnDispRslt1_editable_qty366_flg;
		}
		if (qtyCol == columnDispRslt1_qty367) {
			return columnDispRslt1_editable_qty367_flg;
		}
		if (qtyCol == columnDispRslt1_qty368) {
			return columnDispRslt1_editable_qty368_flg;
		}
		if (qtyCol == columnDispRslt1_qty369) {
			return columnDispRslt1_editable_qty369_flg;
		}
		if (qtyCol == columnDispRslt1_qty370) {
			return columnDispRslt1_editable_qty370_flg;
		}
		if (qtyCol == columnDispRslt1_qty371) {
			return columnDispRslt1_editable_qty371_flg;
		}
		if (qtyCol == columnDispRslt1_qty372) {
			return columnDispRslt1_editable_qty372_flg;
		}
		if (qtyCol == columnDispRslt1_qty373) {
			return columnDispRslt1_editable_qty373_flg;
		}
		if (qtyCol == columnDispRslt1_qty374) {
			return columnDispRslt1_editable_qty374_flg;
		}
		if (qtyCol == columnDispRslt1_qty375) {
			return columnDispRslt1_editable_qty375_flg;
		}
		if (qtyCol == columnDispRslt1_qty376) {
			return columnDispRslt1_editable_qty376_flg;
		}
		if (qtyCol == columnDispRslt1_qty377) {
			return columnDispRslt1_editable_qty377_flg;
		}
		if (qtyCol == columnDispRslt1_qty378) {
			return columnDispRslt1_editable_qty378_flg;
		}
		if (qtyCol == columnDispRslt1_qty379) {
			return columnDispRslt1_editable_qty379_flg;
		}
		if (qtyCol == columnDispRslt1_qty380) {
			return columnDispRslt1_editable_qty380_flg;
		}
		if (qtyCol == columnDispRslt1_qty381) {
			return columnDispRslt1_editable_qty381_flg;
		}
		if (qtyCol == columnDispRslt1_qty382) {
			return columnDispRslt1_editable_qty382_flg;
		}
		if (qtyCol == columnDispRslt1_qty383) {
			return columnDispRslt1_editable_qty383_flg;
		}
		if (qtyCol == columnDispRslt1_qty384) {
			return columnDispRslt1_editable_qty384_flg;
		}
		if (qtyCol == columnDispRslt1_qty385) {
			return columnDispRslt1_editable_qty385_flg;
		}
		if (qtyCol == columnDispRslt1_qty386) {
			return columnDispRslt1_editable_qty386_flg;
		}
		if (qtyCol == columnDispRslt1_qty387) {
			return columnDispRslt1_editable_qty387_flg;
		}
		if (qtyCol == columnDispRslt1_qty388) {
			return columnDispRslt1_editable_qty388_flg;
		}
		if (qtyCol == columnDispRslt1_qty389) {
			return columnDispRslt1_editable_qty389_flg;
		}
		if (qtyCol == columnDispRslt1_qty390) {
			return columnDispRslt1_editable_qty390_flg;
		}
		if (qtyCol == columnDispRslt1_qty391) {
			return columnDispRslt1_editable_qty391_flg;
		}
		if (qtyCol == columnDispRslt1_qty392) {
			return columnDispRslt1_editable_qty392_flg;
		}
		if (qtyCol == columnDispRslt1_qty393) {
			return columnDispRslt1_editable_qty393_flg;
		}
		if (qtyCol == columnDispRslt1_qty394) {
			return columnDispRslt1_editable_qty394_flg;
		}
		if (qtyCol == columnDispRslt1_qty395) {
			return columnDispRslt1_editable_qty395_flg;
		}
		if (qtyCol == columnDispRslt1_qty396) {
			return columnDispRslt1_editable_qty396_flg;
		}
		if (qtyCol == columnDispRslt1_qty397) {
			return columnDispRslt1_editable_qty397_flg;
		}
		if (qtyCol == columnDispRslt1_qty398) {
			return columnDispRslt1_editable_qty398_flg;
		}
		if (qtyCol == columnDispRslt1_qty399) {
			return columnDispRslt1_editable_qty399_flg;
		}
		if (qtyCol == columnDispRslt1_qty400) {
			return columnDispRslt1_editable_qty400_flg;
		}
		if (qtyCol == columnDispRslt1_qty401) {
			return columnDispRslt1_editable_qty401_flg;
		}
		if (qtyCol == columnDispRslt1_qty402) {
			return columnDispRslt1_editable_qty402_flg;
		}
		if (qtyCol == columnDispRslt1_qty403) {
			return columnDispRslt1_editable_qty403_flg;
		}
		if (qtyCol == columnDispRslt1_qty404) {
			return columnDispRslt1_editable_qty404_flg;
		}
		if (qtyCol == columnDispRslt1_qty405) {
			return columnDispRslt1_editable_qty405_flg;
		}
		if (qtyCol == columnDispRslt1_qty406) {
			return columnDispRslt1_editable_qty406_flg;
		}
		if (qtyCol == columnDispRslt1_qty407) {
			return columnDispRslt1_editable_qty407_flg;
		}
		if (qtyCol == columnDispRslt1_qty408) {
			return columnDispRslt1_editable_qty408_flg;
		}
		if (qtyCol == columnDispRslt1_qty409) {
			return columnDispRslt1_editable_qty409_flg;
		}
		if (qtyCol == columnDispRslt1_qty410) {
			return columnDispRslt1_editable_qty410_flg;
		}
		if (qtyCol == columnDispRslt1_qty411) {
			return columnDispRslt1_editable_qty411_flg;
		}
		if (qtyCol == columnDispRslt1_qty412) {
			return columnDispRslt1_editable_qty412_flg;
		}
		if (qtyCol == columnDispRslt1_qty413) {
			return columnDispRslt1_editable_qty413_flg;
		}
		if (qtyCol == columnDispRslt1_qty414) {
			return columnDispRslt1_editable_qty414_flg;
		}
		if (qtyCol == columnDispRslt1_qty415) {
			return columnDispRslt1_editable_qty415_flg;
		}
		if (qtyCol == columnDispRslt1_qty416) {
			return columnDispRslt1_editable_qty416_flg;
		}
		if (qtyCol == columnDispRslt1_qty417) {
			return columnDispRslt1_editable_qty417_flg;
		}
		if (qtyCol == columnDispRslt1_qty418) {
			return columnDispRslt1_editable_qty418_flg;
		}
		if (qtyCol == columnDispRslt1_qty419) {
			return columnDispRslt1_editable_qty419_flg;
		}
		if (qtyCol == columnDispRslt1_qty420) {
			return columnDispRslt1_editable_qty420_flg;
		}
		if (qtyCol == columnDispRslt1_qty421) {
			return columnDispRslt1_editable_qty421_flg;
		}
		if (qtyCol == columnDispRslt1_qty422) {
			return columnDispRslt1_editable_qty422_flg;
		}
		if (qtyCol == columnDispRslt1_qty423) {
			return columnDispRslt1_editable_qty423_flg;
		}
		if (qtyCol == columnDispRslt1_qty424) {
			return columnDispRslt1_editable_qty424_flg;
		}
		if (qtyCol == columnDispRslt1_qty425) {
			return columnDispRslt1_editable_qty425_flg;
		}
		if (qtyCol == columnDispRslt1_qty426) {
			return columnDispRslt1_editable_qty426_flg;
		}
		if (qtyCol == columnDispRslt1_qty427) {
			return columnDispRslt1_editable_qty427_flg;
		}
		if (qtyCol == columnDispRslt1_qty428) {
			return columnDispRslt1_editable_qty428_flg;
		}
		if (qtyCol == columnDispRslt1_qty429) {
			return columnDispRslt1_editable_qty429_flg;
		}
		if (qtyCol == columnDispRslt1_qty430) {
			return columnDispRslt1_editable_qty430_flg;
		}
		if (qtyCol == columnDispRslt1_qty431) {
			return columnDispRslt1_editable_qty431_flg;
		}
		if (qtyCol == columnDispRslt1_qty432) {
			return columnDispRslt1_editable_qty432_flg;
		}
		if (qtyCol == columnDispRslt1_qty433) {
			return columnDispRslt1_editable_qty433_flg;
		}
		if (qtyCol == columnDispRslt1_qty434) {
			return columnDispRslt1_editable_qty434_flg;
		}
		if (qtyCol == columnDispRslt1_qty435) {
			return columnDispRslt1_editable_qty435_flg;
		}
		if (qtyCol == columnDispRslt1_qty436) {
			return columnDispRslt1_editable_qty436_flg;
		}
		if (qtyCol == columnDispRslt1_qty437) {
			return columnDispRslt1_editable_qty437_flg;
		}
		if (qtyCol == columnDispRslt1_qty438) {
			return columnDispRslt1_editable_qty438_flg;
		}
		if (qtyCol == columnDispRslt1_qty439) {
			return columnDispRslt1_editable_qty439_flg;
		}
		if (qtyCol == columnDispRslt1_qty440) {
			return columnDispRslt1_editable_qty440_flg;
		}
		if (qtyCol == columnDispRslt1_qty441) {
			return columnDispRslt1_editable_qty441_flg;
		}
		if (qtyCol == columnDispRslt1_qty442) {
			return columnDispRslt1_editable_qty442_flg;
		}
		if (qtyCol == columnDispRslt1_qty443) {
			return columnDispRslt1_editable_qty443_flg;
		}
		if (qtyCol == columnDispRslt1_qty444) {
			return columnDispRslt1_editable_qty444_flg;
		}
		if (qtyCol == columnDispRslt1_qty445) {
			return columnDispRslt1_editable_qty445_flg;
		}
		if (qtyCol == columnDispRslt1_qty446) {
			return columnDispRslt1_editable_qty446_flg;
		}
		if (qtyCol == columnDispRslt1_qty447) {
			return columnDispRslt1_editable_qty447_flg;
		}
		if (qtyCol == columnDispRslt1_qty448) {
			return columnDispRslt1_editable_qty448_flg;
		}
		if (qtyCol == columnDispRslt1_qty449) {
			return columnDispRslt1_editable_qty449_flg;
		}
		if (qtyCol == columnDispRslt1_qty450) {
			return columnDispRslt1_editable_qty450_flg;
		}
		if (qtyCol == columnDispRslt1_qty451) {
			return columnDispRslt1_editable_qty451_flg;
		}
		if (qtyCol == columnDispRslt1_qty452) {
			return columnDispRslt1_editable_qty452_flg;
		}
		if (qtyCol == columnDispRslt1_qty453) {
			return columnDispRslt1_editable_qty453_flg;
		}
		if (qtyCol == columnDispRslt1_qty454) {
			return columnDispRslt1_editable_qty454_flg;
		}
		if (qtyCol == columnDispRslt1_qty455) {
			return columnDispRslt1_editable_qty455_flg;
		}
		if (qtyCol == columnDispRslt1_qty456) {
			return columnDispRslt1_editable_qty456_flg;
		}
		if (qtyCol == columnDispRslt1_qty457) {
			return columnDispRslt1_editable_qty457_flg;
		}
		if (qtyCol == columnDispRslt1_qty458) {
			return columnDispRslt1_editable_qty458_flg;
		}
		if (qtyCol == columnDispRslt1_qty459) {
			return columnDispRslt1_editable_qty459_flg;
		}
		if (qtyCol == columnDispRslt1_qty460) {
			return columnDispRslt1_editable_qty460_flg;
		}
		if (qtyCol == columnDispRslt1_qty461) {
			return columnDispRslt1_editable_qty461_flg;
		}
		if (qtyCol == columnDispRslt1_qty462) {
			return columnDispRslt1_editable_qty462_flg;
		}
		if (qtyCol == columnDispRslt1_qty463) {
			return columnDispRslt1_editable_qty463_flg;
		}
		if (qtyCol == columnDispRslt1_qty464) {
			return columnDispRslt1_editable_qty464_flg;
		}
		if (qtyCol == columnDispRslt1_qty465) {
			return columnDispRslt1_editable_qty465_flg;
		}
		if (qtyCol == columnDispRslt1_qty466) {
			return columnDispRslt1_editable_qty466_flg;
		}
		if (qtyCol == columnDispRslt1_qty467) {
			return columnDispRslt1_editable_qty467_flg;
		}
		if (qtyCol == columnDispRslt1_qty468) {
			return columnDispRslt1_editable_qty468_flg;
		}
		if (qtyCol == columnDispRslt1_qty469) {
			return columnDispRslt1_editable_qty469_flg;
		}
		if (qtyCol == columnDispRslt1_qty470) {
			return columnDispRslt1_editable_qty470_flg;
		}
		if (qtyCol == columnDispRslt1_qty471) {
			return columnDispRslt1_editable_qty471_flg;
		}
		if (qtyCol == columnDispRslt1_qty472) {
			return columnDispRslt1_editable_qty472_flg;
		}
		if (qtyCol == columnDispRslt1_qty473) {
			return columnDispRslt1_editable_qty473_flg;
		}
		if (qtyCol == columnDispRslt1_qty474) {
			return columnDispRslt1_editable_qty474_flg;
		}
		if (qtyCol == columnDispRslt1_qty475) {
			return columnDispRslt1_editable_qty475_flg;
		}
		if (qtyCol == columnDispRslt1_qty476) {
			return columnDispRslt1_editable_qty476_flg;
		}
		if (qtyCol == columnDispRslt1_qty477) {
			return columnDispRslt1_editable_qty477_flg;
		}
		if (qtyCol == columnDispRslt1_qty478) {
			return columnDispRslt1_editable_qty478_flg;
		}
		if (qtyCol == columnDispRslt1_qty479) {
			return columnDispRslt1_editable_qty479_flg;
		}
		if (qtyCol == columnDispRslt1_qty480) {
			return columnDispRslt1_editable_qty480_flg;
		}
		if (qtyCol == columnDispRslt1_qty481) {
			return columnDispRslt1_editable_qty481_flg;
		}
		if (qtyCol == columnDispRslt1_qty482) {
			return columnDispRslt1_editable_qty482_flg;
		}
		if (qtyCol == columnDispRslt1_qty483) {
			return columnDispRslt1_editable_qty483_flg;
		}
		if (qtyCol == columnDispRslt1_qty484) {
			return columnDispRslt1_editable_qty484_flg;
		}
		if (qtyCol == columnDispRslt1_qty485) {
			return columnDispRslt1_editable_qty485_flg;
		}
		if (qtyCol == columnDispRslt1_qty486) {
			return columnDispRslt1_editable_qty486_flg;
		}
		if (qtyCol == columnDispRslt1_qty487) {
			return columnDispRslt1_editable_qty487_flg;
		}
		if (qtyCol == columnDispRslt1_qty488) {
			return columnDispRslt1_editable_qty488_flg;
		}
		if (qtyCol == columnDispRslt1_qty489) {
			return columnDispRslt1_editable_qty489_flg;
		}
		if (qtyCol == columnDispRslt1_qty490) {
			return columnDispRslt1_editable_qty490_flg;
		}
		if (qtyCol == columnDispRslt1_qty491) {
			return columnDispRslt1_editable_qty491_flg;
		}
		if (qtyCol == columnDispRslt1_qty492) {
			return columnDispRslt1_editable_qty492_flg;
		}
		if (qtyCol == columnDispRslt1_qty493) {
			return columnDispRslt1_editable_qty493_flg;
		}
		if (qtyCol == columnDispRslt1_qty494) {
			return columnDispRslt1_editable_qty494_flg;
		}
		if (qtyCol == columnDispRslt1_qty495) {
			return columnDispRslt1_editable_qty495_flg;
		}
		if (qtyCol == columnDispRslt1_qty496) {
			return columnDispRslt1_editable_qty496_flg;
		}
		if (qtyCol == columnDispRslt1_qty497) {
			return columnDispRslt1_editable_qty497_flg;
		}
		if (qtyCol == columnDispRslt1_qty498) {
			return columnDispRslt1_editable_qty498_flg;
		}
		return null;
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		for(MCColumnConfig r : getQtys()) {
			if(lc == r) {
				copyDispRslt1InfoToRslt3(info);
				break;
			}
		}
		if(lc == columnRslt3_base_unit_qty
				|| lc == columnRslt3_due_dt
		) {
			MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd,
					DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,
					DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
			copyRslt3ToDispRslt1(getRslt3L().get(info.getEventIndex()), true, true, idxKey);
		}
	}


	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if(vc == columnRslt3_due_dt) {
			MCDate afDt = (MCDate)info.getNewValue();
			if(!isNull(afDt)) {
				if(afDt.lt(getCopyCndR().dmnd_dt_fr()) || afDt.gt(getCopyCndR().dmnd_dt_to())) {
					return false;
				}
			}
		}
		if(vc == columnRslt3_base_unit_qty
				|| vc == columnRslt3_due_dt
		) {
			MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd,
					DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,
					DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
			copyRslt3ToDispRslt1(getRslt3L().get(info.getEventIndex()), false, true, idxKey);
		}

		return super.doVCEvent(vc, info);
	}

	@Override
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);

		// 対象日のみ表示の場合のみ対象
		if(!getCndR().selectDlyDisp()) {
			return;
		}
		
		if(info.getEventIndex() < 0) {
			return;
		}

		// 在庫推移テーブルでのイベントの場合のみ
		if(!(ne instanceof MCColumnConfig)) {
			return;
		}
		if(((MCColumnConfig)ne).getBaseTable() != DispRslt1Table) {
			return;
		}

		int idx = info.getOldIndex();
		if (idx >= 0 && idx == info.getEventIndex()) {
			DispRslt1R row = getDispRslt1L().get(idx);
			String[] keyArr = new String[] { row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.loc_cd() };
			_Rslt3L.put(toMapKey(keyArr), getRslt3L().clone());
		}
		
		DispRslt1R rslt1R = getDispRslt1L().get(info.getEventIndex());
		if(isNull(rslt1R)) {
			return;
		}
		String[] keyArr = new String[] { rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd() };
		MCList<Rslt3R> tmpRslt3L = _Rslt3L.get(toMapKey(keyArr));
		MCList<Rslt4R> tmpRslt4L = _Rslt4L.get(toMapKey(keyArr));
		MCList<Rslt5R> tmpRslt5L = _Rslt5L.get(toMapKey(keyArr));
		getRslt3L().setAll(tmpRslt3L);
		getRslt4L().setAll(tmpRslt4L);
		getRslt5L().setAll(tmpRslt5L);

		MCColumnConfig clm = DispRslt1Table.getSelectedColumnConfig();
		MCDate dt = null;
		if(clm != null) {
			dt = _colMap.get(clm.getBaseRowColumnName());
		}
		else {
			doDtlTableFilter(null);
			return;
		}

		if(isNull(dt)) {
			doDtlTableFilter(null);
		}
		else {			
			doDtlTableFilter(dt);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if(nc == Cnd_dmndDtl
				|| nc == Cnd_sim
				|| nc == Cnd_oldSpply
		) {
			dispRows();
		}
	}

	/**
	 * 在庫推移での入力を供給計画の該当項目に反映する<br>
	 * @param info
	 */
	protected void copyDispRslt1InfoToRslt3(MCEventInfo info) {

		DispRslt1R rslt1R = getDispRslt1L().get(info.getEventIndex());
		DispRslt1R spplyRslt1R = DispRslt1R.create();
		MCDate dt = _colMap.get(info.getOldColumn().getBaseRowColumnName());

		MCIndexKey idxKey = getDispRslt1L().createIndex(getDispRslt1Keys());
		String[] keyArr = new String[] { rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd() };
		MCList<DispRslt1R> rslt1L = getDispRslt1L().subList(idxKey, keyArr);

		for(DispRslt1R r : rslt1L) {
			if(MSC_SD_ADJST_DTL_TYP.isDMND(r.sd_adjst_dtl_typ())) {
				r.check(true);
			}
			if(MSC_SD_ADJST_DTL_TYP.isSPPLY(r.sd_adjst_dtl_typ())) {
				spplyRslt1R = r;
			}
		}

		if (isNull(_Rslt3L.get(toMapKey(keyArr)))
				|| _Rslt3L.get(toMapKey(keyArr)).size() == 0
		) {
			int i = _dateMap.get(dt.toString());
			spplyRslt1R.setNumber(getColnm()[i], rslt1R.getNumber(getColnm()[i]));
			insRowToRslt3(info, rslt1R, dt);
		}
		else {
			MCList<Rslt3R> Rslt3L = _Rslt3L.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()));
			boolean exists = false;

			for(Rslt3R Rslt3R : Rslt3L) {
				if(isSame(Rslt3R.due_dt(), dt)) {
					if(!Rslt3R.isStatusDelete()) {
						// イベントを発生させないため、コンテナに直接値を設定
						Rslt3R.itm_cd(rslt1R.itm_cd());
						Rslt3R.itm_sub1(rslt1R.itm_sub1());
						Rslt3R.itm_sub2(rslt1R.itm_sub2());
						Rslt3R.itm_sub3(rslt1R.itm_sub3());
						Rslt3R.itm_nm(rslt1R.itm_nm());
						int i = _dateMap.get(dt.toString());
						if(isNull(rslt1R.getNumber(getColnm()[i]))) {
							spplyRslt1R.setNumber(getColnm()[i], null);
							if(!isNull(Rslt3R.dly_sd_no())) {
								Rslt3R.setStatus(MCRow.DELETE);
							}
							else {
								Rslt3L.remove(Rslt3R);
								_Rslt3L.put(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()), Rslt3L);
								showDlySd(rslt1R);
							}
						}
						else {
							Rslt3R.base_unit_qty(rslt1R.getNumber(getColnm()[i]));
							if(Rslt3R.base_unit_qty().gt(nvl(Rslt3R.order_reg_qty(), MCNumber.ZERO))) {
								spplyRslt1R.setNumber(getColnm()[i], Rslt3R.base_unit_qty().subtract(nvl(Rslt3R.order_reg_qty(), MCNumber.ZERO)));
							}
							else {
								spplyRslt1R.setNumber(getColnm()[i], null);
							}

							if(isSame(MCRow.NONE, Rslt3R.getStatus())) {
								Rslt3R.setStatus(MCRow.MODIFY);
							}
							_Rslt3L.put(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()), Rslt3L);
						}
						exists = true;
						break;
					}
				}
			}

			if(!exists) {
				int i = _dateMap.get(dt.toString());
				spplyRslt1R.setNumber(getColnm()[i], rslt1R.getNumber(getColnm()[i]));
				insRowToRslt3(info, rslt1R, dt);
			}
		}

		calcStk(rslt1R);

		MCList<Rslt1R> tmpL = _bakRslt1L.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()));
		_rslt1L.setAll(tmpL);
		// 在庫推移グラフの表示をリフレッシュ
		_innerGraph.refreshGraph();
		if(_outerGraph != null) {
			_outerGraph.refreshGraph();
		}
	}

	protected void insRowToRslt3(MCEventInfo info, DispRslt1R rslt1R, MCDate dt) {
		Rslt3R rslt3R = Rslt3R.create();

		// イベントを発生させないため、コンテナに直接値を設定
		rslt3R.setStatus(MCRow.CREATE);
		rslt3R.itm_cd(rslt1R.itm_cd());
		rslt3R.itm_sub1(rslt1R.itm_sub1());
		rslt3R.itm_sub2(rslt1R.itm_sub2());
		rslt3R.itm_sub3(rslt1R.itm_sub3());
		rslt3R.itm_nm(rslt1R.itm_nm());
		rslt3R.base_unit_cd(rslt1R.unit_cd());
		rslt3R.base_unit_nm(rslt1R.unit_nm());
		rslt3R.base_unit_dec_place(rslt1R.dec_place());

		int i = _dateMap.get(dt.toString());
		rslt3R.base_unit_qty(rslt1R.getNumber(getColnm()[i]));
		rslt3R.strg_loc_cd(rslt1R.loc_cd());
		rslt3R.strg_loc_nm(rslt1R.loc_nm());
		rslt3R.strg_wg_cd(rslt1R.wg_cd());
		rslt3R.strg_wg_nm(rslt1R.wg_nm());
		rslt3R.due_dt(dt);

		String[] keyArr = new String[] { rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd() };
		MCList<Rslt3R> tmpL = _Rslt3L.get(toMapKey(keyArr));
		if(isNull(tmpL)) {
			tmpL = MCList.create(Rslt3R.class);
		}
		tmpL.add(rslt3R);
		_Rslt3L.put(toMapKey(keyArr), tmpL);
		getRslt3L().add(rslt3R);
	}

	/**
	 * 各一覧を日付でフィルタリングする
	 * @param dt
	 */
	protected void doDtlTableFilter(MCDate dt) {
		String logic = null;
		Comparable<?> v = null;
		if (!isNull(dt)) {
			v = MCRowFilter.getDateSaveValue(null, null, null, dt.toMCTimestamp());			
		}

		// 供給計画
		MCRowFilterList<MCRowFilter> rslt3RFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilter rslt3RF = Rslt3Table.createRowFilter();
		rslt3RF.setCondition(Rslt3R.$due_dt, MCDataType.DATE, v, MCRowFilter.EQUAL, logic);
		rslt3RFL.add(rslt3RF);

		// シミュレーション
		MCRowFilterList<MCRowFilter> rslt4RFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilter rslt4RF = Rslt4Table.createRowFilter();
		rslt4RF.setCondition(Rslt4R.$due_dt, MCDataType.DATE, v, MCRowFilter.EQUAL, logic);
		rslt4RFL.add(rslt4RF);

		// 需要情報
		MCRowFilterList<MCRowFilter> rslt5RFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilter rslt5RF = Rslt5Table.createRowFilter();
		rslt5RF.setCondition(Rslt5R.$dmnd_dt, MCDataType.DATE, v, MCRowFilter.EQUAL, logic);
		rslt5RFL.add(rslt5RF);
		
		if (!rslt3RFL.isEmpty()) {
			filterList(Rslt3Table, rslt3RFL, false);
		}
		if (!rslt4RFL.isEmpty()) {
			filterList(Rslt4Table, rslt4RFL, false);
		}
		if (!rslt5RFL.isEmpty()) {
			filterList(Rslt5Table, rslt5RFL, false);
		}
	}

	
	/**
	 * 在庫推移の行の表示を制御する
	 */
	protected void dispRows() {

		// 関連データを非表示に
		getRslt3L().clear();
		getRslt4L().clear();
		getRslt5L().clear();

		getDispRslt1L().clear();
		MCList<DispRslt1R> newList = getDispRslt1L().createInstance();
		for(DispRslt1R r : _dispRslt1BakL) {
			if(MSC_SD_ADJST_DTL_TYP.isSPLN(r.sd_adjst_dtl_typ())
					|| MSC_SD_ADJST_DTL_TYP.isCSTFRCST(r.sd_adjst_dtl_typ())
					|| MSC_SD_ADJST_DTL_TYP.isOTH(r.sd_adjst_dtl_typ())
			) {
				if(!getCndR().dmndDtl()) {
					continue;
				}
			}
			else if(MSC_SD_ADJST_DTL_TYP.isSIM(r.sd_adjst_dtl_typ())
					|| MSC_SD_ADJST_DTL_TYP.isSIMSTK(r.sd_adjst_dtl_typ())
			) {
				if(!getCndR().sim()) {
					continue;
				}
			}
			else if(MSC_SD_ADJST_DTL_TYP.isOLDSPPLY(r.sd_adjst_dtl_typ())
					|| MSC_SD_ADJST_DTL_TYP.isOLDSTK(r.sd_adjst_dtl_typ())
			) {
				if(!getCndR().oldSpply()) {
					continue;
				}
			}
			if (MSC_SD_ADJST_DTL_TYP.isGI(r.sd_adjst_dtl_typ())) {
				if(getCndR().dmndDtl()) {
					r.disp_itm(null);
					r.disp_loc(null);
					r.disp_wg(null);
				}
				else {
					r.disp_itm(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this));
					r.disp_loc(r.loc_cd());
					r.disp_wg(r.wg_cd());
				}
			}
			newList.add(r);
		}
		MCSortPolicy sp = crtSortVH();
		newList.sort(sp);
		getDispRslt1L().setAll(newList);
	}

	/**
	 * 供給計画での入力を在庫推移の該当項目に反映する<br>
	 * @param Rslt3R
	 * @param addFlg
	 * @param calcFlg
	 * @param idxKey
	 */
	protected void copyRslt3ToDispRslt1(Rslt3R rslt3R, boolean addFlg, boolean calcFlg, MCIndexKey idxKey) {

		if(isNull(rslt3R) || isNull(rslt3R.due_dt()) || isNull(rslt3R.base_unit_qty())) {
			return;
		}

		int i = _dateMap.get(rslt3R.due_dt().toString());

		DispRslt1R rslt1R = getDispRslt1L().getFirst(idxKey, rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLYENT.value());
		DispRslt1R spplyRslt1R = getDispRslt1L().getFirst(idxKey, rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLY.value());
		if(isNull(rslt1R) || isNull(spplyRslt1R)) {
			return;
		}

		MCNumber bfQty = MCNumber.ZERO;
		MCNumber bfSpplyQty = MCNumber.ZERO;
		if(!isNull(rslt1R.getNumber(getColnm()[i]))) {
			bfQty = rslt1R.getNumber(getColnm()[i]);
		}
		if(!isNull(spplyRslt1R.getNumber(getColnm()[i]))) {
			bfSpplyQty = spplyRslt1R.getNumber(getColnm()[i]);
		}

		if(addFlg) {
			rslt1R.setNumber(getColnm()[i], bfQty.add(rslt3R.base_unit_qty()));
			if(rslt3R.base_unit_qty().gt(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))) {
				spplyRslt1R.setNumber(getColnm()[i], bfSpplyQty.add(rslt3R.base_unit_qty().subtract(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))));
			}
		}
		else {
			rslt1R.setNumber(getColnm()[i], bfQty.subtract(rslt3R.base_unit_qty()));
			if(rslt3R.base_unit_qty().gt(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))) {
				spplyRslt1R.setNumber(getColnm()[i], bfSpplyQty.subtract(rslt3R.base_unit_qty().subtract(nvl(rslt3R.order_reg_qty(), MCNumber.ZERO))));
			}
		}

		String[] keyArr = new String[] {
				Rslt3R.$itm_cd, Rslt3R.$itm_sub1, Rslt3R.$itm_sub2, Rslt3R.$itm_sub3,
				Rslt3R.$strg_loc_cd, Rslt3R.$due_dt
		};
		Comparable<?>[] valArr = new Comparable[] {
				rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), rslt3R.due_dt()
		};
		MCList<Rslt3R> Rslt3L = getRslt3L().subList(keyArr, valArr);
		if(isNull(Rslt3L)) {
			return;
		}
		int cnt = Rslt3L.size() - Rslt3L.subList(Status.DELETE).size();
		if(addFlg) {
			if(cnt > 1) {
				rslt1R.setBoolean(getFlgColnm()[i-1], false);
			}
			else {
				rslt1R.setBoolean(getFlgColnm()[i-1], true);
			}
		}
		else {
			if(cnt > 2) {
				rslt1R.setBoolean(getFlgColnm()[i-1], false);
			}
			else {
				rslt1R.setBoolean(getFlgColnm()[i-1], true);
			}
		}
		if (calcFlg) {
			refreshGraph(rslt1R);
		}
	}
	protected void refreshGraph(DispRslt1R rslt1R) {
		calcStk(rslt1R);

		MCList<Rslt1R> tmpL = _bakRslt1L.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd()));
		_rslt1L.setAll(tmpL);
		// 在庫推移グラフの表示をリフレッシュ
		_innerGraph.refreshGraph();
		if(_outerGraph != null) {
			_outerGraph.refreshGraph();
		}
	}
	protected void refreshGraph(Rslt3R rslt3R){
		String[] keys = {DispRslt1R.$itm_cd,DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3,DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ};
		Comparable<?>[] vals = {rslt3R.itm_cd(), rslt3R.itm_sub1(), rslt3R.itm_sub2(), rslt3R.itm_sub3(), rslt3R.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLYENT.value()};
		DispRslt1R rslt1R = getDispRslt1L().getFirst(keys,vals);
		if(isNull(rslt1R) ) {
			return;
		}
		refreshGraph(rslt1R);
	}

	/** 明細のデータ項目の配列を返します */
	protected MCColumnConfig[] getQtys() {
		if (_qtys == null) {
			_qtys = new MCColumnConfig[] {
					columnDispRslt1_qty00, columnDispRslt1_qty01, columnDispRslt1_qty02,
					columnDispRslt1_qty03, columnDispRslt1_qty04, columnDispRslt1_qty05,
					columnDispRslt1_qty06, columnDispRslt1_qty07, columnDispRslt1_qty08,
					columnDispRslt1_qty09, columnDispRslt1_qty10, columnDispRslt1_qty11,
					columnDispRslt1_qty12, columnDispRslt1_qty13, columnDispRslt1_qty14,
					columnDispRslt1_qty15, columnDispRslt1_qty16, columnDispRslt1_qty17,
					columnDispRslt1_qty18, columnDispRslt1_qty19, columnDispRslt1_qty20,
					columnDispRslt1_qty21, columnDispRslt1_qty22, columnDispRslt1_qty23,
					columnDispRslt1_qty24, columnDispRslt1_qty25, columnDispRslt1_qty26,
					columnDispRslt1_qty27, columnDispRslt1_qty28, columnDispRslt1_qty29,
					columnDispRslt1_qty30, columnDispRslt1_qty31, columnDispRslt1_qty32,
					columnDispRslt1_qty33, columnDispRslt1_qty34, columnDispRslt1_qty35,
					columnDispRslt1_qty36, columnDispRslt1_qty37, columnDispRslt1_qty38,
					columnDispRslt1_qty39, columnDispRslt1_qty40, columnDispRslt1_qty41,
					columnDispRslt1_qty42, columnDispRslt1_qty43, columnDispRslt1_qty44,
					columnDispRslt1_qty45, columnDispRslt1_qty46, columnDispRslt1_qty47,
					columnDispRslt1_qty48, columnDispRslt1_qty49, columnDispRslt1_qty50,
					columnDispRslt1_qty51, columnDispRslt1_qty52, columnDispRslt1_qty53,
					columnDispRslt1_qty54, columnDispRslt1_qty55, columnDispRslt1_qty56,
					columnDispRslt1_qty57, columnDispRslt1_qty58, columnDispRslt1_qty59,
					columnDispRslt1_qty60, columnDispRslt1_qty61, columnDispRslt1_qty62,
					columnDispRslt1_qty63, columnDispRslt1_qty64, columnDispRslt1_qty65,
					columnDispRslt1_qty66, columnDispRslt1_qty67, columnDispRslt1_qty68,
					columnDispRslt1_qty69, columnDispRslt1_qty70, columnDispRslt1_qty71,
					columnDispRslt1_qty72, columnDispRslt1_qty73, columnDispRslt1_qty74,
					columnDispRslt1_qty75, columnDispRslt1_qty76, columnDispRslt1_qty77,
					columnDispRslt1_qty78, columnDispRslt1_qty79, columnDispRslt1_qty80,
					columnDispRslt1_qty81, columnDispRslt1_qty82, columnDispRslt1_qty83,
					columnDispRslt1_qty84, columnDispRslt1_qty85, columnDispRslt1_qty86,
					columnDispRslt1_qty87, columnDispRslt1_qty88, columnDispRslt1_qty89,
					columnDispRslt1_qty90, columnDispRslt1_qty91, columnDispRslt1_qty92,
					columnDispRslt1_qty93, columnDispRslt1_qty94, columnDispRslt1_qty95,
					columnDispRslt1_qty96, columnDispRslt1_qty97, columnDispRslt1_qty98,
					columnDispRslt1_qty99, columnDispRslt1_qty100, columnDispRslt1_qty101,
					columnDispRslt1_qty102, columnDispRslt1_qty103, columnDispRslt1_qty104,
					columnDispRslt1_qty105, columnDispRslt1_qty106, columnDispRslt1_qty107,
					columnDispRslt1_qty108, columnDispRslt1_qty109, columnDispRslt1_qty110,
					columnDispRslt1_qty111, columnDispRslt1_qty112, columnDispRslt1_qty113,
					columnDispRslt1_qty114, columnDispRslt1_qty115, columnDispRslt1_qty116,
					columnDispRslt1_qty117, columnDispRslt1_qty118, columnDispRslt1_qty119,
					columnDispRslt1_qty120, columnDispRslt1_qty121, columnDispRslt1_qty122,
					columnDispRslt1_qty123, columnDispRslt1_qty124, columnDispRslt1_qty125,
					columnDispRslt1_qty126, columnDispRslt1_qty127, columnDispRslt1_qty128,
					columnDispRslt1_qty129, columnDispRslt1_qty130, columnDispRslt1_qty131,
					columnDispRslt1_qty132, columnDispRslt1_qty133, columnDispRslt1_qty134,
					columnDispRslt1_qty135, columnDispRslt1_qty136, columnDispRslt1_qty137,
					columnDispRslt1_qty138, columnDispRslt1_qty139, columnDispRslt1_qty140,
					columnDispRslt1_qty141, columnDispRslt1_qty142, columnDispRslt1_qty143,
					columnDispRslt1_qty144, columnDispRslt1_qty145, columnDispRslt1_qty146,
					columnDispRslt1_qty147, columnDispRslt1_qty148, columnDispRslt1_qty149,
					columnDispRslt1_qty150, columnDispRslt1_qty151, columnDispRslt1_qty152,
					columnDispRslt1_qty153, columnDispRslt1_qty154, columnDispRslt1_qty155,
					columnDispRslt1_qty156, columnDispRslt1_qty157, columnDispRslt1_qty158,
					columnDispRslt1_qty159, columnDispRslt1_qty160, columnDispRslt1_qty161,
					columnDispRslt1_qty162, columnDispRslt1_qty163, columnDispRslt1_qty164,
					columnDispRslt1_qty165, columnDispRslt1_qty166, columnDispRslt1_qty167,
					columnDispRslt1_qty168, columnDispRslt1_qty169, columnDispRslt1_qty170,
					columnDispRslt1_qty171, columnDispRslt1_qty172, columnDispRslt1_qty173,
					columnDispRslt1_qty174, columnDispRslt1_qty175, columnDispRslt1_qty176,
					columnDispRslt1_qty177, columnDispRslt1_qty178, columnDispRslt1_qty179,
					columnDispRslt1_qty180, columnDispRslt1_qty181, columnDispRslt1_qty182,
					columnDispRslt1_qty183, columnDispRslt1_qty184, columnDispRslt1_qty185,
					columnDispRslt1_qty186, columnDispRslt1_qty187, columnDispRslt1_qty188,
					columnDispRslt1_qty189, columnDispRslt1_qty190, columnDispRslt1_qty191,
					columnDispRslt1_qty192, columnDispRslt1_qty193, columnDispRslt1_qty194,
					columnDispRslt1_qty195, columnDispRslt1_qty196, columnDispRslt1_qty197,
					columnDispRslt1_qty198, columnDispRslt1_qty199, columnDispRslt1_qty200,
					columnDispRslt1_qty201, columnDispRslt1_qty202, columnDispRslt1_qty203,
					columnDispRslt1_qty204, columnDispRslt1_qty205, columnDispRslt1_qty206,
					columnDispRslt1_qty207, columnDispRslt1_qty208, columnDispRslt1_qty209,
					columnDispRslt1_qty210, columnDispRslt1_qty211, columnDispRslt1_qty212,
					columnDispRslt1_qty213, columnDispRslt1_qty214, columnDispRslt1_qty215,
					columnDispRslt1_qty216, columnDispRslt1_qty217, columnDispRslt1_qty218,
					columnDispRslt1_qty219, columnDispRslt1_qty220, columnDispRslt1_qty221,
					columnDispRslt1_qty222, columnDispRslt1_qty223, columnDispRslt1_qty224,
					columnDispRslt1_qty225, columnDispRslt1_qty226, columnDispRslt1_qty227,
					columnDispRslt1_qty228, columnDispRslt1_qty229, columnDispRslt1_qty230,
					columnDispRslt1_qty231, columnDispRslt1_qty232, columnDispRslt1_qty233,
					columnDispRslt1_qty234, columnDispRslt1_qty235, columnDispRslt1_qty236,
					columnDispRslt1_qty237, columnDispRslt1_qty238, columnDispRslt1_qty239,
					columnDispRslt1_qty240, columnDispRslt1_qty241, columnDispRslt1_qty242,
					columnDispRslt1_qty243, columnDispRslt1_qty244, columnDispRslt1_qty245,
					columnDispRslt1_qty246, columnDispRslt1_qty247, columnDispRslt1_qty248,
					columnDispRslt1_qty249, columnDispRslt1_qty250, columnDispRslt1_qty251,
					columnDispRslt1_qty252, columnDispRslt1_qty253, columnDispRslt1_qty254,
					columnDispRslt1_qty255, columnDispRslt1_qty256, columnDispRslt1_qty257,
					columnDispRslt1_qty258, columnDispRslt1_qty259, columnDispRslt1_qty260,
					columnDispRslt1_qty261, columnDispRslt1_qty262, columnDispRslt1_qty263,
					columnDispRslt1_qty264, columnDispRslt1_qty265, columnDispRslt1_qty266,
					columnDispRslt1_qty267, columnDispRslt1_qty268, columnDispRslt1_qty269,
					columnDispRslt1_qty270, columnDispRslt1_qty271, columnDispRslt1_qty272,
					columnDispRslt1_qty273, columnDispRslt1_qty274, columnDispRslt1_qty275,
					columnDispRslt1_qty276, columnDispRslt1_qty277, columnDispRslt1_qty278,
					columnDispRslt1_qty279, columnDispRslt1_qty280, columnDispRslt1_qty281,
					columnDispRslt1_qty282, columnDispRslt1_qty283, columnDispRslt1_qty284,
					columnDispRslt1_qty285, columnDispRslt1_qty286, columnDispRslt1_qty287,
					columnDispRslt1_qty288, columnDispRslt1_qty289, columnDispRslt1_qty290,
					columnDispRslt1_qty291, columnDispRslt1_qty292, columnDispRslt1_qty293,
					columnDispRslt1_qty294, columnDispRslt1_qty295, columnDispRslt1_qty296,
					columnDispRslt1_qty297, columnDispRslt1_qty298, columnDispRslt1_qty299,
					columnDispRslt1_qty300, columnDispRslt1_qty301, columnDispRslt1_qty302,
					columnDispRslt1_qty303, columnDispRslt1_qty304, columnDispRslt1_qty305,
					columnDispRslt1_qty306, columnDispRslt1_qty307, columnDispRslt1_qty308,
					columnDispRslt1_qty309, columnDispRslt1_qty310, columnDispRslt1_qty311,
					columnDispRslt1_qty312, columnDispRslt1_qty313, columnDispRslt1_qty314,
					columnDispRslt1_qty315, columnDispRslt1_qty316, columnDispRslt1_qty317,
					columnDispRslt1_qty318, columnDispRslt1_qty319, columnDispRslt1_qty320,
					columnDispRslt1_qty321, columnDispRslt1_qty322, columnDispRslt1_qty323,
					columnDispRslt1_qty324, columnDispRslt1_qty325, columnDispRslt1_qty326,
					columnDispRslt1_qty327, columnDispRslt1_qty328, columnDispRslt1_qty329,
					columnDispRslt1_qty330, columnDispRslt1_qty331, columnDispRslt1_qty332,
					columnDispRslt1_qty333, columnDispRslt1_qty334, columnDispRslt1_qty335,
					columnDispRslt1_qty336, columnDispRslt1_qty337, columnDispRslt1_qty338,
					columnDispRslt1_qty339, columnDispRslt1_qty340, columnDispRslt1_qty341,
					columnDispRslt1_qty342, columnDispRslt1_qty343, columnDispRslt1_qty344,
					columnDispRslt1_qty345, columnDispRslt1_qty346, columnDispRslt1_qty347,
					columnDispRslt1_qty348, columnDispRslt1_qty349, columnDispRslt1_qty350,
					columnDispRslt1_qty351, columnDispRslt1_qty352, columnDispRslt1_qty353,
					columnDispRslt1_qty354, columnDispRslt1_qty355, columnDispRslt1_qty356,
					columnDispRslt1_qty357, columnDispRslt1_qty358, columnDispRslt1_qty359,
					columnDispRslt1_qty360, columnDispRslt1_qty361, columnDispRslt1_qty362,
					columnDispRslt1_qty363, columnDispRslt1_qty364, columnDispRslt1_qty365,
					columnDispRslt1_qty366, columnDispRslt1_qty367, columnDispRslt1_qty368,
					columnDispRslt1_qty369, columnDispRslt1_qty370, columnDispRslt1_qty371,
					columnDispRslt1_qty372, columnDispRslt1_qty373, columnDispRslt1_qty374,
					columnDispRslt1_qty375, columnDispRslt1_qty376, columnDispRslt1_qty377,
					columnDispRslt1_qty378, columnDispRslt1_qty379, columnDispRslt1_qty380,
					columnDispRslt1_qty381, columnDispRslt1_qty382, columnDispRslt1_qty383,
					columnDispRslt1_qty384, columnDispRslt1_qty385, columnDispRslt1_qty386,
					columnDispRslt1_qty387, columnDispRslt1_qty388, columnDispRslt1_qty389,
					columnDispRslt1_qty390, columnDispRslt1_qty391, columnDispRslt1_qty392,
					columnDispRslt1_qty393, columnDispRslt1_qty394, columnDispRslt1_qty395,
					columnDispRslt1_qty396, columnDispRslt1_qty397, columnDispRslt1_qty398,
					columnDispRslt1_qty399, columnDispRslt1_qty400, columnDispRslt1_qty401,
					columnDispRslt1_qty402, columnDispRslt1_qty403, columnDispRslt1_qty404,
					columnDispRslt1_qty405, columnDispRslt1_qty406, columnDispRslt1_qty407,
					columnDispRslt1_qty408, columnDispRslt1_qty409, columnDispRslt1_qty410,
					columnDispRslt1_qty411, columnDispRslt1_qty412, columnDispRslt1_qty413,
					columnDispRslt1_qty414, columnDispRslt1_qty415, columnDispRslt1_qty416,
					columnDispRslt1_qty417, columnDispRslt1_qty418, columnDispRslt1_qty419,
					columnDispRslt1_qty420, columnDispRslt1_qty421, columnDispRslt1_qty422,
					columnDispRslt1_qty423, columnDispRslt1_qty424, columnDispRslt1_qty425,
					columnDispRslt1_qty426, columnDispRslt1_qty427, columnDispRslt1_qty428,
					columnDispRslt1_qty429, columnDispRslt1_qty430, columnDispRslt1_qty431,
					columnDispRslt1_qty432, columnDispRslt1_qty433, columnDispRslt1_qty434,
					columnDispRslt1_qty435, columnDispRslt1_qty436, columnDispRslt1_qty437,
					columnDispRslt1_qty438, columnDispRslt1_qty439, columnDispRslt1_qty440,
					columnDispRslt1_qty441, columnDispRslt1_qty442, columnDispRslt1_qty443,
					columnDispRslt1_qty444, columnDispRslt1_qty445, columnDispRslt1_qty446,
					columnDispRslt1_qty447, columnDispRslt1_qty448, columnDispRslt1_qty449,
					columnDispRslt1_qty450, columnDispRslt1_qty451, columnDispRslt1_qty452,
					columnDispRslt1_qty453, columnDispRslt1_qty454, columnDispRslt1_qty455,
					columnDispRslt1_qty456, columnDispRslt1_qty457, columnDispRslt1_qty458,
					columnDispRslt1_qty459, columnDispRslt1_qty460, columnDispRslt1_qty461,
					columnDispRslt1_qty462, columnDispRslt1_qty463, columnDispRslt1_qty464,
					columnDispRslt1_qty465, columnDispRslt1_qty466, columnDispRslt1_qty467,
					columnDispRslt1_qty468, columnDispRslt1_qty469, columnDispRslt1_qty470,
					columnDispRslt1_qty471, columnDispRslt1_qty472, columnDispRslt1_qty473,
					columnDispRslt1_qty474, columnDispRslt1_qty475, columnDispRslt1_qty476,
					columnDispRslt1_qty477, columnDispRslt1_qty478, columnDispRslt1_qty479,
					columnDispRslt1_qty480, columnDispRslt1_qty481, columnDispRslt1_qty482,
					columnDispRslt1_qty483, columnDispRslt1_qty484, columnDispRslt1_qty485,
					columnDispRslt1_qty486, columnDispRslt1_qty487, columnDispRslt1_qty488,
					columnDispRslt1_qty489, columnDispRslt1_qty490, columnDispRslt1_qty491,
					columnDispRslt1_qty492, columnDispRslt1_qty493, columnDispRslt1_qty494,
					columnDispRslt1_qty495, columnDispRslt1_qty496, columnDispRslt1_qty497,
					columnDispRslt1_qty498, columnDispRslt1_qty499
			};
		}
		return _qtys;
	}

	/** 項目名の配列を返します */
	protected String[] getColnm() {
		if (_qtyCols == null) {
			_qtyCols = new String[] {
					DispRslt1R.$qty00, DispRslt1R.$qty01, DispRslt1R.$qty02,
					DispRslt1R.$qty03, DispRslt1R.$qty04, DispRslt1R.$qty05,
					DispRslt1R.$qty06, DispRslt1R.$qty07, DispRslt1R.$qty08,
					DispRslt1R.$qty09, DispRslt1R.$qty10, DispRslt1R.$qty11,
					DispRslt1R.$qty12, DispRslt1R.$qty13, DispRslt1R.$qty14,
					DispRslt1R.$qty15, DispRslt1R.$qty16, DispRslt1R.$qty17,
					DispRslt1R.$qty18, DispRslt1R.$qty19, DispRslt1R.$qty20,
					DispRslt1R.$qty21, DispRslt1R.$qty22, DispRslt1R.$qty23,
					DispRslt1R.$qty24, DispRslt1R.$qty25, DispRslt1R.$qty26,
					DispRslt1R.$qty27, DispRslt1R.$qty28, DispRslt1R.$qty29,
					DispRslt1R.$qty30, DispRslt1R.$qty31, DispRslt1R.$qty32,
					DispRslt1R.$qty33, DispRslt1R.$qty34, DispRslt1R.$qty35,
					DispRslt1R.$qty36, DispRslt1R.$qty37, DispRslt1R.$qty38,
					DispRslt1R.$qty39, DispRslt1R.$qty40, DispRslt1R.$qty41,
					DispRslt1R.$qty42, DispRslt1R.$qty43, DispRslt1R.$qty44,
					DispRslt1R.$qty45, DispRslt1R.$qty46, DispRslt1R.$qty47,
					DispRslt1R.$qty48, DispRslt1R.$qty49, DispRslt1R.$qty50,
					DispRslt1R.$qty51, DispRslt1R.$qty52, DispRslt1R.$qty53,
					DispRslt1R.$qty54, DispRslt1R.$qty55, DispRslt1R.$qty56,
					DispRslt1R.$qty57, DispRslt1R.$qty58, DispRslt1R.$qty59,
					DispRslt1R.$qty60, DispRslt1R.$qty61, DispRslt1R.$qty62,
					DispRslt1R.$qty63, DispRslt1R.$qty64, DispRslt1R.$qty65,
					DispRslt1R.$qty66, DispRslt1R.$qty67, DispRslt1R.$qty68,
					DispRslt1R.$qty69, DispRslt1R.$qty70, DispRslt1R.$qty71,
					DispRslt1R.$qty72, DispRslt1R.$qty73, DispRslt1R.$qty74,
					DispRslt1R.$qty75, DispRslt1R.$qty76, DispRslt1R.$qty77,
					DispRslt1R.$qty78, DispRslt1R.$qty79, DispRslt1R.$qty80,
					DispRslt1R.$qty81, DispRslt1R.$qty82, DispRslt1R.$qty83,
					DispRslt1R.$qty84, DispRslt1R.$qty85, DispRslt1R.$qty86,
					DispRslt1R.$qty87, DispRslt1R.$qty88, DispRslt1R.$qty89,
					DispRslt1R.$qty90, DispRslt1R.$qty91, DispRslt1R.$qty92,
					DispRslt1R.$qty93, DispRslt1R.$qty94, DispRslt1R.$qty95,
					DispRslt1R.$qty96, DispRslt1R.$qty97, DispRslt1R.$qty98,
					DispRslt1R.$qty99, DispRslt1R.$qty100, DispRslt1R.$qty101,
					DispRslt1R.$qty102, DispRslt1R.$qty103, DispRslt1R.$qty104,
					DispRslt1R.$qty105, DispRslt1R.$qty106, DispRslt1R.$qty107,
					DispRslt1R.$qty108, DispRslt1R.$qty109, DispRslt1R.$qty110,
					DispRslt1R.$qty111, DispRslt1R.$qty112, DispRslt1R.$qty113,
					DispRslt1R.$qty114, DispRslt1R.$qty115, DispRslt1R.$qty116,
					DispRslt1R.$qty117, DispRslt1R.$qty118, DispRslt1R.$qty119,
					DispRslt1R.$qty120, DispRslt1R.$qty121, DispRslt1R.$qty122,
					DispRslt1R.$qty123, DispRslt1R.$qty124, DispRslt1R.$qty125,
					DispRslt1R.$qty126, DispRslt1R.$qty127, DispRslt1R.$qty128,
					DispRslt1R.$qty129, DispRslt1R.$qty130, DispRslt1R.$qty131,
					DispRslt1R.$qty132, DispRslt1R.$qty133, DispRslt1R.$qty134,
					DispRslt1R.$qty135, DispRslt1R.$qty136, DispRslt1R.$qty137,
					DispRslt1R.$qty138, DispRslt1R.$qty139, DispRslt1R.$qty140,
					DispRslt1R.$qty141, DispRslt1R.$qty142, DispRslt1R.$qty143,
					DispRslt1R.$qty144, DispRslt1R.$qty145, DispRslt1R.$qty146,
					DispRslt1R.$qty147, DispRslt1R.$qty148, DispRslt1R.$qty149,
					DispRslt1R.$qty150, DispRslt1R.$qty151, DispRslt1R.$qty152,
					DispRslt1R.$qty153, DispRslt1R.$qty154, DispRslt1R.$qty155,
					DispRslt1R.$qty156, DispRslt1R.$qty157, DispRslt1R.$qty158,
					DispRslt1R.$qty159, DispRslt1R.$qty160, DispRslt1R.$qty161,
					DispRslt1R.$qty162, DispRslt1R.$qty163, DispRslt1R.$qty164,
					DispRslt1R.$qty165, DispRslt1R.$qty166, DispRslt1R.$qty167,
					DispRslt1R.$qty168, DispRslt1R.$qty169, DispRslt1R.$qty170,
					DispRslt1R.$qty171, DispRslt1R.$qty172, DispRslt1R.$qty173,
					DispRslt1R.$qty174, DispRslt1R.$qty175, DispRslt1R.$qty176,
					DispRslt1R.$qty177, DispRslt1R.$qty178, DispRslt1R.$qty179,
					DispRslt1R.$qty180, DispRslt1R.$qty181, DispRslt1R.$qty182,
					DispRslt1R.$qty183, DispRslt1R.$qty184, DispRslt1R.$qty185,
					DispRslt1R.$qty186, DispRslt1R.$qty187, DispRslt1R.$qty188,
					DispRslt1R.$qty189, DispRslt1R.$qty190, DispRslt1R.$qty191,
					DispRslt1R.$qty192, DispRslt1R.$qty193, DispRslt1R.$qty194,
					DispRslt1R.$qty195, DispRslt1R.$qty196, DispRslt1R.$qty197,
					DispRslt1R.$qty198, DispRslt1R.$qty199, DispRslt1R.$qty200,
					DispRslt1R.$qty201, DispRslt1R.$qty202, DispRslt1R.$qty203,
					DispRslt1R.$qty204, DispRslt1R.$qty205, DispRslt1R.$qty206,
					DispRslt1R.$qty207, DispRslt1R.$qty208, DispRslt1R.$qty209,
					DispRslt1R.$qty210, DispRslt1R.$qty211, DispRslt1R.$qty212,
					DispRslt1R.$qty213, DispRslt1R.$qty214, DispRslt1R.$qty215,
					DispRslt1R.$qty216, DispRslt1R.$qty217, DispRslt1R.$qty218,
					DispRslt1R.$qty219, DispRslt1R.$qty220, DispRslt1R.$qty221,
					DispRslt1R.$qty222, DispRslt1R.$qty223, DispRslt1R.$qty224,
					DispRslt1R.$qty225, DispRslt1R.$qty226, DispRslt1R.$qty227,
					DispRslt1R.$qty228, DispRslt1R.$qty229, DispRslt1R.$qty230,
					DispRslt1R.$qty231, DispRslt1R.$qty232, DispRslt1R.$qty233,
					DispRslt1R.$qty234, DispRslt1R.$qty235, DispRslt1R.$qty236,
					DispRslt1R.$qty237, DispRslt1R.$qty238, DispRslt1R.$qty239,
					DispRslt1R.$qty240, DispRslt1R.$qty241, DispRslt1R.$qty242,
					DispRslt1R.$qty243, DispRslt1R.$qty244, DispRslt1R.$qty245,
					DispRslt1R.$qty246, DispRslt1R.$qty247, DispRslt1R.$qty248,
					DispRslt1R.$qty249, DispRslt1R.$qty250, DispRslt1R.$qty251,
					DispRslt1R.$qty252, DispRslt1R.$qty253, DispRslt1R.$qty254,
					DispRslt1R.$qty255, DispRslt1R.$qty256, DispRslt1R.$qty257,
					DispRslt1R.$qty258, DispRslt1R.$qty259, DispRslt1R.$qty260,
					DispRslt1R.$qty261, DispRslt1R.$qty262, DispRslt1R.$qty263,
					DispRslt1R.$qty264, DispRslt1R.$qty265, DispRslt1R.$qty266,
					DispRslt1R.$qty267, DispRslt1R.$qty268, DispRslt1R.$qty269,
					DispRslt1R.$qty270, DispRslt1R.$qty271, DispRslt1R.$qty272,
					DispRslt1R.$qty273, DispRslt1R.$qty274, DispRslt1R.$qty275,
					DispRslt1R.$qty276, DispRslt1R.$qty277, DispRslt1R.$qty278,
					DispRslt1R.$qty279, DispRslt1R.$qty280, DispRslt1R.$qty281,
					DispRslt1R.$qty282, DispRslt1R.$qty283, DispRslt1R.$qty284,
					DispRslt1R.$qty285, DispRslt1R.$qty286, DispRslt1R.$qty287,
					DispRslt1R.$qty288, DispRslt1R.$qty289, DispRslt1R.$qty290,
					DispRslt1R.$qty291, DispRslt1R.$qty292, DispRslt1R.$qty293,
					DispRslt1R.$qty294, DispRslt1R.$qty295, DispRslt1R.$qty296,
					DispRslt1R.$qty297, DispRslt1R.$qty298, DispRslt1R.$qty299,
					DispRslt1R.$qty300, DispRslt1R.$qty301, DispRslt1R.$qty302,
					DispRslt1R.$qty303, DispRslt1R.$qty304, DispRslt1R.$qty305,
					DispRslt1R.$qty306, DispRslt1R.$qty307, DispRslt1R.$qty308,
					DispRslt1R.$qty309, DispRslt1R.$qty310, DispRslt1R.$qty311,
					DispRslt1R.$qty312, DispRslt1R.$qty313, DispRslt1R.$qty314,
					DispRslt1R.$qty315, DispRslt1R.$qty316, DispRslt1R.$qty317,
					DispRslt1R.$qty318, DispRslt1R.$qty319, DispRslt1R.$qty320,
					DispRslt1R.$qty321, DispRslt1R.$qty322, DispRslt1R.$qty323,
					DispRslt1R.$qty324, DispRslt1R.$qty325, DispRslt1R.$qty326,
					DispRslt1R.$qty327, DispRslt1R.$qty328, DispRslt1R.$qty329,
					DispRslt1R.$qty330, DispRslt1R.$qty331, DispRslt1R.$qty332,
					DispRslt1R.$qty333, DispRslt1R.$qty334, DispRslt1R.$qty335,
					DispRslt1R.$qty336, DispRslt1R.$qty337, DispRslt1R.$qty338,
					DispRslt1R.$qty339, DispRslt1R.$qty340, DispRslt1R.$qty341,
					DispRslt1R.$qty342, DispRslt1R.$qty343, DispRslt1R.$qty344,
					DispRslt1R.$qty345, DispRslt1R.$qty346, DispRslt1R.$qty347,
					DispRslt1R.$qty348, DispRslt1R.$qty349, DispRslt1R.$qty350,
					DispRslt1R.$qty351, DispRslt1R.$qty352, DispRslt1R.$qty353,
					DispRslt1R.$qty354, DispRslt1R.$qty355, DispRslt1R.$qty356,
					DispRslt1R.$qty357, DispRslt1R.$qty358, DispRslt1R.$qty359,
					DispRslt1R.$qty360, DispRslt1R.$qty361, DispRslt1R.$qty362,
					DispRslt1R.$qty363, DispRslt1R.$qty364, DispRslt1R.$qty365,
					DispRslt1R.$qty366, DispRslt1R.$qty367, DispRslt1R.$qty368,
					DispRslt1R.$qty369, DispRslt1R.$qty370, DispRslt1R.$qty371,
					DispRslt1R.$qty372, DispRslt1R.$qty373, DispRslt1R.$qty374,
					DispRslt1R.$qty375, DispRslt1R.$qty376, DispRslt1R.$qty377,
					DispRslt1R.$qty378, DispRslt1R.$qty379, DispRslt1R.$qty380,
					DispRslt1R.$qty381, DispRslt1R.$qty382, DispRslt1R.$qty383,
					DispRslt1R.$qty384, DispRslt1R.$qty385, DispRslt1R.$qty386,
					DispRslt1R.$qty387, DispRslt1R.$qty388, DispRslt1R.$qty389,
					DispRslt1R.$qty390, DispRslt1R.$qty391, DispRslt1R.$qty392,
					DispRslt1R.$qty393, DispRslt1R.$qty394, DispRslt1R.$qty395,
					DispRslt1R.$qty396, DispRslt1R.$qty397, DispRslt1R.$qty398,
					DispRslt1R.$qty399, DispRslt1R.$qty400, DispRslt1R.$qty401,
					DispRslt1R.$qty402, DispRslt1R.$qty403, DispRslt1R.$qty404,
					DispRslt1R.$qty405, DispRslt1R.$qty406, DispRslt1R.$qty407,
					DispRslt1R.$qty408, DispRslt1R.$qty409, DispRslt1R.$qty410,
					DispRslt1R.$qty411, DispRslt1R.$qty412, DispRslt1R.$qty413,
					DispRslt1R.$qty414, DispRslt1R.$qty415, DispRslt1R.$qty416,
					DispRslt1R.$qty417, DispRslt1R.$qty418, DispRslt1R.$qty419,
					DispRslt1R.$qty420, DispRslt1R.$qty421, DispRslt1R.$qty422,
					DispRslt1R.$qty423, DispRslt1R.$qty424, DispRslt1R.$qty425,
					DispRslt1R.$qty426, DispRslt1R.$qty427, DispRslt1R.$qty428,
					DispRslt1R.$qty429, DispRslt1R.$qty430, DispRslt1R.$qty431,
					DispRslt1R.$qty432, DispRslt1R.$qty433, DispRslt1R.$qty434,
					DispRslt1R.$qty435, DispRslt1R.$qty436, DispRslt1R.$qty437,
					DispRslt1R.$qty438, DispRslt1R.$qty439, DispRslt1R.$qty440,
					DispRslt1R.$qty441, DispRslt1R.$qty442, DispRslt1R.$qty443,
					DispRslt1R.$qty444, DispRslt1R.$qty445, DispRslt1R.$qty446,
					DispRslt1R.$qty447, DispRslt1R.$qty448, DispRslt1R.$qty449,
					DispRslt1R.$qty450, DispRslt1R.$qty451, DispRslt1R.$qty452,
					DispRslt1R.$qty453, DispRslt1R.$qty454, DispRslt1R.$qty455,
					DispRslt1R.$qty456, DispRslt1R.$qty457, DispRslt1R.$qty458,
					DispRslt1R.$qty459, DispRslt1R.$qty460, DispRslt1R.$qty461,
					DispRslt1R.$qty462, DispRslt1R.$qty463, DispRslt1R.$qty464,
					DispRslt1R.$qty465, DispRslt1R.$qty466, DispRslt1R.$qty467,
					DispRslt1R.$qty468, DispRslt1R.$qty469, DispRslt1R.$qty470,
					DispRslt1R.$qty471, DispRslt1R.$qty472, DispRslt1R.$qty473,
					DispRslt1R.$qty474, DispRslt1R.$qty475, DispRslt1R.$qty476,
					DispRslt1R.$qty477, DispRslt1R.$qty478, DispRslt1R.$qty479,
					DispRslt1R.$qty480, DispRslt1R.$qty481, DispRslt1R.$qty482,
					DispRslt1R.$qty483, DispRslt1R.$qty484, DispRslt1R.$qty485,
					DispRslt1R.$qty486, DispRslt1R.$qty487, DispRslt1R.$qty488,
					DispRslt1R.$qty489, DispRslt1R.$qty490, DispRslt1R.$qty491,
					DispRslt1R.$qty492, DispRslt1R.$qty493, DispRslt1R.$qty494,
					DispRslt1R.$qty495, DispRslt1R.$qty496, DispRslt1R.$qty497,
					DispRslt1R.$qty498, DispRslt1R.$qty499
				};
		}
		return _qtyCols;
	}

	/** フラグに対する項目名の配列を返します */
	protected String[] getFlgColnm() {
		if (_flgCols == null) {
			_flgCols = new String[] {
					DispRslt1R.$editable_qty01_flg, DispRslt1R.$editable_qty02_flg,
					DispRslt1R.$editable_qty03_flg, DispRslt1R.$editable_qty04_flg,
					DispRslt1R.$editable_qty05_flg, DispRslt1R.$editable_qty06_flg,
					DispRslt1R.$editable_qty07_flg, DispRslt1R.$editable_qty08_flg,
					DispRslt1R.$editable_qty09_flg, DispRslt1R.$editable_qty10_flg,
					DispRslt1R.$editable_qty11_flg, DispRslt1R.$editable_qty12_flg,
					DispRslt1R.$editable_qty13_flg, DispRslt1R.$editable_qty14_flg,
					DispRslt1R.$editable_qty15_flg, DispRslt1R.$editable_qty16_flg,
					DispRslt1R.$editable_qty17_flg, DispRslt1R.$editable_qty18_flg,
					DispRslt1R.$editable_qty19_flg, DispRslt1R.$editable_qty20_flg,
					DispRslt1R.$editable_qty21_flg, DispRslt1R.$editable_qty22_flg,
					DispRslt1R.$editable_qty23_flg, DispRslt1R.$editable_qty24_flg,
					DispRslt1R.$editable_qty25_flg, DispRslt1R.$editable_qty26_flg,
					DispRslt1R.$editable_qty27_flg, DispRslt1R.$editable_qty28_flg,
					DispRslt1R.$editable_qty29_flg, DispRslt1R.$editable_qty30_flg,
					DispRslt1R.$editable_qty31_flg, DispRslt1R.$editable_qty32_flg,
					DispRslt1R.$editable_qty33_flg, DispRslt1R.$editable_qty34_flg,
					DispRslt1R.$editable_qty35_flg, DispRslt1R.$editable_qty36_flg,
					DispRslt1R.$editable_qty37_flg, DispRslt1R.$editable_qty38_flg,
					DispRslt1R.$editable_qty39_flg, DispRslt1R.$editable_qty40_flg,
					DispRslt1R.$editable_qty41_flg, DispRslt1R.$editable_qty42_flg,
					DispRslt1R.$editable_qty43_flg, DispRslt1R.$editable_qty44_flg,
					DispRslt1R.$editable_qty45_flg, DispRslt1R.$editable_qty46_flg,
					DispRslt1R.$editable_qty47_flg, DispRslt1R.$editable_qty48_flg,
					DispRslt1R.$editable_qty49_flg, DispRslt1R.$editable_qty50_flg,
					DispRslt1R.$editable_qty51_flg, DispRslt1R.$editable_qty52_flg,
					DispRslt1R.$editable_qty53_flg, DispRslt1R.$editable_qty54_flg,
					DispRslt1R.$editable_qty55_flg, DispRslt1R.$editable_qty56_flg,
					DispRslt1R.$editable_qty57_flg, DispRslt1R.$editable_qty58_flg,
					DispRslt1R.$editable_qty59_flg, DispRslt1R.$editable_qty60_flg,
					DispRslt1R.$editable_qty61_flg, DispRslt1R.$editable_qty62_flg,
					DispRslt1R.$editable_qty63_flg, DispRslt1R.$editable_qty64_flg,
					DispRslt1R.$editable_qty65_flg, DispRslt1R.$editable_qty66_flg,
					DispRslt1R.$editable_qty67_flg, DispRslt1R.$editable_qty68_flg,
					DispRslt1R.$editable_qty69_flg, DispRslt1R.$editable_qty70_flg,
					DispRslt1R.$editable_qty71_flg, DispRslt1R.$editable_qty72_flg,
					DispRslt1R.$editable_qty73_flg, DispRslt1R.$editable_qty74_flg,
					DispRslt1R.$editable_qty75_flg, DispRslt1R.$editable_qty76_flg,
					DispRslt1R.$editable_qty77_flg, DispRslt1R.$editable_qty78_flg,
					DispRslt1R.$editable_qty79_flg, DispRslt1R.$editable_qty80_flg,
					DispRslt1R.$editable_qty81_flg, DispRslt1R.$editable_qty82_flg,
					DispRslt1R.$editable_qty83_flg, DispRslt1R.$editable_qty84_flg,
					DispRslt1R.$editable_qty85_flg, DispRslt1R.$editable_qty86_flg,
					DispRslt1R.$editable_qty87_flg, DispRslt1R.$editable_qty88_flg,
					DispRslt1R.$editable_qty89_flg, DispRslt1R.$editable_qty90_flg,
					DispRslt1R.$editable_qty91_flg, DispRslt1R.$editable_qty92_flg,
					DispRslt1R.$editable_qty93_flg, DispRslt1R.$editable_qty94_flg,
					DispRslt1R.$editable_qty95_flg, DispRslt1R.$editable_qty96_flg,
					DispRslt1R.$editable_qty97_flg, DispRslt1R.$editable_qty98_flg,
					DispRslt1R.$editable_qty99_flg, DispRslt1R.$editable_qty100_flg,
					DispRslt1R.$editable_qty101_flg, DispRslt1R.$editable_qty102_flg,
					DispRslt1R.$editable_qty103_flg, DispRslt1R.$editable_qty104_flg,
					DispRslt1R.$editable_qty105_flg, DispRslt1R.$editable_qty106_flg,
					DispRslt1R.$editable_qty107_flg, DispRslt1R.$editable_qty108_flg,
					DispRslt1R.$editable_qty109_flg, DispRslt1R.$editable_qty110_flg,
					DispRslt1R.$editable_qty111_flg, DispRslt1R.$editable_qty112_flg,
					DispRslt1R.$editable_qty113_flg, DispRslt1R.$editable_qty114_flg,
					DispRslt1R.$editable_qty115_flg, DispRslt1R.$editable_qty116_flg,
					DispRslt1R.$editable_qty117_flg, DispRslt1R.$editable_qty118_flg,
					DispRslt1R.$editable_qty119_flg, DispRslt1R.$editable_qty120_flg,
					DispRslt1R.$editable_qty121_flg, DispRslt1R.$editable_qty121_flg,
					DispRslt1R.$editable_qty123_flg, DispRslt1R.$editable_qty124_flg,
					DispRslt1R.$editable_qty125_flg, DispRslt1R.$editable_qty126_flg,
					DispRslt1R.$editable_qty127_flg, DispRslt1R.$editable_qty128_flg,
					DispRslt1R.$editable_qty129_flg, DispRslt1R.$editable_qty130_flg,
					DispRslt1R.$editable_qty131_flg, DispRslt1R.$editable_qty132_flg,
					DispRslt1R.$editable_qty133_flg, DispRslt1R.$editable_qty134_flg,
					DispRslt1R.$editable_qty135_flg, DispRslt1R.$editable_qty136_flg,
					DispRslt1R.$editable_qty137_flg, DispRslt1R.$editable_qty138_flg,
					DispRslt1R.$editable_qty139_flg, DispRslt1R.$editable_qty140_flg,
					DispRslt1R.$editable_qty141_flg, DispRslt1R.$editable_qty142_flg,
					DispRslt1R.$editable_qty143_flg, DispRslt1R.$editable_qty144_flg,
					DispRslt1R.$editable_qty145_flg, DispRslt1R.$editable_qty146_flg,
					DispRslt1R.$editable_qty147_flg, DispRslt1R.$editable_qty148_flg,
					DispRslt1R.$editable_qty149_flg, DispRslt1R.$editable_qty150_flg,
					DispRslt1R.$editable_qty151_flg, DispRslt1R.$editable_qty152_flg,
					DispRslt1R.$editable_qty153_flg, DispRslt1R.$editable_qty154_flg,
					DispRslt1R.$editable_qty155_flg, DispRslt1R.$editable_qty156_flg,
					DispRslt1R.$editable_qty157_flg, DispRslt1R.$editable_qty158_flg,
					DispRslt1R.$editable_qty159_flg, DispRslt1R.$editable_qty160_flg,
					DispRslt1R.$editable_qty161_flg, DispRslt1R.$editable_qty162_flg,
					DispRslt1R.$editable_qty163_flg, DispRslt1R.$editable_qty164_flg,
					DispRslt1R.$editable_qty165_flg, DispRslt1R.$editable_qty166_flg,
					DispRslt1R.$editable_qty167_flg, DispRslt1R.$editable_qty168_flg,
					DispRslt1R.$editable_qty169_flg, DispRslt1R.$editable_qty170_flg,
					DispRslt1R.$editable_qty171_flg, DispRslt1R.$editable_qty172_flg,
					DispRslt1R.$editable_qty173_flg, DispRslt1R.$editable_qty174_flg,
					DispRslt1R.$editable_qty175_flg, DispRslt1R.$editable_qty176_flg,
					DispRslt1R.$editable_qty177_flg, DispRslt1R.$editable_qty178_flg,
					DispRslt1R.$editable_qty179_flg, DispRslt1R.$editable_qty180_flg,
					DispRslt1R.$editable_qty181_flg, DispRslt1R.$editable_qty182_flg,
					DispRslt1R.$editable_qty183_flg, DispRslt1R.$editable_qty184_flg,
					DispRslt1R.$editable_qty185_flg, DispRslt1R.$editable_qty186_flg,
					DispRslt1R.$editable_qty187_flg, DispRslt1R.$editable_qty188_flg,
					DispRslt1R.$editable_qty189_flg, DispRslt1R.$editable_qty190_flg,
					DispRslt1R.$editable_qty191_flg, DispRslt1R.$editable_qty192_flg,
					DispRslt1R.$editable_qty193_flg, DispRslt1R.$editable_qty194_flg,
					DispRslt1R.$editable_qty195_flg, DispRslt1R.$editable_qty196_flg,
					DispRslt1R.$editable_qty197_flg, DispRslt1R.$editable_qty198_flg,
					DispRslt1R.$editable_qty199_flg, DispRslt1R.$editable_qty200_flg,
					DispRslt1R.$editable_qty201_flg, DispRslt1R.$editable_qty202_flg,
					DispRslt1R.$editable_qty203_flg, DispRslt1R.$editable_qty204_flg,
					DispRslt1R.$editable_qty205_flg, DispRslt1R.$editable_qty206_flg,
					DispRslt1R.$editable_qty207_flg, DispRslt1R.$editable_qty208_flg,
					DispRslt1R.$editable_qty209_flg, DispRslt1R.$editable_qty210_flg,
					DispRslt1R.$editable_qty211_flg, DispRslt1R.$editable_qty212_flg,
					DispRslt1R.$editable_qty213_flg, DispRslt1R.$editable_qty214_flg,
					DispRslt1R.$editable_qty215_flg, DispRslt1R.$editable_qty216_flg,
					DispRslt1R.$editable_qty217_flg, DispRslt1R.$editable_qty218_flg,
					DispRslt1R.$editable_qty219_flg, DispRslt1R.$editable_qty220_flg,
					DispRslt1R.$editable_qty221_flg, DispRslt1R.$editable_qty222_flg,
					DispRslt1R.$editable_qty223_flg, DispRslt1R.$editable_qty224_flg,
					DispRslt1R.$editable_qty225_flg, DispRslt1R.$editable_qty226_flg,
					DispRslt1R.$editable_qty227_flg, DispRslt1R.$editable_qty228_flg,
					DispRslt1R.$editable_qty229_flg, DispRslt1R.$editable_qty230_flg,
					DispRslt1R.$editable_qty231_flg, DispRslt1R.$editable_qty232_flg,
					DispRslt1R.$editable_qty233_flg, DispRslt1R.$editable_qty234_flg,
					DispRslt1R.$editable_qty235_flg, DispRslt1R.$editable_qty236_flg,
					DispRslt1R.$editable_qty237_flg, DispRslt1R.$editable_qty238_flg,
					DispRslt1R.$editable_qty239_flg, DispRslt1R.$editable_qty240_flg,
					DispRslt1R.$editable_qty241_flg, DispRslt1R.$editable_qty242_flg,
					DispRslt1R.$editable_qty243_flg, DispRslt1R.$editable_qty244_flg,
					DispRslt1R.$editable_qty245_flg, DispRslt1R.$editable_qty246_flg,
					DispRslt1R.$editable_qty247_flg, DispRslt1R.$editable_qty248_flg,
					DispRslt1R.$editable_qty249_flg, DispRslt1R.$editable_qty250_flg,
					DispRslt1R.$editable_qty251_flg, DispRslt1R.$editable_qty252_flg,
					DispRslt1R.$editable_qty253_flg, DispRslt1R.$editable_qty254_flg,
					DispRslt1R.$editable_qty255_flg, DispRslt1R.$editable_qty256_flg,
					DispRslt1R.$editable_qty257_flg, DispRslt1R.$editable_qty258_flg,
					DispRslt1R.$editable_qty259_flg, DispRslt1R.$editable_qty260_flg,
					DispRslt1R.$editable_qty261_flg, DispRslt1R.$editable_qty262_flg,
					DispRslt1R.$editable_qty263_flg, DispRslt1R.$editable_qty264_flg,
					DispRslt1R.$editable_qty265_flg, DispRslt1R.$editable_qty266_flg,
					DispRslt1R.$editable_qty267_flg, DispRslt1R.$editable_qty268_flg,
					DispRslt1R.$editable_qty269_flg, DispRslt1R.$editable_qty270_flg,
					DispRslt1R.$editable_qty271_flg, DispRslt1R.$editable_qty272_flg,
					DispRslt1R.$editable_qty273_flg, DispRslt1R.$editable_qty274_flg,
					DispRslt1R.$editable_qty275_flg, DispRslt1R.$editable_qty276_flg,
					DispRslt1R.$editable_qty277_flg, DispRslt1R.$editable_qty278_flg,
					DispRslt1R.$editable_qty279_flg, DispRslt1R.$editable_qty280_flg,
					DispRslt1R.$editable_qty281_flg, DispRslt1R.$editable_qty282_flg,
					DispRslt1R.$editable_qty283_flg, DispRslt1R.$editable_qty284_flg,
					DispRslt1R.$editable_qty285_flg, DispRslt1R.$editable_qty286_flg,
					DispRslt1R.$editable_qty287_flg, DispRslt1R.$editable_qty288_flg,
					DispRslt1R.$editable_qty289_flg, DispRslt1R.$editable_qty290_flg,
					DispRslt1R.$editable_qty291_flg, DispRslt1R.$editable_qty292_flg,
					DispRslt1R.$editable_qty293_flg, DispRslt1R.$editable_qty294_flg,
					DispRslt1R.$editable_qty295_flg, DispRslt1R.$editable_qty296_flg,
					DispRslt1R.$editable_qty297_flg, DispRslt1R.$editable_qty298_flg,
					DispRslt1R.$editable_qty299_flg, DispRslt1R.$editable_qty300_flg,
					DispRslt1R.$editable_qty301_flg, DispRslt1R.$editable_qty302_flg,
					DispRslt1R.$editable_qty303_flg, DispRslt1R.$editable_qty304_flg,
					DispRslt1R.$editable_qty305_flg, DispRslt1R.$editable_qty306_flg,
					DispRslt1R.$editable_qty307_flg, DispRslt1R.$editable_qty308_flg,
					DispRslt1R.$editable_qty309_flg, DispRslt1R.$editable_qty310_flg,
					DispRslt1R.$editable_qty311_flg, DispRslt1R.$editable_qty312_flg,
					DispRslt1R.$editable_qty313_flg, DispRslt1R.$editable_qty314_flg,
					DispRslt1R.$editable_qty315_flg, DispRslt1R.$editable_qty316_flg,
					DispRslt1R.$editable_qty317_flg, DispRslt1R.$editable_qty318_flg,
					DispRslt1R.$editable_qty319_flg, DispRslt1R.$editable_qty320_flg,
					DispRslt1R.$editable_qty321_flg, DispRslt1R.$editable_qty322_flg,
					DispRslt1R.$editable_qty323_flg, DispRslt1R.$editable_qty324_flg,
					DispRslt1R.$editable_qty325_flg, DispRslt1R.$editable_qty326_flg,
					DispRslt1R.$editable_qty327_flg, DispRslt1R.$editable_qty328_flg,
					DispRslt1R.$editable_qty329_flg, DispRslt1R.$editable_qty330_flg,
					DispRslt1R.$editable_qty331_flg, DispRslt1R.$editable_qty332_flg,
					DispRslt1R.$editable_qty333_flg, DispRslt1R.$editable_qty334_flg,
					DispRslt1R.$editable_qty335_flg, DispRslt1R.$editable_qty336_flg,
					DispRslt1R.$editable_qty337_flg, DispRslt1R.$editable_qty338_flg,
					DispRslt1R.$editable_qty339_flg, DispRslt1R.$editable_qty340_flg,
					DispRslt1R.$editable_qty341_flg, DispRslt1R.$editable_qty342_flg,
					DispRslt1R.$editable_qty343_flg, DispRslt1R.$editable_qty344_flg,
					DispRslt1R.$editable_qty345_flg, DispRslt1R.$editable_qty346_flg,
					DispRslt1R.$editable_qty347_flg, DispRslt1R.$editable_qty348_flg,
					DispRslt1R.$editable_qty349_flg, DispRslt1R.$editable_qty350_flg,
					DispRslt1R.$editable_qty351_flg, DispRslt1R.$editable_qty352_flg,
					DispRslt1R.$editable_qty353_flg, DispRslt1R.$editable_qty354_flg,
					DispRslt1R.$editable_qty355_flg, DispRslt1R.$editable_qty356_flg,
					DispRslt1R.$editable_qty357_flg, DispRslt1R.$editable_qty358_flg,
					DispRslt1R.$editable_qty359_flg, DispRslt1R.$editable_qty360_flg,
					DispRslt1R.$editable_qty361_flg, DispRslt1R.$editable_qty362_flg,
					DispRslt1R.$editable_qty363_flg, DispRslt1R.$editable_qty364_flg,
					DispRslt1R.$editable_qty365_flg, DispRslt1R.$editable_qty366_flg,
					DispRslt1R.$editable_qty367_flg, DispRslt1R.$editable_qty368_flg,
					DispRslt1R.$editable_qty369_flg, DispRslt1R.$editable_qty370_flg,
					DispRslt1R.$editable_qty371_flg, DispRslt1R.$editable_qty372_flg,
					DispRslt1R.$editable_qty373_flg, DispRslt1R.$editable_qty374_flg,
					DispRslt1R.$editable_qty375_flg, DispRslt1R.$editable_qty376_flg,
					DispRslt1R.$editable_qty377_flg, DispRslt1R.$editable_qty378_flg,
					DispRslt1R.$editable_qty379_flg, DispRslt1R.$editable_qty380_flg,
					DispRslt1R.$editable_qty381_flg, DispRslt1R.$editable_qty382_flg,
					DispRslt1R.$editable_qty383_flg, DispRslt1R.$editable_qty384_flg,
					DispRslt1R.$editable_qty385_flg, DispRslt1R.$editable_qty386_flg,
					DispRslt1R.$editable_qty387_flg, DispRslt1R.$editable_qty388_flg,
					DispRslt1R.$editable_qty389_flg, DispRslt1R.$editable_qty390_flg,
					DispRslt1R.$editable_qty391_flg, DispRslt1R.$editable_qty392_flg,
					DispRslt1R.$editable_qty393_flg, DispRslt1R.$editable_qty394_flg,
					DispRslt1R.$editable_qty395_flg, DispRslt1R.$editable_qty396_flg,
					DispRslt1R.$editable_qty397_flg, DispRslt1R.$editable_qty398_flg,
					DispRslt1R.$editable_qty399_flg, DispRslt1R.$editable_qty400_flg,
					DispRslt1R.$editable_qty401_flg, DispRslt1R.$editable_qty402_flg,
					DispRslt1R.$editable_qty403_flg, DispRslt1R.$editable_qty404_flg,
					DispRslt1R.$editable_qty405_flg, DispRslt1R.$editable_qty406_flg,
					DispRslt1R.$editable_qty407_flg, DispRslt1R.$editable_qty408_flg,
					DispRslt1R.$editable_qty409_flg, DispRslt1R.$editable_qty410_flg,
					DispRslt1R.$editable_qty411_flg, DispRslt1R.$editable_qty412_flg,
					DispRslt1R.$editable_qty413_flg, DispRslt1R.$editable_qty414_flg,
					DispRslt1R.$editable_qty415_flg, DispRslt1R.$editable_qty416_flg,
					DispRslt1R.$editable_qty417_flg, DispRslt1R.$editable_qty418_flg,
					DispRslt1R.$editable_qty419_flg, DispRslt1R.$editable_qty420_flg,
					DispRslt1R.$editable_qty421_flg, DispRslt1R.$editable_qty422_flg,
					DispRslt1R.$editable_qty423_flg, DispRslt1R.$editable_qty424_flg,
					DispRslt1R.$editable_qty425_flg, DispRslt1R.$editable_qty426_flg,
					DispRslt1R.$editable_qty427_flg, DispRslt1R.$editable_qty428_flg,
					DispRslt1R.$editable_qty429_flg, DispRslt1R.$editable_qty430_flg,
					DispRslt1R.$editable_qty431_flg, DispRslt1R.$editable_qty432_flg,
					DispRslt1R.$editable_qty433_flg, DispRslt1R.$editable_qty434_flg,
					DispRslt1R.$editable_qty435_flg, DispRslt1R.$editable_qty436_flg,
					DispRslt1R.$editable_qty437_flg, DispRslt1R.$editable_qty438_flg,
					DispRslt1R.$editable_qty439_flg, DispRslt1R.$editable_qty440_flg,
					DispRslt1R.$editable_qty441_flg, DispRslt1R.$editable_qty442_flg,
					DispRslt1R.$editable_qty443_flg, DispRslt1R.$editable_qty444_flg,
					DispRslt1R.$editable_qty445_flg, DispRslt1R.$editable_qty446_flg,
					DispRslt1R.$editable_qty447_flg, DispRslt1R.$editable_qty448_flg,
					DispRslt1R.$editable_qty449_flg, DispRslt1R.$editable_qty450_flg,
					DispRslt1R.$editable_qty451_flg, DispRslt1R.$editable_qty452_flg,
					DispRslt1R.$editable_qty453_flg, DispRslt1R.$editable_qty454_flg,
					DispRslt1R.$editable_qty455_flg, DispRslt1R.$editable_qty456_flg,
					DispRslt1R.$editable_qty457_flg, DispRslt1R.$editable_qty458_flg,
					DispRslt1R.$editable_qty459_flg, DispRslt1R.$editable_qty460_flg,
					DispRslt1R.$editable_qty461_flg, DispRslt1R.$editable_qty462_flg,
					DispRslt1R.$editable_qty463_flg, DispRslt1R.$editable_qty464_flg,
					DispRslt1R.$editable_qty465_flg, DispRslt1R.$editable_qty466_flg,
					DispRslt1R.$editable_qty467_flg, DispRslt1R.$editable_qty468_flg,
					DispRslt1R.$editable_qty469_flg, DispRslt1R.$editable_qty470_flg,
					DispRslt1R.$editable_qty471_flg, DispRslt1R.$editable_qty472_flg,
					DispRslt1R.$editable_qty473_flg, DispRslt1R.$editable_qty474_flg,
					DispRslt1R.$editable_qty475_flg, DispRslt1R.$editable_qty476_flg,
					DispRslt1R.$editable_qty477_flg, DispRslt1R.$editable_qty478_flg,
					DispRslt1R.$editable_qty479_flg, DispRslt1R.$editable_qty480_flg,
					DispRslt1R.$editable_qty481_flg, DispRslt1R.$editable_qty482_flg,
					DispRslt1R.$editable_qty483_flg, DispRslt1R.$editable_qty484_flg,
					DispRslt1R.$editable_qty485_flg, DispRslt1R.$editable_qty486_flg,
					DispRslt1R.$editable_qty487_flg, DispRslt1R.$editable_qty488_flg,
					DispRslt1R.$editable_qty489_flg, DispRslt1R.$editable_qty490_flg,
					DispRslt1R.$editable_qty491_flg, DispRslt1R.$editable_qty492_flg,
					DispRslt1R.$editable_qty493_flg, DispRslt1R.$editable_qty494_flg,
					DispRslt1R.$editable_qty495_flg, DispRslt1R.$editable_qty496_flg,
					DispRslt1R.$editable_qty497_flg, DispRslt1R.$editable_qty498_flg
				};
		}
		return _flgCols;
	}

	/** 明細のデータ項目の配列を返します */
	protected MCColumnConfig[] getFlgs() {
		if (_flgs == null) {
			_flgs = new MCColumnConfig[] {
					columnDispRslt1_editable_qty01_flg,
					columnDispRslt1_editable_qty02_flg,
					columnDispRslt1_editable_qty03_flg,
					columnDispRslt1_editable_qty04_flg,
					columnDispRslt1_editable_qty05_flg,
					columnDispRslt1_editable_qty06_flg,
					columnDispRslt1_editable_qty07_flg,
					columnDispRslt1_editable_qty08_flg,
					columnDispRslt1_editable_qty09_flg,
					columnDispRslt1_editable_qty10_flg,
					columnDispRslt1_editable_qty11_flg,
					columnDispRslt1_editable_qty12_flg,
					columnDispRslt1_editable_qty13_flg,
					columnDispRslt1_editable_qty14_flg,
					columnDispRslt1_editable_qty15_flg,
					columnDispRslt1_editable_qty16_flg,
					columnDispRslt1_editable_qty17_flg,
					columnDispRslt1_editable_qty18_flg,
					columnDispRslt1_editable_qty19_flg,
					columnDispRslt1_editable_qty20_flg,
					columnDispRslt1_editable_qty21_flg,
					columnDispRslt1_editable_qty22_flg,
					columnDispRslt1_editable_qty23_flg,
					columnDispRslt1_editable_qty24_flg,
					columnDispRslt1_editable_qty25_flg,
					columnDispRslt1_editable_qty26_flg,
					columnDispRslt1_editable_qty27_flg,
					columnDispRslt1_editable_qty28_flg,
					columnDispRslt1_editable_qty29_flg,
					columnDispRslt1_editable_qty30_flg,
					columnDispRslt1_editable_qty31_flg,
					columnDispRslt1_editable_qty32_flg,
					columnDispRslt1_editable_qty33_flg,
					columnDispRslt1_editable_qty34_flg,
					columnDispRslt1_editable_qty35_flg,
					columnDispRslt1_editable_qty36_flg,
					columnDispRslt1_editable_qty37_flg,
					columnDispRslt1_editable_qty38_flg,
					columnDispRslt1_editable_qty39_flg,
					columnDispRslt1_editable_qty40_flg,
					columnDispRslt1_editable_qty41_flg,
					columnDispRslt1_editable_qty42_flg,
					columnDispRslt1_editable_qty43_flg,
					columnDispRslt1_editable_qty44_flg,
					columnDispRslt1_editable_qty45_flg,
					columnDispRslt1_editable_qty46_flg,
					columnDispRslt1_editable_qty47_flg,
					columnDispRslt1_editable_qty48_flg,
					columnDispRslt1_editable_qty49_flg,
					columnDispRslt1_editable_qty50_flg,
					columnDispRslt1_editable_qty51_flg,
					columnDispRslt1_editable_qty52_flg,
					columnDispRslt1_editable_qty53_flg,
					columnDispRslt1_editable_qty54_flg,
					columnDispRslt1_editable_qty55_flg,
					columnDispRslt1_editable_qty56_flg,
					columnDispRslt1_editable_qty57_flg,
					columnDispRslt1_editable_qty58_flg,
					columnDispRslt1_editable_qty59_flg,
					columnDispRslt1_editable_qty60_flg,
					columnDispRslt1_editable_qty61_flg,
					columnDispRslt1_editable_qty62_flg,
					columnDispRslt1_editable_qty63_flg,
					columnDispRslt1_editable_qty64_flg,
					columnDispRslt1_editable_qty65_flg,
					columnDispRslt1_editable_qty66_flg,
					columnDispRslt1_editable_qty67_flg,
					columnDispRslt1_editable_qty68_flg,
					columnDispRslt1_editable_qty69_flg,
					columnDispRslt1_editable_qty70_flg,
					columnDispRslt1_editable_qty71_flg,
					columnDispRslt1_editable_qty72_flg,
					columnDispRslt1_editable_qty73_flg,
					columnDispRslt1_editable_qty74_flg,
					columnDispRslt1_editable_qty75_flg,
					columnDispRslt1_editable_qty76_flg,
					columnDispRslt1_editable_qty77_flg,
					columnDispRslt1_editable_qty78_flg,
					columnDispRslt1_editable_qty79_flg,
					columnDispRslt1_editable_qty80_flg,
					columnDispRslt1_editable_qty81_flg,
					columnDispRslt1_editable_qty82_flg,
					columnDispRslt1_editable_qty83_flg,
					columnDispRslt1_editable_qty84_flg,
					columnDispRslt1_editable_qty85_flg,
					columnDispRslt1_editable_qty86_flg,
					columnDispRslt1_editable_qty87_flg,
					columnDispRslt1_editable_qty88_flg,
					columnDispRslt1_editable_qty89_flg,
					columnDispRslt1_editable_qty90_flg,
					columnDispRslt1_editable_qty91_flg,
					columnDispRslt1_editable_qty92_flg,
					columnDispRslt1_editable_qty93_flg,
					columnDispRslt1_editable_qty94_flg,
					columnDispRslt1_editable_qty95_flg,
					columnDispRslt1_editable_qty96_flg,
					columnDispRslt1_editable_qty97_flg,
					columnDispRslt1_editable_qty98_flg,
					columnDispRslt1_editable_qty99_flg,
					columnDispRslt1_editable_qty100_flg,
					columnDispRslt1_editable_qty101_flg,
					columnDispRslt1_editable_qty102_flg,
					columnDispRslt1_editable_qty103_flg,
					columnDispRslt1_editable_qty104_flg,
					columnDispRslt1_editable_qty105_flg,
					columnDispRslt1_editable_qty106_flg,
					columnDispRslt1_editable_qty107_flg,
					columnDispRslt1_editable_qty108_flg,
					columnDispRslt1_editable_qty109_flg,
					columnDispRslt1_editable_qty110_flg,
					columnDispRslt1_editable_qty111_flg,
					columnDispRslt1_editable_qty112_flg,
					columnDispRslt1_editable_qty113_flg,
					columnDispRslt1_editable_qty114_flg,
					columnDispRslt1_editable_qty115_flg,
					columnDispRslt1_editable_qty116_flg,
					columnDispRslt1_editable_qty117_flg,
					columnDispRslt1_editable_qty118_flg,
					columnDispRslt1_editable_qty119_flg,
					columnDispRslt1_editable_qty120_flg,
					columnDispRslt1_editable_qty121_flg,
					columnDispRslt1_editable_qty122_flg,
					columnDispRslt1_editable_qty123_flg,
					columnDispRslt1_editable_qty124_flg,
					columnDispRslt1_editable_qty125_flg,
					columnDispRslt1_editable_qty126_flg,
					columnDispRslt1_editable_qty127_flg,
					columnDispRslt1_editable_qty128_flg,
					columnDispRslt1_editable_qty129_flg,
					columnDispRslt1_editable_qty130_flg,
					columnDispRslt1_editable_qty131_flg,
					columnDispRslt1_editable_qty132_flg,
					columnDispRslt1_editable_qty133_flg,
					columnDispRslt1_editable_qty134_flg,
					columnDispRslt1_editable_qty135_flg,
					columnDispRslt1_editable_qty136_flg,
					columnDispRslt1_editable_qty137_flg,
					columnDispRslt1_editable_qty138_flg,
					columnDispRslt1_editable_qty139_flg,
					columnDispRslt1_editable_qty140_flg,
					columnDispRslt1_editable_qty141_flg,
					columnDispRslt1_editable_qty142_flg,
					columnDispRslt1_editable_qty143_flg,
					columnDispRslt1_editable_qty144_flg,
					columnDispRslt1_editable_qty145_flg,
					columnDispRslt1_editable_qty146_flg,
					columnDispRslt1_editable_qty147_flg,
					columnDispRslt1_editable_qty148_flg,
					columnDispRslt1_editable_qty149_flg,
					columnDispRslt1_editable_qty150_flg,
					columnDispRslt1_editable_qty151_flg,
					columnDispRslt1_editable_qty152_flg,
					columnDispRslt1_editable_qty153_flg,
					columnDispRslt1_editable_qty154_flg,
					columnDispRslt1_editable_qty155_flg,
					columnDispRslt1_editable_qty156_flg,
					columnDispRslt1_editable_qty157_flg,
					columnDispRslt1_editable_qty158_flg,
					columnDispRslt1_editable_qty159_flg,
					columnDispRslt1_editable_qty160_flg,
					columnDispRslt1_editable_qty161_flg,
					columnDispRslt1_editable_qty162_flg,
					columnDispRslt1_editable_qty163_flg,
					columnDispRslt1_editable_qty164_flg,
					columnDispRslt1_editable_qty165_flg,
					columnDispRslt1_editable_qty166_flg,
					columnDispRslt1_editable_qty167_flg,
					columnDispRslt1_editable_qty168_flg,
					columnDispRslt1_editable_qty169_flg,
					columnDispRslt1_editable_qty170_flg,
					columnDispRslt1_editable_qty171_flg,
					columnDispRslt1_editable_qty172_flg,
					columnDispRslt1_editable_qty173_flg,
					columnDispRslt1_editable_qty174_flg,
					columnDispRslt1_editable_qty175_flg,
					columnDispRslt1_editable_qty176_flg,
					columnDispRslt1_editable_qty177_flg,
					columnDispRslt1_editable_qty178_flg,
					columnDispRslt1_editable_qty179_flg,
					columnDispRslt1_editable_qty180_flg,
					columnDispRslt1_editable_qty181_flg,
					columnDispRslt1_editable_qty182_flg,
					columnDispRslt1_editable_qty183_flg,
					columnDispRslt1_editable_qty184_flg,
					columnDispRslt1_editable_qty185_flg,
					columnDispRslt1_editable_qty186_flg,
					columnDispRslt1_editable_qty187_flg,
					columnDispRslt1_editable_qty188_flg,
					columnDispRslt1_editable_qty189_flg,
					columnDispRslt1_editable_qty190_flg,
					columnDispRslt1_editable_qty191_flg,
					columnDispRslt1_editable_qty192_flg,
					columnDispRslt1_editable_qty193_flg,
					columnDispRslt1_editable_qty194_flg,
					columnDispRslt1_editable_qty195_flg,
					columnDispRslt1_editable_qty196_flg,
					columnDispRslt1_editable_qty197_flg,
					columnDispRslt1_editable_qty198_flg,
					columnDispRslt1_editable_qty199_flg,
					columnDispRslt1_editable_qty200_flg,
					columnDispRslt1_editable_qty201_flg,
					columnDispRslt1_editable_qty202_flg,
					columnDispRslt1_editable_qty203_flg,
					columnDispRslt1_editable_qty204_flg,
					columnDispRslt1_editable_qty205_flg,
					columnDispRslt1_editable_qty206_flg,
					columnDispRslt1_editable_qty207_flg,
					columnDispRslt1_editable_qty208_flg,
					columnDispRslt1_editable_qty209_flg,
					columnDispRslt1_editable_qty210_flg,
					columnDispRslt1_editable_qty211_flg,
					columnDispRslt1_editable_qty212_flg,
					columnDispRslt1_editable_qty213_flg,
					columnDispRslt1_editable_qty214_flg,
					columnDispRslt1_editable_qty215_flg,
					columnDispRslt1_editable_qty216_flg,
					columnDispRslt1_editable_qty217_flg,
					columnDispRslt1_editable_qty218_flg,
					columnDispRslt1_editable_qty219_flg,
					columnDispRslt1_editable_qty220_flg,
					columnDispRslt1_editable_qty221_flg,
					columnDispRslt1_editable_qty222_flg,
					columnDispRslt1_editable_qty223_flg,
					columnDispRslt1_editable_qty224_flg,
					columnDispRslt1_editable_qty225_flg,
					columnDispRslt1_editable_qty226_flg,
					columnDispRslt1_editable_qty227_flg,
					columnDispRslt1_editable_qty228_flg,
					columnDispRslt1_editable_qty229_flg,
					columnDispRslt1_editable_qty230_flg,
					columnDispRslt1_editable_qty231_flg,
					columnDispRslt1_editable_qty232_flg,
					columnDispRslt1_editable_qty233_flg,
					columnDispRslt1_editable_qty234_flg,
					columnDispRslt1_editable_qty235_flg,
					columnDispRslt1_editable_qty236_flg,
					columnDispRslt1_editable_qty237_flg,
					columnDispRslt1_editable_qty238_flg,
					columnDispRslt1_editable_qty239_flg,
					columnDispRslt1_editable_qty240_flg,
					columnDispRslt1_editable_qty241_flg,
					columnDispRslt1_editable_qty242_flg,
					columnDispRslt1_editable_qty243_flg,
					columnDispRslt1_editable_qty244_flg,
					columnDispRslt1_editable_qty245_flg,
					columnDispRslt1_editable_qty246_flg,
					columnDispRslt1_editable_qty247_flg,
					columnDispRslt1_editable_qty248_flg,
					columnDispRslt1_editable_qty249_flg,
					columnDispRslt1_editable_qty250_flg,
					columnDispRslt1_editable_qty251_flg,
					columnDispRslt1_editable_qty252_flg,
					columnDispRslt1_editable_qty253_flg,
					columnDispRslt1_editable_qty254_flg,
					columnDispRslt1_editable_qty255_flg,
					columnDispRslt1_editable_qty256_flg,
					columnDispRslt1_editable_qty257_flg,
					columnDispRslt1_editable_qty258_flg,
					columnDispRslt1_editable_qty259_flg,
					columnDispRslt1_editable_qty260_flg,
					columnDispRslt1_editable_qty261_flg,
					columnDispRslt1_editable_qty262_flg,
					columnDispRslt1_editable_qty263_flg,
					columnDispRslt1_editable_qty264_flg,
					columnDispRslt1_editable_qty265_flg,
					columnDispRslt1_editable_qty266_flg,
					columnDispRslt1_editable_qty267_flg,
					columnDispRslt1_editable_qty268_flg,
					columnDispRslt1_editable_qty269_flg,
					columnDispRslt1_editable_qty270_flg,
					columnDispRslt1_editable_qty271_flg,
					columnDispRslt1_editable_qty272_flg,
					columnDispRslt1_editable_qty273_flg,
					columnDispRslt1_editable_qty274_flg,
					columnDispRslt1_editable_qty275_flg,
					columnDispRslt1_editable_qty276_flg,
					columnDispRslt1_editable_qty277_flg,
					columnDispRslt1_editable_qty278_flg,
					columnDispRslt1_editable_qty279_flg,
					columnDispRslt1_editable_qty280_flg,
					columnDispRslt1_editable_qty281_flg,
					columnDispRslt1_editable_qty282_flg,
					columnDispRslt1_editable_qty283_flg,
					columnDispRslt1_editable_qty284_flg,
					columnDispRslt1_editable_qty285_flg,
					columnDispRslt1_editable_qty286_flg,
					columnDispRslt1_editable_qty287_flg,
					columnDispRslt1_editable_qty288_flg,
					columnDispRslt1_editable_qty289_flg,
					columnDispRslt1_editable_qty290_flg,
					columnDispRslt1_editable_qty291_flg,
					columnDispRslt1_editable_qty292_flg,
					columnDispRslt1_editable_qty293_flg,
					columnDispRslt1_editable_qty294_flg,
					columnDispRslt1_editable_qty295_flg,
					columnDispRslt1_editable_qty296_flg,
					columnDispRslt1_editable_qty297_flg,
					columnDispRslt1_editable_qty298_flg,
					columnDispRslt1_editable_qty299_flg,
					columnDispRslt1_editable_qty300_flg,
					columnDispRslt1_editable_qty301_flg,
					columnDispRslt1_editable_qty302_flg,
					columnDispRslt1_editable_qty303_flg,
					columnDispRslt1_editable_qty304_flg,
					columnDispRslt1_editable_qty305_flg,
					columnDispRslt1_editable_qty306_flg,
					columnDispRslt1_editable_qty307_flg,
					columnDispRslt1_editable_qty308_flg,
					columnDispRslt1_editable_qty309_flg,
					columnDispRslt1_editable_qty310_flg,
					columnDispRslt1_editable_qty311_flg,
					columnDispRslt1_editable_qty312_flg,
					columnDispRslt1_editable_qty313_flg,
					columnDispRslt1_editable_qty314_flg,
					columnDispRslt1_editable_qty315_flg,
					columnDispRslt1_editable_qty316_flg,
					columnDispRslt1_editable_qty317_flg,
					columnDispRslt1_editable_qty318_flg,
					columnDispRslt1_editable_qty319_flg,
					columnDispRslt1_editable_qty320_flg,
					columnDispRslt1_editable_qty321_flg,
					columnDispRslt1_editable_qty322_flg,
					columnDispRslt1_editable_qty323_flg,
					columnDispRslt1_editable_qty324_flg,
					columnDispRslt1_editable_qty325_flg,
					columnDispRslt1_editable_qty326_flg,
					columnDispRslt1_editable_qty327_flg,
					columnDispRslt1_editable_qty328_flg,
					columnDispRslt1_editable_qty329_flg,
					columnDispRslt1_editable_qty330_flg,
					columnDispRslt1_editable_qty331_flg,
					columnDispRslt1_editable_qty332_flg,
					columnDispRslt1_editable_qty333_flg,
					columnDispRslt1_editable_qty334_flg,
					columnDispRslt1_editable_qty335_flg,
					columnDispRslt1_editable_qty336_flg,
					columnDispRslt1_editable_qty337_flg,
					columnDispRslt1_editable_qty338_flg,
					columnDispRslt1_editable_qty339_flg,
					columnDispRslt1_editable_qty340_flg,
					columnDispRslt1_editable_qty341_flg,
					columnDispRslt1_editable_qty342_flg,
					columnDispRslt1_editable_qty343_flg,
					columnDispRslt1_editable_qty344_flg,
					columnDispRslt1_editable_qty345_flg,
					columnDispRslt1_editable_qty346_flg,
					columnDispRslt1_editable_qty347_flg,
					columnDispRslt1_editable_qty348_flg,
					columnDispRslt1_editable_qty349_flg,
					columnDispRslt1_editable_qty350_flg,
					columnDispRslt1_editable_qty351_flg,
					columnDispRslt1_editable_qty352_flg,
					columnDispRslt1_editable_qty353_flg,
					columnDispRslt1_editable_qty354_flg,
					columnDispRslt1_editable_qty355_flg,
					columnDispRslt1_editable_qty356_flg,
					columnDispRslt1_editable_qty357_flg,
					columnDispRslt1_editable_qty358_flg,
					columnDispRslt1_editable_qty359_flg,
					columnDispRslt1_editable_qty360_flg,
					columnDispRslt1_editable_qty361_flg,
					columnDispRslt1_editable_qty362_flg,
					columnDispRslt1_editable_qty363_flg,
					columnDispRslt1_editable_qty364_flg,
					columnDispRslt1_editable_qty365_flg,
					columnDispRslt1_editable_qty366_flg,
					columnDispRslt1_editable_qty367_flg,
					columnDispRslt1_editable_qty368_flg,
					columnDispRslt1_editable_qty369_flg,
					columnDispRslt1_editable_qty370_flg,
					columnDispRslt1_editable_qty371_flg,
					columnDispRslt1_editable_qty372_flg,
					columnDispRslt1_editable_qty373_flg,
					columnDispRslt1_editable_qty374_flg,
					columnDispRslt1_editable_qty375_flg,
					columnDispRslt1_editable_qty376_flg,
					columnDispRslt1_editable_qty377_flg,
					columnDispRslt1_editable_qty378_flg,
					columnDispRslt1_editable_qty379_flg,
					columnDispRslt1_editable_qty380_flg,
					columnDispRslt1_editable_qty381_flg,
					columnDispRslt1_editable_qty382_flg,
					columnDispRslt1_editable_qty383_flg,
					columnDispRslt1_editable_qty384_flg,
					columnDispRslt1_editable_qty385_flg,
					columnDispRslt1_editable_qty386_flg,
					columnDispRslt1_editable_qty387_flg,
					columnDispRslt1_editable_qty388_flg,
					columnDispRslt1_editable_qty389_flg,
					columnDispRslt1_editable_qty390_flg,
					columnDispRslt1_editable_qty391_flg,
					columnDispRslt1_editable_qty392_flg,
					columnDispRslt1_editable_qty393_flg,
					columnDispRslt1_editable_qty394_flg,
					columnDispRslt1_editable_qty395_flg,
					columnDispRslt1_editable_qty396_flg,
					columnDispRslt1_editable_qty397_flg,
					columnDispRslt1_editable_qty398_flg,
					columnDispRslt1_editable_qty399_flg,
					columnDispRslt1_editable_qty400_flg,
					columnDispRslt1_editable_qty401_flg,
					columnDispRslt1_editable_qty402_flg,
					columnDispRslt1_editable_qty403_flg,
					columnDispRslt1_editable_qty404_flg,
					columnDispRslt1_editable_qty405_flg,
					columnDispRslt1_editable_qty406_flg,
					columnDispRslt1_editable_qty407_flg,
					columnDispRslt1_editable_qty408_flg,
					columnDispRslt1_editable_qty409_flg,
					columnDispRslt1_editable_qty410_flg,
					columnDispRslt1_editable_qty411_flg,
					columnDispRslt1_editable_qty412_flg,
					columnDispRslt1_editable_qty413_flg,
					columnDispRslt1_editable_qty414_flg,
					columnDispRslt1_editable_qty415_flg,
					columnDispRslt1_editable_qty416_flg,
					columnDispRslt1_editable_qty417_flg,
					columnDispRslt1_editable_qty418_flg,
					columnDispRslt1_editable_qty419_flg,
					columnDispRslt1_editable_qty420_flg,
					columnDispRslt1_editable_qty421_flg,
					columnDispRslt1_editable_qty422_flg,
					columnDispRslt1_editable_qty423_flg,
					columnDispRslt1_editable_qty424_flg,
					columnDispRslt1_editable_qty425_flg,
					columnDispRslt1_editable_qty426_flg,
					columnDispRslt1_editable_qty427_flg,
					columnDispRslt1_editable_qty428_flg,
					columnDispRslt1_editable_qty429_flg,
					columnDispRslt1_editable_qty430_flg,
					columnDispRslt1_editable_qty431_flg,
					columnDispRslt1_editable_qty432_flg,
					columnDispRslt1_editable_qty433_flg,
					columnDispRslt1_editable_qty434_flg,
					columnDispRslt1_editable_qty435_flg,
					columnDispRslt1_editable_qty436_flg,
					columnDispRslt1_editable_qty437_flg,
					columnDispRslt1_editable_qty438_flg,
					columnDispRslt1_editable_qty439_flg,
					columnDispRslt1_editable_qty440_flg,
					columnDispRslt1_editable_qty441_flg,
					columnDispRslt1_editable_qty442_flg,
					columnDispRslt1_editable_qty443_flg,
					columnDispRslt1_editable_qty444_flg,
					columnDispRslt1_editable_qty445_flg,
					columnDispRslt1_editable_qty446_flg,
					columnDispRslt1_editable_qty447_flg,
					columnDispRslt1_editable_qty448_flg,
					columnDispRslt1_editable_qty449_flg,
					columnDispRslt1_editable_qty450_flg,
					columnDispRslt1_editable_qty451_flg,
					columnDispRslt1_editable_qty452_flg,
					columnDispRslt1_editable_qty453_flg,
					columnDispRslt1_editable_qty454_flg,
					columnDispRslt1_editable_qty455_flg,
					columnDispRslt1_editable_qty456_flg,
					columnDispRslt1_editable_qty457_flg,
					columnDispRslt1_editable_qty458_flg,
					columnDispRslt1_editable_qty459_flg,
					columnDispRslt1_editable_qty460_flg,
					columnDispRslt1_editable_qty461_flg,
					columnDispRslt1_editable_qty462_flg,
					columnDispRslt1_editable_qty463_flg,
					columnDispRslt1_editable_qty464_flg,
					columnDispRslt1_editable_qty465_flg,
					columnDispRslt1_editable_qty466_flg,
					columnDispRslt1_editable_qty467_flg,
					columnDispRslt1_editable_qty468_flg,
					columnDispRslt1_editable_qty469_flg,
					columnDispRslt1_editable_qty470_flg,
					columnDispRslt1_editable_qty471_flg,
					columnDispRslt1_editable_qty472_flg,
					columnDispRslt1_editable_qty473_flg,
					columnDispRslt1_editable_qty474_flg,
					columnDispRslt1_editable_qty475_flg,
					columnDispRslt1_editable_qty476_flg,
					columnDispRslt1_editable_qty477_flg,
					columnDispRslt1_editable_qty478_flg,
					columnDispRslt1_editable_qty479_flg,
					columnDispRslt1_editable_qty480_flg,
					columnDispRslt1_editable_qty481_flg,
					columnDispRslt1_editable_qty482_flg,
					columnDispRslt1_editable_qty483_flg,
					columnDispRslt1_editable_qty484_flg,
					columnDispRslt1_editable_qty485_flg,
					columnDispRslt1_editable_qty486_flg,
					columnDispRslt1_editable_qty487_flg,
					columnDispRslt1_editable_qty488_flg,
					columnDispRslt1_editable_qty489_flg,
					columnDispRslt1_editable_qty490_flg,
					columnDispRslt1_editable_qty491_flg,
					columnDispRslt1_editable_qty492_flg,
					columnDispRslt1_editable_qty493_flg,
					columnDispRslt1_editable_qty494_flg,
					columnDispRslt1_editable_qty495_flg,
					columnDispRslt1_editable_qty496_flg,
					columnDispRslt1_editable_qty497_flg,
					columnDispRslt1_editable_qty498_flg
			};
		}
		return _flgs;
	}

	/**
	 * 在庫推移を計算する
	 * @param
	 */
	protected void calcStk(DispRslt1R rslt1R) {
		MCIndexKey tgtKey = getDispRslt1L().createIndex(DispRslt1R.$sd_adjst_dtl_typ);
		MCIndexKey idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd, DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3, DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);

		// 対象の行が未指定の場合は全ての在庫推移を行う
		MCList<DispRslt1R> tgtL = MCList.create(DispRslt1R.class);
		if(isNull(rslt1R)) {
			tgtL = getDispRslt1L().subList(tgtKey, MSC_SD_ADJST_DTL_TYP.STK.value());
		}
		else {
			tgtL = getDispRslt1L().subList(idxKey, rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd(), MSC_SD_ADJST_DTL_TYP.STK.value());
		}

		for(DispRslt1R r : tgtL) {
			DispRslt1R dmndR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.DMND.value());
			DispRslt1R giR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.GI.value());
			DispRslt1R grR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.GR.value());
			DispRslt1R spplyR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.SPPLY.value());
			DispRslt1R bufR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.BUF.value());

			// 起点在庫を取得
			MCNumber stk = nvl(r.qty00(), MCNumber.ZERO);

			for (int i = 0; i <= _max_day_duration+1; i++) {
				MCNumber grQty = MCNumber.ZERO;
				MCNumber giQty = MCNumber.ZERO;

				// 安全在庫数量を考慮
				MCNumber bufQty = MCNumber.ZERO;
				if (i == 0) {
					bufQty = nvl(bufR.getNumber(getColnm()[i]), MCNumber.ZERO);
				}
				else {
					MCNumber curBufQty = nvl(bufR.getNumber(getColnm()[i]), MCNumber.ZERO);
					MCNumber befBufQty = nvl(bufR.getNumber(getColnm()[i - 1]), MCNumber.ZERO);
					bufQty = curBufQty.subtract(befBufQty);
				}
				MCDate dt = null;
				if (Cnd_ope_MON.isSelected()) {
					dt = MAUCP_DateUtil
							.getPeriodStDt(getCopyCndR().dmnd_dt_fr(),
									MAC_PERIOD_TYP.MONTHLY.value(), getCo().ac_cl_day())
							.addMonth(i - 1);
					if (dt.gt(MAUCP_DateUtil
							.getPeriodStDt(getCopyCndR().dmnd_dt_to(),
									MAC_PERIOD_TYP.MONTHLY.value(), getCo().ac_cl_day())
							.addMonth(1))) {
						break;
					}
				}
				else {
					dt = getCopyCndR().dmnd_dt_fr().addDay(i - 1);
					if (dt.gt(getCopyCndR().dmnd_dt_to().addDay(1))) {
						break;
					}
				}
				if (i != 0) {
					stk = stk.subtract(nvl(dmndR.getNumber(getColnm()[i]), MCNumber.ZERO));
					stk = stk.subtract(nvl(giR.getNumber(getColnm()[i]), MCNumber.ZERO));
					stk = stk.add(nvl(grR.getNumber(getColnm()[i]), MCNumber.ZERO));
					stk = stk.add(nvl(spplyR.getNumber(getColnm()[i]), MCNumber.ZERO));
					if (Cnd_buf_qty_flg.getValue()) {
						// 検索条件の「安全在庫を考慮」がオンになっている場合のみ、在庫から安全在庫を差し引いて表示する。
						stk = stk.subtract(nvl(bufQty, MCNumber.ZERO));
					}
				}
				giQty = giQty.add(nvl(dmndR.getNumber(getColnm()[i]), MCNumber.ZERO));
				giQty = giQty.add(nvl(giR.getNumber(getColnm()[i]), MCNumber.ZERO));
				grQty = grQty.add(nvl(grR.getNumber(getColnm()[i]), MCNumber.ZERO));
				grQty = grQty.add(nvl(spplyR.getNumber(getColnm()[i]), MCNumber.ZERO));
				r.setNumber(getColnm()[i], stk);

				// 検索後のみ、前回在庫を計算する
				if(isNull(rslt1R)) {
					DispRslt1R oldStkR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.OLDSTK.value());
					oldStkR.setNumber(getColnm()[i], stk);
				}

				// グラフ表示用のリストにも設定
				MCList<Rslt1R> rslt1L = _bakRslt1L.get(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd()));
				if(!isNull(rslt1L)) {
					MCIndexKey dtKey = rslt1L.createIndex(Rslt1R.$schd_dt);
					Rslt1R tgtRslt1R = rslt1L.getFirst(dtKey, dt);
					if(!isNull(tgtRslt1R)) {
						tgtRslt1R.stk_qty(stk);
						tgtRslt1R.gi_qty(giQty);
						tgtRslt1R.gr_qty(grQty);
					}
					else {
						Rslt1R insR = Rslt1R.create();
						insR.itm_cd(r.itm_cd());
						insR.itm_sub1(r.itm_sub1());
						insR.itm_sub2(r.itm_sub2());
						insR.itm_sub3(r.itm_sub3());
						insR.loc_cd(r.loc_cd());
						insR.schd_dt(dt);
						if (Cnd_ope_MON.isSelected()) {
							insR.disp_schd_dt(toY2MString(dt));
						}
						else {
							insR.disp_schd_dt(toY2MDString(dt));
						}
						insR.stk_qty(stk);
						insR.gi_qty(giQty);
						insR.gr_qty(grQty);
						rslt1L.add(insR);
						_bakRslt1L.put(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd()), rslt1L);
					}
				}
				else {
					MCList<Rslt1R> insL = MCList.create(Rslt1R.class);
					Rslt1R insR = Rslt1R.create();
					insR.itm_cd(r.itm_cd());
					insR.itm_sub1(r.itm_sub1());
					insR.itm_sub2(r.itm_sub2());
					insR.itm_sub3(r.itm_sub3());
					insR.loc_cd(r.loc_cd());
					insR.schd_dt(dt);
					if (Cnd_ope_MON.isSelected()) {
						insR.disp_schd_dt(toY2MString(dt));
					}
					else {
						insR.disp_schd_dt(toY2MDString(dt));
					}
					insR.stk_qty(stk);
					insR.gi_qty(giQty);
					insR.gr_qty(grQty);
					insL.add(insR);
					_bakRslt1L.put(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd()), insL);
				}
			}
		}

		// 検索後のみ、シミュ在庫を計算する
		if(isNull(rslt1R)) {
			tgtL = getDispRslt1L().subList(tgtKey, MSC_SD_ADJST_DTL_TYP.SIMSTK.value());
			for(DispRslt1R r : tgtL) {
				DispRslt1R dmndR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.DMND.value());
				DispRslt1R giR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.GI.value());
				DispRslt1R grR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.GR.value());
				DispRslt1R oldSpplyR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.OLDSPPLY.value());
				DispRslt1R simR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.SIM.value());
				DispRslt1R bufR = getDispRslt1L().getFirst(idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), MSC_SD_ADJST_DTL_TYP.BUF.value());

				// 起点在庫を取得
				MCNumber stk = nvl(r.qty00(), MCNumber.ZERO);

				for (int i = 0; i <= _max_day_duration+1; i++) {
					// 安全在庫数量を考慮
					MCNumber bufQty = MCNumber.ZERO;
					if (i == 0) {
						bufQty = nvl(bufR.getNumber(getColnm()[i]), MCNumber.ZERO);
					}
					else {
						MCNumber curBufQty = nvl(bufR.getNumber(getColnm()[i]), MCNumber.ZERO);
						MCNumber befBufQty = nvl(bufR.getNumber(getColnm()[i - 1]), MCNumber.ZERO);
						bufQty = curBufQty.subtract(befBufQty);
					}
					MCDate dt = null;
					if (Cnd_ope_MON.isSelected()) {
						dt = MAUCP_DateUtil.getPeriodStDt(getCopyCndR().dmnd_dt_fr(),
								MAC_PERIOD_TYP.MONTHLY.value(), getCo().ac_cl_day())
								.addMonth(i - 1);
						if (dt.gt(MAUCP_DateUtil
								.getPeriodStDt(getCopyCndR().dmnd_dt_to(),
										MAC_PERIOD_TYP.MONTHLY.value(),
										getCo().ac_cl_day())
								.addDay(1))) {
							break;
						}
					}
					else {
						dt = getCopyCndR().dmnd_dt_fr().addDay(i - 1);
						if (dt.gt(getCopyCndR().dmnd_dt_to().addDay(1))) {
							break;
						}
					}
					if (i != 0) {
						stk = stk.subtract(nvl(dmndR.getNumber(getColnm()[i]), MCNumber.ZERO));
						stk = stk.subtract(nvl(giR.getNumber(getColnm()[i]), MCNumber.ZERO));
						stk = stk.add(nvl(grR.getNumber(getColnm()[i]), MCNumber.ZERO));
						stk = stk.add(nvl(oldSpplyR.getNumber(getColnm()[i]), MCNumber.ZERO));
						stk = stk.add(nvl(simR.getNumber(getColnm()[i]), MCNumber.ZERO));
						if (Cnd_buf_qty_flg.getValue()) {
							// 検索条件の「安全在庫を考慮」がオンになっている場合のみ、在庫から安全在庫を差し引いて表示する。
							stk = stk.subtract(nvl(bufQty, MCNumber.ZERO));
						}
					}
					r.setNumber(getColnm()[i], stk);
				}
			}

			// 検索後の計算結果をリストで保持
			_dispRslt1BakL = getDispRslt1L().clone();

			// 条件による行の表示切替
			dispRows();
		}
	}

	/**
	 * 結果に応じて、入力不可に変更する
	 */
	protected void setModeChg() {
		for(DispRslt1R rslt1R : getDispRslt1L().subList(DispRslt1R.$check, true)) {
			// 結果がOKの場合は、変更不可の属性に変更
			if(MAC_RTN_STS_TYP.isOK(rslt1R.rtn_sts_typ())) {
				rslt1R.check(false);

				MCIndexKey idxKey = getDispRslt1L().createIndex(getDispRslt1Keys());
				MCList<DispRslt1R> tmpRslt1L = getDispRslt1L().subList(idxKey, rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), rslt1R.loc_cd());
				if(!isNull(tmpRslt1L)) {
					tmpRslt1L.setValueNE(DispRslt1R.$rts_msg_p, rslt1R.rts_msg_p());
				}
			}
		}
	}

	protected String[] getRslt1Keys() {
		return new String[] {
				Rslt1R.$itm_cd,
				Rslt1R.$itm_sub1,
				Rslt1R.$itm_sub2,
				Rslt1R.$itm_sub3,
				Rslt1R.$loc_cd
		};
	}

	protected String[] getDispRslt1Keys() {
		return new String[] {
				DispRslt1R.$itm_cd,
				DispRslt1R.$itm_sub1,
				DispRslt1R.$itm_sub2,
				DispRslt1R.$itm_sub3,
				DispRslt1R.$loc_cd
		};
	}

	protected String[] getRslt3Keys() {
		return new String[] {
				Rslt3R.$itm_cd,
				Rslt3R.$itm_sub1,
				Rslt3R.$itm_sub2,
				Rslt3R.$itm_sub3,
				Rslt3R.$strg_loc_cd
		};
	}

	protected String[] getRslt4Keys() {
		return new String[] {
				Rslt4R.$itm_cd,
				Rslt4R.$itm_sub1,
				Rslt4R.$itm_sub2,
				Rslt4R.$itm_sub3,
				Rslt4R.$strg_loc_cd
		};
	}

	protected String[] getRslt5Keys() {
		return new String[] {
				Rslt5R.$itm_cd,
				Rslt5R.$itm_sub1,
				Rslt5R.$itm_sub2,
				Rslt5R.$itm_sub3,
				Rslt5R.$dmnd_loc_cd
		};
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRslt1Table.setCellConfig(crtDispRslt1CellConfig());
		Rslt3Table.setCellConfig(crtRslt3CellConfig());
	}

	protected DispRslt1CellConfig crtDispRslt1CellConfig() {
		return new DispRslt1CellConfig();
	}

	protected class DispRslt1CellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DispRslt1R r = (DispRslt1R) table.getBaseTable().getRow(index);

			if(column == columnDispRslt1_qty00
					|| column == columnDispRslt1_qty499
			) {
				return MCMode.READ_ONLY;
			}

			if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if(column == columnDispRslt1_check) {
				if(!MSC_SD_ADJST_DTL_TYP.isDMND(r.sd_adjst_dtl_typ())) {
					return MCMode.READ_ONLY;
				}
				if (!MAC_RQMT_TYP.isNON(r.rqmt_typ())) {
					return MCMode.READ_ONLY;
				}
				if (!MAC_PROD_PLN_TYP.isDMND_USE(r.prod_pln_typ())) {
					return MCMode.READ_ONLY;
				}
			}

			MCColumnConfig eidtableQtyCol = getEditableQtyCol(column);
			if (eidtableQtyCol == null) {
				return super.getPriorMode(index, column, table);
			}
			else {
				if (!MAC_RQMT_TYP.isNON(r.rqmt_typ())) {
					return MCMode.READ_ONLY;
				}
				if (!MAC_PROD_PLN_TYP.isDMND_USE(r.prod_pln_typ())) {
					return MCMode.READ_ONLY;
				}
				if (!r.getBoolean(eidtableQtyCol.getBaseRowColumnName())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected Rslt3CellConfig crtRslt3CellConfig() {
		return new Rslt3CellConfig();
	}

	protected class Rslt3CellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isUpdStatus()) {
				Rslt3R r = (Rslt3R) table.getBaseTable().getRow(index);
				if(r.fix_flg()) {
					return MCMode.READ_ONLY;
				}

				if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				// _idxKeyの有効確認を行い、もし無効になっていたらインデックスを再作成
				if (!getDispRslt1L().containsIndex(_idxKey)) {
					_idxKey = getDispRslt1L().createIndex(DispRslt1R.$itm_cd, DispRslt1R.$itm_sub1, DispRslt1R.$itm_sub2, DispRslt1R.$itm_sub3, DispRslt1R.$loc_cd, DispRslt1R.$sd_adjst_dtl_typ);
				}
				DispRslt1R rslt1R = getDispRslt1L().getFirst(_idxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd(), MSC_SD_ADJST_DTL_TYP.DMND.value());
				if(!isNull(rslt1R) && MAC_RTN_STS_TYP.isOK(rslt1R.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public boolean isChanged(MCTable<?> tbl) {
		boolean result = super.isChanged(tbl);
		if (result && (tbl == DispRslt1Table || tbl == Rslt3Table)) {
			MCList data = tbl.getList()
					.subList(o -> !MAC_RTN_STS_TYP.isOK(o.getString("rtn_sts_typ")));
			return !data.isStatusNone();
		}
		return result;
	}

	// グラフ
	@SuppressWarnings("deprecation")
	@Override
	public boolean beforeOpen() {
		boolean ret = super.beforeOpen();

		if(ret == true) {
			// 以下の行はJFXPaneを使う場合必須
			// グラフを別画面で表示する場合も必須。
			if(_fxPanel == null) {
				_fxPanel = new JFXPanel();
			}
			Platform.setImplicitExit(false);
		}

//		Cnd_threshold.setValue(new MCNumber(100.0));
		initGraphControl();

		return true;
	}

	/**
	 * JavaFXパネルを生成
	 */
	public void initGraphControl() {
		// MCListからグラフを生成しパネルに埋め込む
		MCList<Rslt1R> list = _rslt1L;

		_innerGraph = new MCFXGraph();

		_innerGraph.setUseThresholdLine(false);
		_innerGraph.setUseThresholdRect(false);

		List<String> labelColumnNameList = Arrays.asList(_labelColumnList);

		_innerGraph.setGraphDelegate(this);
		_innerGraph.setSameAxis(true);

		_innerGraph.initInnerGraphControl(
				Rslt2Panel // 埋め込むためのパネル
				,_graphTitle // グラフタイトル
				,Arrays.asList(_graphTypeList) // グラフタイプ
				,Arrays.asList(_graphColorList) // グラフカラー
				,list // MCListを指定
				,labelColumnNameList // グラフのラベルになるカラム名を指定
				,_labelColumnName // グラフのラベルカラム名
				,Arrays.asList(_valueColumns) // グラフのデータになるカラムを指定
				,Arrays.asList(_valueColumnsName) //  グラフの数値カラム名
				,_valueLabel // グラフのY軸の見出しラベル。
		);
	}

	/**
	 * [Rslt2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt2(MSBAP_SdAdjst p) {
		// ブロック関連の初期化
		p.Rslt2Panel.add(p.Rslt2ScrollPane);
		p.Rslt2Panel.setLastBeans(p.Rslt2Table);
		p.Rslt2ScrollPane.setViewportView(p.Rslt2Table);
		p.Rslt2Table.setList(p.getRslt2L());
		p.Rslt2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化

		p.Rslt2ScrollPane.setVisible(false);
		p.Rslt2Table.setVisible(false);
	}

	/**
	 * Rslt2Tableを初期化します。
	 */
	protected void createGraphTable(){
		if(Rslt2Table == null){
			Rslt2Table = beansFactory.createTable2("Rslt2.table");
		}
	}

	// 閉じる前にJFXPanelを削除
	public boolean beforeClose() {
		if(_fxPanel != null) {
			Rslt2Panel.remove(_fxPanel);
			_fxPanel = null;
		}
		if(_outerGraph != null) {
			_outerGraph.hideOuterGraph();
		}

		return true;
	}

	// delegateで外部グラフが閉じるときに呼ばれる。
	@Override
	public void doCloseOuterGraph(MCFXGraphCore graph) {
		_outerGraph = null;
	}

	/**
	 * スプリットペインの高さを調整
	 */
	public void setDividerLocation(String panelID, int n, boolean max) {
		for (MCSplitPane sp : MCBeansUtil.getAllComponents(MCSplitPane.class, this)) {
			Component up = sp.getTopComponent();
			Component bottom = sp.getBottomComponent();
			if (up instanceof MCPanel) {
				Component up1 = ((MCPanel) up).getComponents()[0];
				String str1 = up1.getName();
				if (str1.equals(panelID)) {
					if(max) {
						sp.setDividerLocation(sp.getMaximumDividerLocation());
					}
					else {
						sp.setDividerLocation(n);
					}
					sp.validate();
					break;
				}
			}
			if (bottom instanceof MCPanel) {
				Component bottom1 = ((MCPanel) bottom).getComponents()[0];
				String str1 = bottom1.getName();
				if (str1.equals(panelID)) {
					if(max) {
						sp.setDividerLocation(sp.getMaximumDividerLocation());
					}
					else {
						sp.setDividerLocation(n);
					}
					sp.validate();
					break;
				}
			}
		}
	}
	/**
	 * 休日(土・日)のヘッダ色設定を行う
	 */
	protected void setTblHdr() {
		MCDate dt = getCndR().dmnd_dt_fr().addDay(-1);
		for (MCColumnConfig col : getQtys()) {
			if (isSame(dt.getDayOfWeek(), MCDate.SAT)) {
				col.setHeaderBackground(_sat_color);
			}
			else if (isSame(dt.getDayOfWeek(), MCDate.SUN)) {
				col.setHeaderBackground(_sun_color);
			}
			else {
				col.setHeaderBackground(null);
			}
			dt = dt.addDay(1);
		}
	}

	/**
	 * ヘッダ色のクリアを行う
	 */
	protected void setTblHdrClear() {
		for (MCColumnConfig col : getQtys()) {
			col.setHeaderBackground(null);
		}
	}

	protected void clearSrchStatus() {
		if (Cnd_ope_REF.isSelected()) {
			getCndR().sim_mrp_no(null);
			getCndR().sim_auto_ref_flg(false);
			getCndR().rqst_inc_flg(false);
			getCndR().minus_stk_flg(false);
			getCndR().non_spply_ent_flg(false);
			getCndR().buf_qty_flg(false);
			getCndR().dmndDtl(false);
			getCndR().sim(false);
			getCndR().oldSpply(false);
			getCndR().selectDlyDisp(false);
		}
		else if (Cnd_ope_MON.isSelected()) {
			getCndR().sim_auto_ref_flg(false);
			getCndR().rqst_inc_flg(false);
			getCndR().non_spply_ent_flg(false);
			getCndR().selectDlyDisp(false);
		}
	}

}