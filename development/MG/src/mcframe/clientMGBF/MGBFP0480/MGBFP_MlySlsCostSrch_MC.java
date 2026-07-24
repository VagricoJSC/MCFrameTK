package mcframe.clientMGBF.MGBFP0480;

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
import java.util.HashMap;
import java.util.Set;
import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import mcframe.clientMGUC.MGUCP0060.MGUCP_CostUtil;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MlySlsCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MlySlsCostSrch_MC extends MGBFP_MlySlsCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称の桁数 */
	protected int _DTL_COL_SCALE = 2;
	/** 可変カラムの数 */
	protected int _dtl_col_num = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR;
	/** 検索時の結果 */
	protected MCList<DispRsltR> _dispRsltL;
	protected MCIndexKey _dispRsltIdx = null;
	/** 可変カラムとヘッダ年月のマップ(画面遷移用) */
	protected Map<MCColumnConfig, MCDate> _ymMap = new HashMap<MCColumnConfig, MCDate>();
	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト */
	protected ArrayList<MCColumnConfig> _revFgCtrlColumnConfigs = null;
	/** 各キーの先頭行の色 */
	protected Color _topColor = getTopColor(this);
	/** 一覧行の色 */
	protected Color _tblColor = getExpnsSrchRsltColor(this);
	protected Color _profit = getProfitColor(this);
	protected Color _ttl = getAllTtlColor(this);
	protected Color _slsCost = getSlsCostColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MlySlsCostSrch_MC() {
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
	public MGBFP_MlySlsCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0480_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0480_Srch01Caller<P extends MGBFP_MlySlsCostSrch, B extends MG_MGBFL0480_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0480_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			// 通信用ブロックと画面表示ブロックが異なる場合は
			// 画面表示ブロックを下りブロックとして追加する
			addDownContainer(getDispRsltL());
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
		protected void showReplaceSub() {
			super.showReplaceSub();
			showDispRslt();
		}

		protected void showDispRslt() {
			//縦横変換して一覧に表示する

			// 検索時点の条件を保持
			_cndR = getCndR().clone();

			// 年月情報(横展開のキー)を作成する
			MCList<RsltR> ymList = _vh.createElmListForYM(_cndR.ym_fr(), _cndR.ym_to());

			// 可変カラム情報設定
			_vh.initColInfo(_DTL_COL_SCALE, ymList.size(), ymList, 0, _dtl_col_num);
			// 下り電文(縦リスト)加工・縦横変換処理
			_vh.createHList(editVList(bridge.down0()));
			// 合計を計算
			_vh.calcElmColTtlAll(DispRsltR.$ttl);
			// 可変カラムのヘッダラベル設定
			_vh.setElmColsLabelForYM(ymList);
			calcTtlUpri(getDispRsltL());

			// 画面遷移用
			_ymMap = _vh.createColElmMapForYM(ymList);

			// 検索時の結果保持
			_dispRsltL = getDispRsltL().clone();
			_dispRsltIdx = _dispRsltL.createIndex(DispRsltR.$key_idx);

			doDispCng();

		}

		/** 縦リストの編集、縦横変換を行う前に実行する */
		protected MCList<RsltR> editVList(MCList<RsltR> down0) {
			// 表示するキー項目の単位でkey_idxを設定
			// 縦横変換時のHKEYはkey_idx, elm_no
			int i = 0;
			for (MCList<RsltR> l : down0.groupList(getKeyIdx())) {
				l.setNumber(RsltR.$key_idx, i++);
			}

			// 項目別データを作成する
			MCList<RsltR> list = MCList.create(RsltR.class);
			for (RsltR row : down0) {
				int k = 0;
				for (String[] s : getDispList()) {
					RsltR itm = row.clone();
					itm.key_idx(row.key_idx());
					itm.elm_no(k++);
					itm.elm(s[0]);
					itm.elm_nm(s[1]);
					itm.disp(itm.getNumber(s[2]));
					list.add(itm);
				}
			}
			return list;
		}

		/** 集計タブに応じた縦横変換時のキー項目 */
		protected String[] getKeyIdx() {
			return getKeysByFlg(RsltR.create(), RsltR.$$SHOW, getCndR()).toArray(new String[0]);
		}

		@Override
		protected void setMode() {
			super.setMode();
			//検索後ステータス
			setREFStatus();
			cngDsp();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			//検索前ステータス
			setSRCHStatus();
			cngDsp();
		}

		protected void cngDsp() {
			if (getCndR().qty_flg()) {
				setDefaultMode(Cnd_disp_upri);
			}
			else {
				getCndR().disp_upri(false);
				Cnd_disp_upri.setMode(MCMode.READ_ONLY);
			}
		}
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
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_lot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sublot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sno1);
		DispRsltTable.addSortColumn(columnDispRslt_sno2);
		DispRsltTable.addSortColumn(columnDispRslt_sno3);
		DispRsltTable.addSortColumn(columnDispRslt_sno4);
		DispRsltTable.addSortColumn(columnDispRslt_ac_slip_typ);
		DispRsltTable.addSortColumn(columnDispRslt_ac_rsn_cd);
		DispRsltTable.addSortColumn(columnDispRslt_cst_cd);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_cst_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_cst_cntry_cd);
		DispRsltTable.addSortColumn(columnDispRslt_cst_area_cd);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_cd);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_cntry_cd);
		DispRsltTable.addSortColumn(columnDispRslt_dlv_area_cd);
		DispRsltTable.addSortColumn(columnDispRslt_sls_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_sls_usr_cd);
		DispRsltTable.addSortColumn(columnDispRslt_stk_bp_cd);
		DispRsltTable.addSortColumn(columnDispRslt_alc_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_cost_sls_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_cost_sls_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_cost_sls_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_cost_sls_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_cost_sls_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_asst_typ);
		DispRsltTable.addSortColumn(columnDispRslt_unit_cd);

		DispRsltTable.addSortColumn(columnDispRslt_elm_no);
	}

	protected void calcTtlUpri(MCList<DispRsltR> list) {
		MCNumber qty = MCNumber.ZERO;
		MCNumber amt = MCNumber.ZERO;
		MCNumber profit = MCNumber.ZERO;
		MCNumber slsProfit = MCNumber.ZERO;
		MCNumber limitProfit = MCNumber.ZERO;
		MCNumber var = MCNumber.ZERO;
		MCNumber fxd = MCNumber.ZERO;
		MCNumber slsCost = MCNumber.ZERO;
		MCNumber slsMngCost = MCNumber.ZERO;
		MCNumber actCost = MCNumber.ZERO;

		for (DispRsltR r : list) {
			// 利益率
			if (isProfitRateRow(r)) {
				r.ttl(isNullOrZero(amt) ? null
						: isNullOrZero(profit) ? null
								: calcUpri(profit, amt, getRateDivScale()).multiply(100));
			}
			// 売上利益率
			else if (isSlsProfitRateRow(r)) {
				r.ttl(isNullOrZero(amt) ? null
						: isNullOrZero(slsProfit) ? null
								: calcUpri(slsProfit, amt, getRateDivScale())
										.multiply(100));
			}
			// 限界利益率
			else if (isLimitProfitRateRow(r)) {
				r.ttl(isNullOrZero(amt) ? null
						: isNullOrZero(limitProfit) ? null
								: calcUpri(limitProfit, amt, getRateDivScale())
										.multiply(100));
			}
			else {
				//単価行	
				//　売上金額
				if (isUpriAmtRow(r)) {
					r.ttl(calcUpri(amt, qty, RsltR.amt_META.scale()));
				}

				//　利益
				if (isUpriProfitRow(r)) {
					r.ttl(calcUpri(profit, qty, RsltR.profit_META.scale()));
				}

				//　売上利益
				if (isUpriSlsProfitRow(r)) {
					r.ttl(calcUpri(slsProfit, qty, RsltR.sls_profit_META.scale()));
				}

				//　限界利益
				if (isUpriLimitProfitRow(r)) {
					r.ttl(calcUpri(limitProfit, qty, RsltR.limit_profit_META.scale()));
				}

				//　変動費
				if (isUpriVarRow(r)) {
					r.ttl(calcUpri(var, qty, RsltR.var_META.scale()));
				}

				//　固定費
				if (isUpriFxdRow(r)) {
					r.ttl(calcUpri(fxd, qty, RsltR.fxd_META.scale()));
				}

				//　売上原価
				if (isUpriSlsCostRow(r)) {
					r.ttl(calcUpri(slsCost, qty, RsltR.sls_cost_META.scale()));
				}

				//　販管費
				if (isUpriSlsMngCostRow(r)) {
					r.ttl(calcUpri(slsMngCost, qty, RsltR.sls_mng_cost_META.scale()));
				}

				//　総原価
				if (isUpriActCostRow(r)) {
					r.ttl(calcUpri(actCost, qty, RsltR.act_cost_META.scale()));
				}

				// 数量
				if (isQtyRow(r)) {
					qty = r.ttl();
				}

				// 売上金額
				if (isAmtRow(r)) {
					amt = r.ttl();
				}
				// 利益
				else if (isProfitRow(r)) {
					profit = r.ttl();
				}
				// 売上利益
				else if (isSlsProfitRow(r)) {
					slsProfit = r.ttl();
				}
				// 限界利益
				else if (isLimitProfitRow(r)) {
					limitProfit = r.ttl();
				}
				// 変動費
				else if (isVarRow(r)) {
					var = r.ttl();
				}
				// 固定費
				else if (isFxdRow(r)) {
					fxd = r.ttl();
				}
				// 売上原価
				else if (isSlsCostRow(r)) {
					slsCost = r.ttl();
				}
				// 販管費
				else if (isSlsMngCostRow(r)) {
					slsMngCost = r.ttl();
				}
				// 総原価
				else if (isActCostRow(r)) {
					actCost = r.ttl();
				}
			}
		}
	}

	/**
	 * 引数のMCNumberのうち１つでもNullかゼロが存在すればtrue。それ以外はfalseを返す。
	 * 
	 * @param val
	 * @return
	 */
	protected boolean isNullOrZero(MCNumber... val) {
		for (MCNumber n : val) {
			if (null == n || n.isZero()) {
				return true;
			}
		}

		return false;
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
		callMG_MGBFL0480_Srch01();
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();

		if (!isNull(_dispRsltL) && (!_dispRsltL.isEmpty())) {
			_dispRsltL.clear();
		}
	}

	/** 項目列の情報(String[] {[項目], [項目名ラベル], [数量・金額カラム名]})を取得する */
	protected ArrayList<String[]> getDispList() {
		ArrayList<String[]> dispList = new ArrayList<>();

		//String[]{[項目], [項目名ラベル], [数量・金額カラム名]}
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$qty, getDispString("label_qty"), RsltR.$qty});
		}
		dispList.add(new String[] {RsltR.$amt, getDispString("label_amt"), RsltR.$amt});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_amt, getDispString("label_amt"), RsltR.$upri_amt});
		}
		dispList.add(new String[] {RsltR.$profit, getDispString("label_profit"), RsltR.$profit});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_profit, getDispString("label_profit"), RsltR.$upri_profit});
		}
		dispList.add(new String[] {RsltR.$sls_profit, getDispString("label_sls_profit"), RsltR.$sls_profit});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_sls_profit, getDispString("label_sls_profit"), RsltR.$upri_sls_profit});
		}
		dispList.add(new String[] {RsltR.$profit_rate, getDispString("label_profit_rate"), RsltR.$profit_rate});
		dispList.add(new String[] {RsltR.$sls_profit_rate, getDispString("label_sls_profit_rate"), RsltR.$sls_profit_rate});
		dispList.add(new String[] {RsltR.$limit_profit, getDispString("label_limit_profit"), RsltR.$limit_profit});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_limit_profit, getDispString("label_limit_profit"), RsltR.$upri_limit_profit});
		}
		dispList.add(new String[] {RsltR.$limit_profit_rate, getDispString("label_limit_profit_rate"), RsltR.$limit_profit_rate});
		dispList.add(new String[] {RsltR.$var, getDispString("label_var"), RsltR.$var});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_var, getDispString("label_var"), RsltR.$upri_var});
		}
		dispList.add(new String[] {RsltR.$fxd, getDispString("label_fxd"), RsltR.$fxd});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_fxd, getDispString("label_fxd"), RsltR.$upri_fxd});
		}
		dispList.add(new String[] {RsltR.$sls_cost, getDispString("label_sls_cost"), RsltR.$sls_cost});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_sls_cost, getDispString("label_sls_cost"), RsltR.$upri_sls_cost});
		}
		dispList.add(new String[] {RsltR.$sls_mng_cost, getDispString("label_sls_mng_cost"), RsltR.$sls_mng_cost});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_sls_mng_cost, getDispString("label_sls_mng_cost"), RsltR.$upri_sls_mng_cost});
		}
		dispList.add(new String[] {RsltR.$act_cost, getDispString("label_act_cost"), RsltR.$act_cost});
		if (_cndR.qty_flg()) {
			dispList.add(new String[] {RsltR.$upri_act_cost, getDispString("label_act_cost"), RsltR.$upri_act_cost});
		}
		return dispList;
	}

	protected void changeDispUpri() {
		if (isNull(getDispRsltL())) {
			return;
		}
		MCList<DispRsltR> newL = MCList.create(DispRsltR.class);
		for (DispRsltR r : getDispRsltL()) {
			if (getCndR().disp_upri() && isNotUpriRow(r)) {
				continue;
			}
			else if (!getCndR().disp_upri() && isUpriRow(r)) {
				continue;
			}

			newL.add(r);
		}
		getDispRsltL().setAll(newL);
	}

	protected void doDispCng() {
		if (isNull(_dispRsltL)) {
			return;
		}

		MCList<DispRsltR> dispRsltL = MCList.create(DispRsltR.class);
		HashMap<MCNumber, Boolean> keyIdxMap = new HashMap<MCNumber, Boolean>();

		// 画面に表示されているキー単位毎に、表示切り替え用のリストを作成する
		// getDispRsltL().groupBy(key_idx) の場合、key_idx でソートされて画面の表示順の通りならない
		for (DispRsltR dispRsltR : getDispRsltL()) {
			if (keyIdxMap.containsKey(dispRsltR.key_idx())
					&& keyIdxMap.get(dispRsltR.key_idx())) {
				continue;
			}

			dispRsltL.addAll(_dispRsltL.subList(_dispRsltIdx, dispRsltR.key_idx()));

			keyIdxMap.put(dispRsltR.key_idx(), true);
		}

		if (getCndR().disp_limit_profit() && getCndR().disp_sls_cost()) {
			getDispRsltL().setAll(dispRsltL);
			changeDispUpri();
			DispRsltTable.selectLeftmostColumn(0);

			return;
		}

		MCList<DispRsltR> newL = MCList.create(DispRsltR.class);

		for (DispRsltR r : dispRsltL) {
			if (!getCndR().disp_limit_profit() && (
					isLimitProfitRow(r)
						|| isLimitProfitRateRow(r)
						|| isVarRow(r)
						|| isFxdRow(r)
						|| isUpriLimitProfitRow(r)
						|| isUpriVarRow(r)
						|| isUpriFxdRow(r))) {
				continue;
			}

			if (!getCndR().disp_sls_cost() && (
					isSlsProfitRow(r)
					|| isSlsCostRow(r)
					|| isSlsMngCostRow(r)
					|| isUpriSlsProfitRow(r)
					|| isSlsProfitRateRow(r)
					|| isUpriSlsCostRow(r)
					|| isUpriSlsMngCostRow(r))) {
				continue;
			}

			newL.add(r);
		}

		getDispRsltL().setAll(newL);
		changeDispUpri();
		DispRsltTable.selectLeftmostColumn(0);
	}

	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト  */
	protected ArrayList<MCColumnConfig> getRevFgCtrlColumnConfigs() {
		if (_revFgCtrlColumnConfigs == null) {
			_revFgCtrlColumnConfigs = getGroupColumnConfigs(DispRsltTable,
					DispRsltR.$$CLEAR);
		}

		return _revFgCtrlColumnConfigs;
	}

	// ///////////////////// INIT /////////////////////////////////////////////

	@Override
	protected void tableInit() {
		super.tableInit();

		// 色の設定
		setColorInfo();
	}

	/**
	 * テーブルの静的な配色を設定する
	 */
	protected void setColorInfo() {
		MAUDP_CellConfig cc = (MAUDP_CellConfig) DispRsltTable.getCellConfig();

		cc.putColumnBG(DispRsltTable.getAllColumnConfigs(), _tblColor);
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

		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);

		displayColumn();
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
					_dtl_col_num++;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
			// 値が0でも表示をnullにしない
			_vh.setDispNull(false);
		}

		// DtlRでグループ化された項目情報を設定
		_vh.initColGroup(DispRsltTable, getRsltL());
		// カラム情報作成
		_vh.initColInfo(_DTL_COL_SCALE, 0, null, 0, _dtl_col_num);
	}

	// ///////////////////// NotificationChange イベント///////////////////////////
	@Override
	public void doCnd_disp_upri_NC(MCEventInfo info) {
		super.doCnd_disp_upri_NC(info);

		doDispCng();
		DispRsltTable.adjustWidth();
	}

	@Override
	public void doCnd_disp_limit_profit_NC(MCEventInfo info) {
		super.doCnd_disp_limit_profit_NC(info);

		doDispCng();
		DispRsltTable.adjustWidth();
	}

	@Override
	public void doCnd_disp_sls_cost_NC(MCEventInfo info) {
		super.doCnd_disp_sls_cost_NC(info);

		doDispCng();
		DispRsltTable.adjustWidth();
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);

		// 品目区分をオフとしたら品目区分詳細もオフとする
		if (!getCndR().itm_typ_flg()) {
			Cnd_itm_typ_d_flg.setValue(false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);

		// 品目区分詳細をオンにしたら品目区分もオンとする
		if (getCndR().itm_typ_d_flg()) {
			Cnd_itm_typ_flg.setValue(true);
		}
	}

	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);

		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}

	@Override
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_cd_LC(info);

		if (!isNull(getCndR().ac_rsn_cd())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_nm_LC(info);

		if (!isNull(getCndR().ac_rsn_nm())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_no_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_stk_bp_flg_NC(info);

		if (getCndR().no_stk_bp_flg()) {
			setValueEx(Cnd_stk_bp_cd, null);
			setValueEx(Cnd_stk_bp_nm, null);
		}
	}

	@Override
	public void doCnd_stk_bp_cd_LC(MCEventInfo info) {
		super.doCnd_stk_bp_cd_LC(info);

		if (!isNull(getCndR().stk_bp_cd())) {
			setValueEx(Cnd_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd_stk_bp_nm_LC(MCEventInfo info) {
		super.doCnd_stk_bp_nm_LC(info);

		if (!isNull(getCndR().stk_bp_nm())) {
			setValueEx(Cnd_no_stk_bp_flg, false);
		}
	}

	// ///////////////////// DoubleClicked イベント ///////////////////////////////

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		int idx = info.getEventIndex();

		if (compo == DispRsltTable && idx > -1) {
			MCColumnConfig column = info.getClickColumn();

			if (_vh.isVariableColumn(column)) {
				doDispRslt_disp_DC(getDispRsltL().get(idx), column);
			}
		}
	}

	/**
	 * [DispRslt]テーブルの月別原価の項目のＤＣイベントで実行される。
	 */
	protected void doDispRslt_disp_DC(DispRsltR r, MCColumnConfig column) {
		MCDate ym = _ymMap.get(column);
		String calcGrp = getCalcGrp(r);
		if (isNullOr(ym, calcGrp)) {
			return;
		}
		openMGBFP0050(r, column);
	}

	//売上原価一覧照会
	protected void openMGBFP0050(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBFP0050ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	protected MAUCP_AppScreenOpener getMGBFP0050ScrnOpnr(DispRsltR r,
			MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBFP0050");
		mcframe.clientMGBF.MGBFP0050.CndR cnd = mcframe.clientMGBF.MGBFP0050.CndR.create();

		cnd.wg_cd(r.wg_cd());
		cnd.mng_dpt_cd(r.mng_dpt_cd());
		cnd.itm_jnl_cd(r.itm_jnl_cd());
		cnd.itm_typ(r.itm_typ());
		cnd.itm_typ_d_cd(r.itm_typ_d_cd());
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.itm_nm(r.itm_nm());
		cnd.itm_grp_cd1(r.itm_grp_cd1());
		cnd.itm_grp_cd2(r.itm_grp_cd2());
		cnd.itm_grp_cd3(r.itm_grp_cd3());
		cnd.itm_grp_cd4(r.itm_grp_cd4());
		cnd.itm_grp_cd5(r.itm_grp_cd5());
		cnd.itm_grp_cd6(r.itm_grp_cd6());
		cnd.itm_grp_cd7(r.itm_grp_cd7());
		cnd.itm_grp_cd8(r.itm_grp_cd8());
		cnd.itm_grp_cd9(r.itm_grp_cd9());
		cnd.itm_grp_cd10(r.itm_grp_cd10());
		cnd.lot_no(r.lot_no());
		cnd.sublot_no(r.sublot_no());
		cnd.sno1(r.sno1());
		cnd.sno2(r.sno2());
		cnd.sno3(r.sno3());
		cnd.sno4(r.sno4());
		cnd.alc_dpt_cd(r.alc_dpt_cd());
		cnd.ac_slip_typ(r.ac_slip_typ());
		cnd.ac_rsn_cd(r.ac_rsn_cd());
		cnd.cst_cd(r.cst_cd());
		cnd.sls_dpt_cd(r.sls_dpt_cd());
		cnd.sls_usr_cd(r.sls_usr_cd());
		cnd.stk_bp_cd(r.stk_bp_cd());
		cnd.cst_cd(r.cst_cd());
		cnd.cost_sls_cd1(r.cost_sls_cd1());
		cnd.cost_sls_cd2(r.cost_sls_cd2());
		cnd.cost_sls_cd3(r.cost_sls_cd3());
		cnd.cost_sls_cd4(r.cost_sls_cd4());
		cnd.cost_sls_cd5(r.cost_sls_cd5());
		cnd.cst_cntry_cd(r.cst_cntry_cd());
		cnd.cst_area_cd(r.cst_area_cd());
		cnd.asst_typ(r.asst_typ());

		String calcGrp = getCalcGrp(r);
		MCDate ym = _ymMap.get(column);
		String calcNo = MGUCP_CostUtil.getCalcNoByYm(calcGrp, ym, this);

		cnd.calc_grp_cd(calcGrp);
		if (!isNull(calcNo)) {
			cnd.calc_no(calcNo);
			cnd.ym(ym);
			so.putSearchAction();
		}
		so.putCnd(cnd);
		so.runValueInit();//集計タブの初期条件は遷移先に委譲
		so.putSearchAction();

		return so;
	}

	protected String getCalcGrp(DispRsltR r) {
		String calcGrp = r.getStringNE(DispRsltR.$calc_grp_cd);
		if (isNull(calcGrp)) {
			String[] calcGrps = arrayValueSplit(_cndR.calc_grp_cd());
			// 複数指定されている場合
			if (calcGrps.length > 1) {
				return null;
			}
			// 検索条件に単独指定され、かつ集計がオフの場合
			calcGrp = calcGrps[0];
		}
		return calcGrp;
	}

	// ///////////////////// POPUP ////////////////////////////////////////////

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl,
			String type) {
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
			// ソート順
			if (isSame(SORT_ORDER_PANEL, type)) {
				confSet.add(columnDispRslt_elm_no);
			}
		}

		super.customVisibleColumnConfigs(table, type, confSet);
	}

	// ///////////////////// Status ///////////////////////////////////////////
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		//表示しない（集計タブでオフ）列を非表示にする
		displayColumn();

		//可変カラムをすべてINVISIBLEにする
		_vh.clearElmColsLabel();
		_vh.setInvisibleColumnAll();

		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		//表示しない（集計タブでオフ）列を非表示にする
		displayColumn();

		//可変カラムの未使用部分をINVISIBLEにする
		_vh.setReadOnlyStatus();

		DispRsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	/** 集計タブにより表示されない項目を非表示にする */
	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), DispRsltR.$$SHOW);
	}

	// ///////////////////// CellConfig ///////////////////////////////////////

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltTableCellConfig());
	}

	protected DispRsltTableCellConfig createDispRsltTableCellConfig() {
		return new DispRsltTableCellConfig();
	}

	protected class DispRsltTableCellConfig extends MGUDP_CellConfig {
		@Override
		public String getPriorViewScaleType(int index, MCColumnConfig column, MCTable<?> table) {
			DispRsltR row = getDispRsltL().get(index);
			if (isQtyRow(row)) {
				// 数量は表示桁機能を使用しない
				return null;
			}
			else if (isUpriRow(row)) {
				return IfViewScale.UNIT;
			}
			else if (isRateRow(row)) {
				return IfViewScale.RATE;
			}
			else {
				return IfViewScale.AMT;
			}
		}

		@Override
		public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {
			String type = getPriorViewScaleType(index, column, table);
			if (isNull(type) && !isNull(getDispRsltL().get(index).dec_place())) {
				// 数量の小数部有効桁数を返す
				return getDispRsltL().get(index).dec_place().intValue();
			}
			return super.getPriorViewScale(index, column, table);
		}

		// 一覧の各キー先頭行色の設定
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (isTopRow(row)) {
				return _topColor;
			}
			else if (isProfitRow(row)
					&& (_vh.getVariableColumn().contains(column)
							|| column == columnDispRslt_elm_nm
							|| column == columnDispRslt_ttl)) {
				return _profit;
			}
			else if (isCostRow(row)
					&& (_vh.getVariableColumn().contains(column)
							|| column == columnDispRslt_elm_nm
							|| column == columnDispRslt_ttl)) {
				return _slsCost;
			}
			else if (isTtlRow(row)
					&& (_vh.getVariableColumn().contains(column)
							|| column == columnDispRslt_elm_nm
							|| column == columnDispRslt_ttl)) {
				return _ttl;
			}
			else {
				return _tblColor;
			}
		}

		// 一覧の文字色設定
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (!getCndR().disp_key()
					&& !isTopRow(row)
					&& getRevFgCtrlColumnConfigs().contains(column)) {
				return true;
			}
			return null;
		}

		@Override
		protected boolean isPercentColumn(int index, MCColumnConfig column, MCTable table) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			return isRateRow(row);
		}

		protected boolean isRateRow(DispRsltR r) {
			return isProfitRateRow(r)
					|| isSlsProfitRateRow(r)
					|| isLimitProfitRateRow(r);
		}

		protected boolean isTopRow(DispRsltR r) {
			return _cndR.qty_flg() && isQtyRow(r)
				|| (!_cndR.qty_flg() &&
						(isAmtRow(r) || isUpriAmtRow(r)));
		}

		protected boolean isProfitRow(DispRsltR r) {
			return isLimitProfitRow(r)
					|| isLimitProfitRateRow(r)
					|| isVarRow(r)
					|| isFxdRow(r)
					|| isUpriLimitProfitRow(r)
					|| isUpriVarRow(r)
					|| isUpriFxdRow(r);
		}

		protected boolean isCostRow(DispRsltR r) {
			return isSlsCostRow(r)
					|| isSlsMngCostRow(r)
					|| isUpriSlsCostRow(r)
					|| isUpriSlsMngCostRow(r);
		}

		protected boolean isTtlRow(DispRsltR r) {
			return isActCostRow(r) || isUpriActCostRow(r);
		}
	}

	/** 金額表示する行であるかを返す */
	protected boolean isNotUpriRow(DispRsltR r) {
		return r != null
				&& (isSame(r.elm(), RsltR.$sls_cost)
					|| isSame(r.elm(), RsltR.$sls_mng_cost)
					|| isSame(r.elm(), RsltR.$act_cost)
					|| isSame(r.elm(), RsltR.$amt)
					|| isSame(r.elm(), RsltR.$profit)
					|| isSame(r.elm(), RsltR.$sls_profit)
					|| isSame(r.elm(), RsltR.$limit_profit)
					|| isSame(r.elm(), RsltR.$var)
					|| isSame(r.elm(), RsltR.$fxd));
	}

	/** 単価表示する行であるかを返す */
	protected boolean isUpriRow(DispRsltR r) {
		return r != null
				&& (isSame(r.elm(), RsltR.$upri_sls_cost)
					|| isSame(r.elm(), RsltR.$upri_sls_mng_cost)
					|| isSame(r.elm(), RsltR.$upri_act_cost)
					|| isSame(r.elm(), RsltR.$upri_amt)
					|| isSame(r.elm(), RsltR.$upri_profit)
					|| isSame(r.elm(), RsltR.$upri_sls_profit)
					|| isSame(r.elm(), RsltR.$upri_limit_profit)
					|| isSame(r.elm(), RsltR.$upri_var)
					|| isSame(r.elm(), RsltR.$upri_fxd));
	}

	/** 数量行であるかを返す */
	protected boolean isQtyRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$qty);
	}

	/** 売上金額行であるかを返す */
	protected boolean isAmtRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$amt);
	}

	/** 売上金額行（単価）であるかを返す */
	protected boolean isUpriAmtRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_amt);
	}

	/** 利益行であるかを返す */
	protected boolean isProfitRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$profit);
	}

	/** 利益行（単価）であるかを返す */
	protected boolean isUpriProfitRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_profit);
	}

	/** 売上利益行であるかを返す */
	protected boolean isSlsProfitRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$sls_profit);
	}

	/** 売上利益行（単価）であるかを返す */
	protected boolean isUpriSlsProfitRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_sls_profit);
	}

	/** 利益率行であるかを返す */
	protected boolean isProfitRateRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$profit_rate);
	}

	/** 売上利益率行であるかを返す */
	protected boolean isSlsProfitRateRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$sls_profit_rate);
	}

	/** 限界利益行であるかを返す */
	protected boolean isLimitProfitRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$limit_profit);
	}

	/** 限界利益行（単価）であるかを返す */
	protected boolean isUpriLimitProfitRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_limit_profit);
	}

	/** 限界利益率行であるかを返す */
	protected boolean isLimitProfitRateRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$limit_profit_rate);
	}

	/** 変動費行であるかを返す */
	protected boolean isVarRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$var);
	}

	/** 変動費行（単価）であるかを返す */
	protected boolean isUpriVarRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_var);
	}

	/** 固定費行であるかを返す */
	protected boolean isFxdRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$fxd);
	}

	/** 固定費行（単価）であるかを返す */
	protected boolean isUpriFxdRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_fxd);
	}

	/** 売上原価行であるかを返す */
	protected boolean isSlsCostRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$sls_cost);
	}

	/** 売上原価行（単価）であるかを返す */
	protected boolean isUpriSlsCostRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_sls_cost);
	}

	/** 販管費行であるかを返す */
	protected boolean isSlsMngCostRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$sls_mng_cost);
	}

	/** 販管費行（単価）であるかを返す */
	protected boolean isUpriSlsMngCostRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_sls_mng_cost);
	}

	/** 総原価行であるかを返す */
	protected boolean isActCostRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$act_cost);
	}

	/** 総原価行（単価）であるかを返す */
	protected boolean isUpriActCostRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$upri_act_cost);
	}

}