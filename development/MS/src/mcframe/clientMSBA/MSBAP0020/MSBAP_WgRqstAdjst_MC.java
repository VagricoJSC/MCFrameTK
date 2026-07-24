package mcframe.clientMSBA.MSBAP0020;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5040.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBAP_WgRqstAdjst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBAP_WgRqstAdjst_MC extends MSBAP_WgRqstAdjst_MC_A implements IfListRegPanel, IfVHMapperPanel, MCFXGraphDelegate {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// dividerの位置を格納する変数
	int saveLoc1 = 0;
	int saveLoc2 = 0;
	int saveLoc3 = 0;

	// 回答キャッシュ
	Map<String, MCList<Rslt2R>> _rslt2L = new HashMap<String, MCList<Rslt2R>>();

	// 依頼・回答キャッシュ(検索値保持用)
	MCList<Rslt1R> _rslt1L = MCList.create(Rslt1R.class);
	Map<List<Comparable<?>>, MCList<Rslt2R>> _giRslt2BakL = new HashMap<List<Comparable<?>>, MCList<Rslt2R>>();
	Map<List<Comparable<?>>, MCList<Rslt2R>> _grRslt2BakL = new HashMap<List<Comparable<?>>, MCList<Rslt2R>>();

	// 変更後の回答キャッシュ
	Map<List<Comparable<?>>, MCList<Rslt2R>> _rslt2BakL = new HashMap<List<Comparable<?>>, MCList<Rslt2R>>();

	// 在庫推移検索結果のキャッシュ
	MCList<StkChgRsltR> _stkChgRsltBakL = MCList.create(StkChgRsltR.class);

	// 納入指示受領キャッシュ
	MCList<DlvInstPanelR> _dlvInstL = MCList.create(DlvInstPanelR.class);

	protected MAUCP_VHMapper<StkChgRsltR, DispStkChgRsltR> _vhM = new MAUCP_VHMapper<>();

	protected Map<MCNumber, MCList<DispStkChgRsltR>> _grpNoHMap = new HashMap<>();
	protected Map<MCNumber, MCList<StkChgRsltR>> _grpNoVMap = new HashMap<>();
	protected Map<String, MCDate> _colMap = new HashMap<>();
	protected Map<String, Integer> _dateMap = new HashMap<>();
	protected Map<MCDate, MCColumnConfig> _dateMap2 = new HashMap<>();

	/** 明細のデータ項目 */
	protected MCColumnConfig[] _qtys = null;
	/** 日付部分の項目名 */
	protected String[] _qtyCols = null;

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
	MCList<StkChgRsltR> _StkChgRsltL = MCList.create(StkChgRsltR.class);

	/** 最大の表示期間 */
	protected final int _max_day_duration = 1098;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_WgRqstAdjst_MC() {
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
	public MSBAP_WgRqstAdjst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MSBCP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0150(MCEventInfo info) {
		Rslt1R rslt1R = Rslt1Table.getSelectedMCRow();

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0150");
		mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg dmndRecStsSrch = (mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP0150.CndR to = mcframe.clientMSBC.MSBCP0150.CndR.create();
		to.ope(dmndRecStsSrch.Cnd_ope_INT.getActionCommand());
		if(isNull(rslt1R)) {
			to.wg_cd(getCndR().rqst_to_wg_cd());
		}
		else {
			to.wg_cd(rslt1R.rqst_to_wg_cd());
		}
		to.sim_mrp_no(getStkChgCndR().sim_mrp_no());
		to.sim_mrp_typ(MSC_SIM_MRP_TYP.PRMS.value());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Rslt1Btn]のボタン[open_DTL]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_open_DTL(MCEventInfo info) {
		Rslt1R rslt1R = Rslt1Table.getSelectedMCRow();
		if(isNull(rslt1R)) {
			return;
		}

		// 作成元が受注の場合
		if(MSC_WG_RQST_SRC_TYP.isSLO(rslt1R.wg_rqst_src_typ()) || MSC_WG_RQST_SRC_TYP.isSHIP(rslt1R.wg_rqst_src_typ())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1220");
			mcframe.clientMSBB.MSBBP1220.MSBBP_SloSrch sloSrch = (mcframe.clientMSBB.MSBBP1220.MSBBP_SloSrch) aso.getPanel();
			mcframe.clientMSBB.MSBBP1220.CndR to = mcframe.clientMSBB.MSBBP1220.CndR.create();
			to.slo_d_no(rslt1R.slo_d_no());
			to.sls_ship_flg(true);
			to.sls_compl_flg(true);
			to.disp_unit(sloSrch.Cnd_disp_unit_DTL.getActionCommand());
			aso.putCnd(to);
			aso.putSearchAction();
			aso.runValueInit();
			aso.show();
		}
		// 作成元がオーダ登録の場合
		else if (MSC_WG_RQST_SRC_TYP.isORD(rslt1R.wg_rqst_src_typ())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
			mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch ordSrch = (mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) aso.getPanel();
			mcframe.clientMSBC.MSBCP0050.CndR to = mcframe.clientMSBC.MSBCP0050.CndR.create();
			to.itm_ord_no(rslt1R.wg_rqst_src_no());
			to.ope(ordSrch.Cnd_ope_REF.getActionCommand());
			to.purc_flg(true);
			to.outsrc_flg(true);
			to.xfr_flg(true);
			to.wg_xfr_flg(true);
			to.true_not_fix_flg(true);
			to.false_not_fix_flg(true);
			aso.putCnd(to);
			aso.putSearchAction();
			aso.runValueInit();
			aso.show();
		}
	}
	/**
	 * Panel[StkChgCnd]のボタン[openGraph]の押下時の処理
	 */
	@Override
	public void doStkChgCnd_openGraph(MCEventInfo info) {
		if(_outerGraph == null) {
			_outerGraph = new MCFXGraph();
			// 外部グラフを使う場合はgraphDelegate必須
			_outerGraph.setGraphDelegate(this);
			_outerGraph.setSameAxis(true);

			MCList<StkChgRsltR> list = _StkChgRsltL;

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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBAL0020_Upd01();
	}
	/**
	 * Panel[Rslt1Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_select_all(MCEventInfo info) {
		doSelectAll(Rslt1Table);
	}
	/**
	 * Panel[Rslt1Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_deselect_all(MCEventInfo info) {
		doDeselectAll(Rslt1Table);
	}
	/**
	 * [MS_MSBAL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0020_Srch01Caller<P extends MSBAP_WgRqstAdjst, B extends MS_MSBAL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void show() {
			super.show();

			_rslt1L = bridge.down0().clone();
			_dlvInstL = bridge.down2();
			setHiddenList(bridge.down1());
			setDefHiddenList(bridge.down0());
		}
	}

	/**
	 * [MS_MSBAL0020_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0020_Srch02Caller<P extends MSBAP_WgRqstAdjst, B extends MS_MSBAL0020_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0020_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();

			panel.setDividerLocation("Rslt1Panel", saveLoc1, true);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void show() {
			super.show();

			_rslt1L = bridge.down0().clone();
			_dlvInstL = bridge.down2();
		}
	}

	/**
	 * [MS_MSBAL0020_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0020_Srch03Caller<P extends MSBAP_WgRqstAdjst, B extends MS_MSBAL0020_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0020_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(StkChgCnd_itm_cd));
			msgList.addAll(panel.checkReq(StkChgCnd_gi_loc_cd));
			msgList.addAll(panel.checkReq(StkChgCnd_dt_fr));
			msgList.addAll(panel.checkReq(StkChgCnd_dt_to));

			msgList.addAll(checkBeforeAfter(StkChgCnd_dt_fr, StkChgCnd_dt_to));

			// 検索する期間が範囲内であること
			MCDate endDt = getStkChgCndR().dt_to();
			MCDate stDt = getStkChgCndR().dt_fr();
			if (!isNull(stDt) && !isNull(endDt)
					&& (endDt.diffDay(stDt) >= _max_day_duration)) {
				MCMessage msg = new MCMessage(getStkChgCndR(), StkChgCndR.$dt_fr, MSUCP0101);
				msgList.add(msg);
			}
		}

		@Override
		protected void clear() {
			super.clear();

			getDispStkChgRsltL().clear();
			clearCacheVH();
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			MCList<IoActR> ioSchdL = MCList.create(IoActR.class);
			getRslt1L().subList(r -> 
					!MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())
					 && isSame(r.itm_cd(), getStkChgCndR().itm_cd())
					 && isSame(r.itm_sub1(), getStkChgCndR().itm_sub1())
					 && isSame(r.itm_sub2(), getStkChgCndR().itm_sub2())
					 && isSame(r.itm_sub3(), getStkChgCndR().itm_sub3())
			).forEach(r -> {
				ioSchdL.add().wg_rqst_no(r.wg_rqst_no());
			});
			bridge.up1().setAll(ioSchdL);
		}

		@Override
		protected void show() {
			super.show();

			showSub();
			showVH();
			// 在庫推移検索結果をキャッシュ
			_stkChgRsltBakL.setAll(bridge.down0());

			// ＷＧ間依頼回答に対応する実績数を設定する
			for (IoActR r : bridge.down1()) {
				MCList<Rslt2R> r2L = _rslt2L.get(r.wg_rqst_no());
				if (!isNull(r2L)) {
					Rslt2R r2R = r2L.getFirst(Rslt2R.$wg_rqst_prms_no, r.wg_rqst_prms_no());
					if (!isNull(r2R)) {
						r2R.gi_act_qty(r.gi_act_qty());
						r2R.gr_act_qty(r.gr_act_qty());
					}
				}
			}
			calcStk();
		}

		protected void showSub() {
			// 検索時点の開始日終了日の保持
			getCopyStkChgCndR().dt_fr(getStkChgCndR().dt_fr());
			getCopyStkChgCndR().dt_to(getStkChgCndR().dt_to());
		}

		protected void showVH() {
			// グループを識別する番号を設定する
			showVHEditVList();

			// 可変カラムのラベル名を設定する
			showVHInitColInfo();

			// 縦横変換処理を実行する
			_vhM.convertVH(getStkChgRsltL(), _vhM.getCachedHAllL());

			// 縦横変換した後の横データを加工する
			showVHEditHList();

			// 横データを表示する
			_vhM.doTableDispChange();
		}

		protected void showVHEditVList() {
			MCNumber grpPegNo = MCNumber.ZERO;
			for (MCList<StkChgRsltR> l : getStkChgRsltL().groupList(getStkChgRsltKeys())) {
				grpPegNo = grpPegNo.add(1);
				for (StkChgRsltR r : l) {
					r.grp_peg_no(grpPegNo);
				}
				_grpNoVMap.put(grpPegNo, l);
			}
		}

		protected void showVHInitColInfo() {
			// 可変カラムを識別するための値（縦リストの「VH_KEY」が「ELM」の項目の値）と可変カラムのラベル名を設定する
			MCList<MCRow> dtList = MCList.create(MCRow.class);
			for (int i = 0; i <= _max_day_duration; i++) {
				MCDate dt = getCopyStkChgCndR().dt_fr().addDay(i-1);
				if (dt.gt(getCopyStkChgCndR().dt_to())) {
					break;
				}
				MCRow o = dtList.createRow();
				// 可変カラムを識別するための値を設定する
				o.setDateNE(StkChgRsltR.$schd_dt, dt);
				// 可変カラムのラベル名を設定する
				if(i == 0) {
					o.setStringNE(MAUCP_VHMapper.ELM_LABEL, getDispString("label_term").concat(toY2MDString(dt)));
				}
				else {
					o.setStringNE(MAUCP_VHMapper.ELM_LABEL, toY2MDString(dt));
				}
				dtList.add(o);
			}
			_vhM.initColInfo(dtList);

			MCDate fr_dt = getStkChgCndR().dt_fr();
			long pt = getStkChgCndR().dt_to().diffDay(fr_dt);

			for (int i = 0; i < pt; i++) {
				MCDate tmpDate = fr_dt.addDay(i-1);
				_colMap.put(getQtys()[i].getBaseRowColumnName(), tmpDate);
				_dateMap.put(tmpDate.toString(), i);
				_dateMap2.put(tmpDate, getQtys()[i]);
			}
		}

		protected void showVHEditHList() {
			MCList<DispStkChgRsltR> hList = _vhM.getCachedHAllL();
			for (DispStkChgRsltR r : hList) {
				if(MSC_SD_ADJST_DTL_TYP.isGI(r.sd_adjst_dtl_typ())) {
					r.disp_itm(r.itm_nm());
					r.disp_loc(r.loc_nm());
					r.disp_wg(r.wg_nm());
				}
				else if(MSC_SD_ADJST_DTL_TYP.isGR(r.sd_adjst_dtl_typ())) {
					r.disp_itm(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), panel));
					r.disp_loc(r.loc_cd());
					r.disp_wg(r.wg_cd());
				}
			}

			crtGrpNoHCache(hList);
		}

		protected void crtGrpNoHCache(MCList<DispStkChgRsltR> hList) {
			MCSortPolicy sp = crtSortVH();
			for (MCList<DispStkChgRsltR> l : hList.groupList(DispStkChgRsltR.$grp_peg_no)) {
				l.sort(sp);
				_grpNoHMap.put(l.get(0).grp_peg_no(), l);
			}
		}

		@Override
		protected void adjustList() {
			super.adjustList();

			DispStkChgRsltTable.adjustWidth();
		}

		@Override
		protected void setMode() {
			super.setMode();
			_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
		}
	}

	/**
	 * [MS_MSBAL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0020_Upd01Caller<P extends MSBAP_WgRqstAdjst, B extends MS_MSBAL0020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBAL0020_Upd01Caller(P p, B b) {
			super(p, b);
		}

		// チェック対象のリスト
		protected MCList<Rslt1R> _Rslt1LForCall = MCList.create(Rslt1R.class);
		protected MCList<Rslt2R> _Rslt2LForCall = MCList.create(Rslt2R.class);

		@Override
		protected void initCaller() {
			super.initCaller();

			// 裏リストを差し替える
			setHiddenList();

			_Rslt1LForCall = getRslt1L().subList(Rslt1R.$check, true);
			for(Rslt1R r : _Rslt1LForCall) {
				for(Rslt2R r2 : _rslt2L.get(r.wg_rqst_no())) {
					if(!isStatusNone(r2)) {
						_Rslt2LForCall.add(r2);
					}
				}
			}

			MAUCP_DateUtil.setYmdHm(_Rslt2LForCall, Rslt2R.$gr_schd_dt, Rslt2R.$gr_schd_hm);
			MAUCP_DateUtil.setYmdHm(_Rslt2LForCall, Rslt2R.$gi_schd_dt, Rslt2R.$gi_schd_hm);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 下段は正しくGUIInedexが付与されていないため、上段のみチェック
			checkReqSub(msgList, getRslt1L());
		}



		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			bridge.up0().setAll(_Rslt1LForCall);
			bridge.up1().setAll(_Rslt2LForCall);
		}

		@Override
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = super.getUpBlocks();
			// 上り電文のブロックを置き換え
			result.set(1, _Rslt2LForCall);
			return result;
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(1, _Rslt2LForCall);
			return result;
		}

		@Override
		protected void show() {
			super.show();

			setRtnMsg();
//			setHiddenList(bridge.down1());
			Rslt1R row = Rslt1Table.getSelectedMCRow();
			showPrms(row);
			setBtnMode();
		}
		protected void setRtnMsg() {
			String[] downCols = {Rslt1R.$wg_rqst_no};
			String[] causeRowCols = {Rslt2R.$wg_rqst_no};
			Rslt1_rts_msg_p_PPanel.setMsgByKeyCols(_Rslt1LForCall, downCols,  getParamMessage(), causeRowCols);
		}
		protected void setOrgPrmsQty() {
			// 変更前回答数に回答数を反映（検索前に在庫推移を算出する際に必要）
			_rslt2L.values().forEach(list -> {
				 list.forEach(r -> r.org_prms_base_unit_qty(r.fix_flg() ? r.prms_base_unit_qty() : null));
			});
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if(Cnd_ope_UPD.isSelected()) {
			callMS_MSBAL0020_Srch01();
		}
		else if(Cnd_ope_REF.isSelected()) {
			callMS_MSBAL0020_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if(Cnd_ope_UPD.isSelected()) {
			createMS_MSBAL0020_Srch01().execDL();
		}
		else if(Cnd_ope_REF.isSelected()) {
			createMS_MSBAL0020_Srch02().execDL();
		}
	}
	/**
	 * Panel[StkChgCnd]のボタン[stk_chg_srch]の押下時の処理
	 */
	@Override
	public void doStkChgCnd_stk_chg_srch(MCEventInfo info) {
		callMS_MSBAL0020_Srch03();
	}
	/**
	 * Panel[StkChgCnd]のボタン[stk_chg_ref]の押下時の処理
	 */
	@Override
	public void doStkChgCnd_stk_chg_ref(MCEventInfo info) {
		if(!getDispStkChgRsltL().isEmpty()) {
			try {
				MCBeansUtil.setMouseCursorWait();
				calcStk();
			}
			finally {
				MCBeansUtil.setMouseCursorDefault();
			}
		}
	}
	/**
	 * Panel[Rslt2Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		Rslt2R delR = deleteRow(Rslt2Table);
		if(!isNull(delR)) {
			MCIndexKey idxkey = getRslt1L().createIndex(Rslt1R.$wg_rqst_no);
			Rslt1R rslt1R = getRslt1L().getFirst(idxkey, delR.wg_rqst_no());
			if(!isNull(rslt1R)) {
				rslt1R.check(true);
				calcNotCmplQty(rslt1R);

				int count = 0;
				Rslt2R bakR = Rslt2R.create();
				for(Rslt2R r : getRslt2L()) {
					if(!isSame(MCRow.DELETE, r.getStatus())) {
						count++;
						bakR = r;
					}
				}
				Rslt2R statusDelR = Rslt2R.create();
				for(Rslt2R r : getRslt2L()) {
					if(isSame(MCRow.DELETE, r.getStatus())) {
						statusDelR = r;
					}
				}
				if(count > 1) {
					rslt1R.prms_div_flg(true);
					copyRslt2InfoToRslt1(bakR.getGUIIndex());
				}
				else if(count == 0) {
					rslt1R.prms_div_flg(false);
					copyRslt2InfoToRslt1(statusDelR.getGUIIndex());
				}
				else {
					rslt1R.prms_div_flg(false);
					if(count == 1 && !isNull(bakR)) {
						copyRslt2InfoToRslt1(bakR.getGUIIndex());
					}
				}
				refreshPrmsCache(rslt1R);
			}
		}
	}

	protected void refreshPrmsCache(Rslt1R rslt1R) {
		int r2DeleteRowFocus = Rslt2Table.getMCSelectedRow();
		_rslt2L.put(rslt1R.wg_rqst_no(), getRslt2L().clone());
		getRslt2L().setAll(_rslt2L.get(rslt1R.wg_rqst_no()));
		Rslt2Table.selectRow(r2DeleteRowFocus);
	}
	/**
	 * Panel[Rslt2Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		doRslt2_rcopy_sub();
	}

	/**
	 * 回答一覧の行コピーボタン押下時処理
	 * @return
	 */
	protected Rslt2R doRslt2_rcopy_sub() {

		Rslt2R cpRow = doRcopyCommon(Rslt2Table);
		if (isNull(cpRow)) {
			return null;
		}
		cpRow.wg_rqst_prms_no(null);
		cpRow.wg_rqst_prms_upd_cntr(null);
		cpRow.last_fix_flg(false);
		cpRow.org_prms_base_unit_qty(null);

		copyRslt2InfoToRslt1(cpRow.getGUIIndex());

		MCIndexKey idxkey = getRslt1L().createIndex(Rslt1R.$wg_rqst_no);
		Rslt1R rslt1R = getRslt1L().getFirst(idxkey, cpRow.wg_rqst_no());
		if(!isNull(rslt1R)) {
			setValueEx(columnRslt1_check, rslt1R.getGUIIndex(), true);
			setValueEx(columnRslt1_prms_div_flg, rslt1R.getGUIIndex(), true);
			calcNotCmplQty(rslt1R);
		}

		return cpRow;
	}

	/**
	 * 行コピー共通処理<BR>
	 * @param <R>
	 * @param table 行コピー対象テーブル
	 * @return
	 */
	protected <R extends Rslt2R> R doRcopyCommon(MCTable<R> table) {

		if (table.getSelectedMCRow() == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		R cpRow = copyRow(table);
		if (isNull(cpRow)) {
			return null;
		}
		MCList<Rslt2R> hiddenList = _rslt2L.get(cpRow.wg_rqst_no());
		hiddenList.add(cpRow);
		_rslt2L.put(cpRow.wg_rqst_no(), hiddenList);

		return cpRow;
	}

	@Override
	public MCTable getListRegTable() {
		return Rslt1Table;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		DispStkChgRslt_qty00_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty01_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty02_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty03_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty04_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty05_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty06_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty07_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty08_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty09_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty10_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty11_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty12_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty13_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty14_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty15_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty16_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty17_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty18_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty19_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty20_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty21_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty22_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty23_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty24_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty25_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty26_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty27_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty28_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty29_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty30_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty31_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty32_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty33_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty34_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty35_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty36_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty37_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty38_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty39_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty40_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty41_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty42_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty43_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty44_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty45_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty46_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty47_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty48_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty49_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty50_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty51_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty52_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty53_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty54_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty55_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty56_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty57_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty58_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty59_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty60_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty61_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty62_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty63_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty64_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty65_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty66_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty67_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty68_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty69_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty70_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty71_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty72_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty73_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty74_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty75_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty76_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty77_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty78_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty79_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty80_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty81_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty82_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty83_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty84_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty85_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty86_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty87_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty88_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty89_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty90_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty91_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty92_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty93_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty94_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty95_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty96_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty97_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty98_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty99_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty100_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty101_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty102_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty103_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty104_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty105_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty106_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty107_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty108_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty109_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty110_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty111_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty112_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty113_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty114_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty115_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty116_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty117_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty118_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty119_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty120_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty121_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty122_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty123_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty124_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty125_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty126_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty127_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty128_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty129_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty130_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty131_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty132_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty133_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty134_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty135_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty136_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty137_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty138_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty139_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty140_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty141_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty142_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty143_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty144_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty145_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty146_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty147_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty148_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty149_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty150_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty151_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty152_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty153_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty154_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty155_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty156_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty157_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty158_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty159_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty160_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty161_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty162_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty163_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty164_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty165_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty166_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty167_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty168_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty169_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty170_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty171_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty172_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty173_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty174_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty175_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty176_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty177_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty178_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty179_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty180_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty181_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty182_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty183_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty184_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty185_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty186_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty187_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty188_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty189_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty190_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty191_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty192_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty193_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty194_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty195_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty196_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty197_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty198_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty199_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty200_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty201_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty202_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty203_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty204_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty205_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty206_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty207_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty208_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty209_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty210_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty211_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty212_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty213_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty214_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty215_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty216_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty217_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty218_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty219_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty220_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty221_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty222_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty223_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty224_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty225_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty226_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty227_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty228_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty229_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty230_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty231_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty232_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty233_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty234_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty235_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty236_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty237_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty238_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty239_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty240_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty241_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty242_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty243_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty244_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty245_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty246_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty247_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty248_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty249_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty250_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty251_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty252_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty253_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty254_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty255_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty256_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty257_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty258_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty259_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty260_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty261_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty262_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty263_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty264_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty265_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty266_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty267_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty268_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty269_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty270_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty271_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty272_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty273_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty274_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty275_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty276_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty277_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty278_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty279_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty280_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty281_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty282_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty283_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty284_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty285_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty286_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty287_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty288_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty289_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty290_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty291_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty292_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty293_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty294_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty295_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty296_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty297_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty298_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty299_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty300_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty301_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty302_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty303_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty304_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty305_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty306_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty307_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty308_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty309_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty310_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty311_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty312_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty313_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty314_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty315_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty316_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty317_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty318_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty319_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty320_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty321_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty322_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty323_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty324_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty325_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty326_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty327_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty328_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty329_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty330_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty331_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty332_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty333_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty334_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty335_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty336_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty337_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty338_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty339_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty340_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty341_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty342_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty343_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty344_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty345_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty346_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty347_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty348_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty349_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty350_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty351_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty352_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty353_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty354_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty355_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty356_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty357_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty358_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty359_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty360_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty361_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty362_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty363_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty364_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty365_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty366_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty367_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty368_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty369_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty370_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty371_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty372_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty373_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty374_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty375_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty376_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty377_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty378_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty379_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty380_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty381_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty382_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty383_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty384_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty385_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty386_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty387_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty388_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty389_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty390_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty391_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty392_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty393_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty394_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty395_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty396_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty397_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty398_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty399_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty400_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty401_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty402_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty403_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty404_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty405_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty406_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty407_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty408_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty409_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty410_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty411_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty412_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty413_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty414_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty415_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty416_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty417_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty418_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty419_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty420_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty421_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty422_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty423_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty424_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty425_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty426_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty427_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty428_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty429_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty430_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty431_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty432_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty433_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty434_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty435_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty436_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty437_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty438_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty439_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty440_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty441_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty442_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty443_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty444_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty445_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty446_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty447_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty448_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty449_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty450_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty451_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty452_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty453_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty454_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty455_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty456_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty457_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty458_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty459_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty460_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty461_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty462_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty463_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty464_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty465_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty466_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty467_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty468_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty469_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty470_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty471_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty472_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty473_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty474_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty475_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty476_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty477_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty478_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty479_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty480_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty481_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty482_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty483_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty484_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty485_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty486_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty487_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty488_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty489_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty490_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty491_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty492_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty493_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty494_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty495_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty496_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty497_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty498_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty499_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty500_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty501_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty502_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty503_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty504_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty505_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty506_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty507_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty508_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty509_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty510_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty511_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty512_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty513_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty514_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty515_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty516_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty517_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty518_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty519_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty520_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty521_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty522_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty523_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty524_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty525_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty526_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty527_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty528_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty529_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty530_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty531_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty532_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty533_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty534_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty535_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty536_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty537_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty538_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty539_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty540_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty541_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty542_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty543_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty544_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty545_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty546_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty547_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty548_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty549_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty550_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty551_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty552_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty553_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty554_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty555_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty556_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty557_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty558_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty559_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty560_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty561_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty562_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty563_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty564_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty565_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty566_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty567_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty568_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty569_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty570_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty571_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty572_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty573_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty574_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty575_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty576_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty577_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty578_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty579_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty580_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty581_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty582_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty583_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty584_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty585_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty586_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty587_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty588_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty589_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty590_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty591_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty592_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty593_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty594_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty595_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty596_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty597_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty598_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty599_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty600_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty601_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty602_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty603_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty604_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty605_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty606_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty607_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty608_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty609_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty610_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty611_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty612_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty613_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty614_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty615_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty616_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty617_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty618_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty619_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty620_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty621_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty622_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty623_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty624_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty625_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty626_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty627_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty628_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty629_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty630_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty631_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty632_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty633_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty634_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty635_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty636_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty637_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty638_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty639_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty640_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty641_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty642_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty643_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty644_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty645_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty646_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty647_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty648_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty649_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty650_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty651_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty652_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty653_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty654_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty655_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty656_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty657_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty658_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty659_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty660_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty661_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty662_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty663_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty664_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty665_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty666_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty667_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty668_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty669_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty670_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty671_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty672_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty673_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty674_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty675_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty676_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty677_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty678_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty679_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty680_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty681_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty682_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty683_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty684_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty685_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty686_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty687_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty688_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty689_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty690_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty691_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty692_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty693_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty694_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty695_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty696_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty697_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty698_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty699_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty700_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty701_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty702_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty703_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty704_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty705_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty706_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty707_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty708_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty709_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty710_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty711_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty712_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty713_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty714_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty715_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty716_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty717_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty718_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty719_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty720_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty721_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty722_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty723_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty724_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty725_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty726_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty727_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty728_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty729_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty730_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty731_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty732_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty733_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty734_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty735_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty736_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty737_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty738_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty739_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty740_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty741_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty742_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty743_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty744_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty745_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty746_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty747_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty748_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty749_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty750_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty751_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty752_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty753_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty754_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty755_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty756_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty757_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty758_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty759_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty760_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty761_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty762_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty763_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty764_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty765_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty766_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty767_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty768_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty769_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty770_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty771_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty772_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty773_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty774_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty775_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty776_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty777_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty778_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty779_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty780_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty781_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty782_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty783_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty784_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty785_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty786_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty787_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty788_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty789_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty790_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty791_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty792_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty793_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty794_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty795_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty796_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty797_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty798_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty799_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty800_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty801_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty802_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty803_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty804_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty805_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty806_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty807_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty808_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty809_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty810_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty811_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty812_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty813_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty814_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty815_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty816_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty817_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty818_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty819_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty820_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty821_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty822_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty823_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty824_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty825_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty826_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty827_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty828_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty829_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty830_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty831_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty832_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty833_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty834_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty835_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty836_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty837_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty838_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty839_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty840_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty841_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty842_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty843_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty844_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty845_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty846_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty847_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty848_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty849_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty850_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty851_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty852_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty853_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty854_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty855_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty856_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty857_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty858_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty859_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty860_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty861_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty862_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty863_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty864_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty865_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty866_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty867_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty868_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty869_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty870_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty871_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty872_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty873_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty874_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty875_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty876_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty877_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty878_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty879_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty880_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty881_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty882_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty883_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty884_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty885_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty886_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty887_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty888_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty889_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty890_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty891_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty892_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty893_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty894_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty895_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty896_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty897_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty898_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty899_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty900_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty901_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty902_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty903_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty904_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty905_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty906_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty907_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty908_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty909_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty910_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty911_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty912_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty913_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty914_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty915_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty916_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty917_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty918_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty919_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty920_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty921_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty922_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty923_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty924_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty925_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty926_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty927_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty928_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty929_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty930_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty931_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty932_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty933_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty934_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty935_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty936_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty937_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty938_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty939_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty940_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty941_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty942_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty943_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty944_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty945_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty946_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty947_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty948_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty949_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty950_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty951_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty952_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty953_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty954_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty955_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty956_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty957_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty958_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty959_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty960_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty961_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty962_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty963_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty964_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty965_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty966_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty967_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty968_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty969_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty970_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty971_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty972_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty973_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty974_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty975_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty976_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty977_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty978_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty979_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty980_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty981_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty982_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty983_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty984_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty985_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty986_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty987_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty988_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty989_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty990_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty991_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty992_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty993_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty994_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty995_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty996_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty997_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty998_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty999_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1000_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1001_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1002_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1003_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1004_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1005_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1006_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1007_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1008_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1009_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1010_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1011_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1012_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1013_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1014_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1015_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1016_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1017_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1018_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1019_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1020_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1021_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1022_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1023_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1024_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1025_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1026_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1027_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1028_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1029_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1030_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1031_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1032_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1033_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1034_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1035_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1036_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1037_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1038_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1039_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1040_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1041_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1042_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1043_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1044_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1045_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1046_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1047_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1048_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1049_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1050_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1051_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1052_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1053_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1054_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1055_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1056_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1057_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1058_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1059_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1060_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1061_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1062_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1063_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1064_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1065_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1066_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1067_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1068_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1069_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1070_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1071_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1072_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1073_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1074_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1075_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1076_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1077_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1078_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1079_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1080_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1081_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1082_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1083_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1084_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1085_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1086_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1087_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1088_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1089_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1090_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1091_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1092_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1093_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1094_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1095_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1096_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1097_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1098_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);
		DispStkChgRslt_qty1099_p_PPanel.setRelateBeans(columnDispStkChgRslt_unit_cd, columnDispStkChgRslt_dec_place);

		Rslt1_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt1_trd_unit_cd,
				columnRslt1_trd_unit_dec_place);
		Rslt1_prms_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt1_itm_cd,
				columnRslt1_itm_sub1, columnRslt1_itm_sub2, columnRslt1_itm_sub3,
				columnRslt1_prms_trd_unit_cd, columnRslt1_prms_trd_unit_dec_place,
				columnRslt1_prms_trd_unit_rnd_typ, columnRslt1_prms_trd_unit_conv_base_qty,
				columnRslt1_prms_trd_unit_conv_qty, columnRslt1_prms_base_unit_cd);

		Rslt1_base_unit_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd,
				columnRslt1_base_unit_dec_place, columnRslt1_base_unit_rnd_typ,
				columnRslt1_trd_unit_qty, columnRslt1_trd_unit_conv_base_qty,
				columnRslt1_trd_unit_conv_qty);
		Rslt1_not_cmpl_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd,
				columnRslt1_base_unit_dec_place);
		Rslt1_prms_base_unit_qty_p_PPanel.setRelateBeans(columnRslt1_prms_base_unit_cd,
				columnRslt1_prms_base_unit_dec_place, columnRslt1_prms_base_unit_rnd_typ,
				columnRslt1_prms_trd_unit_qty, columnRslt1_prms_trd_unit_conv_base_qty,
				columnRslt1_prms_trd_unit_conv_qty);
		Rslt2_prms_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt2_itm_cd,
				columnRslt2_itm_sub1, columnRslt2_itm_sub2, columnRslt2_itm_sub3,
				columnRslt2_prms_trd_unit_cd, columnRslt2_prms_trd_unit_dec_place,
				columnRslt2_prms_trd_unit_rnd_typ, columnRslt2_prms_trd_unit_conv_base_qty,
				columnRslt2_prms_trd_unit_conv_qty, columnRslt2_prms_base_unit_cd);

		Rslt2_prms_base_unit_qty_p_PPanel.setRelateBeans(columnRslt2_prms_base_unit_cd,
				columnRslt2_prms_base_unit_dec_place, columnRslt2_prms_base_unit_rnd_typ,
				columnRslt2_prms_trd_unit_qty, columnRslt2_prms_trd_unit_conv_base_qty,
				columnRslt2_prms_trd_unit_conv_qty);
		DlvInstPanel_trd_unit_qty_p_PPanel.setRelateBeans(
				columnDlvInstPanel_base_unit_cd, columnDlvInstPanel_base_unit_dec_place);
		DlvInstPanel_base_unit_qty_p_PPanel.setRelateBeans(
				columnDlvInstPanel_base_unit_cd, columnDlvInstPanel_base_unit_dec_place,
				columnDlvInstPanel_base_unit_rnd_typ, columnDlvInstPanel_trd_unit_qty,
				columnDlvInstPanel_trd_unit_conv_base_qty,
				columnDlvInstPanel_trd_unit_conv_qty);
		Rslt1_gi_str_ln_p_PPanel.setRelateBeans(columnRslt1_gi_loc_cd,
				columnRslt1_gi_str_ln_tgt_flg);
		Rslt2_gi_str_ln_p_PPanel.setRelateBeans(columnRslt2_gi_loc_cd,
				columnRslt2_gi_str_ln_tgt_flg);
		Rslt1_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt1_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt1_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);

		Rslt1_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1,
				columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_sno1_mng_typ,
				columnRslt1_sno2_mng_typ, columnRslt1_sno3_mng_typ,
				columnRslt1_sno4_mng_typ);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		// 発注先、メーカは入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnRslt1_sppl_cd);
		linkBeansToISPanelCustom(columnRslt1_maker_cd);
		linkBeansToISPanelCustom(columnRslt2_sppl_cd);
		linkBeansToISPanelCustom(columnRslt2_maker_cd);

		//出庫場所も入力補助使用可能とする。
		linkBeansToISPanelCustom(columnRslt1_gi_loc_cd);
		linkBeansToISPanelCustom(columnRslt2_gi_loc_cd);
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_rqst_flg, true);
		setValueEx(Cnd_prms_flg, true);
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == Rslt1Table) {
			doRslt1Btn_open_DTL(info);
		}
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
			Rslt1Table.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF.isSelected()) {
			super.setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);

		setBtnMode();
	}

	protected void setBtnMode() {
		Rslt2R r = Rslt2Table.getSelectedMCRow();
		Rslt1R r1 = Rslt1Table.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				MCIndexKey idxKey = getRslt1L().createIndex(Rslt1R.$wg_rqst_no);
				Rslt1R rslt1R = getRslt1L().getFirst(idxKey, r.wg_rqst_no());
				if(!isNull(rslt1R)) {
					if(MAC_RTN_STS_TYP.isOK(rslt1R.rtn_sts_typ())) {
						Btn_rdel.setMode(MCMode.DISABLE);
						Btn_rcopy.setMode(MCMode.DISABLE);
					}
					else {
						if(!r.isStatusCreate()
								&& isNull(r.wg_rqst_prms_no())
						) {
							Btn_rdel.setMode(MCMode.DISABLE);
						}
						else {
							setDefaultMode(Btn_rdel);
						}
						setDefaultMode(Btn_rcopy);
					}
				}
				else {
					setDefaultMode(Btn_rdel);
					setDefaultMode(Btn_rcopy);
				}
			}
		}

		if(r1 == null) {
			Rslt1Btn_open_DTL.setMode(MCMode.DISABLE);
		}
		else {
			if(MSC_WG_RQST_SRC_TYP.isSLO(r1.wg_rqst_src_typ()) || MSC_WG_RQST_SRC_TYP.isSHIP(r1.wg_rqst_src_typ()) || MSC_WG_RQST_SRC_TYP.isORD(r1.wg_rqst_src_typ())) {
				setDefaultMode(Rslt1Btn_open_DTL);
			}
			else {
				Rslt1Btn_open_DTL.setMode(MCMode.DISABLE);
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
			Rslt2Table.setStatusColumnVisible(true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
			Rslt2Table.setStatusColumnVisible(false);
		}

		if (!isNull(getCndR().wg_rqst_ntc_day_typ())) {
			Cnd_srch_dt_fr.setMode(MCMode.ENABLE);
			Cnd_srch_dt_to.setMode(MCMode.ENABLE);
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			Rslt1Table.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			Rslt1Table.selectLeftmostColumn(0);
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt1_NC(MCEventInfo info) {
		super.doRslt1_NC(info);

		int idx = info.getOldIndex();
		if (idx >= 0) {
			Rslt1R row = getRslt1L().get(idx);
			_rslt2L.put(row.wg_rqst_no(), getRslt2L().clone());
		}

		idx = info.getEventIndex();
		if (idx >= 0) {
			Rslt1R row = getRslt1L().get(idx);
			showPrms(row);
			setStkChg(row);
			showDlvInst(row);
			setBtnMode();
		}
		// 検索結果を取得した時点でソートされているため、ソートは不要
		Rslt2Table.adjustWidth();
		DlvInstPanelTable.adjustWidth();
	}

	@Override
	public void doRslt2_NC(MCEventInfo info) {
		super.doRslt2_NC(info);
		setBtnMode();
	}

	protected void clearHiddenList() {
		_rslt2L = new HashMap<String, MCList<Rslt2R>>();
		_rslt1L = MCList.create(Rslt1R.class);
		_rslt2BakL = new HashMap<List<Comparable<?>>, MCList<Rslt2R>>();
		_giRslt2BakL = new HashMap<List<Comparable<?>>, MCList<Rslt2R>>();
		_grRslt2BakL = new HashMap<List<Comparable<?>>, MCList<Rslt2R>>();

		getDispStkChgRsltL().clear();
		clearCacheVH();
	}

	/**
	 * 回答一覧の検索結果を設定する。
	 * @param prms　検索した結果の回答
	 */
	protected void setHiddenList(MCList<Rslt2R> prms) {
		MCIndexKey idxKey = prms.createIndex(Rslt2R.$wg_rqst_no);
		for(Rslt2R r : prms.groupBy(Rslt2R.$wg_rqst_no)) {
			MCList<Rslt2R> val = prms.subList(idxKey, r.wg_rqst_no());
			_rslt2L.put(r.wg_rqst_no(), val);
		}

		MCIndexKey rslt2IdxKey = prms.createIndex(getRslt2Keys());
		for(Rslt2R r : prms.groupBy(getRslt2Keys())) {
			MCList<Rslt2R> val = prms.subList(rslt2IdxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			_rslt2BakL.put(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), val.clone());
		}

		MCIndexKey giIdxKey = prms.createIndex(getGiRslt2Keys());
		for(Rslt2R r : prms.groupBy(getGiRslt2Keys())) {
			MCList<Rslt2R> val = prms.subList(giIdxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gi_loc_cd());
			_giRslt2BakL.put(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gi_loc_cd()), val.clone());
		}

		MCIndexKey grIdxKey = prms.createIndex(getGrRslt2Keys());
		for(Rslt2R r : prms.groupBy(getGrRslt2Keys())) {
			MCList<Rslt2R> val = prms.subList(grIdxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_cd());
			_grRslt2BakL.put(toMapKey(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_cd()), val.clone());
		}
	}

	/**
	 * 選択しているＷＧ間依頼ＮＯを元に裏リストを差し替える
	 */
	protected void setHiddenList() {
		Rslt1R row = Rslt1Table.getSelectedMCRow();
		if(!isNull(row)) {
			MCList<Rslt2R> tmpL = MCList.create(Rslt2R.class);
			tmpL.setAll(getRslt2L());
			_rslt2L.put(row.wg_rqst_no(), tmpL);
		}
	}

	/**
	 * 回答が存在しない場合は依頼を元に回答行を作成
	 * @param rslt1L
	 */
	protected void setDefHiddenList(MCList<Rslt1R> rslt1L) {
		for(Rslt1R row : rslt1L) {
			if (isNull(_rslt2L.get(row.wg_rqst_no()))
					|| _rslt2L.get(row.wg_rqst_no()).size() == 0
			) {
				Rslt2R r = Rslt2R.create();
				r.fix_flg(row.fix_flg());
				r.fix_dt(row.fix_dt());
				r.prms_ntc_flg(row.prms_ntc_flg());
				r.prms_dt(row.prms_dt());
				r.re_prms_ntc_flg(row.re_prms_ntc_flg());
				r.re_prms_dt(row.re_prms_dt());
				r.can_flg(row.can_flg());
				r.wg_rqst_typ(row.wg_rqst_typ());
				r.wg_rqst_typ_nm(row.wg_rqst_typ_nm());
				r.wg_rqst_no(row.wg_rqst_no());
				r.gr_loc_cd(row.gr_loc_cd());
				r.gr_loc_nm(row.gr_loc_nm());
				r.gr_wg_cd(row.gr_wg_cd());
				r.gr_wg_nm(row.gr_wg_nm());
				r.wg_cd(row.rqst_to_wg_cd());
				r.wg_nm(row.rqst_to_wg_nm());
				r.itm_cd(row.itm_cd());
				r.itm_sub1(row.itm_sub1());
				r.itm_sub2(row.itm_sub2());
				r.itm_sub3(row.itm_sub3());
				r.itm_nm(row.itm_nm());
				r.asset_mng_typ(row.asset_mng_typ());
				r.dscnt_itm_flg(row.dscnt_itm_flg());
				r.prms_trd_unit_cd(row.prms_trd_unit_cd());
				r.prms_trd_unit_nm(row.prms_trd_unit_nm());
				r.prms_trd_unit_dec_place(row.prms_trd_unit_dec_place());
				r.prms_trd_unit_rnd_typ(row.prms_trd_unit_rnd_typ());
				r.prms_trd_unit_conv_base_qty(row.prms_trd_unit_conv_base_qty());
				r.prms_trd_unit_conv_qty(row.prms_trd_unit_conv_qty());
				r.prms_trd_unit_qty(row.prms_trd_unit_qty());
				r.prms_base_unit_cd(row.prms_base_unit_cd());
				r.prms_base_unit_nm(row.prms_base_unit_nm());
				r.prms_base_unit_dec_place(row.prms_base_unit_dec_place());
				r.prms_base_unit_rnd_typ(row.prms_base_unit_rnd_typ());
				r.prms_base_unit_qty(row.prms_base_unit_qty());
				r.gr_schd_dt(row.gr_schd_dt());
				r.gr_schd_hm(row.gr_schd_hm());
				r.gi_schd_dt(row.gi_schd_dt());
				r.gi_schd_hm(row.gi_schd_hm());
				r.gi_loc_cd(row.gi_loc_cd());
				r.gi_loc_nm(row.gi_loc_nm());
				r.gi_str_ln_tgt_flg(row.gi_str_ln_tgt_flg());
				r.gi_str_ln_cd(row.gi_str_ln_cd());
				r.gi_str_ln_nm(row.gi_str_ln_nm());
				r.gi_str_ln_cd_none_flg(row.gi_str_ln_cd_none_flg());
				r.gi_wg_cd(row.gi_wg_cd());
				r.gi_wg_nm(row.gi_wg_nm());
				r.gi_lg_grp_cd(row.gi_lg_grp_cd());
				r.gi_lg_grp_nm(row.gi_lg_grp_nm());
				r.mfg_loc_cd(row.mfg_loc_cd());
				r.mfg_loc_nm(row.mfg_loc_nm());
				r.bom_ptn(row.bom_ptn());
				r.sppl_cd(row.sppl_cd());
				r.sppl_nm(row.sppl_nm());
				r.maker_cd(row.maker_cd());
				r.maker_nm(row.maker_nm());
				r.prms_rmrks(row.prms_rmrks());
				r.intr_rmrks(row.intr_rmrks());
				r.sub_char1(row.sub_char1());
				r.sub_char2(row.sub_char2());
				r.sub_char3(row.sub_char3());
				r.last_fix_flg(row.fix_flg());

				MCList<Rslt2R> tmpL = _rslt2L.get(row.wg_rqst_no());
				if(isNull(tmpL)) {
					tmpL = MCList.create(Rslt2R.class);
				}
				tmpL.add(r);
				_rslt2L.put(row.wg_rqst_no(), tmpL);
			}
		}
	}

	/**
	 * 依頼に対する回答を表示する。
	 * @param row 対象の依頼行
	 */
	protected void showPrms(Rslt1R row) {
		if (!isNull(row)){
			getRslt2L().setAll(_rslt2L.get(row.wg_rqst_no()));
			showSub(Rslt2Table);
		}
		else {
			getRslt2L().clear();
		}
	}

	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);
		}
	}

	/**
	 * 在庫推移の検索条件を設定する。
	 * @param row
	 */
	protected void setStkChg(Rslt1R row) {
		if(!isNull(row)) {
			if(!isSame(getStkChgCndR().itm_cd(), row.itm_cd())
					|| !isSame(getStkChgCndR().itm_sub1(), row.itm_sub1())
					|| !isSame(getStkChgCndR().itm_sub2(), row.itm_sub2())
					|| !isSame(getStkChgCndR().itm_sub3(), row.itm_sub3())
					|| !isSame(getStkChgCndR().gi_loc_cd(), row.gi_loc_cd())
					|| !isSame(getStkChgCndR().itm_nm(), row.itm_nm())
			) {
				// 通信量を減らすため、コンテナに直接値を設定
				getStkChgCndR().itm_cd(row.itm_cd());
				getStkChgCndR().itm_sub1(row.itm_sub1());
				getStkChgCndR().itm_sub2(row.itm_sub2());
				getStkChgCndR().itm_sub3(row.itm_sub3());
				getStkChgCndR().itm_nm(row.itm_nm());
				if(!isNullOrNullVal(row.gi_loc_cd())
						|| !isNullOrNullVal(row.rqst_gi_loc_cd())
						|| !isNullOrNullVal(row.gr_loc_cd())
				) {
					if(!isNullOrNullVal(row.gi_loc_cd())) {
						getStkChgCndR().gi_loc_cd(row.gi_loc_cd());
						getStkChgCndR().gi_loc_nm(row.gi_loc_nm());
					}
					else if (!isNullOrNullVal(row.rqst_gi_loc_cd())) {
						getStkChgCndR().gi_loc_cd(row.rqst_gi_loc_cd());
						getStkChgCndR().gi_loc_nm(row.rqst_gi_loc_nm());
					}
					else if (!isNullOrNullVal(row.gr_loc_cd())) {
						getStkChgCndR().gi_loc_cd(row.gr_loc_cd());
						getStkChgCndR().gi_loc_nm(row.gr_loc_nm());
					}
				}
				else {
					getStkChgCndR().gi_loc_cd(null);
					getStkChgCndR().gi_loc_nm(null);
				}

				if(!isNull(row.gi_schd_dt())) {
					getStkChgCndR().dt_fr(row.gi_schd_dt().startOfMonth());
					getStkChgCndR().dt_to(row.gi_schd_dt().addMonth(1).endOfMonth());
				}
				else if(!isNull(row.gi_rqst_dt())) {
					getStkChgCndR().dt_fr(row.gi_rqst_dt().startOfMonth());
					getStkChgCndR().dt_to(row.gi_rqst_dt().addMonth(1).endOfMonth());
				}
				else if(!isNull(row.gr_schd_dt())) {
					getStkChgCndR().dt_fr(row.gr_schd_dt().startOfMonth());
					getStkChgCndR().dt_to(row.gr_schd_dt().addMonth(1).endOfMonth());
				}
				else if(!isNull(row.gr_rqst_dt())) {
					getStkChgCndR().dt_fr(row.gr_rqst_dt().startOfMonth());
					getStkChgCndR().dt_to(row.gr_rqst_dt().addMonth(1).endOfMonth());
				}

				getDispStkChgRsltL().clear();
				clearCacheVH();
			}
		}
		else {
			getStkChgCndR().itm_cd(null);
			getStkChgCndR().itm_sub1(null);
			getStkChgCndR().itm_sub2(null);
			getStkChgCndR().itm_sub3(null);
			getStkChgCndR().itm_nm(null);
			getStkChgCndR().gi_loc_cd(null);
			getStkChgCndR().gi_loc_nm(null);
			getStkChgCndR().dt_fr(null);
			getStkChgCndR().dt_to(null);
		}
	}

	/**
	 * 該当する納入指示受領を表示
	 * @param row
	 */
	protected void showDlvInst(Rslt1R row) {
		if (!isNull(row)){
			getDlvInstPanelL().setAll(_dlvInstL.subList(DlvInstPanelR.$slo_d_no, row.slo_d_no()));
			showSub(DlvInstPanelTable);
		}
		else {
			getDlvInstPanelL().clear();
		}
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
		clearContainers(getRslt1L(), getRslt2L(), getDlvInstPanelL());
		clearCnd();
		clearHiddenList();
		setSrchStatus();

		if(Cnd_ope_REF.isSelected()) {
			saveLoc1 = this.getDividerLocation("Rslt1Panel");
			saveLoc2 = this.getDividerLocation("Rslt2Panel");
			saveLoc3 = this.getDividerLocation("TabGrp1Panel");
			this.setDividerLocation("Rslt1Panel", saveLoc1, true);
		}
		else if(Cnd_ope_UPD.isSelected()) {
			this.setDividerLocation("Rslt1Panel", saveLoc1, false);
		}
	}


	@Override
	public void doBulkSet_fix_flg_NC(MCEventInfo info) {
		super.doBulkSet_fix_flg_NC(info);

		for(Rslt1R r : getRslt1L().subList(Rslt1R.$check, true)) {
			for(Rslt2R rslt2R : _rslt2L.get(r.wg_rqst_no())) {
				if(!isSame(rslt2R.fix_flg(), BulkSet_fix_flg.getValue())) {
					rslt2R.fix_flg(BulkSet_fix_flg.getValue());
					if(rslt2R.fix_flg()) {
						rslt2R.fix_dt(getToday());
					}
					else {
						rslt2R.fix_dt(null);
					}
					if(isEditable(columnRslt1_fix_flg, r.getGUIIndex())) {
						setValueEx(columnRslt1_fix_flg, r.getGUIIndex(), rslt2R.fix_flg());
					}
				}
			}
		}
	}

	@Override
	public void doBulkSet_prms_ntc_flg_NC(MCEventInfo info) {
		super.doBulkSet_prms_ntc_flg_NC(info);

		if(!BulkSet_prms_ntc_flg.getValue()) {
			setValueEx(BulkSet_re_prms_ntc_flg, false);
		}

		for(Rslt1R r : getRslt1L().subList(Rslt1R.$check, true)) {
			if(!isSame(r.prms_ntc_flg(), BulkSet_prms_ntc_flg.getValue())) {
				setValueEx(columnRslt1_prms_ntc_flg, r.getGUIIndex(), BulkSet_prms_ntc_flg.getValue());
			}
		}
	}

	@Override
	public void doBulkSet_re_prms_ntc_flg_NC(MCEventInfo info) {
		super.doBulkSet_re_prms_ntc_flg_NC(info);

		for(Rslt1R r : getRslt1L().subList(Rslt1R.$check, true)) {
			if(!isSame(r.re_prms_ntc_flg(), BulkSet_re_prms_ntc_flg.getValue())) {
				if(isEditable(columnRslt1_re_prms_ntc_flg, r.getGUIIndex())) {
					setValueEx(columnRslt1_re_prms_ntc_flg, r.getGUIIndex(), BulkSet_re_prms_ntc_flg.getValue());
				}
			}
		}
	}

	@Override
	public void doRslt1_check_NC(MCEventInfo info) {
		super.doRslt1_check_NC(info);

		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());

		if(rslt1R.check()) {
			if(rslt1R.check()) {
				if(!rslt1R.fix_flg()) {
					if(getBulkSetR().fix_flg() && isEditable(columnRslt1_fix_flg, rslt1R.getGUIIndex())) {
						rslt1R.fix_flg(getBulkSetR().fix_flg());
						rslt1R.fix_dt(getToday());
					}
				}
				if(!rslt1R.prms_ntc_flg()) {
					if(getBulkSetR().prms_ntc_flg() && isEditable(columnRslt1_prms_ntc_flg, rslt1R.getGUIIndex())) {
						rslt1R.prms_ntc_flg(getBulkSetR().prms_ntc_flg());
						rslt1R.prms_dt(getToday());
					}
				}
				if(!rslt1R.re_prms_ntc_flg()) {
					if(getBulkSetR().re_prms_ntc_flg() && isEditable(columnRslt1_re_prms_ntc_flg, rslt1R.getGUIIndex())) {
						rslt1R.re_prms_ntc_flg(getBulkSetR().re_prms_ntc_flg());
						rslt1R.re_prms_dt(getToday());
					}
				}
			}
			setDefaultValueWhenChecked(rslt1R);
		}

		copyRslt1InfoToRslt2(info.getEventIndex());
	}

	@Override
	public void doRslt1_fix_flg_NC(MCEventInfo info) {
		super.doRslt1_fix_flg_NC(info);
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		if(!rslt1R.fix_flg()) {
			rslt1R.fix_dt(null);
		}
		else {
			rslt1R.fix_dt(getToday());
		}

		copyRslt1InfoToRslt2(info.getEventIndex());
	}

	@Override
	public void doRslt1_prms_ntc_flg_NC(MCEventInfo info) {
		super.doRslt1_prms_ntc_flg_NC(info);
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		if(!rslt1R.prms_ntc_flg()) {
			rslt1R.prms_dt(null);
			rslt1R.re_prms_ntc_flg(false);
			rslt1R.re_prms_dt(null);
		}
		else {
			rslt1R.prms_dt(getToday());
		}
		for(Rslt2R r : _rslt2L.get(rslt1R.wg_rqst_no())) {
			r.prms_ntc_flg(rslt1R.prms_ntc_flg());
			r.prms_dt(rslt1R.prms_dt());
		}

		// 未回答、回答済の場合のみ下段に連携
		if(MSC_WG_RQST_STS_TYP.isRQST(rslt1R.wg_rqst_sts_typ())
				|| MSC_WG_RQST_STS_TYP.isPRMS(rslt1R.wg_rqst_sts_typ())
		) {
			copyRslt1InfoToRslt2(info.getEventIndex());
		}
	}

	@Override
	public void doRslt1_prms_dt_NC(MCEventInfo info) {
		super.doRslt1_prms_dt_NC(info);
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		for(Rslt2R r : _rslt2L.get(rslt1R.wg_rqst_no())) {
			r.prms_dt(rslt1R.prms_dt());
		}

		// 未回答、回答済の場合のみ下段に連携
		if(MSC_WG_RQST_STS_TYP.isRQST(rslt1R.wg_rqst_sts_typ())
				|| MSC_WG_RQST_STS_TYP.isPRMS(rslt1R.wg_rqst_sts_typ())
		) {
			copyRslt1InfoToRslt2(info.getEventIndex());
		}
	}

	@Override
	public void doRslt1_re_prms_ntc_flg_NC(MCEventInfo info) {
		super.doRslt1_re_prms_ntc_flg_NC(info);
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		if(!rslt1R.re_prms_ntc_flg()) {
			rslt1R.re_prms_dt(null);
		}
		else {
			rslt1R.re_prms_dt(getToday());
		}

		for(Rslt2R r : _rslt2L.get(rslt1R.wg_rqst_no())) {
			r.re_prms_ntc_flg(rslt1R.re_prms_ntc_flg());
			r.re_prms_dt(rslt1R.re_prms_dt());
		}

		// 未回答、回答済の場合のみ下段に連携
		if(MSC_WG_RQST_STS_TYP.isRQST(rslt1R.wg_rqst_sts_typ())
				|| MSC_WG_RQST_STS_TYP.isPRMS(rslt1R.wg_rqst_sts_typ())
		) {
			copyRslt1InfoToRslt2(info.getEventIndex());
		}
	}

	@Override
	public void doRslt1_re_prms_dt_NC(MCEventInfo info) {
		super.doRslt1_re_prms_dt_NC(info);
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		for(Rslt2R r : _rslt2L.get(rslt1R.wg_rqst_no())) {
			r.re_prms_dt(rslt1R.re_prms_dt());
		}

		// 未回答、回答済の場合のみ下段に連携
		if(MSC_WG_RQST_STS_TYP.isRQST(rslt1R.wg_rqst_sts_typ())
				|| MSC_WG_RQST_STS_TYP.isPRMS(rslt1R.wg_rqst_sts_typ())
		) {
			copyRslt1InfoToRslt2(info.getEventIndex());
		}
	}

	@Override
	public MCList<?> getRslt1_gi_loc_cd(MCRow row, MCEventInfo info) {
		//出庫物流グループが入力されていて、入力の出庫場所がその出庫物流グループに属していれば、その出庫物流グループの範囲のリスト、
		//上記以外の場合は、社内場所のリストを返す
		Rslt1R r = getRslt1L().get(info.getEventIndex());
		if(!isNull(r.gi_lg_grp_cd())) {
			row.setStringNE("gi_loc_cd", r.gi_loc_cd());
			row.setStringNE("lg_grp_cd", r.gi_lg_grp_cd());
			row.setBooleanNE("wr_flg", true);
			row.setStringNE("loc_is_srch_typ", MAC_LOC_IS_SRCH_TYP.LG_GRP.value());
			MCList<?> gi_loc_cdL = ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
			for (MCRow x :gi_loc_cdL) {
				if (isSame(x.getStringNE("loc_cd"), r.gi_loc_cd())) {
					return gi_loc_cdL;
				}
			}
			row.setStringNE("loc_is_srch_typ", MAC_LOC_IS_SRCH_TYP.HOUSE.value());
		}
		return super.getRslt1_gi_loc_cd(row, info);
	}

	@Override
	public MCList getRslt1_bom_ptn(MCRow row, MCEventInfo info) {
		return getNoDupList(super.getRslt1_bom_ptn(row, info), ItmDtlBomPtnCols.$o_bom_ptn);
	}

	@Override
	public MCList<?> getRslt2_gi_loc_cd(MCRow row, MCEventInfo info) {
		Rslt2R r = getRslt2L().get(info.getEventIndex());
		if(!isNull(r.gi_lg_grp_cd())) {
			row.setStringNE("gi_loc_cd", r.gi_loc_cd());
			row.setStringNE("lg_grp_cd", r.gi_lg_grp_cd());
			row.setBooleanNE("wr_flg", true);
			row.setStringNE("loc_is_srch_typ", MAC_LOC_IS_SRCH_TYP.LG_GRP.value());
			MCList<?> gi_loc_cdL = ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
			for (MCRow x :gi_loc_cdL) {
				if (isSame(x.getStringNE("loc_cd"), r.gi_loc_cd())) {
					return gi_loc_cdL;
				}
			}
			row.setStringNE("loc_is_srch_typ", MAC_LOC_IS_SRCH_TYP.HOUSE.value());
		}
		return super.getRslt2_gi_loc_cd(row, info);
	}

	@Override
	public MCList getRslt2_bom_ptn(MCRow row, MCEventInfo info) {
		return getNoDupList(super.getRslt2_bom_ptn(row, info), ItmDtlBomPtnCols.$o_bom_ptn);
	}
	
	protected MCList<?> getNoDupList(MCList<?> lst, String... key) {
		MCList ret = lst.shallowClone();	// 一時カラムを保持
		ret.clear();

		lst.sort(key);
		MCRow pre = null;
		for (Object o : lst) {
			MCRow r = (MCRow)o;
			if (isNull(pre) || !isColSame(r, pre, key)) {
				ret.add(r);
			}
			pre = r;
		}
		return ret;
	}
	
	/**
	 * 依頼・回答一覧の回答情報を回答一覧の該当項目に反映する<br>
	 * @param index
	 */
	protected void copyRslt1InfoToRslt2(int index) {

		Rslt1R rslt1R = getRslt1L().get(index);

		MCList<Rslt2R> tmpL = MCList.create(Rslt2R.class);
		for(Rslt2R r : _rslt2L.get(rslt1R.wg_rqst_no())) {
			if(!isSame(MCRow.DELETE , r.getStatus())) {
				tmpL.add(r);
			}
		}

		if (tmpL.size() == 1) {
			Rslt2R rslt2R = tmpL.get(0);

			// イベントを発生させないため、コンテナに直接値を設定
			rslt2R.fix_flg(rslt1R.fix_flg());
			rslt2R.fix_dt(rslt1R.fix_dt());
			rslt2R.can_flg(rslt1R.can_flg());
			rslt2R.wg_rqst_no(rslt1R.wg_rqst_no());
			rslt2R.prms_trd_unit_cd(rslt1R.prms_trd_unit_cd());
			rslt2R.prms_trd_unit_nm(rslt1R.prms_trd_unit_nm());
			rslt2R.prms_trd_unit_dec_place(rslt1R.prms_trd_unit_dec_place());
			rslt2R.prms_trd_unit_rnd_typ(rslt1R.prms_trd_unit_rnd_typ());
			rslt2R.prms_trd_unit_conv_base_qty(rslt1R.prms_trd_unit_conv_base_qty());
			rslt2R.prms_trd_unit_conv_qty(rslt1R.prms_trd_unit_conv_qty());
			rslt2R.prms_trd_unit_qty(rslt1R.prms_trd_unit_qty());
			rslt2R.prms_base_unit_cd(rslt1R.prms_base_unit_cd());
			rslt2R.prms_base_unit_nm(rslt1R.prms_base_unit_nm());
			rslt2R.prms_base_unit_dec_place(rslt1R.prms_base_unit_dec_place());
			rslt2R.prms_base_unit_rnd_typ(rslt1R.prms_base_unit_rnd_typ());
			rslt2R.prms_base_unit_qty(rslt1R.prms_base_unit_qty());
			rslt2R.gr_schd_dt(rslt1R.gr_schd_dt());
			rslt2R.gr_schd_hm(rslt1R.gr_schd_hm());
			rslt2R.gi_schd_dt(rslt1R.gi_schd_dt());
			rslt2R.gi_schd_hm(rslt1R.gi_schd_hm());
			rslt2R.gi_loc_cd(rslt1R.gi_loc_cd());
			rslt2R.gi_loc_nm(rslt1R.gi_loc_nm());
			rslt2R.gi_str_ln_tgt_flg(rslt1R.gi_str_ln_tgt_flg());
			rslt2R.gi_str_ln_cd(rslt1R.gi_str_ln_cd());
			rslt2R.gi_str_ln_nm(rslt1R.gi_str_ln_nm());
			rslt2R.gi_str_ln_cd_none_flg(rslt1R.gi_str_ln_cd_none_flg());
			rslt2R.gi_wg_cd(rslt1R.gi_wg_cd());
			rslt2R.gi_wg_nm(rslt1R.gi_wg_nm());
			rslt2R.gi_lg_grp_cd(rslt1R.gi_lg_grp_cd());
			rslt2R.gi_lg_grp_nm(rslt1R.gi_lg_grp_nm());
			rslt2R.mfg_loc_cd(rslt1R.mfg_loc_cd());
			rslt2R.mfg_loc_nm(rslt1R.mfg_loc_nm());
			rslt2R.bom_ptn(rslt1R.bom_ptn());
			rslt2R.sppl_cd(rslt1R.sppl_cd());
			rslt2R.sppl_nm(rslt1R.sppl_nm());
			rslt2R.maker_cd(rslt1R.maker_cd());
			rslt2R.maker_nm(rslt1R.maker_nm());
			rslt2R.prms_rmrks(rslt1R.prms_rmrks());
			rslt2R.intr_rmrks(rslt1R.intr_rmrks());
			rslt2R.sub_char1(rslt1R.sub_char1());
			rslt2R.sub_char2(rslt1R.sub_char2());
			rslt2R.sub_char3(rslt1R.sub_char3());

			rslt2R.setStatus(MCRow.MODIFY);

			_rslt2L.put(rslt1R.wg_rqst_no(), tmpL);
		}

		calcNotCmplQty(rslt1R);
	}

	@Override
	public void doRslt2_fix_flg_NC(MCEventInfo info) {
		super.doRslt2_fix_flg_NC(info);
		Rslt2R rslt2R = getRslt2L().get(info.getEventIndex());
		if(!rslt2R.fix_flg()) {
			rslt2R.fix_dt(null);
		}
		else {
			rslt2R.fix_dt(getToday());
		}

		setColByDscntItm(rslt2R);

		copyRslt2InfoToRslt1(info.getEventIndex());
	}


	/**
	 * 回答一覧の回答情報を依頼・回答一覧の該当項目に反映する<br>
	 * @param index
	 */
	protected void copyRslt2InfoToRslt1(int index) {

		Rslt2R rslt2R = getRslt2L().get(index);
		Rslt1R rslt1R = getRslt1L().subList(Rslt1R.$wg_rqst_no, rslt2R.wg_rqst_no()).get(0);

		MCList<Rslt2R> tmpL = MCList.create(Rslt2R.class);
		for(Rslt2R r : getRslt2L()) {
			if(!isSame(MCRow.DELETE , r.getStatus())) {
				tmpL.add(r);
			}
		}

		if (tmpL.size() == 1) {
			// イベントを発生させないため、コンテナに直接値を設定
			rslt1R.fix_flg(rslt2R.fix_flg());
			rslt1R.fix_dt(rslt2R.fix_dt());
			rslt1R.can_flg(rslt2R.can_flg());
			rslt1R.wg_rqst_no(rslt2R.wg_rqst_no());
			rslt1R.prms_trd_unit_cd(rslt2R.prms_trd_unit_cd());
			rslt1R.prms_trd_unit_nm(rslt2R.prms_trd_unit_nm());
			rslt1R.prms_trd_unit_dec_place(rslt2R.prms_trd_unit_dec_place());
			rslt1R.prms_trd_unit_rnd_typ(rslt2R.prms_trd_unit_rnd_typ());
			rslt1R.prms_trd_unit_conv_base_qty(rslt2R.prms_trd_unit_conv_base_qty());
			rslt1R.prms_trd_unit_conv_qty(rslt2R.prms_trd_unit_conv_qty());
			rslt1R.prms_trd_unit_qty(rslt2R.prms_trd_unit_qty());
			rslt1R.prms_base_unit_cd(rslt2R.prms_base_unit_cd());
			rslt1R.prms_base_unit_nm(rslt2R.prms_base_unit_nm());
			rslt1R.prms_base_unit_dec_place(rslt2R.prms_base_unit_dec_place());
			rslt1R.prms_base_unit_rnd_typ(rslt2R.prms_base_unit_rnd_typ());
			rslt1R.prms_base_unit_qty(rslt2R.prms_base_unit_qty());
			rslt1R.gr_schd_dt(rslt2R.gr_schd_dt());
			rslt1R.gr_schd_hm(rslt2R.gr_schd_hm());
			rslt1R.gi_schd_dt(rslt2R.gi_schd_dt());
			rslt1R.gi_schd_hm(rslt2R.gi_schd_hm());
			rslt1R.gi_loc_cd(rslt2R.gi_loc_cd());
			rslt1R.gi_loc_nm(rslt2R.gi_loc_nm());
			rslt1R.gi_str_ln_tgt_flg(rslt2R.gi_str_ln_tgt_flg());
			rslt1R.gi_str_ln_cd(rslt2R.gi_str_ln_cd());
			rslt1R.gi_str_ln_nm(rslt2R.gi_str_ln_nm());
			rslt1R.gi_str_ln_cd_none_flg(rslt2R.gi_str_ln_cd_none_flg());
			rslt1R.gi_wg_cd(rslt2R.gi_wg_cd());
			rslt1R.gi_wg_nm(rslt2R.gi_wg_nm());
			rslt1R.gi_lg_grp_cd(rslt2R.gi_lg_grp_cd());
			rslt1R.gi_lg_grp_nm(rslt2R.gi_lg_grp_nm());
			rslt1R.mfg_loc_cd(rslt2R.mfg_loc_cd());
			rslt1R.mfg_loc_nm(rslt2R.mfg_loc_nm());
			rslt1R.bom_ptn(rslt2R.bom_ptn());
			rslt1R.sppl_cd(rslt2R.sppl_cd());
			rslt1R.sppl_nm(rslt2R.sppl_nm());
			rslt1R.maker_cd(rslt2R.maker_cd());
			rslt1R.maker_nm(rslt2R.maker_nm());
			rslt1R.prms_rmrks(rslt2R.prms_rmrks());
			rslt1R.intr_rmrks(rslt2R.intr_rmrks());
			rslt1R.sub_char1(rslt2R.sub_char1());
			rslt1R.sub_char2(rslt2R.sub_char2());
			rslt1R.sub_char3(rslt2R.sub_char3());
		}
		else {
			// イベントを発生させないため、コンテナに直接値を設定
			rslt1R.fix_flg(false);
			rslt1R.fix_dt(null);
			rslt1R.can_flg(false);
			rslt1R.wg_rqst_no(rslt2R.wg_rqst_no());
			rslt1R.prms_trd_unit_cd(null);
			rslt1R.prms_trd_unit_nm(null);
			rslt1R.prms_trd_unit_dec_place(null);
			rslt1R.prms_trd_unit_rnd_typ(null);
			rslt1R.prms_trd_unit_conv_base_qty(null);
			rslt1R.prms_trd_unit_conv_qty(null);
			rslt1R.prms_trd_unit_qty(null);
			rslt1R.prms_base_unit_cd(rslt2R.prms_base_unit_cd());
			rslt1R.prms_base_unit_nm(rslt2R.prms_base_unit_nm());
			rslt1R.prms_base_unit_dec_place(rslt2R.prms_base_unit_dec_place());
			rslt1R.prms_base_unit_rnd_typ(rslt2R.prms_base_unit_rnd_typ());
			rslt1R.prms_base_unit_qty(null);
			rslt1R.gr_schd_dt(null);
			rslt1R.gr_schd_hm(null);
			rslt1R.gi_schd_dt(null);
			rslt1R.gi_schd_hm(null);
			rslt1R.gi_loc_cd(null);
			rslt1R.gi_loc_nm(null);
			rslt1R.gi_str_ln_tgt_flg(false);
			rslt1R.gi_str_ln_cd(null);
			rslt1R.gi_str_ln_nm(null);
			rslt1R.gi_str_ln_cd_none_flg(false);
			rslt1R.gi_wg_cd(rslt2R.gi_wg_cd());
			rslt1R.gi_wg_nm(rslt2R.gi_wg_nm());
			rslt1R.gi_lg_grp_cd(rslt2R.gi_lg_grp_cd());
			rslt1R.gi_lg_grp_nm(rslt2R.gi_lg_grp_nm());
			rslt1R.mfg_loc_cd(null);
			rslt1R.mfg_loc_nm(null);
			rslt1R.bom_ptn(null);
			rslt1R.sppl_cd(null);
			rslt1R.sppl_nm(null);
			rslt1R.maker_cd(null);
			rslt1R.maker_nm(null);
			rslt1R.prms_rmrks(null);
			rslt1R.intr_rmrks(null);
			rslt1R.sub_char1(null);
			rslt1R.sub_char2(null);
			rslt1R.sub_char3(null);
		}
		tmpL = _rslt2BakL.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3()));
		if(isNull(tmpL)) {
			tmpL = MCList.create(Rslt2R.class);
		}
		tmpL.add(rslt2R.clone());
		_rslt2BakL.put(toMapKey(rslt2R.itm_cd(), rslt2R.itm_sub1(), rslt2R.itm_sub2(), rslt2R.itm_sub3()), tmpL);

		if(!rslt1R.check()) {
			rslt1R.check(true);
		}
		calcNotCmplQty(rslt1R);
	}

	protected void clearCnd() {
		if(Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_cmpl_flg, false);
			setValueEx(Cnd_can_flg, false);
		}
	}

	@Override
	protected void listInit() {
		super.listInit();

		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, DispStkChgRsltTable, getStkChgRsltL());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。グループの下に空行を入れる場合は最後にnullを指定する。
		java.util.LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(StkChgRsltR.$schd_qty, "");
		_vhM.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {StkChgRsltR.$schd_dt, StkChgRsltR.$schd_qty});
		dispList.add(new String[] {StkChgRsltR.$schd_dt, StkChgRsltR.$schd_qty});
		_vhM.setDispInfo(dispList);

		clearCacheVH();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnRslt1_prms_trd_unit_qty.addLCListener(this);
		columnRslt1_prms_base_unit_qty.addVCListener(this);
		columnRslt1_prms_base_unit_qty.addLCListener(this);
		columnRslt1_gi_str_ln_cd.addLCListener(this);
		columnRslt1_gi_str_ln_nm.addLCListener(this);
		columnRslt1_gi_str_ln_cd_none_flg.addNCListener(this);
		columnRslt1_gr_schd_dt.addLCListener(this);
		columnRslt1_gr_schd_hm.addLCListener(this);
		columnRslt1_gr_schd_dt.addVCListener(this);
		columnRslt1_gr_schd_hm.addVCListener(this);
		columnRslt1_gi_schd_dt.addLCListener(this);
		columnRslt1_gi_schd_hm.addLCListener(this);
		columnRslt1_gi_schd_dt.addVCListener(this);
		columnRslt1_gi_schd_hm.addVCListener(this);

		columnRslt2_prms_trd_unit_qty.addLCListener(this);
		columnRslt2_prms_base_unit_qty.addVCListener(this);
		columnRslt2_gi_str_ln_cd.addLCListener(this);
		columnRslt2_gi_str_ln_nm.addLCListener(this);
		columnRslt2_gi_str_ln_cd_none_flg.addNCListener(this);
		columnRslt2_gr_schd_dt.addLCListener(this);
		columnRslt2_gr_schd_hm.addLCListener(this);
		columnRslt2_gr_schd_dt.addVCListener(this);
		columnRslt2_gr_schd_hm.addVCListener(this);
		columnRslt2_gi_schd_dt.addLCListener(this);
		columnRslt2_gi_schd_hm.addLCListener(this);
		columnRslt2_gi_schd_dt.addVCListener(this);
		columnRslt2_gi_schd_hm.addVCListener(this);

		Rslt1_itm_p_PPanel.addItmLCListner(this);

	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		boolean chk = super.doVCEvent(vc, info);

		if (vc == columnRslt1_prms_base_unit_qty
				|| vc == columnRslt1_gr_schd_dt
				|| vc == columnRslt1_gr_schd_hm
				|| vc == columnRslt1_gi_schd_dt
				|| vc == columnRslt1_gi_schd_hm
				|| vc == columnRslt1_fix_flg
				|| vc == columnRslt1_gi_loc_cd
		) {
			Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
			if(!isNull(rslt1R)) {
				Rslt2R rslt2R = Rslt2R.create();
				rslt2R.itm_cd(rslt1R.itm_cd());
				rslt2R.itm_sub1(rslt1R.itm_sub1());
				rslt2R.itm_sub2(rslt1R.itm_sub2());
				rslt2R.itm_sub3(rslt1R.itm_sub3());
				rslt2R.gr_loc_cd(rslt1R.gr_loc_cd());
				rslt2R.gi_loc_cd(rslt1R.gi_loc_cd());
				rslt2R.prms_base_unit_qty(rslt1R.prms_base_unit_qty());
				rslt2R.gr_schd_dt(rslt1R.gr_schd_dt());
				rslt2R.gi_schd_dt(rslt1R.gi_schd_dt());
				rslt2R.fix_flg(rslt1R.fix_flg());

				MCList<Rslt2R> tmpL = _rslt2BakL.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3()));
				if(isNull(tmpL)) {
					tmpL = MCList.create(Rslt2R.class);
				}
				rslt2R = rslt2R.clone();
				if(!isNull(rslt2R.prms_base_unit_qty())) {
					rslt2R.prms_base_unit_qty(rslt2R.prms_base_unit_qty().multiply(-1));
				}
				tmpL.add(rslt2R);
				_rslt2BakL.put(toMapKey(rslt2R.itm_cd(), rslt2R.itm_sub1(), rslt2R.itm_sub2(), rslt2R.itm_sub3()), tmpL);
			}
		}
		else if (vc == columnRslt2_prms_base_unit_qty
				|| vc == columnRslt2_gr_schd_dt
				|| vc == columnRslt2_gr_schd_hm
				|| vc == columnRslt2_gi_schd_dt
				|| vc == columnRslt2_gi_schd_hm
				|| vc == columnRslt2_fix_flg
				|| vc == columnRslt2_gi_loc_cd
		) {
			Rslt2R rslt2R = getRslt2L().get(info.getEventIndex());
			if(!isNull(rslt2R)) {
				MCList<Rslt2R> tmpL = _rslt2BakL.get(toMapKey(rslt2R.itm_cd(), rslt2R.itm_sub1(), rslt2R.itm_sub2(), rslt2R.itm_sub3()));
				if(isNull(tmpL)) {
					tmpL = MCList.create(Rslt2R.class);
				}
				rslt2R = rslt2R.clone();
				if(!isNull(rslt2R.prms_base_unit_qty())) {
					rslt2R.prms_base_unit_qty(rslt2R.prms_base_unit_qty().multiply(-1));
				}
				tmpL.add(rslt2R);
				_rslt2BakL.put(toMapKey(rslt2R.itm_cd(), rslt2R.itm_sub1(), rslt2R.itm_sub2(), rslt2R.itm_sub3()), tmpL);
			}
		}

		// 値引品目対応
		if( vc == columnRslt2_gr_schd_dt
				|| vc == columnRslt2_gr_schd_hm
				|| vc == columnRslt2_gi_schd_dt
				|| vc == columnRslt2_gi_schd_hm
				|| vc == columnRslt2_fix_flg
				|| vc == columnRslt2_gi_loc_cd) {

			Rslt2R rslt2R = getRslt2L().get(info.getEventIndex());
			if(!isNull(rslt2R)) {
				setColByDscntItm(rslt2R);
			}
		}

		return chk;
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnRslt1_can_flg || nc == columnRslt1_gi_str_ln_cd_none_flg) {
			copyRslt1InfoToRslt2(info.getEventIndex());
		}
		else if (nc == columnRslt2_can_flg || nc == columnRslt2_gi_str_ln_cd_none_flg) {
			Rslt2R rslt2R = getRslt2L().get(info.getEventIndex());
			if(!isNull(rslt2R)) {
				setColByDscntItm(rslt2R);
			}

			copyRslt2InfoToRslt1(info.getEventIndex());
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == Cnd_wg_rqst_ntc_day_typ) {
			if (isNull(getCndR().wg_rqst_ntc_day_typ())) {
				getCndR().srch_dt_fr(null);
				getCndR().srch_dt_to(null);
				Cnd_srch_dt_fr.setMode(MCMode.READ_ONLY);
				Cnd_srch_dt_to.setMode(MCMode.READ_ONLY);
			}
			else {
				Cnd_srch_dt_fr.setMode(MCMode.ENABLE);
				Cnd_srch_dt_to.setMode(MCMode.ENABLE);
			}
		}

		if (lc == columnRslt1_prms_trd_unit_qty
				|| lc == columnRslt1_gi_str_ln_cd
				|| lc == columnRslt1_gi_str_ln_nm
				|| lc == columnRslt1_gr_schd_dt
				|| lc == columnRslt1_gr_schd_hm
				|| lc == columnRslt1_gi_schd_dt
				|| lc == columnRslt1_gi_schd_hm
				|| lc == columnRslt1_fix_dt
				|| lc == columnRslt1_prms_trd_unit_cd
				|| lc == columnRslt1_gi_loc_cd
				|| lc == columnRslt1_mfg_loc_cd
				|| lc == columnRslt1_bom_ptn
				|| lc == columnRslt1_sppl_cd
				|| lc == columnRslt1_maker_cd
				|| lc == columnRslt1_prms_rmrks
				|| lc == columnRslt1_intr_rmrks
				|| lc == columnRslt1_sub_char1
				|| lc == columnRslt1_sub_char2
				|| lc == columnRslt1_sub_char3
		) {
			copyRslt1InfoToRslt2(info.getEventIndex());
		}
		else if (lc == columnRslt2_prms_trd_unit_qty
				|| lc == columnRslt2_gi_str_ln_cd
				|| lc == columnRslt2_gr_schd_dt
				|| lc == columnRslt2_gr_schd_hm
				|| lc == columnRslt2_gi_schd_dt
				|| lc == columnRslt2_gi_schd_hm
				|| lc == columnRslt2_fix_dt
				|| lc == columnRslt2_prms_trd_unit_cd
				|| lc == columnRslt2_gi_loc_cd
				|| lc == columnRslt2_mfg_loc_cd
				|| lc == columnRslt2_bom_ptn
				|| lc == columnRslt2_sppl_cd
				|| lc == columnRslt2_maker_cd
				|| lc == columnRslt2_prms_rmrks
				|| lc == columnRslt2_intr_rmrks
				|| lc == columnRslt2_sub_char1
				|| lc == columnRslt2_sub_char2
				|| lc == columnRslt2_sub_char3
		) {
			copyRslt2InfoToRslt1(info.getEventIndex());
		}

		if (lc == columnRslt1_prms_base_unit_qty
				|| lc == columnRslt1_gr_schd_dt
				|| lc == columnRslt1_gi_schd_dt
				|| lc == columnRslt1_fix_flg
				|| lc == columnRslt1_gi_loc_cd
		) {
			Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
			if(!isNull(rslt1R)) {
				Rslt2R rslt2R = Rslt2R.create();
				rslt2R.itm_cd(rslt1R.itm_cd());
				rslt2R.itm_sub1(rslt1R.itm_sub1());
				rslt2R.itm_sub2(rslt1R.itm_sub2());
				rslt2R.itm_sub3(rslt1R.itm_sub3());
				rslt2R.gr_loc_cd(rslt1R.gr_loc_cd());
				rslt2R.gi_loc_cd(rslt1R.gi_loc_cd());
				rslt2R.prms_base_unit_qty(rslt1R.prms_base_unit_qty());
				rslt2R.gr_schd_dt(rslt1R.gr_schd_dt());
				rslt2R.gi_schd_dt(rslt1R.gi_schd_dt());
				rslt2R.fix_flg(rslt1R.fix_flg());

				MCList<Rslt2R> tmpL = _rslt2BakL.get(toMapKey(rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3()));
				if(isNull(tmpL)) {
					tmpL = MCList.create(Rslt2R.class);
				}
				rslt2R = rslt2R.clone();
				if(!isNull(rslt2R.prms_base_unit_qty())) {
					rslt2R.prms_base_unit_qty(rslt2R.prms_base_unit_qty());
				}
				tmpL.add(rslt2R);
				_rslt2BakL.put(toMapKey(rslt2R.itm_cd(), rslt2R.itm_sub1(), rslt2R.itm_sub2(), rslt2R.itm_sub3()), tmpL);
			}
		}

		// 値引品目対応
		if (lc == columnRslt2_gi_str_ln_cd
				|| lc == columnRslt2_gi_str_ln_cd_none_flg
				|| lc == columnRslt2_gr_schd_dt
				|| lc == columnRslt2_gr_schd_hm
				|| lc == columnRslt2_gi_schd_dt
				|| lc == columnRslt2_gi_schd_hm
				|| lc == columnRslt2_fix_dt
				|| lc == columnRslt2_prms_trd_unit_cd
				|| lc == columnRslt2_gi_loc_cd
				|| lc == columnRslt2_mfg_loc_cd
				|| lc == columnRslt2_bom_ptn
				|| lc == columnRslt2_sppl_cd
				|| lc == columnRslt2_maker_cd
				|| lc == columnRslt2_prms_rmrks
				|| lc == columnRslt2_intr_rmrks
				|| lc == columnRslt2_sub_char1
				|| lc == columnRslt2_sub_char2
				|| lc == columnRslt2_sub_char3
		) {
			Rslt2R rslt2R = getRslt2L().get(info.getEventIndex());
			if(!isNull(rslt2R)) {
				setColByDscntItm(rslt2R);
			}
		}

	}

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof Rslt1R) {
			Rslt1R rslt1R = (Rslt1R)srcRow;
			if(!rslt1R.prms_div_flg()) {
				// 通信量を減らすため、できるだけコンテナに直接値を指定
				if(isNull(rslt1R.prms_trd_unit_cd())) {
					setValueEx(columnRslt1_prms_trd_unit_cd, rslt1R.getGUIIndex(), rslt1R.trd_unit_cd());
					setValueEx(columnRslt1_prms_trd_unit_qty, rslt1R.getGUIIndex(), rslt1R.trd_unit_qty());
				}
				if(isNull(rslt1R.gr_schd_dt())) {
					rslt1R.gr_schd_dt(rslt1R.gr_rqst_dt());
					rslt1R.gr_schd_hm(rslt1R.gr_rqst_hm());
				}
				if(isNull(rslt1R.gi_schd_dt())) {
					rslt1R.gi_schd_dt(rslt1R.gi_rqst_dt());
					rslt1R.gi_schd_hm(rslt1R.gi_rqst_hm());
				}
				if(!isSame(nvl(rslt1R.rqst_gi_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					if(isNull(rslt1R.gi_loc_cd())) {
						setValueEx(columnRslt1_gi_loc_cd, rslt1R.getGUIIndex(), rslt1R.rqst_gi_loc_cd());
					}
				}
				if(!isSame(nvl(rslt1R.rqst_mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					if(isNull(rslt1R.mfg_loc_cd())) {
						setValueEx(columnRslt1_mfg_loc_cd, rslt1R.getGUIIndex(), rslt1R.rqst_mfg_loc_cd());
					}
				}
				if(!isSame(nvl(rslt1R.rqst_bom_ptn(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					if(isNull(rslt1R.bom_ptn())) {
						setValueEx(columnRslt1_bom_ptn, rslt1R.getGUIIndex(), rslt1R.rqst_bom_ptn());
					}
				}
				if(isNull(rslt1R.sppl_cd())) {
					rslt1R.sppl_cd(rslt1R.rqst_sppl_cd());
					rslt1R.sppl_nm(rslt1R.rqst_sppl_nm());
				}
				if(isNull(rslt1R.maker_cd())) {
					rslt1R.maker_cd(rslt1R.rqst_maker_cd());
					rslt1R.maker_nm(rslt1R.rqst_maker_nm());
				}
			}
		}
	}

	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 * @param rslt2R
	 */
	protected void setColByDscntItm(Rslt2R rslt2R) {
		if (rslt2R.dscnt_itm_flg()) {
			if(isNull(rslt2R.prms_trd_unit_qty())) {
				setValueEx(columnRslt2_prms_trd_unit_cd, rslt2R.getGUIIndex(), rslt2R.prms_base_unit_cd());
				setValueEx(columnRslt2_prms_trd_unit_qty, rslt2R.getGUIIndex(), MCNumber.ONE);
			}
		}
	}

	/**
	 * 対象のＷＧ間依頼の依頼残数量を計算する
	 * @param rslt1R
	 */
	protected void calcNotCmplQty(Rslt1R rslt1R) {
		MCList<Rslt2R> rslt2L = _rslt2L.get(rslt1R.wg_rqst_no());
		if(isNull(rslt2L)) {
			rslt1R.not_cmpl_qty(rslt1R.base_unit_qty());
		}
		else {
			MCNumber notCmplQty = MCNumber.ZERO;
			for(Rslt2R r : rslt2L) {
				if(r.fix_flg()) {
					notCmplQty = notCmplQty.add(nvl(r.prms_base_unit_qty(), MCNumber.ZERO));
				}
			}
			rslt1R.not_cmpl_qty(rslt1R.base_unit_qty().subtract(notCmplQty));
			if(rslt1R.not_cmpl_qty().isNegative()) {
				rslt1R.not_cmpl_qty(MCNumber.ZERO);
			}
		}
	}

	protected String[] getRslt2Keys() {
		return new String[] {
				Rslt2R.$itm_cd,
				Rslt2R.$itm_sub1,
				Rslt2R.$itm_sub2,
				Rslt2R.$itm_sub3
		};
	}

	protected String[] getGiRslt2Keys() {
		return new String[] {
				Rslt2R.$itm_cd,
				Rslt2R.$itm_sub1,
				Rslt2R.$itm_sub2,
				Rslt2R.$itm_sub3,
				Rslt2R.$gi_loc_cd
		};
	}

	protected String[] getGrRslt2Keys() {
		return new String[] {
				Rslt2R.$itm_cd,
				Rslt2R.$itm_sub1,
				Rslt2R.$itm_sub2,
				Rslt2R.$itm_sub3,
				Rslt2R.$gr_loc_cd
		};
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
	protected void setCellConfig() {
		super.setCellConfig();
		Rslt1Table.setCellConfig(crtRslt1CellConfig());
		Rslt2Table.setCellConfig(crtRslt2CellConfig());
	}

	protected Rslt1CellConfig crtRslt1CellConfig() {
		return new Rslt1CellConfig();
	}

	protected class Rslt1CellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				Rslt1R r = (Rslt1R) table.getBaseTable().getRow(index);

				if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(columnRslt1_gi_loc_cd == column
							|| columnRslt1_gi_schd_dt == column
							|| columnRslt1_gi_schd_hm == column
					) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					if(columnRslt1_sppl_cd == column
							|| columnRslt1_maker_cd == column
							|| columnRslt1_mfg_loc_cd == column
							|| columnRslt1_bom_ptn == column
					) {
						return MCMode.READ_ONLY;
					}
				}

				if(columnRslt1_re_prms_ntc_flg == column) {
					if(!r.prms_ntc_flg() || !r.last_prms_ntc_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				if (isLinkedToPrmsCol(column)) {

					MCList<Rslt2R> rslt2L = null;
					rslt2L = _rslt2L.get(r.wg_rqst_no())
							.subList(r2 -> !isSame(MCRow.DELETE, r2.getStatus()));
					if (rslt2L.size() == 0 || 2 <= rslt2L.size()) {
						return MCMode.READ_ONLY;
					}
					else {
						super.getPriorMode(index, column, table);
					}
				}

				if(columnRslt1_fix_dt == column) {
					if(!r.fix_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}

				if(columnRslt1_prms_dt == column) {
					if(!r.prms_ntc_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}

				if(columnRslt1_re_prms_ntc_flg == column) {
					if(!r.prms_ntc_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				if(columnRslt1_re_prms_dt == column) {
					if(!r.re_prms_ntc_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}

				if (column == columnRslt1_sppl_cd
						|| column == columnRslt1_maker_cd
				) {
					if(!isNullOrNullVal(r.mfg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				// 取引単位、取引単位数量
				if(columnRslt1_prms_trd_unit_cd == column
						|| columnRslt1_prms_trd_unit_qty == column
				) {
					if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected boolean isLinkedToPrmsCol (MCColumnConfig column){
		if(columnRslt1_fix_flg == column 
				|| columnRslt1_fix_dt == column
				|| columnRslt1_can_flg == column
				|| columnRslt1_gr_schd_dt == column
				|| columnRslt1_gr_schd_hm == column
				|| columnRslt1_gi_schd_dt == column
				|| columnRslt1_gi_schd_hm == column
				|| columnRslt1_gi_loc_cd == column
				|| columnRslt1_gi_str_ln_cd == column
				|| columnRslt1_gi_str_ln_cd_none_flg == column
				|| columnRslt1_prms_trd_unit_cd == column
				|| columnRslt1_prms_trd_unit_qty == column
				|| columnRslt1_mfg_loc_cd == column
				|| columnRslt1_bom_ptn == column
				|| columnRslt1_sppl_cd == column
				|| columnRslt1_maker_cd == column
				|| columnRslt1_prms_rmrks == column
				|| columnRslt1_intr_rmrks == column
				|| columnRslt1_sub_char1 == column
				|| columnRslt1_sub_char2 == column
				|| columnRslt1_sub_char3 == column) {
			return true;
		}
		else {
			return false;
		}
	}

	protected Rslt2CellConfig crtRslt2CellConfig() {
		return new Rslt2CellConfig();
	}

	protected class Rslt2CellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				Rslt2R r = (Rslt2R) table.getBaseTable().getRow(index);
				if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				if(columnRslt2_gi_schd_dt == column
						|| columnRslt2_gi_schd_hm == column
						|| columnRslt2_gi_loc_cd == column
						|| columnRslt2_gi_str_ln_cd == column
				) {
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if(columnRslt2_mfg_loc_cd == column
						|| columnRslt2_bom_ptn == column
						|| columnRslt2_sppl_cd == column
						|| columnRslt2_maker_cd == column
				) {
					if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if(columnRslt2_fix_dt == column) {
					if(!r.fix_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}

				if (column == columnRslt2_sppl_cd
						|| column == columnRslt2_maker_cd
				) {
					if(!isNullOrNullVal(r.mfg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				// 取引単位、取引単位数量
				if(columnRslt2_prms_trd_unit_cd == column
						|| columnRslt2_prms_trd_unit_qty == column
				) {
					if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
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

	protected String[] getStkChgRsltKeys() {
		return new String[] {
				StkChgRsltR.$itm_cd,
				StkChgRsltR.$itm_sub1,
				StkChgRsltR.$itm_sub2,
				StkChgRsltR.$itm_sub3,
				StkChgRsltR.$loc_cd
		};
	}

	/** 明細のデータ項目の配列を返します */
	protected MCColumnConfig[] getQtys() {
		if (_qtys == null) {
			_qtys = new MCColumnConfig[] {
					columnDispStkChgRslt_qty00, columnDispStkChgRslt_qty01, columnDispStkChgRslt_qty02,
					columnDispStkChgRslt_qty03, columnDispStkChgRslt_qty04, columnDispStkChgRslt_qty05,
					columnDispStkChgRslt_qty06, columnDispStkChgRslt_qty07, columnDispStkChgRslt_qty08,
					columnDispStkChgRslt_qty09, columnDispStkChgRslt_qty10, columnDispStkChgRslt_qty11,
					columnDispStkChgRslt_qty12, columnDispStkChgRslt_qty13, columnDispStkChgRslt_qty14,
					columnDispStkChgRslt_qty15, columnDispStkChgRslt_qty16, columnDispStkChgRslt_qty17,
					columnDispStkChgRslt_qty18, columnDispStkChgRslt_qty19, columnDispStkChgRslt_qty20,
					columnDispStkChgRslt_qty21, columnDispStkChgRslt_qty22, columnDispStkChgRslt_qty23,
					columnDispStkChgRslt_qty24, columnDispStkChgRslt_qty25, columnDispStkChgRslt_qty26,
					columnDispStkChgRslt_qty27, columnDispStkChgRslt_qty28, columnDispStkChgRslt_qty29,
					columnDispStkChgRslt_qty30, columnDispStkChgRslt_qty31, columnDispStkChgRslt_qty32,
					columnDispStkChgRslt_qty33, columnDispStkChgRslt_qty34, columnDispStkChgRslt_qty35,
					columnDispStkChgRslt_qty36, columnDispStkChgRslt_qty37, columnDispStkChgRslt_qty38,
					columnDispStkChgRslt_qty39, columnDispStkChgRslt_qty40, columnDispStkChgRslt_qty41,
					columnDispStkChgRslt_qty42, columnDispStkChgRslt_qty43, columnDispStkChgRslt_qty44,
					columnDispStkChgRslt_qty45, columnDispStkChgRslt_qty46, columnDispStkChgRslt_qty47,
					columnDispStkChgRslt_qty48, columnDispStkChgRslt_qty49, columnDispStkChgRslt_qty50,
					columnDispStkChgRslt_qty51, columnDispStkChgRslt_qty52, columnDispStkChgRslt_qty53,
					columnDispStkChgRslt_qty54, columnDispStkChgRslt_qty55, columnDispStkChgRslt_qty56,
					columnDispStkChgRslt_qty57, columnDispStkChgRslt_qty58, columnDispStkChgRslt_qty59,
					columnDispStkChgRslt_qty60, columnDispStkChgRslt_qty61, columnDispStkChgRslt_qty62,
					columnDispStkChgRslt_qty63, columnDispStkChgRslt_qty64, columnDispStkChgRslt_qty65,
					columnDispStkChgRslt_qty66, columnDispStkChgRslt_qty67, columnDispStkChgRslt_qty68,
					columnDispStkChgRslt_qty69, columnDispStkChgRslt_qty70, columnDispStkChgRslt_qty71,
					columnDispStkChgRslt_qty72, columnDispStkChgRslt_qty73, columnDispStkChgRslt_qty74,
					columnDispStkChgRslt_qty75, columnDispStkChgRslt_qty76, columnDispStkChgRslt_qty77,
					columnDispStkChgRslt_qty78, columnDispStkChgRslt_qty79, columnDispStkChgRslt_qty80,
					columnDispStkChgRslt_qty81, columnDispStkChgRslt_qty82, columnDispStkChgRslt_qty83,
					columnDispStkChgRslt_qty84, columnDispStkChgRslt_qty85, columnDispStkChgRslt_qty86,
					columnDispStkChgRslt_qty87, columnDispStkChgRslt_qty88, columnDispStkChgRslt_qty89,
					columnDispStkChgRslt_qty90, columnDispStkChgRslt_qty91, columnDispStkChgRslt_qty92,
					columnDispStkChgRslt_qty93, columnDispStkChgRslt_qty94, columnDispStkChgRslt_qty95,
					columnDispStkChgRslt_qty96, columnDispStkChgRslt_qty97, columnDispStkChgRslt_qty98,
					columnDispStkChgRslt_qty99, columnDispStkChgRslt_qty100, columnDispStkChgRslt_qty101,
					columnDispStkChgRslt_qty102, columnDispStkChgRslt_qty103, columnDispStkChgRslt_qty104,
					columnDispStkChgRslt_qty105, columnDispStkChgRslt_qty106, columnDispStkChgRslt_qty107,
					columnDispStkChgRslt_qty108, columnDispStkChgRslt_qty109, columnDispStkChgRslt_qty110,
					columnDispStkChgRslt_qty111, columnDispStkChgRslt_qty112, columnDispStkChgRslt_qty113,
					columnDispStkChgRslt_qty114, columnDispStkChgRslt_qty115, columnDispStkChgRslt_qty116,
					columnDispStkChgRslt_qty117, columnDispStkChgRslt_qty118, columnDispStkChgRslt_qty119,
					columnDispStkChgRslt_qty120, columnDispStkChgRslt_qty121, columnDispStkChgRslt_qty122,
					columnDispStkChgRslt_qty123, columnDispStkChgRslt_qty124, columnDispStkChgRslt_qty125,
					columnDispStkChgRslt_qty126, columnDispStkChgRslt_qty127, columnDispStkChgRslt_qty128,
					columnDispStkChgRslt_qty129, columnDispStkChgRslt_qty130, columnDispStkChgRslt_qty131,
					columnDispStkChgRslt_qty132, columnDispStkChgRslt_qty133, columnDispStkChgRslt_qty134,
					columnDispStkChgRslt_qty135, columnDispStkChgRslt_qty136, columnDispStkChgRslt_qty137,
					columnDispStkChgRslt_qty138, columnDispStkChgRslt_qty139, columnDispStkChgRslt_qty140,
					columnDispStkChgRslt_qty141, columnDispStkChgRslt_qty142, columnDispStkChgRslt_qty143,
					columnDispStkChgRslt_qty144, columnDispStkChgRslt_qty145, columnDispStkChgRslt_qty146,
					columnDispStkChgRslt_qty147, columnDispStkChgRslt_qty148, columnDispStkChgRslt_qty149,
					columnDispStkChgRslt_qty150, columnDispStkChgRslt_qty151, columnDispStkChgRslt_qty152,
					columnDispStkChgRslt_qty153, columnDispStkChgRslt_qty154, columnDispStkChgRslt_qty155,
					columnDispStkChgRslt_qty156, columnDispStkChgRslt_qty157, columnDispStkChgRslt_qty158,
					columnDispStkChgRslt_qty159, columnDispStkChgRslt_qty160, columnDispStkChgRslt_qty161,
					columnDispStkChgRslt_qty162, columnDispStkChgRslt_qty163, columnDispStkChgRslt_qty164,
					columnDispStkChgRslt_qty165, columnDispStkChgRslt_qty166, columnDispStkChgRslt_qty167,
					columnDispStkChgRslt_qty168, columnDispStkChgRslt_qty169, columnDispStkChgRslt_qty170,
					columnDispStkChgRslt_qty171, columnDispStkChgRslt_qty172, columnDispStkChgRslt_qty173,
					columnDispStkChgRslt_qty174, columnDispStkChgRslt_qty175, columnDispStkChgRslt_qty176,
					columnDispStkChgRslt_qty177, columnDispStkChgRslt_qty178, columnDispStkChgRslt_qty179,
					columnDispStkChgRslt_qty180, columnDispStkChgRslt_qty181, columnDispStkChgRslt_qty182,
					columnDispStkChgRslt_qty183, columnDispStkChgRslt_qty184, columnDispStkChgRslt_qty185,
					columnDispStkChgRslt_qty186, columnDispStkChgRslt_qty187, columnDispStkChgRslt_qty188,
					columnDispStkChgRslt_qty189, columnDispStkChgRslt_qty190, columnDispStkChgRslt_qty191,
					columnDispStkChgRslt_qty192, columnDispStkChgRslt_qty193, columnDispStkChgRslt_qty194,
					columnDispStkChgRslt_qty195, columnDispStkChgRslt_qty196, columnDispStkChgRslt_qty197,
					columnDispStkChgRslt_qty198, columnDispStkChgRslt_qty199, columnDispStkChgRslt_qty200,
					columnDispStkChgRslt_qty201, columnDispStkChgRslt_qty202, columnDispStkChgRslt_qty203,
					columnDispStkChgRslt_qty204, columnDispStkChgRslt_qty205, columnDispStkChgRslt_qty206,
					columnDispStkChgRslt_qty207, columnDispStkChgRslt_qty208, columnDispStkChgRslt_qty209,
					columnDispStkChgRslt_qty210, columnDispStkChgRslt_qty211, columnDispStkChgRslt_qty212,
					columnDispStkChgRslt_qty213, columnDispStkChgRslt_qty214, columnDispStkChgRslt_qty215,
					columnDispStkChgRslt_qty216, columnDispStkChgRslt_qty217, columnDispStkChgRslt_qty218,
					columnDispStkChgRslt_qty219, columnDispStkChgRslt_qty220, columnDispStkChgRslt_qty221,
					columnDispStkChgRslt_qty222, columnDispStkChgRslt_qty223, columnDispStkChgRslt_qty224,
					columnDispStkChgRslt_qty225, columnDispStkChgRslt_qty226, columnDispStkChgRslt_qty227,
					columnDispStkChgRslt_qty228, columnDispStkChgRslt_qty229, columnDispStkChgRslt_qty230,
					columnDispStkChgRslt_qty231, columnDispStkChgRslt_qty232, columnDispStkChgRslt_qty233,
					columnDispStkChgRslt_qty234, columnDispStkChgRslt_qty235, columnDispStkChgRslt_qty236,
					columnDispStkChgRslt_qty237, columnDispStkChgRslt_qty238, columnDispStkChgRslt_qty239,
					columnDispStkChgRslt_qty240, columnDispStkChgRslt_qty241, columnDispStkChgRslt_qty242,
					columnDispStkChgRslt_qty243, columnDispStkChgRslt_qty244, columnDispStkChgRslt_qty245,
					columnDispStkChgRslt_qty246, columnDispStkChgRslt_qty247, columnDispStkChgRslt_qty248,
					columnDispStkChgRslt_qty249, columnDispStkChgRslt_qty250, columnDispStkChgRslt_qty251,
					columnDispStkChgRslt_qty252, columnDispStkChgRslt_qty253, columnDispStkChgRslt_qty254,
					columnDispStkChgRslt_qty255, columnDispStkChgRslt_qty256, columnDispStkChgRslt_qty257,
					columnDispStkChgRslt_qty258, columnDispStkChgRslt_qty259, columnDispStkChgRslt_qty260,
					columnDispStkChgRslt_qty261, columnDispStkChgRslt_qty262, columnDispStkChgRslt_qty263,
					columnDispStkChgRslt_qty264, columnDispStkChgRslt_qty265, columnDispStkChgRslt_qty266,
					columnDispStkChgRslt_qty267, columnDispStkChgRslt_qty268, columnDispStkChgRslt_qty269,
					columnDispStkChgRslt_qty270, columnDispStkChgRslt_qty271, columnDispStkChgRslt_qty272,
					columnDispStkChgRslt_qty273, columnDispStkChgRslt_qty274, columnDispStkChgRslt_qty275,
					columnDispStkChgRslt_qty276, columnDispStkChgRslt_qty277, columnDispStkChgRslt_qty278,
					columnDispStkChgRslt_qty279, columnDispStkChgRslt_qty280, columnDispStkChgRslt_qty281,
					columnDispStkChgRslt_qty282, columnDispStkChgRslt_qty283, columnDispStkChgRslt_qty284,
					columnDispStkChgRslt_qty285, columnDispStkChgRslt_qty286, columnDispStkChgRslt_qty287,
					columnDispStkChgRslt_qty288, columnDispStkChgRslt_qty289, columnDispStkChgRslt_qty290,
					columnDispStkChgRslt_qty291, columnDispStkChgRslt_qty292, columnDispStkChgRslt_qty293,
					columnDispStkChgRslt_qty294, columnDispStkChgRslt_qty295, columnDispStkChgRslt_qty296,
					columnDispStkChgRslt_qty297, columnDispStkChgRslt_qty298, columnDispStkChgRslt_qty299,
					columnDispStkChgRslt_qty300, columnDispStkChgRslt_qty301, columnDispStkChgRslt_qty302,
					columnDispStkChgRslt_qty303, columnDispStkChgRslt_qty304, columnDispStkChgRslt_qty305,
					columnDispStkChgRslt_qty306, columnDispStkChgRslt_qty307, columnDispStkChgRslt_qty308,
					columnDispStkChgRslt_qty309, columnDispStkChgRslt_qty310, columnDispStkChgRslt_qty311,
					columnDispStkChgRslt_qty312, columnDispStkChgRslt_qty313, columnDispStkChgRslt_qty314,
					columnDispStkChgRslt_qty315, columnDispStkChgRslt_qty316, columnDispStkChgRslt_qty317,
					columnDispStkChgRslt_qty318, columnDispStkChgRslt_qty319, columnDispStkChgRslt_qty320,
					columnDispStkChgRslt_qty321, columnDispStkChgRslt_qty322, columnDispStkChgRslt_qty323,
					columnDispStkChgRslt_qty324, columnDispStkChgRslt_qty325, columnDispStkChgRslt_qty326,
					columnDispStkChgRslt_qty327, columnDispStkChgRslt_qty328, columnDispStkChgRslt_qty329,
					columnDispStkChgRslt_qty330, columnDispStkChgRslt_qty331, columnDispStkChgRslt_qty332,
					columnDispStkChgRslt_qty333, columnDispStkChgRslt_qty334, columnDispStkChgRslt_qty335,
					columnDispStkChgRslt_qty336, columnDispStkChgRslt_qty337, columnDispStkChgRslt_qty338,
					columnDispStkChgRslt_qty339, columnDispStkChgRslt_qty340, columnDispStkChgRslt_qty341,
					columnDispStkChgRslt_qty342, columnDispStkChgRslt_qty343, columnDispStkChgRslt_qty344,
					columnDispStkChgRslt_qty345, columnDispStkChgRslt_qty346, columnDispStkChgRslt_qty347,
					columnDispStkChgRslt_qty348, columnDispStkChgRslt_qty349, columnDispStkChgRslt_qty350,
					columnDispStkChgRslt_qty351, columnDispStkChgRslt_qty352, columnDispStkChgRslt_qty353,
					columnDispStkChgRslt_qty354, columnDispStkChgRslt_qty355, columnDispStkChgRslt_qty356,
					columnDispStkChgRslt_qty357, columnDispStkChgRslt_qty358, columnDispStkChgRslt_qty359,
					columnDispStkChgRslt_qty360, columnDispStkChgRslt_qty361, columnDispStkChgRslt_qty362,
					columnDispStkChgRslt_qty363, columnDispStkChgRslt_qty364, columnDispStkChgRslt_qty365,
					columnDispStkChgRslt_qty366, columnDispStkChgRslt_qty367, columnDispStkChgRslt_qty368,
					columnDispStkChgRslt_qty369, columnDispStkChgRslt_qty370, columnDispStkChgRslt_qty371,
					columnDispStkChgRslt_qty372, columnDispStkChgRslt_qty373, columnDispStkChgRslt_qty374,
					columnDispStkChgRslt_qty375, columnDispStkChgRslt_qty376, columnDispStkChgRslt_qty377,
					columnDispStkChgRslt_qty378, columnDispStkChgRslt_qty379, columnDispStkChgRslt_qty380,
					columnDispStkChgRslt_qty381, columnDispStkChgRslt_qty382, columnDispStkChgRslt_qty383,
					columnDispStkChgRslt_qty384, columnDispStkChgRslt_qty385, columnDispStkChgRslt_qty386,
					columnDispStkChgRslt_qty387, columnDispStkChgRslt_qty388, columnDispStkChgRslt_qty389,
					columnDispStkChgRslt_qty390, columnDispStkChgRslt_qty391, columnDispStkChgRslt_qty392,
					columnDispStkChgRslt_qty393, columnDispStkChgRslt_qty394, columnDispStkChgRslt_qty395,
					columnDispStkChgRslt_qty396, columnDispStkChgRslt_qty397, columnDispStkChgRslt_qty398,
					columnDispStkChgRslt_qty399, columnDispStkChgRslt_qty400, columnDispStkChgRslt_qty401,
					columnDispStkChgRslt_qty402, columnDispStkChgRslt_qty403, columnDispStkChgRslt_qty404,
					columnDispStkChgRslt_qty405, columnDispStkChgRslt_qty406, columnDispStkChgRslt_qty407,
					columnDispStkChgRslt_qty408, columnDispStkChgRslt_qty409, columnDispStkChgRslt_qty410,
					columnDispStkChgRslt_qty411, columnDispStkChgRslt_qty412, columnDispStkChgRslt_qty413,
					columnDispStkChgRslt_qty414, columnDispStkChgRslt_qty415, columnDispStkChgRslt_qty416,
					columnDispStkChgRslt_qty417, columnDispStkChgRslt_qty418, columnDispStkChgRslt_qty419,
					columnDispStkChgRslt_qty420, columnDispStkChgRslt_qty421, columnDispStkChgRslt_qty422,
					columnDispStkChgRslt_qty423, columnDispStkChgRslt_qty424, columnDispStkChgRslt_qty425,
					columnDispStkChgRslt_qty426, columnDispStkChgRslt_qty427, columnDispStkChgRslt_qty428,
					columnDispStkChgRslt_qty429, columnDispStkChgRslt_qty430, columnDispStkChgRslt_qty431,
					columnDispStkChgRslt_qty432, columnDispStkChgRslt_qty433, columnDispStkChgRslt_qty434,
					columnDispStkChgRslt_qty435, columnDispStkChgRslt_qty436, columnDispStkChgRslt_qty437,
					columnDispStkChgRslt_qty438, columnDispStkChgRslt_qty439, columnDispStkChgRslt_qty440,
					columnDispStkChgRslt_qty441, columnDispStkChgRslt_qty442, columnDispStkChgRslt_qty443,
					columnDispStkChgRslt_qty444, columnDispStkChgRslt_qty445, columnDispStkChgRslt_qty446,
					columnDispStkChgRslt_qty447, columnDispStkChgRslt_qty448, columnDispStkChgRslt_qty449,
					columnDispStkChgRslt_qty450, columnDispStkChgRslt_qty451, columnDispStkChgRslt_qty452,
					columnDispStkChgRslt_qty453, columnDispStkChgRslt_qty454, columnDispStkChgRslt_qty455,
					columnDispStkChgRslt_qty456, columnDispStkChgRslt_qty457, columnDispStkChgRslt_qty458,
					columnDispStkChgRslt_qty459, columnDispStkChgRslt_qty460, columnDispStkChgRslt_qty461,
					columnDispStkChgRslt_qty462, columnDispStkChgRslt_qty463, columnDispStkChgRslt_qty464,
					columnDispStkChgRslt_qty465, columnDispStkChgRslt_qty466, columnDispStkChgRslt_qty467,
					columnDispStkChgRslt_qty468, columnDispStkChgRslt_qty469, columnDispStkChgRslt_qty470,
					columnDispStkChgRslt_qty471, columnDispStkChgRslt_qty472, columnDispStkChgRslt_qty473,
					columnDispStkChgRslt_qty474, columnDispStkChgRslt_qty475, columnDispStkChgRslt_qty476,
					columnDispStkChgRslt_qty477, columnDispStkChgRslt_qty478, columnDispStkChgRslt_qty479,
					columnDispStkChgRslt_qty480, columnDispStkChgRslt_qty481, columnDispStkChgRslt_qty482,
					columnDispStkChgRslt_qty483, columnDispStkChgRslt_qty484, columnDispStkChgRslt_qty485,
					columnDispStkChgRslt_qty486, columnDispStkChgRslt_qty487, columnDispStkChgRslt_qty488,
					columnDispStkChgRslt_qty489, columnDispStkChgRslt_qty490, columnDispStkChgRslt_qty491,
					columnDispStkChgRslt_qty492, columnDispStkChgRslt_qty493, columnDispStkChgRslt_qty494,
					columnDispStkChgRslt_qty495, columnDispStkChgRslt_qty496, columnDispStkChgRslt_qty497,
					columnDispStkChgRslt_qty498, columnDispStkChgRslt_qty499, columnDispStkChgRslt_qty500,
					columnDispStkChgRslt_qty501, columnDispStkChgRslt_qty502, columnDispStkChgRslt_qty503,
					columnDispStkChgRslt_qty504, columnDispStkChgRslt_qty505, columnDispStkChgRslt_qty506,
					columnDispStkChgRslt_qty507, columnDispStkChgRslt_qty508, columnDispStkChgRslt_qty509,
					columnDispStkChgRslt_qty510, columnDispStkChgRslt_qty511, columnDispStkChgRslt_qty512,
					columnDispStkChgRslt_qty513, columnDispStkChgRslt_qty514, columnDispStkChgRslt_qty515,
					columnDispStkChgRslt_qty516, columnDispStkChgRslt_qty517, columnDispStkChgRslt_qty518,
					columnDispStkChgRslt_qty519, columnDispStkChgRslt_qty520, columnDispStkChgRslt_qty521,
					columnDispStkChgRslt_qty522, columnDispStkChgRslt_qty523, columnDispStkChgRslt_qty524,
					columnDispStkChgRslt_qty525, columnDispStkChgRslt_qty526, columnDispStkChgRslt_qty527,
					columnDispStkChgRslt_qty528, columnDispStkChgRslt_qty529, columnDispStkChgRslt_qty530,
					columnDispStkChgRslt_qty531, columnDispStkChgRslt_qty532, columnDispStkChgRslt_qty533,
					columnDispStkChgRslt_qty534, columnDispStkChgRslt_qty535, columnDispStkChgRslt_qty536,
					columnDispStkChgRslt_qty537, columnDispStkChgRslt_qty538, columnDispStkChgRslt_qty539,
					columnDispStkChgRslt_qty540, columnDispStkChgRslt_qty541, columnDispStkChgRslt_qty542,
					columnDispStkChgRslt_qty543, columnDispStkChgRslt_qty544, columnDispStkChgRslt_qty545,
					columnDispStkChgRslt_qty546, columnDispStkChgRslt_qty547, columnDispStkChgRslt_qty548,
					columnDispStkChgRslt_qty549, columnDispStkChgRslt_qty550, columnDispStkChgRslt_qty551,
					columnDispStkChgRslt_qty552, columnDispStkChgRslt_qty553, columnDispStkChgRslt_qty554,
					columnDispStkChgRslt_qty555, columnDispStkChgRslt_qty556, columnDispStkChgRslt_qty557,
					columnDispStkChgRslt_qty558, columnDispStkChgRslt_qty559, columnDispStkChgRslt_qty560,
					columnDispStkChgRslt_qty561, columnDispStkChgRslt_qty562, columnDispStkChgRslt_qty563,
					columnDispStkChgRslt_qty564, columnDispStkChgRslt_qty565, columnDispStkChgRslt_qty566,
					columnDispStkChgRslt_qty567, columnDispStkChgRslt_qty568, columnDispStkChgRslt_qty569,
					columnDispStkChgRslt_qty570, columnDispStkChgRslt_qty571, columnDispStkChgRslt_qty572,
					columnDispStkChgRslt_qty573, columnDispStkChgRslt_qty574, columnDispStkChgRslt_qty575,
					columnDispStkChgRslt_qty576, columnDispStkChgRslt_qty577, columnDispStkChgRslt_qty578,
					columnDispStkChgRslt_qty579, columnDispStkChgRslt_qty580, columnDispStkChgRslt_qty581,
					columnDispStkChgRslt_qty582, columnDispStkChgRslt_qty583, columnDispStkChgRslt_qty584,
					columnDispStkChgRslt_qty585, columnDispStkChgRslt_qty586, columnDispStkChgRslt_qty587,
					columnDispStkChgRslt_qty588, columnDispStkChgRslt_qty589, columnDispStkChgRslt_qty590,
					columnDispStkChgRslt_qty591, columnDispStkChgRslt_qty592, columnDispStkChgRslt_qty593,
					columnDispStkChgRslt_qty594, columnDispStkChgRslt_qty595, columnDispStkChgRslt_qty596,
					columnDispStkChgRslt_qty597, columnDispStkChgRslt_qty598, columnDispStkChgRslt_qty599,
					columnDispStkChgRslt_qty600, columnDispStkChgRslt_qty601, columnDispStkChgRslt_qty602,
					columnDispStkChgRslt_qty603, columnDispStkChgRslt_qty604, columnDispStkChgRslt_qty605,
					columnDispStkChgRslt_qty606, columnDispStkChgRslt_qty607, columnDispStkChgRslt_qty608,
					columnDispStkChgRslt_qty609, columnDispStkChgRslt_qty610, columnDispStkChgRslt_qty611,
					columnDispStkChgRslt_qty612, columnDispStkChgRslt_qty613, columnDispStkChgRslt_qty614,
					columnDispStkChgRslt_qty615, columnDispStkChgRslt_qty616, columnDispStkChgRslt_qty617,
					columnDispStkChgRslt_qty618, columnDispStkChgRslt_qty619, columnDispStkChgRslt_qty620,
					columnDispStkChgRslt_qty621, columnDispStkChgRslt_qty622, columnDispStkChgRslt_qty623,
					columnDispStkChgRslt_qty624, columnDispStkChgRslt_qty625, columnDispStkChgRslt_qty626,
					columnDispStkChgRslt_qty627, columnDispStkChgRslt_qty628, columnDispStkChgRslt_qty629,
					columnDispStkChgRslt_qty630, columnDispStkChgRslt_qty631, columnDispStkChgRslt_qty632,
					columnDispStkChgRslt_qty633, columnDispStkChgRslt_qty634, columnDispStkChgRslt_qty635,
					columnDispStkChgRslt_qty636, columnDispStkChgRslt_qty637, columnDispStkChgRslt_qty638,
					columnDispStkChgRslt_qty639, columnDispStkChgRslt_qty640, columnDispStkChgRslt_qty641,
					columnDispStkChgRslt_qty642, columnDispStkChgRslt_qty643, columnDispStkChgRslt_qty644,
					columnDispStkChgRslt_qty645, columnDispStkChgRslt_qty646, columnDispStkChgRslt_qty647,
					columnDispStkChgRslt_qty648, columnDispStkChgRslt_qty649, columnDispStkChgRslt_qty650,
					columnDispStkChgRslt_qty651, columnDispStkChgRslt_qty652, columnDispStkChgRslt_qty653,
					columnDispStkChgRslt_qty654, columnDispStkChgRslt_qty655, columnDispStkChgRslt_qty656,
					columnDispStkChgRslt_qty657, columnDispStkChgRslt_qty658, columnDispStkChgRslt_qty659,
					columnDispStkChgRslt_qty660, columnDispStkChgRslt_qty661, columnDispStkChgRslt_qty662,
					columnDispStkChgRslt_qty663, columnDispStkChgRslt_qty664, columnDispStkChgRslt_qty665,
					columnDispStkChgRslt_qty666, columnDispStkChgRslt_qty667, columnDispStkChgRslt_qty668,
					columnDispStkChgRslt_qty669, columnDispStkChgRslt_qty670, columnDispStkChgRslt_qty671,
					columnDispStkChgRslt_qty672, columnDispStkChgRslt_qty673, columnDispStkChgRslt_qty674,
					columnDispStkChgRslt_qty675, columnDispStkChgRslt_qty676, columnDispStkChgRslt_qty677,
					columnDispStkChgRslt_qty678, columnDispStkChgRslt_qty679, columnDispStkChgRslt_qty680,
					columnDispStkChgRslt_qty681, columnDispStkChgRslt_qty682, columnDispStkChgRslt_qty683,
					columnDispStkChgRslt_qty684, columnDispStkChgRslt_qty685, columnDispStkChgRslt_qty686,
					columnDispStkChgRslt_qty687, columnDispStkChgRslt_qty688, columnDispStkChgRslt_qty689,
					columnDispStkChgRslt_qty690, columnDispStkChgRslt_qty691, columnDispStkChgRslt_qty692,
					columnDispStkChgRslt_qty693, columnDispStkChgRslt_qty694, columnDispStkChgRslt_qty695,
					columnDispStkChgRslt_qty696, columnDispStkChgRslt_qty697, columnDispStkChgRslt_qty698,
					columnDispStkChgRslt_qty699, columnDispStkChgRslt_qty700, columnDispStkChgRslt_qty701,
					columnDispStkChgRslt_qty702, columnDispStkChgRslt_qty703, columnDispStkChgRslt_qty704,
					columnDispStkChgRslt_qty705, columnDispStkChgRslt_qty706, columnDispStkChgRslt_qty707,
					columnDispStkChgRslt_qty708, columnDispStkChgRslt_qty709, columnDispStkChgRslt_qty710,
					columnDispStkChgRslt_qty711, columnDispStkChgRslt_qty712, columnDispStkChgRslt_qty713,
					columnDispStkChgRslt_qty714, columnDispStkChgRslt_qty715, columnDispStkChgRslt_qty716,
					columnDispStkChgRslt_qty717, columnDispStkChgRslt_qty718, columnDispStkChgRslt_qty719,
					columnDispStkChgRslt_qty720, columnDispStkChgRslt_qty721, columnDispStkChgRslt_qty722,
					columnDispStkChgRslt_qty723, columnDispStkChgRslt_qty724, columnDispStkChgRslt_qty725,
					columnDispStkChgRslt_qty726, columnDispStkChgRslt_qty727, columnDispStkChgRslt_qty728,
					columnDispStkChgRslt_qty729, columnDispStkChgRslt_qty730, columnDispStkChgRslt_qty731,
					columnDispStkChgRslt_qty732, columnDispStkChgRslt_qty733, columnDispStkChgRslt_qty734,
					columnDispStkChgRslt_qty735, columnDispStkChgRslt_qty736, columnDispStkChgRslt_qty737,
					columnDispStkChgRslt_qty738, columnDispStkChgRslt_qty739, columnDispStkChgRslt_qty740,
					columnDispStkChgRslt_qty741, columnDispStkChgRslt_qty742, columnDispStkChgRslt_qty743,
					columnDispStkChgRslt_qty744, columnDispStkChgRslt_qty745, columnDispStkChgRslt_qty746,
					columnDispStkChgRslt_qty747, columnDispStkChgRslt_qty748, columnDispStkChgRslt_qty749,
					columnDispStkChgRslt_qty750, columnDispStkChgRslt_qty751, columnDispStkChgRslt_qty752,
					columnDispStkChgRslt_qty753, columnDispStkChgRslt_qty754, columnDispStkChgRslt_qty755,
					columnDispStkChgRslt_qty756, columnDispStkChgRslt_qty757, columnDispStkChgRslt_qty758,
					columnDispStkChgRslt_qty759, columnDispStkChgRslt_qty760, columnDispStkChgRslt_qty761,
					columnDispStkChgRslt_qty762, columnDispStkChgRslt_qty763, columnDispStkChgRslt_qty764,
					columnDispStkChgRslt_qty765, columnDispStkChgRslt_qty766, columnDispStkChgRslt_qty767,
					columnDispStkChgRslt_qty768, columnDispStkChgRslt_qty769, columnDispStkChgRslt_qty770,
					columnDispStkChgRslt_qty771, columnDispStkChgRslt_qty772, columnDispStkChgRslt_qty773,
					columnDispStkChgRslt_qty774, columnDispStkChgRslt_qty775, columnDispStkChgRslt_qty776,
					columnDispStkChgRslt_qty777, columnDispStkChgRslt_qty778, columnDispStkChgRslt_qty779,
					columnDispStkChgRslt_qty780, columnDispStkChgRslt_qty781, columnDispStkChgRslt_qty782,
					columnDispStkChgRslt_qty783, columnDispStkChgRslt_qty784, columnDispStkChgRslt_qty785,
					columnDispStkChgRslt_qty786, columnDispStkChgRslt_qty787, columnDispStkChgRslt_qty788,
					columnDispStkChgRslt_qty789, columnDispStkChgRslt_qty790, columnDispStkChgRslt_qty791,
					columnDispStkChgRslt_qty792, columnDispStkChgRslt_qty793, columnDispStkChgRslt_qty794,
					columnDispStkChgRslt_qty795, columnDispStkChgRslt_qty796, columnDispStkChgRslt_qty797,
					columnDispStkChgRslt_qty798, columnDispStkChgRslt_qty799, columnDispStkChgRslt_qty800,
					columnDispStkChgRslt_qty801, columnDispStkChgRslt_qty802, columnDispStkChgRslt_qty803,
					columnDispStkChgRslt_qty804, columnDispStkChgRslt_qty805, columnDispStkChgRslt_qty806,
					columnDispStkChgRslt_qty807, columnDispStkChgRslt_qty808, columnDispStkChgRslt_qty809,
					columnDispStkChgRslt_qty810, columnDispStkChgRslt_qty811, columnDispStkChgRslt_qty812,
					columnDispStkChgRslt_qty813, columnDispStkChgRslt_qty814, columnDispStkChgRslt_qty815,
					columnDispStkChgRslt_qty816, columnDispStkChgRslt_qty817, columnDispStkChgRslt_qty818,
					columnDispStkChgRslt_qty819, columnDispStkChgRslt_qty820, columnDispStkChgRslt_qty821,
					columnDispStkChgRslt_qty822, columnDispStkChgRslt_qty823, columnDispStkChgRslt_qty824,
					columnDispStkChgRslt_qty825, columnDispStkChgRslt_qty826, columnDispStkChgRslt_qty827,
					columnDispStkChgRslt_qty828, columnDispStkChgRslt_qty829, columnDispStkChgRslt_qty830,
					columnDispStkChgRslt_qty831, columnDispStkChgRslt_qty832, columnDispStkChgRslt_qty833,
					columnDispStkChgRslt_qty834, columnDispStkChgRslt_qty835, columnDispStkChgRslt_qty836,
					columnDispStkChgRslt_qty837, columnDispStkChgRslt_qty838, columnDispStkChgRslt_qty839,
					columnDispStkChgRslt_qty840, columnDispStkChgRslt_qty841, columnDispStkChgRslt_qty842,
					columnDispStkChgRslt_qty843, columnDispStkChgRslt_qty844, columnDispStkChgRslt_qty845,
					columnDispStkChgRslt_qty846, columnDispStkChgRslt_qty847, columnDispStkChgRslt_qty848,
					columnDispStkChgRslt_qty849, columnDispStkChgRslt_qty850, columnDispStkChgRslt_qty851,
					columnDispStkChgRslt_qty852, columnDispStkChgRslt_qty853, columnDispStkChgRslt_qty854,
					columnDispStkChgRslt_qty855, columnDispStkChgRslt_qty856, columnDispStkChgRslt_qty857,
					columnDispStkChgRslt_qty858, columnDispStkChgRslt_qty859, columnDispStkChgRslt_qty860,
					columnDispStkChgRslt_qty861, columnDispStkChgRslt_qty862, columnDispStkChgRslt_qty863,
					columnDispStkChgRslt_qty864, columnDispStkChgRslt_qty865, columnDispStkChgRslt_qty866,
					columnDispStkChgRslt_qty867, columnDispStkChgRslt_qty868, columnDispStkChgRslt_qty869,
					columnDispStkChgRslt_qty870, columnDispStkChgRslt_qty871, columnDispStkChgRslt_qty872,
					columnDispStkChgRslt_qty873, columnDispStkChgRslt_qty874, columnDispStkChgRslt_qty875,
					columnDispStkChgRslt_qty876, columnDispStkChgRslt_qty877, columnDispStkChgRslt_qty878,
					columnDispStkChgRslt_qty879, columnDispStkChgRslt_qty880, columnDispStkChgRslt_qty881,
					columnDispStkChgRslt_qty882, columnDispStkChgRslt_qty883, columnDispStkChgRslt_qty884,
					columnDispStkChgRslt_qty885, columnDispStkChgRslt_qty886, columnDispStkChgRslt_qty887,
					columnDispStkChgRslt_qty888, columnDispStkChgRslt_qty889, columnDispStkChgRslt_qty890,
					columnDispStkChgRslt_qty891, columnDispStkChgRslt_qty892, columnDispStkChgRslt_qty893,
					columnDispStkChgRslt_qty894, columnDispStkChgRslt_qty895, columnDispStkChgRslt_qty896,
					columnDispStkChgRslt_qty897, columnDispStkChgRslt_qty898, columnDispStkChgRslt_qty899,
					columnDispStkChgRslt_qty900, columnDispStkChgRslt_qty901, columnDispStkChgRslt_qty902,
					columnDispStkChgRslt_qty903, columnDispStkChgRslt_qty904, columnDispStkChgRslt_qty905,
					columnDispStkChgRslt_qty906, columnDispStkChgRslt_qty907, columnDispStkChgRslt_qty908,
					columnDispStkChgRslt_qty909, columnDispStkChgRslt_qty910, columnDispStkChgRslt_qty911,
					columnDispStkChgRslt_qty912, columnDispStkChgRslt_qty913, columnDispStkChgRslt_qty914,
					columnDispStkChgRslt_qty915, columnDispStkChgRslt_qty916, columnDispStkChgRslt_qty917,
					columnDispStkChgRslt_qty918, columnDispStkChgRslt_qty919, columnDispStkChgRslt_qty920,
					columnDispStkChgRslt_qty921, columnDispStkChgRslt_qty922, columnDispStkChgRslt_qty923,
					columnDispStkChgRslt_qty924, columnDispStkChgRslt_qty925, columnDispStkChgRslt_qty926,
					columnDispStkChgRslt_qty927, columnDispStkChgRslt_qty928, columnDispStkChgRslt_qty929,
					columnDispStkChgRslt_qty930, columnDispStkChgRslt_qty931, columnDispStkChgRslt_qty932,
					columnDispStkChgRslt_qty933, columnDispStkChgRslt_qty934, columnDispStkChgRslt_qty935,
					columnDispStkChgRslt_qty936, columnDispStkChgRslt_qty937, columnDispStkChgRslt_qty938,
					columnDispStkChgRslt_qty939, columnDispStkChgRslt_qty940, columnDispStkChgRslt_qty941,
					columnDispStkChgRslt_qty942, columnDispStkChgRslt_qty943, columnDispStkChgRslt_qty944,
					columnDispStkChgRslt_qty945, columnDispStkChgRslt_qty946, columnDispStkChgRslt_qty947,
					columnDispStkChgRslt_qty948, columnDispStkChgRslt_qty949, columnDispStkChgRslt_qty950,
					columnDispStkChgRslt_qty951, columnDispStkChgRslt_qty952, columnDispStkChgRslt_qty953,
					columnDispStkChgRslt_qty954, columnDispStkChgRslt_qty955, columnDispStkChgRslt_qty956,
					columnDispStkChgRslt_qty957, columnDispStkChgRslt_qty958, columnDispStkChgRslt_qty959,
					columnDispStkChgRslt_qty960, columnDispStkChgRslt_qty961, columnDispStkChgRslt_qty962,
					columnDispStkChgRslt_qty963, columnDispStkChgRslt_qty964, columnDispStkChgRslt_qty965,
					columnDispStkChgRslt_qty966, columnDispStkChgRslt_qty967, columnDispStkChgRslt_qty968,
					columnDispStkChgRslt_qty969, columnDispStkChgRslt_qty970, columnDispStkChgRslt_qty971,
					columnDispStkChgRslt_qty972, columnDispStkChgRslt_qty973, columnDispStkChgRslt_qty974,
					columnDispStkChgRslt_qty975, columnDispStkChgRslt_qty976, columnDispStkChgRslt_qty977,
					columnDispStkChgRslt_qty978, columnDispStkChgRslt_qty979, columnDispStkChgRslt_qty980,
					columnDispStkChgRslt_qty981, columnDispStkChgRslt_qty982, columnDispStkChgRslt_qty983,
					columnDispStkChgRslt_qty984, columnDispStkChgRslt_qty985, columnDispStkChgRslt_qty986,
					columnDispStkChgRslt_qty987, columnDispStkChgRslt_qty988, columnDispStkChgRslt_qty989,
					columnDispStkChgRslt_qty990, columnDispStkChgRslt_qty991, columnDispStkChgRslt_qty992,
					columnDispStkChgRslt_qty993, columnDispStkChgRslt_qty994, columnDispStkChgRslt_qty995,
					columnDispStkChgRslt_qty996, columnDispStkChgRslt_qty997, columnDispStkChgRslt_qty998,
					columnDispStkChgRslt_qty999, columnDispStkChgRslt_qty1000, columnDispStkChgRslt_qty1001,
					columnDispStkChgRslt_qty1002, columnDispStkChgRslt_qty1003, columnDispStkChgRslt_qty1004,
					columnDispStkChgRslt_qty1005, columnDispStkChgRslt_qty1006, columnDispStkChgRslt_qty1007,
					columnDispStkChgRslt_qty1008, columnDispStkChgRslt_qty1009, columnDispStkChgRslt_qty1010,
					columnDispStkChgRslt_qty1011, columnDispStkChgRslt_qty1012, columnDispStkChgRslt_qty1013,
					columnDispStkChgRslt_qty1014, columnDispStkChgRslt_qty1015, columnDispStkChgRslt_qty1016,
					columnDispStkChgRslt_qty1017, columnDispStkChgRslt_qty1018, columnDispStkChgRslt_qty1019,
					columnDispStkChgRslt_qty1020, columnDispStkChgRslt_qty1021, columnDispStkChgRslt_qty1022,
					columnDispStkChgRslt_qty1023, columnDispStkChgRslt_qty1024, columnDispStkChgRslt_qty1025,
					columnDispStkChgRslt_qty1026, columnDispStkChgRslt_qty1027, columnDispStkChgRslt_qty1028,
					columnDispStkChgRslt_qty1029, columnDispStkChgRslt_qty1030, columnDispStkChgRslt_qty1031,
					columnDispStkChgRslt_qty1032, columnDispStkChgRslt_qty1033, columnDispStkChgRslt_qty1034,
					columnDispStkChgRslt_qty1035, columnDispStkChgRslt_qty1036, columnDispStkChgRslt_qty1037,
					columnDispStkChgRslt_qty1038, columnDispStkChgRslt_qty1039, columnDispStkChgRslt_qty1040,
					columnDispStkChgRslt_qty1041, columnDispStkChgRslt_qty1042, columnDispStkChgRslt_qty1043,
					columnDispStkChgRslt_qty1044, columnDispStkChgRslt_qty1045, columnDispStkChgRslt_qty1046,
					columnDispStkChgRslt_qty1047, columnDispStkChgRslt_qty1048, columnDispStkChgRslt_qty1049,
					columnDispStkChgRslt_qty1050, columnDispStkChgRslt_qty1051, columnDispStkChgRslt_qty1052,
					columnDispStkChgRslt_qty1053, columnDispStkChgRslt_qty1054, columnDispStkChgRslt_qty1055,
					columnDispStkChgRslt_qty1056, columnDispStkChgRslt_qty1057, columnDispStkChgRslt_qty1058,
					columnDispStkChgRslt_qty1059, columnDispStkChgRslt_qty1060, columnDispStkChgRslt_qty1061,
					columnDispStkChgRslt_qty1062, columnDispStkChgRslt_qty1063, columnDispStkChgRslt_qty1064,
					columnDispStkChgRslt_qty1065, columnDispStkChgRslt_qty1066, columnDispStkChgRslt_qty1067,
					columnDispStkChgRslt_qty1068, columnDispStkChgRslt_qty1069, columnDispStkChgRslt_qty1070,
					columnDispStkChgRslt_qty1071, columnDispStkChgRslt_qty1072, columnDispStkChgRslt_qty1073,
					columnDispStkChgRslt_qty1074, columnDispStkChgRslt_qty1075, columnDispStkChgRslt_qty1076,
					columnDispStkChgRslt_qty1077, columnDispStkChgRslt_qty1078, columnDispStkChgRslt_qty1079,
					columnDispStkChgRslt_qty1080, columnDispStkChgRslt_qty1081, columnDispStkChgRslt_qty1082,
					columnDispStkChgRslt_qty1083, columnDispStkChgRslt_qty1084, columnDispStkChgRslt_qty1085,
					columnDispStkChgRslt_qty1086, columnDispStkChgRslt_qty1087, columnDispStkChgRslt_qty1088,
					columnDispStkChgRslt_qty1089, columnDispStkChgRslt_qty1090, columnDispStkChgRslt_qty1091,
					columnDispStkChgRslt_qty1092, columnDispStkChgRslt_qty1093, columnDispStkChgRslt_qty1094,
					columnDispStkChgRslt_qty1095, columnDispStkChgRslt_qty1096, columnDispStkChgRslt_qty1097,
					columnDispStkChgRslt_qty1098, columnDispStkChgRslt_qty1099
			};
		}
		return _qtys;
	}

	/** 項目名の配列を返します */
	protected String[] getColnm() {
		if (_qtyCols == null) {
			_qtyCols = new String[] {
					DispStkChgRsltR.$qty00, DispStkChgRsltR.$qty01, DispStkChgRsltR.$qty02,
					DispStkChgRsltR.$qty03, DispStkChgRsltR.$qty04, DispStkChgRsltR.$qty05,
					DispStkChgRsltR.$qty06, DispStkChgRsltR.$qty07, DispStkChgRsltR.$qty08,
					DispStkChgRsltR.$qty09, DispStkChgRsltR.$qty10, DispStkChgRsltR.$qty11,
					DispStkChgRsltR.$qty12, DispStkChgRsltR.$qty13, DispStkChgRsltR.$qty14,
					DispStkChgRsltR.$qty15, DispStkChgRsltR.$qty16, DispStkChgRsltR.$qty17,
					DispStkChgRsltR.$qty18, DispStkChgRsltR.$qty19, DispStkChgRsltR.$qty20,
					DispStkChgRsltR.$qty21, DispStkChgRsltR.$qty22, DispStkChgRsltR.$qty23,
					DispStkChgRsltR.$qty24, DispStkChgRsltR.$qty25, DispStkChgRsltR.$qty26,
					DispStkChgRsltR.$qty27, DispStkChgRsltR.$qty28, DispStkChgRsltR.$qty29,
					DispStkChgRsltR.$qty30, DispStkChgRsltR.$qty31, DispStkChgRsltR.$qty32,
					DispStkChgRsltR.$qty33, DispStkChgRsltR.$qty34, DispStkChgRsltR.$qty35,
					DispStkChgRsltR.$qty36, DispStkChgRsltR.$qty37, DispStkChgRsltR.$qty38,
					DispStkChgRsltR.$qty39, DispStkChgRsltR.$qty40, DispStkChgRsltR.$qty41,
					DispStkChgRsltR.$qty42, DispStkChgRsltR.$qty43, DispStkChgRsltR.$qty44,
					DispStkChgRsltR.$qty45, DispStkChgRsltR.$qty46, DispStkChgRsltR.$qty47,
					DispStkChgRsltR.$qty48, DispStkChgRsltR.$qty49, DispStkChgRsltR.$qty50,
					DispStkChgRsltR.$qty51, DispStkChgRsltR.$qty52, DispStkChgRsltR.$qty53,
					DispStkChgRsltR.$qty54, DispStkChgRsltR.$qty55, DispStkChgRsltR.$qty56,
					DispStkChgRsltR.$qty57, DispStkChgRsltR.$qty58, DispStkChgRsltR.$qty59,
					DispStkChgRsltR.$qty60, DispStkChgRsltR.$qty61, DispStkChgRsltR.$qty62,
					DispStkChgRsltR.$qty63, DispStkChgRsltR.$qty64, DispStkChgRsltR.$qty65,
					DispStkChgRsltR.$qty66, DispStkChgRsltR.$qty67, DispStkChgRsltR.$qty68,
					DispStkChgRsltR.$qty69, DispStkChgRsltR.$qty70, DispStkChgRsltR.$qty71,
					DispStkChgRsltR.$qty72, DispStkChgRsltR.$qty73, DispStkChgRsltR.$qty74,
					DispStkChgRsltR.$qty75, DispStkChgRsltR.$qty76, DispStkChgRsltR.$qty77,
					DispStkChgRsltR.$qty78, DispStkChgRsltR.$qty79, DispStkChgRsltR.$qty80,
					DispStkChgRsltR.$qty81, DispStkChgRsltR.$qty82, DispStkChgRsltR.$qty83,
					DispStkChgRsltR.$qty84, DispStkChgRsltR.$qty85, DispStkChgRsltR.$qty86,
					DispStkChgRsltR.$qty87, DispStkChgRsltR.$qty88, DispStkChgRsltR.$qty89,
					DispStkChgRsltR.$qty90, DispStkChgRsltR.$qty91, DispStkChgRsltR.$qty92,
					DispStkChgRsltR.$qty93, DispStkChgRsltR.$qty94, DispStkChgRsltR.$qty95,
					DispStkChgRsltR.$qty96, DispStkChgRsltR.$qty97, DispStkChgRsltR.$qty98,
					DispStkChgRsltR.$qty99, DispStkChgRsltR.$qty100, DispStkChgRsltR.$qty101,
					DispStkChgRsltR.$qty102, DispStkChgRsltR.$qty103, DispStkChgRsltR.$qty104,
					DispStkChgRsltR.$qty105, DispStkChgRsltR.$qty106, DispStkChgRsltR.$qty107,
					DispStkChgRsltR.$qty108, DispStkChgRsltR.$qty109, DispStkChgRsltR.$qty110,
					DispStkChgRsltR.$qty111, DispStkChgRsltR.$qty112, DispStkChgRsltR.$qty113,
					DispStkChgRsltR.$qty114, DispStkChgRsltR.$qty115, DispStkChgRsltR.$qty116,
					DispStkChgRsltR.$qty117, DispStkChgRsltR.$qty118, DispStkChgRsltR.$qty119,
					DispStkChgRsltR.$qty120, DispStkChgRsltR.$qty121, DispStkChgRsltR.$qty122,
					DispStkChgRsltR.$qty123, DispStkChgRsltR.$qty124, DispStkChgRsltR.$qty125,
					DispStkChgRsltR.$qty126, DispStkChgRsltR.$qty127, DispStkChgRsltR.$qty128,
					DispStkChgRsltR.$qty129, DispStkChgRsltR.$qty130, DispStkChgRsltR.$qty131,
					DispStkChgRsltR.$qty132, DispStkChgRsltR.$qty133, DispStkChgRsltR.$qty134,
					DispStkChgRsltR.$qty135, DispStkChgRsltR.$qty136, DispStkChgRsltR.$qty137,
					DispStkChgRsltR.$qty138, DispStkChgRsltR.$qty139, DispStkChgRsltR.$qty140,
					DispStkChgRsltR.$qty141, DispStkChgRsltR.$qty142, DispStkChgRsltR.$qty143,
					DispStkChgRsltR.$qty144, DispStkChgRsltR.$qty145, DispStkChgRsltR.$qty146,
					DispStkChgRsltR.$qty147, DispStkChgRsltR.$qty148, DispStkChgRsltR.$qty149,
					DispStkChgRsltR.$qty150, DispStkChgRsltR.$qty151, DispStkChgRsltR.$qty152,
					DispStkChgRsltR.$qty153, DispStkChgRsltR.$qty154, DispStkChgRsltR.$qty155,
					DispStkChgRsltR.$qty156, DispStkChgRsltR.$qty157, DispStkChgRsltR.$qty158,
					DispStkChgRsltR.$qty159, DispStkChgRsltR.$qty160, DispStkChgRsltR.$qty161,
					DispStkChgRsltR.$qty162, DispStkChgRsltR.$qty163, DispStkChgRsltR.$qty164,
					DispStkChgRsltR.$qty165, DispStkChgRsltR.$qty166, DispStkChgRsltR.$qty167,
					DispStkChgRsltR.$qty168, DispStkChgRsltR.$qty169, DispStkChgRsltR.$qty170,
					DispStkChgRsltR.$qty171, DispStkChgRsltR.$qty172, DispStkChgRsltR.$qty173,
					DispStkChgRsltR.$qty174, DispStkChgRsltR.$qty175, DispStkChgRsltR.$qty176,
					DispStkChgRsltR.$qty177, DispStkChgRsltR.$qty178, DispStkChgRsltR.$qty179,
					DispStkChgRsltR.$qty180, DispStkChgRsltR.$qty181, DispStkChgRsltR.$qty182,
					DispStkChgRsltR.$qty183, DispStkChgRsltR.$qty184, DispStkChgRsltR.$qty185,
					DispStkChgRsltR.$qty186, DispStkChgRsltR.$qty187, DispStkChgRsltR.$qty188,
					DispStkChgRsltR.$qty189, DispStkChgRsltR.$qty190, DispStkChgRsltR.$qty191,
					DispStkChgRsltR.$qty192, DispStkChgRsltR.$qty193, DispStkChgRsltR.$qty194,
					DispStkChgRsltR.$qty195, DispStkChgRsltR.$qty196, DispStkChgRsltR.$qty197,
					DispStkChgRsltR.$qty198, DispStkChgRsltR.$qty199, DispStkChgRsltR.$qty200,
					DispStkChgRsltR.$qty201, DispStkChgRsltR.$qty202, DispStkChgRsltR.$qty203,
					DispStkChgRsltR.$qty204, DispStkChgRsltR.$qty205, DispStkChgRsltR.$qty206,
					DispStkChgRsltR.$qty207, DispStkChgRsltR.$qty208, DispStkChgRsltR.$qty209,
					DispStkChgRsltR.$qty210, DispStkChgRsltR.$qty211, DispStkChgRsltR.$qty212,
					DispStkChgRsltR.$qty213, DispStkChgRsltR.$qty214, DispStkChgRsltR.$qty215,
					DispStkChgRsltR.$qty216, DispStkChgRsltR.$qty217, DispStkChgRsltR.$qty218,
					DispStkChgRsltR.$qty219, DispStkChgRsltR.$qty220, DispStkChgRsltR.$qty221,
					DispStkChgRsltR.$qty222, DispStkChgRsltR.$qty223, DispStkChgRsltR.$qty224,
					DispStkChgRsltR.$qty225, DispStkChgRsltR.$qty226, DispStkChgRsltR.$qty227,
					DispStkChgRsltR.$qty228, DispStkChgRsltR.$qty229, DispStkChgRsltR.$qty230,
					DispStkChgRsltR.$qty231, DispStkChgRsltR.$qty232, DispStkChgRsltR.$qty233,
					DispStkChgRsltR.$qty234, DispStkChgRsltR.$qty235, DispStkChgRsltR.$qty236,
					DispStkChgRsltR.$qty237, DispStkChgRsltR.$qty238, DispStkChgRsltR.$qty239,
					DispStkChgRsltR.$qty240, DispStkChgRsltR.$qty241, DispStkChgRsltR.$qty242,
					DispStkChgRsltR.$qty243, DispStkChgRsltR.$qty244, DispStkChgRsltR.$qty245,
					DispStkChgRsltR.$qty246, DispStkChgRsltR.$qty247, DispStkChgRsltR.$qty248,
					DispStkChgRsltR.$qty249, DispStkChgRsltR.$qty250, DispStkChgRsltR.$qty251,
					DispStkChgRsltR.$qty252, DispStkChgRsltR.$qty253, DispStkChgRsltR.$qty254,
					DispStkChgRsltR.$qty255, DispStkChgRsltR.$qty256, DispStkChgRsltR.$qty257,
					DispStkChgRsltR.$qty258, DispStkChgRsltR.$qty259, DispStkChgRsltR.$qty260,
					DispStkChgRsltR.$qty261, DispStkChgRsltR.$qty262, DispStkChgRsltR.$qty263,
					DispStkChgRsltR.$qty264, DispStkChgRsltR.$qty265, DispStkChgRsltR.$qty266,
					DispStkChgRsltR.$qty267, DispStkChgRsltR.$qty268, DispStkChgRsltR.$qty269,
					DispStkChgRsltR.$qty270, DispStkChgRsltR.$qty271, DispStkChgRsltR.$qty272,
					DispStkChgRsltR.$qty273, DispStkChgRsltR.$qty274, DispStkChgRsltR.$qty275,
					DispStkChgRsltR.$qty276, DispStkChgRsltR.$qty277, DispStkChgRsltR.$qty278,
					DispStkChgRsltR.$qty279, DispStkChgRsltR.$qty280, DispStkChgRsltR.$qty281,
					DispStkChgRsltR.$qty282, DispStkChgRsltR.$qty283, DispStkChgRsltR.$qty284,
					DispStkChgRsltR.$qty285, DispStkChgRsltR.$qty286, DispStkChgRsltR.$qty287,
					DispStkChgRsltR.$qty288, DispStkChgRsltR.$qty289, DispStkChgRsltR.$qty290,
					DispStkChgRsltR.$qty291, DispStkChgRsltR.$qty292, DispStkChgRsltR.$qty293,
					DispStkChgRsltR.$qty294, DispStkChgRsltR.$qty295, DispStkChgRsltR.$qty296,
					DispStkChgRsltR.$qty297, DispStkChgRsltR.$qty298, DispStkChgRsltR.$qty299,
					DispStkChgRsltR.$qty300, DispStkChgRsltR.$qty301, DispStkChgRsltR.$qty302,
					DispStkChgRsltR.$qty303, DispStkChgRsltR.$qty304, DispStkChgRsltR.$qty305,
					DispStkChgRsltR.$qty306, DispStkChgRsltR.$qty307, DispStkChgRsltR.$qty308,
					DispStkChgRsltR.$qty309, DispStkChgRsltR.$qty310, DispStkChgRsltR.$qty311,
					DispStkChgRsltR.$qty312, DispStkChgRsltR.$qty313, DispStkChgRsltR.$qty314,
					DispStkChgRsltR.$qty315, DispStkChgRsltR.$qty316, DispStkChgRsltR.$qty317,
					DispStkChgRsltR.$qty318, DispStkChgRsltR.$qty319, DispStkChgRsltR.$qty320,
					DispStkChgRsltR.$qty321, DispStkChgRsltR.$qty322, DispStkChgRsltR.$qty323,
					DispStkChgRsltR.$qty324, DispStkChgRsltR.$qty325, DispStkChgRsltR.$qty326,
					DispStkChgRsltR.$qty327, DispStkChgRsltR.$qty328, DispStkChgRsltR.$qty329,
					DispStkChgRsltR.$qty330, DispStkChgRsltR.$qty331, DispStkChgRsltR.$qty332,
					DispStkChgRsltR.$qty333, DispStkChgRsltR.$qty334, DispStkChgRsltR.$qty335,
					DispStkChgRsltR.$qty336, DispStkChgRsltR.$qty337, DispStkChgRsltR.$qty338,
					DispStkChgRsltR.$qty339, DispStkChgRsltR.$qty340, DispStkChgRsltR.$qty341,
					DispStkChgRsltR.$qty342, DispStkChgRsltR.$qty343, DispStkChgRsltR.$qty344,
					DispStkChgRsltR.$qty345, DispStkChgRsltR.$qty346, DispStkChgRsltR.$qty347,
					DispStkChgRsltR.$qty348, DispStkChgRsltR.$qty349, DispStkChgRsltR.$qty350,
					DispStkChgRsltR.$qty351, DispStkChgRsltR.$qty352, DispStkChgRsltR.$qty353,
					DispStkChgRsltR.$qty354, DispStkChgRsltR.$qty355, DispStkChgRsltR.$qty356,
					DispStkChgRsltR.$qty357, DispStkChgRsltR.$qty358, DispStkChgRsltR.$qty359,
					DispStkChgRsltR.$qty360, DispStkChgRsltR.$qty361, DispStkChgRsltR.$qty362,
					DispStkChgRsltR.$qty363, DispStkChgRsltR.$qty364, DispStkChgRsltR.$qty365,
					DispStkChgRsltR.$qty366, DispStkChgRsltR.$qty367, DispStkChgRsltR.$qty368,
					DispStkChgRsltR.$qty369, DispStkChgRsltR.$qty370, DispStkChgRsltR.$qty371,
					DispStkChgRsltR.$qty372, DispStkChgRsltR.$qty373, DispStkChgRsltR.$qty374,
					DispStkChgRsltR.$qty375, DispStkChgRsltR.$qty376, DispStkChgRsltR.$qty377,
					DispStkChgRsltR.$qty378, DispStkChgRsltR.$qty379, DispStkChgRsltR.$qty380,
					DispStkChgRsltR.$qty381, DispStkChgRsltR.$qty382, DispStkChgRsltR.$qty383,
					DispStkChgRsltR.$qty384, DispStkChgRsltR.$qty385, DispStkChgRsltR.$qty386,
					DispStkChgRsltR.$qty387, DispStkChgRsltR.$qty388, DispStkChgRsltR.$qty389,
					DispStkChgRsltR.$qty390, DispStkChgRsltR.$qty391, DispStkChgRsltR.$qty392,
					DispStkChgRsltR.$qty393, DispStkChgRsltR.$qty394, DispStkChgRsltR.$qty395,
					DispStkChgRsltR.$qty396, DispStkChgRsltR.$qty397, DispStkChgRsltR.$qty398,
					DispStkChgRsltR.$qty399, DispStkChgRsltR.$qty400, DispStkChgRsltR.$qty401,
					DispStkChgRsltR.$qty402, DispStkChgRsltR.$qty403, DispStkChgRsltR.$qty404,
					DispStkChgRsltR.$qty405, DispStkChgRsltR.$qty406, DispStkChgRsltR.$qty407,
					DispStkChgRsltR.$qty408, DispStkChgRsltR.$qty409, DispStkChgRsltR.$qty410,
					DispStkChgRsltR.$qty411, DispStkChgRsltR.$qty412, DispStkChgRsltR.$qty413,
					DispStkChgRsltR.$qty414, DispStkChgRsltR.$qty415, DispStkChgRsltR.$qty416,
					DispStkChgRsltR.$qty417, DispStkChgRsltR.$qty418, DispStkChgRsltR.$qty419,
					DispStkChgRsltR.$qty420, DispStkChgRsltR.$qty421, DispStkChgRsltR.$qty422,
					DispStkChgRsltR.$qty423, DispStkChgRsltR.$qty424, DispStkChgRsltR.$qty425,
					DispStkChgRsltR.$qty426, DispStkChgRsltR.$qty427, DispStkChgRsltR.$qty428,
					DispStkChgRsltR.$qty429, DispStkChgRsltR.$qty430, DispStkChgRsltR.$qty431,
					DispStkChgRsltR.$qty432, DispStkChgRsltR.$qty433, DispStkChgRsltR.$qty434,
					DispStkChgRsltR.$qty435, DispStkChgRsltR.$qty436, DispStkChgRsltR.$qty437,
					DispStkChgRsltR.$qty438, DispStkChgRsltR.$qty439, DispStkChgRsltR.$qty440,
					DispStkChgRsltR.$qty441, DispStkChgRsltR.$qty442, DispStkChgRsltR.$qty443,
					DispStkChgRsltR.$qty444, DispStkChgRsltR.$qty445, DispStkChgRsltR.$qty446,
					DispStkChgRsltR.$qty447, DispStkChgRsltR.$qty448, DispStkChgRsltR.$qty449,
					DispStkChgRsltR.$qty450, DispStkChgRsltR.$qty451, DispStkChgRsltR.$qty452,
					DispStkChgRsltR.$qty453, DispStkChgRsltR.$qty454, DispStkChgRsltR.$qty455,
					DispStkChgRsltR.$qty456, DispStkChgRsltR.$qty457, DispStkChgRsltR.$qty458,
					DispStkChgRsltR.$qty459, DispStkChgRsltR.$qty460, DispStkChgRsltR.$qty461,
					DispStkChgRsltR.$qty462, DispStkChgRsltR.$qty463, DispStkChgRsltR.$qty464,
					DispStkChgRsltR.$qty465, DispStkChgRsltR.$qty466, DispStkChgRsltR.$qty467,
					DispStkChgRsltR.$qty468, DispStkChgRsltR.$qty469, DispStkChgRsltR.$qty470,
					DispStkChgRsltR.$qty471, DispStkChgRsltR.$qty472, DispStkChgRsltR.$qty473,
					DispStkChgRsltR.$qty474, DispStkChgRsltR.$qty475, DispStkChgRsltR.$qty476,
					DispStkChgRsltR.$qty477, DispStkChgRsltR.$qty478, DispStkChgRsltR.$qty479,
					DispStkChgRsltR.$qty480, DispStkChgRsltR.$qty481, DispStkChgRsltR.$qty482,
					DispStkChgRsltR.$qty483, DispStkChgRsltR.$qty484, DispStkChgRsltR.$qty485,
					DispStkChgRsltR.$qty486, DispStkChgRsltR.$qty487, DispStkChgRsltR.$qty488,
					DispStkChgRsltR.$qty489, DispStkChgRsltR.$qty490, DispStkChgRsltR.$qty491,
					DispStkChgRsltR.$qty492, DispStkChgRsltR.$qty493, DispStkChgRsltR.$qty494,
					DispStkChgRsltR.$qty495, DispStkChgRsltR.$qty496, DispStkChgRsltR.$qty497,
					DispStkChgRsltR.$qty498, DispStkChgRsltR.$qty499, DispStkChgRsltR.$qty500,
					DispStkChgRsltR.$qty501, DispStkChgRsltR.$qty502, DispStkChgRsltR.$qty503,
					DispStkChgRsltR.$qty504, DispStkChgRsltR.$qty505, DispStkChgRsltR.$qty506,
					DispStkChgRsltR.$qty507, DispStkChgRsltR.$qty508, DispStkChgRsltR.$qty509,
					DispStkChgRsltR.$qty510, DispStkChgRsltR.$qty511, DispStkChgRsltR.$qty512,
					DispStkChgRsltR.$qty513, DispStkChgRsltR.$qty514, DispStkChgRsltR.$qty515,
					DispStkChgRsltR.$qty516, DispStkChgRsltR.$qty517, DispStkChgRsltR.$qty518,
					DispStkChgRsltR.$qty519, DispStkChgRsltR.$qty520, DispStkChgRsltR.$qty521,
					DispStkChgRsltR.$qty522, DispStkChgRsltR.$qty523, DispStkChgRsltR.$qty524,
					DispStkChgRsltR.$qty525, DispStkChgRsltR.$qty526, DispStkChgRsltR.$qty527,
					DispStkChgRsltR.$qty528, DispStkChgRsltR.$qty529, DispStkChgRsltR.$qty530,
					DispStkChgRsltR.$qty531, DispStkChgRsltR.$qty532, DispStkChgRsltR.$qty533,
					DispStkChgRsltR.$qty534, DispStkChgRsltR.$qty535, DispStkChgRsltR.$qty536,
					DispStkChgRsltR.$qty537, DispStkChgRsltR.$qty538, DispStkChgRsltR.$qty539,
					DispStkChgRsltR.$qty540, DispStkChgRsltR.$qty541, DispStkChgRsltR.$qty542,
					DispStkChgRsltR.$qty543, DispStkChgRsltR.$qty544, DispStkChgRsltR.$qty545,
					DispStkChgRsltR.$qty546, DispStkChgRsltR.$qty547, DispStkChgRsltR.$qty548,
					DispStkChgRsltR.$qty549, DispStkChgRsltR.$qty550, DispStkChgRsltR.$qty551,
					DispStkChgRsltR.$qty552, DispStkChgRsltR.$qty553, DispStkChgRsltR.$qty554,
					DispStkChgRsltR.$qty555, DispStkChgRsltR.$qty556, DispStkChgRsltR.$qty557,
					DispStkChgRsltR.$qty558, DispStkChgRsltR.$qty559, DispStkChgRsltR.$qty560,
					DispStkChgRsltR.$qty561, DispStkChgRsltR.$qty562, DispStkChgRsltR.$qty563,
					DispStkChgRsltR.$qty564, DispStkChgRsltR.$qty565, DispStkChgRsltR.$qty566,
					DispStkChgRsltR.$qty567, DispStkChgRsltR.$qty568, DispStkChgRsltR.$qty569,
					DispStkChgRsltR.$qty570, DispStkChgRsltR.$qty571, DispStkChgRsltR.$qty572,
					DispStkChgRsltR.$qty573, DispStkChgRsltR.$qty574, DispStkChgRsltR.$qty575,
					DispStkChgRsltR.$qty576, DispStkChgRsltR.$qty577, DispStkChgRsltR.$qty578,
					DispStkChgRsltR.$qty579, DispStkChgRsltR.$qty580, DispStkChgRsltR.$qty581,
					DispStkChgRsltR.$qty582, DispStkChgRsltR.$qty583, DispStkChgRsltR.$qty584,
					DispStkChgRsltR.$qty585, DispStkChgRsltR.$qty586, DispStkChgRsltR.$qty587,
					DispStkChgRsltR.$qty588, DispStkChgRsltR.$qty589, DispStkChgRsltR.$qty590,
					DispStkChgRsltR.$qty591, DispStkChgRsltR.$qty592, DispStkChgRsltR.$qty593,
					DispStkChgRsltR.$qty594, DispStkChgRsltR.$qty595, DispStkChgRsltR.$qty596,
					DispStkChgRsltR.$qty597, DispStkChgRsltR.$qty598, DispStkChgRsltR.$qty599,
					DispStkChgRsltR.$qty600, DispStkChgRsltR.$qty601, DispStkChgRsltR.$qty602,
					DispStkChgRsltR.$qty603, DispStkChgRsltR.$qty604, DispStkChgRsltR.$qty605,
					DispStkChgRsltR.$qty606, DispStkChgRsltR.$qty607, DispStkChgRsltR.$qty608,
					DispStkChgRsltR.$qty609, DispStkChgRsltR.$qty610, DispStkChgRsltR.$qty611,
					DispStkChgRsltR.$qty612, DispStkChgRsltR.$qty613, DispStkChgRsltR.$qty614,
					DispStkChgRsltR.$qty615, DispStkChgRsltR.$qty616, DispStkChgRsltR.$qty617,
					DispStkChgRsltR.$qty618, DispStkChgRsltR.$qty619, DispStkChgRsltR.$qty620,
					DispStkChgRsltR.$qty621, DispStkChgRsltR.$qty622, DispStkChgRsltR.$qty623,
					DispStkChgRsltR.$qty624, DispStkChgRsltR.$qty625, DispStkChgRsltR.$qty626,
					DispStkChgRsltR.$qty627, DispStkChgRsltR.$qty628, DispStkChgRsltR.$qty629,
					DispStkChgRsltR.$qty630, DispStkChgRsltR.$qty631, DispStkChgRsltR.$qty632,
					DispStkChgRsltR.$qty633, DispStkChgRsltR.$qty634, DispStkChgRsltR.$qty635,
					DispStkChgRsltR.$qty636, DispStkChgRsltR.$qty637, DispStkChgRsltR.$qty638,
					DispStkChgRsltR.$qty639, DispStkChgRsltR.$qty640, DispStkChgRsltR.$qty641,
					DispStkChgRsltR.$qty642, DispStkChgRsltR.$qty643, DispStkChgRsltR.$qty644,
					DispStkChgRsltR.$qty645, DispStkChgRsltR.$qty646, DispStkChgRsltR.$qty647,
					DispStkChgRsltR.$qty648, DispStkChgRsltR.$qty649, DispStkChgRsltR.$qty650,
					DispStkChgRsltR.$qty651, DispStkChgRsltR.$qty652, DispStkChgRsltR.$qty653,
					DispStkChgRsltR.$qty654, DispStkChgRsltR.$qty655, DispStkChgRsltR.$qty656,
					DispStkChgRsltR.$qty657, DispStkChgRsltR.$qty658, DispStkChgRsltR.$qty659,
					DispStkChgRsltR.$qty660, DispStkChgRsltR.$qty661, DispStkChgRsltR.$qty662,
					DispStkChgRsltR.$qty663, DispStkChgRsltR.$qty664, DispStkChgRsltR.$qty665,
					DispStkChgRsltR.$qty666, DispStkChgRsltR.$qty667, DispStkChgRsltR.$qty668,
					DispStkChgRsltR.$qty669, DispStkChgRsltR.$qty670, DispStkChgRsltR.$qty671,
					DispStkChgRsltR.$qty672, DispStkChgRsltR.$qty673, DispStkChgRsltR.$qty674,
					DispStkChgRsltR.$qty675, DispStkChgRsltR.$qty676, DispStkChgRsltR.$qty677,
					DispStkChgRsltR.$qty678, DispStkChgRsltR.$qty679, DispStkChgRsltR.$qty680,
					DispStkChgRsltR.$qty681, DispStkChgRsltR.$qty682, DispStkChgRsltR.$qty683,
					DispStkChgRsltR.$qty684, DispStkChgRsltR.$qty685, DispStkChgRsltR.$qty686,
					DispStkChgRsltR.$qty687, DispStkChgRsltR.$qty688, DispStkChgRsltR.$qty689,
					DispStkChgRsltR.$qty690, DispStkChgRsltR.$qty691, DispStkChgRsltR.$qty692,
					DispStkChgRsltR.$qty693, DispStkChgRsltR.$qty694, DispStkChgRsltR.$qty695,
					DispStkChgRsltR.$qty696, DispStkChgRsltR.$qty697, DispStkChgRsltR.$qty698,
					DispStkChgRsltR.$qty699, DispStkChgRsltR.$qty700, DispStkChgRsltR.$qty701,
					DispStkChgRsltR.$qty702, DispStkChgRsltR.$qty703, DispStkChgRsltR.$qty704,
					DispStkChgRsltR.$qty705, DispStkChgRsltR.$qty706, DispStkChgRsltR.$qty707,
					DispStkChgRsltR.$qty708, DispStkChgRsltR.$qty709, DispStkChgRsltR.$qty710,
					DispStkChgRsltR.$qty711, DispStkChgRsltR.$qty712, DispStkChgRsltR.$qty713,
					DispStkChgRsltR.$qty714, DispStkChgRsltR.$qty715, DispStkChgRsltR.$qty716,
					DispStkChgRsltR.$qty717, DispStkChgRsltR.$qty718, DispStkChgRsltR.$qty719,
					DispStkChgRsltR.$qty720, DispStkChgRsltR.$qty721, DispStkChgRsltR.$qty722,
					DispStkChgRsltR.$qty723, DispStkChgRsltR.$qty724, DispStkChgRsltR.$qty725,
					DispStkChgRsltR.$qty726, DispStkChgRsltR.$qty727, DispStkChgRsltR.$qty728,
					DispStkChgRsltR.$qty729, DispStkChgRsltR.$qty730, DispStkChgRsltR.$qty731,
					DispStkChgRsltR.$qty732, DispStkChgRsltR.$qty733, DispStkChgRsltR.$qty734,
					DispStkChgRsltR.$qty735, DispStkChgRsltR.$qty736, DispStkChgRsltR.$qty737,
					DispStkChgRsltR.$qty738, DispStkChgRsltR.$qty739, DispStkChgRsltR.$qty740,
					DispStkChgRsltR.$qty741, DispStkChgRsltR.$qty742, DispStkChgRsltR.$qty743,
					DispStkChgRsltR.$qty744, DispStkChgRsltR.$qty745, DispStkChgRsltR.$qty746,
					DispStkChgRsltR.$qty747, DispStkChgRsltR.$qty748, DispStkChgRsltR.$qty749,
					DispStkChgRsltR.$qty750, DispStkChgRsltR.$qty751, DispStkChgRsltR.$qty752,
					DispStkChgRsltR.$qty753, DispStkChgRsltR.$qty754, DispStkChgRsltR.$qty755,
					DispStkChgRsltR.$qty756, DispStkChgRsltR.$qty757, DispStkChgRsltR.$qty758,
					DispStkChgRsltR.$qty759, DispStkChgRsltR.$qty760, DispStkChgRsltR.$qty761,
					DispStkChgRsltR.$qty762, DispStkChgRsltR.$qty763, DispStkChgRsltR.$qty764,
					DispStkChgRsltR.$qty765, DispStkChgRsltR.$qty766, DispStkChgRsltR.$qty767,
					DispStkChgRsltR.$qty768, DispStkChgRsltR.$qty769, DispStkChgRsltR.$qty770,
					DispStkChgRsltR.$qty771, DispStkChgRsltR.$qty772, DispStkChgRsltR.$qty773,
					DispStkChgRsltR.$qty774, DispStkChgRsltR.$qty775, DispStkChgRsltR.$qty776,
					DispStkChgRsltR.$qty777, DispStkChgRsltR.$qty778, DispStkChgRsltR.$qty779,
					DispStkChgRsltR.$qty780, DispStkChgRsltR.$qty781, DispStkChgRsltR.$qty782,
					DispStkChgRsltR.$qty783, DispStkChgRsltR.$qty784, DispStkChgRsltR.$qty785,
					DispStkChgRsltR.$qty786, DispStkChgRsltR.$qty787, DispStkChgRsltR.$qty788,
					DispStkChgRsltR.$qty789, DispStkChgRsltR.$qty790, DispStkChgRsltR.$qty791,
					DispStkChgRsltR.$qty792, DispStkChgRsltR.$qty793, DispStkChgRsltR.$qty794,
					DispStkChgRsltR.$qty795, DispStkChgRsltR.$qty796, DispStkChgRsltR.$qty797,
					DispStkChgRsltR.$qty798, DispStkChgRsltR.$qty799, DispStkChgRsltR.$qty800,
					DispStkChgRsltR.$qty801, DispStkChgRsltR.$qty802, DispStkChgRsltR.$qty803,
					DispStkChgRsltR.$qty804, DispStkChgRsltR.$qty805, DispStkChgRsltR.$qty806,
					DispStkChgRsltR.$qty807, DispStkChgRsltR.$qty808, DispStkChgRsltR.$qty809,
					DispStkChgRsltR.$qty810, DispStkChgRsltR.$qty811, DispStkChgRsltR.$qty812,
					DispStkChgRsltR.$qty813, DispStkChgRsltR.$qty814, DispStkChgRsltR.$qty815,
					DispStkChgRsltR.$qty816, DispStkChgRsltR.$qty817, DispStkChgRsltR.$qty818,
					DispStkChgRsltR.$qty819, DispStkChgRsltR.$qty820, DispStkChgRsltR.$qty821,
					DispStkChgRsltR.$qty822, DispStkChgRsltR.$qty823, DispStkChgRsltR.$qty824,
					DispStkChgRsltR.$qty825, DispStkChgRsltR.$qty826, DispStkChgRsltR.$qty827,
					DispStkChgRsltR.$qty828, DispStkChgRsltR.$qty829, DispStkChgRsltR.$qty830,
					DispStkChgRsltR.$qty831, DispStkChgRsltR.$qty832, DispStkChgRsltR.$qty833,
					DispStkChgRsltR.$qty834, DispStkChgRsltR.$qty835, DispStkChgRsltR.$qty836,
					DispStkChgRsltR.$qty837, DispStkChgRsltR.$qty838, DispStkChgRsltR.$qty839,
					DispStkChgRsltR.$qty840, DispStkChgRsltR.$qty841, DispStkChgRsltR.$qty842,
					DispStkChgRsltR.$qty843, DispStkChgRsltR.$qty844, DispStkChgRsltR.$qty845,
					DispStkChgRsltR.$qty846, DispStkChgRsltR.$qty847, DispStkChgRsltR.$qty848,
					DispStkChgRsltR.$qty849, DispStkChgRsltR.$qty850, DispStkChgRsltR.$qty851,
					DispStkChgRsltR.$qty852, DispStkChgRsltR.$qty853, DispStkChgRsltR.$qty854,
					DispStkChgRsltR.$qty855, DispStkChgRsltR.$qty856, DispStkChgRsltR.$qty857,
					DispStkChgRsltR.$qty858, DispStkChgRsltR.$qty859, DispStkChgRsltR.$qty860,
					DispStkChgRsltR.$qty861, DispStkChgRsltR.$qty862, DispStkChgRsltR.$qty863,
					DispStkChgRsltR.$qty864, DispStkChgRsltR.$qty865, DispStkChgRsltR.$qty866,
					DispStkChgRsltR.$qty867, DispStkChgRsltR.$qty868, DispStkChgRsltR.$qty869,
					DispStkChgRsltR.$qty870, DispStkChgRsltR.$qty871, DispStkChgRsltR.$qty872,
					DispStkChgRsltR.$qty873, DispStkChgRsltR.$qty874, DispStkChgRsltR.$qty875,
					DispStkChgRsltR.$qty876, DispStkChgRsltR.$qty877, DispStkChgRsltR.$qty878,
					DispStkChgRsltR.$qty879, DispStkChgRsltR.$qty880, DispStkChgRsltR.$qty881,
					DispStkChgRsltR.$qty882, DispStkChgRsltR.$qty883, DispStkChgRsltR.$qty884,
					DispStkChgRsltR.$qty885, DispStkChgRsltR.$qty886, DispStkChgRsltR.$qty887,
					DispStkChgRsltR.$qty888, DispStkChgRsltR.$qty889, DispStkChgRsltR.$qty890,
					DispStkChgRsltR.$qty891, DispStkChgRsltR.$qty892, DispStkChgRsltR.$qty893,
					DispStkChgRsltR.$qty894, DispStkChgRsltR.$qty895, DispStkChgRsltR.$qty896,
					DispStkChgRsltR.$qty897, DispStkChgRsltR.$qty898, DispStkChgRsltR.$qty899,
					DispStkChgRsltR.$qty900, DispStkChgRsltR.$qty901, DispStkChgRsltR.$qty902,
					DispStkChgRsltR.$qty903, DispStkChgRsltR.$qty904, DispStkChgRsltR.$qty905,
					DispStkChgRsltR.$qty906, DispStkChgRsltR.$qty907, DispStkChgRsltR.$qty908,
					DispStkChgRsltR.$qty909, DispStkChgRsltR.$qty910, DispStkChgRsltR.$qty911,
					DispStkChgRsltR.$qty912, DispStkChgRsltR.$qty913, DispStkChgRsltR.$qty914,
					DispStkChgRsltR.$qty915, DispStkChgRsltR.$qty916, DispStkChgRsltR.$qty917,
					DispStkChgRsltR.$qty918, DispStkChgRsltR.$qty919, DispStkChgRsltR.$qty920,
					DispStkChgRsltR.$qty921, DispStkChgRsltR.$qty922, DispStkChgRsltR.$qty923,
					DispStkChgRsltR.$qty924, DispStkChgRsltR.$qty925, DispStkChgRsltR.$qty926,
					DispStkChgRsltR.$qty927, DispStkChgRsltR.$qty928, DispStkChgRsltR.$qty929,
					DispStkChgRsltR.$qty930, DispStkChgRsltR.$qty931, DispStkChgRsltR.$qty932,
					DispStkChgRsltR.$qty933, DispStkChgRsltR.$qty934, DispStkChgRsltR.$qty935,
					DispStkChgRsltR.$qty936, DispStkChgRsltR.$qty937, DispStkChgRsltR.$qty938,
					DispStkChgRsltR.$qty939, DispStkChgRsltR.$qty940, DispStkChgRsltR.$qty941,
					DispStkChgRsltR.$qty942, DispStkChgRsltR.$qty943, DispStkChgRsltR.$qty944,
					DispStkChgRsltR.$qty945, DispStkChgRsltR.$qty946, DispStkChgRsltR.$qty947,
					DispStkChgRsltR.$qty948, DispStkChgRsltR.$qty949, DispStkChgRsltR.$qty950,
					DispStkChgRsltR.$qty951, DispStkChgRsltR.$qty952, DispStkChgRsltR.$qty953,
					DispStkChgRsltR.$qty954, DispStkChgRsltR.$qty955, DispStkChgRsltR.$qty956,
					DispStkChgRsltR.$qty957, DispStkChgRsltR.$qty958, DispStkChgRsltR.$qty959,
					DispStkChgRsltR.$qty960, DispStkChgRsltR.$qty961, DispStkChgRsltR.$qty962,
					DispStkChgRsltR.$qty963, DispStkChgRsltR.$qty964, DispStkChgRsltR.$qty965,
					DispStkChgRsltR.$qty966, DispStkChgRsltR.$qty967, DispStkChgRsltR.$qty968,
					DispStkChgRsltR.$qty969, DispStkChgRsltR.$qty970, DispStkChgRsltR.$qty971,
					DispStkChgRsltR.$qty972, DispStkChgRsltR.$qty973, DispStkChgRsltR.$qty974,
					DispStkChgRsltR.$qty975, DispStkChgRsltR.$qty976, DispStkChgRsltR.$qty977,
					DispStkChgRsltR.$qty978, DispStkChgRsltR.$qty979, DispStkChgRsltR.$qty980,
					DispStkChgRsltR.$qty981, DispStkChgRsltR.$qty982, DispStkChgRsltR.$qty983,
					DispStkChgRsltR.$qty984, DispStkChgRsltR.$qty985, DispStkChgRsltR.$qty986,
					DispStkChgRsltR.$qty987, DispStkChgRsltR.$qty988, DispStkChgRsltR.$qty989,
					DispStkChgRsltR.$qty990, DispStkChgRsltR.$qty991, DispStkChgRsltR.$qty992,
					DispStkChgRsltR.$qty993, DispStkChgRsltR.$qty994, DispStkChgRsltR.$qty995,
					DispStkChgRsltR.$qty996, DispStkChgRsltR.$qty997, DispStkChgRsltR.$qty998,
					DispStkChgRsltR.$qty999, DispStkChgRsltR.$qty1000, DispStkChgRsltR.$qty1001,
					DispStkChgRsltR.$qty1002, DispStkChgRsltR.$qty1003, DispStkChgRsltR.$qty1004,
					DispStkChgRsltR.$qty1005, DispStkChgRsltR.$qty1006, DispStkChgRsltR.$qty1007,
					DispStkChgRsltR.$qty1008, DispStkChgRsltR.$qty1009, DispStkChgRsltR.$qty1010,
					DispStkChgRsltR.$qty1011, DispStkChgRsltR.$qty1012, DispStkChgRsltR.$qty1013,
					DispStkChgRsltR.$qty1014, DispStkChgRsltR.$qty1015, DispStkChgRsltR.$qty1016,
					DispStkChgRsltR.$qty1017, DispStkChgRsltR.$qty1018, DispStkChgRsltR.$qty1019,
					DispStkChgRsltR.$qty1020, DispStkChgRsltR.$qty1021, DispStkChgRsltR.$qty1022,
					DispStkChgRsltR.$qty1023, DispStkChgRsltR.$qty1024, DispStkChgRsltR.$qty1025,
					DispStkChgRsltR.$qty1026, DispStkChgRsltR.$qty1027, DispStkChgRsltR.$qty1028,
					DispStkChgRsltR.$qty1029, DispStkChgRsltR.$qty1030, DispStkChgRsltR.$qty1031,
					DispStkChgRsltR.$qty1032, DispStkChgRsltR.$qty1033, DispStkChgRsltR.$qty1034,
					DispStkChgRsltR.$qty1035, DispStkChgRsltR.$qty1036, DispStkChgRsltR.$qty1037,
					DispStkChgRsltR.$qty1038, DispStkChgRsltR.$qty1039, DispStkChgRsltR.$qty1040,
					DispStkChgRsltR.$qty1041, DispStkChgRsltR.$qty1042, DispStkChgRsltR.$qty1043,
					DispStkChgRsltR.$qty1044, DispStkChgRsltR.$qty1045, DispStkChgRsltR.$qty1046,
					DispStkChgRsltR.$qty1047, DispStkChgRsltR.$qty1048, DispStkChgRsltR.$qty1049,
					DispStkChgRsltR.$qty1050, DispStkChgRsltR.$qty1051, DispStkChgRsltR.$qty1052,
					DispStkChgRsltR.$qty1053, DispStkChgRsltR.$qty1054, DispStkChgRsltR.$qty1055,
					DispStkChgRsltR.$qty1056, DispStkChgRsltR.$qty1057, DispStkChgRsltR.$qty1058,
					DispStkChgRsltR.$qty1059, DispStkChgRsltR.$qty1060, DispStkChgRsltR.$qty1061,
					DispStkChgRsltR.$qty1062, DispStkChgRsltR.$qty1063, DispStkChgRsltR.$qty1064,
					DispStkChgRsltR.$qty1065, DispStkChgRsltR.$qty1066, DispStkChgRsltR.$qty1067,
					DispStkChgRsltR.$qty1068, DispStkChgRsltR.$qty1069, DispStkChgRsltR.$qty1070,
					DispStkChgRsltR.$qty1071, DispStkChgRsltR.$qty1072, DispStkChgRsltR.$qty1073,
					DispStkChgRsltR.$qty1074, DispStkChgRsltR.$qty1075, DispStkChgRsltR.$qty1076,
					DispStkChgRsltR.$qty1077, DispStkChgRsltR.$qty1078, DispStkChgRsltR.$qty1079,
					DispStkChgRsltR.$qty1080, DispStkChgRsltR.$qty1081, DispStkChgRsltR.$qty1082,
					DispStkChgRsltR.$qty1083, DispStkChgRsltR.$qty1084, DispStkChgRsltR.$qty1085,
					DispStkChgRsltR.$qty1086, DispStkChgRsltR.$qty1087, DispStkChgRsltR.$qty1088,
					DispStkChgRsltR.$qty1089, DispStkChgRsltR.$qty1090, DispStkChgRsltR.$qty1091,
					DispStkChgRsltR.$qty1092, DispStkChgRsltR.$qty1093, DispStkChgRsltR.$qty1094,
					DispStkChgRsltR.$qty1095, DispStkChgRsltR.$qty1096, DispStkChgRsltR.$qty1097,
					DispStkChgRsltR.$qty1098, DispStkChgRsltR.$qty1099
				};
		}
		return _qtyCols;
	}

	protected MCSortPolicy crtSortVH() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, DispStkChgRsltR.$itm_cd);
		sp.add(SortType.ASC, DispStkChgRsltR.$itm_sub1);
		sp.add(SortType.ASC, DispStkChgRsltR.$itm_sub2);
		sp.add(SortType.ASC, DispStkChgRsltR.$itm_sub3);
		sp.add(SortType.ASC, DispStkChgRsltR.$wg_cd);
		sp.add(SortType.ASC, DispStkChgRsltR.$loc_cd);
		sp.add(SortType.ASC, DispStkChgRsltR.$sd_adjst_dtl_typ);
		return sp;
	}

	protected void clearCacheVH() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.initColInfo(MCList.create(MCRow.class));
		_vhM.clearElmColsLabel();

		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhM.clearCachedList();
	}

	protected void checkForCallStackSub(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(AdjstStsPanel));

		msgList.addAll(checkBeforeAfter(Cnd_rqst_dt_fr, Cnd_rqst_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_re_rqst_dt_fr, Cnd_re_rqst_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_srch_dt_fr, Cnd_srch_dt_to));
	}

	/**
	 * 在庫推移を計算する
	 */
	protected void calcStk() {
		MCIndexKey startTgtKey = _stkChgRsltBakL.createIndex(StkChgRsltR.$schd_dt,
				StkChgRsltR.$sd_adjst_dtl_typ);
		MCIndexKey idxKey2 = _stkChgRsltBakL.createIndex(StkChgRsltR.$itm_cd,
				StkChgRsltR.$itm_sub1, StkChgRsltR.$itm_sub2, StkChgRsltR.$itm_sub3,
				StkChgRsltR.$loc_cd, StkChgRsltR.$sd_adjst_dtl_typ, StkChgRsltR.$schd_dt);
		MCIndexKey grRqstRslt1Key = getRslt1L().createIndex(Rslt1R.$itm_cd,
				Rslt1R.$itm_sub1, Rslt1R.$itm_sub2, Rslt1R.$itm_sub3, Rslt1R.$gr_loc_cd,
				Rslt1R.$gr_rqst_dt);
		MCIndexKey giRqstRslt1Key = getRslt1L().createIndex(Rslt1R.$itm_cd,
				Rslt1R.$itm_sub1, Rslt1R.$itm_sub2, Rslt1R.$itm_sub3,
				Rslt1R.$rqst_gi_loc_cd, Rslt1R.$gi_rqst_dt);
		MCIndexKey rqstKey = getRslt1L().createIndex(Rslt1R.$wg_rqst_no);

		_StkChgRsltL.clear();
		MCNumber stk = MCNumber.ZERO;

		// 検索期間前の差分を考慮し、起点在庫を算出
		MCDate startDt = getCopyStkChgCndR().dt_fr().addDay(-1);
		StkChgRsltR calcStkR = _stkChgRsltBakL.getFirst(startTgtKey,
				startDt, MSC_SD_ADJST_DTL_TYP.STK.value());

		if(!isNull(calcStkR)) {
			stk = nvl(calcStkR.schd_qty(), MCNumber.ZERO);
		}

		DispStkChgRsltR giR = getDispStkChgRsltL().getFirst(DispStkChgRsltR.$sd_adjst_dtl_typ, MSC_SD_ADJST_DTL_TYP.GI.value());
		DispStkChgRsltR grR = getDispStkChgRsltL().getFirst(DispStkChgRsltR.$sd_adjst_dtl_typ, MSC_SD_ADJST_DTL_TYP.GR.value());
		DispStkChgRsltR stkR = getDispStkChgRsltL().getFirst(DispStkChgRsltR.$sd_adjst_dtl_typ, MSC_SD_ADJST_DTL_TYP.STK.value());
		stkR.qty00(stk);
		
		StkChgCndR cndR = getStkChgCndR();
		MCList<Rslt2R> rslt2L = MCList.create(Rslt2R.class);
		
		// 在庫推移期間より以前の残数の反映
		String[] r1Key = {Rslt1R.$itm_cd, Rslt1R.$itm_sub1, Rslt1R.$itm_sub2, Rslt1R.$itm_sub3};
		MCList<Rslt1R> rslt1L = getRslt1L().subList(r1Key, cndR.toArray(r1Key));
		for (Rslt1R r1 : rslt1L) {
			if(MSC_WG_RQST_TYP.isPURC(r1.wg_rqst_typ())) {
				MCList<Rslt2R> r2L = _rslt2L.get(r1.wg_rqst_no());
				if (startDt.gte(r1.gr_rqst_dt()) && isSame(r1.gr_loc_cd(), cndR.gi_loc_cd())) {
					MCNumber notCmplQty = getNotCmplQty(r1, r2L, MSC_IO_TYP.GR);
					grR.qty00(nvl(grR.qty00(), MCNumber.ZERO).add(notCmplQty));
					stkR.qty00(stkR.qty00().add(notCmplQty));
				}
				rslt2L.addAll(r2L);
			}
			else if(MSC_WG_RQST_TYP.isXFR(r1.wg_rqst_typ())) {
				MCList<Rslt2R> r2L = _rslt2L.get(r1.wg_rqst_no());
				if (startDt.gte(r1.gi_rqst_dt()) && isSame(r1.rqst_gi_loc_cd(), cndR.gi_loc_cd())) {
					MCNumber notCmplQty = getNotCmplQty(r1, r2L, MSC_IO_TYP.GI);
					giR.qty00(nvl(giR.qty00(), MCNumber.ZERO).add(notCmplQty));
					stkR.qty00(stkR.qty00().subtract(notCmplQty));
				}
				rslt2L.addAll(r2L);
			}
		}

		MCIndexKey grRqstKey = rslt2L.createIndex(Rslt2R.$wg_rqst_no, Rslt2R.$gr_loc_cd);
		MCIndexKey giRqstKey = rslt2L.createIndex(Rslt2R.$wg_rqst_no, Rslt2R.$gi_loc_cd);
		
		// 在庫推移期間より以前の回答数の反映
		MCList<Rslt2R>
			grRslt2L = rslt2L.subList(r2 -> isSame(r2.gr_loc_cd(), cndR.gi_loc_cd()) && r2.fix_flg()),
			giRslt2L = rslt2L.subList(r2 -> isSame(r2.gi_loc_cd(), cndR.gi_loc_cd()) && r2.fix_flg());

		for (Rslt2R r2 : grRslt2L) {
			if(MSC_WG_RQST_TYP.isPURC(r2.wg_rqst_typ())) {
				if (startDt.gte(r2.gr_schd_dt()) && isSame(r2.gr_loc_cd(), cndR.gi_loc_cd())) {
					MCNumber prmsQty = getPrmsQty(r2, MSC_IO_TYP.GR);
					grR.qty00(nvl(grR.qty00(), MCNumber.ZERO).add(prmsQty));
					stkR.qty00(stkR.qty00().add(prmsQty));
				}
			}
		}
		for (Rslt2R r2 : giRslt2L) {
			if(MSC_WG_RQST_TYP.isXFR(r2.wg_rqst_typ())) {
				if (startDt.gte(r2.gi_schd_dt())) {
					MCNumber prmsQty = getPrmsQty(r2, MSC_IO_TYP.GI);
					giR.qty00(nvl(giR.qty00(), MCNumber.ZERO).add(prmsQty));
					stkR.qty00(stkR.qty00().subtract(prmsQty));
				}
			}
		}
		stk = stkR.qty00();


		// 起点在庫を基に、在庫推移計算を行う
		for(StkChgRsltR r : _stkChgRsltBakL.subList(StkChgRsltR.$sd_adjst_dtl_typ, MSC_SD_ADJST_DTL_TYP.STK.value())) {
			if(startDt.gte(r.schd_dt())) {
				continue;
			}

			StkChgRsltR giStkR = _stkChgRsltBakL.getFirst(idxKey2, r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(),
					MSC_SD_ADJST_DTL_TYP.GI.value(), r.schd_dt());
			StkChgRsltR grStkR = _stkChgRsltBakL.getFirst(idxKey2, r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(),
					MSC_SD_ADJST_DTL_TYP.GR.value(), r.schd_dt());

			MCNumber grQty = MCNumber.ZERO;
			MCNumber giQty = MCNumber.ZERO;

			int i = (int)r.schd_dt().diffDay(getCopyStkChgCndR().dt_fr().addDay(-1));

			if (!isNull(giStkR)) {
				stk = stk.subtract(nvl(giStkR.schd_qty(), MCNumber.ZERO));
				giQty = giQty.add(nvl(giStkR.schd_qty(), MCNumber.ZERO));
			}
			if (!isNull(grStkR)) {
				stk = stk.add(nvl(grStkR.schd_qty(), MCNumber.ZERO));
				grQty = grQty.add(nvl(grStkR.schd_qty(), MCNumber.ZERO));
			}


			// 変更後の残数による計算
			MCList<Rslt1R> grRsltL = getRslt1L().subList(
					grRqstRslt1Key, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), r.schd_dt());
			for (Rslt1R grRsltR : grRsltL.subList(r1 -> !MSC_WG_RQST_TYP.isSHIP(r1.wg_rqst_typ()))) {
				MCNumber notCmplQty = getNotCmplQty(
					grRsltR, rslt2L.subList(grRqstKey, grRsltR.wg_rqst_no(), r.loc_cd()), MSC_IO_TYP.GR);
				grQty = grQty.add(notCmplQty);
				stk = stk.add(notCmplQty);
			}
			MCList<Rslt1R> giRsltL = getRslt1L().subList(
					giRqstRslt1Key, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), r.schd_dt());
			for (Rslt1R giRsltR : giRsltL.subList(r1 -> !MSC_WG_RQST_TYP.isSHIP(r1.wg_rqst_typ()))) {
				MCNumber notCmplQty = getNotCmplQty(
					giRsltR, rslt2L.subList(giRqstKey, giRsltR.wg_rqst_no(), r.loc_cd()), MSC_IO_TYP.GI);
				giQty = giQty.add(notCmplQty);
				stk = stk.subtract(notCmplQty);
			}
			if (!isNull(rslt2L)) {
				MCIndexKey grRslt2Key = rslt2L.createIndex(getGrRslt2Keys());
				grRslt2L = rslt2L.subList(grRslt2Key, r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.loc_cd());
				if (!isNull(grRslt2L)) {
					for (Rslt2R rslt2R : grRslt2L) {
						if (!isNullOr(rslt2R.gr_schd_dt(), r.schd_dt()) && rslt2R.gr_schd_dt().eqDate(r.schd_dt())) {
							if (rslt2R.fix_flg()) {
								Rslt1R r1 = getRslt1L().getFirst(rqstKey, rslt2R.wg_rqst_no());
								if (MSC_WG_RQST_TYP.isSHIP(r1.wg_rqst_typ())) {
									continue;
								}
								MCNumber prmsQty = getPrmsQty(rslt2R, MSC_IO_TYP.GR);
								grQty = grQty.add(prmsQty);
								stk = stk.add(prmsQty);
							}
						}
					}
				}
				MCIndexKey giRslt2Key = rslt2L.createIndex(getGiRslt2Keys());
				giRslt2L = rslt2L.subList(giRslt2Key, r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.loc_cd());
				if (!isNull(giRslt2L)) {
					for (Rslt2R rslt2R : giRslt2L) {
						if (!isNullOr(rslt2R.gi_schd_dt(), r.schd_dt()) && rslt2R.gi_schd_dt().eqDate(r.schd_dt())) {
							if (rslt2R.fix_flg()) {
								Rslt1R r1 = getRslt1L().getFirst(rqstKey, rslt2R.wg_rqst_no());
								if (MSC_WG_RQST_TYP.isSHIP(r1.wg_rqst_typ())) {
									continue;
								}
								MCNumber prmsQty = getPrmsQty(rslt2R, MSC_IO_TYP.GI);
								giQty = giQty.add(prmsQty);
								stk = stk.subtract(prmsQty);
							}
						}
					}
				}
			}

			stkR.setNumber(getColnm()[i], stk);
			if (!isNull(grR)) {
				if(grQty.isZero()) {
					grR.setNumber(getColnm()[i], null);
				}
				else {
					grR.setNumber(getColnm()[i], grQty);
				}
			}
			if (!isNull(giR)) {
				if(giQty.isZero()) {
					giR.setNumber(getColnm()[i], null);
				}
				else {
					giR.setNumber(getColnm()[i], giQty);
				}
			}

			// グラフ表示用のリストにも設定
			MCIndexKey skkChgKey = _StkChgRsltL.createIndex(StkChgRsltR.$itm_cd,
					StkChgRsltR.$itm_sub1, StkChgRsltR.$itm_sub2, StkChgRsltR.$itm_sub3,
					StkChgRsltR.$loc_cd, StkChgRsltR.$schd_dt);
			StkChgRsltR tgtStkChgRsltR = _StkChgRsltL.getFirst(skkChgKey, r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd(), r.schd_dt());
			if (!isNull(tgtStkChgRsltR)) {
				tgtStkChgRsltR.stk_qty(stk);
				tgtStkChgRsltR.gi_qty(giQty);
				tgtStkChgRsltR.gr_qty(grQty);
			}
			else {
				StkChgRsltR insR = StkChgRsltR.create();
				insR.itm_cd(r.itm_cd());
				insR.itm_sub1(r.itm_sub1());
				insR.itm_sub2(r.itm_sub2());
				insR.itm_sub3(r.itm_sub3());
				insR.loc_cd(r.loc_cd());
				insR.schd_dt(r.schd_dt());
				insR.disp_schd_dt(toY2MDString(r.schd_dt()));
				insR.stk_qty(stk);
				insR.gi_qty(giQty);
				insR.gr_qty(grQty);
				_StkChgRsltL.add(insR);
			}
		}

		// 在庫推移グラフの表示をリフレッシュ
		_innerGraph.refreshGraph();
		if (_outerGraph != null) {
			_outerGraph.refreshGraph();
		}
	}
	/**
	 * 在庫推移に算入する依頼残数を取得する
	 */
	protected MCNumber getNotCmplQty(Rslt1R r1, MCList<Rslt2R> r2L, MSC_IO_TYP ioTyp) {
	
		MCNumber qty = r1.not_cmpl_qty();
		
		// 依頼残に対する在庫の残数＝回答に対する在庫の残数の合計
		MCNumber actQty = MCNumber.ZERO;
		for (Rslt2R r2 : r2L) {
			actQty = actQty.add(getPrmsStkQty(r2, ioTyp));
		}
		
		if (actQty.isPositive()) {
			if (qty.gte(actQty)) {
				// 依頼残数から入荷済もしくは出荷済の数量を減算する
				qty = qty.subtract(actQty);
			}
			else {
				qty = MCNumber.ZERO;
			}
		}
		
		return qty;
	}

	/**
	 * 在庫推移に算入する回答数を取得する
	 */
	protected MCNumber getPrmsQty(Rslt2R r2, MSC_IO_TYP ioTyp) {
	
		MCNumber qty = r2.fix_flg() ? r2.prms_base_unit_qty() : MCNumber.ZERO;
		if (!r2.fix_flg() || isNull(r2.org_prms_base_unit_qty())) {
			return qty;
		}
		
		// 入荷済もしくは出荷済の実績があり
		MCNumber actQty = nvl(MSC_IO_TYP.isGI(ioTyp) ? r2.gi_act_qty() : r2.gr_act_qty(), MCNumber.ZERO);
		if (actQty.isPositive()) {
			// 画面上で変更された分
			MCNumber diffQty = r2.org_prms_base_unit_qty().subtract(r2.prms_base_unit_qty());

			// 変更前の回答数から在庫数を除き、未算入分の回答数を算出する
			// それに加え回答が変更された分を考慮するため変更前と後での回答数の差分を減算する
			qty = r2.org_prms_base_unit_qty().subtract(actQty).subtract(diffQty);
			if (qty.isNegative()) {
				qty = MCNumber.ZERO;
			}
		}
		
		return qty;
	}

	/**
	 * 回答に対する在庫の残数を取得する
	 */
	protected MCNumber getPrmsStkQty(Rslt2R r2, MSC_IO_TYP ioTyp) {
	
		if (isNull(r2.org_prms_base_unit_qty())) {
			return MCNumber.ZERO;
		}
		
		// 入荷済もしくは出荷済の実績があり
		MCNumber actQty = nvl(MSC_IO_TYP.isGI(ioTyp) ? r2.gi_act_qty() : r2.gr_act_qty(), MCNumber.ZERO);
		if (r2.fix_flg() && actQty.isPositive()) {
			// 回答に対する在庫の残数
			if (actQty.gt(r2.prms_base_unit_qty())) {
				actQty = actQty.subtract(r2.prms_base_unit_qty());
			}
			else {
				actQty = MCNumber.ZERO;
			}
		}
		
		return actQty;
	}

	// エラーメッセージのフォーカス用
	@Override
	public void setFocus(MCMessage msg) {
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof Rslt2R) {
			for (Rslt1R r : getRslt1L()) {
				if (isSame(((Rslt2R) msg.getCauseRow()).wg_rqst_no(), r.wg_rqst_no())) {
					Rslt1Table.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
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
		MCList<StkChgRsltR> list = _StkChgRsltL;

		_innerGraph = new MCFXGraph();

		_innerGraph.setUseThresholdLine(false);
		_innerGraph.setUseThresholdRect(false);

		List<String> labelColumnNameList = Arrays.asList(_labelColumnList);

		_innerGraph.setGraphDelegate(this);
		_innerGraph.setSameAxis(true);

		_innerGraph.initInnerGraphControl(
				StkChgGraphPanel // 埋め込むためのパネル
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
	 * [StkChgGraph]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStkChgGraph(MSBAP_WgRqstAdjst p) {
		// ブロック関連の初期化
		p.StkChgGraphPanel.add(p.StkChgGraphScrollPane);
		p.StkChgGraphPanel.setLastBeans(p.StkChgGraphTable);
		p.StkChgGraphScrollPane.setViewportView(p.StkChgGraphTable);
		p.StkChgGraphTable.setList(p.getStkChgGraphL());
		p.StkChgGraphPanel.setLayoutPosition("C");
		// ブロックの項目の初期化

		p.StkChgGraphScrollPane.setVisible(false);
		p.StkChgGraphPanel.setVisible(false);
	}

	/**
	 * Rslt2Tableを初期化します。
	 */
	protected void createGraphTable(){
		if(StkChgGraphPanel == null){
			StkChgGraphTable = beansFactory.createTable2("StkChgGraph.table");
		}
	}

	// 閉じる前にJFXPanelを削除
	public boolean beforeClose() {
		if(_fxPanel != null) {
			StkChgGraphPanel.remove(_fxPanel);
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

}