package mcframe.clientMGBF.MGBFP0420;

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
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_AveFixSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_AveFixSrch_MC extends MGBFP_AveFixSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(col_xx)の桁数 */
	protected int _SCALE = 3;
	/** 可変カラムの数 */
	protected int _dtl_col_num = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_AveFixSrch_MC() {
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
	public MGBFP_AveFixSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0420_Srch01Caller<P extends MGBFP_AveFixSrch, B extends MG_MGBFL0420_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0420_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkTermM(Cnd_ym_fr, Cnd_ym_to, 60));
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
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			showDispRslt();
		}

		protected void showDispRslt() {
			// 項目情報設定
			_vh.initColGroup(DispRsltTable, getRsltL());
			// 年月情報(横展開のキー)を作成
			MCList<RsltR> ymList = _vh.createElmListForYM(getCndR().ym_fr(), getCndR().ym_to());
			// カラム情報作成
			_vh.initColInfo(_SCALE, ymList.size() * 5, ymList, 0, _dtl_col_num);
			calcUnit();
			// 縦横変換
			_vh.createHList(getRsltL());

			// カラムグループのヘッダラベル設定
			setHeaderLabel(ymList);
		}

		protected void calcUnit() {
			for(RsltR r : getRsltL()) {
				r.ave_upri_unit(calcUpri(r.ave_upri(), r.std_qty(), getCostUnitDispDigit(panel)));
				r.std_upri_unit(calcUpri(r.std_upri(), r.std_qty(), getCostUnitDispDigit(panel)));
			}
		}

		protected void setHeaderLabel(MCList<RsltR> l) {
			MCColumnGroup[] cgs = DispRsltTable.getAllColumnGroups();
			for (int i = 0; i < l.size(); i++) {
				String lbl = toYMHeaderLabel(panel, l.get(i).ym());
				cgs[i].setHeaderName(lbl);
				String msg = toYMHeaderMessage(panel, l.get(i).ym());
				cgs[i].setHeaderMessage(msg);
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0420_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

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
		DispRslt_qty_24_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_25_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_26_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_27_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_28_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_29_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_30_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_31_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_32_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_33_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_34_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_35_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_36_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_37_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_38_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_39_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_40_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_41_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_42_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_43_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_44_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_45_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_46_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_47_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_48_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_49_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_50_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_51_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_52_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_53_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_54_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_55_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_56_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_57_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_58_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_59_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		initVhInfo();
		super.mcInitStatus();
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
					_dtl_col_num = _dtl_col_num + 1;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}
		_vh.initColInfo(_SCALE, 0, null, 0, _dtl_col_num);
		_vh.setInvisibleColumn();
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
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
		setValueEx(LPnl_disp_unit, true);
		displayColumn();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_calc_grp_cd);
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_jnl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub3);
		DispRsltTable.addSortColumn(columnDispRslt_lot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sublot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sno1);
		DispRsltTable.addSortColumn(columnDispRslt_sno2);
		DispRsltTable.addSortColumn(columnDispRslt_sno3);
		DispRsltTable.addSortColumn(columnDispRslt_sno4);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_asst_typ);
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
		//可変カラムをすべてINVISIBLEにする
		_vh.setInvisibleColumnAll();
		_vh.initColInfo(_SCALE, 0, null, 0, _dtl_col_num);

		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		displayColumn();

		DispRsltTable.selectLeftmostColumn(0);
	}

	// -----------------------------------------------
	// Event
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DispRsltTable) {
			MCColumnConfig clickCol = info.getClickColumn();
			if (_vh.isVariableColumn(clickCol)) {
				doDispRslt_ElmCol_DC(info);
			}
		}
	}

	/**
	 * [DispRslt]テーブルの月別の項目のＤＣイベントで実行される。
	 */
	protected void doDispRslt_ElmCol_DC(MCEventInfo info) {
		MCColumnConfig cc = info.getClickColumn();
		MCColumnGroup scg = null;
		for (MCColumnGroup cg : DispRsltTable.getAllColumnGroups()) {
			if (contains(cg, cc)) {
				scg = cg;
				break;
			}
		}
		if (scg != null) {
			DispRsltR selR = getDispRsltL().get(info.getEventIndex());
			if (isNull(selR)) {
				dialog(msgNoSelectedRow());
				return;
			}

			String calcGrp = selR.calc_grp_cd();
			MCDate ym = getYm(info);
			String calcNo = null;
			MCIndexKey idxkey = getFixL().createIndex(FixR.$calc_grp_cd, FixR.$ym);
			FixR r = getFixL().getFirst(idxkey, calcGrp, ym);
			if (r != null) {
				calcNo = r.calc_no();
			}
			openMGBFP0110(selR, calcGrp, calcNo, ym);
		}
	}

	//総平均単価一覧照会
	protected void openMGBFP0110(DispRsltR r, String calcGrp, String calcNo, MCDate ym) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBFP0110ScrnOpnr(r, calcGrp, calcNo, ym);
		scrnOpnr.show();
	}

	protected MAUCP_AppScreenOpener getMGBFP0110ScrnOpnr(DispRsltR r, String calcGrp, String calcNo, MCDate ym) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBFP0110");
		mcframe.clientMGBF.MGBFP0110.CndR to = mcframe.clientMGBF.MGBFP0110.CndR.create();

		to.calc_grp_cd(calcGrp);
		to.calc_no(calcNo);
		to.ym(ym);
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.sppl_cd(r.sppl_cd());
		to.asst_typ(r.asst_typ());

		so.putCnd(to);
		so.runValueInit();
		if (!isNull(calcNo)) {
			so.putSearchAction();
		}

		return so;
	}

	/**
	 * カラムがカラムグループに属するかどうか
	 * @param cg カラム
	 * @param tgt カラムグループ
	 */
	protected boolean contains(MCColumnGroup cg, MCColumnConfig tgt) {
		for (MCColumnConfig cc : cg.getAllColumnConfigs()) {
			if (cc == tgt) {
				return true;
			}
		}
		return false;
	}

	protected MCDate getYm(MCEventInfo info) {
		int i = getVarColIndex(info.getClickColumn());
		if (i < 0) {
			return null;
		}
		return (MCDate) _vh.getElmVals()[i];
	}

	protected int getVarColIndex(MCColumnConfig cc) {
		int i = 0;
		for (MCColumnConfig chkcc : _vh.getConfs()) {
			if (chkcc == cc && i < _vh.getElmCols().length) {
				return i;
			}
			i++;
		}
		return -1;
	}

	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		super.doCnd_asst_typ_LC(info);
		if (!isNull(getCndR().asst_typ())) {
			setValueEx(Cnd_except_oth_flg, false);
		}
	}

	@Override
	public void doCnd_except_oth_flg_NC(MCEventInfo info) {
		super.doCnd_except_oth_flg_NC(info);
		if (getCndR().except_oth_flg()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}

	@Override
	public void doCnd_no_sppl_flg_NC(MCEventInfo info) {
		super.doCnd_no_sppl_flg_NC(info);
		if (getCndR().no_sppl_flg()) {
			setValueEx(Cnd_sppl_cd, null);
			setValueEx(Cnd_sppl_nm, null);
		}
	}

	@Override
	public void doCnd_sppl_cd_LC(MCEventInfo info) {
		super.doCnd_sppl_cd_LC(info);
		if (!isNull(getCndR().sppl_cd())) {
			setValueEx(Cnd_no_sppl_flg, false);
		}
	}

	@Override
	public void doCnd_sppl_nm_LC(MCEventInfo info) {
		super.doCnd_sppl_nm_LC(info);
		if (!isNull(getCndR().sppl_nm())) {
			setValueEx(Cnd_no_sppl_flg, false);
		}
	}

	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		displayColumn();
	}

	@Override
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);
		displayColumn();
	}
	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		getLPnlR().disp_ave_upri(!getLPnlR().disp_unit());
		getLPnlR().disp_ave_unit(getLPnlR().disp_unit());
		getLPnlR().disp_std_upri(!getLPnlR().disp_unit() && getLPnlR().disp_std());
		getLPnlR().disp_std_unit(getLPnlR().disp_unit() && getLPnlR().disp_std());

		//条件に応じて可変カラムの表示・非表示を切り替える
		changeColumnMode(DispRsltTable, getLPnlR(), RsltR.$$SHOW);

		//可変カラムの未使用部分をInvisibleステータスにする
		_vh.setInvisibleColumn();
		DispRsltTable.adjustWidth();
	}

}