package mcframe.clientMGBE.MGBEP0210;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientMAUC.MAUCP0020.TermR;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_TermFixStdUpriSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_TermFixStdUpriSrch_MC extends MGBEP_TermFixStdUpriSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(col_xx)の桁数 */
	protected int _SCALE = 3;
	/** 可変カラムの数 */
	protected int _DTL_COL_NUM = 0;
	/** 可変カラムの開始位置 */
	protected int _DTL_COL_S = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR = null;
	/** 最大期間 */
	protected int _MAX_TERM = 24;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_TermFixStdUpriSrch_MC() {
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
	public MGBEP_TermFixStdUpriSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0210_Srch01Caller<P extends MGBEP_TermFixStdUpriSrch, B extends MG_MGBEL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0210_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkTerm(Cnd_term_fr, Cnd_term_to, _MAX_TERM));
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getDispRsltL());
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

			_vh.setInvisibleColumnAll();
			_vh.initColInfo(_SCALE, 0, null, _DTL_COL_S, _DTL_COL_NUM);
		}

		@Override
		protected void showReplaceSub() {
			_cndR = getCndR().clone();

			// 項目情報設定
			_vh.initColGroup(DispRsltTable, getRsltL());
			// 期情報(横展開のキー)を作成
			MCList<TermR> termList = createElmListForTerm();
			// カラム情報作成
			_vh.initColInfo(_SCALE, termList.size() * 7, termList, _DTL_COL_S, _DTL_COL_NUM);
			setHeaderLabel(termList);
			_vh.setReadOnlyStatus();
			// 縦横変換
			_vh.createHList(getRsltL());
		}

		protected void setHeaderLabel(MCList<TermR> l) {
			MCColumnGroup[] cgs = DispRsltTable.getAllColumnGroups();
			for (int i = 0; i < l.size(); i++) {
				String lbl = l.get(i).term_nm();
				cgs[i].setHeaderName(lbl);
				cgs[i].setHeaderMessage(lbl);
			}
		}

		protected MCList<TermR> createElmListForTerm() {
			MCList<TermR> l = MCList.create(TermR.class);
			for (TermR termR : getTermList()) {
				if (l.size() <= _MAX_TERM && termR.term().gte(getCndR().term_fr()) && termR.term().lte(getCndR().term_to())) {
					l.add(termR);
				}
			}
			return l;
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBEL0210_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0200(MCEventInfo info) {
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0200(r);
	}
	protected void doBtn_open_MGBEP0200(DispRsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0200");
		mcframe.clientMGBE.MGBEP0200.CndR to = mcframe.clientMGBE.MGBEP0200.CndR.create();
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.term_fr(_cndR.term_fr());
		to.term_to(_cndR.term_to());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		DispRslt_base_qty_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_unit_qty_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);

		DispRslt_qty_00_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_01_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_02_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_03_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_04_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_05_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_06_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_07_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_08_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_09_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_10_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_11_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_12_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_13_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_14_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_15_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_16_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_17_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_18_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_19_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_20_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_21_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_22_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_23_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initVhInfo();
	}

	/**
	 * VHConverterの初期化
	 */
	protected void initVhInfo() {
		if (_vh.getConfs() == null) {
			DispRsltR proto = DispRsltR.create();
			Map<String, String> map = proto.getExtMap(DispRsltR.$$ELM);
			ArrayList<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : DispRsltTable.getColumnConfigs()) {
				String val = map.get(conf.getBaseRowColumnName());
				if (val != null) {
					confs.add(conf);
					_DTL_COL_NUM = _DTL_COL_NUM + 1;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}
		_vh.initColInfo(_SCALE, 0, null, _DTL_COL_S, _DTL_COL_NUM);
		_vh.setInvisibleColumn();
		_vh.setDispNull(false);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) DispRsltTable.getCellConfig();
		cc.putColumnBG(DispRsltTable.getColumnConfigs(), getBgOtherColor(this));

		Color moneyDiffColor = getMoneyDiffColor(this);
		Color stkrColor = getStkrColor(this);

		for (int i = 0; i < _vh.getConfs().length; i++) {
			int x = i % 7;
			if (x == 3 || x == 5) {
				cc.putColumnBG(_vh.getConfs()[i], moneyDiffColor);
			}
			else if (x == 6) {
				cc.putColumnBG(_vh.getConfs()[i], stkrColor);
			}
		}
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispRsltTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// 可変カラムの部分を再設定する
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_term_fr, term.term());
			setValueEx(Cnd_term_to, term.term());
		}

		setValueEx(LPnl_disp_diff, true);

		displayColumn();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_calc_ctg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_jnl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub3);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		DispRsltTable.selectLeftmostColumn(0);
	}

	protected void setBtnMode() {
		DispRsltR r = DispRsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBEP0200, isEnableBtn_open_MGBEP0200(r));
	}

	/**
	 * 確定標準単価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0200(DispRsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doDispRslt_NC(MCEventInfo info) {
		super.doDispRslt_NC(info);
		setBtnMode();
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DispRsltTable) {
			int index = info.getEventIndex();
			DispRsltR r = getDispRsltL().get(index);
			if (isEnableBtn_open_MGBEP0200(r)) {
				doBtn_open_MGBEP0200(r);
			}
		}
	}

	@Override
	public void doLPnl_disp_term_qty_NC(MCEventInfo info) {
		super.doLPnl_disp_term_qty_NC(info);
		if (getLPnlR().disp_term_qty()) {
			getLPnlR().disp_unit(false);
			getLPnlR().disp_diff(false);
		}
		displayColumn();
	}

	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		if (getLPnlR().disp_unit()) {
			getLPnlR().disp_term_qty(false);
		}
		else {
			getLPnlR().disp_diff(false);
		}
		displayColumn();
	}

	@Override
	public void doLPnl_disp_diff_NC(MCEventInfo info) {
		super.doLPnl_disp_diff_NC(info);
		if (getLPnlR().disp_diff()) {
			getLPnlR().disp_term_qty(false);
			getLPnlR().disp_unit(true);
		}
		displayColumn();
	}

	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		getLPnlR().disp_base(!getLPnlR().disp_unit());
		getLPnlR().disp_base_not_diff(getLPnlR().disp_base() && !getLPnlR().disp_diff());
		getLPnlR().disp_unit_diff(getLPnlR().disp_unit() && getLPnlR().disp_diff());
		getLPnlR().disp_base_diff(getLPnlR().disp_base() && getLPnlR().disp_diff());
		changeColumnMode(DispRsltTable, getLPnlR(), RsltR.$$SHOW);
		_vh.setInvisibleColumn();
		DispRsltTable.adjustWidth();
	}

}