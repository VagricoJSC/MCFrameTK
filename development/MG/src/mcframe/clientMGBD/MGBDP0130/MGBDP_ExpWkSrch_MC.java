package mcframe.clientMGBD.MGBDP0130;

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
import mcframe.clientMAUB.MAUBP5340.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ExpWkSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ExpWkSrch_MC extends MGBDP_ExpWkSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	// 可変カラム名称(col_xx)の桁数
	protected int _RSLT_COL_SCALE = 2;

	// 可変カラムの数
	protected int _rslt_col_num = 0;

	// 縦横変換ユーティリティ 
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ExpWkSrch_MC() {
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
	public MGBDP_ExpWkSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0130_Srch01Caller<P extends MGBDP_ExpWkSrch, B extends MG_MGBDL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0130_Srch01Caller(P p, B b) {
			super(p, b);
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
		protected void show() {
			super.show();
			setOperSeqFlg();
		}

		protected void setOperSeqFlg() {
			getCndR().oper_seq_flg(getCndR().disp_seq_flg() && getCndR().oper_flg());
		}

		@Override
		protected void showReplaceSub() {

			// 年月情報(横展開のキー)を作成する
			MCList<RsltR> ymList = _vh.createElmListForYM(bridge.down1().st_ym(), bridge.down1().end_ym());

			// 可変カラム情報設定
			_vh.initColInfo(_RSLT_COL_SCALE, ymList.size(), ymList, 0, _rslt_col_num);
			// 縦横変換処理
			_vh.createHList(bridge.down0());
			// 合計を計算
			_vh.calcElmColTtlAll(DispRsltR.$ttl);
			// 可変カラムのヘッダラベル設定
			_vh.setElmColsLabelForYM(ymList);
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
	}

	/**
	 * [MG_MGBDL0130_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0130_Ins01Caller<P extends MGBDP_ExpWkSrch, B extends MG_MGBDL0130_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0130_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0130_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBAP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0050(MCEventInfo info) {
		doBtn_open_MGBAP0050();
	}
	protected void doBtn_open_MGBAP0050() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0050");
		mcframe.clientMGBA.MGBAP0050.MGBAP_PlnItmWkReg p = (mcframe.clientMGBA.MGBAP0050.MGBAP_PlnItmWkReg) aso.getPanel();
		
		mcframe.clientMGBA.MGBAP0050.CndR to = mcframe.clientMGBA.MGBAP0050.CndR.create();
		to.calc_ctg_cd(getInsCndR().calc_ctg_cd());
		to.wg_cd(getInsCndR().wg_cd());
		to.ym_fr(getInsCndR().st_ym());
		to.ym_to(getInsCndR().end_ym());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();

		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBDL0130_Ins01();
	}

	// -----------------------------------------------
	// init
	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}
	protected void setupPartsSub() {
		DispRslt_ttl_wkCostQty_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_00_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_01_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_02_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_03_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_04_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_05_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_06_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_07_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_08_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_09_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_10_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);
		DispRslt_wkCostQty_11_p_PPanel.setRelateBeans(columnDispRslt_wk_cost_cd, columnDispRslt_dec_place);

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		InsCnd_calc_no_p_PPanel.setRelateBeans(InsCnd_calc_grp_cd);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_jnl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub3);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_disp_seq);
		DispRsltTable.addSortColumn(columnDispRslt_oper_cd);
		DispRsltTable.addSortColumn(columnDispRslt_oper_seq);
		DispRsltTable.addSortColumn(columnDispRslt_wk_cost_cd);
	}

	@Override
	public void mcInitStatus() {
		initVhInfo();
		super.mcInitStatus();
	}

	/** VHConverterの初期化 */
	protected void initVhInfo() {
		// カラムコンフィグを設定する
		if (_vh.getConfs() == null) {
			// 可変カラムのみをVHに設定する
			DispRsltR proto = DispRsltR.create();
			Map<String, String> map = proto.getExtMap(DispRsltR.$$ELM);
			List<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : DispRsltTable.getColumnConfigs()) {
				if (map.get(conf.getBaseRowColumnName()) != null) {
					confs.add(conf);
					_rslt_col_num++;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}
	
		// RsltRでグループ化された項目情報（ELM,HVAL,HKEY,OTHER）を設定
		_vh.initColGroup(DispRsltTable, getRsltL());
	
		// カラム情報作成
		_vh.initColInfo(_RSLT_COL_SCALE, 0, null, 0, _rslt_col_num);
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		setColorInfo();
	}

	/**
	 * テーブルの配色を設定する
	 */
	protected void setColorInfo() {
		MAUDP_CellConfig cc = (MAUDP_CellConfig) DispRsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color ymTtlColor = getYmTtlColor(this);

		for (MCColumnConfig c : DispRsltTable.getColumnConfigs()) {
			if (c == columnDispRslt_ttl) {
				cc.putColumnBG(c, ymTtlColor);
			}
			else {
				cc.putColumnBG(c, expnsSrchRsltColor);
			}
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_loc_flg, true);
		setValueEx(Cnd_oper_flg, true);
		
		initCalcCtg();

		displayColumn();
	}

	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected()) {
			setDefCalcCtg(InsCnd_calc_ctg_cd);
		}
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}

		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}

		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		displayColumn();
		displayVHColumn();
		setTabMode();
		setFocus();
	}

	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void displayVHColumn() {
		if(isRefStatus()) {
			_vh.setReadOnlyStatus();
		}
		else {
			_vh.setInvisibleColumnAll();
		}
	}

	protected boolean isRefStatus() {
		return isSame(getStatus(), REF);
	}

	protected void setTabMode() {
		if(Cnd_ope_INS.isSelected()) {
			setTabComponentEnable(FoldTab, Tab4Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
	}

	protected void setFocus() {
		if (getDispRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			DispRsltTable.selectLeftmostColumn(0);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getDispRsltL());
		initCalcCtg();
		
		// 計画反映タブに計算Ｇ・計算ＮＯをコピーする
		if (Cnd_ope_INS.isSelected()) {
			copyComboValue(Cnd_calc_grp_cd, InsCnd_calc_grp_cd);
			copyComboValue(Cnd_calc_no, InsCnd_calc_no);
		}

		setSrchStatus();
	}
	
	protected void copyComboValue(MCTextComboBox src, MCTextComboBox dest) {
		String srcVal = src.getValue();
		String destVal = dest.getValue();
		if (!isNull(srcVal) && !isSame(destVal, srcVal)) {
			setValueEx(dest, srcVal);
		}
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);

		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}
	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);

		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	@Override
	public void doCnd_itm_mfg_inst_flg_NC(MCEventInfo info) {
		super.doCnd_itm_mfg_inst_flg_NC(info);
		if (getCndR().itm_mfg_inst_flg()) {
			getCndR().itm_flg(true);
		}
	}

	@Override
	public void doCnd_itm_flg_NC(MCEventInfo info) {
		super.doCnd_itm_flg_NC(info);
		if (!getCndR().itm_flg()) {
			getCndR().itm_mfg_inst_flg(false);
		}
	}

	// -----------------------------------------------
	// POPUP
	//一覧右クリックの「カラム順・サイズ」「ソート順」などで表示される項目の設定
	//検索の度にラベル等も動的に変更されるのでキャッシュせずに都度作成されるように以下の実装する
	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispRsltTable) {
			// 動的に変わるので、キャッシュしない。
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type, Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// ポップアップで非表示にしたカラムが表示されるのを防ぐ
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
			if (!confSet.contains(columnDispRslt_ttl)) {
				confSet.add(columnDispRslt_ttl);
			}
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

}