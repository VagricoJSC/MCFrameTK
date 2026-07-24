package mcframe.clientMGBF.MGBFP0260;

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
import java.util.Map;
import java.util.Set;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_CostIoSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_CostIoSrch_MC extends MGBFP_CostIoSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected int _SCALE = 2;

	// 可変カラムコンフィグ
	protected ArrayList<MCColumnConfig> _varColConfig = new ArrayList<>();

	protected ArrayList<MCColumnConfig> _viewColConfig = new ArrayList<>();

	protected static final String _COL_NAME_UPRI = "upri";

	protected static final String _COL_NAME_QTY = "qty";

	protected static final String _COL_NAME_STD = "std";

	protected static final String _COL_NAME_AMT = "amt";

	protected static final String _COL_NAME_DIFF = "diff";
	
	protected MCDate _st_month = null;

	protected MCList<MstrR> _cg_list = MCList.create(MstrR.class);

	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostIoSrch_MC() {
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
	public MGBFP_CostIoSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0260_Srch01Caller<P extends MGBFP_CostIoSrch, B extends MG_MGBFL0260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0260_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void show() {
			showRslt(bridge.down0()); // ソート前に合計行追加
			super.show();
			_st_month = getCndR().st_ym();
		}

		protected void showRslt(MCList<RsltR> list) {
			// 一意のカラムグループのリストを作成
			_cg_list = MCList.create(MstrR.class);
			for (MstrR r : bridge.down1()) {
				if (_cg_list.getFirst("io_col_cd", r.io_col_cd()) == null) {
					_cg_list.add(r);
				}
			}

			// 単価・差異計算
			for (RsltR r : list) {
				calcUpriAndDiff(r, _cg_list);
				if (r.diff_qty().isZero()) {
					r.diff_qty(null);
				}
				if (r.diff_amt().isZero()) {
					r.diff_amt(null);
				}
				if (r.diff_std().isZero()) {
					r.diff_std(null);
				}
			}

			// 合計行を作成・末尾行に追加
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames(_cg_list));
			RsltR sumRow = list.groupBy(policy).get(0);
			for (String nm : getSumColNames(_cg_list)) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			list.add(sumRow);

			_cndR = getCndR().clone();
		}

		// 単価と差異を計算
		protected void calcUpriAndDiff(RsltR row, MCList<MstrR> list) {

			MCNumber qty, amt, std;

			for (int i = 1; i <= list.size(); i++) {
				String numStr = lpad(String.valueOf(i), _SCALE, "0");
				qty = nvl(row.getNumberNE(_COL_NAME_QTY + numStr), MCNumber.ZERO);
				amt = nvl(row.getNumberNE(_COL_NAME_AMT + numStr), MCNumber.ZERO);
				std = nvl(row.getNumberNE(_COL_NAME_STD + numStr), MCNumber.ZERO);

				MstrR mRow = list.get(i - 1);
				if (MAC_IO_TGT_TYP.isAVE(mRow.io_tgt_typ())) {
					if (row.ave_tgt().isZero()) {
						qty = MCNumber.ZERO;
						amt = MCNumber.ZERO;
						std = MCNumber.ZERO;
					}
					else {
						int scale = !isNull(row.dec_place()) ? row.dec_place().intValue() : 0;
						qty = qty.divide(row.ave_tgt(), scale, MAC_RND_TYP.RNDOFF.toMC());
						amt = amt.divide(row.ave_tgt(), getCostUnitDispDigit(panel),
								MAC_RND_TYP.RNDOFF.toMC());
						std = std.divide(row.ave_tgt(), getCostUnitDispDigit(panel),
								MAC_RND_TYP.RNDOFF.toMC());
						row.setNumber(_COL_NAME_QTY + numStr, qty);
						row.setNumber(_COL_NAME_AMT + numStr, amt);
						row.setNumber(_COL_NAME_STD + numStr, std);
					}
				}

				row.setNumber(_COL_NAME_UPRI + numStr, getUpri(qty, amt));
				row.setNumber(_COL_NAME_DIFF + numStr, getDiff(std, amt));

				if (qty.isZero()) {
					row.setNumber(_COL_NAME_QTY + numStr, null);
				}
				if (amt.isZero()) {
					row.setNumber(_COL_NAME_AMT + numStr, null);
				}
				if (std.isZero()) {
					row.setNumber(_COL_NAME_STD + numStr, null);
				}
			}
		}
		
		protected MCNumber getUpri(MCNumber qty, MCNumber amt) {
			if (qty.isZero() || amt.isZero()) {
				return null;
			}
			else {
				return amt.divide(qty, getCostUnitDispDigit(panel),
						MAC_RND_TYP.RNDOFF.toMC());
			}
		}
		
		protected MCNumber getDiff(MCNumber std, MCNumber amt) {
			MCNumber diff = std.subtract(amt);
			if (diff.isZero()) {
				diff = null;
			}
			return diff;
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
		callMG_MGBFL0260_Srch01();
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_calc_no.addLCListener(this);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		for (MCTable<?> t : RsltTable.getPartsTables()) {
			MCRootPanel p = t.getRootPanel();
			if (p instanceof MAUBP_Qty_D) {
				((MAUBP_Qty_D)p).setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
			}
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean beforeOpen() {
		setVarColConfig();
		return super.beforeOpen();
	}

	// 可変カラムのカラムコンフィグの配列
	protected void setVarColConfig() {
		Map<String, String> extMap = createRsltR().getExtMap(RsltR.$$COL_TYP);
		for (MCColumnConfig cc : RsltTable.getViewColumnConfigs()) {
			_viewColConfig.add(cc);
			if (!isNull(extMap.get(cc.getBaseRowColumnName()))) {
				_varColConfig.add(cc);
			}
		}
	}

	/**
	 * 集計対象のカラム名の配列
	 */
	protected String[] getSumColNames(MCList<MstrR> list) {
		ArrayList<String> sumColNames = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			MstrR mRow = list.get(i);
			if (MAC_IO_TGT_TYP.isAVE(mRow.io_tgt_typ()) == false) {
				String numStr = lpad(String.valueOf(i + 1), _SCALE, "0");
				sumColNames.add(_COL_NAME_STD + numStr);
				sumColNames.add(_COL_NAME_AMT + numStr);
				sumColNames.add(_COL_NAME_DIFF + numStr);
			}
		}
		sumColNames.add(RsltR.$diff_amt);
		sumColNames.add(RsltR.$diff_std);
		return sumColNames.toArray(new String[0]);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == RsltTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			confSet.clear();

			for (MCColumnConfig cc : _viewColConfig) {
				confSet.add(cc);
			}
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		displayVarColumn();
		displayDiffColumn();
		setCgLabel();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		displayVarColumn();
		displayDiffColumn();
		setCgLabel();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	// カラムグループのラベル貼り
	protected void setCgLabel() {
		MCColumnGroup[] cgs = RsltTable.getAllColumnGroups();
		for (int i = 0; i < _cg_list.size(); i++) {
			MstrR r = _cg_list.get(i);
			cgs[i].setHeaderName(r.io_col_nm());
			cgs[i].setHeaderMessage(r.io_col_nm());
		}
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == RsltTable) {
			doRslt_DC(info);
		}
	}

	public void doRslt_DC(MCEventInfo info) {
		if (isNull(RsltTable.getSelectedMCRow().itm_cd())) {
			return; // 合計行は対象外
		}

		MstrR row = getMasterRow(info.getClickColumn());
		if (!isNull(row)) {
			openPanel(info, row);
		}
	}
	
	protected void openPanel(MCEventInfo info, MstrR row) {
		if (MAC_IO_TGT_TYP.isAVE(row.io_tgt_typ())) {
			openMGBFP0110(info, row);
		}
		else if (MAC_IO_TGT_TYP.isST_STK(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isST_WIP(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isEND_STK(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isEND_WIP(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isST_STKWIP(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isEND_STKWIP(row.io_tgt_typ())) {
			openMGBFP0100(info, row);
		}
		else if (MAC_IO_TGT_TYP.isPURC(row.io_tgt_typ())) {
			openMGBFP0040(info, row);
		}
		else if (MAC_IO_TGT_TYP.isCOMP(row.io_tgt_typ())) {
			openMGBFP0020(info, row);
		}
		else if (MAC_IO_TGT_TYP.isINST(row.io_tgt_typ())) {
			openMGBFP0010(info, row);
		}
		else if (MAC_IO_TGT_TYP.isINPT(row.io_tgt_typ())) {
			openMGBFP0090(info, row);
		}
		else if (MAC_IO_TGT_TYP.isSLS(row.io_tgt_typ())) {
			openMGBFP0050(info, row);
		}
		else if (MAC_IO_TGT_TYP.isFFR_PROV_IN(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isFFR_PROV_OUT(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isONR_PROV_IN(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isONR_PROV_OUT(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isSTK_IN(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isSTK_OUT(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isSTK_IO_IN(row.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isSTK_IO_OUT(row.io_tgt_typ())) {
			openMGBFP0060(info, row);
		}
		else if (MAC_IO_TGT_TYP.isLOSS_EVAL(row.io_tgt_typ())) {
			openMGBFP0310(info, row);
		}
		else if (MAC_IO_TGT_TYP.isGP_ALC(row.io_tgt_typ())) {
			openMGBFP0150(info, row);
		}
	}
	
	/**
	 * 総平均単価一覧照会を開く
	 */
	protected void openMGBFP0110(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0110.CndR cnd = mcframe.clientMGBF.MGBFP0110.CndR.create();
		openScreen("MG", "MGBFP0110", cnd, null, mstrR);
	}
	
	/**
	 * 在庫仕掛原価一覧照会を開く
	 */
	protected void openMGBFP0100(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0100.CndR cnd = mcframe.clientMGBF.MGBFP0100.CndR.create();
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if (MAC_IO_TGT_TYP.isST_STK(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isST_STKWIP(mstrR.io_tgt_typ())) {
			if (isNull(rsltR.ym()) || _st_month.eq(rsltR.ym())) {
				cnd.st_stk_flg(true);
			}
			else {
				cnd.end_stk_flg(true);
				cnd.ym(rsltR.ym().addMonth(-1));
			}
		}
		if (MAC_IO_TGT_TYP.isST_WIP(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isST_STKWIP(mstrR.io_tgt_typ())) {
			if (isNull(rsltR.ym()) || _st_month.eq(rsltR.ym())) {
				cnd.st_wip_flg(true);
			}
			else {
				cnd.end_wip_flg(true);
				cnd.ym(rsltR.ym().addMonth(-1));
			}
		}
		if (MAC_IO_TGT_TYP.isEND_STK(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isEND_STKWIP(mstrR.io_tgt_typ())) {
			cnd.end_stk_flg(true);
		}
		if (MAC_IO_TGT_TYP.isEND_WIP(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isEND_STKWIP(mstrR.io_tgt_typ())) {
			cnd.end_wip_flg(true);
		}
		List<String> forceColumn = new ArrayList<>();
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$adj_flg);
		openScreen("MG", "MGBFP0100", cnd, forceColumn, mstrR);
	}
	
	/**
	 * 購買原価一覧照会を開く
	 */
	protected void openMGBFP0040(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0040.CndR cnd = mcframe.clientMGBF.MGBFP0040.CndR.create();
		openScreen("MG", "MGBFP0040", cnd, null, mstrR);
	}
	
	/**
	 * 完成原価一覧照会を開く
	 */
	protected void openMGBFP0020(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0020.CndR cnd = mcframe.clientMGBF.MGBFP0020.CndR.create();
		openScreen("MG", "MGBFP0020", cnd, null, mstrR);
	}
	
	/**
	 * 製造原価一覧照会を開く
	 */
	protected void openMGBFP0010(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0010.CndR cnd = mcframe.clientMGBF.MGBFP0010.CndR.create();
		openScreen("MG", "MGBFP0010", cnd, null, mstrR);
	}
	
	/**
	 * 投入原価一覧照会を開く
	 */
	protected void openMGBFP0090(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0090.CndR cnd = mcframe.clientMGBF.MGBFP0090.CndR.create();
		RsltR rsltR = RsltTable.getSelectedMCRow();
		cnd.chd_itm_cd(rsltR.itm_cd());
		cnd.chd_itm_sub1(rsltR.itm_sub1());
		cnd.chd_itm_sub2(rsltR.itm_sub2());
		cnd.chd_itm_sub3(rsltR.itm_sub3());
		cnd.chd_itm_nm(rsltR.itm_nm());
		if (_cndR.mng_dpt_flg()) {
			cnd.inpt_dpt_cd(rsltR.mng_dpt_cd());
		}
		if (_cndR.asst_typ_flg()) {
			cnd.chd_asst_typ(rsltR.asst_typ());
		}
		if (_cndR.lot_flg()) {
			cnd.chd_lot_no(rsltR.lot_no());
		}
		if (_cndR.sublot_flg()) {
			cnd.chd_sublot_no(rsltR.sublot_no());
		}
		if (_cndR.sno1_flg()) {
			cnd.chd_sno1(rsltR.sno1());
		}
		if (_cndR.sno2_flg()) {
			cnd.chd_sno2(rsltR.sno2());
		}
		if (_cndR.sno3_flg()) {
			cnd.chd_sno3(rsltR.sno3());
		}
		if (_cndR.sno4_flg()) {
			cnd.chd_sno4(rsltR.sno4());
		}
		openScreen("MG", "MGBFP0090", cnd, null, mstrR);
	}
	
	/**
	 * 売上原価一覧照会を開く
	 */
	protected void openMGBFP0050(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0050.CndR cnd = mcframe.clientMGBF.MGBFP0050.CndR.create();
		if (_cndR.bp_flg()) {
			cnd.cst_cd(RsltTable.getSelectedMCRow().bp_cd());
		}
		openScreen("MG", "MGBFP0050", cnd, null, mstrR);
	}
	
	/**
	 * 入出庫原価一覧照会を開く
	 */
	protected void openMGBFP0060(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0060.CndR cnd = mcframe.clientMGBF.MGBFP0060.CndR.create();
		if (MAC_IO_TGT_TYP.isFFR_PROV_IN(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isFFR_PROV_OUT(mstrR.io_tgt_typ())) {
			cnd.cost_io_typ(MAC_COST_IO_TYP.FFR_PROV.value());
		}
		else if (MAC_IO_TGT_TYP.isONR_PROV_IN(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isONR_PROV_OUT(mstrR.io_tgt_typ())) {
			cnd.cost_io_typ(MAC_COST_IO_TYP.ONR_PROV.value());
		}
		else if (MAC_IO_TGT_TYP.isSTK_IN(mstrR.io_tgt_typ())) {
			cnd.cost_io_typ(MAC_COST_IO_TYP.STK_IN.value());
		}
		else if (MAC_IO_TGT_TYP.isSTK_OUT(mstrR.io_tgt_typ())) {
			cnd.cost_io_typ(MAC_COST_IO_TYP.STK_OUT.value());
		}
		else if (MAC_IO_TGT_TYP.isSTK_IO_IN(mstrR.io_tgt_typ())
				|| MAC_IO_TGT_TYP.isSTK_IO_OUT(mstrR.io_tgt_typ())) {
			cnd.cost_io_typ(MAC_COST_IO_TYP.STK_IO.value());
		}
		openScreen("MG", "MGBFP0060", cnd, null, mstrR);
	}
	
	/**
	 * 在庫評価損確認を開く
	 */
	protected void openMGBFP0310(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0310.CndR cnd = mcframe.clientMGBF.MGBFP0310.CndR.create();
		openScreen("MG", "MGBFP0310", cnd, null, mstrR);
	}
	
	/**
	 * 受払原価一覧照会を開く
	 */
	protected void openMGBFP0150(MCEventInfo info, MstrR mstrR) {
		mcframe.clientMGBF.MGBFP0150.CndR cnd = mcframe.clientMGBF.MGBFP0150.CndR.create();
		cnd.gp_alc_flg(true);
		List<String> forceColumn = new ArrayList<>();
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$st_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$st_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$purc_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$comp_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$othr_in_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$inpt_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$othr_out_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$free_prov_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$paid_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$sls_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$end_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$end_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$adj_flg);
		openScreen("MG", "MGBFP0150", cnd, forceColumn, mstrR);
	}
	
	protected void openScreen(String mid, String sid, MCRow cnd, List<String> forceColumn, MstrR mstrR) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener(mid, sid);
		setScreenOpenBind(cnd, mstrR);
		so.putCnd(cnd, forceColumn);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	/**
	 * 画面遷移用共通バインド設定
	 */
	protected void setScreenOpenBind(MCRow cnd, MstrR mstrR) {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		String ioTgtTyp = mstrR.io_tgt_typ();
		cnd.setStringNE("calc_grp_cd", rsltR.calc_grp_cd());
		cnd.setStringNE("calc_no", rsltR.calc_no());
		if (isNull(cnd.getDateNE("ym"))) {
			cnd.setDateNE("ym", rsltR.ym());
		}
		cnd.setStringNE("itm_cd", rsltR.itm_cd());
		cnd.setStringNE("itm_sub1", rsltR.itm_sub1());
		cnd.setStringNE("itm_sub2", rsltR.itm_sub2());
		cnd.setStringNE("itm_sub3", rsltR.itm_sub3());
		cnd.setStringNE("itm_nm", rsltR.itm_nm());

		// 会計伝票区分・会計理由ＣＤは複数条件設定
		List<String> acSlipTyps = new ArrayList<String>();
		List<String> acRsnCds = new ArrayList<String>();
		for (MstrR r : getMstrL()) {
			if (isSame(r.io_col_cd(), mstrR.io_col_cd())) {
				if (!isNull(r.ac_slip_typ()) && !acSlipTyps.contains(r.ac_slip_typ())) {
					acSlipTyps.add(r.ac_slip_typ());
				}
				if (!isNull(r.ac_rsn_cd()) && !acRsnCds.contains(r.ac_rsn_cd())) {
					acRsnCds.add(r.ac_rsn_cd());
				}
			}
		}
		cnd.setStringNE("ac_slip_typ", MCStringUtil.arrayValueJoin(acSlipTyps.toArray(new String[0])));
		cnd.setStringNE("ac_rsn_cd", MCStringUtil.arrayValueJoin(acRsnCds.toArray(new String[0])));

		if (_cndR.mng_dpt_flg() && !MAC_IO_TGT_TYP.isAVE(ioTgtTyp)
				&& !MAC_IO_TGT_TYP.isINPT(ioTgtTyp)) {
			cnd.setStringNE("dpt_cd", rsltR.mng_dpt_cd());
			cnd.setStringNE("mng_dpt_cd", rsltR.mng_dpt_cd());
		}
		if (_cndR.lot_flg()) {
			cnd.setStringNE("lot_no", rsltR.lot_no());
		}
		if (_cndR.sublot_flg()) {
			cnd.setStringNE("sublot_no", rsltR.sublot_no());
		}
		if (_cndR.sno1_flg()) {
			cnd.setStringNE("sno1", rsltR.sno1());
		}
		if (_cndR.sno2_flg()) {
			cnd.setStringNE("sno2", rsltR.sno2());
		}
		if (_cndR.sno3_flg()) {
			cnd.setStringNE("sno3", rsltR.sno3());
		}
		if (_cndR.sno4_flg()) {
			cnd.setStringNE("sno4", rsltR.sno4());
		}
		if (_cndR.wg_flg()) {
			cnd.setStringNE("wg_cd", rsltR.wg_cd());
		}
		if (_cndR.bp_flg()) {
			if (MAC_IO_TGT_TYP.isSTK_IN(ioTgtTyp) || MAC_IO_TGT_TYP.isSTK_OUT(ioTgtTyp)
					|| MAC_IO_TGT_TYP.isINPT(ioTgtTyp)) {
				if (isNull(rsltR.bp_cd())) {
					cnd.setBooleanNE("no_stk_bp_flg", true);
				}
				else {
					cnd.setStringNE("stk_bp_cd", rsltR.bp_cd());
				}
			}
			else {
				String asstTyp = rsltR.asst_typ();
				// 総平均単価のときかつ資産区分が１・２のとき取引先はセットしない
				if (!MAC_IO_TGT_TYP.isAVE(ioTgtTyp)
						|| (!MAC_ASST_TYP.isCO_PROD(asstTyp) && !MAC_ASST_TYP.isCO_SLS(asstTyp))) {

					if (isNull(rsltR.bp_cd())) {
						// 無償支給払出・有償支給払出のとき取引先無ＦＬＧはセットしない
						if (!MAC_IO_TGT_TYP.isFFR_PROV_OUT(ioTgtTyp)
								&& !MAC_IO_TGT_TYP.isONR_PROV_OUT(ioTgtTyp)) {
							cnd.setBooleanNE("no_bp_flg", true);
						}
					}
					else {
						cnd.setStringNE("bp_cd", rsltR.bp_cd());
					}
				}
			}
		}
		if (_cndR.asst_typ_flg() && !MAC_IO_TGT_TYP.isONR_PROV_IN(ioTgtTyp)) {
			cnd.setStringNE("asst_typ", rsltR.asst_typ());
		}
	}

	@Override
	public void doCnd_cost_io_id_LC(MCEventInfo info) {
		super.doCnd_cost_io_id_LC(info);
		clear(RsltTable);
	}

	@Override
	public void doLPnl_diff_NC(MCEventInfo info) {
		super.doLPnl_diff_NC(info);
		// 差額表示
		displayDiffColumn();
		RsltTable.adjustWidth();
	}

	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		super.doCnd_asst_typ_LC(info);
		if (!isNull((String) info.getNewValue())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);
		if ((Boolean) info.getNewValue()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		setValueEx(Cnd_cost_io_id, null);
	}

	// 対象ＣＤを入力したら**無ＦＬＧ＝ＯＦＦ
	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);
		if (isNull(Cnd_bp_cd.getValue()) == false) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	// **無ＦＬＧがＯＮになったとき対象のＣＤをクリアする
	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (Cnd_no_bp_flg.getValue()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}
	
	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);
		if (!isNull(Cnd_bp_nm.getValue())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	// その他 //////////////////////////////////////////////////////////////////
	protected void setColVisible(MCColumnConfig col, boolean boo) {
		if (boo) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}

	protected void displayDiffColumn() {
		setColVisible(columnRslt_diff_qty, getLPnlR().diff());
		setColVisible(columnRslt_diff_amt, getLPnlR().diff());
		setColVisible(columnRslt_diff_std, getLPnlR().diff());
	}

	protected void displayVarColumn() {
		for (int i = 0; i < _varColConfig.size() / 5; i++) {
			MstrR row = null;
			if (_cg_list.size() >= i + 1) {
				row = _cg_list.get(i);
			}
			// 単価
			MCColumnConfig c = _varColConfig.get(i * 5);
			setColVisible(c, !isNull(row) && row.getBooleanNE(MstrR.$unit_flg));
			// 数量
			c = _varColConfig.get(i * 5 + 1);
			setColVisible(c, !isNull(row) && row.getBooleanNE(MstrR.$qty_flg));
			// 標準
			c = _varColConfig.get(i * 5 + 2);
			setColVisible(c, !isNull(row) && row.getBooleanNE(MstrR.$std_flg));
			// 金額
			c = _varColConfig.get(i * 5 + 3);
			setColVisible(c, !isNull(row) && row.getBooleanNE(MstrR.$amt_flg));
			// 差異
			c = _varColConfig.get(i * 5 + 4);
			setColVisible(c, !isNull(row) && row.getBooleanNE(MstrR.$diff_flg));
		}
	}

	// //////////////////////////////////////////////
	// セルコンフィグ////////////////////////////////
	// //////////////////////////////////////////////
	protected Color _vTtlColor = getVTtlColor(this);

	protected class TableCellConfig extends MGUDP_CellConfig {

		@SuppressWarnings("rawtypes")
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			// 最終行の色
			if (isSame(index + 1, getRsltL().size())) {
				return _vTtlColor;
			}
			MstrR row = getMasterRow(column);
			if (isNull(row) == false && isNull(row.bg_r()) == false) {
				return new Color(row.bg_r().intValue(), row.bg_g().intValue(), row.bg_b()
						.intValue());
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@SuppressWarnings("rawtypes")
		@Override
		public Color getPriorFG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (isSame(index + 1, getRsltL().size()) == false) {
				MstrR row = getMasterRow(column);
				if (isNull(row) == false && isNull(row.fg_r()) == false) {
					return new Color(row.fg_r().intValue(), row.fg_g().intValue(), row
							.fg_b().intValue());
				}
			}
			return super.getPriorFG(index, column, table, mode);
		}

		@Override
		public String getPriorViewScaleType(int index, MCColumnConfig column,
				MCTable<?> table) {
			MstrR row = getMasterRow(column);
			if (isNull(row) == false && MAC_IO_TGT_TYP.isAVE(row.io_tgt_typ())
					&& column.getRowColumnName() != "qty") {
				// 総平均単価は単価表示桁で表示
				return IfViewScale.UNIT;
			}
			else {
				// 実装仕様書で定義した表示桁を使用する
				return super.getPriorViewScaleType(index, column, table);
			}
		}
	}

	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createTableCellConfig());
	}

	// カラムが可変カラムのときに参照するマスタレコードを返す
	protected MstrR getMasterRow(MCColumnConfig column) {
		MstrR row = null;

		if (_varColConfig.contains(column)) {

			MCNumber i = MCNumber.valueOf(_varColConfig.indexOf(column));
			i = i.divide(5, 0, MAC_RND_TYP.CUTOFF.toMC());
			if (i.lt(_cg_list.size())) {
				row = _cg_list.get(i.intValue());
			}
		}
		return row;
	}

}